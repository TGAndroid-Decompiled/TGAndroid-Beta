package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class TelegramMediaSession {
    private static final String CONTENT_STYLE_BROWSABLE_HINT = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT";
    private static final int CONTENT_STYLE_GRID_ITEM_HINT_VALUE = 2;
    private static final int CONTENT_STYLE_LIST_ITEM_HINT_VALUE = 1;
    private static final String CONTENT_STYLE_PLAYABLE_HINT = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT";
    private static final String CONTENT_STYLE_SUPPORTED = "android.media.browse.CONTENT_STYLE_SUPPORTED";
    private static final String MEDIA_ID_CHAT_PREFIX = "__CHAT_";
    private static final String MEDIA_ID_ROOT = "__ROOT__";
    private static final String SESSION_TAG = "TelegramMediaSession";
    private static final String SLOT_RESERVATION_QUEUE = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE";
    private static final String SLOT_RESERVATION_SKIP_TO_NEXT = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
    private static final String SLOT_RESERVATION_SKIP_TO_PREV = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
    private static volatile TelegramMediaSession instance;
    private final Context appContext;
    private RectF bitmapRect;
    private boolean chatsLoaded;
    private int currentAccount;
    private long lastSelectedDialog;
    private boolean loadingChats;
    private Paint roundPaint;
    private final android.support.v4.media.session.b0 session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final a0.i users = new a0.i();
    private final a0.i chats = new a0.i();
    private final a0.i musicObjects = new a0.i();
    private final a0.i musicQueues = new a0.i();
    private final a0.i pendingMusicLoads = new a0.i();
    private final ArrayList<PendingBrowseRequest> pendingBrowseRequests = new ArrayList<>();

    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
    }

    public static final class PendingBrowseRequest {
        final BrowseChildrenCallback callback;
        final String parentMediaId;

        public PendingBrowseRequest(String str, BrowseChildrenCallback browseChildrenCallback) {
            this.parentMediaId = str;
            this.callback = browseChildrenCallback;
        }
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.b0 b0Var = new android.support.v4.media.session.b0(context, "TelegramMediaSession", null, null);
        this.session = b0Var;
        android.support.v4.media.session.v vVar = b0Var.f1830a;
        vVar.f1852a.setFlags(3);
        b0Var.d(new SessionCallback(), null);
        vVar.f1852a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        vVar.f1852a.setExtras(bundle);
        b0Var.c(true);
        ArrayList arrayList = new ArrayList();
        b0Var.f(new PlaybackStateCompat(0, 0L, 0L, 1.0f, getAvailableActions(), 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        updateRepeatMode();
        updateShuffleMode();
        NotificationCenter.getGlobalInstance().addObserver(new x1(this, 1), NotificationCenter.activeAccountChanged);
    }

    private void applyQueueFor(long j3) {
        String str;
        String str2;
        if (j3 != 0) {
            ArrayList arrayList = (ArrayList) this.musicObjects.f(j3);
            ArrayList arrayList2 = (ArrayList) this.musicQueues.f(j3);
            if (arrayList != null && !arrayList.isEmpty() && arrayList2 != null) {
                this.session.g(arrayList2);
                if (DialogObject.isUserDialog(j3)) {
                    TLRPC.User user = (TLRPC.User) this.users.f(j3);
                    android.support.v4.media.session.b0 b0Var = this.session;
                    if (user != null) {
                        str2 = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        str2 = "DELETED USER";
                    }
                    b0Var.f1830a.f1852a.setQueueTitle(str2);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.f(-j3);
                    android.support.v4.media.session.b0 b0Var2 = this.session;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "DELETED CHAT";
                    }
                    b0Var2.f1830a.f1852a.setQueueTitle(str);
                }
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                a4.m mVar = new a4.m(1);
                mVar.v0((long) (messageObject.getDuration() * 1000.0d));
                mVar.w0("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
                mVar.w0("android.media.metadata.TITLE", messageObject.getMusicTitle());
                this.session.e(new MediaMetadataCompat((Bundle) mVar.f275b));
            }
        }
    }

    private Bitmap createRoundBitmap(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.toString(), options);
            if (decodeFile != null) {
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                if (this.roundPaint == null) {
                    this.roundPaint = new Paint(1);
                    this.bitmapRect = new RectF();
                }
                this.roundPaint.setShader(bitmapShader);
                this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                return createBitmap;
            }
            return null;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    private long getDialogIdFromMediaId(String str) {
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                return Long.parseLong(str.substring(7));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0L;
    }

    public static TelegramMediaSession getInstance(Context context) {
        if (instance == null) {
            synchronized (TelegramMediaSession.class) {
                try {
                    if (instance == null) {
                        instance = new TelegramMediaSession(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public static void lambda$ensureLoaded$2(Runnable runnable, List list) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static int lambda$getMusicDialogsSortedByVisibleOrder$1(HashMap hashMap, Long l4, Long l10) {
        Integer num = (Integer) hashMap.get(l4);
        Integer num2 = (Integer) hashMap.get(l10);
        if (num == null && num2 == null) {
            return Long.compare(l4.longValue(), l10.longValue());
        }
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return Integer.compare(num.intValue(), num2.intValue());
    }

    public void lambda$loadBrowseChildren$3(BrowseChildrenCallback browseChildrenCallback, String str) {
        browseChildrenCallback.onResult(loadChildrenSync(str));
    }

    public void lambda$loadChats$4(int i10, ArrayList arrayList, a0.i iVar, a0.i iVar2) {
        if (i10 == this.currentAccount) {
            this.dialogs.clear();
            this.dialogs.addAll(arrayList);
            this.users.b();
            for (int i11 = 0; i11 < iVar.m(); i11++) {
                this.users.k((TLRPC.User) iVar.n(i11), iVar.j(i11));
            }
            this.chats.b();
            for (int i12 = 0; i12 < iVar2.m(); i12++) {
                this.chats.k((TLRPC.Chat) iVar2.n(i12), iVar2.j(i12));
            }
            this.chatsLoaded = true;
            this.loadingChats = false;
            if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
                this.lastSelectedDialog = this.dialogs.get(0).longValue();
            }
            ArrayList arrayList2 = new ArrayList(this.pendingBrowseRequests);
            this.pendingBrowseRequests.clear();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                PendingBrowseRequest pendingBrowseRequest = (PendingBrowseRequest) arrayList2.get(i13);
                loadBrowseChildren(pendingBrowseRequest.parentMediaId, pendingBrowseRequest.callback);
            }
        }
    }

    public void lambda$loadChats$5(MessagesStorage messagesStorage, int i10) {
        ArrayList arrayList = new ArrayList();
        a0.i iVar = new a0.i();
        a0.i iVar2 = new a0.i();
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            int i11 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(longValue)) {
                    arrayList.add(Long.valueOf(longValue));
                    if (DialogObject.isUserDialog(longValue)) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else {
                        arrayList3.add(Long.valueOf(-longValue));
                    }
                }
            }
            queryFinalized.dispose();
            if (!arrayList2.isEmpty()) {
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                messagesStorage.getUsersInternal(arrayList2, arrayList4);
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.User user = arrayList4.get(i12);
                    i12++;
                    TLRPC.User user2 = user;
                    iVar.k(user2, user2.f18468id);
                }
            }
            if (!arrayList3.isEmpty()) {
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList3), arrayList5);
                int size2 = arrayList5.size();
                while (i11 < size2) {
                    TLRPC.Chat chat = arrayList5.get(i11);
                    i11++;
                    TLRPC.Chat chat2 = chat;
                    iVar2.k(chat2, chat2.f18321id);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new ei.l3(this, i10, arrayList, iVar, iVar2, 12));
    }

    public void lambda$loadMusicForDialog$6(int i10, long j3, ArrayList arrayList, ArrayList arrayList2) {
        if (i10 == this.currentAccount) {
            this.musicObjects.k(arrayList, j3);
            this.musicQueues.k(arrayList2, j3);
            ArrayList arrayList3 = (ArrayList) this.pendingMusicLoads.f(j3);
            this.pendingMusicLoads.l(j3);
            if (j3 == this.lastSelectedDialog) {
                applyQueueFor(j3);
            }
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((Runnable) arrayList3.get(i11)).run();
                }
            }
        }
    }

    public void lambda$loadMusicForDialog$7(MessagesStorage messagesStorage, long j3, int i10) {
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(i10).clientUserId);
                    byteBufferValue.reuse();
                    if (MessageObject.isMusicMessage(TLdeserialize)) {
                        TLdeserialize.f18342id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j3;
                        i11 = i10;
                        try {
                            MessageObject messageObject = new MessageObject(i11, TLdeserialize, false, true);
                            arrayList.add(messageObject);
                            arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j3 + "_" + arrayList.size(), messageObject.getMusicTitle(), messageObject.getMusicAuthor(), null, null, null, null, null), arrayList2.size()));
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            AndroidUtilities.runOnUIThread(new ai.m8(this, i11, j3, arrayList, arrayList2, 7));
                        }
                    }
                }
            }
            i11 = i10;
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e7) {
            e = e7;
            i11 = i10;
        }
        AndroidUtilities.runOnUIThread(new ai.m8(this, i11, j3, arrayList, arrayList2, 7));
    }

    public void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.activeAccountChanged) {
            AndroidUtilities.runOnUIThread(new ug(this, 15));
        }
    }

    private void loadChats() {
        if (this.loadingChats) {
            return;
        }
        this.loadingChats = true;
        int i10 = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new q4(this, messagesStorage, i10, 22));
    }

    private java.util.List<android.media.browse.MediaBrowser.MediaItem> loadChildrenSync(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TelegramMediaSession.loadChildrenSync(java.lang.String):java.util.List");
    }

    public void loadMusicForDialog(long j3, Runnable runnable) {
        ArrayList arrayList = (ArrayList) this.pendingMusicLoads.f(j3);
        if (arrayList != null) {
            if (runnable != null) {
                arrayList.add(runnable);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (runnable != null) {
            arrayList2.add(runnable);
        }
        this.pendingMusicLoads.k(arrayList2, j3);
        int i10 = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new j7(this, messagesStorage, j3, i10, 10));
    }

    public void onAccountSwitched() {
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        this.chatsLoaded = false;
        this.loadingChats = false;
        this.dialogs.clear();
        this.users.b();
        this.chats.b();
        this.musicObjects.b();
        this.musicQueues.b();
        this.pendingMusicLoads.b();
        try {
            this.session.g(null);
            this.session.f1830a.f1852a.setQueueTitle(null);
        } catch (Throwable unused) {
        }
    }

    public static TelegramMediaSession peekInstance() {
        return instance;
    }

    public Bundle buildRootHints() {
        Bundle e = ok.e(2, "android.media.browse.CONTENT_STYLE_SUPPORTED", "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", true);
        e.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        return e;
    }

    public void ensureLoaded(Runnable runnable) {
        if (this.chatsLoaded) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        loadBrowseChildren("__ROOT__", new h4(runnable));
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        long j3 = 2477828;
        if (playingMessageObject == null) {
            return 2477828L;
        }
        if (!MediaController.getInstance().isMessagePaused()) {
            j3 = 2477830;
        }
        if (playingMessageObject.isMusic()) {
            return j3 | 48;
        }
        return j3;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.f1830a.f1854c.f1812b;
    }

    public TLRPC.Chat getMusicChat(long j3) {
        return (TLRPC.Chat) this.chats.f(j3);
    }

    public ArrayList<Long> getMusicDialogs() {
        return this.dialogs;
    }

    public ArrayList<Long> getMusicDialogsSortedByVisibleOrder() {
        ArrayList<Long> arrayList = new ArrayList<>(this.dialogs);
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (dialog != null) {
                hashMap.put(Long.valueOf(dialog.f18325id), Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new qk(hashMap, 0));
        return arrayList;
    }

    public ArrayList<MessageObject> getMusicMessages(long j3) {
        return (ArrayList) this.musicObjects.f(j3);
    }

    public TLRPC.User getMusicUser(long j3) {
        return (TLRPC.User) this.users.f(j3);
    }

    public Bitmap getRoundedAvatar(File file) {
        return createRoundBitmap(file);
    }

    public android.support.v4.media.session.b0 getSession() {
        return this.session;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.session.f1830a.f1854c;
    }

    public boolean isChatsLoaded() {
        return this.chatsLoaded;
    }

    public boolean isPasscodeLocked() {
        int i10;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (SharedConfig.passcodeHash.length() > 0) {
            if (!SharedConfig.appLocked) {
                if ((SharedConfig.autoLockIn != 0 && (i10 = SharedConfig.lastPauseTime) != 0 && i10 + SharedConfig.autoLockIn <= elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void loadBrowseChildren(String str, BrowseChildrenCallback browseChildrenCallback) {
        if (!this.chatsLoaded) {
            this.pendingBrowseRequests.add(new PendingBrowseRequest(str, browseChildrenCallback));
            loadChats();
            return;
        }
        long dialogIdFromMediaId = getDialogIdFromMediaId(str);
        if (dialogIdFromMediaId != 0 && this.musicObjects.f(dialogIdFromMediaId) == null) {
            loadMusicForDialog(dialogIdFromMediaId, new n8(this, browseChildrenCallback, str, 27));
        } else {
            browseChildrenCallback.onResult(loadChildrenSync(str));
        }
    }

    public void publishMetadata(MessageObject messageObject, jf.a aVar, Bitmap bitmap) {
        String str;
        if (messageObject == null) {
            return;
        }
        a4.m mVar = new a4.m(1);
        mVar.w0("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor());
        mVar.w0("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        mVar.v0((long) (messageObject.getDuration() * 1000.0d));
        mVar.w0("android.media.metadata.TITLE", messageObject.getMusicTitle());
        if (aVar != null && messageObject.isMusic()) {
            str = aVar.f12971f;
        } else {
            str = null;
        }
        mVar.w0("android.media.metadata.ALBUM", str);
        if (bitmap != null && !bitmap.isRecycled()) {
            mVar.t0("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.e(new MediaMetadataCompat((Bundle) mVar.f275b));
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.f(playbackStateCompat);
    }

    public void release() {
        android.support.v4.media.session.b0 b0Var = this.session;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void updateRepeatMode() {
        int i10 = SharedConfig.repeatMode;
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        }
        this.session.h(i11);
    }

    public void updateShuffleMode() {
        this.session.i(SharedConfig.shuffleMusic ? 1 : 0);
    }

    public final class SessionCallback extends android.support.v4.media.session.s {
        private SessionCallback() {
            TelegramMediaSession.this = r1;
        }

        public void lambda$notifyPlayStateForNotificationRefresh$0() {
            NotificationCenter.getInstance(TelegramMediaSession.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, 0);
        }

        private void notifyPlayStateForNotificationRefresh() {
            AndroidUtilities.runOnUIThread(new f1(this, 10));
        }

        @Override
        public void onCustomAction(String str, Bundle bundle) {
            int i10;
            if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                TelegramMediaSession.this.updateRepeatMode();
            } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                MediaController mediaController = MediaController.getInstance();
                if (SharedConfig.shuffleMusic) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                mediaController.setPlaybackOrderType(i10);
                TelegramMediaSession.this.updateShuffleMode();
            }
        }

        @Override
        public void onPause() {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }

        @Override
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null) {
                if (TelegramMediaSession.this.lastSelectedDialog != 0) {
                    lambda$onPlayFromMediaId$1(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
                    return;
                }
                return;
            }
            MediaController.getInstance().playMessage(playingMessageObject);
        }

        @Override
        public void lambda$onPlayFromMediaId$1(String str, Bundle bundle) {
            String str2;
            String str3;
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length == 2) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        int parseInt = Integer.parseInt(split[1]);
                        ArrayList<MessageObject> arrayList = (ArrayList) TelegramMediaSession.this.musicObjects.f(parseLong);
                        if (arrayList == null) {
                            TelegramMediaSession.this.loadMusicForDialog(parseLong, new g0(this, str, bundle, 5));
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.f(parseLong);
                        if (parseInt >= 0 && parseInt < arrayList.size()) {
                            TelegramMediaSession.this.lastSelectedDialog = parseLong;
                            MessagesController.getNotificationsSettings(TelegramMediaSession.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                            MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                            TelegramMediaSession.this.session.g(arrayList2);
                            if (DialogObject.isUserDialog(parseLong)) {
                                TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.f(parseLong);
                                android.support.v4.media.session.b0 b0Var = TelegramMediaSession.this.session;
                                if (user != null) {
                                    str3 = ContactsController.formatName(user.first_name, user.last_name);
                                } else {
                                    str3 = "DELETED USER";
                                }
                                b0Var.f1830a.f1852a.setQueueTitle(str3);
                                return;
                            }
                            TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-parseLong);
                            android.support.v4.media.session.b0 b0Var2 = TelegramMediaSession.this.session;
                            if (chat != null) {
                                str2 = chat.title;
                            } else {
                                str2 = "DELETED CHAT";
                            }
                            b0Var2.f1830a.f1852a.setQueueTitle(str2);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }

        @Override
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            String str3;
            String str4;
            if (str != null && str.length() != 0) {
                String lowerCase = str.toLowerCase();
                for (int i10 = 0; i10 < TelegramMediaSession.this.dialogs.size(); i10++) {
                    long longValue = ((Long) TelegramMediaSession.this.dialogs.get(i10)).longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.f(longValue);
                        if (user != null) {
                            String str5 = user.first_name;
                            if (str5 != null) {
                                str3 = str5.toLowerCase();
                            } else {
                                str3 = null;
                            }
                            String str6 = user.last_name;
                            if (str6 != null) {
                                str4 = str6.toLowerCase();
                            } else {
                                str4 = null;
                            }
                            if ((str3 != null && str3.contains(lowerCase)) || (str4 != null && str4.contains(lowerCase))) {
                                lambda$onPlayFromMediaId$1(longValue + "_0", null);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-longValue);
                        if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                            lambda$onPlayFromMediaId$1(longValue + "_0", null);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            lambda$onPlayFromMediaId$1(str, bundle);
        }

        @Override
        public void onPrepareFromSearch(String str, Bundle bundle) {
            onPlayFromSearch(str, bundle);
        }

        @Override
        public void onSeekTo(long j3) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j3 / 1000.0d) / playingMessageObject.getDuration()));
            }
        }

        @Override
        public void onSetRepeatMode(int i10) {
            int i11 = 2;
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            }
            SharedConfig.setRepeatMode(i11);
            TelegramMediaSession.this.updateRepeatMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override
        public void onSetShuffleMode(int i10) {
            int i11 = 0;
            boolean z10 = true;
            if (i10 != 1 && i10 != 2) {
                z10 = false;
            }
            if (z10 != SharedConfig.shuffleMusic) {
                MediaController mediaController = MediaController.getInstance();
                if (z10) {
                    i11 = 2;
                }
                mediaController.setPlaybackOrderType(i11);
            }
            TelegramMediaSession.this.updateShuffleMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override
        public void onSkipToNext() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                MediaController.getInstance().playNextMessage();
            }
        }

        @Override
        public void onSkipToPrevious() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isMusic()) {
                MediaController.getInstance().playPreviousMessage();
            }
        }

        @Override
        public void onSkipToQueueItem(long j3) {
            MediaController.getInstance().playMessageAtIndex((int) j3);
        }

        @Override
        public void onPrepare() {
        }

        @Override
        public void onStop() {
        }
    }
}
