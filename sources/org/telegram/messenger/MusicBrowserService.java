package org.telegram.messenger;

import android.annotation.TargetApi;
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
import android.media.MediaMetadata;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.LaunchActivity;

@TargetApi(21)
public class MusicBrowserService extends MediaBrowserService implements NotificationCenter.NotificationCenterDelegate {
    public static final String ACTION_CMD = "com.example.android.mediabrowserservice.ACTION_CMD";
    public static final String CMD_NAME = "CMD_NAME";
    public static final String CMD_PAUSE = "CMD_PAUSE";
    private static final String MEDIA_ID_ROOT = "__ROOT__";
    private static final String SLOT_RESERVATION_QUEUE = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE";
    private static final String SLOT_RESERVATION_SKIP_TO_NEXT = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT";
    private static final String SLOT_RESERVATION_SKIP_TO_PREV = "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS";
    private static final int STOP_DELAY = 30000;
    private RectF bitmapRect;
    private boolean chatsLoaded;
    private long lastSelectedDialog;
    private boolean loadingChats;
    private MediaSession mediaSession;
    private Paint roundPaint;
    private boolean serviceStarted;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList<Long> dialogs = new ArrayList<>();
    private LongSparseArray<TLRPC$User> users = new LongSparseArray<>();
    private LongSparseArray<TLRPC$Chat> chats = new LongSparseArray<>();
    private LongSparseArray<ArrayList<MessageObject>> musicObjects = new LongSparseArray<>();
    private LongSparseArray<ArrayList<MediaSession.QueueItem>> musicQueues = new LongSparseArray<>();
    private DelayedStopHandler delayedStopHandler = new DelayedStopHandler();

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationLoader.postInitApplication();
        this.lastSelectedDialog = AndroidUtilities.getPrefIntOrLong(MessagesController.getNotificationsSettings(this.currentAccount), "auto_lastSelectedDialog", 0L);
        updatePlaybackState(null);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
    }

    public void createMediaSession() {
        if (this.mediaSession != null) {
            return;
        }
        MediaSession mediaSession = new MediaSession(this, "MusicService");
        this.mediaSession = mediaSession;
        setSessionToken(mediaSession.getSessionToken());
        this.mediaSession.setCallback(new MediaSessionCallback());
        this.mediaSession.setFlags(3);
        Context applicationContext = getApplicationContext();
        this.mediaSession.setSessionActivity(PendingIntent.getActivity(applicationContext, 99, new Intent(applicationContext, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        this.mediaSession.setExtras(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        handleStopRequest(null);
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession != null) {
            mediaSession.release();
        }
    }

    @Override
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (str == null || (!(1000 == i || Process.myUid() == i || str.equals("com.google.android.mediasimulator") || str.equals("com.google.android.projection.gearhead")) || passcode())) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("__ROOT__", null);
    }

    @Override
    public void onLoadChildren(final String str, final MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        if (passcode()) {
            Toast.makeText(getApplicationContext(), LocaleController.getString(R.string.EnterYourTelegramPasscode), 1).show();
            stopSelf();
            result.detach();
        } else {
            if (!this.chatsLoaded) {
                result.detach();
                if (this.loadingChats) {
                    return;
                }
                this.loadingChats = true;
                final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MusicBrowserService.this.lambda$onLoadChildren$1(messagesStorage, str, result);
                    }
                });
                return;
            }
            loadChildrenImpl(str, result);
        }
    }

    public void lambda$onLoadChildren$1(MessagesStorage messagesStorage, final String str, final MediaBrowserService.Result result) {
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = %d", 4), new Object[0]);
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
                SQLiteCursor queryFinalized2 = messagesStorage.getDatabase().queryFinalized(String.format(Locale.US, "SELECT uid, data, mid FROM media_v4 WHERE uid IN (%s) AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC", TextUtils.join(",", this.dialogs), 4), new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        byteBufferValue.reuse();
                        if (MessageObject.isMusicMessage(TLdeserialize)) {
                            long longValue2 = queryFinalized2.longValue(0);
                            TLdeserialize.id = queryFinalized2.intValue(2);
                            TLdeserialize.dialog_id = longValue2;
                            ArrayList<MessageObject> arrayList3 = this.musicObjects.get(longValue2);
                            ArrayList<MediaSession.QueueItem> arrayList4 = this.musicQueues.get(longValue2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList<>();
                                this.musicObjects.put(longValue2, arrayList3);
                                arrayList4 = new ArrayList<>();
                                this.musicQueues.put(longValue2, arrayList4);
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                            arrayList3.add(0, messageObject);
                            MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId(longValue2 + "_" + arrayList3.size());
                            mediaId.setTitle(messageObject.getMusicTitle());
                            mediaId.setSubtitle(messageObject.getMusicAuthor());
                            arrayList4.add(0, new MediaSession.QueueItem(mediaId.build(), (long) arrayList4.size()));
                        }
                    }
                }
                queryFinalized2.dispose();
                if (!arrayList.isEmpty()) {
                    ArrayList<TLRPC$User> arrayList5 = new ArrayList<>();
                    messagesStorage.getUsersInternal(arrayList, arrayList5);
                    for (int i = 0; i < arrayList5.size(); i++) {
                        TLRPC$User tLRPC$User = arrayList5.get(i);
                        this.users.put(tLRPC$User.id, tLRPC$User);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList<TLRPC$Chat> arrayList6 = new ArrayList<>();
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList6);
                    for (int i2 = 0; i2 < arrayList6.size(); i2++) {
                        TLRPC$Chat tLRPC$Chat = arrayList6.get(i2);
                        this.chats.put(tLRPC$Chat.id, tLRPC$Chat);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MusicBrowserService.this.lambda$onLoadChildren$0(str, result);
            }
        });
    }

    public void lambda$onLoadChildren$0(String str, MediaBrowserService.Result result) {
        this.chatsLoaded = true;
        this.loadingChats = false;
        loadChildrenImpl(str, result);
        if (this.lastSelectedDialog == 0 && !this.dialogs.isEmpty()) {
            this.lastSelectedDialog = this.dialogs.get(0).longValue();
        }
        long j = this.lastSelectedDialog;
        if (j != 0) {
            ArrayList<MessageObject> arrayList = this.musicObjects.get(j);
            ArrayList<MediaSession.QueueItem> arrayList2 = this.musicQueues.get(this.lastSelectedDialog);
            if (arrayList != null && !arrayList.isEmpty()) {
                createMediaSession();
                this.mediaSession.setQueue(arrayList2);
                long j2 = this.lastSelectedDialog;
                if (j2 > 0) {
                    TLRPC$User tLRPC$User = this.users.get(j2);
                    if (tLRPC$User != null) {
                        this.mediaSession.setQueueTitle(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
                    } else {
                        this.mediaSession.setQueueTitle("DELETED USER");
                    }
                } else {
                    TLRPC$Chat tLRPC$Chat = this.chats.get(-j2);
                    if (tLRPC$Chat != null) {
                        this.mediaSession.setQueueTitle(tLRPC$Chat.title);
                    } else {
                        this.mediaSession.setQueueTitle("DELETED CHAT");
                    }
                }
                MessageObject messageObject = arrayList.get(0);
                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                builder.putLong("android.media.metadata.DURATION", (long) (messageObject.getDuration() * 1000.0d));
                builder.putString("android.media.metadata.ARTIST", messageObject.getMusicAuthor());
                builder.putString("android.media.metadata.TITLE", messageObject.getMusicTitle());
                this.mediaSession.setMetadata(builder.build());
            }
        }
        updatePlaybackState(null);
    }

    private static boolean passcode() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        return SharedConfig.passcodeHash.length() > 0 && (SharedConfig.appLocked || (!(SharedConfig.autoLockIn == 0 || (i = SharedConfig.lastPauseTime) == 0 || i + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime));
    }

    private void loadChildrenImpl(java.lang.String r8, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MusicBrowserService.loadChildrenImpl(java.lang.String, android.service.media.MediaBrowserService$Result):void");
    }

    private Bitmap createRoundBitmap(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.toString(), options);
            if (decodeFile == null) {
                return null;
            }
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
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final class MediaSessionCallback extends MediaSession.Callback {
        private MediaSessionCallback() {
        }

        @Override
        public void onPlay() {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject == null) {
                onPlayFromMediaId(MusicBrowserService.this.lastSelectedDialog + "_0", null);
                return;
            }
            MediaController.getInstance().playMessage(playingMessageObject);
        }

        @Override
        public void onSkipToQueueItem(long j) {
            MediaController.getInstance().playMessageAtIndex((int) j);
            MusicBrowserService.this.handlePlayRequest();
        }

        @Override
        public void onSeekTo(long j) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null) {
                MediaController.getInstance().seekToProgress(playingMessageObject, ((float) (j / 1000)) / ((float) playingMessageObject.getDuration()));
            }
        }

        @Override
        public void onPlayFromMediaId(String str, Bundle bundle) {
            long parseLong;
            int parseInt;
            ArrayList<MessageObject> arrayList;
            ArrayList arrayList2;
            String[] split = str.split("_");
            if (split.length != 2) {
                return;
            }
            try {
                parseLong = Long.parseLong(split[0]);
                parseInt = Integer.parseInt(split[1]);
                arrayList = (ArrayList) MusicBrowserService.this.musicObjects.get(parseLong);
                arrayList2 = (ArrayList) MusicBrowserService.this.musicQueues.get(parseLong);
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList != null && parseInt >= 0 && parseInt < arrayList.size()) {
                MusicBrowserService.this.lastSelectedDialog = parseLong;
                MessagesController.getNotificationsSettings(MusicBrowserService.this.currentAccount).edit().putLong("auto_lastSelectedDialog", parseLong).commit();
                MediaController.getInstance().setPlaylist(arrayList, arrayList.get(parseInt), 0L, false, null);
                MusicBrowserService.this.createMediaSession();
                MusicBrowserService.this.mediaSession.setQueue(arrayList2);
                if (parseLong > 0) {
                    TLRPC$User tLRPC$User = (TLRPC$User) MusicBrowserService.this.users.get(parseLong);
                    if (tLRPC$User != null) {
                        MusicBrowserService.this.mediaSession.setQueueTitle(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
                    } else {
                        MusicBrowserService.this.mediaSession.setQueueTitle("DELETED USER");
                    }
                } else {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) MusicBrowserService.this.chats.get(-parseLong);
                    if (tLRPC$Chat != null) {
                        MusicBrowserService.this.mediaSession.setQueueTitle(tLRPC$Chat.title);
                    } else {
                        MusicBrowserService.this.mediaSession.setQueueTitle("DELETED CHAT");
                    }
                }
                MusicBrowserService.this.handlePlayRequest();
            }
        }

        @Override
        public void onPause() {
            MusicBrowserService.this.handlePauseRequest();
        }

        @Override
        public void onStop() {
            MusicBrowserService.this.handleStopRequest(null);
        }

        @Override
        public void onSkipToNext() {
            MediaController.getInstance().playNextMessage();
        }

        @Override
        public void onSkipToPrevious() {
            MediaController.getInstance().playPreviousMessage();
        }

        @Override
        public void onPlayFromSearch(String str, Bundle bundle) {
            String str2;
            String str3;
            String str4;
            if (str == null || str.length() == 0) {
                return;
            }
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < MusicBrowserService.this.dialogs.size(); i++) {
                long longValue = ((Long) MusicBrowserService.this.dialogs.get(i)).longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC$User tLRPC$User = (TLRPC$User) MusicBrowserService.this.users.get(longValue);
                    if (tLRPC$User != null && (((str3 = tLRPC$User.first_name) != null && str3.startsWith(lowerCase)) || ((str4 = tLRPC$User.last_name) != null && str4.startsWith(lowerCase)))) {
                        onPlayFromMediaId(longValue + "_0", null);
                        return;
                    }
                } else {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) MusicBrowserService.this.chats.get(-longValue);
                    if (tLRPC$Chat != null && (str2 = tLRPC$Chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        onPlayFromMediaId(longValue + "_0", null);
                        return;
                    }
                }
            }
        }
    }

    private void updatePlaybackState(String str) {
        int i;
        int i2;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        long j = playingMessageObject != null ? playingMessageObject.audioProgressSec * 1000 : -1L;
        PlaybackState.Builder actions = new PlaybackState.Builder().setActions(getAvailableActions());
        if (playingMessageObject == null) {
            i = 1;
        } else if (MediaController.getInstance().isDownloadingCurrentMessage()) {
            i = 6;
        } else {
            i = MediaController.getInstance().isMessagePaused() ? 2 : 3;
        }
        if (str != null) {
            actions.setErrorMessage(str);
            i2 = 7;
        } else {
            i2 = i;
        }
        actions.setState(i2, j, 1.0f, SystemClock.elapsedRealtime());
        if (playingMessageObject != null) {
            actions.setActiveQueueItemId(MediaController.getInstance().getPlayingMessageObjectNum());
        } else {
            actions.setActiveQueueItemId(0L);
        }
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession != null) {
            mediaSession.setPlaybackState(actions.build());
        }
    }

    private long getAvailableActions() {
        if (MediaController.getInstance().getPlayingMessageObject() != null) {
            return (MediaController.getInstance().isMessagePaused() ? 3076L : 3078L) | 16 | 32;
        }
        return 3076L;
    }

    public void handleStopRequest(String str) {
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        this.delayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
        updatePlaybackState(str);
        stopSelf();
        this.serviceStarted = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
    }

    public void handlePlayRequest() {
        Bitmap cover;
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        if (!this.serviceStarted) {
            try {
                startService(new Intent(getApplicationContext(), (Class<?>) MusicBrowserService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
            this.serviceStarted = true;
        }
        MediaSession mediaSession = this.mediaSession;
        if (mediaSession == null || !mediaSession.isActive()) {
            createMediaSession();
            this.mediaSession.setActive(true);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null) {
            return;
        }
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        builder.putLong("android.media.metadata.DURATION", (long) (playingMessageObject.getDuration() * 1000.0d));
        builder.putString("android.media.metadata.ARTIST", playingMessageObject.getMusicAuthor());
        builder.putString("android.media.metadata.TITLE", playingMessageObject.getMusicTitle());
        AudioInfo audioInfo = MediaController.getInstance().getAudioInfo();
        if (audioInfo != null && (cover = audioInfo.getCover()) != null) {
            builder.putBitmap("android.media.metadata.ALBUM_ART", cover);
        }
        this.mediaSession.setMetadata(builder.build());
    }

    public void handlePauseRequest() {
        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
        this.delayedStopHandler.removeCallbacksAndMessages(null);
        this.delayedStopHandler.sendEmptyMessageDelayed(0, 30000L);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        updatePlaybackState(null);
        handlePlayRequest();
    }

    public static class DelayedStopHandler extends Handler {
        private final WeakReference<MusicBrowserService> mWeakReference;

        private DelayedStopHandler(MusicBrowserService musicBrowserService) {
            this.mWeakReference = new WeakReference<>(musicBrowserService);
        }

        @Override
        public void handleMessage(Message message) {
            MusicBrowserService musicBrowserService = this.mWeakReference.get();
            if (musicBrowserService != null) {
                if (MediaController.getInstance().getPlayingMessageObject() == null || MediaController.getInstance().isMessagePaused()) {
                    musicBrowserService.stopSelf();
                    musicBrowserService.serviceStarted = false;
                }
            }
        }
    }
}
