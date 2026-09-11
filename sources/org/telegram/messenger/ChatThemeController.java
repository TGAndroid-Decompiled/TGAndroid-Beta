package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.go;
public class ChatThemeController extends BaseController {
    public static final int THEME_LIST_WITH_DEFAULT = 1;
    public static final int THEME_LIST_WITH_EMOJI = 2;
    public static final int THEME_LIST_WITH_GIFTS = 4;
    public static volatile DispatchQueue chatThemeQueue = new DispatchQueue("chatThemeQueue");
    private static final ChatThemeController[] instances = new ChatThemeController[4];
    private final Map<String, org.telegram.ui.ActionBar.d4> allChatGiftThemes;
    private List<org.telegram.ui.ActionBar.d4> allChatThemes;
    private final LongSparseArray<gg.b> dialogEmoticonsMap;
    private final ThemeList giftsThemeList;
    private volatile long lastReloadTimeMs;
    private final long reloadTimeoutMs;
    private final HashMap<Long, Bitmap> themeIdWallpaperThumbMap;
    private volatile long themesHash;
    private final Map<String, Long> usedGiftThemesBySlug;
    private final Map<Long, String> usedGiftThemesByUsers;

    public static class ThemeList {
        private boolean completed;
        private long hash;
        private long lastReloadTimeMs;
        private String offset;
        private List<org.telegram.ui.ActionBar.d4> themes;

        private ThemeList() {
        }
    }

    private ChatThemeController(int i10) {
        super(i10);
        this.reloadTimeoutMs = 7200000L;
        this.themeIdWallpaperThumbMap = new HashMap<>();
        this.allChatGiftThemes = new HashMap();
        this.giftsThemeList = new ThemeList();
        this.dialogEmoticonsMap = new LongSparseArray<>();
        this.usedGiftThemesByUsers = new HashMap();
        this.usedGiftThemesBySlug = new HashMap();
        init();
    }

    public static void c(ChatThemeController chatThemeController, Pair pair) {
        chatThemeController.lambda$preloadAllWallpaperThumbs$5(pair);
    }

    public static void e(File file, List list, Bitmap bitmap) {
        lambda$saveWallpaperPatternBitmap$12(file, list, bitmap);
    }

