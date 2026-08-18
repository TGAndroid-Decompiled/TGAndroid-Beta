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
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.audioinfo.AudioInfo;
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
    private final MediaSessionCompat session;
    private final ArrayList<Long> dialogs = new ArrayList<>();
    private final LongSparseArray users = new LongSparseArray();
    private final LongSparseArray chats = new LongSparseArray();
    private final LongSparseArray musicObjects = new LongSparseArray();
    private final LongSparseArray musicQueues = new LongSparseArray();

    public interface BrowseChildrenCallback {
        void onResult(List<MediaBrowser.MediaItem> list);
    }

    public static TelegramMediaSession getInstance(Context context) {
        if (instance == null) {
            synchronized (TelegramMediaSession.class) {
                try {
                    if (instance == null) {
                        instance = new TelegramMediaSession(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public static TelegramMediaSession peekInstance() {
        return instance;
    }

    private TelegramMediaSession(Context context) {
        this.appContext = context;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i), "auto_lastSelectedDialog", 0L);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "TelegramMediaSession");
        this.session = mediaSessionCompat;
        mediaSessionCompat.setFlags(3);
        mediaSessionCompat.setCallback(new SessionCallback());
        mediaSessionCompat.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        mediaSessionCompat.setExtras(bundle);
        mediaSessionCompat.setActive(true);
        mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0L, 1.0f).setActions(getAvailableActions()).build());
        updateRepeatMode();
        updateShuffleMode();
        NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                this.f$0.lambda$new$0(i2, i3, objArr);
            }
        }, NotificationCenter.activeAccountChanged);
    }

    public void lambda$new$0(int i, int i2, Object[] objArr) {
        if (i == NotificationCenter.activeAccountChanged) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onAccountSwitched();
                }
            });
        }
    }

    public void onAccountSwitched() {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(i), "auto_lastSelectedDialog", 0L);
        this.chatsLoaded = false;
        this.loadingChats = false;
        this.dialogs.clear();
        this.users.clear();
        this.chats.clear();
        this.musicObjects.clear();
        this.musicQueues.clear();
        try {
            this.session.setQueue(null);
            this.session.setQueueTitle(null);
        } catch (Throwable unused) {
        }
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public ArrayList<Long> getMusicDialogsSortedByVisibleOrder() {
        ArrayList<Long> arrayList = new ArrayList<>(this.dialogs);
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
        final HashMap map = new HashMap();
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (dialog != null) {
                map.put(Long.valueOf(dialog.id), Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1(map, (Long) obj, (Long) obj2);
            }
        });
        return arrayList;
    }

    public static int lambda$getMusicDialogsSortedByVisibleOrder$1(HashMap map, Long l, Long l2) {
        Integer num = (Integer) map.get(l);
        Integer num2 = (Integer) map.get(l2);
        if (num == null && num2 == null) {
            return Long.compare(l.longValue(), l2.longValue());
        }
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return Integer.compare(num.intValue(), num2.intValue());
    }

    public MediaSessionCompat getSession() {
        return this.session;
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.session.getSessionToken();
    }

    public MediaSession.Token getFrameworkSessionToken() {
        return (MediaSession.Token) this.session.getSessionToken().getToken();
    }

    public void release() {
        MediaSessionCompat mediaSessionCompat = this.session;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.release();
        }
    }

    public Bundle buildRootHints() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        return bundle;
    }

    public boolean isPasscodeLocked() {
        int i;
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        return SharedConfig.passcodeHash.length() > 0 && (SharedConfig.appLocked || (!(SharedConfig.autoLockIn == 0 || (i = SharedConfig.lastPauseTime) == 0 || i + SharedConfig.autoLockIn > iElapsedRealtime) || iElapsedRealtime + 5 < SharedConfig.lastPauseTime));
    }

    public boolean isChatsLoaded() {
        return this.chatsLoaded;
    }

    public ArrayList<Long> getMusicDialogs() {
        return this.dialogs;
    }

    public TLRPC.User getMusicUser(long j) {
        return (TLRPC.User) this.users.get(j);
    }

    public TLRPC.Chat getMusicChat(long j) {
        return (TLRPC.Chat) this.chats.get(j);
    }

    public ArrayList<MessageObject> getMusicMessages(long j) {
        return (ArrayList) this.musicObjects.get(j);
    }

    public Bitmap getRoundedAvatar(File file) {
        return createRoundBitmap(file);
    }

    public void ensureLoaded(final Runnable runnable) {
        if (!this.chatsLoaded) {
            loadBrowseChildren("__ROOT__", new BrowseChildrenCallback() {
                @Override
                public final void onResult(List list) {
                    TelegramMediaSession.lambda$ensureLoaded$2(runnable, list);
                }
            });
        } else if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public static void lambda$ensureLoaded$2(Runnable runnable, List list) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void loadBrowseChildren(final String str, final BrowseChildrenCallback browseChildrenCallback) {
        if (this.chatsLoaded) {
            browseChildrenCallback.onResult(loadChildrenSync(str));
            return;
        }
        this.loadingChats = true;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadBrowseChildren$4(messagesStorage, browseChildrenCallback, str);
            }
        });
    }

    public void lambda$loadBrowseChildren$4(MessagesStorage messagesStorage, final BrowseChildrenCallback browseChildrenCallback, final String str) {
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteCursor sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = %d", 4), new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                if (!DialogObject.isEncryptedDialog(jLongValue)) {
                    this.dialogs.add(Long.valueOf(jLongValue));
                    if (DialogObject.isUserDialog(jLongValue)) {
                        arrayList.add(Long.valueOf(jLongValue));
                    } else {
                        arrayList2.add(Long.valueOf(-jLongValue));
                    }
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!this.dialogs.isEmpty()) {
                SQLiteCursor sQLiteCursorQueryFinalized2 = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT uid, data, mid FROM media_v4 WHERE uid IN (%s) AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC", TextUtils.join(",", this.dialogs), 4), new Object[0]);
                while (sQLiteCursorQueryFinalized2.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(1);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        nativeByteBufferByteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(messageTLdeserialize)) {
                            long jLongValue2 = sQLiteCursorQueryFinalized2.longValue(0);
                            messageTLdeserialize.id = sQLiteCursorQueryFinalized2.intValue(2);
                            messageTLdeserialize.dialog_id = jLongValue2;
                            ArrayList arrayList3 = (ArrayList) this.musicObjects.get(jLongValue2);
                            ArrayList arrayList4 = (ArrayList) this.musicQueues.get(jLongValue2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                this.musicObjects.put(jLongValue2, arrayList3);
                                arrayList4 = new ArrayList();
                                this.musicQueues.put(jLongValue2, arrayList4);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, messageTLdeserialize, false, true);
                            arrayList3.add(0, messageObject);
                            MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(jLongValue2 + "_" + arrayList3.size());
                            mediaId.setTitle(messageObject.getMusicTitle());
                            mediaId.setSubtitle(messageObject.getMusicAuthor());
                            arrayList4.add(0, new MediaSessionCompat.QueueItem(mediaId.build(), (long) arrayList4.size()));
                        }
                    }
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (!arrayList.isEmpty()) {
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList, arrayList5);
                    for (TLRPC.User user : arrayList5) {
                        this.users.put(user.id, user);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
                    for (TLRPC.Chat chat : arrayList6) {
                        this.chats.put(chat.id, chat);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadBrowseChildren$3(browseChildrenCallback, str);
            }
        });
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

    private List<MediaBrowser.MediaItem> loadChildrenSync(String str) {
        long j;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if ("__ROOT__".equals(str)) {
            while (i < this.dialogs.size()) {
                long jLongValue = this.dialogs.get(i).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId("__CHAT_" + jLongValue);
                Bitmap bitmapCreateRoundBitmap = null;
                if (DialogObject.isUserDialog(jLongValue)) {
                    TLRPC.User user = (TLRPC.User) this.users.get(jLongValue);
                    if (user != null) {
                        mediaId.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                            if (fileLocation instanceof TLRPC.TL_fileLocationUnavailable) {
                            }
                        }
                    } else {
                        mediaId.setTitle("DELETED USER");
                    }
                    fileLocation = null;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-jLongValue);
                    if (chat != null) {
                        mediaId.setTitle(chat.title);
                        TLRPC.ChatPhoto chatPhoto = chat.photo;
                        if (chatPhoto != null) {
                            fileLocation = chatPhoto.photo_small;
                            if (fileLocation instanceof TLRPC.TL_fileLocationUnavailable) {
                            }
                        }
                    } else {
                        mediaId.setTitle("DELETED CHAT");
                    }
                    fileLocation = null;
                }
                if (fileLocation != null && (bitmapCreateRoundBitmap = createRoundBitmap(FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true))) != null) {
                    mediaId.setIconBitmap(bitmapCreateRoundBitmap);
                }
                if (fileLocation == null || bitmapCreateRoundBitmap == null) {
                    mediaId.setIconUri(Uri.parse("android.resource://" + this.appContext.getPackageName() + "/drawable/contact_blue"));
                }
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i++;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.replace("__CHAT_", ""));
            } catch (Exception e) {
                FileLog.e(e);
                j = 0;
            }
            ArrayList arrayList2 = (ArrayList) this.musicObjects.get(j);
            if (arrayList2 != null) {
                while (i < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(i);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j + "_" + i);
                    mediaId2.setTitle(messageObject.getMusicTitle());
                    mediaId2.setSubtitle(messageObject.getMusicAuthor());
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                    i++;
                }
            }
        }
        return arrayList;
    }

    private void applyQueueFor(long j) {
        String name;
        if (j == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.musicObjects.get(j);
        ArrayList arrayList2 = (ArrayList) this.musicQueues.get(j);
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        this.session.setQueue(arrayList2);
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = (TLRPC.User) this.users.get(j);
            MediaSessionCompat mediaSessionCompat = this.session;
            if (user != null) {
                name = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                name = "DELETED USER";
            }
            mediaSessionCompat.setQueueTitle(name);
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) this.chats.get(-j);
            this.session.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
        }
        MessageObject messageObject = (MessageObject) arrayList.get(0);
        this.session.setMetadata(new MediaMetadataCompat.Builder().putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d)).putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor()).putString("android.media.metadata.TITLE", messageObject.getMusicTitle()).build());
    }

    public void publishMetadata(MessageObject messageObject, AudioInfo audioInfo, Bitmap bitmap) {
        if (messageObject == null) {
            return;
        }
        MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString("android.media.metadata.ALBUM_ARTIST", messageObject.getMusicAuthor()).putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor()).putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d)).putString("android.media.metadata.TITLE", messageObject.getMusicTitle()).putString("android.media.metadata.ALBUM", (audioInfo == null || !messageObject.isMusic()) ? null : audioInfo.getAlbum());
        if (bitmap != null && !bitmap.isRecycled()) {
            builderPutString.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        }
        this.session.setMetadata(builderPutString.build());
    }

    public void publishPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.session.setPlaybackState(playbackStateCompat);
    }

    public long getAvailableActions() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return 2477828L;
        }
        long j = MediaController.getInstance().isMessagePaused() ? 2477828L : 2477830L;
        return playingMessageObject.isMusic() ? j | 48 : j;
    }

    public void updateRepeatMode() {
        int i = SharedConfig.repeatMode;
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 0 : 1;
        }
        this.session.setRepeatMode(i2);
    }

    public void updateShuffleMode() {
        this.session.setShuffleMode(SharedConfig.shuffleMusic ? 1 : 0);
    }

    private Bitmap createRoundBitmap(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.toString(), options);
            if (bitmapDecodeFile == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
            if (this.roundPaint == null) {
                this.roundPaint = new Paint(1);
                this.bitmapRect = new RectF();
            }
            this.roundPaint.setShader(bitmapShader);
            this.bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
            canvas.drawRoundRect(this.bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), this.roundPaint);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    final class SessionCallback extends MediaSessionCompat.Callback {
        @Override
        public void onPrepare() {
        }

        @Override
        public void onStop() {
        }

        private SessionCallback() {
        }

        @Override
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().playMessage(playingMessageObject);
                return;
            }
            if (TelegramMediaSession.this.lastSelectedDialog != 0) {
                onPlayFromMediaId(TelegramMediaSession.this.lastSelectedDialog + "_0", null);
            }
        }

        @Override
        public void onPause() {
            MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        }

        @Override
        public void onSkipToNext() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playNextMessage();
        }

        @Override
        public void onSkipToPrevious() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null || !playingMessageObject.isMusic()) {
                return;
            }
            MediaController.getInstance().playPreviousMessage();
        }

        @Override
        public void onSkipToQueueItem(long j) {
            MediaController.getInstance().playMessageAtIndex((int) j);
        }

        @Override
        public void onSeekTo(long j) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, (float) ((j / 1000.0d) / playingMessageObject.getDuration()));
            }
        }

        @Override
        public void onSetRepeatMode(int i) {
            int i2 = 2;
            if (i != 1) {
                i2 = (i == 2 || i == 3) ? 1 : 0;
            }
            SharedConfig.setRepeatMode(i2);
            TelegramMediaSession.this.updateRepeatMode();
            notifyPlayStateForNotificationRefresh();
        }

        @Override
        public void onSetShuffleMode(int i) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            if (z != SharedConfig.shuffleMusic) {
                MediaController.getInstance().setPlaybackOrderType(z ? 2 : 0);
            }
            TelegramMediaSession.this.updateShuffleMode();
            notifyPlayStateForNotificationRefresh();
        }

        public void lambda$notifyPlayStateForNotificationRefresh$0() {
            NotificationCenter.getInstance(TelegramMediaSession.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, 0);
        }

        private void notifyPlayStateForNotificationRefresh() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$notifyPlayStateForNotificationRefresh$0();
                }
            });
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
        public void onPlayFromMediaId(String str, Bundle bundle) {
            String name;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length != 2) {
                return;
            }
            try {
                long j = Long.parseLong(strArrSplit[0]);
                int i = Integer.parseInt(strArrSplit[1]);
                ArrayList<MessageObject> arrayList = (ArrayList) TelegramMediaSession.this.musicObjects.get(j);
                ArrayList arrayList2 = (ArrayList) TelegramMediaSession.this.musicQueues.get(j);
                if (arrayList != null && i >= 0 && i < arrayList.size()) {
                    TelegramMediaSession.this.lastSelectedDialog = j;
                    MessagesController.getNotificationsSettings(TelegramMediaSession.this.currentAccount).edit().putLong("auto_lastSelectedDialog", j).apply();
                    MediaController.getInstance().setPlaylist(arrayList, arrayList.get(i), 0L, false, null);
                    TelegramMediaSession.this.session.setQueue(arrayList2);
                    if (DialogObject.isUserDialog(j)) {
                        TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.get(j);
                        MediaSessionCompat mediaSessionCompat = TelegramMediaSession.this.session;
                        if (user != null) {
                            name = ContactsController.formatName(user.first_name, user.last_name);
                        } else {
                            name = "DELETED USER";
                        }
                        mediaSessionCompat.setQueueTitle(name);
                        return;
                    }
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.get(-j);
                    TelegramMediaSession.this.session.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            if (str == null || str.length() == 0) {
                return;
            }
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < TelegramMediaSession.this.dialogs.size(); i++) {
                long jLongValue = ((Long) TelegramMediaSession.this.dialogs.get(i)).longValue();
                if (DialogObject.isUserDialog(jLongValue)) {
                    TLRPC.User user = (TLRPC.User) TelegramMediaSession.this.users.get(jLongValue);
                    if (user != null) {
                        String str3 = user.first_name;
                        String lowerCase2 = str3 != null ? str3.toLowerCase() : null;
                        String str4 = user.last_name;
                        String lowerCase3 = str4 != null ? str4.toLowerCase() : null;
                        if ((lowerCase2 != null && lowerCase2.contains(lowerCase)) || (lowerCase3 != null && lowerCase3.contains(lowerCase))) {
                            onPlayFromMediaId(jLongValue + "_0", null);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) TelegramMediaSession.this.chats.get(-jLongValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        onPlayFromMediaId(jLongValue + "_0", null);
                        return;
                    }
                }
            }
        }

        @Override
        public void onCustomAction(String str, Bundle bundle) {
            if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                SharedConfig.setRepeatMode((SharedConfig.repeatMode + 1) % 3);
                TelegramMediaSession.this.updateRepeatMode();
            } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                MediaController.getInstance().setPlaybackOrderType(SharedConfig.shuffleMusic ? 0 : 2);
                TelegramMediaSession.this.updateShuffleMode();
            }
        }
    }
}
