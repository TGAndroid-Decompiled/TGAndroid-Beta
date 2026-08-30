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
    private final android.support.v4.media.session.c0 session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final a0.h users = new a0.h();
    private final a0.h chats = new a0.h();
    private final a0.h musicObjects = new a0.h();
    private final a0.h musicQueues = new a0.h();

    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i10), "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.c0 c0Var = new android.support.v4.media.session.c0(context, "TelegramMediaSession", null, null);
        this.session = c0Var;
        android.support.v4.media.session.v vVar = c0Var.f246a;
        vVar.f268a.setFlags(3);
        c0Var.d(new SessionCallback(), null);
        vVar.f268a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        vVar.f268a.setExtras(bundle);
        c0Var.c(true);
        ArrayList arrayList = new ArrayList();
        c0Var.f(new PlaybackStateCompat(0, 0L, 0L, 1.0f, getAvailableActions(), 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null));
        updateRepeatMode();
        updateShuffleMode();
        NotificationCenter.getGlobalInstance().addObserver(new y1(this, 1), NotificationCenter.activeAccountChanged);
    }

    private void applyQueueFor(long j10) {
        String str;
        String str2;
        if (j10 != 0) {
            ArrayList arrayList = (ArrayList) this.musicObjects.f(j10);
            ArrayList arrayList2 = (ArrayList) this.musicQueues.f(j10);
            if (arrayList != null && !arrayList.isEmpty() && arrayList2 != null) {
                this.session.g(arrayList2);
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user = (TLRPC.User) this.users.f(j10);
                    android.support.v4.media.session.c0 c0Var = this.session;
                    if (user != null) {
                        str2 = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        str2 = "DELETED USER";
                    }
                    c0Var.f246a.f268a.setQueueTitle(str2);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.f(-j10);
                    android.support.v4.media.session.c0 c0Var2 = this.session;
                    if (chat != null) {
                        str = chat.title;
                    } else {
                        str = "DELETED CHAT";
                    }
                    c0Var2.f246a.f268a.setQueueTitle(str);
                }
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                android.support.v4.media.d dVar = new android.support.v4.media.d();
                dVar.d((long) (messageObject.getDuration() * 1000.0d), "android.media.metadata.DURATION");
                dVar.e("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
                dVar.e("android.media.metadata.TITLE", messageObject.getMusicTitle());
                this.session.e(dVar.a());
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

    public static int lambda$getMusicDialogsSortedByVisibleOrder$1(HashMap hashMap, Long l10, Long l11) {
        Integer num = (Integer) hashMap.get(l10);
        Integer num2 = (Integer) hashMap.get(l11);
        if (num == null && num2 == null) {
            return Long.compare(l10.longValue(), l11.longValue());
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
        this.chatsLoaded = true;
        this.loadingChats = false;
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        applyQueueFor(this.lastSelectedDialog);
        browseChildrenCallback.onResult(loadChildrenSync(str));
    }

    public void lambda$loadBrowseChildren$4(MessagesStorage messagesStorage, BrowseChildrenCallback browseChildrenCallback, String str) {
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase database = messagesStorage.getDatabase();
            Locale locale = Locale.US;
            int i10 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(longValue)) {
                    this.dialogs.add(Long.valueOf(longValue));
                    if (DialogObject.isUserDialog(longValue)) {
                        arrayList.add(Long.valueOf(longValue));
                    } else {
                        arrayList2.add(Long.valueOf(-longValue));
                    }
                }
            }
            queryFinalized.dispose();
            if (!this.dialogs.isEmpty()) {
                String join = TextUtils.join(",", this.dialogs);
                SQLiteDatabase database2 = messagesStorage.getDatabase();
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized2 = database2.queryFinalized("SELECT uid, data, mid FROM media_v4 WHERE uid IN (" + join + ") AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        byteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(TLdeserialize)) {
                            long longValue2 = queryFinalized2.longValue(0);
                            TLdeserialize.f19205id = queryFinalized2.intValue(2);
                            TLdeserialize.dialog_id = longValue2;
                            ArrayList arrayList3 = (ArrayList) this.musicObjects.f(longValue2);
                            ArrayList arrayList4 = (ArrayList) this.musicQueues.f(longValue2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                this.musicObjects.k(arrayList3, longValue2);
                                arrayList4 = new ArrayList();
                                this.musicQueues.k(arrayList4, longValue2);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                            arrayList3.add(0, messageObject);
                            arrayList4.add(0, new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(longValue2 + "_" + arrayList3.size(), messageObject.getMusicTitle(), messageObject.getMusicAuthor(), null, null, null, null, null), arrayList4.size()));
                        }
                    }
                }
                queryFinalized2.dispose();
                if (!arrayList.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList, arrayList5);
                    int size = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.User user = arrayList5.get(i11);
                        i11++;
                        TLRPC.User user2 = user;
                        this.users.k(user2, user2.f19331id);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
                    int size2 = arrayList6.size();
                    while (i10 < size2) {
                        TLRPC.Chat chat = arrayList6.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        this.chats.k(chat2, chat2.f19184id);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new d9(25, this, browseChildrenCallback, str));
    }

    public void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.activeAccountChanged) {
            AndroidUtilities.runOnUIThread(new xg(this, 15));
        }
    }

    private java.util.List<android.media.browse.MediaBrowser.MediaItem> loadChildrenSync(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TelegramMediaSession.loadChildrenSync(java.lang.String):java.util.List");
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
        try {
            this.session.g(null);
            this.session.f246a.f268a.setQueueTitle(null);
        } catch (Throwable unused) {
        }
    }

    public static TelegramMediaSession peekInstance() {
        return instance;
    }

    public Bundle buildRootHints() {
        Bundle e = y3.e(2, "android.media.browse.CONTENT_STYLE_SUPPORTED", "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", true);
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
        loadBrowseChildren("__ROOT__", new j4(runnable));
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        long j10 = 2477828;
        if (playingMessageObject == null) {
            return 2477828L;
        }
        if (!MediaController.getInstance().isMessagePaused()) {
            j10 = 2477830;
        }
        if (playingMessageObject.isMusic()) {
            return j10 | 48;
        }
        return j10;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.f246a.f269b.f227b;
    }

    public TLRPC.Chat getMusicChat(long j10) {
        return (TLRPC.Chat) this.chats.f(j10);
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
                hashMap.put(Long.valueOf(dialog.f19188id), Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new tk(hashMap, 0));
        return arrayList;
    }

    public ArrayList<MessageObject> getMusicMessages(long j10) {
        return (ArrayList) this.musicObjects.f(j10);
    }

    public TLRPC.User getMusicUser(long j10) {
        return (TLRPC.User) this.users.f(j10);
    }

    public Bitmap getRoundedAvatar(File file) {
        return createRoundBitmap(file);
    }

    public android.support.v4.media.session.c0 getSession() {
        return this.session;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.session.f246a.f269b;
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
        if (this.chatsLoaded) {
            browseChildrenCallback.onResult(loadChildrenSync(str));
            return;
        }
        this.loadingChats = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new fj(this, messagesStorage, browseChildrenCallback, str, 3));
    }

    public void publishMetadata(MessageObject messageObject, we.a aVar, Bitmap bitmap) {
        String str;
        if (messageObject == null) {
            return;
        }
        android.support.v4.media.d dVar = new android.support.v4.media.d();
        dVar.e("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor());
        dVar.e("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
        dVar.d((long) (messageObject.getDuration() * 1000.0d), "android.media.metadata.DURATION");
        dVar.e("android.media.metadata.TITLE", messageObject.getMusicTitle());
        if (aVar != null && messageObject.isMusic()) {
            str = aVar.f46518f;
        } else {
            str = null;
        }
        dVar.e("android.media.metadata.ALBUM", str);
        if (bitmap != null && !bitmap.isRecycled()) {
            dVar.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.e(dVar.a());
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.f(playbackStateCompat);
    }

    public void release() {
        android.support.v4.media.session.c0 c0Var = this.session;
        if (c0Var != null) {
            c0Var.b();
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
            AndroidUtilities.runOnUIThread(new e1(this, 10));
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
                    onPlayFromMediaId(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
                    return;
                }
                return;
            }
            MediaController.getInstance().playMessage(playingMessageObject);
        }

        @Override
        public void onPlayFromMediaId(String str, Bundle bundle) {
            String str2;
            String str3;
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length == 2) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        int parseInt = Integer.parseInt(split[1]);
                        ArrayList<MessageObject> arrayList = (ArrayList) TelegramMediaSession.this.musicObjects.f(parseLong);
                        ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.f(parseLong);
                        if (arrayList != null && parseInt >= 0 && parseInt < arrayList.size()) {
                            TelegramMediaSession.this.lastSelectedDialog = parseLong;
                            MessagesController.getNotificationsSettings(TelegramMediaSession.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                            MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                            TelegramMediaSession.this.session.g(arrayList2);
                            if (DialogObject.isUserDialog(parseLong)) {
                                TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.f(parseLong);
                                android.support.v4.media.session.c0 c0Var = TelegramMediaSession.this.session;
                                if (user != null) {
                                    str3 = ContactsController.formatName(user.first_name, user.last_name);
                                } else {
                                    str3 = "DELETED USER";
                                }
                                c0Var.f246a.f268a.setQueueTitle(str3);
                                return;
                            }
                            TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-parseLong);
                            android.support.v4.media.session.c0 c0Var2 = TelegramMediaSession.this.session;
                            if (chat != null) {
                                str2 = chat.title;
                            } else {
                                str2 = "DELETED CHAT";
                            }
                            c0Var2.f246a.f268a.setQueueTitle(str2);
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
                                onPlayFromMediaId(longValue + "_0", null);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.f(-longValue);
                        if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                            onPlayFromMediaId(longValue + "_0", null);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            onPlayFromMediaId(str, bundle);
        }

        @Override
        public void onPrepareFromSearch(String str, Bundle bundle) {
            onPlayFromSearch(str, bundle);
        }

        @Override
        public void onSeekTo(long j10) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j10 / 1000.0d) / playingMessageObject.getDuration()));
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
            boolean z4 = true;
            if (i10 != 1 && i10 != 2) {
                z4 = false;
            }
            if (z4 != SharedConfig.shuffleMusic) {
                MediaController mediaController = MediaController.getInstance();
                if (z4) {
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
        public void onSkipToQueueItem(long j10) {
            MediaController.getInstance().playMessageAtIndex((int) j10);
        }

        @Override
        public void onPrepare() {
        }

        @Override
        public void onStop() {
        }
    }
}