    public static boolean equals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if (wallPaper != null && wallPaper2 != null) {
            String str = wallPaper.uploadingImage;
            if (str != null) {
                return TextUtils.equals(wallPaper2.uploadingImage, str);
            }
            if (wallPaper.f20021id == wallPaper2.f20021id && TextUtils.equals(go.e(wallPaper.settings), go.e(wallPaper2.settings)) && TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2))) {
                return true;
            }
        }
        return false;
    }

    public static void f(File file, Bitmap bitmap) {
        lambda$saveWallpaperBitmap$8(file, bitmap);
    }

    private List<org.telegram.ui.ActionBar.d4> getAllChatThemesFromPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.d4(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return arrayList;
    }

    private SharedPreferences getEmojiSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_emoji", 0);
    }

    public static ChatThemeController getInstance(int i10) {
        ChatThemeController chatThemeController;
        ChatThemeController[] chatThemeControllerArr = instances;
        ChatThemeController chatThemeController2 = chatThemeControllerArr[i10];
        if (chatThemeController2 == null) {
            synchronized (ChatThemeController.class) {
                try {
                    chatThemeController = chatThemeControllerArr[i10];
                    if (chatThemeController == null) {
                        chatThemeController = new ChatThemeController(i10);
                        chatThemeControllerArr[i10] = chatThemeController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return chatThemeController;
        }
        return chatThemeController2;
    }

    private File getPatternFile(long j3) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        Locale locale = Locale.US;
        long j10 = this.themesHash;
        return new File(filesDirFixed, j3 + "_" + j10 + ".jpg");
    }

    private SharedPreferences getSharedPreferences() {
        Context context = ApplicationLoader.applicationContext;
        return context.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    private void getWallpaperBitmap(long j3, ResultCallback<Bitmap> resultCallback) {
        if (this.themesHash == 0) {
            resultCallback.onComplete(null);
            return;
        }
        chatThemeQueue.postRunnable(new d3(14, getPatternFile(j3), resultCallback));
    }

    public static String getWallpaperEmoticon(TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && !TextUtils.isEmpty(wallPaperSettings.emoticon)) {
                return wallPaper.settings.emoticon;
            }
            return "";
        }
        return null;
    }

    public static void h(Utilities.Callback callback, Bitmap bitmap) {
        lambda$loadWallpaperBitmap$9(callback, bitmap);
    }

    private void init() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        try {
            this.themesHash = sharedPreferences.getLong("hash", 0L);
            this.lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.allChatThemes = getAllChatThemesFromPrefs();
        getMessagesStorage().loadGiftChatTheme(new z0(this, 0));
        preloadSticker("❌");
        if (!this.allChatThemes.isEmpty()) {
            for (org.telegram.ui.ActionBar.d4 d4Var : this.allChatThemes) {
                preloadSticker(d4Var.f20364e);
            }
        }
    }

    public static boolean isNotEmoticonWallpaper(TLRPC.WallPaper wallPaper) {
        String wallpaperEmoticon = getWallpaperEmoticon(wallPaper);
        if (wallpaperEmoticon != null && wallpaperEmoticon.length() == 0) {
            return true;
        }
        return false;
    }

    public static void k(ChatThemeController chatThemeController, ResultCallback resultCallback) {
        chatThemeController.lambda$requestNextChatThemes$20(resultCallback);
    }

    public static void lambda$getWallpaperBitmap$7(File file, ResultCallback resultCallback) {
        Bitmap bitmap = null;
        try {
            if (file.exists()) {
                bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (resultCallback != null) {
            AndroidUtilities.runOnUIThread(new d3(15, resultCallback, bitmap));
        }
    }

    public void lambda$init$0(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it.next();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.d4(this.currentAccount, tL_chatThemeUniqueGift));
            }
        }
    }

    public static void lambda$loadWallpaperBitmap$9(Utilities.Callback callback, Bitmap bitmap) {
        if (bitmap != null) {
            callback.run(new dg.a(bitmap, 0, null));
        } else {
            callback.run(null);
        }
    }

    public static void lambda$loadWallpaperPatternBitmap$11(java.io.File r13, org.telegram.messenger.Utilities.Callback r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.lambda$loadWallpaperPatternBitmap$11(java.io.File, org.telegram.messenger.Utilities$Callback):void");
    }

    public void lambda$preloadAllWallpaperThumbs$5(Pair pair) {
        if (pair != null) {
            this.themeIdWallpaperThumbMap.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    public void lambda$processUpdate$13(long j3, TLRPC.UserFull userFull) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
    }

    public void lambda$processUpdate$14(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, chatFull, 0, bool, bool);
    }

    public void lambda$requestAllChatThemes$2(List list, ResultCallback resultCallback, boolean z10) {
        this.allChatThemes = new ArrayList(list);
        resultCallback.onComplete(getEmojiThemes((z10 ? 1 : 0) | 2));
    }

    public void lambda$requestAllChatThemes$3(org.telegram.tgnet.ResultCallback r10, boolean r11, org.telegram.tgnet.tl.TL_account.Themes r12, org.telegram.tgnet.TLRPC.TL_error r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.lambda$requestAllChatThemes$3(org.telegram.tgnet.ResultCallback, boolean, org.telegram.tgnet.tl.TL_account$Themes, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$requestNextChatThemes$19(TL_account.Tl_chatThemes tl_chatThemes, List list, List list2, ResultCallback resultCallback) {
        this.giftsThemeList.offset = tl_chatThemes.next_offset;
        this.giftsThemeList.hash = tl_chatThemes.hash;
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        if (this.giftsThemeList.themes == null) {
            this.giftsThemeList.themes = new ArrayList(list);
        } else {
            this.giftsThemeList.themes.addAll(list);
        }
        if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
            this.giftsThemeList.completed = true;
        }
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) it.next();
            Map<String, org.telegram.ui.ActionBar.d4> map = this.allChatGiftThemes;
            gg.b bVar = d4Var.f20363c;
            if (bVar != null && (str = bVar.f10645b) == null) {
                str = bVar.f10644a;
            }
            map.put(str, d4Var);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it2.next();
            setGiftThemeUser(tL_chatThemeUniqueGift.gift.slug, DialogObject.getPeerDialogId(tL_chatThemeUniqueGift.gift.theme_peer));
        }
        resultCallback.onComplete(null);
    }

    public void lambda$requestNextChatThemes$20(ResultCallback resultCallback) {
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        this.giftsThemeList.completed = true;
        resultCallback.onComplete(null);
    }

    public void lambda$requestNextChatThemes$21(ResultCallback resultCallback, TL_account.ChatThemes chatThemes, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new y0(resultCallback, tL_error, 1));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (chatThemes instanceof TL_account.Tl_chatThemes) {
            TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
            getMessagesStorage().putGiftChatThemes(tl_chatThemes.themes);
            getMessagesStorage().putUsersAndChats(tl_chatThemes.users, tl_chatThemes.chats, true, true);
            getMessagesController().putUsers(tl_chatThemes.users, false);
            getMessagesController().putChats(tl_chatThemes.chats, false);
            ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.ChatTheme chatTheme = arrayList2.get(i10);
                i10++;
                TLRPC.ChatTheme chatTheme2 = chatTheme;
                if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                    arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i11));
                d4Var.p(0, null);
                d4Var.p(1, null);
                d4Var.o(0, null);
                d4Var.o(1, null);
                arrayList3.add(d4Var);
            }
            AndroidUtilities.runOnUIThread(new a5(this, tl_chatThemes, arrayList3, arrayList, resultCallback, 3));
        } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
            AndroidUtilities.runOnUIThread(new d3(19, this, resultCallback));
        }
    }

    public static void lambda$saveWallpaperBitmap$8(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void lambda$saveWallpaperPatternBitmap$12(File file, List list, Bitmap bitmap) {
        List list2;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
            if (list != null && !list.isEmpty()) {
                SerializedData serializedData = new SerializedData(list.size() * 52);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dg.c cVar = (dg.c) it.next();
                    RectF rectF = cVar.f6811a;
                    serializedData.writeFloat(rectF.left);
                    serializedData.writeFloat(rectF.top);
                    serializedData.writeFloat(rectF.width());
                    serializedData.writeFloat(rectF.height());
                    float[] fArr = new float[9];
                    cVar.f6812b.getValues(fArr);
                    for (int i10 = 0; i10 < 9; i10++) {
                        serializedData.writeFloat(fArr[i10]);
                    }
                }
                list2 = Collections.singletonList("patterns = " + Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } else {
                list2 = null;
            }
            if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                v7.b7.e(bitmap, gZIPOutputStream, list2);
            } else {
                Bitmap extractAlpha = bitmap.extractAlpha();
                v7.b7.e(extractAlpha, gZIPOutputStream, list2);
                extractAlpha.recycle();
            }
            gZIPOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void lambda$setDialogTheme$4(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$setWallpaperToPeer$16(TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            TLRPC.WallPaper wallPaper = null;
            if (j3 >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j3);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j3);
                userFull = null;
            }
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= updates.updates.size()) {
                    break;
                }
                if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        if (z10) {
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str;
                            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                                tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                            }
                            if (userFull != null) {
                                TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                userFull.wallpaper = wallPaper2;
                                userFull.flags |= 16777216;
                                saveChatWallpaper(j3, wallPaper2);
                                getMessagesStorage().updateUserInfo(userFull, false);
                                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
                            } else if (chatFull != null) {
                                TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                chatFull.wallpaper = wallPaper3;
                                chatFull.flags2 |= 128;
                                saveChatWallpaper(j3, wallPaper3);
                                getMessagesStorage().updateChatInfo(chatFull, false);
                                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                int i11 = NotificationCenter.chatInfoDidLoad;
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, chatFull, 0, bool, bool);
                            }
                        }
                    }
                }
                i10++;
            }
            MessagesController.getInstance(this.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
            if (runnable != null) {
                runnable.run();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpaperSettedToUser, new Object[0]);
        }
    }

    public void lambda$setWallpaperToPeer$17(long j3, boolean z10, String str, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jd(this, tLObject, j3, z10, str, runnable));
    }

    private void loadWallpaperPatternBitmap(long j3, Utilities.Callback<dg.a> callback) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new d3(17, new File(filesDirFixed, org.telegram.ui.Cells.p6.h(j3, "pattern_", ".pgm.gz")), callback));
    }

    public static void m(File file, Utilities.Callback callback) {
        lambda$loadWallpaperPatternBitmap$11(file, callback);
    }

    public static void o(File file, ResultCallback resultCallback) {
        lambda$getWallpaperBitmap$7(file, resultCallback);
    }

    private void preloadSticker(String str) {
        new ImageReceiver().setImage(ImageLocation.getForDocument(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str)), "50_50", null, null, null, 0);
        Emoji.preloadEmoji(str);
    }

    private void requestNextChatThemes(ResultCallback<Void> resultCallback) {
        boolean z10;
        if (this.giftsThemeList.hash != 0) {
            long unused = this.giftsThemeList.lastReloadTimeMs;
        }
        if (System.currentTimeMillis() - this.giftsThemeList.lastReloadTimeMs > 7200000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.giftsThemeList.themes != null && this.giftsThemeList.completed && !z10) {
            return;
        }
        TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
        tl_getUniqueGiftChatThemes.offset = this.giftsThemeList.offset;
        tl_getUniqueGiftChatThemes.hash = this.giftsThemeList.hash;
        tl_getUniqueGiftChatThemes.limit = 50;
        ConnectionsManager connectionsManager = getConnectionsManager();
        DispatchQueue dispatchQueue = chatThemeQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new b1(dispatchQueue), new c1(0, this, resultCallback));
    }

    public static void s(ResultCallback resultCallback, Bitmap bitmap) {
        resultCallback.onComplete(bitmap);
    }

    private void saveWallpaperBitmap(Bitmap bitmap, long j3) {
        chatThemeQueue.postRunnable(new d3(20, getPatternFile(j3), bitmap));
    }

    private void saveWallpaperPatternBitmap(Bitmap bitmap, List<dg.c> list, long j3) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new f0(new File(filesDirFixed, org.telegram.ui.Cells.p6.h(j3, "pattern_", ".pgm.gz")), list, bitmap, 12));
    }

    private void setGiftThemeUser(String str, long j3) {
        if (TextUtils.isEmpty(str)) {
            String remove = this.usedGiftThemesByUsers.remove(Long.valueOf(j3));
            if (remove != null) {
                this.usedGiftThemesBySlug.remove(remove);
            }
        } else if (j3 == 0) {
            Long remove2 = this.usedGiftThemesBySlug.remove(str);
            if (remove2 != null) {
                this.usedGiftThemesByUsers.remove(remove2);
            }
        } else {
            String put = this.usedGiftThemesByUsers.put(Long.valueOf(j3), str);
            Long put2 = this.usedGiftThemesBySlug.put(str, Long.valueOf(j3));
            if (put != null && !TextUtils.equals(str, put)) {
                this.usedGiftThemesBySlug.remove(put);
            }
            if (put2 != null && put2.longValue() != j3) {
                this.usedGiftThemesByUsers.remove(put2);
            }
        }
    }

    public static void t(Utilities.Callback callback, dg.a aVar) {
        callback.run(aVar);
    }

    public static void u(ChatThemeController chatThemeController, TLRPC.ChatFull chatFull) {
        chatThemeController.lambda$processUpdate$14(chatFull);
    }

    public static boolean wallpaperEquals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.f20021id == wallPaper2.f20021id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
            }
            if (wallPaper.f20021id == wallPaper2.f20021id) {
                return true;
            }
        }
        return false;
    }

    public void clearCache() {
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        getSharedPreferences().edit().clear().apply();
    }

    public void clearWallpaper(long j3, boolean z10) {
        clearWallpaper(j3, z10, false);
    }

    public void clearWallpaperThumbImages() {
        this.themeIdWallpaperThumbMap.clear();
    }

    public org.telegram.ui.ActionBar.d4 getDialogTheme(long j3) {
        gg.b bVar;
        gg.b bVar2 = this.dialogEmoticonsMap.get(j3);
        if (bVar2 == null) {
            String string = getEmojiSharedPreferences().getString("chatTheme_" + this.currentAccount + "_" + j3, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new gg.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new gg.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new gg.b(string, null);
                }
                bVar2 = bVar;
                this.dialogEmoticonsMap.put(j3, bVar2);
            }
            bVar2 = null;
            this.dialogEmoticonsMap.put(j3, bVar2);
        }
        return getTheme(bVar2);
    }

    public TLRPC.WallPaper getDialogWallpaper(long j3) {
        if (j3 >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j3);
            if (userFull != null) {
                return userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull != null) {
                return chatFull.wallpaper;
            }
        }
        SharedPreferences emojiSharedPreferences = getEmojiSharedPreferences();
        String string = emojiSharedPreferences.getString("chatWallpaper_" + this.currentAccount + "_" + j3, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }

    public List<org.telegram.ui.ActionBar.d4> getEmojiThemes(int i10) {
        List<org.telegram.ui.ActionBar.d4> list;
        boolean hasFlag = TLObject.hasFlag(i10, 1);
        boolean hasFlag2 = TLObject.hasFlag(i10, 2);
        boolean hasFlag3 = TLObject.hasFlag(i10, 4);
        ArrayList arrayList = new ArrayList();
        if (hasFlag3 && this.giftsThemeList.themes != null) {
            arrayList.addAll(this.giftsThemeList.themes);
        }
        if (hasFlag2 && (list = this.allChatThemes) != null) {
            arrayList.addAll(list);
        }
        int i11 = 0;
        if (hasFlag && (arrayList.isEmpty() || !((org.telegram.ui.ActionBar.d4) arrayList.get(0)).f20361a)) {
            org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this.currentAccount);
            d4Var.f20364e = "❌";
            d4Var.f20363c = gg.b.d("❌");
            d4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            d4Var.f20361a = true;
            org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4();
            c4Var.f20316a = org.telegram.ui.ActionBar.d4.e(true);
            d4Var.f20365f.add(c4Var);
            org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
            c4Var2.f20316a = org.telegram.ui.ActionBar.d4.e(false);
            d4Var.f20365f.add(c4Var2);
            arrayList.add(0, d4Var);
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.d4) obj).l();
        }
        return arrayList;
    }

    public long getGiftThemeUser(String str) {
        Long l4 = this.usedGiftThemesBySlug.get(str);
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    public org.telegram.ui.ActionBar.d4 getTheme(gg.b bVar) {
        if (bVar != null) {
            String str = bVar.f10645b;
            if (!TextUtils.isEmpty(str)) {
                return this.allChatGiftThemes.get(str);
            }
            for (org.telegram.ui.ActionBar.d4 d4Var : this.allChatThemes) {
                if (bVar.equals(d4Var.f20363c)) {
                    return d4Var;
                }
            }
            return null;
        }
        return null;
    }

    public Bitmap getWallpaperThumbBitmap(long j3) {
        return this.themeIdWallpaperThumbMap.get(Long.valueOf(j3));
    }

    public boolean isAllThemesFullyLoaded() {
        List<org.telegram.ui.ActionBar.d4> list;
        if (isGiftThemesFullyLoaded() && (list = this.allChatThemes) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isGiftThemesFullyLoaded() {
        return this.giftsThemeList.completed;
    }

    public void loadNextChatThemes(ResultCallback<Void> resultCallback) {
        requestNextChatThemes(resultCallback);
    }

    public void loadWallpaperBitmap(long j3, int i10, Utilities.Callback<dg.a> callback) {
        if (i10 == 0) {
            getWallpaperBitmap(j3, new c0(callback, 1));
        } else if (i10 == 1) {
            loadWallpaperPatternBitmap(j3, callback);
        }
    }

    public void preloadAllWallpaperImages(boolean z10) {
        for (org.telegram.ui.ActionBar.d4 d4Var : this.allChatThemes) {
            long i10 = d4Var.i(z10 ? 1 : 0);
            if (i10 != 0 && !getPatternFile(i10).exists()) {
                d4Var.o(z10 ? 1 : 0, null);
            }
        }
    }

    public void preloadAllWallpaperThumbs(boolean z10) {
        for (org.telegram.ui.ActionBar.d4 d4Var : this.allChatThemes) {
            long i10 = d4Var.i(z10 ? 1 : 0);
            if (i10 != 0 && !this.themeIdWallpaperThumbMap.containsKey(Long.valueOf(i10))) {
                d4Var.p(z10 ? 1 : 0, new c0(this, 2));
            }
        }
    }

    public void processUpdate(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(tL_updatePeerWallpaper.peer.user_id);
            if (userFull != null && !wallpaperEquals(userFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j3 = userFull.f20017id;
                if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                    userFull.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
                    userFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                    userFull.flags |= 16777216;
                } else {
                    userFull.wallpaper_overridden = false;
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                saveChatWallpaper(j3, userFull.wallpaper);
                AndroidUtilities.runOnUIThread(new a4(this, j3, userFull, 4));
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-DialogObject.getPeerDialogId(tL_updatePeerWallpaper.peer));
        if (chatFull != null && !wallpaperEquals(chatFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j10 = -chatFull.f19870id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                chatFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                chatFull.flags2 |= 128;
            } else {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
            }
            getMessagesStorage().updateChatInfo(chatFull, false);
            saveChatWallpaper(j10, chatFull.wallpaper);
            AndroidUtilities.runOnUIThread(new d3(16, this, chatFull));
        }
    }

    public void putThemeIfNeeded(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            if (!this.allChatGiftThemes.containsKey(tL_chatThemeUniqueGift.gift.slug)) {
                org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this.currentAccount, tL_chatThemeUniqueGift);
                d4Var.l();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, d4Var);
                getMessagesStorage().putGiftChatTheme(chatTheme);
            }
        }
    }

    public void requestAllChatThemes(final ResultCallback<List<org.telegram.ui.ActionBar.d4>> resultCallback, final boolean z10) {
        boolean z11;
        if (this.themesHash == 0 || this.lastReloadTimeMs == 0) {
            init();
        }
        if (System.currentTimeMillis() - this.lastReloadTimeMs > 7200000) {
            z11 = true;
        } else {
            z11 = false;
        }
        List<org.telegram.ui.ActionBar.d4> list = this.allChatThemes;
        if (list == null || list.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.themesHash;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(getchatthemes, new b1(dispatchQueue), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ChatThemeController.this.lambda$requestAllChatThemes$3(resultCallback, z10, (TL_account.Themes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        List<org.telegram.ui.ActionBar.d4> list2 = this.allChatThemes;
        if (list2 != null && !list2.isEmpty()) {
            resultCallback.onComplete(getEmojiThemes((z10 ? 1 : 0) | 2));
        }
    }

    public void requestChatTheme(final gg.b bVar, final ResultCallback<org.telegram.ui.ActionBar.d4> resultCallback) {
        if (bVar != null) {
            String str = bVar.f10645b;
            if (!bVar.b()) {
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.d4 d4Var = this.allChatGiftThemes.get(str);
                    if (d4Var != null) {
                        d4Var.l();
                        resultCallback.onComplete(d4Var);
                        return;
                    }
                    resultCallback.onComplete(null);
                    return;
                }
                requestAllChatThemes(new ResultCallback<List<org.telegram.ui.ActionBar.d4>>() {
                    {
                        ChatThemeController.this = this;
                    }

                    @Override
                    public final void onError(Throwable th2) {
                        org.telegram.tgnet.l.a(this, th2);
                    }

                    @Override
                    public void onComplete(List<org.telegram.ui.ActionBar.d4> list) {
                        for (org.telegram.ui.ActionBar.d4 d4Var2 : list) {
                            if (bVar.equals(d4Var2.f20363c)) {
                                d4Var2.l();
                                resultCallback.onComplete(d4Var2);
                                return;
                            }
                        }
                        resultCallback.onComplete(null);
                    }

                    @Override
                    public void onError(TLRPC.TL_error tL_error) {
                        resultCallback.onComplete(null);
                    }
                }, false);
                return;
            }
        }
        resultCallback.onComplete(null);
    }

    public void saveChatWallpaper(long j3, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            SharedPreferences.Editor edit = getEmojiSharedPreferences().edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j3, bytesToHex).apply();
            return;
        }
        SharedPreferences.Editor edit2 = getEmojiSharedPreferences().edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j3).apply();
    }

    public void setDialogTheme(long j3, TLRPC.ChatTheme chatTheme, boolean z10) {
        setDialogTheme(j3, gg.b.c(chatTheme), chatTheme, z10);
    }

    public int setWallpaperToPeer(long j3, String str, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject, Runnable runnable) {
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        }
        tL_messages_setChatWallPaper.for_both = b6Var.f20286o;
        if (messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f19986id = messageObject.getId();
            if (i10 >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j3);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j3);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageObject.messageOwner.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f20021id = wallPaper2.f20021id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (b6Var.f20282k * 100.0f);
            tL_wallPaperSettings.motion = b6Var.f20281j;
            tL_wallPaperSettings.blur = b6Var.f20280i;
            tL_wallPaperSettings.background_color = b6Var.d;
            tL_wallPaperSettings.second_background_color = b6Var.f20277e;
            tL_wallPaperSettings.third_background_color = b6Var.f20278f;
            tL_wallPaperSettings.fourth_background_color = b6Var.f20279g;
            tL_wallPaperSettings.rotation = b6Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            } else {
                wallPaper = null;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull2 = chatFull;
            tL_wallPaper2.f20021id = wallPaper3.f20021id;
            tL_wallPaper2.document = wallPaper3.document;
            int i11 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i11 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
            } else if (chatFull2 != null) {
                chatFull2.wallpaper = tL_wallPaper2;
                chatFull2.flags2 |= 128;
                getMessagesStorage().updateChatInfo(chatFull2, false);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i12 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, chatFull2, 0, bool, bool);
            }
            if (runnable != null) {
                runnable.run();
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = MessagesController.getInputWallpaper(b6Var);
            z10 = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = MessagesController.getWallpaperSetting(b6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new na(this, j3, z10, str, runnable));
    }

    public void clearWallpaper(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j3 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j3);
                if (userFull != null) {
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
                saveChatWallpaper(j3, null);
                if (z10) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
                }
            }
        } else {
            long j10 = -j3;
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10)));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
            if (chatFull != null) {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            saveChatWallpaper(j3, null);
            if (z10) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i10 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, chatFull, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new c5(1));
    }

    public void saveWallpaperBitmap(dg.a aVar, long j3) {
        Bitmap bitmap = aVar.f6808b;
        int i10 = aVar.f6807a;
        if (i10 == 0) {
            saveWallpaperBitmap(bitmap, j3);
        } else if (i10 == 1) {
            saveWallpaperPatternBitmap(bitmap, aVar.f6809c, j3);
        }
    }

    public void setDialogTheme(long j3, gg.b bVar) {
        setDialogTheme(j3, bVar, null, true);
    }

    private void setDialogTheme(long r6, gg.b r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.setDialogTheme(long, gg.b, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public void clearWallpaperImages() {
    }

    public static void lambda$clearWallpaper$15(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
