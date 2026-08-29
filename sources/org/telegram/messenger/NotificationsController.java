package org.telegram.messenger;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Comparator$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PopupNotificationActivity;
public class NotificationsController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static final String EXTRA_VOICE_REPLY = "extra_voice_reply";
    private static volatile NotificationsController[] Instance = null;
    public static String OTHER_NOTIFICATIONS_CHANNEL = null;
    public static final int SETTING_MUTE_2_DAYS = 2;
    public static final int SETTING_MUTE_8_HOURS = 1;
    public static final int SETTING_MUTE_CUSTOM = 5;
    public static final int SETTING_MUTE_FOREVER = 3;
    public static final int SETTING_MUTE_HOUR = 0;
    public static final int SETTING_MUTE_UNMUTE = 4;
    public static final int SETTING_SOUND_OFF = 1;
    public static final int SETTING_SOUND_ON = 0;
    public static final int TYPE_CHANNEL = 2;
    public static final int TYPE_GROUP = 0;
    public static final int TYPE_PRIVATE = 1;
    public static final int TYPE_REACTIONS_MESSAGES = 4;
    public static final int TYPE_REACTIONS_STORIES = 5;
    public static final int TYPE_STORIES = 3;
    protected static AudioManager audioManager;
    private static final Object[] lockObjects;
    private static e0.n0 notificationManager;
    private static final a0.h sharedPrefCachedKeys;
    private static NotificationManager systemNotificationManager;
    private AlarmManager alarmManager;
    private boolean channelGroupsCreated;
    private Runnable checkStoryPushesRunnable;
    private final ArrayList<MessageObject> delayedPushMessages;
    NotificationsSettingsFacade dialogsNotificationsFacade;
    private final a0.h fcmRandomMessagesDict;
    private Boolean groupsCreated;
    private boolean inChatSoundEnabled;
    private int lastBadgeCount;
    private int lastButtonId;
    public long lastNotificationChannelCreateTime;
    private int lastOnlineFromOtherDevice;
    private long lastSoundOutPlay;
    private long lastSoundPlay;
    private final a0.h lastWearNotifiedMessageId;
    private String launcherClassName;
    private gh.k mediaSpoilerEffect;
    private Runnable notificationDelayRunnable;
    private PowerManager.WakeLock notificationDelayWakelock;
    private String notificationGroup;
    private int notificationId;
    private boolean notifyCheck;
    private long openedDialogId;
    private final HashSet<Long> openedInBubbleDialogs;
    private long openedTopicId;
    private final HashSet<String> pendingVoiceLoads;
    private int personalCount;
    public final ArrayList<MessageObject> popupMessages;
    public ArrayList<MessageObject> popupReplyMessages;
    private final a0.h pushDialogs;
    private final a0.h pushDialogsOverrideMention;
    private final ArrayList<MessageObject> pushMessages;
    private final a0.h pushMessagesDict;
    public boolean showBadgeMessages;
    public boolean showBadgeMuted;
    public boolean showBadgeNumber;
    private final a0.h smartNotificationsDialogs;
    private int soundIn;
    private boolean soundInLoaded;
    private int soundOut;
    private boolean soundOutLoaded;
    private SoundPool soundPool;
    private int soundRecord;
    private boolean soundRecordLoaded;
    char[] spoilerChars;
    private final ArrayList<StoryNotification> storyPushMessages;
    private final a0.h storyPushMessagesDict;
    private int total_unread_count;
    private final a0.h wearNotificationsIds;
    private static final DispatchQueue notificationsQueue = new DispatchQueue("notificationsQueue");
    public static long globalSecretChatId = DialogObject.makeEncryptedDialogId(1);

    public class C1NotificationHolder {
        TLRPC.Chat chat;
        long dialogId;
        int f19625id;
        String name;
        e0.t notification;
        boolean story;
        long topicId;
        TLRPC.User user;
        final String val$chatName;
        final int val$chatType;
        final int val$importance;
        final boolean val$isDefault;
        final boolean val$isInApp;
        final boolean val$isSilent;
        final long val$lastTopicId;
        final int val$ledColor;
        final Uri val$sound;
        final long[] val$vibrationPattern;

        public C1NotificationHolder(int i10, long j10, boolean z10, long j11, String str, TLRPC.User user, TLRPC.Chat chat, e0.t tVar, long j12, String str2, long[] jArr, int i11, Uri uri, int i12, boolean z11, boolean z12, boolean z13, int i13) {
            NotificationsController.this = r1;
            this.val$lastTopicId = j12;
            this.val$chatName = str2;
            this.val$vibrationPattern = jArr;
            this.val$ledColor = i11;
            this.val$sound = uri;
            this.val$importance = i12;
            this.val$isDefault = z11;
            this.val$isInApp = z12;
            this.val$isSilent = z13;
            this.val$chatType = i13;
            this.f19625id = i10;
            this.name = str;
            this.user = user;
            this.chat = chat;
            this.notification = tVar;
            this.dialogId = j10;
            this.story = z10;
            this.topicId = j11;
        }

        public void call() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("show dialog notification with id " + this.f19625id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.d(this.f19625id, this.notification.b());
            } catch (SecurityException e10) {
                FileLog.e(e10);
                NotificationsController.this.resetNotificationSound(this.notification, this.dialogId, this.val$lastTopicId, this.val$chatName, this.val$vibrationPattern, this.val$ledColor, this.val$sound, this.val$importance, this.val$isDefault, this.val$isInApp, this.val$isSilent, this.val$chatType);
            }
        }
    }

    public static class DialogKey {
        final long dialogId;
        final boolean story;
        final long topicId;

        private DialogKey(long j10, long j11, boolean z10) {
            this.dialogId = j10;
            this.topicId = j11;
            this.story = z10;
        }
    }

    public static class StoryNotification {
        public long date;
        final HashMap<Integer, Pair<Long, Long>> dateByIds;
        final long dialogId;
        boolean hidden;
        String localName;

        public StoryNotification(long j10, String str, int i10, long j11) {
            this(j10, str, i10, j11, j11 + 86400000);
        }

        public long getLeastDate() {
            long j10 = -1;
            for (Pair<Long, Long> pair : this.dateByIds.values()) {
                if (j10 == -1 || j10 > ((Long) pair.first).longValue()) {
                    j10 = ((Long) pair.first).longValue();
                }
            }
            return j10;
        }

        public StoryNotification(long j10, String str, int i10, long j11, long j12) {
            HashMap<Integer, Pair<Long, Long>> hashMap = new HashMap<>();
            this.dateByIds = hashMap;
            this.dialogId = j10;
            this.localName = str;
            hashMap.put(Integer.valueOf(i10), new Pair<>(Long.valueOf(j11), Long.valueOf(j12)));
            this.date = j11;
        }
    }

    static {
        notificationManager = null;
        systemNotificationManager = null;
        if (Build.VERSION.SDK_INT >= 26 && ApplicationLoader.applicationContext != null) {
            notificationManager = new e0.n0(ApplicationLoader.applicationContext);
            systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
            checkOtherNotificationsChannel();
        }
        audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        Instance = new NotificationsController[4];
        lockObjects = new Object[4];
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
        sharedPrefCachedKeys = new a0.h();
    }

    public NotificationsController(int i10) {
        super(i10);
        Object valueOf;
        this.pushMessages = new ArrayList<>();
        this.delayedPushMessages = new ArrayList<>();
        this.pushMessagesDict = new a0.h();
        this.fcmRandomMessagesDict = new a0.h();
        this.smartNotificationsDialogs = new a0.h();
        this.pushDialogs = new a0.h();
        this.wearNotificationsIds = new a0.h();
        this.lastWearNotifiedMessageId = new a0.h();
        this.pushDialogsOverrideMention = new a0.h();
        this.pendingVoiceLoads = new HashSet<>();
        this.popupMessages = new ArrayList<>();
        this.popupReplyMessages = new ArrayList<>();
        this.openedInBubbleDialogs = new HashSet<>();
        this.storyPushMessages = new ArrayList<>();
        this.storyPushMessagesDict = new a0.h();
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.lastButtonId = 5000;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.notifyCheck = false;
        this.lastOnlineFromOtherDevice = 0;
        this.lastBadgeCount = -1;
        this.mediaSpoilerEffect = new gh.k();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new ah(this, 7);
        this.notificationId = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i11 = this.currentAccount;
        if (i11 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i11);
        }
        sb2.append(valueOf);
        this.notificationGroup = sb2.toString();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        this.inChatSoundEnabled = notificationsSettings.getBoolean("EnableInChatSound", true);
        this.showBadgeNumber = notificationsSettings.getBoolean("badgeNumber", true);
        this.showBadgeMuted = notificationsSettings.getBoolean("badgeNumberMuted", false);
        this.showBadgeMessages = notificationsSettings.getBoolean("badgeNumberMessages", true);
        notificationManager = new e0.n0(ApplicationLoader.applicationContext);
        systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
        try {
            audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            this.alarmManager = (AlarmManager) ApplicationLoader.applicationContext.getSystemService("alarm");
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.notificationDelayWakelock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        this.notificationDelayRunnable = new ah(this, 8);
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new ah(this, 9));
    }

    private int addToPopupMessages(java.util.ArrayList<org.telegram.messenger.MessageObject> r4, org.telegram.messenger.MessageObject r5, long r6, boolean r8, android.content.SharedPreferences r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.addToPopupMessages(java.util.ArrayList, org.telegram.messenger.MessageObject, long, boolean, android.content.SharedPreferences):int");
    }

    private void appendMessage(MessageObject messageObject) {
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            if (this.pushMessages.get(i10).getId() == messageObject.getId() && this.pushMessages.get(i10).getDialogId() == messageObject.getDialogId() && this.pushMessages.get(i10).isStoryPush == messageObject.isStoryPush) {
                return;
            }
        }
        this.pushMessages.add(0, messageObject);
    }

    public static void checkOtherNotificationsChannel() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (OTHER_NOTIFICATIONS_CHANNEL == null) {
                sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
                OTHER_NOTIFICATIONS_CHANNEL = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = systemNotificationManager.getNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    systemNotificationManager.deleteNotificationChannel(OTHER_NOTIFICATIONS_CHANNEL);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                OTHER_NOTIFICATIONS_CHANNEL = null;
                notificationChannel = null;
            }
            if (OTHER_NOTIFICATIONS_CHANNEL == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
                }
                OTHER_NOTIFICATIONS_CHANNEL = "Other" + Utilities.random.nextLong();
                sharedPreferences.edit().putString("OtherKey", OTHER_NOTIFICATIONS_CHANNEL).commit();
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(OTHER_NOTIFICATIONS_CHANNEL, "Internal notifications", 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    systemNotificationManager.createNotificationChannel(notificationChannel2);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    public void checkStoryPushes() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.storyPushMessages.size()) {
            StoryNotification storyNotification = this.storyPushMessages.get(i10);
            Iterator<Map.Entry<Integer, Pair<Long, Long>>> it = storyNotification.dateByIds.entrySet().iterator();
            while (it.hasNext()) {
                if (currentTimeMillis >= ((Long) it.next().getValue().second).longValue()) {
                    it.remove();
                    z10 = true;
                }
            }
            if (z10) {
                if (storyNotification.dateByIds.isEmpty()) {
                    getMessagesStorage().deleteStoryPushMessage(storyNotification.dialogId);
                    this.storyPushMessages.remove(i10);
                    i10--;
                } else {
                    getMessagesStorage().putStoryPushMessage(storyNotification);
                }
            }
            i10++;
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
        updateStoryPushesRunnable();
    }

    private java.lang.String createNotificationShortcut(e0.t r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.p0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.createNotificationShortcut(e0.t, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.p0, boolean):java.lang.String");
    }

    private String cutLastName(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, indexOf));
            String str2 = "…";
            if (!str.endsWith("…")) {
                str2 = "";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        return str;
    }

    public void lambda$deleteNotificationChannel$42(long j10, long j11, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
                SharedPreferences.Editor edit = notificationsSettings.edit();
                if (i10 == 0 || i10 == -1) {
                    String str = "org.telegram.key" + j10;
                    if (j11 != 0) {
                        str = str + ".topic" + j11;
                    }
                    String string = notificationsSettings.getString(str, null);
                    if (string != null) {
                        edit.remove(str).remove(str + "_s");
                        try {
                            systemNotificationManager.deleteNotificationChannel(string);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel internal ".concat(string));
                        }
                    }
                }
                if (i10 == 1 || i10 == -1) {
                    String str2 = "org.telegram.keyia" + j10;
                    String string2 = notificationsSettings.getString(str2, null);
                    if (string2 != null) {
                        edit.remove(str2).remove(str2 + "_s");
                        try {
                            systemNotificationManager.deleteNotificationChannel(string2);
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel internal ".concat(string2));
                        }
                    }
                }
                edit.commit();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
    }

    private void dismissNotification() {
        FileLog.d("NotificationsController dismissNotification");
        try {
            notificationManager.b(this.notificationId);
            this.pushMessages.clear();
            this.pushMessagesDict.b();
            this.lastWearNotifiedMessageId.b();
            for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
                if (!this.openedInBubbleDialogs.contains(Long.valueOf(this.wearNotificationsIds.j(i10)))) {
                    notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue());
                }
            }
            this.wearNotificationsIds.b();
            AndroidUtilities.runOnUIThread(new w1(17));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static String getGlobalNotificationsKey(int i10) {
        if (i10 == 0) {
            return "EnableGroup2";
        }
        if (i10 == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    private TLRPC.NotificationSound getInputSound(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j10 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j10 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f22517id = j10;
            return tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                return new TLRPC.TL_notificationSoundNone();
            }
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
            tL_notificationSoundLocal.data = string;
            return tL_notificationSoundLocal;
        } else {
            return new TLRPC.TL_notificationSoundDefault();
        }
    }

    public static NotificationsController getInstance(int i10) {
        NotificationsController notificationsController;
        NotificationsController notificationsController2 = Instance[i10];
        if (notificationsController2 == null) {
            synchronized (lockObjects[i10]) {
                try {
                    notificationsController = Instance[i10];
                    if (notificationsController == null) {
                        NotificationsController[] notificationsControllerArr = Instance;
                        NotificationsController notificationsController3 = new NotificationsController(i10);
                        notificationsControllerArr[i10] = notificationsController3;
                        notificationsController = notificationsController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return notificationsController;
        }
        return notificationsController2;
    }

    private int getNotifyOverride(SharedPreferences sharedPreferences, long j10, long j11) {
        int property = this.dialogsNotificationsFacade.getProperty("notify2_", j10, j11, -1);
        if (property == 3 && this.dialogsNotificationsFacade.getProperty("notifyuntil_", j10, j11, 0) >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return property;
    }

    public static String getSharedPrefKey(long j10, long j11) {
        return getSharedPrefKey(j10, j11, false);
    }

    private String getStringForMessage(MessageObject messageObject, boolean z10, boolean[] zArr, boolean[] zArr2) {
        long j10;
        String string;
        TLRPC.Chat chat;
        char c3;
        char c6;
        char c10;
        boolean z11;
        String formatString;
        if (!AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            if (!messageObject.isStoryPush && !messageObject.isStoryMentionPush) {
                TLRPC.Message message = messageObject.messageOwner;
                long j11 = message.dialog_id;
                TLRPC.Peer peer = message.peer_id;
                long j12 = peer.chat_id;
                if (j12 == 0) {
                    j12 = peer.channel_id;
                }
                long j13 = peer.user_id;
                if (zArr2 != null) {
                    zArr2[0] = true;
                }
                if (messageObject.getDialogId() == 489000 && messageObject.getForwardedFromId() != null) {
                    j13 = messageObject.getForwardedFromId().longValue();
                    j12 = j13 < 0 ? -j13 : 0L;
                }
                SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
                boolean v = x3.v("content_preview_", j11, notificationsSettings, true);
                if (messageObject.isFcmMessage()) {
                    int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    if (i10 == 0 && j13 != 0) {
                        if (!v || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                            if (zArr2 != null) {
                                zArr2[0] = false;
                            }
                            return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
                        }
                    } else if (i10 != 0 && (!v || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                        if (zArr2 != null) {
                            zArr2[0] = false;
                        }
                        return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                    }
                    zArr[0] = true;
                    return (String) messageObject.messageText;
                }
                long clientUserId = getUserConfig().getClientUserId();
                if (j13 == 0) {
                    j13 = messageObject.getFromChatId();
                    if (j13 == 0) {
                        j13 = -j12;
                    }
                } else if (j13 == clientUserId) {
                    j13 = messageObject.getFromChatId();
                }
                if (j11 == 0) {
                    if (j12 != 0) {
                        j11 = -j12;
                    } else if (j13 != 0) {
                        j11 = j13;
                    }
                }
                if (messageObject.getDialogId() == 489001 || messageObject.isOauthPush) {
                    j10 = j11;
                    string = LocaleController.getString(R.string.BotAuthNotificationTitle);
                } else if (j13 > 0) {
                    if (!messageObject.messageOwner.from_scheduled) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j13));
                        string = user != null ? UserObject.getUserName(user) : null;
                    } else if (j11 == clientUserId) {
                        string = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                    } else {
                        string = LocaleController.getString(R.string.NotificationMessageScheduledName);
                    }
                    j10 = j11;
                } else {
                    j10 = j11;
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j13));
                    string = chat2 != null ? getTitle(chat2) : null;
                }
                if (string == null) {
                    return null;
                }
                int i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                if (i11 != 0) {
                    chat = getMessagesController().getChat(Long.valueOf(j12));
                    if (chat == null) {
                        return null;
                    }
                } else {
                    chat = null;
                }
                if (DialogObject.isEncryptedDialog(j10)) {
                    return LocaleController.getString(R.string.YouHaveNewMessage);
                }
                if (i11 != 0 || j13 == 0) {
                    if (i11 != 0) {
                        boolean z12 = ChatObject.isChannel(chat) && !chat.megagroup;
                        if (!v || ((z12 || !notificationsSettings.getBoolean("EnablePreviewGroup", true)) && !(z12 && notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
                            if (zArr2 != null) {
                                zArr2[0] = false;
                            }
                            return (!ChatObject.isChannel(chat) || chat.megagroup) ? (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) ? LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string) : LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.ChannelMessageNoText, string);
                        }
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 instanceof TLRPC.TL_messageService) {
                            TLRPC.MessageAction messageAction = message2.action;
                            if (messageAction instanceof TLRPC.TL_messageActionChatAddUser) {
                                long j14 = messageAction.user_id;
                                if (j14 == 0 && messageAction.users.size() == 1) {
                                    j14 = messageObject.messageOwner.action.users.get(0).longValue();
                                }
                                if (j14 != 0) {
                                    if (messageObject.messageOwner.peer_id.channel_id == 0 || chat.megagroup) {
                                        if (j14 == clientUserId) {
                                            return LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                                        }
                                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j14));
                                        if (user2 == null) {
                                            return null;
                                        }
                                        return j13 == user2.f22539id ? chat.megagroup ? LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user2));
                                    }
                                    return LocaleController.formatString(R.string.ChannelAddedByNotification, string, getTitle(chat));
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i12 = 0; i12 < messageObject.messageOwner.action.users.size(); i12++) {
                                    TLRPC.User user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i12));
                                    if (user3 != null) {
                                        String userName = UserObject.getUserName(user3);
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(userName);
                                    }
                                }
                                return LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), sb2.toString());
                            } else if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                                return messageAction.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, string, getTitle(chat));
                            } else if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                return messageObject.messageText.toString();
                            } else {
                                if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                    long j15 = messageAction.user_id;
                                    if (j15 == 0 && messageAction.users.size() == 1) {
                                        j15 = messageObject.messageOwner.action.users.get(0).longValue();
                                    }
                                    if (j15 != 0) {
                                        if (j15 == clientUserId) {
                                            return LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, string, getTitle(chat));
                                        }
                                        TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j15));
                                        if (user4 == null) {
                                            return null;
                                        }
                                        return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), UserObject.getUserName(user4));
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i13 = 0; i13 < messageObject.messageOwner.action.users.size(); i13++) {
                                        TLRPC.User user5 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i13));
                                        if (user5 != null) {
                                            String userName2 = UserObject.getUserName(user5);
                                            if (sb3.length() != 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(userName2);
                                        }
                                    }
                                    return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), sb3.toString());
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                                    String title = chat3 == null ? null : getTitle(chat3);
                                    return title == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
                                } else if (messageAction instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                    return LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, string, getTitle(chat));
                                } else {
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditTitle) {
                                        return LocaleController.formatString(R.string.NotificationEditedGroupName, string, messageAction.title);
                                    }
                                    if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                                        return messageObject.messageText.toString();
                                    }
                                    if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                        return messageObject.messageText.toString();
                                    }
                                    if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                                        return (message2.peer_id.channel_id == 0 || chat.megagroup) ? messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat)) : messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat)) : LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                        long j16 = messageAction.user_id;
                                        if (j16 == clientUserId) {
                                            return LocaleController.formatString(R.string.NotificationGroupKickYou, string, getTitle(chat));
                                        }
                                        if (j16 == j13) {
                                            return LocaleController.formatString(R.string.NotificationGroupLeftMember, string, getTitle(chat));
                                        }
                                        TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                                        if (user6 == null) {
                                            return null;
                                        }
                                        return LocaleController.formatString(R.string.NotificationGroupKickMember, string, getTitle(chat), UserObject.getUserName(user6));
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatCreate) {
                                        return messageObject.messageText.toString();
                                    } else {
                                        if (messageAction instanceof TLRPC.TL_messageActionChannelCreate) {
                                            return messageObject.messageText.toString();
                                        }
                                        if (messageAction instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                            return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, getTitle(chat));
                                        }
                                        if (messageAction instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                            return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, messageAction.title);
                                        }
                                        if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                            return messageObject.messageText.toString();
                                        }
                                        if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                                MessageObject messageObject2 = messageObject.replyMessageObject;
                                                if (messageObject2 == null) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                                                }
                                                if (messageObject2.isMusic()) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedMusicChannel, getTitle(chat));
                                                }
                                                if (messageObject2.isVideo()) {
                                                    if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                                        return LocaleController.formatString(R.string.NotificationActionPinnedVideoChannel, getTitle(chat));
                                                    }
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📹 " + messageObject2.messageOwner.message);
                                                } else if (messageObject2.isGif()) {
                                                    if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                                        return LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                                                    }
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject2.messageOwner.message);
                                                } else if (messageObject2.isVoice()) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                                                } else {
                                                    if (messageObject2.isRoundVideo()) {
                                                        return LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                                                    }
                                                    if (!messageObject2.isSticker() && !messageObject2.isAnimatedSticker()) {
                                                        TLRPC.Message message3 = messageObject2.messageOwner;
                                                        TLRPC.MessageMedia messageMedia = message3.media;
                                                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                            if (TextUtils.isEmpty(message3.message)) {
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                                                            }
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject2.messageOwner.message);
                                                        } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                                                        } else {
                                                            if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                                                            }
                                                            if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                                                TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                                                            } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                                                return tL_messageMediaPoll.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                                            } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                                            } else {
                                                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                                                    if (TextUtils.isEmpty(message3.message)) {
                                                                        return LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                                                                    }
                                                                    return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject2.messageOwner.message);
                                                                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                                    return LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                                                                } else {
                                                                    CharSequence charSequence = messageObject2.messageText;
                                                                    if (charSequence == null || charSequence.length() <= 0) {
                                                                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                                                                    }
                                                                    CharSequence charSequence2 = messageObject2.messageText;
                                                                    if (charSequence2.length() > 20) {
                                                                        StringBuilder sb4 = new StringBuilder();
                                                                        c6 = 0;
                                                                        sb4.append((Object) charSequence2.subSequence(0, 20));
                                                                        sb4.append("...");
                                                                        charSequence2 = sb4.toString();
                                                                    } else {
                                                                        c6 = 0;
                                                                    }
                                                                    int i14 = R.string.NotificationActionPinnedTextChannel;
                                                                    Object[] objArr = new Object[2];
                                                                    objArr[c6] = getTitle(chat);
                                                                    objArr[1] = charSequence2;
                                                                    return LocaleController.formatString(i14, objArr);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    String stickerEmoji = messageObject2.getStickerEmoji();
                                                    return stickerEmoji != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji) : LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                                                }
                                            }
                                            MessageObject messageObject3 = messageObject.replyMessageObject;
                                            if (messageObject3 == null) {
                                                return LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                                            }
                                            if (messageObject3.isMusic()) {
                                                return LocaleController.formatString(R.string.NotificationActionPinnedMusic, string, getTitle(chat));
                                            }
                                            if (messageObject3.isVideo()) {
                                                if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedVideo, string, getTitle(chat));
                                                }
                                                return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📹 " + messageObject3.messageOwner.message, getTitle(chat));
                                            } else if (messageObject3.isGif()) {
                                                if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedGif, string, getTitle(chat));
                                                }
                                                return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🎬 " + messageObject3.messageOwner.message, getTitle(chat));
                                            } else if (messageObject3.isVoice()) {
                                                return LocaleController.formatString(R.string.NotificationActionPinnedVoice, string, getTitle(chat));
                                            } else {
                                                if (messageObject3.isRoundVideo()) {
                                                    return LocaleController.formatString(R.string.NotificationActionPinnedRound, string, getTitle(chat));
                                                }
                                                if (!messageObject3.isSticker() && !messageObject3.isAnimatedSticker()) {
                                                    TLRPC.Message message4 = messageObject3.messageOwner;
                                                    TLRPC.MessageMedia messageMedia2 = message4.media;
                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                                        if (TextUtils.isEmpty(message4.message)) {
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedFile, string, getTitle(chat));
                                                        }
                                                        return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📎 " + messageObject3.messageOwner.message, getTitle(chat));
                                                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                                                        return LocaleController.formatString(R.string.NotificationActionPinnedGeo, string, getTitle(chat));
                                                    } else {
                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, string, getTitle(chat));
                                                        }
                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                                                            TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                            return tL_messageMediaPoll2.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, string, getTitle(chat), tL_messageMediaPoll2.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPoll2, string, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                            return LocaleController.formatString(R.string.NotificationActionPinnedTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                                                        } else {
                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                                if (TextUtils.isEmpty(message4.message)) {
                                                                    return LocaleController.formatString(R.string.NotificationActionPinnedPhoto, string, getTitle(chat));
                                                                }
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🖼 " + messageObject3.messageOwner.message, getTitle(chat));
                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                return LocaleController.formatString(R.string.NotificationActionPinnedGame, string, getTitle(chat));
                                                            } else {
                                                                CharSequence charSequence3 = messageObject3.messageText;
                                                                if (charSequence3 == null || charSequence3.length() <= 0) {
                                                                    return LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                                                                }
                                                                CharSequence charSequence4 = messageObject3.messageText;
                                                                if (charSequence4.length() > 20) {
                                                                    StringBuilder sb5 = new StringBuilder();
                                                                    c3 = 0;
                                                                    sb5.append((Object) charSequence4.subSequence(0, 20));
                                                                    sb5.append("...");
                                                                    charSequence4 = sb5.toString();
                                                                } else {
                                                                    c3 = 0;
                                                                }
                                                                int i15 = R.string.NotificationActionPinnedText;
                                                                String title2 = getTitle(chat);
                                                                Object[] objArr2 = new Object[3];
                                                                objArr2[c3] = string;
                                                                objArr2[1] = charSequence4;
                                                                objArr2[2] = title2;
                                                                return LocaleController.formatString(i15, objArr2);
                                                            }
                                                        }
                                                    }
                                                }
                                                String stickerEmoji2 = messageObject3.getStickerEmoji();
                                                return stickerEmoji2 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, string, getTitle(chat), stickerEmoji2) : LocaleController.formatString(R.string.NotificationActionPinnedSticker, string, getTitle(chat));
                                            }
                                        } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                            return messageObject.messageText.toString();
                                        } else {
                                            if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                                                String f9 = kf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                                                return TextUtils.isEmpty(f9) ? j10 == clientUserId ? LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, string, f9) : j10 == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, f9) : LocaleController.formatString(R.string.ChatThemeChangedTo, string, f9);
                                            } else if (messageAction instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                                return messageObject.messageText.toString();
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            if (messageObject.isMediaEmpty()) {
                                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                                }
                                String formatString2 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                                zArr[0] = true;
                                return formatString2;
                            } else if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                return LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                            } else {
                                TLRPC.Message message5 = messageObject.messageOwner;
                                if (message5.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (z10 || TextUtils.isEmpty(message5.message)) {
                                        return LocaleController.formatString(R.string.ChannelMessagePhoto, string);
                                    }
                                    String formatString3 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString3;
                                } else if (messageObject.isVideo()) {
                                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                        return LocaleController.formatString(R.string.ChannelMessageVideo, string);
                                    }
                                    String formatString4 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return formatString4;
                                } else if (messageObject.isVoice()) {
                                    return LocaleController.formatString(R.string.ChannelMessageAudio, string);
                                } else {
                                    if (messageObject.isRoundVideo()) {
                                        return LocaleController.formatString(R.string.ChannelMessageRound, string);
                                    }
                                    if (messageObject.isMusic()) {
                                        return LocaleController.formatString(R.string.ChannelMessageMusic, string);
                                    }
                                    TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
                                    if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                                        TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageMedia3;
                                        return LocaleController.formatString(R.string.ChannelMessageContact2, string, ContactsController.formatName(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia3).poll;
                                        return poll.quiz ? LocaleController.formatString(R.string.ChannelMessageQuiz2, string, poll.question.text) : LocaleController.formatString(R.string.ChannelMessagePoll2, string, poll.question.text);
                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                                        return LocaleController.formatString(R.string.ChannelMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                                    } else {
                                        if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveaway) {
                                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
                                            return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                                        } else if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                                            return LocaleController.formatString(R.string.ChannelMessageMap, string);
                                        } else {
                                            if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                return LocaleController.formatString(R.string.ChannelMessageLiveLocation, string);
                                            }
                                            if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                                if (!messageObject.isSticker() && !messageObject.isAnimatedSticker()) {
                                                    if (messageObject.isGif()) {
                                                        if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                            return LocaleController.formatString(R.string.ChannelMessageGIF, string);
                                                        }
                                                        String formatString5 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                                                        zArr[0] = true;
                                                        return formatString5;
                                                    } else if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                        return LocaleController.formatString(R.string.ChannelMessageDocument, string);
                                                    } else {
                                                        String formatString6 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                                                        zArr[0] = true;
                                                        return formatString6;
                                                    }
                                                }
                                                String stickerEmoji3 = messageObject.getStickerEmoji();
                                                return stickerEmoji3 != null ? LocaleController.formatString(R.string.ChannelMessageStickerEmoji, string, stickerEmoji3) : LocaleController.formatString(R.string.ChannelMessageSticker, string);
                                            } else if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                                                return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                                            } else {
                                                String formatString7 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                                                zArr[0] = true;
                                                return formatString7;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (messageObject.isMediaEmpty()) {
                            return (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageOwner.message);
                        } else if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            return LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string, getTitle(chat));
                        } else {
                            TLRPC.Message message6 = messageObject.messageOwner;
                            if (message6.media instanceof TLRPC.TL_messageMediaPhoto) {
                                if (z10 || TextUtils.isEmpty(message6.message)) {
                                    return LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                            } else if (messageObject.isVideo()) {
                                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    return LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                            } else if (messageObject.isVoice()) {
                                return LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                            } else {
                                if (messageObject.isRoundVideo()) {
                                    return LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                }
                                if (messageObject.isMusic()) {
                                    return LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                }
                                TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                                if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                                    TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageMedia4;
                                    return LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                                } else if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia4;
                                    return tL_messageMediaPoll3.poll.quiz ? LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text) : LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                                } else if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                                    return LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                                } else {
                                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGame) {
                                        return LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                    }
                                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGiveaway) {
                                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia4;
                                        return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                                    } else if (messageMedia4 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                        return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                    } else {
                                        if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                                            return LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, string, getTitle(chat));
                                        }
                                        if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                                            return LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, string, getTitle(chat));
                                        }
                                        if (!(messageMedia4 instanceof TLRPC.TL_messageMediaDocument)) {
                                            return (z10 || TextUtils.isEmpty(messageObject.messageText)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageText);
                                        } else if (!messageObject.isSticker() && !messageObject.isAnimatedSticker()) {
                                            if (messageObject.isGif()) {
                                                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                    return LocaleController.formatString(R.string.NotificationMessageGroupGif, string, getTitle(chat));
                                                }
                                                return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                                            } else if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                return LocaleController.formatString(R.string.NotificationMessageGroupDocument, string, getTitle(chat));
                                            } else {
                                                return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📎 " + messageObject.messageOwner.message);
                                            }
                                        } else {
                                            String stickerEmoji4 = messageObject.getStickerEmoji();
                                            return stickerEmoji4 != null ? LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, string, getTitle(chat), stickerEmoji4) : LocaleController.formatString(R.string.NotificationMessageGroupSticker, string, getTitle(chat));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (!v || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                } else {
                    TLRPC.Message message7 = messageObject.messageOwner;
                    if (message7 instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction2 = message7.action;
                        if (!(messageAction2 instanceof TLRPC.TL_messageActionChangeCreator) && !(messageAction2 instanceof TLRPC.TL_messageActionNewCreatorPending)) {
                            if (messageAction2 instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                return LocaleController.getString(R.string.WallpaperSameNotification);
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                return LocaleController.getString(R.string.WallpaperNotification);
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                return messageObject.messageText.toString();
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                return messageObject.messageText.toString();
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                return messageObject.messageText.toString();
                            }
                            if ((messageAction2 instanceof TLRPC.TL_messageActionUserJoined) || (messageAction2 instanceof TLRPC.TL_messageActionContactSignUp)) {
                                return LocaleController.formatString(R.string.NotificationContactJoined, string);
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                return LocaleController.formatString(R.string.NotificationContactNewPhoto, string);
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                String formatString8 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(messageObject.messageOwner.date * 1000), LocaleController.getInstance().getFormatterDay().format(messageObject.messageOwner.date * 1000));
                                int i16 = R.string.NotificationUnrecognizedDevice;
                                String str = getUserConfig().getCurrentUser().first_name;
                                TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                                return LocaleController.formatString(i16, str, formatString8, messageAction3.title, messageAction3.address);
                            } else if (!(messageAction2 instanceof TLRPC.TL_messageActionGameScore) && !(messageAction2 instanceof TLRPC.TL_messageActionPaymentSent) && !(messageAction2 instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGift) && !(messageAction2 instanceof TLRPC.TL_messageActionGiftPremium) && !(messageAction2 instanceof TLRPC.TL_messageActionGiftTon)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        return messageObject.messageText.toString();
                                    }
                                    if (messageAction2 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                        return messageObject.messageText.toString();
                                    }
                                    if (!(messageAction2 instanceof TLRPC.TL_messageActionPaidMessagesRefunded) && !(messageAction2 instanceof TLRPC.TL_messageActionPaidMessagesPrice)) {
                                        if (messageAction2 instanceof TLRPC.TL_messageActionPhoneCall) {
                                            if (messageAction2.video) {
                                                return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                                            }
                                            return LocaleController.getString(R.string.CallMessageIncomingMissed);
                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                                            if (messageAction2.video) {
                                                return LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed);
                                            }
                                            return LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                            String f10 = kf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme);
                                            if (!TextUtils.isEmpty(f10)) {
                                                c10 = 0;
                                                z11 = true;
                                                if (j10 == clientUserId) {
                                                    formatString = LocaleController.formatString(R.string.ChatThemeChangedYou, f10);
                                                } else {
                                                    formatString = LocaleController.formatString(R.string.ChatThemeChangedTo, string, f10);
                                                }
                                            } else if (j10 == clientUserId) {
                                                c10 = 0;
                                                formatString = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                                                z11 = true;
                                            } else {
                                                c10 = 0;
                                                z11 = true;
                                                formatString = LocaleController.formatString(R.string.ChatThemeDisabled, string, f10);
                                            }
                                            zArr[c10] = z11;
                                            return formatString;
                                        }
                                    } else {
                                        return messageObject.messageText.toString();
                                    }
                                } else {
                                    return messageObject.messageText.toString();
                                }
                            } else {
                                return messageObject.messageText.toString();
                            }
                        } else {
                            return messageObject.messageText.toString();
                        }
                    } else if (messageObject.isMediaEmpty()) {
                        if (!z10 && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            String formatString9 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString9;
                        }
                        return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                    } else {
                        TLRPC.Message message8 = messageObject.messageOwner;
                        if (message8.media instanceof TLRPC.TL_messageMediaPhoto) {
                            if (z10 || TextUtils.isEmpty(message8.message)) {
                                return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDPhoto, string) : LocaleController.formatString(R.string.NotificationMessagePhoto, string);
                            }
                            String formatString10 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString10;
                        } else if (messageObject.isVideo()) {
                            if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDVideo, string) : LocaleController.formatString(R.string.NotificationMessageVideo, string);
                            }
                            String formatString11 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return formatString11;
                        } else if (messageObject.isGame()) {
                            return LocaleController.formatString(R.string.NotificationMessageGame, string, messageObject.messageOwner.media.game.title);
                        } else {
                            if (messageObject.isVoice()) {
                                return LocaleController.formatString(R.string.NotificationMessageAudio, string);
                            }
                            if (messageObject.isRoundVideo()) {
                                return LocaleController.formatString(R.string.NotificationMessageRound, string);
                            }
                            if (messageObject.isMusic()) {
                                return LocaleController.formatString(R.string.NotificationMessageMusic, string);
                            }
                            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
                            if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                                TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageMedia5;
                                return LocaleController.formatString(R.string.NotificationMessageContact2, string, ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                            } else if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveaway) {
                                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia5;
                                return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, string, Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                            } else if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                            } else {
                                if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                                    TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia5).poll;
                                    return poll2.quiz ? LocaleController.formatString(R.string.NotificationMessageQuiz2, string, poll2.question.text) : LocaleController.formatString(R.string.NotificationMessagePoll2, string, poll2.question.text);
                                } else if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                                    return LocaleController.formatString(R.string.NotificationMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                                } else {
                                    if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                                        return LocaleController.formatString(R.string.NotificationMessageMap, string);
                                    }
                                    if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                                        return LocaleController.formatString(R.string.NotificationMessageLiveLocation, string);
                                    }
                                    if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                                        if (!messageObject.isSticker() && !messageObject.isAnimatedSticker()) {
                                            if (messageObject.isGif()) {
                                                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                    return LocaleController.formatString(R.string.NotificationMessageGif, string);
                                                }
                                                String formatString12 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                                                zArr[0] = true;
                                                return formatString12;
                                            } else if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                return LocaleController.formatString(R.string.NotificationMessageDocument, string);
                                            } else {
                                                String formatString13 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                                                zArr[0] = true;
                                                return formatString13;
                                            }
                                        }
                                        String stickerEmoji5 = messageObject.getStickerEmoji();
                                        return stickerEmoji5 != null ? LocaleController.formatString(R.string.NotificationMessageStickerEmoji, string, stickerEmoji5) : LocaleController.formatString(R.string.NotificationMessageSticker, string);
                                    } else if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                                        return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                                    } else {
                                        String formatString14 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                                        zArr[0] = true;
                                        return formatString14;
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
            return "!" + messageObject.messageOwner.message;
        }
        return LocaleController.getString(R.string.YouHaveNewMessage);
    }

    private String getTitle(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return yf.d.i(chat, this.currentAccount, false);
        }
        return chat.title;
    }

    private int getTotalAllUnreadCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (UserConfig.getInstance(i11).isClientActivated() && (SharedConfig.showNotificationsForAllAccounts || UserConfig.selectedAccount == i11)) {
                NotificationsController notificationsController = getInstance(i11);
                if (notificationsController.showBadgeNumber) {
                    if (notificationsController.showBadgeMessages) {
                        if (notificationsController.showBadgeMuted) {
                            try {
                                ArrayList arrayList = new ArrayList(MessagesController.getInstance(i11).allDialogs);
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                                    if (dialog != null && DialogObject.isChatDialog(dialog.f22396id)) {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialog.f22396id));
                                        if (!ChatObject.isNotInChat(chat)) {
                                            if (ChatObject.isCommunity(chat)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i10 += MessagesController.getInstance(i11).getDialogUnreadCount(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        } else {
                            i10 += notificationsController.total_unread_count;
                        }
                    } else if (notificationsController.showBadgeMuted) {
                        try {
                            int size2 = MessagesController.getInstance(i11).allDialogs.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                TLRPC.Dialog dialog2 = MessagesController.getInstance(i11).allDialogs.get(i13);
                                if (DialogObject.isChatDialog(dialog2.f22396id)) {
                                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-dialog2.f22396id));
                                    if (!ChatObject.isNotInChat(chat2)) {
                                        if (ChatObject.isCommunity(chat2)) {
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i11).getDialogUnreadCount(dialog2) != 0) {
                                    i10++;
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    } else {
                        i10 += notificationsController.pushDialogs.m();
                    }
                }
            }
        }
        return i10;
    }

    private boolean isEmptyVibration(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPersonalMessage(MessageObject messageObject) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || messageObject.isStoryReactionPush) {
            return true;
        }
        return false;
    }

    private boolean isSilentMessage(MessageObject messageObject) {
        if (!messageObject.messageOwner.silent && !messageObject.isReactionPush) {
            return false;
        }
        return true;
    }

    public void lambda$cleanup$2() {
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.pushMessages.clear();
        this.pushMessagesDict.b();
        this.fcmRandomMessagesDict.b();
        this.pushDialogs.b();
        this.wearNotificationsIds.b();
        this.lastWearNotifiedMessageId.b();
        this.openedInBubbleDialogs.clear();
        this.delayedPushMessages.clear();
        this.notifyCheck = false;
        this.lastBadgeCount = 0;
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        dismissNotification();
        setBadge(getTotalAllUnreadCount());
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                systemNotificationManager.deleteNotificationChannelGroup("channels" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("groups" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("private" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("stories" + this.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("other" + this.currentAccount);
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String id2 = yg.a(notificationChannels.get(i10)).getId();
                    if (id2.startsWith(str)) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public void lambda$deleteAllNotificationChannels$44() {
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            Map<String, ?> all = notificationsSettings.getAll();
            SharedPreferences.Editor edit = notificationsSettings.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        systemNotificationManager.deleteNotificationChannel(str);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$didReceivedNotification$38(String str) {
        if (this.pendingVoiceLoads.remove(str)) {
            showOrUpdateNotification(true);
        }
    }

    public static void lambda$dismissNotification$37() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$forceShowPopupForReply$6(ArrayList arrayList) {
        this.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void lambda$forceShowPopupForReply$7() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            MessageObject messageObject = this.pushMessages.get(i10);
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup())) {
                arrayList.add(0, messageObject);
            }
        }
        if (!arrayList.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new bh(this, arrayList, 2));
        }
    }

    public void lambda$hideNotifications$36() {
        notificationManager.b(this.notificationId);
        this.lastWearNotifiedMessageId.b();
        for (int i10 = 0; i10 < this.wearNotificationsIds.m(); i10++) {
            notificationManager.b(((Integer) this.wearNotificationsIds.n(i10)).intValue());
        }
        this.wearNotificationsIds.b();
    }

    public static int lambda$loadRoundAvatar$46(Canvas canvas) {
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        int width = canvas.getWidth();
        float f9 = width / 2;
        path.addRoundRect(0.0f, 0.0f, width, canvas.getHeight(), f9, f9, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        return -3;
    }

    public static void lambda$loadRoundAvatar$47(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new Object());
    }

    public static void lambda$loadTopicsNotificationsExceptions$53(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.accept(hashSet);
        }
    }

    public void lambda$loadTopicsNotificationsExceptions$54(long j10, Consumer consumer) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, ?> entry : MessagesController.getNotificationsSettings(this.currentAccount).getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("notify2_" + j10)) {
                Integer parseInt = Utilities.parseInt((CharSequence) key.replace("notify2_" + j10, ""));
                int intValue = parseInt.intValue();
                if (intValue != 0 && getMessagesController().isDialogMuted(j10, intValue) != getMessagesController().isDialogMuted(j10, 0L)) {
                    hashSet.add(parseInt);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new vg(3, consumer, hashSet));
    }

    public void lambda$new$0() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay reached");
        }
        if (!this.delayedPushMessages.isEmpty()) {
            showOrUpdateNotification(true);
            this.delayedPushMessages.clear();
        }
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$new$1() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
    }

    public static void lambda$playInChatSound$39(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void lambda$playInChatSound$40() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) > 500) {
            try {
                if (this.soundPool == null) {
                    SoundPool soundPool = new SoundPool(3, 1, 0);
                    this.soundPool = soundPool;
                    soundPool.setOnLoadCompleteListener(new dh(1));
                }
                if (this.soundIn == 0 && !this.soundInLoaded) {
                    this.soundInLoaded = true;
                    this.soundIn = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
                }
                int i10 = this.soundIn;
                if (i10 != 0) {
                    try {
                        this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    public static void lambda$playOutChatSound$48(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void lambda$playOutChatSound$49() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) > 100) {
                this.lastSoundOutPlay = SystemClock.elapsedRealtime();
                if (this.soundPool == null) {
                    SoundPool soundPool = new SoundPool(3, 1, 0);
                    this.soundPool = soundPool;
                    soundPool.setOnLoadCompleteListener(new dh(0));
                }
                if (this.soundOut == 0 && !this.soundOutLoaded) {
                    this.soundOutLoaded = true;
                    this.soundOut = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
                }
                int i10 = this.soundOut;
                if (i10 != 0) {
                    try {
                        this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public void lambda$processDeleteStory$15(long r6, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.lambda$processDeleteStory$15(long, int):void");
    }

    public void lambda$processDialogsUpdateRead$28(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$processDialogsUpdateRead$29(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    public void lambda$processDialogsUpdateRead$30(org.telegram.messenger.support.LongSparseIntArray r18, java.util.ArrayList r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.lambda$processDialogsUpdateRead$30(org.telegram.messenger.support.LongSparseIntArray, java.util.ArrayList):void");
    }

    public void lambda$processEditedMessages$22(a0.h hVar) {
        long j10;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i10 = 0; i10 < m10; i10++) {
            hVar.j(i10);
            ArrayList arrayList = (ArrayList) hVar.n(i10);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject.isStoryReactionPush) {
                    j10 = messageObject.getDialogId();
                } else {
                    long j11 = messageObject.messageOwner.peer_id.channel_id;
                    if (j11 != 0) {
                        j10 = -j11;
                    } else {
                        j10 = 0;
                    }
                }
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                if (sparseArray == null) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.get(messageObject.getId());
                if (messageObject2 != null && (messageObject2.isReactionPush || messageObject2.isStoryReactionPush)) {
                    messageObject2 = null;
                }
                if (messageObject2 != null) {
                    sparseArray.put(messageObject.getId(), messageObject);
                    int indexOf = this.pushMessages.indexOf(messageObject2);
                    if (indexOf >= 0) {
                        this.pushMessages.set(indexOf, messageObject);
                    }
                    int indexOf2 = this.delayedPushMessages.indexOf(messageObject2);
                    if (indexOf2 >= 0) {
                        this.delayedPushMessages.set(indexOf2, messageObject);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    public void lambda$processIgnoreStories$17() {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteAllStoryPushMessages();
        if (!isEmpty) {
            showOrUpdateNotification(false);
        }
    }

    public void lambda$processIgnoreStories$19(long j10) {
        boolean isEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteStoryPushMessage(j10);
        if (!isEmpty) {
            showOrUpdateNotification(false);
        }
    }

    public void lambda$processIgnoreStoryReactions$18() {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i10);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                this.pushMessages.remove(i10);
                i10--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                z10 = true;
            }
            i10++;
        }
        getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    public void lambda$processLoadedUnreadMessages$32(int i10) {
        if (this.total_unread_count == 0) {
            this.popupMessages.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    public void lambda$processLoadedUnreadMessages$33(ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        boolean z10;
        long j10;
        MessageObject messageObject;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int intValue;
        long j11;
        SharedPreferences sharedPreferences;
        boolean z12;
        int i13;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j12;
        long j13;
        int i14;
        TLRPC.Message message;
        long j14;
        int i15;
        long j15;
        boolean z13;
        TLRPC.Message message2;
        boolean z14;
        SharedPreferences sharedPreferences2;
        int intValue2;
        NotificationsController notificationsController = this;
        notificationsController.pushDialogs.b();
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.b();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.b();
        boolean z15 = false;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        a0.h hVar2 = new a0.h();
        long j16 = 0;
        if (arrayList != null) {
            int i16 = 0;
            while (i16 < arrayList.size()) {
                TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i16);
                if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message3.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        long j17 = message3.peer_id.channel_id;
                        if (j17 != j16) {
                            j12 = -j17;
                            j13 = j16;
                        } else {
                            j12 = j16;
                            j13 = j12;
                        }
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.f(j12);
                        if (sparseArray != null && sparseArray.indexOfKey(message3.f22413id) >= 0) {
                            sharedPreferences2 = notificationsSettings;
                            i15 = i16;
                            i16 = i15 + 1;
                            notificationsSettings = sharedPreferences2;
                            j16 = j13;
                            z15 = false;
                        } else {
                            MessageObject messageObject2 = new MessageObject(notificationsController.currentAccount, message3, z15, z15);
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount++;
                            }
                            long dialogId = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            if (messageObject2.messageOwner.mentioned) {
                                i14 = i16;
                                message = message3;
                                j14 = messageObject2.getFromChatId();
                            } else {
                                i14 = i16;
                                message = message3;
                                j14 = dialogId;
                            }
                            int h = hVar2.h(j14);
                            if (h >= 0 && topicId == j13) {
                                z14 = ((Boolean) hVar2.n(h)).booleanValue();
                                i15 = i14;
                                j15 = j12;
                                message2 = message;
                                notificationsController = this;
                            } else {
                                i15 = i14;
                                j15 = j12;
                                TLRPC.Message message4 = message;
                                notificationsController = this;
                                int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, j14, topicId);
                                if (notifyOverride == -1) {
                                    z13 = notificationsController.isGlobalNotificationsEnabled(j14, messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                                } else if (notifyOverride != 2) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                message2 = message4;
                                hVar2.k(Boolean.valueOf(z13), j14);
                                z14 = z13;
                            }
                            sharedPreferences2 = notificationsSettings;
                            if (z14) {
                                long j18 = j14;
                                if (j18 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn) {
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        notificationsController.pushMessagesDict.k(sparseArray, j15);
                                    }
                                    sparseArray.put(message2.f22413id, messageObject2);
                                    notificationsController.appendMessage(messageObject2);
                                    if (dialogId != j18) {
                                        Integer num = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId);
                                        a0.h hVar3 = notificationsController.pushDialogsOverrideMention;
                                        if (num == null) {
                                            intValue2 = 1;
                                        } else {
                                            intValue2 = num.intValue() + 1;
                                        }
                                        hVar3.k(Integer.valueOf(intValue2), dialogId);
                                    }
                                }
                            }
                            i16 = i15 + 1;
                            notificationsSettings = sharedPreferences2;
                            j16 = j13;
                            z15 = false;
                        }
                    }
                }
                sharedPreferences2 = notificationsSettings;
                i15 = i16;
                j13 = j16;
                i16 = i15 + 1;
                notificationsSettings = sharedPreferences2;
                j16 = j13;
                z15 = false;
            }
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        long j19 = j16;
        int i17 = 0;
        while (i17 < hVar.m()) {
            long j20 = hVar.j(i17);
            int h10 = hVar2.h(j20);
            if (h10 >= 0) {
                z12 = ((Boolean) hVar2.n(h10)).booleanValue();
                sharedPreferences = sharedPreferences3;
            } else {
                sharedPreferences = sharedPreferences3;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences, j20, 0L);
                if (notifyOverride2 == -1) {
                    z12 = notificationsController.isGlobalNotificationsEnabled(j20, false, false);
                } else if (notifyOverride2 != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                hVar2.k(Boolean.valueOf(z12), j20);
            }
            if (z12) {
                Integer num2 = (Integer) hVar.n(i17);
                int intValue3 = num2.intValue();
                notificationsController.pushDialogs.k(num2, j20);
                if (!notificationsController.getMessagesController().isCommunity(j20)) {
                    if (notificationsController.getMessagesController().isForum(j20)) {
                        int i18 = notificationsController.total_unread_count;
                        if (intValue3 > 0) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        notificationsController.total_unread_count = i18 + i13;
                    } else {
                        notificationsController.total_unread_count += intValue3;
                    }
                }
            }
            i17++;
            sharedPreferences3 = sharedPreferences;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences3;
        if (arrayList2 != null) {
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i19);
                int id2 = messageObject3.getId();
                if (notificationsController.pushMessagesDict.h(id2) < 0) {
                    if (notificationsController.isPersonalMessage(messageObject3)) {
                        notificationsController.personalCount++;
                    }
                    long dialogId2 = messageObject3.getDialogId();
                    long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject3.messageOwner, notificationsController.getMessagesController().isForum(messageObject3));
                    TLRPC.Message message5 = messageObject3.messageOwner;
                    long j21 = message5.random_id;
                    if (message5.mentioned) {
                        j10 = messageObject3.getFromChatId();
                    } else {
                        j10 = dialogId2;
                    }
                    int h11 = hVar2.h(j10);
                    if (h11 >= 0 && topicId2 == j19) {
                        z11 = ((Boolean) hVar2.n(h11)).booleanValue();
                        messageObject = messageObject3;
                    } else {
                        int notifyOverride3 = notificationsController.getNotifyOverride(sharedPreferences4, j10, topicId2);
                        if (notifyOverride3 == -1) {
                            messageObject = messageObject3;
                            z11 = notificationsController.isGlobalNotificationsEnabled(j10, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                        } else {
                            messageObject = messageObject3;
                            if (notifyOverride3 != 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        hVar2.k(Boolean.valueOf(z11), j10);
                    }
                    if (z11 && (j10 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id2 != 0) {
                            if (messageObject.isStoryReactionPush) {
                                j11 = messageObject.getDialogId();
                            } else {
                                long j22 = messageObject.messageOwner.peer_id.channel_id;
                                if (j22 != j19) {
                                    j11 = -j22;
                                } else {
                                    j11 = j19;
                                }
                            }
                            SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.f(j11);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController.pushMessagesDict.k(sparseArray2, j11);
                            }
                            sparseArray2.put(id2, messageObject);
                        } else if (j21 != j19) {
                            notificationsController.fcmRandomMessagesDict.k(messageObject, j21);
                        }
                        notificationsController.appendMessage(messageObject);
                        if (dialogId2 != j10) {
                            Integer num3 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId2);
                            a0.h hVar4 = notificationsController.pushDialogsOverrideMention;
                            if (num3 == null) {
                                intValue = 1;
                            } else {
                                intValue = num3.intValue() + 1;
                            }
                            hVar4.k(Integer.valueOf(intValue), dialogId2);
                        }
                        Integer num4 = (Integer) notificationsController.pushDialogs.f(j10);
                        if (num4 != null) {
                            i10 = num4.intValue() + 1;
                        } else {
                            i10 = 1;
                        }
                        if (!notificationsController.getMessagesController().isCommunity(j10)) {
                            if (notificationsController.getMessagesController().isForum(j10)) {
                                if (num4 != null) {
                                    int i20 = notificationsController.total_unread_count;
                                    if (num4.intValue() > 0) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    notificationsController.total_unread_count = i20 - i12;
                                }
                                int i21 = notificationsController.total_unread_count;
                                if (i10 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                notificationsController.total_unread_count = i21 + i11;
                            } else {
                                if (num4 != null) {
                                    notificationsController.total_unread_count -= num4.intValue();
                                }
                                notificationsController.total_unread_count += i10;
                            }
                        }
                        notificationsController.pushDialogs.k(Integer.valueOf(i10), j10);
                    }
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j23 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) notificationsController.storyPushMessagesDict.f(j23);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    notificationsController.storyPushMessages.add(storyNotification);
                    notificationsController.storyPushMessagesDict.k(storyNotification, j23);
                }
            }
            Collections.sort(notificationsController.storyPushMessages, Comparator$CC.comparingLong(new le(2)));
        }
        AndroidUtilities.runOnUIThread(new zg(notificationsController, notificationsController.pushDialogs.m(), 6));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z10 = true;
        } else {
            z10 = false;
        }
        notificationsController.showOrUpdateNotification(z10);
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public void lambda$processNewMessages$24(int i10) {
        a0.h hVar = new a0.h();
        hVar.k(q8.l.k(Integer.valueOf(i10)), 0L);
        removeDeletedMessagesFromNotifications(hVar, false);
    }

    public void lambda$processNewMessages$25(ArrayList arrayList, int i10) {
        this.popupMessages.addAll(0, arrayList);
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            if (i10 == 3 || ((i10 == 1 && ApplicationLoader.isScreenOn) || (i10 == 2 && !ApplicationLoader.isScreenOn))) {
                Intent intent = new Intent(ApplicationLoader.applicationContext, PopupNotificationActivity.class);
                intent.setFlags(268763140);
                try {
                    ApplicationLoader.applicationContext.startActivity(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void lambda$processNewMessages$26(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    public void lambda$processNewMessages$27(java.util.ArrayList r38, java.util.ArrayList r39, boolean r40, boolean r41, java.util.concurrent.CountDownLatch r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.lambda$processNewMessages$27(java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$processReadMessages$20(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$processReadMessages$21(org.telegram.messenger.support.LongSparseIntArray r20, java.util.ArrayList r21, long r22, int r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.lambda$processReadMessages$21(org.telegram.messenger.support.LongSparseIntArray, java.util.ArrayList, long, int, int, boolean):void");
    }

    public void lambda$processReadStories$16(long j10, int i10) {
        boolean z10;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.f(j10);
        if (storyNotification != null) {
            this.storyPushMessagesDict.l(j10);
            this.storyPushMessages.remove(storyNotification);
            getMessagesStorage().deleteStoryPushMessage(j10);
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        while (i11 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i11);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i10) {
                this.pushMessages.remove(i11);
                i11--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            showOrUpdateNotification(false);
            updateStoryPushesRunnable();
        }
    }

    public void lambda$processSeenStoryReactions$14(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (i11 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i11);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i10) {
                this.pushMessages.remove(i11);
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.l(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            showOrUpdateNotification(false);
        }
    }

    public void lambda$removeDeletedHisoryFromNotifications$11(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$removeDeletedHisoryFromNotifications$12(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    public void lambda$removeDeletedHisoryFromNotifications$13(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
        boolean z10;
        int i10;
        int i11;
        Integer num;
        int i12 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i13 = 0;
        while (i13 < longSparseIntArray.size()) {
            long keyAt = longSparseIntArray.keyAt(i13);
            long j10 = -keyAt;
            long j11 = longSparseIntArray.get(keyAt);
            Integer num3 = (Integer) this.pushDialogs.f(j10);
            if (num3 == null) {
                num3 = num2;
            }
            Integer num4 = num3;
            int i14 = 0;
            while (i14 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i14);
                if (messageObject.getDialogId() == j10) {
                    num = num2;
                    if (messageObject.getId() <= j11) {
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.l(j10);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        i14--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        num4 = Integer.valueOf(num4.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i14++;
                num2 = num;
            }
            Integer num5 = num2;
            if (num4.intValue() <= 0) {
                this.smartNotificationsDialogs.l(j10);
                num4 = num5;
            }
            if (!num4.equals(num3)) {
                if (!getMessagesController().isCommunity(j10)) {
                    if (getMessagesController().isForum(j10)) {
                        int i15 = this.total_unread_count;
                        if (num3.intValue() > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i16 = i15 - i10;
                        this.total_unread_count = i16;
                        if (num4.intValue() > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        this.total_unread_count = i16 + i11;
                    } else {
                        int intValue = this.total_unread_count - num3.intValue();
                        this.total_unread_count = intValue;
                        this.total_unread_count = num4.intValue() + intValue;
                    }
                }
                this.pushDialogs.k(num4, j10);
            }
            if (num4.intValue() == 0) {
                this.pushDialogs.l(j10);
                this.pushDialogsOverrideMention.l(j10);
            }
            i13++;
            num2 = num5;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new bh(this, arrayList, 0));
        }
        if (i12 != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                if (this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                scheduleNotificationDelay(z10);
            }
            AndroidUtilities.runOnUIThread(new zg(this, this.pushDialogs.m(), 1));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$removeDeletedMessagesFromNotifications$10(a0.h hVar, boolean z10, ArrayList arrayList) {
        boolean z11;
        Integer num;
        int i10;
        Integer num2;
        int i11;
        Integer num3;
        int i12;
        int i13;
        a0.h hVar2 = hVar;
        int i14 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num4 = 0;
        int i15 = 0;
        while (i15 < hVar2.m()) {
            long j10 = hVar2.j(i15);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
            if (sparseArray == null) {
                num = num4;
                i10 = i15;
            } else {
                ArrayList arrayList2 = (ArrayList) hVar2.f(j10);
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    int intValue = ((Integer) arrayList2.get(i16)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(intValue);
                    if (messageObject != null) {
                        if (messageObject.isStoryReactionPush || (z10 && !messageObject.isReactionPush)) {
                            num2 = num4;
                            i11 = i15;
                        } else {
                            num2 = num4;
                            long dialogId = messageObject.getDialogId();
                            Integer num5 = (Integer) this.pushDialogs.f(dialogId);
                            if (num5 == null) {
                                num5 = num2;
                            }
                            int intValue2 = num5.intValue() - 1;
                            Integer valueOf = Integer.valueOf(intValue2);
                            if (intValue2 <= 0) {
                                this.smartNotificationsDialogs.l(dialogId);
                                num3 = num2;
                            } else {
                                num3 = valueOf;
                            }
                            if (!num3.equals(num5)) {
                                i11 = i15;
                                if (!getMessagesController().isCommunity(dialogId)) {
                                    if (getMessagesController().isForum(dialogId)) {
                                        int i17 = this.total_unread_count;
                                        if (num5.intValue() > 0) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                        int i18 = i17 - i12;
                                        this.total_unread_count = i18;
                                        if (num3.intValue() > 0) {
                                            i13 = 1;
                                        } else {
                                            i13 = 0;
                                        }
                                        this.total_unread_count = i18 + i13;
                                    } else {
                                        int intValue3 = this.total_unread_count - num5.intValue();
                                        this.total_unread_count = intValue3;
                                        this.total_unread_count = num3.intValue() + intValue3;
                                    }
                                }
                                this.pushDialogs.k(num3, dialogId);
                            } else {
                                i11 = i15;
                            }
                            if (num3.intValue() == 0) {
                                this.pushDialogs.l(dialogId);
                                this.pushDialogsOverrideMention.l(dialogId);
                            }
                            sparseArray.remove(intValue);
                            this.delayedPushMessages.remove(messageObject);
                            this.pushMessages.remove(messageObject);
                            if (isPersonalMessage(messageObject)) {
                                this.personalCount--;
                            }
                            arrayList.add(messageObject);
                        }
                    } else {
                        num2 = num4;
                        i11 = i15;
                    }
                    i16++;
                    num4 = num2;
                    i15 = i11;
                }
                num = num4;
                i10 = i15;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.l(j10);
                }
            }
            i15 = i10 + 1;
            hVar2 = hVar;
            num4 = num;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new bh(this, arrayList, 3));
        }
        if (i14 != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                if (this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                scheduleNotificationDelay(z11);
            }
            AndroidUtilities.runOnUIThread(new zg(this, this.pushDialogs.m(), 7));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$removeDeletedMessagesFromNotifications$8(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$removeDeletedMessagesFromNotifications$9(int i10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i10));
    }

    public void lambda$repeatNotificationMaybe$41() {
        int i10 = Calendar.getInstance().get(11);
        if (i10 >= 11 && i10 <= 22) {
            notificationManager.b(this.notificationId);
            showOrUpdateNotification(true);
            return;
        }
        scheduleNotificationRepeat();
    }

    public void lambda$setLastOnlineFromOtherDevice$5(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i10);
        }
        this.lastOnlineFromOtherDevice = i10;
    }

    public void lambda$setOpenedDialogId$3(long j10, long j11) {
        this.openedDialogId = j10;
        this.openedTopicId = j11;
    }

    public void lambda$setOpenedInBubble$4(boolean z10, long j10) {
        if (z10) {
            this.openedInBubbleDialogs.add(Long.valueOf(j10));
        } else {
            this.openedInBubbleDialogs.remove(Long.valueOf(j10));
        }
    }

    public static void lambda$showExtraNotifications$45(Uri uri, File file) {
        try {
            ApplicationLoader.applicationContext.revokeUriPermission(uri, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    public void lambda$showNotifications$35() {
        showOrUpdateNotification(false);
    }

    public void lambda$updateBadge$34() {
        setBadge(getTotalAllUnreadCount());
    }

    public static Bitmap loadMultipleAvatars(ArrayList<Object> arrayList) {
        float f9;
        int i10;
        Bitmap bitmap;
        Paint paint;
        float f10;
        float size;
        float size2;
        float f11;
        float f12;
        float f13;
        float f14;
        Object obj;
        ArrayList<Object> arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2 == null || arrayList2.size() == 0) {
            return null;
        }
        int dp = AndroidUtilities.dp(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (arrayList2.size() == 1) {
            f9 = 1.0f;
        } else if (arrayList2.size() == 2) {
            f9 = 0.65f;
        } else {
            f9 = 0.5f;
        }
        int i11 = 0;
        TextPaint textPaint = null;
        while (i11 < arrayList2.size()) {
            float f15 = dp;
            float f16 = (1.0f - f9) * f15;
            try {
                size = (f16 / arrayList2.size()) * ((arrayList2.size() - 1) - i11);
                size2 = i11 * (f16 / arrayList2.size());
                f11 = f15 * f9;
                f12 = f11 / 2.0f;
                i10 = dp;
                f13 = size + f12;
                bitmap = createBitmap;
                f14 = size2 + f12;
                f10 = f9;
                try {
                    canvas.drawCircle(f13, f14, AndroidUtilities.dp(2.0f) + f12, paint3);
                    obj = arrayList2.get(i11);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i10 = dp;
                bitmap = createBitmap;
                paint = paint3;
                f10 = f9;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i12 = (int) f11;
                    options.inSampleSize = nh.o7.d(options, i12, i12);
                    options.inJustDecodeBounds = false;
                    options.inDither = true;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                    matrix.reset();
                    matrix.postScale(f11 / decodeFile.getWidth(), f11 / decodeFile.getHeight());
                    matrix.postTranslate(size, size2);
                    bitmapShader.setLocalMatrix(matrix);
                    paint2.setShader(bitmapShader);
                    canvas.drawCircle(f13, f14, f12, paint2);
                    decodeFile.recycle();
                } catch (Throwable unused3) {
                    i11++;
                    arrayList2 = arrayList;
                    dp = i10;
                    createBitmap = bitmap;
                    f9 = f10;
                    paint3 = paint;
                }
                i11++;
                arrayList2 = arrayList;
                dp = i10;
                createBitmap = bitmap;
                f9 = f10;
                paint3 = paint;
            } else {
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    try {
                        paint2.setShader(new LinearGradient(size, size2, size, size2 + f11, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23280p8[org.telegram.ui.Components.e9.e(user.f22539id)], false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23296q8[org.telegram.ui.Components.e9.e(user.f22539id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        canvas.drawCircle(f13, f14, f12, paint2);
                        if (textPaint == null) {
                            try {
                                try {
                                    TextPaint textPaint2 = new TextPaint(1);
                                    try {
                                        textPaint2.setTypeface(AndroidUtilities.bold());
                                        textPaint2.setTextSize(f15 * 0.25f);
                                        textPaint2.setColor(-1);
                                        textPaint = textPaint2;
                                    } catch (Throwable unused4) {
                                        textPaint = textPaint2;
                                        i11++;
                                        arrayList2 = arrayList;
                                        dp = i10;
                                        createBitmap = bitmap;
                                        f9 = f10;
                                        paint3 = paint;
                                    }
                                } catch (Throwable unused5) {
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Components.e9.a(user.first_name, user.last_name, null, sb2);
                        String sb3 = sb2.toString();
                        try {
                            textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                            canvas.drawText(sb3, (f13 - (rect.width() / 2.0f)) - rect.left, (f14 - (rect.height() / 2.0f)) - rect.top, textPaint);
                        } catch (Throwable unused7) {
                        }
                    } catch (Throwable unused8) {
                    }
                    i11++;
                    arrayList2 = arrayList;
                    dp = i10;
                    createBitmap = bitmap;
                    f9 = f10;
                    paint3 = paint;
                }
                i11++;
                arrayList2 = arrayList;
                dp = i10;
                createBitmap = bitmap;
                f9 = f10;
                paint3 = paint;
            }
        }
        return createBitmap;
    }

    public static e0.o0 loadRoundAvatar(long j10, File file, e0.o0 o0Var) {
        if (j10 == 489001) {
            o0Var.f5718b = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr);
            return o0Var;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                o0Var.f5718b = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new Object()));
            } catch (Throwable unused) {
            }
        }
        return o0Var;
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        String str;
        TLRPC.FileLocation fileLocation;
        int min = Math.min(3, this.storyPushMessages.size());
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            StoryNotification storyNotification = this.storyPushMessages.get(i11);
            i10 += storyNotification.dateByIds.size();
            z10 |= storyNotification.hidden;
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(storyNotification.dialogId));
            if (user == null && (user = getMessagesStorage().getUserSync(storyNotification.dialogId)) != null) {
                getMessagesController().putUser(user, true);
            }
            Object obj = null;
            if (user != null) {
                str = UserObject.getUserName(user);
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    File pathToAttach = getFileLoader().getPathToAttach(user.photo.photo_small, true);
                    if (!pathToAttach.exists()) {
                        if (user.photo.photo_big != null) {
                            pathToAttach = getFileLoader().getPathToAttach(user.photo.photo_big, true);
                        } else {
                            pathToAttach = null;
                        }
                        if (pathToAttach != null && !pathToAttach.exists()) {
                            pathToAttach = null;
                        }
                    }
                    if (pathToAttach != null) {
                        obj = pathToAttach;
                    }
                }
            } else {
                str = storyNotification.localName;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (obj == null && user != null) {
                arrayList2.add(user);
            } else if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair<>(Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    private void playInChatSound() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.playInChatSound():void");
    }

    private String replaceSpoilers(MessageObject messageObject) {
        TLRPC.Message message;
        String str;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (messageObject.didSpoilLoginCode()) {
            return sb2.toString();
        }
        for (int i10 = 0; i10 < messageObject.messageOwner.entities.size(); i10++) {
            if (messageObject.messageOwner.entities.get(i10) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) messageObject.messageOwner.entities.get(i10);
                for (int i11 = 0; i11 < tL_messageEntitySpoiler.length; i11++) {
                    char[] cArr = this.spoilerChars;
                    sb2.setCharAt(tL_messageEntitySpoiler.offset + i11, cArr[i11 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    public void resetNotificationSound(e0.t tVar, long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        FileLog.d("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
            String uri3 = uri2.toString();
            String string = LocaleController.getString(R.string.DefaultRingtone);
            if (z10) {
                if (i12 == 2) {
                    edit.putString("ChannelSound", string);
                } else if (i12 == 0) {
                    edit.putString("GroupSound", string);
                } else if (i12 == 1) {
                    edit.putString("GlobalSound", string);
                } else if (i12 == 3) {
                    edit.putString("StoriesSound", string);
                } else if (i12 == 4 || i12 == 5) {
                    edit.putString("ReactionSound", string);
                }
                if (i12 == 2) {
                    edit.putString("ChannelSoundPath", uri3);
                } else if (i12 == 0) {
                    edit.putString("GroupSoundPath", uri3);
                } else if (i12 == 1) {
                    edit.putString("GlobalSoundPath", uri3);
                } else if (i12 == 3) {
                    edit.putString("StoriesSoundPath", uri3);
                } else if (i12 == 4 || i12 == 5) {
                    edit.putString("ReactionSound", uri3);
                }
                getNotificationsController().lambda$deleteNotificationChannelGlobal$43(i12, -1);
            } else {
                edit.putString(x3.j(j10, j11, new StringBuilder("sound_")), string);
                edit.putString(x3.j(j10, j11, new StringBuilder("sound_path_")), uri3);
                lambda$deleteNotificationChannel$42(j10, j11, -1);
            }
            edit.commit();
            tVar.f5752y = validateChannelId(j10, j11, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
            notificationManager.d(this.notificationId, tVar.b());
        }
    }

    private void scheduleNotificationDelay(boolean z10) {
        int i10;
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay notification start, onlineReason = " + z10);
            }
            this.notificationDelayWakelock.acquire(10000L);
            DispatchQueue dispatchQueue = notificationsQueue;
            dispatchQueue.cancelRunnable(this.notificationDelayRunnable);
            Runnable runnable = this.notificationDelayRunnable;
            if (z10) {
                i10 = 3000;
            } else {
                i10 = 1000;
            }
            dispatchQueue.postRunnable(runnable, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
            showOrUpdateNotification(this.notifyCheck);
        }
    }

    private void scheduleNotificationRepeat() {
        try {
            Intent intent = new Intent(ApplicationLoader.applicationContext, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(ApplicationLoader.applicationContext, 0, intent, 33554432);
            int i10 = getAccountInstance().getNotificationsSettings().getInt("repeat_messages", 60);
            if (i10 > 0 && this.personalCount > 0) {
                this.alarmManager.set(2, SystemClock.elapsedRealtime() + (i10 * 60000), service);
            } else {
                this.alarmManager.cancel(service);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    private void setBadge(int i10) {
        if (this.lastBadgeCount == i10) {
            return;
        }
        FileLog.d("setBadge " + i10);
        this.lastBadgeCount = i10;
        NotificationBadge.applyCount(i10);
    }

    private void setNotificationChannel(Notification notification, e0.t tVar, boolean z10) {
        if (z10) {
            tVar.f5752y = OTHER_NOTIFICATIONS_CHANNEL;
        } else {
            tVar.f5752y = notification.getChannelId();
        }
    }

    private void showExtraNotifications(e0.t r84, java.lang.String r85, long r86, long r88, java.lang.String r90, long[] r91, int r92, android.net.Uri r93, int r94, boolean r95, boolean r96, boolean r97, int r98) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.showExtraNotifications(e0.t, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    private void showOrUpdateNotification(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.showOrUpdateNotification(boolean):void");
    }

    private boolean unsupportedNotificationShortcut() {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBubbles) {
            return false;
        }
        return true;
    }

    private void updateStoryPushesRunnable() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.storyPushMessages.size(); i10++) {
            for (Pair<Long, Long> pair : this.storyPushMessages.get(i10).dateByIds.values()) {
                j10 = Math.min(j10, ((Long) pair.second).longValue());
            }
        }
        DispatchQueue dispatchQueue = notificationsQueue;
        dispatchQueue.cancelRunnable(this.checkStoryPushesRunnable);
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (j10 != Long.MAX_VALUE) {
            dispatchQueue.postRunnable(this.checkStoryPushesRunnable, Math.max(0L, currentTimeMillis));
        }
    }

    private java.lang.String validateChannelId(long r30, long r32, java.lang.String r34, long[] r35, int r36, android.net.Uri r37, int r38, boolean r39, boolean r40, boolean r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.validateChannelId(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new ah(this, 0));
    }

    public void clearDialogNotificationsSettings(long j10, long j11) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        String sharedPrefKey = getSharedPrefKey(j10, j11);
        SharedPreferences.Editor remove = edit.remove("notify2_" + sharedPrefKey);
        remove.remove("custom_" + sharedPrefKey);
        getMessagesStorage().setDialogFlags(j10, 0L);
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        if (dialog != null) {
            dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
        }
        edit.commit();
        getNotificationsController().updateServerNotificationsSettings(j10, j11, true);
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new ah(this, 5));
    }

    public void deleteNotificationChannel(long j10, long j11) {
        deleteNotificationChannel(j10, j11, -1);
    }

    public void deleteNotificationChannelGlobal(int i10) {
        deleteNotificationChannelGlobal(i10, -1);
    }

    public void lambda$deleteNotificationChannelGlobal$43(int i10, int i11) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
                SharedPreferences.Editor edit = notificationsSettings.edit();
                if (i11 == 0 || i11 == -1) {
                    if (i10 == 2) {
                        str = "channels";
                    } else if (i10 == 0) {
                        str = "groups";
                    } else if (i10 == 3) {
                        str = "stories";
                    } else {
                        if (i10 != 4 && i10 != 5) {
                            str = "private";
                        }
                        str = "reactions";
                    }
                    String string = notificationsSettings.getString(str, null);
                    if (string != null) {
                        edit.remove(str).remove(str.concat("_s"));
                        try {
                            systemNotificationManager.deleteNotificationChannel(string);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel global internal ".concat(string));
                        }
                    }
                }
                if (i11 == 1 || i11 == -1) {
                    if (i10 == 2) {
                        str2 = "channels_ia";
                    } else if (i10 == 0) {
                        str2 = "groups_ia";
                    } else if (i10 == 3) {
                        str2 = "stories_ia";
                    } else {
                        if (i10 != 4 && i10 != 5) {
                            str2 = "private_ia";
                        }
                        str2 = "reactions_ia";
                    }
                    String string2 = notificationsSettings.getString(str2, null);
                    if (string2 != null) {
                        edit.remove(str2).remove(str2.concat("_s"));
                        try {
                            systemNotificationManager.deleteNotificationChannel(string2);
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel global internal ".concat(string2));
                        }
                    }
                }
                if (i10 == 2) {
                    str3 = "overwrite_channel";
                } else if (i10 == 0) {
                    str3 = "overwrite_group";
                } else if (i10 == 3) {
                    str3 = "overwrite_stories";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str3 = "overwrite_private";
                    }
                    str3 = "overwrite_reactions";
                }
                edit.remove(str3);
                edit.commit();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            notificationsQueue.postRunnable(new vg(4, this, (String) objArr[0]));
        }
    }

    public void ensureGroupsCreated() {
        String str;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (this.groupsCreated == null) {
            this.groupsCreated = Boolean.valueOf(notificationsSettings.getBoolean("groupsCreated5", false));
        }
        if (!this.groupsCreated.booleanValue()) {
            try {
                String str2 = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                SharedPreferences.Editor editor = null;
                for (int i10 = 0; i10 < size; i10++) {
                    NotificationChannel a2 = yg.a(notificationChannels.get(i10));
                    String id2 = a2.getId();
                    if (id2.startsWith(str2)) {
                        int importance = a2.getImportance();
                        if (importance != 4 && importance != 5 && !id2.contains("_ia_")) {
                            if (id2.contains("_channels_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id2.contains("_reactions_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_react").remove("vibrate_react").remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id2.contains("_groups_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id2.contains("_private_")) {
                                if (editor == null) {
                                    editor = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editor.remove("priority_messages");
                                editor.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                long longValue = Utilities.parseLong(id2.substring(9, id2.indexOf(95, 9))).longValue();
                                if (longValue != 0) {
                                    if (editor == null) {
                                        editor = getAccountInstance().getNotificationsSettings().edit();
                                    }
                                    editor.remove("priority_" + longValue).remove("vibrate_" + longValue).remove("sound_path_" + longValue).remove("sound_" + longValue);
                                }
                            }
                        }
                        systemNotificationManager.deleteNotificationChannel(id2);
                    }
                }
                if (editor != null) {
                    editor.commit();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            notificationsSettings.edit().putBoolean("groupsCreated5", true).commit();
            this.groupsCreated = Boolean.TRUE;
        }
        if (!this.channelGroupsCreated) {
            List<NotificationChannelGroup> notificationChannelGroups = systemNotificationManager.getNotificationChannelGroups();
            String str3 = "channels" + this.currentAccount;
            String str4 = "groups" + this.currentAccount;
            int size2 = notificationChannelGroups.size();
            String str5 = "other" + this.currentAccount;
            String str6 = "reactions" + this.currentAccount;
            String str7 = "stories" + this.currentAccount;
            String str8 = "private" + this.currentAccount;
            for (int i11 = 0; i11 < size2; i11++) {
                String id3 = notificationChannelGroups.get(i11).getId();
                if (str3 != null && str3.equals(id3)) {
                    str3 = null;
                } else if (str4 != null && str4.equals(id3)) {
                    str4 = null;
                } else if (str7 != null && str7.equals(id3)) {
                    str7 = null;
                } else if (str6 != null && str6.equals(id3)) {
                    str6 = null;
                } else if (str8 != null && str8.equals(id3)) {
                    str8 = null;
                } else if (str5 != null && str5.equals(id3)) {
                    str5 = null;
                }
                if (str3 == null && str7 == null && str6 == null && str4 == null && str8 == null && str5 == null) {
                    break;
                }
            }
            if (str3 != null || str4 != null || str6 != null || str7 != null || str8 != null || str5 != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
                if (user == null) {
                    getUserConfig().getCurrentUser();
                }
                if (user != null) {
                    str = " (" + ContactsController.formatName(user.first_name, user.last_name) + ")";
                } else {
                    str = "";
                }
                ArrayList arrayList = new ArrayList();
                if (str3 != null) {
                    arrayList.add(new NotificationChannelGroup(str3, LocaleController.getString(R.string.NotificationsChannels) + str));
                }
                if (str4 != null) {
                    arrayList.add(new NotificationChannelGroup(str4, LocaleController.getString(R.string.NotificationsGroups) + str));
                }
                if (str7 != null) {
                    arrayList.add(new NotificationChannelGroup(str7, LocaleController.getString(R.string.NotificationsStories) + str));
                }
                if (str6 != null) {
                    arrayList.add(new NotificationChannelGroup(str6, LocaleController.getString(R.string.NotificationsReactions) + str));
                }
                if (str8 != null) {
                    arrayList.add(new NotificationChannelGroup(str8, LocaleController.getString(R.string.NotificationsPrivateChats) + str));
                }
                if (str5 != null) {
                    arrayList.add(new NotificationChannelGroup(str5, LocaleController.getString(R.string.NotificationsOther) + str));
                }
                systemNotificationManager.createNotificationChannelGroups(arrayList);
            }
            this.channelGroupsCreated = true;
        }
    }

    public void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new ah(this, 11));
    }

    public NotificationsSettingsFacade getNotificationsSettingsFacade() {
        return this.dialogsNotificationsFacade;
    }

    public ArrayList<MessageObject> getPushMessagesSnapshot() {
        ArrayList<MessageObject> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.pushMessages);
        }
        return arrayList;
    }

    public java.lang.String getShortStringForMessage(org.telegram.messenger.MessageObject r28, java.lang.String[] r29, boolean[] r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.getShortStringForMessage(org.telegram.messenger.MessageObject, java.lang.String[], boolean[]):java.lang.String");
    }

    public int getTotalUnreadCount() {
        return this.total_unread_count;
    }

    public boolean hasMessagesToReply() {
        for (int i10 = 0; i10 < this.pushMessages.size(); i10++) {
            MessageObject messageObject = this.pushMessages.get(i10);
            long dialogId = messageObject.getDialogId();
            if (!messageObject.isReactionPush) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && ((messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) && dialogId != 489000 && dialogId != 489001)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new ah(this, 1));
    }

    public boolean isGlobalNotificationsEnabled(long j10, boolean z10, boolean z11) {
        return isGlobalNotificationsEnabled(j10, null, z10, z11);
    }

    public void loadTopicsNotificationsExceptions(long j10, Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, j10, consumer, 24));
    }

    public void muteDialog(long j10, long j11, boolean z10) {
        boolean z11;
        if (z10) {
            getInstance(this.currentAccount).muteUntil(j10, j11, Integer.MAX_VALUE);
            return;
        }
        boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        if (isGlobalNotificationsEnabled && !z11) {
            edit.remove(x3.j(j10, j11, new StringBuilder("notify2_")));
        } else {
            edit.putInt(x3.j(j10, j11, new StringBuilder("notify2_")), 0);
        }
        if (i10 == 0) {
            getMessagesStorage().setDialogFlags(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        updateServerNotificationsSettings(j10, j11);
    }

    public void muteUntil(long j10, long j11, int i10) {
        boolean z10;
        long j12;
        if (j10 != 0) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
            String sharedPrefKey = getSharedPrefKey(j10, j11);
            if (i10 == Integer.MAX_VALUE) {
                if (!isGlobalNotificationsEnabled && !z10) {
                    edit.remove("notify2_" + sharedPrefKey);
                    j12 = 0;
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 2);
                    j12 = 1L;
                }
            } else {
                edit.putInt("notify2_" + sharedPrefKey, 3);
                edit.putInt("notifyuntil_" + sharedPrefKey, getConnectionsManager().getCurrentTime() + i10);
                j12 = (((long) i10) << 32) | 1;
            }
            edit.apply();
            if (i11 == 0) {
                getInstance(this.currentAccount).removeNotificationsForDialog(j10);
                MessagesStorage.getInstance(this.currentAccount).setDialogFlags(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i10 != Integer.MAX_VALUE || isGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = i10;
                    }
                }
            }
            getInstance(this.currentAccount).updateServerNotificationsSettings(j10, j11);
        }
    }

    public void playOutChatSound() {
        if (this.inChatSoundEnabled && !MediaController.getInstance().isRecordingAudio()) {
            try {
                if (audioManager.getRingerMode() == 0) {
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            notificationsQueue.postRunnable(new ah(this, 6));
        }
    }

    public void processDeleteStory(long j10, int i10) {
        notificationsQueue.postRunnable(new eh(this, j10, i10, 0));
    }

    public void processDialogsUpdateRead(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new fh(this, longSparseIntArray, new ArrayList(), 0));
    }

    public void processEditedMessages(a0.h hVar) {
        TLRPC.Message message;
        if (hVar != null && hVar.m() != 0) {
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                ArrayList arrayList = (ArrayList) hVar.n(i10);
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (messageObject != null && (message = messageObject.messageOwner) != null) {
                            TLRPC.MessageAction messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                    VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                                }
                            }
                        }
                    }
                }
            }
            new ArrayList(0);
            notificationsQueue.postRunnable(new vg(5, this, hVar));
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new ah(this, 3));
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new ah(this, 12));
    }

    public void processLoadedUnreadMessages(a0.h hVar, ArrayList<TLRPC.Message> arrayList, ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new c5(this, arrayList, hVar, arrayList2, collection));
    }

    public void processNewMessages(ArrayList<MessageObject> arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        Object valueOf;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            if (arrayList == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(arrayList.size());
            }
            sb2.append(valueOf);
            sb2.append(" isLast=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(" isFcm=");
            z13 = z11;
            sb2.append(z13);
            sb2.append(")");
            FileLog.d(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MessageObject messageObject = arrayList.get(i10);
                if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner()) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date < getMessagesController().callRingTimeout / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(messageObject.getDialogId()));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Peer peer = arrayList2.get(i11);
                                i11++;
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(DialogObject.getShortName(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getDialogId(), sb3.toString(), tL_messageActionConferenceCall.call_id, messageObject.getId(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i10);
                            i10--;
                        } else {
                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                        }
                    }
                }
                i10++;
            }
        }
        if (arrayList.isEmpty()) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        notificationsQueue.postRunnable(new vd(this, arrayList, new ArrayList(0), z13, z12, countDownLatch, 1));
    }

    public void processReadMessages(LongSparseIntArray longSparseIntArray, long j10, int i10, int i11, boolean z10) {
        notificationsQueue.postRunnable(new q8(this, longSparseIntArray, new ArrayList(0), j10, i11, i10, z10));
    }

    public void processReadStories() {
    }

    public void processSeenStoryReactions(long j10, int i10) {
        if (j10 != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new zg(this, i10, 2));
    }

    public void removeDeletedHisoryFromNotifications(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new fh(this, longSparseIntArray, new ArrayList(0), 1));
    }

    public void removeDeletedMessagesFromNotifications(a0.h hVar, boolean z10) {
        notificationsQueue.postRunnable(new tj(this, hVar, z10, new ArrayList(0), 14));
    }

    public void removeNotificationsForDialog(long j10) {
        processReadMessages(null, j10, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new ah(this, 2));
    }

    public void setDialogNotificationsSettings(long j10, long j11, int i10) {
        SharedPreferences.Editor edit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.f(j10);
        if (i10 == 4) {
            if (isGlobalNotificationsEnabled(j10, false, false)) {
                edit.remove(x3.j(j10, j11, new StringBuilder("notify2_")));
            } else {
                edit.putInt(x3.j(j10, j11, new StringBuilder("notify2_")), 0);
            }
            getMessagesStorage().setDialogFlags(j10, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            if (i10 == 0) {
                currentTime += 3600;
            } else if (i10 == 1) {
                currentTime += 28800;
            } else if (i10 == 2) {
                currentTime += 172800;
            } else if (i10 == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j12 = 1;
            if (i10 == 3) {
                edit.putInt(x3.j(j10, j11, new StringBuilder("notify2_")), 2);
            } else {
                edit.putInt(x3.j(j10, j11, new StringBuilder("notify2_")), 3);
                edit.putInt(x3.j(j10, j11, new StringBuilder("notifyuntil_")), currentTime);
                j12 = 1 | (currentTime << 32);
            }
            getInstance(UserConfig.selectedAccount).removeNotificationsForDialog(j10);
            MessagesStorage.getInstance(UserConfig.selectedAccount).setDialogFlags(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        updateServerNotificationsSettings(j10, j11);
    }

    public void setGlobalNotificationsEnabled(int i10, int i11) {
        getAccountInstance().getNotificationsSettings().edit().putInt(getGlobalNotificationsKey(i10), i11).commit();
        updateServerNotificationsSettings(i10);
        getMessagesStorage().updateMutedDialogsFiltersCounters();
        deleteNotificationChannelGlobal(i10);
    }

    public void setInChatSoundEnabled(boolean z10) {
        this.inChatSoundEnabled = z10;
    }

    public void setLastOnlineFromOtherDevice(int i10) {
        notificationsQueue.postRunnable(new zg(this, i10, 5));
    }

    public void setOpenedDialogId(long j10, long j11) {
        notificationsQueue.postRunnable(new jd(this, j10, j11, 1));
    }

    public void setOpenedInBubble(long j10, boolean z10) {
        notificationsQueue.postRunnable(new jh.oa(this, z10, j10, 3));
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new ah(this, 10));
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new ah(this, 4));
    }

    public void updateServerNotificationsSettings(long j10, long j11) {
        updateServerNotificationsSettings(j10, j11, true);
    }

    public static String getSharedPrefKey(long j10, long j11, boolean z10) {
        String valueOf;
        if (z10) {
            if (j11 != 0) {
                Locale locale = Locale.US;
                return j10 + "_" + j11;
            }
            return String.valueOf(j10);
        }
        long j12 = (j11 << 12) + j10;
        a0.h hVar = sharedPrefCachedKeys;
        int h = hVar.h(j12);
        if (h >= 0) {
            return (String) hVar.n(h);
        }
        if (j11 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j10 + "_" + j11;
        } else {
            valueOf = String.valueOf(j10);
        }
        hVar.k(valueOf, j12);
        return valueOf;
    }

    public void deleteNotificationChannel(long j10, long j11, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new v7(this, j10, j11, i10, 1));
    }

    public void deleteNotificationChannelGlobal(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new t6(this, i10, i11, 2));
    }

    public boolean isGlobalNotificationsEnabled(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.isGlobalNotificationsEnabled(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public void processIgnoreStories(long j10) {
        notificationsQueue.postRunnable(new eg.z1(this, j10, 14));
    }

    public void processReadStories(long j10, int i10) {
        notificationsQueue.postRunnable(new eh(this, j10, i10, 1));
    }

    public void updateServerNotificationsSettings(long j10, long j11, boolean z10) {
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String sharedPrefKey = getSharedPrefKey(j10, j11);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = notificationsSettings.getBoolean("content_preview_" + sharedPrefKey, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = notificationsSettings.getBoolean("silent_" + sharedPrefKey, false);
        if (notificationsSettings.contains("stories_" + sharedPrefKey)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !notificationsSettings.getBoolean("stories_" + sharedPrefKey, true);
        }
        int i10 = notificationsSettings.getInt(x3.j(j10, j11, new StringBuilder("notify2_")), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt(x3.j(j10, j11, new StringBuilder("notifyuntil_")), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i10 == 2 ? Integer.MAX_VALUE : 0;
            }
        }
        long j12 = notificationsSettings.getLong(x3.j(j10, j11, new StringBuilder("sound_document_id_")), 0L);
        String string = notificationsSettings.getString(x3.j(j10, j11, new StringBuilder("sound_path_")), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags |= 8;
        if (j12 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f22517id = j12;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = notificationsSettings.getString(x3.j(j10, j11, new StringBuilder("sound_")), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j11 != 0 && j10 != getUserConfig().getClientUserId()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(j10);
            tL_inputNotifyForumTopic.top_msg_id = (int) j11;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else if (ChatObject.isCommunity(this.currentAccount, j10)) {
            TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
            tL_inputNotifyCommunity.community = getMessagesController().getInputChannel(-j10);
            updatenotifysettings.peer = tL_inputNotifyCommunity;
        } else {
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(j10);
            updatenotifysettings.peer = tL_inputNotifyPeer;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new kd(7));
    }

    public boolean isGlobalNotificationsEnabled(int i10) {
        if (i10 == 4) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsMessages", true);
        }
        if (i10 == 5) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsStories", true);
        }
        if (i10 == 3) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableAllStories", true);
        }
        return getAccountInstance().getNotificationsSettings().getInt(getGlobalNotificationsKey(i10), 0) < getConnectionsManager().getCurrentTime();
    }

    public static void lambda$updateServerNotificationsSettings$50(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$updateServerNotificationsSettings$51(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$updateServerNotificationsSettings$52(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void updateServerNotificationsSettings(int i10) {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (i10 != 4 && i10 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i10 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = getInputSound(notificationsSettings, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i10 != 1 && i10 != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = getInputSound(notificationsSettings, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
            } else {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableAll2", 0);
                updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewAll", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 128;
                tL_inputPeerNotifySettings4.stories_hide_sender = notificationsSettings.getBoolean("EnableHideStoriesSenders", false);
                if (notificationsSettings.contains("EnableAllStories")) {
                    TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
                    tL_inputPeerNotifySettings5.flags |= 64;
                    tL_inputPeerNotifySettings5.stories_muted = !notificationsSettings.getBoolean("EnableAllStories", true);
                }
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings6.flags |= 8;
                tL_inputPeerNotifySettings6.sound = getInputSound(notificationsSettings, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = getInputSound(notificationsSettings, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new kd(6));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (notificationsSettings.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = getInputSound(notificationsSettings, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new kd(5));
    }
}
