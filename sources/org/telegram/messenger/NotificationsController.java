package org.telegram.messenger;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import e0.r;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.FileOutputStream;
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
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
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
    private eh.k mediaSpoilerEffect;
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

        int f19627id;
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
            this.f19627id = i10;
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
                FileLog.w("show dialog notification with id " + this.f19627id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.d(this.f19627id, this.notification.b());
            } catch (SecurityException e9) {
                FileLog.e(e9);
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
            long jLongValue = -1;
            for (Pair<Long, Long> pair : this.dateByIds.values()) {
                if (jLongValue == -1 || jLongValue > ((Long) pair.first).longValue()) {
                    jLongValue = ((Long) pair.first).longValue();
                }
            }
            return jLongValue;
        }

        public StoryNotification(long j10, String str, int i10, long j11, long j12) {
            HashMap<Integer, Pair<Long, Long>> map = new HashMap<>();
            this.dateByIds = map;
            this.dialogId = j10;
            this.localName = str;
            map.put(Integer.valueOf(i10), new Pair<>(Long.valueOf(j11), Long.valueOf(j12)));
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
        this.mediaSpoilerEffect = new eh.k();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new xg(this, 7);
        this.notificationId = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i11 = this.currentAccount;
        sb2.append(i11 == 0 ? "" : Integer.valueOf(i11));
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            this.alarmManager = (AlarmManager) ApplicationLoader.applicationContext.getSystemService("alarm");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.notificationDelayWakelock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.notificationDelayRunnable = new xg(this, 8);
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new xg(this, 9));
    }

    private int addToPopupMessages(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j10, boolean z10, SharedPreferences sharedPreferences) {
        int i10;
        if (messageObject.isStoryReactionPush) {
            return 0;
        }
        if (DialogObject.isEncryptedDialog(j10)) {
            i10 = 0;
        } else {
            if (y1.w("custom_", j10, sharedPreferences, false)) {
                i10 = sharedPreferences.getInt("popup_" + j10, 0);
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (z10) {
                    i10 = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i10 = sharedPreferences.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i10 == 1) {
                i10 = 3;
            } else if (i10 == 2) {
                i10 = 0;
            }
        }
        if (i10 != 0 && messageObject.messageOwner.peer_id.channel_id != 0 && !messageObject.isSupergroup()) {
            i10 = 0;
        }
        if (i10 != 0) {
            arrayList.add(0, messageObject);
        }
        return i10;
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
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
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
            } catch (Exception e9) {
                FileLog.e(e9);
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void checkStoryPushes() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.storyPushMessages.size()) {
            StoryNotification storyNotification = this.storyPushMessages.get(i10);
            Iterator<Map.Entry<Integer, Pair<Long, Long>>> it = storyNotification.dateByIds.entrySet().iterator();
            while (it.hasNext()) {
                if (jCurrentTimeMillis >= ((Long) it.next().getValue().second).longValue()) {
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

    private String createNotificationShortcut(e0.t tVar, long j10, String str, TLRPC.User user, TLRPC.Chat chat, e0.p0 p0Var, boolean z10) {
        Bitmap bitmapF;
        IconCompat iconCompatD;
        if (unsupportedNotificationShortcut() || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            return null;
        }
        try {
            String str2 = "ndid_" + j10;
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
            if (j10 > 0) {
                intent.putExtra("userId", j10);
            } else {
                intent.putExtra("chatId", -j10);
            }
            Context context = ApplicationLoader.applicationContext;
            g0.c cVar = new g0.c();
            cVar.f6331a = context;
            cVar.f6332b = str2;
            cVar.f6334e = chat != null ? str : UserObject.getFirstName(user);
            cVar.f6335f = str;
            new Intent("android.intent.action.VIEW");
            cVar.f6333c = new Intent[]{intent};
            cVar.f6340l = true;
            cVar.f6339k = new f0.h(str2);
            if (p0Var != null) {
                cVar.f6337i = new e0.p0[]{p0Var};
                IconCompat iconCompat = p0Var.f5107b;
                cVar.h = iconCompat;
                if (iconCompat != null) {
                    bitmapF = iconCompat.f();
                } else {
                    bitmapF = null;
                }
            } else {
                bitmapF = null;
            }
            if (TextUtils.isEmpty(cVar.f6334e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = cVar.f6333c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            g0.f.m(ApplicationLoader.applicationContext, cVar);
            tVar.getClass();
            String str3 = cVar.f6332b;
            tVar.f5140z = str3;
            if (tVar.A == null) {
                f0.h hVar = cVar.f6339k;
                if (hVar != null) {
                    tVar.A = hVar;
                } else if (str3 != null) {
                    tVar.A = new f0.h(str3);
                }
            }
            if (tVar.f5121e == null) {
                tVar.g(cVar.f6334e);
            }
            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) BubbleActivity.class);
            StringBuilder sb2 = new StringBuilder("com.tmessages.openchat");
            Bitmap bitmap = bitmapF;
            sb2.append(Math.random());
            sb2.append(Integer.MAX_VALUE);
            intent2.setAction(sb2.toString());
            if (DialogObject.isUserDialog(j10)) {
                intent2.putExtra("userId", j10);
            } else {
                intent2.putExtra("chatId", -j10);
            }
            intent2.putExtra("currentAccount", this.currentAccount);
            if (bitmap != null) {
                iconCompatD = new IconCompat(5);
                iconCompatD.f1177b = bitmap;
            } else if (user != null) {
                iconCompatD = IconCompat.d(ApplicationLoader.applicationContext, user.bot ? R.drawable.book_bot : R.drawable.book_user);
            } else {
                iconCompatD = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
            }
            if (!z10) {
                tVar.D = null;
                return str2;
            }
            PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160);
            if (activity == null) {
                throw new NullPointerException("Bubble requires non-null pending intent");
            }
            int i10 = (this.openedDialogId > j10 ? 1 : (this.openedDialogId == j10 ? 0 : -1)) == 0 ? 2 : 0;
            int iMax = Math.max(AndroidUtilities.dp(640.0f), 0);
            r rVar = new r();
            rVar.f5112a = activity;
            rVar.f5113b = iconCompatD;
            rVar.f5114c = iMax;
            rVar.d = i10 & (-2);
            tVar.D = rVar;
            return str2;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    private String cutLastName(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, iIndexOf));
        sb2.append(str.endsWith("…") ? "…" : "");
        return sb2.toString();
    }

    public void lambda$deleteNotificationChannel$42(long j10, long j11, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
            if (i10 == 0 || i10 == -1) {
                String str = "org.telegram.key" + j10;
                if (j11 != 0) {
                    str = str + ".topic" + j11;
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    editorEdit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    editorEdit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal ".concat(string2));
                    }
                }
            }
            editorEdit.commit();
        } catch (Exception e11) {
            FileLog.e(e11);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static String getGlobalNotificationsKey(int i10) {
        if (i10 == 0) {
            return "EnableGroup2";
        }
        return i10 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    private TLRPC.NotificationSound getInputSound(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j10 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j10 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f22505id = j10;
            return tL_notificationSoundRingtone;
        }
        if (string == null) {
            return new TLRPC.TL_notificationSoundDefault();
        }
        if (string.equalsIgnoreCase("NoSound")) {
            return new TLRPC.TL_notificationSoundNone();
        }
        TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
        tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
        tL_notificationSoundLocal.data = string;
        return tL_notificationSoundLocal;
    }

    public static NotificationsController getInstance(int i10) {
        NotificationsController notificationsController;
        NotificationsController notificationsController2 = Instance[i10];
        if (notificationsController2 != null) {
            return notificationsController2;
        }
        synchronized (lockObjects[i10]) {
            try {
                notificationsController = Instance[i10];
                if (notificationsController == null) {
                    NotificationsController[] notificationsControllerArr = Instance;
                    NotificationsController notificationsController3 = new NotificationsController(i10);
                    notificationsControllerArr[i10] = notificationsController3;
                    notificationsController = notificationsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return notificationsController;
    }

    private int getNotifyOverride(SharedPreferences sharedPreferences, long j10, long j11) {
        int property = this.dialogsNotificationsFacade.getProperty("notify2_", j10, j11, -1);
        if (property != 3 || this.dialogsNotificationsFacade.getProperty("notifyuntil_", j10, j11, 0) < getConnectionsManager().getCurrentTime()) {
            return property;
        }
        return 2;
    }

    public static String getSharedPrefKey(long j10, long j11) {
        return getSharedPrefKey(j10, j11, false);
    }

    private String getStringForMessage(MessageObject messageObject, boolean z10, boolean[] zArr, boolean[] zArr2) {
        long j10;
        String string;
        TLRPC.Chat chat;
        char c10;
        char c11;
        char c12;
        boolean z11;
        String string2;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (messageObject.isStoryPush || messageObject.isStoryMentionPush) {
            return "!" + messageObject.messageOwner.message;
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j11 = message.dialog_id;
        TLRPC.Peer peer = message.peer_id;
        long j12 = peer.chat_id;
        if (j12 == 0) {
            j12 = peer.channel_id;
        }
        long fromChatId = peer.user_id;
        if (zArr2 != null) {
            zArr2[0] = true;
        }
        if (messageObject.getDialogId() == 489000 && messageObject.getForwardedFromId() != null) {
            fromChatId = messageObject.getForwardedFromId().longValue();
            j12 = fromChatId < 0 ? -fromChatId : 0L;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean zW = y1.w("content_preview_", j11, notificationsSettings, true);
        if (messageObject.isFcmMessage()) {
            if (j12 != 0 || fromChatId == 0) {
                if (j12 != 0 && (!zW || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
                }
            } else if (!zW || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
            }
            zArr[0] = true;
            return (String) messageObject.messageText;
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (fromChatId == 0) {
            fromChatId = messageObject.getFromChatId();
            if (fromChatId == 0) {
                fromChatId = -j12;
            }
        } else if (fromChatId == clientUserId) {
            fromChatId = messageObject.getFromChatId();
        }
        if (j11 == 0) {
            if (j12 != 0) {
                j11 = -j12;
            } else if (fromChatId != 0) {
                j11 = fromChatId;
            }
        }
        if (messageObject.getDialogId() == 489001 || messageObject.isOauthPush) {
            j10 = j11;
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (fromChatId > 0) {
            if (messageObject.messageOwner.from_scheduled) {
                string = j11 == clientUserId ? LocaleController.getString(R.string.MessageScheduledReminderNotification) : LocaleController.getString(R.string.NotificationMessageScheduledName);
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(fromChatId));
                string = user != null ? UserObject.getUserName(user) : null;
            }
            j10 = j11;
        } else {
            j10 = j11;
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-fromChatId));
            string = chat2 != null ? getTitle(chat2) : null;
        }
        if (string == null) {
            return null;
        }
        if (j12 != 0) {
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
        if (j12 == 0 && fromChatId != 0) {
            if (!zW || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, string);
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (!(message2 instanceof TLRPC.TL_messageService)) {
                if (messageObject.isMediaEmpty()) {
                    if (!z10 && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String string3 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return string3;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z10 || TextUtils.isEmpty(message3.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDPhoto, string) : LocaleController.formatString(R.string.NotificationMessagePhoto, string);
                    }
                    String string4 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string4;
                }
                if (messageObject.isVideo()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDVideo, string) : LocaleController.formatString(R.string.NotificationMessageVideo, string);
                    }
                    String string5 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string5;
                }
                if (messageObject.isGame()) {
                    return LocaleController.formatString(R.string.NotificationMessageGame, string, messageObject.messageOwner.media.game.title);
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationMessageAudio, string);
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationMessageRound, string);
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationMessageMusic, string);
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageContact2, string, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, string, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    return poll.quiz ? LocaleController.formatString(R.string.NotificationMessageQuiz2, string, poll.question.text) : LocaleController.formatString(R.string.NotificationMessagePoll2, string, poll.question.text);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                }
                if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationMessageMap, string);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationMessageLiveLocation, string);
                }
                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                        return LocaleController.formatString(R.string.NotificationMessageNoText, string);
                    }
                    String string6 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                    zArr[0] = true;
                    return string6;
                }
                if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    String stickerEmoji = messageObject.getStickerEmoji();
                    return stickerEmoji != null ? LocaleController.formatString(R.string.NotificationMessageStickerEmoji, string, stickerEmoji) : LocaleController.formatString(R.string.NotificationMessageSticker, string);
                }
                if (messageObject.isGif()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGif, string);
                    }
                    String string7 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string7;
                }
                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                    return LocaleController.formatString(R.string.NotificationMessageDocument, string);
                }
                String string8 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                zArr[0] = true;
                return string8;
            }
            TLRPC.MessageAction messageAction = message2.action;
            if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                return LocaleController.getString(R.string.WallpaperSameNotification);
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                return LocaleController.getString(R.string.WallpaperNotification);
            }
            if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionUserJoined) || (messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                return LocaleController.formatString(R.string.NotificationContactJoined, string);
            }
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return LocaleController.formatString(R.string.NotificationContactNewPhoto, string);
            }
            if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                String string9 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(((long) messageObject.messageOwner.date) * 1000), LocaleController.getInstance().getFormatterDay().format(((long) messageObject.messageOwner.date) * 1000));
                int i10 = R.string.NotificationUnrecognizedDevice;
                String str = getUserConfig().getCurrentUser().first_name;
                TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                return LocaleController.formatString(i10, str, string9, messageAction2.title, messageAction2.address);
            }
            if ((messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction instanceof TLRPC.TL_messageActionGiftTon)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                return messageObject.messageText.toString();
            }
            if ((messageAction instanceof TLRPC.TL_messageActionPaidMessagesRefunded) || (messageAction instanceof TLRPC.TL_messageActionPaidMessagesPrice)) {
                return messageObject.messageText.toString();
            }
            if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                return messageAction.video ? LocaleController.getString(R.string.CallMessageVideoIncomingMissed) : LocaleController.getString(R.string.CallMessageIncomingMissed);
            }
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                return messageAction.video ? LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed) : LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                String strF = hf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                if (!TextUtils.isEmpty(strF)) {
                    c12 = 0;
                    z11 = true;
                    string2 = j10 == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, strF) : LocaleController.formatString(R.string.ChatThemeChangedTo, string, strF);
                } else if (j10 == clientUserId) {
                    c12 = 0;
                    string2 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                    z11 = true;
                } else {
                    c12 = 0;
                    z11 = true;
                    string2 = LocaleController.formatString(R.string.ChatThemeDisabled, string, strF);
                }
                zArr[c12] = z11;
                return string2;
            }
        } else if (j12 != 0) {
            boolean z12 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (!zW || ((z12 || !notificationsSettings.getBoolean("EnablePreviewGroup", true)) && !(z12 && notificationsSettings.getBoolean("EnablePreviewChannel", true)))) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    return (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) ? LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string) : LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                }
                return LocaleController.formatString(R.string.ChannelMessageNoText, string);
            }
            TLRPC.Message message4 = messageObject.messageOwner;
            if (!(message4 instanceof TLRPC.TL_messageService)) {
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    if (messageObject.isMediaEmpty()) {
                        return (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageOwner.message);
                    }
                    if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        return LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string, getTitle(chat));
                    }
                    TLRPC.Message message5 = messageObject.messageOwner;
                    if (message5.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (z10 || TextUtils.isEmpty(message5.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVideo()) {
                        if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                    }
                    if (messageObject.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                    }
                    if (messageObject.isMusic()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                    }
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageMedia2;
                        return LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                        return tL_messageMediaPoll.poll.quiz ? LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text) : LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia2;
                        return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                        return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                    }
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, string, getTitle(chat));
                    }
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, string, getTitle(chat));
                    }
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                        return (z10 || TextUtils.isEmpty(messageObject.messageText)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageText);
                    }
                    if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                        String stickerEmoji2 = messageObject.getStickerEmoji();
                        return stickerEmoji2 != null ? LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, string, getTitle(chat), stickerEmoji2) : LocaleController.formatString(R.string.NotificationMessageGroupSticker, string, getTitle(chat));
                    }
                    if (messageObject.isGif()) {
                        if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupGif, string, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                    }
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupDocument, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📎 " + messageObject.messageOwner.message);
                }
                if (messageObject.isMediaEmpty()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                    }
                    String string10 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string10;
                }
                if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    return LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                }
                TLRPC.Message message6 = messageObject.messageOwner;
                if (message6.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z10 || TextUtils.isEmpty(message6.message)) {
                        return LocaleController.formatString(R.string.ChannelMessagePhoto, string);
                    }
                    String string11 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string11;
                }
                if (messageObject.isVideo()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageVideo, string);
                    }
                    String string12 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string12;
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.ChannelMessageAudio, string);
                }
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
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia3).poll;
                    return poll2.quiz ? LocaleController.formatString(R.string.ChannelMessageQuiz2, string, poll2.question.text) : LocaleController.formatString(R.string.ChannelMessagePoll2, string, poll2.question.text);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.ChannelMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                }
                if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.ChannelMessageMap, string);
                }
                if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.ChannelMessageLiveLocation, string);
                }
                if (!(messageMedia3 instanceof TLRPC.TL_messageMediaDocument)) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageText)) {
                        return LocaleController.formatString(R.string.ChannelMessageNoText, string);
                    }
                    String string13 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                    zArr[0] = true;
                    return string13;
                }
                if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                    String stickerEmoji3 = messageObject.getStickerEmoji();
                    return stickerEmoji3 != null ? LocaleController.formatString(R.string.ChannelMessageStickerEmoji, string, stickerEmoji3) : LocaleController.formatString(R.string.ChannelMessageSticker, string);
                }
                if (messageObject.isGif()) {
                    if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.ChannelMessageGIF, string);
                    }
                    String string14 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string14;
                }
                if (z10 || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                    return LocaleController.formatString(R.string.ChannelMessageDocument, string);
                }
                String string15 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                zArr[0] = true;
                return string15;
            }
            TLRPC.MessageAction messageAction3 = message4.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                long jLongValue = messageAction3.user_id;
                if (jLongValue == 0 && messageAction3.users.size() == 1) {
                    jLongValue = messageObject.messageOwner.action.users.get(0).longValue();
                }
                if (jLongValue != 0) {
                    if (messageObject.messageOwner.peer_id.channel_id != 0 && !chat.megagroup) {
                        return LocaleController.formatString(R.string.ChannelAddedByNotification, string, getTitle(chat));
                    }
                    if (jLongValue == clientUserId) {
                        return LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                    }
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(jLongValue));
                    if (user2 == null) {
                        return null;
                    }
                    if (fromChatId == user2.f22527id) {
                        return chat.megagroup ? LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user2));
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < messageObject.messageOwner.action.users.size(); i11++) {
                    TLRPC.User user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i11));
                    if (user3 != null) {
                        String userName = UserObject.getUserName(user3);
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(userName);
                    }
                }
                return LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), sb2.toString());
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                return messageAction3.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, string, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                long jLongValue2 = messageAction3.user_id;
                if (jLongValue2 == 0 && messageAction3.users.size() == 1) {
                    jLongValue2 = messageObject.messageOwner.action.users.get(0).longValue();
                }
                if (jLongValue2 != 0) {
                    if (jLongValue2 == clientUserId) {
                        return LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, string, getTitle(chat));
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(jLongValue2));
                    if (user4 == null) {
                        return null;
                    }
                    return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), UserObject.getUserName(user4));
                }
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < messageObject.messageOwner.action.users.size(); i12++) {
                    TLRPC.User user5 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i12));
                    if (user5 != null) {
                        String userName2 = UserObject.getUserName(user5);
                        if (sb3.length() != 0) {
                            sb3.append(", ");
                        }
                        sb3.append(userName2);
                    }
                }
                return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), sb3.toString());
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction3;
                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                String title = chat3 == null ? null : getTitle(chat3);
                return title == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                return LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, string, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                return LocaleController.formatString(R.string.NotificationEditedGroupName, string, messageAction3.title);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                return messageObject.messageText.toString();
            }
            if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                if (message4.peer_id.channel_id == 0 || chat.megagroup) {
                    return messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                }
                return messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat)) : LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                long j13 = messageAction3.user_id;
                if (j13 == clientUserId) {
                    return LocaleController.formatString(R.string.NotificationGroupKickYou, string, getTitle(chat));
                }
                if (j13 == fromChatId) {
                    return LocaleController.formatString(R.string.NotificationGroupLeftMember, string, getTitle(chat));
                }
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                if (user6 == null) {
                    return null;
                }
                return LocaleController.formatString(R.string.NotificationGroupKickMember, string, getTitle(chat), UserObject.getUserName(user6));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatCreate) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChannelCreate) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, getTitle(chat));
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                return LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, messageAction3.title);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) {
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
                    }
                    if (messageObject2.isGif()) {
                        if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject2.messageOwner.message);
                    }
                    if (messageObject2.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                    }
                    if (messageObject2.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                    }
                    if (messageObject2.isSticker() || messageObject2.isAnimatedSticker()) {
                        String stickerEmoji4 = messageObject2.getStickerEmoji();
                        return stickerEmoji4 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji4) : LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                    }
                    TLRPC.Message message7 = messageObject2.messageOwner;
                    TLRPC.MessageMedia messageMedia4 = message7.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                        if (TextUtils.isEmpty(message7.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject2.messageOwner.message);
                    }
                    if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                        return LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia4;
                        return tL_messageMediaPoll2.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPhoto) {
                        if (TextUtils.isEmpty(message7.message)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject2.messageOwner.message);
                    }
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                    }
                    CharSequence charSequence = messageObject2.messageText;
                    if (charSequence == null || charSequence.length() <= 0) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                    }
                    CharSequence string16 = messageObject2.messageText;
                    if (string16.length() > 20) {
                        StringBuilder sb4 = new StringBuilder();
                        c11 = 0;
                        sb4.append((Object) string16.subSequence(0, 20));
                        sb4.append("...");
                        string16 = sb4.toString();
                    } else {
                        c11 = 0;
                    }
                    int i13 = R.string.NotificationActionPinnedTextChannel;
                    Object[] objArr = new Object[2];
                    objArr[c11] = getTitle(chat);
                    objArr[1] = string16;
                    return LocaleController.formatString(i13, objArr);
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
                }
                if (messageObject3.isGif()) {
                    if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedGif, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🎬 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if (messageObject3.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedVoice, string, getTitle(chat));
                }
                if (messageObject3.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedRound, string, getTitle(chat));
                }
                if (messageObject3.isSticker() || messageObject3.isAnimatedSticker()) {
                    String stickerEmoji5 = messageObject3.getStickerEmoji();
                    return stickerEmoji5 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, string, getTitle(chat), stickerEmoji5) : LocaleController.formatString(R.string.NotificationActionPinnedSticker, string, getTitle(chat));
                }
                TLRPC.Message message8 = messageObject3.messageOwner;
                TLRPC.MessageMedia messageMedia5 = message8.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                    if (TextUtils.isEmpty(message8.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedFile, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📎 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGeo, string, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, string, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                    return LocaleController.formatString(R.string.NotificationActionPinnedContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                    return tL_messageMediaPoll3.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPoll2, string, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaPhoto) {
                    if (TextUtils.isEmpty(message8.message)) {
                        return LocaleController.formatString(R.string.NotificationActionPinnedPhoto, string, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🖼 " + messageObject3.messageOwner.message, getTitle(chat));
                }
                if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedGame, string, getTitle(chat));
                }
                CharSequence charSequence2 = messageObject3.messageText;
                if (charSequence2 == null || charSequence2.length() <= 0) {
                    return LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                }
                CharSequence string17 = messageObject3.messageText;
                if (string17.length() > 20) {
                    StringBuilder sb5 = new StringBuilder();
                    c10 = 0;
                    sb5.append((Object) string17.subSequence(0, 20));
                    sb5.append("...");
                    string17 = sb5.toString();
                } else {
                    c10 = 0;
                }
                int i14 = R.string.NotificationActionPinnedText;
                String title2 = getTitle(chat);
                Object[] objArr2 = new Object[3];
                objArr2[c10] = string;
                objArr2[1] = string17;
                objArr2[2] = title2;
                return LocaleController.formatString(i14, objArr2);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionGameScore) {
                return messageObject.messageText.toString();
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                String strF2 = hf.d.f(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                if (TextUtils.isEmpty(strF2)) {
                    return j10 == clientUserId ? LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, string, strF2);
                }
                return j10 == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, strF2) : LocaleController.formatString(R.string.ChatThemeChangedTo, string, strF2);
            }
            if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                return messageObject.messageText.toString();
            }
        }
        return null;
    }

    private String getTitle(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? wf.c.i(chat, this.currentAccount, false) : chat.title;
    }

    private int getTotalAllUnreadCount() {
        int iM = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && (SharedConfig.showNotificationsForAllAccounts || UserConfig.selectedAccount == i10)) {
                NotificationsController notificationsController = getInstance(i10);
                if (notificationsController.showBadgeNumber) {
                    if (notificationsController.showBadgeMessages) {
                        if (notificationsController.showBadgeMuted) {
                            try {
                                ArrayList arrayList = new ArrayList(MessagesController.getInstance(i10).allDialogs);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && DialogObject.isChatDialog(dialog.f22384id)) {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialog.f22384id));
                                        if (!ChatObject.isNotInChat(chat) && !ChatObject.isCommunity(chat)) {
                                            if (dialog != null) {
                                                iM += MessagesController.getInstance(i10).getDialogUnreadCount(dialog);
                                            }
                                        }
                                    } else if (dialog != null) {
                                        iM += MessagesController.getInstance(i10).getDialogUnreadCount(dialog);
                                    }
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        } else {
                            iM += notificationsController.total_unread_count;
                        }
                    } else if (notificationsController.showBadgeMuted) {
                        try {
                            int size2 = MessagesController.getInstance(i10).allDialogs.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = MessagesController.getInstance(i10).allDialogs.get(i12);
                                if (DialogObject.isChatDialog(dialog2.f22384id)) {
                                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-dialog2.f22384id));
                                    if (!ChatObject.isNotInChat(chat2) && !ChatObject.isCommunity(chat2)) {
                                        if (MessagesController.getInstance(i10).getDialogUnreadCount(dialog2) != 0) {
                                            iM++;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i10).getDialogUnreadCount(dialog2) != 0) {
                                    iM++;
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    } else {
                        iM += notificationsController.pushDialogs.m();
                    }
                }
            }
        }
        return iM;
    }

    private boolean isEmptyVibration(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        for (long j10 : jArr) {
            if (j10 != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPersonalMessage(MessageObject messageObject) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || messageObject.isStoryReactionPush;
    }

    private boolean isSilentMessage(MessageObject messageObject) {
        return messageObject.messageOwner.silent || messageObject.isReactionPush;
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        dismissNotification();
        setBadge(getTotalAllUnreadCount());
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        editorEdit.clear();
        editorEdit.commit();
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
                    String id2 = vg.a(notificationChannels.get(i10)).getId();
                    if (id2.startsWith(str)) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(id2);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public void lambda$deleteAllNotificationChannels$44() {
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            Map<String, ?> all = notificationsSettings.getAll();
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
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
                    editorEdit.remove(key);
                }
            }
            editorEdit.commit();
        } catch (Exception e9) {
            FileLog.e(e9);
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
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
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
        if (arrayList.isEmpty() || AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return;
        }
        AndroidUtilities.runOnUIThread(new yg(this, arrayList, 2));
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
        float f10 = width / 2;
        path.addRoundRect(0.0f, 0.0f, width, canvas.getHeight(), f10, f10, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        return -3;
    }

    public static void lambda$loadRoundAvatar$47(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new dh());
    }

    public static void lambda$loadTopicsNotificationsExceptions$53(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.x(hashSet);
        }
    }

    public void lambda$loadTopicsNotificationsExceptions$54(long j10, Consumer consumer) {
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(this.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith("notify2_" + j10)) {
                Integer num = Utilities.parseInt((CharSequence) key.replace("notify2_" + j10, ""));
                int iIntValue = num.intValue();
                if (iIntValue != 0 && getMessagesController().isDialogMuted(j10, iIntValue) != getMessagesController().isDialogMuted(j10, 0L)) {
                    hashSet.add(num);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new sg(2, consumer, hashSet));
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$new$1() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
    }

    public static void lambda$playInChatSound$39(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public void lambda$playInChatSound$40() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new ah(1));
            }
            if (this.soundIn == 0 && !this.soundInLoaded) {
                this.soundInLoaded = true;
                this.soundIn = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i10 = this.soundIn;
            if (i10 != 0) {
                try {
                    this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void lambda$playOutChatSound$48(SoundPool soundPool, int i10, int i11) {
        if (i11 == 0) {
            try {
                soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public void lambda$playOutChatSound$49() {
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - this.lastSoundOutPlay) <= 100) {
                return;
            }
            this.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (this.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                this.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new ah(0));
            }
            if (this.soundOut == 0 && !this.soundOutLoaded) {
                this.soundOutLoaded = true;
                this.soundOut = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i10 = this.soundOut;
            if (i10 != 0) {
                try {
                    this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$processDeleteStory$15(long j10, int i10) {
        boolean z10;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.f(j10);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i10));
            if (storyNotification.dateByIds.isEmpty()) {
                this.storyPushMessagesDict.l(j10);
                this.storyPushMessages.remove(storyNotification);
                getMessagesStorage().deleteStoryPushMessage(j10);
                z10 = true;
            } else {
                getMessagesStorage().putStoryPushMessage(storyNotification);
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i11 = 0;
        while (i11 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i11);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i10) {
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
        }
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

    public void lambda$processDialogsUpdateRead$30(LongSparseIntArray longSparseIntArray, ArrayList arrayList) {
        int iIntValue;
        boolean z10;
        boolean zIsGlobalNotificationsEnabled;
        int i10;
        int i11;
        MessageObject messageObject;
        Integer num;
        int i12 = this.total_unread_count;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        int i13 = 0;
        while (true) {
            if (i13 >= longSparseIntArray.size()) {
                break;
            }
            long jKeyAt = longSparseIntArray.keyAt(i13);
            Integer num2 = (Integer) this.pushDialogs.f(jKeyAt);
            int i14 = longSparseIntArray.get(jKeyAt);
            if (DialogObject.isChatDialog(jKeyAt)) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-jKeyAt));
                if (chat == null || chat.min || ChatObject.isNotInChat(chat) || ChatObject.isCommunity(chat)) {
                    i14 = 0;
                }
                if (chat != null) {
                    z10 = chat.forum;
                    iIntValue = i14;
                } else {
                    iIntValue = i14;
                    z10 = false;
                }
            } else {
                iIntValue = i14;
                z10 = false;
            }
            if (z10) {
                zIsGlobalNotificationsEnabled = true;
            } else {
                int notifyOverride = getNotifyOverride(notificationsSettings, jKeyAt, 0L);
                if (notifyOverride == -1) {
                    zIsGlobalNotificationsEnabled = isGlobalNotificationsEnabled(jKeyAt, false, false);
                } else if (notifyOverride != 2) {
                    zIsGlobalNotificationsEnabled = true;
                } else {
                    zIsGlobalNotificationsEnabled = false;
                }
            }
            if (this.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) this.pushDialogsOverrideMention.f(jKeyAt)) != null && num.intValue() != 0) {
                iIntValue = num.intValue();
                zIsGlobalNotificationsEnabled = true;
            }
            if (iIntValue == 0) {
                this.smartNotificationsDialogs.l(jKeyAt);
            }
            if (iIntValue >= 0) {
                if ((zIsGlobalNotificationsEnabled || iIntValue == 0) && num2 != null) {
                    if (getMessagesController().isForum(jKeyAt)) {
                        int i15 = this.total_unread_count;
                        if (num2.intValue() > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.total_unread_count = i15 - i10;
                    } else {
                        this.total_unread_count -= num2.intValue();
                    }
                }
                if (iIntValue == 0) {
                    this.pushDialogs.l(jKeyAt);
                    this.pushDialogsOverrideMention.l(jKeyAt);
                    i11 = 0;
                    while (i11 < this.pushMessages.size()) {
                        messageObject = this.pushMessages.get(i11);
                        if (messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && !messageObject.isStoryReactionPush) {
                            if (isPersonalMessage(messageObject)) {
                                this.personalCount--;
                            }
                            this.pushMessages.remove(i11);
                            i11--;
                            this.delayedPushMessages.remove(messageObject);
                            long j10 = messageObject.messageOwner.peer_id.channel_id;
                            long j11 = j10 != 0 ? -j10 : 0L;
                            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j11);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject.getId());
                                if (sparseArray.size() == 0) {
                                    this.pushMessagesDict.l(j11);
                                }
                            }
                            arrayList.add(messageObject);
                        }
                        i11++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!getMessagesController().isCommunity(jKeyAt)) {
                        if (getMessagesController().isForum(jKeyAt)) {
                            this.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            this.total_unread_count += iIntValue;
                        }
                    }
                    this.pushDialogs.k(Integer.valueOf(iIntValue), jKeyAt);
                }
            } else if (num2 != null) {
                iIntValue += num2.intValue();
                if (zIsGlobalNotificationsEnabled) {
                    if (getMessagesController().isForum(jKeyAt)) {
                        int i16 = this.total_unread_count;
                        if (num2.intValue() > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.total_unread_count = i16 - i10;
                    } else {
                        this.total_unread_count -= num2.intValue();
                    }
                } else if (getMessagesController().isForum(jKeyAt)) {
                    int i17 = this.total_unread_count;
                    if (num2.intValue() > 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    this.total_unread_count = i17 - i10;
                } else {
                    this.total_unread_count -= num2.intValue();
                }
                if (iIntValue == 0) {
                    this.pushDialogs.l(jKeyAt);
                    this.pushDialogsOverrideMention.l(jKeyAt);
                    i11 = 0;
                    while (i11 < this.pushMessages.size()) {
                        messageObject = this.pushMessages.get(i11);
                        if (messageObject.messageOwner.from_scheduled) {
                        }
                        i11++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!getMessagesController().isCommunity(jKeyAt)) {
                        if (getMessagesController().isForum(jKeyAt)) {
                            this.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            this.total_unread_count += iIntValue;
                        }
                    }
                    this.pushDialogs.k(Integer.valueOf(iIntValue), jKeyAt);
                }
            }
            i13++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yg(this, arrayList, 4));
        }
        if (i12 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new wg(this, this.pushDialogs.m(), 0));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$processEditedMessages$22(a0.h hVar) {
        long dialogId;
        int iM = hVar.m();
        boolean z10 = false;
        for (int i10 = 0; i10 < iM; i10++) {
            hVar.j(i10);
            ArrayList arrayList = (ArrayList) hVar.n(i10);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject.isStoryReactionPush) {
                    dialogId = messageObject.getDialogId();
                } else {
                    long j10 = messageObject.messageOwner.peer_id.channel_id;
                    dialogId = j10 != 0 ? -j10 : 0L;
                }
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(dialogId);
                if (sparseArray == null) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.get(messageObject.getId());
                if (messageObject2 != null && (messageObject2.isReactionPush || messageObject2.isStoryReactionPush)) {
                    messageObject2 = null;
                }
                if (messageObject2 != null) {
                    sparseArray.put(messageObject.getId(), messageObject);
                    int iIndexOf = this.pushMessages.indexOf(messageObject2);
                    if (iIndexOf >= 0) {
                        this.pushMessages.set(iIndexOf, messageObject);
                    }
                    int iIndexOf2 = this.delayedPushMessages.indexOf(messageObject2);
                    if (iIndexOf2 >= 0) {
                        this.delayedPushMessages.set(iIndexOf2, messageObject);
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
        boolean zIsEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteAllStoryPushMessages();
        if (zIsEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    public void lambda$processIgnoreStories$19(long j10) {
        boolean zIsEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.b();
        getMessagesStorage().deleteStoryPushMessage(j10);
        if (zIsEmpty) {
            return;
        }
        showOrUpdateNotification(false);
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
        MessageObject messageObject;
        boolean zIsGlobalNotificationsEnabled;
        long dialogId;
        SharedPreferences sharedPreferences;
        boolean zIsGlobalNotificationsEnabled2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j10;
        long j11;
        TLRPC.Message message;
        boolean zBooleanValue;
        NotificationsController notificationsController = this;
        notificationsController.pushDialogs.b();
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.b();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.b();
        boolean z10 = false;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        a0.h hVar2 = new a0.h();
        long j12 = 0;
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                TLRPC.Message message2 = (TLRPC.Message) arrayList.get(i10);
                if (message2 != null && ((messageFwdHeader = message2.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) || (message2.silent && ((messageAction instanceof TLRPC.TL_messageActionContactSignUp) || (messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        j11 = j12;
                    } else {
                        long j13 = message2.peer_id.channel_id;
                        if (j13 != j12) {
                            j10 = -j13;
                            j11 = j12;
                        } else {
                            j10 = j12;
                            j11 = j10;
                        }
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.f(j10);
                        if (sparseArray == null || sparseArray.indexOfKey(message2.f22401id) < 0) {
                            MessageObject messageObject2 = new MessageObject(notificationsController.currentAccount, message2, z10, z10);
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount++;
                            }
                            long dialogId2 = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            long fromChatId = messageObject2.messageOwner.mentioned ? messageObject2.getFromChatId() : dialogId2;
                            int iH = hVar2.h(fromChatId);
                            if (iH < 0 || topicId != j11) {
                                notificationsController = this;
                                int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, fromChatId, topicId);
                                boolean zIsGlobalNotificationsEnabled3 = notifyOverride == -1 ? notificationsController.isGlobalNotificationsEnabled(fromChatId, messageObject2.isReactionPush, messageObject2.isStoryReactionPush) : notifyOverride != 2;
                                message = message2;
                                hVar2.k(Boolean.valueOf(zIsGlobalNotificationsEnabled3), fromChatId);
                                zBooleanValue = zIsGlobalNotificationsEnabled3;
                            } else {
                                zBooleanValue = ((Boolean) hVar2.n(iH)).booleanValue();
                                message = message2;
                                notificationsController = this;
                            }
                            notificationsSettings = notificationsSettings;
                            if (zBooleanValue) {
                                long j14 = fromChatId;
                                if (j14 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn) {
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        notificationsController.pushMessagesDict.k(sparseArray, j10);
                                    }
                                    sparseArray.put(message.f22401id, messageObject2);
                                    notificationsController.appendMessage(messageObject2);
                                    if (dialogId2 != j14) {
                                        Integer num = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId2);
                                        notificationsController.pushDialogsOverrideMention.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), dialogId2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    j11 = j12;
                }
                i10++;
                notificationsSettings = notificationsSettings;
                j12 = j11;
                z10 = false;
            }
        }
        SharedPreferences sharedPreferences2 = notificationsSettings;
        long j15 = j12;
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j16 = hVar.j(i11);
            int iH2 = hVar2.h(j16);
            if (iH2 >= 0) {
                zIsGlobalNotificationsEnabled2 = ((Boolean) hVar2.n(iH2)).booleanValue();
                sharedPreferences = sharedPreferences2;
            } else {
                sharedPreferences = sharedPreferences2;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences, j16, 0L);
                zIsGlobalNotificationsEnabled2 = notifyOverride2 == -1 ? notificationsController.isGlobalNotificationsEnabled(j16, false, false) : notifyOverride2 != 2;
                hVar2.k(Boolean.valueOf(zIsGlobalNotificationsEnabled2), j16);
            }
            if (zIsGlobalNotificationsEnabled2) {
                Integer num2 = (Integer) hVar.n(i11);
                int iIntValue = num2.intValue();
                notificationsController.pushDialogs.k(num2, j16);
                if (!notificationsController.getMessagesController().isCommunity(j16)) {
                    if (notificationsController.getMessagesController().isForum(j16)) {
                        notificationsController.total_unread_count += iIntValue > 0 ? 1 : 0;
                    } else {
                        notificationsController.total_unread_count += iIntValue;
                    }
                }
            }
            i11++;
            sharedPreferences2 = sharedPreferences;
        }
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i12);
                int id2 = messageObject3.getId();
                if (notificationsController.pushMessagesDict.h(id2) < 0) {
                    if (notificationsController.isPersonalMessage(messageObject3)) {
                        notificationsController.personalCount++;
                    }
                    long dialogId3 = messageObject3.getDialogId();
                    long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject3.messageOwner, notificationsController.getMessagesController().isForum(messageObject3));
                    TLRPC.Message message3 = messageObject3.messageOwner;
                    long j17 = message3.random_id;
                    long fromChatId2 = message3.mentioned ? messageObject3.getFromChatId() : dialogId3;
                    int iH3 = hVar2.h(fromChatId2);
                    if (iH3 < 0 || topicId2 != j15) {
                        int notifyOverride3 = notificationsController.getNotifyOverride(sharedPreferences3, fromChatId2, topicId2);
                        if (notifyOverride3 == -1) {
                            messageObject = messageObject3;
                            zIsGlobalNotificationsEnabled = notificationsController.isGlobalNotificationsEnabled(fromChatId2, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                        } else {
                            messageObject = messageObject3;
                            zIsGlobalNotificationsEnabled = notifyOverride3 != 2;
                        }
                        hVar2.k(Boolean.valueOf(zIsGlobalNotificationsEnabled), fromChatId2);
                    } else {
                        zIsGlobalNotificationsEnabled = ((Boolean) hVar2.n(iH3)).booleanValue();
                        messageObject = messageObject3;
                    }
                    if (zIsGlobalNotificationsEnabled && (fromChatId2 != notificationsController.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id2 != 0) {
                            if (messageObject.isStoryReactionPush) {
                                dialogId = messageObject.getDialogId();
                            } else {
                                long j18 = messageObject.messageOwner.peer_id.channel_id;
                                dialogId = j18 != j15 ? -j18 : j15;
                            }
                            SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.f(dialogId);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController.pushMessagesDict.k(sparseArray2, dialogId);
                            }
                            sparseArray2.put(id2, messageObject);
                        } else if (j17 != j15) {
                            notificationsController.fcmRandomMessagesDict.k(messageObject, j17);
                        }
                        notificationsController.appendMessage(messageObject);
                        if (dialogId3 != fromChatId2) {
                            Integer num3 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId3);
                            notificationsController.pushDialogsOverrideMention.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), dialogId3);
                        }
                        Integer num4 = (Integer) notificationsController.pushDialogs.f(fromChatId2);
                        int iIntValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (!notificationsController.getMessagesController().isCommunity(fromChatId2)) {
                            if (notificationsController.getMessagesController().isForum(fromChatId2)) {
                                if (num4 != null) {
                                    notificationsController.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                                }
                                notificationsController.total_unread_count += iIntValue2 > 0 ? 1 : 0;
                            } else {
                                if (num4 != null) {
                                    notificationsController.total_unread_count -= num4.intValue();
                                }
                                notificationsController.total_unread_count += iIntValue2;
                            }
                        }
                        notificationsController.pushDialogs.k(Integer.valueOf(iIntValue2), fromChatId2);
                    }
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j19 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) notificationsController.storyPushMessagesDict.f(j19);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    notificationsController.storyPushMessages.add(storyNotification);
                    notificationsController.storyPushMessagesDict.k(storyNotification, j19);
                }
            }
            Collections.sort(notificationsController.storyPushMessages, Comparator$CC.comparingLong(new ie(2)));
        }
        AndroidUtilities.runOnUIThread(new wg(notificationsController, notificationsController.pushDialogs.m(), 6));
        notificationsController.showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public void lambda$processNewMessages$24(int i10) {
        a0.h hVar = new a0.h();
        hVar.k(p8.l.k(Integer.valueOf(i10)), 0L);
        removeDeletedMessagesFromNotifications(hVar, false);
    }

    public void lambda$processNewMessages$25(ArrayList arrayList, int i10) {
        this.popupMessages.addAll(0, arrayList);
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            if (i10 == 3 || ((i10 == 1 && ApplicationLoader.isScreenOn) || (i10 == 2 && !ApplicationLoader.isScreenOn))) {
                Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
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

    public void lambda$processNewMessages$27(ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        long j10;
        boolean zIsGlobalNotificationsEnabled;
        Integer num;
        boolean z12;
        int i10;
        SharedPreferences sharedPreferences;
        int id2;
        long j11;
        long dialogId;
        boolean z13;
        TLRPC.Chat chat;
        long j12;
        long dialogId2;
        SparseArray sparseArray;
        MessageObject messageObject;
        SharedPreferences sharedPreferences2;
        long j13;
        MessageObject messageObject2;
        long j14;
        boolean z14;
        long topicId;
        TLRPC.Message message;
        long fromChatId;
        int iH;
        int notifyOverride;
        boolean zBooleanValue;
        boolean zIsGlobalNotificationsEnabled2;
        long j15;
        MessageObject messageObject3;
        Integer num2;
        int iIntValue;
        SparseArray sparseArray2;
        int iIndexOf;
        long j16;
        TLRPC.Message message2;
        int i11;
        long j17;
        long currentTime;
        TLRPC.Message message3;
        long jCurrentTimeMillis;
        long j18;
        long dialogId3;
        int id3;
        StoryNotification storyNotification;
        boolean z15;
        boolean z16;
        NotificationsController notificationsController = this;
        a0.h hVar = new a0.h();
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        boolean z17 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i12 = 0;
        boolean z18 = false;
        int iAddToPopupMessages = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (i12 < arrayList.size()) {
            MessageObject messageObject4 = (MessageObject) arrayList.get(i12);
            if (messageObject4.messageOwner == null) {
                if (!MessageObject.isTopicActionMessage(messageObject4)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("skipped message because 1");
                    }
                } else if (messageObject4.isStoryPush) {
                    message3 = messageObject4.messageOwner;
                    if (message3 == null) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = ((long) message3.date) * 1000;
                    }
                    j18 = jCurrentTimeMillis;
                    dialogId3 = messageObject4.getDialogId();
                    id3 = messageObject4.getId();
                    storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.f(dialogId3);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id3), new Pair<>(Long.valueOf(j18), Long.valueOf(j18 + 86400000)));
                        z15 = storyNotification.hidden;
                        z16 = messageObject4.isStoryPushHidden;
                        if (z15 != z16) {
                            storyNotification.hidden = z16;
                            z21 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
                        z19 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId3, messageObject4.localName, id3, j18);
                        storyNotification2.hidden = messageObject4.isStoryPushHidden;
                        notificationsController.storyPushMessages.add(storyNotification2);
                        notificationsController.storyPushMessagesDict.k(storyNotification2, dialogId3);
                        notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z18 = true;
                        z21 = true;
                    }
                    Collections.sort(notificationsController.storyPushMessages, Comparator$CC.comparingLong(new ie(1)));
                    sharedPreferences = notificationsSettings;
                    z12 = z17;
                    i10 = i12;
                } else {
                    if (messageObject4.isOauthPush) {
                        message2 = messageObject4.messageOwner;
                        if (message2 == null) {
                            i11 = message2.f22401id;
                            z12 = z17;
                            j17 = ((long) message2.date) + 60;
                            i10 = i12;
                            currentTime = ConnectionsManager.getInstance(notificationsController.currentAccount).getCurrentTime();
                            if (currentTime > j17) {
                                sharedPreferences = notificationsSettings;
                            } else {
                                AndroidUtilities.runOnUIThread(new wg(notificationsController, i11, 3), (j17 - currentTime) * 1000);
                            }
                        }
                    } else {
                        z12 = z17;
                        i10 = i12;
                    }
                    id2 = messageObject4.getId();
                    if (messageObject4.isFcmMessage()) {
                        j11 = messageObject4.messageOwner.random_id;
                    } else {
                        j11 = 0;
                    }
                    dialogId = messageObject4.getDialogId();
                    if (messageObject4.isFcmMessage()) {
                        z13 = messageObject4.localChannel;
                    } else if (DialogObject.isChatDialog(dialogId)) {
                        chat = notificationsController.getMessagesController().getChat(Long.valueOf(-dialogId));
                        if (ChatObject.isChannel(chat) || chat.megagroup) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                    } else {
                        z13 = false;
                    }
                    if (messageObject4.isStoryReactionPush) {
                        dialogId2 = messageObject4.getDialogId();
                    } else {
                        j12 = messageObject4.messageOwner.peer_id.channel_id;
                        if (j12 != 0) {
                            dialogId2 = -j12;
                        } else {
                            dialogId2 = 0;
                        }
                    }
                    sparseArray = (SparseArray) notificationsController.pushMessagesDict.f(dialogId2);
                    if (sparseArray != null) {
                        messageObject = (MessageObject) sparseArray.get(id2);
                    } else {
                        messageObject = null;
                    }
                    sharedPreferences2 = notificationsSettings;
                    if (messageObject == null) {
                        j13 = j11;
                        j16 = messageObject4.messageOwner.random_id;
                        if (j16 != 0 && (messageObject = (MessageObject) notificationsController.fcmRandomMessagesDict.f(j16)) != null) {
                            notificationsController.fcmRandomMessagesDict.l(messageObject4.messageOwner.random_id);
                        }
                    } else {
                        j13 = j11;
                    }
                    messageObject2 = messageObject;
                    if (messageObject2 != null) {
                        if (messageObject2.isFcmMessage()) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                notificationsController.pushMessagesDict.k(sparseArray, dialogId2);
                            }
                            sparseArray.put(id2, messageObject4);
                            iIndexOf = notificationsController.pushMessages.indexOf(messageObject2);
                            if (iIndexOf >= 0) {
                                notificationsController.pushMessages.set(iIndexOf, messageObject4);
                                iAddToPopupMessages = notificationsController.addToPopupMessages(arrayList2, messageObject4, dialogId, z13, sharedPreferences2);
                                notificationsSettings = sharedPreferences2;
                            } else {
                                notificationsSettings = sharedPreferences2;
                            }
                            if (z10 && (z19 = messageObject4.localEdit)) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject4);
                            }
                        } else {
                            dialogId2 = dialogId2;
                            notificationsSettings = sharedPreferences2;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id2);
                        }
                    } else {
                        notificationsSettings = sharedPreferences2;
                        j14 = dialogId2;
                        z14 = z13;
                        if (z19) {
                            if (z10 && !messageObject4.isOauthPush) {
                                notificationsController.getMessagesStorage().putPushMessage(messageObject4);
                            }
                            sharedPreferences = notificationsSettings;
                            topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
                            if (dialogId == notificationsController.openedDialogId || !ApplicationLoader.isScreenOn || messageObject4.isStoryReactionPush || messageObject4.isOauthPush) {
                                message = messageObject4.messageOwner;
                                if (!message.mentioned) {
                                    fromChatId = dialogId;
                                } else if (!z12 || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    fromChatId = messageObject4.getFromChatId();
                                } else if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because message is mention of pinned");
                                }
                                if (notificationsController.isPersonalMessage(messageObject4)) {
                                    notificationsController.personalCount++;
                                }
                                DialogObject.isChatDialog(fromChatId);
                                iH = hVar.h(fromChatId);
                                if (iH >= 0 || topicId != 0) {
                                    long j19 = fromChatId;
                                    notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j19, topicId);
                                    sharedPreferences = sharedPreferences;
                                    fromChatId = j19;
                                    topicId = topicId;
                                    if (notifyOverride == -1) {
                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z14), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                        }
                                        zBooleanValue = zIsGlobalNotificationsEnabled2;
                                    } else if (notifyOverride != 2) {
                                        zBooleanValue = true;
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    hVar.k(Boolean.valueOf(zBooleanValue), fromChatId);
                                } else {
                                    zBooleanValue = ((Boolean) hVar.n(iH)).booleanValue();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                }
                                if (zBooleanValue) {
                                    notificationsController = this;
                                    j15 = fromChatId;
                                    if (!z10) {
                                        iAddToPopupMessages = notificationsController.addToPopupMessages(arrayList2, messageObject3, j15, z14, sharedPreferences);
                                    }
                                    if (!z20) {
                                        messageObject3 = messageObject4;
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        messageObject3 = messageObject4;
                                        z20 = messageObject3.messageOwner.from_scheduled;
                                    }
                                    messageObject3 = messageObject4;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    messageObject3 = messageObject4;
                                    notificationsController.delayedPushMessages.add(messageObject3);
                                    notificationsController.appendMessage(messageObject3);
                                    if (id2 != 0) {
                                        if (sparseArray == null) {
                                            sparseArray2 = new SparseArray();
                                            notificationsController.pushMessagesDict.k(sparseArray2, j14);
                                        } else {
                                            sparseArray2 = sparseArray;
                                        }
                                        sparseArray2.put(id2, messageObject3);
                                    } else if (j13 != 0) {
                                        notificationsController.fcmRandomMessagesDict.k(messageObject3, j13);
                                    }
                                    if (dialogId != j15) {
                                        num2 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId);
                                        a0.h hVar2 = notificationsController.pushDialogsOverrideMention;
                                        if (num2 == null) {
                                            iIntValue = 1;
                                        } else {
                                            iIntValue = num2.intValue() + 1;
                                        }
                                        hVar2.k(Integer.valueOf(iIntValue), dialogId);
                                    }
                                } else {
                                    notificationsController = this;
                                    j15 = fromChatId;
                                    messageObject3 = messageObject4;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                }
                                if (messageObject3.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(id2, true);
                                    notificationsController.getMessagesController().checkUnreadReactions(j15, topicId, sparseBooleanArray);
                                }
                                z19 = z19;
                                z18 = true;
                            } else {
                                if (!z10) {
                                    notificationsController.playInChatSound();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because chat is already opened (openedDialogId = " + notificationsController.openedDialogId + ")");
                                }
                            }
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because edited");
                        }
                    }
                    sharedPreferences = notificationsSettings;
                }
                sharedPreferences = notificationsSettings;
                z12 = z17;
                i10 = i12;
            } else {
                if (!messageObject4.isImportedForward()) {
                    TLRPC.Message message4 = messageObject4.messageOwner;
                    TLRPC.MessageAction messageAction = message4.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message4.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        if (!MessageObject.isTopicActionMessage(messageObject4)) {
                            if (messageObject4.isStoryPush) {
                                message3 = messageObject4.messageOwner;
                                if (message3 == null) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis = ((long) message3.date) * 1000;
                                }
                                j18 = jCurrentTimeMillis;
                                dialogId3 = messageObject4.getDialogId();
                                id3 = messageObject4.getId();
                                storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.f(dialogId3);
                                if (storyNotification != null) {
                                    storyNotification.dateByIds.put(Integer.valueOf(id3), new Pair<>(Long.valueOf(j18), Long.valueOf(j18 + 86400000)));
                                    z15 = storyNotification.hidden;
                                    z16 = messageObject4.isStoryPushHidden;
                                    if (z15 != z16) {
                                        storyNotification.hidden = z16;
                                        z21 = true;
                                    }
                                    storyNotification.date = storyNotification.getLeastDate();
                                    notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
                                    z19 = true;
                                } else {
                                    StoryNotification storyNotification3 = new StoryNotification(dialogId3, messageObject4.localName, id3, j18);
                                    storyNotification3.hidden = messageObject4.isStoryPushHidden;
                                    notificationsController.storyPushMessages.add(storyNotification3);
                                    notificationsController.storyPushMessagesDict.k(storyNotification3, dialogId3);
                                    notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification3);
                                    z18 = true;
                                    z21 = true;
                                }
                                Collections.sort(notificationsController.storyPushMessages, Comparator$CC.comparingLong(new ie(1)));
                                sharedPreferences = notificationsSettings;
                                z12 = z17;
                                i10 = i12;
                            } else {
                                if (messageObject4.isOauthPush) {
                                    message2 = messageObject4.messageOwner;
                                    if (message2 == null) {
                                        i11 = message2.f22401id;
                                        z12 = z17;
                                        j17 = ((long) message2.date) + 60;
                                        i10 = i12;
                                        currentTime = ConnectionsManager.getInstance(notificationsController.currentAccount).getCurrentTime();
                                        if (currentTime > j17) {
                                            sharedPreferences = notificationsSettings;
                                        } else {
                                            AndroidUtilities.runOnUIThread(new wg(notificationsController, i11, 3), (j17 - currentTime) * 1000);
                                        }
                                    }
                                } else {
                                    z12 = z17;
                                    i10 = i12;
                                }
                                id2 = messageObject4.getId();
                                if (messageObject4.isFcmMessage()) {
                                    j11 = messageObject4.messageOwner.random_id;
                                } else {
                                    j11 = 0;
                                }
                                dialogId = messageObject4.getDialogId();
                                if (messageObject4.isFcmMessage()) {
                                    z13 = messageObject4.localChannel;
                                } else if (DialogObject.isChatDialog(dialogId)) {
                                    chat = notificationsController.getMessagesController().getChat(Long.valueOf(-dialogId));
                                    if (ChatObject.isChannel(chat)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                } else {
                                    z13 = false;
                                }
                                if (messageObject4.isStoryReactionPush) {
                                    dialogId2 = messageObject4.getDialogId();
                                } else {
                                    j12 = messageObject4.messageOwner.peer_id.channel_id;
                                    if (j12 != 0) {
                                        dialogId2 = -j12;
                                    } else {
                                        dialogId2 = 0;
                                    }
                                }
                                sparseArray = (SparseArray) notificationsController.pushMessagesDict.f(dialogId2);
                                if (sparseArray != null) {
                                    messageObject = (MessageObject) sparseArray.get(id2);
                                } else {
                                    messageObject = null;
                                }
                                sharedPreferences2 = notificationsSettings;
                                if (messageObject == null) {
                                    j13 = j11;
                                    j16 = messageObject4.messageOwner.random_id;
                                    if (j16 != 0) {
                                        notificationsController.fcmRandomMessagesDict.l(messageObject4.messageOwner.random_id);
                                    }
                                } else {
                                    j13 = j11;
                                }
                                messageObject2 = messageObject;
                                if (messageObject2 != null) {
                                    if (messageObject2.isFcmMessage()) {
                                        if (sparseArray == null) {
                                            sparseArray = new SparseArray();
                                            notificationsController.pushMessagesDict.k(sparseArray, dialogId2);
                                        }
                                        sparseArray.put(id2, messageObject4);
                                        iIndexOf = notificationsController.pushMessages.indexOf(messageObject2);
                                        if (iIndexOf >= 0) {
                                            notificationsController.pushMessages.set(iIndexOf, messageObject4);
                                            iAddToPopupMessages = notificationsController.addToPopupMessages(arrayList2, messageObject4, dialogId, z13, sharedPreferences2);
                                            notificationsSettings = sharedPreferences2;
                                        } else {
                                            notificationsSettings = sharedPreferences2;
                                        }
                                        if (z10) {
                                            notificationsController.getMessagesStorage().putPushMessage(messageObject4);
                                        }
                                    } else {
                                        dialogId2 = dialogId2;
                                        notificationsSettings = sharedPreferences2;
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id2);
                                    }
                                } else {
                                    notificationsSettings = sharedPreferences2;
                                    j14 = dialogId2;
                                    z14 = z13;
                                    if (z19) {
                                        if (z10) {
                                            notificationsController.getMessagesStorage().putPushMessage(messageObject4);
                                        }
                                        sharedPreferences = notificationsSettings;
                                        topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
                                        if (dialogId == notificationsController.openedDialogId) {
                                            message = messageObject4.messageOwner;
                                            if (!message.mentioned) {
                                                if (!z12) {
                                                }
                                                fromChatId = messageObject4.getFromChatId();
                                            } else {
                                                fromChatId = dialogId;
                                            }
                                            if (notificationsController.isPersonalMessage(messageObject4)) {
                                                notificationsController.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iH = hVar.h(fromChatId);
                                            if (iH >= 0) {
                                                long j110 = fromChatId;
                                                notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j110, topicId);
                                                sharedPreferences = sharedPreferences;
                                                fromChatId = j110;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z14), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                    zBooleanValue = zIsGlobalNotificationsEnabled2;
                                                } else if (notifyOverride != 2) {
                                                    zBooleanValue = true;
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                hVar.k(Boolean.valueOf(zBooleanValue), fromChatId);
                                            } else {
                                                long j111 = fromChatId;
                                                notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j111, topicId);
                                                sharedPreferences = sharedPreferences;
                                                fromChatId = j111;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z14), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                    zBooleanValue = zIsGlobalNotificationsEnabled2;
                                                } else if (notifyOverride != 2) {
                                                    zBooleanValue = true;
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                hVar.k(Boolean.valueOf(zBooleanValue), fromChatId);
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                            }
                                            if (zBooleanValue) {
                                                notificationsController = this;
                                                j15 = fromChatId;
                                                if (!z10) {
                                                    iAddToPopupMessages = notificationsController.addToPopupMessages(arrayList2, messageObject3, j15, z14, sharedPreferences);
                                                }
                                                if (!z20) {
                                                    messageObject3 = messageObject4;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    messageObject3 = messageObject4;
                                                    z20 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                messageObject3 = messageObject4;
                                                notificationsController.delayedPushMessages.add(messageObject3);
                                                notificationsController.appendMessage(messageObject3);
                                                if (id2 != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray2 = new SparseArray();
                                                        notificationsController.pushMessagesDict.k(sparseArray2, j14);
                                                    } else {
                                                        sparseArray2 = sparseArray;
                                                    }
                                                    sparseArray2.put(id2, messageObject3);
                                                } else if (j13 != 0) {
                                                    notificationsController.fcmRandomMessagesDict.k(messageObject3, j13);
                                                }
                                                if (dialogId != j15) {
                                                    num2 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId);
                                                    a0.h hVar3 = notificationsController.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue = 1;
                                                    } else {
                                                        iIntValue = num2.intValue() + 1;
                                                    }
                                                    hVar3.k(Integer.valueOf(iIntValue), dialogId);
                                                }
                                            } else {
                                                notificationsController = this;
                                                j15 = fromChatId;
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                                                sparseBooleanArray2.put(id2, true);
                                                notificationsController.getMessagesController().checkUnreadReactions(j15, topicId, sparseBooleanArray2);
                                            }
                                            z19 = z19;
                                            z18 = true;
                                        } else {
                                            message = messageObject4.messageOwner;
                                            if (!message.mentioned) {
                                                if (!z12) {
                                                }
                                                fromChatId = messageObject4.getFromChatId();
                                            } else {
                                                fromChatId = dialogId;
                                            }
                                            if (notificationsController.isPersonalMessage(messageObject4)) {
                                                notificationsController.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iH = hVar.h(fromChatId);
                                            if (iH >= 0) {
                                                long j112 = fromChatId;
                                                notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j112, topicId);
                                                sharedPreferences = sharedPreferences;
                                                fromChatId = j112;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z14), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                    zBooleanValue = zIsGlobalNotificationsEnabled2;
                                                } else if (notifyOverride != 2) {
                                                    zBooleanValue = true;
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                hVar.k(Boolean.valueOf(zBooleanValue), fromChatId);
                                            } else {
                                                long j113 = fromChatId;
                                                notifyOverride = notificationsController.getNotifyOverride(sharedPreferences, j113, topicId);
                                                sharedPreferences = sharedPreferences;
                                                fromChatId = j113;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z14), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                    zBooleanValue = zIsGlobalNotificationsEnabled2;
                                                } else if (notifyOverride != 2) {
                                                    zBooleanValue = true;
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                hVar.k(Boolean.valueOf(zBooleanValue), fromChatId);
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z14 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                            }
                                            if (zBooleanValue) {
                                                notificationsController = this;
                                                j15 = fromChatId;
                                                if (!z10) {
                                                    iAddToPopupMessages = notificationsController.addToPopupMessages(arrayList2, messageObject3, j15, z14, sharedPreferences);
                                                }
                                                if (!z20) {
                                                    messageObject3 = messageObject4;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    messageObject3 = messageObject4;
                                                    z20 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                messageObject3 = messageObject4;
                                                notificationsController.delayedPushMessages.add(messageObject3);
                                                notificationsController.appendMessage(messageObject3);
                                                if (id2 != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray2 = new SparseArray();
                                                        notificationsController.pushMessagesDict.k(sparseArray2, j14);
                                                    } else {
                                                        sparseArray2 = sparseArray;
                                                    }
                                                    sparseArray2.put(id2, messageObject3);
                                                } else if (j13 != 0) {
                                                    notificationsController.fcmRandomMessagesDict.k(messageObject3, j13);
                                                }
                                                if (dialogId != j15) {
                                                    num2 = (Integer) notificationsController.pushDialogsOverrideMention.f(dialogId);
                                                    a0.h hVar4 = notificationsController.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue = 1;
                                                    } else {
                                                        iIntValue = num2.intValue() + 1;
                                                    }
                                                    hVar4.k(Integer.valueOf(iIntValue), dialogId);
                                                }
                                            } else {
                                                notificationsController = this;
                                                j15 = fromChatId;
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
                                                sparseBooleanArray3.put(id2, true);
                                                notificationsController.getMessagesController().checkUnreadReactions(j15, topicId, sparseBooleanArray3);
                                            }
                                            z19 = z19;
                                            z18 = true;
                                        }
                                    } else if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because edited");
                                    }
                                }
                                sharedPreferences = notificationsSettings;
                            }
                        }
                        sharedPreferences = notificationsSettings;
                        z12 = z17;
                        i10 = i12;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("skipped message because 1");
                }
                sharedPreferences = notificationsSettings;
                z12 = z17;
                i10 = i12;
            }
            i12 = i10 + 1;
            z17 = z12;
            notificationsSettings = sharedPreferences;
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        int i13 = iAddToPopupMessages;
        boolean z22 = z19;
        if (z18) {
            notificationsController.notifyCheck = z11;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new r4(notificationsController, arrayList2, i13, 20));
        }
        if (z10 || z20) {
            if (z22) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + notificationsController.notifyCheck);
                }
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else if (z18) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject5 = (MessageObject) arrayList.get(0);
                long dialogId4 = messageObject5.getDialogId();
                long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject5.messageOwner, notificationsController.getMessagesController().isForum(dialogId4));
                Boolean boolValueOf = messageObject5.isFcmMessage() ? Boolean.valueOf(messageObject5.localChannel) : null;
                int i14 = notificationsController.total_unread_count;
                int notifyOverride2 = notificationsController.getNotifyOverride(sharedPreferences3, dialogId4, topicId2);
                if (notifyOverride2 == -1) {
                    notificationsController = this;
                    j10 = dialogId4;
                    zIsGlobalNotificationsEnabled = notificationsController.isGlobalNotificationsEnabled(dialogId4, boolValueOf, messageObject5.isReactionPush, messageObject5.isStoryReactionPush);
                } else {
                    notificationsController = this;
                    j10 = dialogId4;
                    zIsGlobalNotificationsEnabled = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) notificationsController.pushDialogs.f(j10);
                int iIntValue2 = num3 != null ? num3.intValue() + 1 : 1;
                if (notificationsController.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) notificationsController.pushDialogsOverrideMention.f(j10)) != null && num.intValue() != 0) {
                    iIntValue2 = num.intValue();
                    zIsGlobalNotificationsEnabled = true;
                }
                if (zIsGlobalNotificationsEnabled && !messageObject5.isStoryPush) {
                    if (!notificationsController.getMessagesController().isCommunity(j10)) {
                        if (notificationsController.getMessagesController().isForum(j10)) {
                            int i15 = notificationsController.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                            notificationsController.total_unread_count = i15;
                            notificationsController.total_unread_count = i15 + (iIntValue2 > 0 ? 1 : 0);
                        } else {
                            if (num3 != null) {
                                notificationsController.total_unread_count -= num3.intValue();
                            }
                            notificationsController.total_unread_count += iIntValue2;
                        }
                    }
                    notificationsController.pushDialogs.k(Integer.valueOf(iIntValue2), j10);
                }
                if (i14 != notificationsController.total_unread_count || z21) {
                    notificationsController.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + notificationsController.notifyCheck);
                    }
                    notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
                    AndroidUtilities.runOnUIThread(new wg(notificationsController, notificationsController.pushDialogs.m(), 4));
                }
                notificationsController.notifyCheck = false;
                if (notificationsController.showBadgeNumber) {
                    notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
                }
            }
        }
        if (z21) {
            notificationsController.updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void lambda$processReadMessages$20(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.popupMessages.remove(arrayList.get(i10));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$processReadMessages$21(LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        long j11;
        long dialogId;
        SparseArray sparseArray;
        long dialogId2;
        long j12 = 0;
        if (longSparseIntArray != null) {
            for (int i12 = 0; i12 < longSparseIntArray.size(); i12++) {
                long jKeyAt = longSparseIntArray.keyAt(i12);
                int i13 = longSparseIntArray.get(jKeyAt);
                int i14 = 0;
                while (i14 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i14);
                    if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && messageObject.getId() <= i13 && !messageObject.isStoryReactionPush) {
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            dialogId2 = messageObject.getDialogId();
                        } else {
                            long j13 = messageObject.messageOwner.peer_id.channel_id;
                            dialogId2 = j13 != j12 ? -j13 : j12;
                        }
                        SparseArray sparseArray2 = (SparseArray) this.pushMessagesDict.f(dialogId2);
                        if (sparseArray2 != null) {
                            sparseArray2.remove(messageObject.getId());
                            if (sparseArray2.size() == 0) {
                                this.pushMessagesDict.l(dialogId2);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(i14);
                        i14--;
                    }
                    i14++;
                    j12 = j12;
                }
            }
        }
        long j14 = j12;
        if (j10 != j14 && (i10 != 0 || i11 != 0)) {
            int i15 = 0;
            while (i15 < this.pushMessages.size()) {
                MessageObject messageObject2 = this.pushMessages.get(i15);
                if (messageObject2.getDialogId() == j10 && !messageObject2.isStoryReactionPush) {
                    if (i11 != 0) {
                        if (messageObject2.messageOwner.date <= i11) {
                            if (isPersonalMessage(messageObject2)) {
                                this.personalCount--;
                            }
                            if (messageObject2.isStoryReactionPush) {
                                dialogId = messageObject2.getDialogId();
                            } else {
                                j11 = messageObject2.messageOwner.peer_id.channel_id;
                                if (j11 != j14) {
                                    dialogId = -j11;
                                } else {
                                    dialogId = j14;
                                }
                            }
                            sparseArray = (SparseArray) this.pushMessagesDict.f(dialogId);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject2.getId());
                                if (sparseArray.size() == 0) {
                                    this.pushMessagesDict.l(dialogId);
                                }
                            }
                            this.pushMessages.remove(i15);
                            this.delayedPushMessages.remove(messageObject2);
                            arrayList.add(messageObject2);
                            i15--;
                        }
                    } else if (z10) {
                        if (messageObject2.getId() == i10 || i10 < 0) {
                            if (isPersonalMessage(messageObject2)) {
                                this.personalCount--;
                            }
                            if (messageObject2.isStoryReactionPush) {
                                dialogId = messageObject2.getDialogId();
                            } else {
                                j11 = messageObject2.messageOwner.peer_id.channel_id;
                                if (j11 != j14) {
                                    dialogId = -j11;
                                } else {
                                    dialogId = j14;
                                }
                            }
                            sparseArray = (SparseArray) this.pushMessagesDict.f(dialogId);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject2.getId());
                                if (sparseArray.size() == 0) {
                                    this.pushMessagesDict.l(dialogId);
                                }
                            }
                            this.pushMessages.remove(i15);
                            this.delayedPushMessages.remove(messageObject2);
                            arrayList.add(messageObject2);
                            i15--;
                        }
                    } else if (messageObject2.getId() <= i10 || i10 < 0) {
                        if (isPersonalMessage(messageObject2)) {
                            this.personalCount--;
                        }
                        if (messageObject2.isStoryReactionPush) {
                            dialogId = messageObject2.getDialogId();
                        } else {
                            j11 = messageObject2.messageOwner.peer_id.channel_id;
                            if (j11 != j14) {
                                dialogId = -j11;
                            } else {
                                dialogId = j14;
                            }
                        }
                        sparseArray = (SparseArray) this.pushMessagesDict.f(dialogId);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject2.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.l(dialogId);
                            }
                        }
                        this.pushMessages.remove(i15);
                        this.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i15--;
                    }
                }
                i15++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new yg(this, arrayList, 1));
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
        Integer num;
        int i10 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i11 = 0;
        while (i11 < longSparseIntArray.size()) {
            long jKeyAt = longSparseIntArray.keyAt(i11);
            long j10 = -jKeyAt;
            long j11 = longSparseIntArray.get(jKeyAt);
            Integer num3 = (Integer) this.pushDialogs.f(j10);
            if (num3 == null) {
                num3 = num2;
            }
            Integer numValueOf = num3;
            int i12 = 0;
            while (i12 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i12);
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
                        i12--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i12++;
                num2 = num;
            }
            Integer num4 = num2;
            if (numValueOf.intValue() <= 0) {
                this.smartNotificationsDialogs.l(j10);
                numValueOf = num4;
            }
            if (!numValueOf.equals(num3)) {
                if (!getMessagesController().isCommunity(j10)) {
                    if (getMessagesController().isForum(j10)) {
                        int i13 = this.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        this.total_unread_count = i13;
                        this.total_unread_count = i13 + (numValueOf.intValue() > 0 ? 1 : 0);
                    } else {
                        int iIntValue = this.total_unread_count - num3.intValue();
                        this.total_unread_count = iIntValue;
                        this.total_unread_count = numValueOf.intValue() + iIntValue;
                    }
                }
                this.pushDialogs.k(numValueOf, j10);
            }
            if (numValueOf.intValue() == 0) {
                this.pushDialogs.l(j10);
                this.pushDialogsOverrideMention.l(j10);
            }
            i11++;
            num2 = num4;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yg(this, arrayList, 0));
        }
        if (i10 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new wg(this, this.pushDialogs.m(), 1));
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$removeDeletedMessagesFromNotifications$10(a0.h hVar, boolean z10, ArrayList arrayList) {
        Integer num;
        int i10;
        Integer num2;
        Integer num3;
        int i11 = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num4 = 0;
        int i12 = 0;
        while (i12 < hVar.m()) {
            long j10 = hVar.j(i12);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.f(j10);
            if (sparseArray == null) {
                num = num4;
                i10 = i12;
            } else {
                ArrayList arrayList2 = (ArrayList) hVar.f(j10);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    int iIntValue = ((Integer) arrayList2.get(i13)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(iIntValue);
                    if (messageObject == null) {
                        num2 = num4;
                        i12 = i12;
                    } else if (!messageObject.isStoryReactionPush && (!z10 || messageObject.isReactionPush)) {
                        num2 = num4;
                        long dialogId = messageObject.getDialogId();
                        Integer num5 = (Integer) this.pushDialogs.f(dialogId);
                        if (num5 == null) {
                            num5 = num2;
                        }
                        int iIntValue2 = num5.intValue() - 1;
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        if (iIntValue2 <= 0) {
                            this.smartNotificationsDialogs.l(dialogId);
                            num3 = num2;
                        } else {
                            num3 = numValueOf;
                        }
                        if (!num3.equals(num5)) {
                            if (!getMessagesController().isCommunity(dialogId)) {
                                if (getMessagesController().isForum(dialogId)) {
                                    int i14 = this.total_unread_count - (num5.intValue() > 0 ? 1 : 0);
                                    this.total_unread_count = i14;
                                    this.total_unread_count = i14 + (num3.intValue() > 0 ? 1 : 0);
                                } else {
                                    int iIntValue3 = this.total_unread_count - num5.intValue();
                                    this.total_unread_count = iIntValue3;
                                    this.total_unread_count = num3.intValue() + iIntValue3;
                                }
                            }
                            this.pushDialogs.k(num3, dialogId);
                        }
                        if (num3.intValue() == 0) {
                            this.pushDialogs.l(dialogId);
                            this.pushDialogsOverrideMention.l(dialogId);
                        }
                        sparseArray.remove(iIntValue);
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                    } else {
                        num2 = num4;
                        i12 = i12;
                    }
                    i13++;
                    num4 = num2;
                    i12 = i12;
                }
                num = num4;
                i10 = i12;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.l(j10);
                }
            }
            i12 = i10 + 1;
            num4 = num;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yg(this, arrayList, 3));
        }
        if (i11 != this.total_unread_count) {
            if (this.notifyCheck) {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            } else {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            }
            AndroidUtilities.runOnUIThread(new wg(this, this.pushDialogs.m(), 7));
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
        if (i10 < 11 || i10 > 22) {
            scheduleNotificationRepeat();
        } else {
            notificationManager.b(this.notificationId);
            showOrUpdateNotification(true);
        }
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        float f10;
        int i10;
        Bitmap bitmap;
        Paint paint;
        float f11;
        ArrayList<Object> arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2 == null || arrayList2.size() == 0) {
            return null;
        }
        int iDp = AndroidUtilities.dp(64.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (arrayList2.size() == 1) {
            f10 = 1.0f;
        } else {
            f10 = arrayList2.size() == 2 ? 0.65f : 0.5f;
        }
        int i11 = 0;
        TextPaint textPaint = null;
        while (i11 < arrayList2.size()) {
            float f12 = iDp;
            float f13 = (1.0f - f10) * f12;
            try {
                float size = (f13 / arrayList2.size()) * ((arrayList2.size() - 1) - i11);
                float size2 = i11 * (f13 / arrayList2.size());
                float f14 = f12 * f10;
                float f15 = f14 / 2.0f;
                i10 = iDp;
                float f16 = size + f15;
                bitmap = bitmapCreateBitmap;
                float f17 = size2 + f15;
                f11 = f10;
                try {
                    canvas.drawCircle(f16, f17, AndroidUtilities.dp(2.0f) + f15, paint3);
                    Object obj = arrayList2.get(i11);
                    paint = paint3;
                    try {
                        if (obj instanceof File) {
                            String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            try {
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(absolutePath, options);
                                int i12 = (int) f14;
                                options.inSampleSize = lh.z7.d(options, i12, i12);
                                options.inJustDecodeBounds = false;
                                options.inDither = true;
                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options);
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                                matrix.reset();
                                matrix.postScale(f14 / bitmapDecodeFile.getWidth(), f14 / bitmapDecodeFile.getHeight());
                                matrix.postTranslate(size, size2);
                                bitmapShader.setLocalMatrix(matrix);
                                paint2.setShader(bitmapShader);
                                canvas.drawCircle(f16, f17, f15, paint2);
                                bitmapDecodeFile.recycle();
                            } catch (Throwable unused) {
                            }
                        } else if (obj instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj;
                            try {
                                paint2.setShader(new LinearGradient(size, size2, size, size2 + f14, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(user.f22527id)], false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(user.f22527id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                                canvas.drawCircle(f16, f17, f15, paint2);
                                if (textPaint == null) {
                                    try {
                                        try {
                                            TextPaint textPaint2 = new TextPaint(1);
                                            try {
                                                textPaint2.setTypeface(AndroidUtilities.bold());
                                                textPaint2.setTextSize(f12 * 0.25f);
                                                textPaint2.setColor(-1);
                                                textPaint = textPaint2;
                                            } catch (Throwable unused2) {
                                                textPaint = textPaint2;
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                    } catch (Throwable unused4) {
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                org.telegram.ui.Components.y8.a(user.first_name, user.last_name, null, sb2);
                                String string = sb2.toString();
                                try {
                                    textPaint.getTextBounds(string, 0, string.length(), rect);
                                    canvas.drawText(string, (f16 - (rect.width() / 2.0f)) - rect.left, (f17 - (rect.height() / 2.0f)) - rect.top, textPaint);
                                } catch (Throwable unused5) {
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    } catch (Throwable unused7) {
                    }
                } catch (Throwable unused8) {
                    paint = paint3;
                }
            } catch (Throwable unused9) {
                i10 = iDp;
                bitmap = bitmapCreateBitmap;
                paint = paint3;
                f11 = f10;
            }
            i11++;
            arrayList2 = arrayList;
            iDp = i10;
            bitmapCreateBitmap = bitmap;
            f10 = f11;
            paint3 = paint;
        }
        return bitmapCreateBitmap;
    }

    public static e0.o0 loadRoundAvatar(long j10, File file, e0.o0 o0Var) {
        if (j10 == 489001) {
            o0Var.f5105b = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr);
            return o0Var;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                o0Var.f5105b = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new zg()));
            } catch (Throwable unused) {
            }
        }
        return o0Var;
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        String userName;
        TLRPC.FileLocation fileLocation;
        int iMin = Math.min(3, this.storyPushMessages.size());
        boolean z10 = false;
        int size = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            StoryNotification storyNotification = this.storyPushMessages.get(i10);
            size += storyNotification.dateByIds.size();
            z10 |= storyNotification.hidden;
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(storyNotification.dialogId));
            if (user == null && (user = getMessagesStorage().getUserSync(storyNotification.dialogId)) != null) {
                getMessagesController().putUser(user, true);
            }
            Object obj = null;
            if (user != null) {
                userName = UserObject.getUserName(user);
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    File pathToAttach = getFileLoader().getPathToAttach(user.photo.photo_small, true);
                    if (!pathToAttach.exists()) {
                        pathToAttach = user.photo.photo_big != null ? getFileLoader().getPathToAttach(user.photo.photo_big, true) : null;
                        if (pathToAttach != null && !pathToAttach.exists()) {
                            pathToAttach = null;
                        }
                    }
                    if (pathToAttach != null) {
                        obj = pathToAttach;
                    }
                }
            } else {
                userName = storyNotification.localName;
                if (userName != null) {
                }
            }
            if (userName.length() > 50) {
                userName = userName.substring(0, 25) + "…";
            }
            arrayList.add(userName);
            if (obj == null && user != null) {
                arrayList2.add(user);
            } else if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair<>(Integer.valueOf(size), Boolean.valueOf(z10));
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
                    int i12 = tL_messageEntitySpoiler.offset + i11;
                    char[] cArr = this.spoilerChars;
                    sb2.setCharAt(i12, cArr[i11 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    public void resetNotificationSound(e0.t tVar, long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        FileLog.d("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        String string = uri2.toString();
        String string2 = LocaleController.getString(R.string.DefaultRingtone);
        if (z10) {
            if (i12 == 2) {
                editorEdit.putString("ChannelSound", string2);
            } else if (i12 == 0) {
                editorEdit.putString("GroupSound", string2);
            } else if (i12 == 1) {
                editorEdit.putString("GlobalSound", string2);
            } else if (i12 == 3) {
                editorEdit.putString("StoriesSound", string2);
            } else if (i12 == 4 || i12 == 5) {
                editorEdit.putString("ReactionSound", string2);
            }
            if (i12 == 2) {
                editorEdit.putString("ChannelSoundPath", string);
            } else if (i12 == 0) {
                editorEdit.putString("GroupSoundPath", string);
            } else if (i12 == 1) {
                editorEdit.putString("GlobalSoundPath", string);
            } else if (i12 == 3) {
                editorEdit.putString("StoriesSoundPath", string);
            } else if (i12 == 4 || i12 == 5) {
                editorEdit.putString("ReactionSound", string);
            }
            getNotificationsController().lambda$deleteNotificationChannelGlobal$43(i12, -1);
        } else {
            editorEdit.putString(y1.j(j10, j11, new StringBuilder("sound_")), string2);
            editorEdit.putString(y1.j(j10, j11, new StringBuilder("sound_path_")), string);
            lambda$deleteNotificationChannel$42(j10, j11, -1);
        }
        editorEdit.commit();
        tVar.f5139y = validateChannelId(j10, j11, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
        notificationManager.d(this.notificationId, tVar.b());
    }

    private void scheduleNotificationDelay(boolean z10) {
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay notification start, onlineReason = " + z10);
            }
            this.notificationDelayWakelock.acquire(10000L);
            DispatchQueue dispatchQueue = notificationsQueue;
            dispatchQueue.cancelRunnable(this.notificationDelayRunnable);
            dispatchQueue.postRunnable(this.notificationDelayRunnable, z10 ? 3000 : 1000);
        } catch (Exception e9) {
            FileLog.e(e9);
            showOrUpdateNotification(this.notifyCheck);
        }
    }

    private void scheduleNotificationRepeat() {
        try {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(ApplicationLoader.applicationContext, 0, intent, 33554432);
            int i10 = getAccountInstance().getNotificationsSettings().getInt("repeat_messages", 60);
            if (i10 <= 0 || this.personalCount <= 0) {
                this.alarmManager.cancel(service);
            } else {
                this.alarmManager.set(2, SystemClock.elapsedRealtime() + ((long) (i10 * 60000)), service);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
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
            tVar.f5139y = OTHER_NOTIFICATIONS_CHANNEL;
        } else {
            tVar.f5139y = notification.getChannelId();
        }
    }

    private void showExtraNotifications(e0.t tVar, String str, long j10, long j11, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        boolean z13;
        ArrayList arrayList;
        ArrayList arrayList2;
        a0.h hVar;
        boolean z14;
        long j12;
        long j13;
        int id2;
        MessageObject messageObject;
        ArrayList arrayList3;
        a0.h hVar2;
        Integer num;
        int i13;
        ArrayList arrayList4;
        Integer num2;
        ArrayList arrayList5;
        String str3;
        Notification notification;
        a0.h hVar3;
        DialogKey dialogKey;
        TLRPC.User user;
        String string;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        boolean z15;
        boolean zIsSupergroup;
        boolean z16;
        SharedPreferences sharedPreferences;
        long j14;
        Notification notification2;
        TLRPC.Chat chat2;
        String title;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.Chat chat3;
        String str4;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation4;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String str5;
        String str6;
        String string2;
        String str7;
        File file;
        Bitmap bitmapDecodeFile;
        TLRPC.Chat chat4;
        String str8;
        String str9;
        NotificationsController notificationsController;
        Intent intent;
        String string3;
        e0.k kVarB;
        ArrayList arrayList6;
        int i14;
        int size;
        int[] iArr;
        int i15;
        MessageObject messageObject2;
        Integer num3;
        DialogKey dialogKey2;
        int iMax;
        String str10;
        int i16;
        long j15;
        e0.p0 p0Var;
        boolean z17;
        e0.a0 a0Var;
        int i17;
        boolean z18;
        StringBuilder sb2;
        String[] strArr;
        boolean[] zArr;
        MessageObject messageObject3;
        a0.h hVar4;
        String str11;
        int size2;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList7;
        int i18;
        int i19;
        String str12;
        long j16;
        String str13;
        Bitmap bitmap;
        int i20;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList8;
        MessageObject messageObject4;
        long topicId;
        DialogKey dialogKey3;
        ArrayList arrayList9;
        long j17;
        String shortStringForMessage;
        int i21;
        String str14;
        String str15;
        int i22;
        long senderId;
        String str16;
        a0.h hVar5;
        e0.p0 p0Var2;
        String string4;
        String[] strArr2;
        e0.p0 p0Var3;
        long j18;
        e0.p0 p0VarA;
        int i23;
        File pathToAttach;
        TLRPC.ChatPhoto chatPhoto2;
        TLRPC.FileLocation fileLocation5;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation6;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation7;
        a0.h hVar6;
        ArrayList arrayList10;
        TLRPC.ReplyMarkup replyMarkup;
        int id3;
        ArrayList arrayList11;
        char c10;
        Uri uriD;
        File file2;
        File file3;
        e0.z zVar;
        String str17;
        String str18;
        Uri uriD2;
        ArrayList arrayList12;
        ArrayList arrayList13;
        File file4;
        NotificationsController notificationsController2;
        DialogKey dialogKey4;
        ArrayList arrayList14;
        Intent intent2;
        MessageObject messageObject5;
        DialogKey dialogKey5;
        long[] jArr2;
        int i24;
        long j19;
        String str19;
        e0.g0 g0Var;
        e0.k kVar;
        int i25;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList15;
        Bitmap bitmap2;
        e0.k kVarB2;
        e0.k kVar2;
        MessageObject messageObject6;
        String string5;
        e0.k kVar3;
        e0.k kVar4;
        ArrayList arrayList16;
        long jMin;
        e0.t tVar2;
        ArrayList arrayList17;
        int size3;
        MessageObject messageObject7;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j20;
        TLRPC.User user3;
        boolean z19;
        Notification notification3;
        int size4;
        int i26;
        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow;
        int size5;
        int i27;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton2;
        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback;
        Intent intent3;
        byte[] bArr;
        TLRPC.Message message;
        Intent intent4;
        int i28;
        ArrayList<String> arrayList18;
        ArrayList<Object> arrayList19;
        int iIntValue;
        boolean zBooleanValue;
        ArrayList<Object> arrayList20;
        boolean z20;
        long jMin2;
        int i29;
        ?? r10;
        String pluralString;
        ArrayList arrayList21;
        Bitmap bitmapLoadMultipleAvatars;
        TLRPC.FileLocation fileLocation8;
        e0.o0 o0Var;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation9;
        NotificationsController notificationsController3 = this;
        FileLog.d("showExtraNotifications pushMessages.size()=" + notificationsController3.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            tVar.e(notificationsController3.validateChannelId(j10, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12));
        }
        Notification notificationB = tVar.b();
        SharedPreferences notificationsSettings = notificationsController3.getAccountInstance().getNotificationsSettings();
        ArrayList arrayList22 = new ArrayList();
        if (!notificationsController3.storyPushMessages.isEmpty()) {
            arrayList22.add(new DialogKey(0L, 0L, true));
        }
        a0.h hVar7 = new a0.h();
        int i30 = 0;
        for (int i31 = 0; i31 < notificationsController3.pushMessages.size(); i31++) {
            MessageObject messageObject8 = notificationsController3.pushMessages.get(i31);
            long dialogId = messageObject8.getDialogId();
            long topicId2 = MessageObject.getTopicId(notificationsController3.currentAccount, messageObject8.messageOwner, notificationsController3.getMessagesController().isForum(messageObject8));
            int i32 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (messageObject8.isStoryPush || messageObject8.messageOwner.date > i32) {
                ArrayList arrayList23 = (ArrayList) hVar7.f(dialogId);
                if (arrayList23 == null) {
                    ArrayList arrayListL = y1.l(dialogId, hVar7);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList22.add(new DialogKey(dialogId, topicId2, false));
                    arrayList23 = arrayListL;
                }
                arrayList23.add(messageObject8);
            } else {
                StringBuilder sbQ = a9.p.q(dialogId, "showExtraNotifications: dialog ", " is skipped, message date (");
                sbQ.append(messageObject8.messageOwner.date);
                sbQ.append(" <= ");
                sbQ.append(i32);
                sbQ.append(")");
                FileLog.d(sbQ.toString());
            }
        }
        a0.h hVar8 = new a0.h();
        for (int i33 = 0; i33 < notificationsController3.wearNotificationsIds.m(); i33++) {
            hVar8.k((Integer) notificationsController3.wearNotificationsIds.n(i33), notificationsController3.wearNotificationsIds.j(i33));
        }
        notificationsController3.wearNotificationsIds.b();
        ArrayList arrayList24 = new ArrayList();
        int i34 = Build.VERSION.SDK_INT;
        if (i34 <= 27) {
            z13 = true;
        } else if (arrayList22.size() > (notificationsController3.storyPushMessages.isEmpty() ? 1 : 2)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && i34 >= 26) {
            checkOtherNotificationsChannel();
        }
        long clientUserId = notificationsController3.getUserConfig().getClientUserId();
        boolean z21 = AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
        FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() > 0) + " waitingForPasscode=" + z21 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z13);
        a0.h hVar9 = new a0.h();
        int size6 = arrayList22.size();
        while (true) {
            if (i30 >= size6) {
                arrayList = arrayList24;
                break;
            }
            ArrayList arrayList25 = arrayList24;
            if (arrayList24.size() >= 7) {
                FileLog.d("showExtraNotifications: break from holders, count over 7");
                arrayList = arrayList25;
                break;
            }
            DialogKey dialogKey6 = (DialogKey) arrayList22.get(i30);
            ArrayList arrayList26 = arrayList22;
            int i35 = i30;
            try {
                if (dialogKey6.story) {
                    ArrayList arrayList27 = new ArrayList();
                    if (notificationsController3.storyPushMessages.isEmpty()) {
                        FileLog.d("showExtraNotifications: [" + dialogKey6.dialogId + "] continue; story but storyPushMessages is empty");
                        notification2 = notificationB;
                        sharedPreferences = notificationsSettings;
                        hVar2 = hVar7;
                        z14 = z21;
                        hVar3 = hVar8;
                        hVar9 = hVar9;
                        size6 = size6;
                        z13 = z13;
                        j14 = clientUserId;
                        arrayList25 = arrayList25;
                        arrayList26 = arrayList26;
                        i35 = i35;
                    } else {
                        z14 = z21;
                        long j21 = notificationsController3.storyPushMessages.get(0).dialogId;
                        Iterator<Integer> it = notificationsController3.storyPushMessages.get(0).dateByIds.keySet().iterator();
                        int iMax2 = 0;
                        while (it.hasNext()) {
                            iMax2 = Math.max(iMax2, it.next().intValue());
                            arrayList27 = arrayList27;
                        }
                        arrayList3 = arrayList27;
                        j12 = 0;
                        j13 = j21;
                        id2 = iMax2;
                        messageObject = null;
                    }
                    i30 = i35 + 1;
                    arrayList24 = arrayList25;
                    arrayList22 = arrayList26;
                    z21 = z14;
                    z13 = z13;
                    size6 = size6;
                    hVar7 = hVar2;
                    hVar8 = hVar3;
                    notificationsSettings = sharedPreferences;
                    clientUserId = j14;
                    notificationB = notification2;
                    hVar9 = hVar9;
                } else {
                    z14 = z21;
                    long j22 = dialogKey6.dialogId;
                    long j23 = dialogKey6.topicId;
                    ArrayList arrayList28 = (ArrayList) hVar7.f(j22);
                    j12 = j23;
                    j13 = j22;
                    id2 = ((MessageObject) arrayList28.get(0)).getId();
                    messageObject = (MessageObject) arrayList28.get(0);
                    arrayList3 = arrayList28;
                }
                if (dialogKey6.story) {
                    hVar3 = hVar8;
                    TLRPC.User user4 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                    notification = notificationB;
                    string = notificationsController3.storyPushMessages.size() == 1 ? user4 != null ? UserObject.getFirstName(user4) : notificationsController3.storyPushMessages.get(0).localName : LocaleController.formatPluralString("Stories", notificationsController3.storyPushMessages.size(), new Object[0]);
                    if (user4 == null || (userProfilePhoto4 = user4.photo) == null || (fileLocation9 = userProfilePhoto4.photo_small) == null) {
                        dialogKey = dialogKey6;
                    } else {
                        dialogKey = dialogKey6;
                        if (fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                            fileLocation = fileLocation9;
                            chat = null;
                        }
                        z15 = false;
                        zIsSupergroup = false;
                        z16 = false;
                        user2 = user4;
                    }
                    chat = null;
                    fileLocation = null;
                    z15 = false;
                    zIsSupergroup = false;
                    z16 = false;
                    user2 = user4;
                } else {
                    notification = notificationB;
                    i13 = i13;
                    hVar3 = hVar8;
                    dialogKey = dialogKey6;
                    if (DialogObject.isEncryptedDialog(j13)) {
                        str3 = "Stories";
                        if (j13 != globalSecretChatId) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(j13);
                            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat != null) {
                                user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                if (user == null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found secret chat user to show dialog notification " + encryptedChat.user_id);
                                    }
                                }
                            } else if (BuildVars.LOGS_ENABLED) {
                                FileLog.w("not found secret chat to show dialog notification " + encryptedChatId);
                            }
                            notificationsController3 = this;
                            sharedPreferences = notificationsSettings;
                            hVar9 = hVar9;
                            arrayList25 = arrayList25;
                            arrayList26 = arrayList26;
                            i35 = i35;
                            j14 = clientUserId;
                            notification2 = notification;
                            i30 = i35 + 1;
                            arrayList24 = arrayList25;
                            arrayList22 = arrayList26;
                            z21 = z14;
                            z13 = z13;
                            size6 = size6;
                            hVar7 = hVar2;
                            hVar8 = hVar3;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j14;
                            notificationB = notification2;
                            hVar9 = hVar9;
                        } else {
                            user = null;
                        }
                        string = LocaleController.getString(R.string.SecretChatName);
                        user2 = user;
                        chat = null;
                        fileLocation = null;
                        z15 = false;
                        zIsSupergroup = false;
                        z16 = false;
                    } else {
                        boolean zCanSendPlain = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j13 == 777000) ? false : true;
                        if (DialogObject.isUserDialog(j13)) {
                            user2 = notificationsController3.getMessagesController().getUser(Long.valueOf(j13));
                            if (user2 != null) {
                                String userName = UserObject.getUserName(user2);
                                TLRPC.UserProfilePhoto userProfilePhoto5 = user2.photo;
                                if (userProfilePhoto5 == null || (fileLocation = userProfilePhoto5.photo_small) == null) {
                                    str3 = "Stories";
                                    str5 = userName;
                                } else {
                                    str3 = "Stories";
                                    str5 = userName;
                                    if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                        str6 = str5;
                                    }
                                    if (j13 == 489001) {
                                        string2 = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                    } else if (j13 == 489000) {
                                        string2 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                    } else if (UserObject.isReplyUser(j13)) {
                                        string2 = LocaleController.getString(R.string.RepliesTitle);
                                    } else {
                                        if (j13 == clientUserId) {
                                            string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                        } else {
                                            title = str6;
                                        }
                                        chat2 = null;
                                        zIsSupergroup = false;
                                        z16 = false;
                                        if (j13 == 489000 || messageObject == null || messageObject.getForwardedFromId() == null) {
                                            z15 = zCanSendPlain;
                                            chat3 = chat2;
                                            str4 = title;
                                        } else {
                                            z15 = zCanSendPlain;
                                            Long forwardedFromId = messageObject.getForwardedFromId();
                                            chat3 = chat2;
                                            str4 = title;
                                            long jLongValue = forwardedFromId.longValue();
                                            if (!DialogObject.isUserDialog(jLongValue) ? !((chatPhoto = getMessagesController().getChat(Long.valueOf(-jLongValue)).photo) == null || (fileLocation4 = chatPhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) : !((userProfilePhoto = getMessagesController().getUser(forwardedFromId).photo) == null || (fileLocation4 = userProfilePhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0)) {
                                                fileLocation = fileLocation4;
                                            }
                                        }
                                        string = str4;
                                        chat = chat3;
                                        if (j13 == 489000) {
                                            z15 = false;
                                        }
                                    }
                                    title = string2;
                                    chat2 = null;
                                    zIsSupergroup = false;
                                    z16 = false;
                                    if (j13 == 489000) {
                                        z15 = zCanSendPlain;
                                        chat3 = chat2;
                                        str4 = title;
                                    } else {
                                        z15 = zCanSendPlain;
                                        chat3 = chat2;
                                        str4 = title;
                                    }
                                    string = str4;
                                    chat = chat3;
                                    if (j13 == 489000) {
                                        z15 = false;
                                    }
                                }
                                str6 = str5;
                            } else if (messageObject.isFcmMessage()) {
                                str6 = messageObject.localName;
                                str3 = "Stories";
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found user to show dialog notification " + j13);
                                }
                                sharedPreferences = notificationsSettings;
                                j14 = clientUserId;
                                notification2 = notification;
                            }
                            fileLocation = null;
                            if (j13 == 489001) {
                                string2 = LocaleController.getString(R.string.BotAuthNotificationTitle);
                            } else if (j13 == 489000) {
                                string2 = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isReplyUser(j13)) {
                                string2 = LocaleController.getString(R.string.RepliesTitle);
                            } else {
                                if (j13 == clientUserId) {
                                    string2 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                } else {
                                    title = str6;
                                }
                                chat2 = null;
                                zIsSupergroup = false;
                                z16 = false;
                                if (j13 == 489000) {
                                    z15 = zCanSendPlain;
                                    chat3 = chat2;
                                    str4 = title;
                                } else {
                                    z15 = zCanSendPlain;
                                    chat3 = chat2;
                                    str4 = title;
                                }
                                string = str4;
                                chat = chat3;
                                if (j13 == 489000) {
                                    z15 = false;
                                }
                            }
                            title = string2;
                            chat2 = null;
                            zIsSupergroup = false;
                            z16 = false;
                            if (j13 == 489000) {
                                z15 = zCanSendPlain;
                                chat3 = chat2;
                                str4 = title;
                            } else {
                                z15 = zCanSendPlain;
                                chat3 = chat2;
                                str4 = title;
                            }
                            string = str4;
                            chat = chat3;
                            if (j13 == 489000) {
                                z15 = false;
                            }
                        } else {
                            str3 = "Stories";
                            chat2 = notificationsController3.getMessagesController().getChat(Long.valueOf(-j13));
                            if (chat2 != null) {
                                boolean z22 = chat2.megagroup;
                                boolean z23 = ChatObject.isChannel(chat2) && !chat2.megagroup;
                                title = notificationsController3.getTitle(chat2);
                                boolean z24 = zCanSendPlain;
                                TLRPC.ChatPhoto chatPhoto3 = chat2.photo;
                                if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                    zIsSupergroup = z22;
                                    z16 = z23;
                                } else {
                                    zIsSupergroup = z22;
                                    z16 = z23;
                                    if (fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                                    }
                                    if (j12 != 0) {
                                        fileLocation3 = fileLocation2;
                                        tL_forumTopicFindTopic = notificationsController3.getMessagesController().getTopicsController().findTopic(chat2.f22380id, j12);
                                        if (tL_forumTopicFindTopic != null) {
                                            title = a9.p.n(tL_forumTopicFindTopic.title, " in ", title, new StringBuilder());
                                        }
                                    } else {
                                        fileLocation3 = fileLocation2;
                                    }
                                    if (z24) {
                                        zCanSendPlain = ChatObject.canSendPlain(chat2);
                                    } else {
                                        zCanSendPlain = z24;
                                    }
                                    user2 = null;
                                    fileLocation = fileLocation3;
                                }
                                fileLocation2 = null;
                                if (j12 != 0) {
                                    fileLocation3 = fileLocation2;
                                    tL_forumTopicFindTopic = notificationsController3.getMessagesController().getTopicsController().findTopic(chat2.f22380id, j12);
                                    if (tL_forumTopicFindTopic != null) {
                                        title = a9.p.n(tL_forumTopicFindTopic.title, " in ", title, new StringBuilder());
                                    }
                                } else {
                                    fileLocation3 = fileLocation2;
                                }
                                if (z24) {
                                    zCanSendPlain = ChatObject.canSendPlain(chat2);
                                } else {
                                    zCanSendPlain = z24;
                                }
                                user2 = null;
                                fileLocation = fileLocation3;
                            } else if (messageObject.isFcmMessage()) {
                                zIsSupergroup = messageObject.isSupergroup();
                                chat2 = chat2;
                                title = messageObject.localName;
                                z16 = messageObject.localChannel;
                                zCanSendPlain = false;
                                user2 = null;
                                fileLocation = null;
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found chat to show dialog notification " + j13);
                                }
                                sharedPreferences = notificationsSettings;
                                j14 = clientUserId;
                                notification2 = notification;
                            }
                            if (j13 == 489000) {
                                z15 = zCanSendPlain;
                                chat3 = chat2;
                                str4 = title;
                            } else {
                                z15 = zCanSendPlain;
                                chat3 = chat2;
                                str4 = title;
                            }
                            string = str4;
                            chat = chat3;
                            if (j13 == 489000) {
                                z15 = false;
                            }
                        }
                        i30 = i35 + 1;
                        arrayList24 = arrayList25;
                        arrayList22 = arrayList26;
                        z21 = z14;
                        z13 = z13;
                        size6 = size6;
                        hVar7 = hVar2;
                        hVar8 = hVar3;
                        notificationsSettings = sharedPreferences;
                        clientUserId = j14;
                        notificationB = notification2;
                        hVar9 = hVar9;
                    }
                }
                if (fileLocation != null) {
                    File pathToAttach2 = getFileLoader().getPathToAttach(fileLocation, true);
                    sharedPreferences = notificationsSettings;
                    if (Build.VERSION.SDK_INT < 28) {
                        str7 = str3;
                        BitmapDrawable imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                        if (imageFromMemory != null) {
                            bitmapDecodeFile = imageFromMemory.getBitmap();
                        } else {
                            try {
                                if (pathToAttach2.exists()) {
                                    float fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inSampleSize = fDp < 1.0f ? 1 : (int) fDp;
                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach2.getAbsolutePath(), options);
                                } else {
                                    bitmapDecodeFile = null;
                                }
                            } catch (Throwable unused) {
                                file = pathToAttach2;
                                bitmapDecodeFile = null;
                            }
                        }
                        file = pathToAttach2;
                        if (chat != null) {
                            o0Var = new e0.o0();
                            o0Var.f5104a = string;
                            if (file != 0 && file.exists() && Build.VERSION.SDK_INT >= 28) {
                                loadRoundAvatar(j13, file, o0Var);
                            }
                            hVar9.k(o0Var.a(), -chat.f22380id);
                        }
                        chat4 = chat;
                        str8 = "currentAccount";
                        if (!(z16 || zIsSupergroup) || !z15 || SharedConfig.isWaitingForPasscodeEnter || clientUserId == j13 || UserObject.isReplyUser(j13)) {
                            str9 = string;
                            notificationsController = this;
                        } else {
                            str9 = string;
                            notificationsController = this;
                            if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j13) <= 0) {
                                file = file;
                                bitmapDecodeFile = bitmapDecodeFile;
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                                intent.putExtra("dialog_id", j13);
                                intent.putExtra("max_id", id2);
                                intent.putExtra("topic_id", j12);
                                intent.putExtra("currentAccount", notificationsController.currentAccount);
                                if (arrayList5.isEmpty()) {
                                    user2 = user2;
                                } else {
                                    arrayList6 = new ArrayList();
                                    user2 = user2;
                                    for (i14 = 0; i14 < arrayList5.size(); i14++) {
                                        messageObject2 = (MessageObject) arrayList5.get(i14);
                                        if (messageObject2 == null && messageObject2.isVoice() && messageObject2.isContentUnread() && !messageObject2.isOut()) {
                                            arrayList6.add(Integer.valueOf(messageObject2.getId()));
                                        }
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        size = arrayList6.size();
                                        iArr = new int[size];
                                        for (i15 = 0; i15 < size; i15++) {
                                            iArr[i15] = ((Integer) arrayList6.get(i15)).intValue();
                                        }
                                        intent.putExtra("voice_msg_ids", iArr);
                                    }
                                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                    e0.r0 r0Var = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                    if (DialogObject.isChatDialog(j13)) {
                                        string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                                    } else {
                                        string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                                    }
                                    e0.j jVar = new e0.j(R.drawable.ic_reply_icon, string3, broadcast);
                                    jVar.c();
                                    jVar.f5073g = 1;
                                    jVar.a(r0Var);
                                    jVar.h = false;
                                    kVarB = jVar.b();
                                }
                                PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                                e0.r0 r0Var2 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                                if (DialogObject.isChatDialog(j13)) {
                                    string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                                } else {
                                    string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                                }
                                e0.j jVar2 = new e0.j(R.drawable.ic_reply_icon, string3, broadcast2);
                                jVar2.c();
                                jVar2.f5073g = 1;
                                jVar2.a(r0Var2);
                                jVar2.h = false;
                                kVarB = jVar2.b();
                            }
                            num3 = (Integer) notificationsController.pushDialogs.f(j13);
                            if (num3 == null) {
                                num3 = 0;
                            }
                            dialogKey2 = dialogKey;
                            if (dialogKey2.story) {
                                iMax = notificationsController.storyPushMessages.size();
                            } else {
                                iMax = Math.max(num3.intValue(), arrayList5.size());
                            }
                            if (iMax > 1 || Build.VERSION.SDK_INT >= 28) {
                                str10 = str9;
                            } else {
                                str10 = String.format("%1$s (%2$d)", str9, Integer.valueOf(iMax));
                            }
                            long j24 = clientUserId;
                            e0.p0 p0Var4 = (e0.p0) hVar9.f(j24);
                            i16 = id2;
                            if (Build.VERSION.SDK_INT >= 28 || p0Var4 != null) {
                                j15 = j12;
                            } else {
                                TLRPC.User user5 = notificationsController.getMessagesController().getUser(Long.valueOf(j24));
                                if (user5 == null) {
                                    user5 = notificationsController.getUserConfig().getCurrentUser();
                                }
                                if (user5 != null) {
                                    try {
                                        TLRPC.UserProfilePhoto userProfilePhoto6 = user5.photo;
                                        if (userProfilePhoto6 == null || (fileLocation8 = userProfilePhoto6.photo_small) == null) {
                                            j15 = j12;
                                        } else {
                                            j15 = j12;
                                            try {
                                                if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                    e0.o0 o0Var2 = new e0.o0();
                                                    o0Var2.f5104a = LocaleController.getString(R.string.FromYou);
                                                    loadRoundAvatar(notificationsController.getUserConfig().getClientUserId(), notificationsController.getFileLoader().getPathToAttach(user5.photo.photo_small, true), o0Var2);
                                                    e0.p0 p0VarA2 = o0Var2.a();
                                                    try {
                                                        hVar9.k(p0VarA2, j24);
                                                        p0Var4 = p0VarA2;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        p0Var4 = p0VarA2;
                                                        FileLog.e(th);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        j15 = j12;
                                    }
                                } else {
                                    j15 = j12;
                                }
                            }
                            p0Var = p0Var4;
                            if (messageObject == null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if (p0Var == null && z17) {
                                a0Var = new e0.a0(p0Var);
                            } else {
                                a0Var = new e0.a0();
                            }
                            i17 = Build.VERSION.SDK_INT;
                            if (i17 >= 28 || ((DialogObject.isChatDialog(j13) && !z16) || UserObject.isReplyUser(j13))) {
                                a0Var.f(str10);
                            }
                            if (i17 >= 28 || ((!z16 && DialogObject.isChatDialog(j13)) || UserObject.isReplyUser(j13))) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            a0Var.f5041i = Boolean.valueOf(z18);
                            sb2 = new StringBuilder();
                            strArr = new String[1];
                            j14 = j24;
                            zArr = new boolean[1];
                            if (dialogKey2.story) {
                                arrayList18 = new ArrayList<>();
                                arrayList19 = new ArrayList<>();
                                Pair<Integer, Boolean> storyPushes = notificationsController.parseStoryPushes(arrayList18, arrayList19);
                                iIntValue = ((Integer) storyPushes.first).intValue();
                                zBooleanValue = ((Boolean) storyPushes.second).booleanValue();
                                if (zBooleanValue) {
                                    arrayList20 = arrayList19;
                                    z20 = zBooleanValue;
                                    sb2.append(LocaleController.formatPluralString("StoryNotificationHidden", iIntValue, new Object[0]));
                                } else {
                                    arrayList20 = arrayList19;
                                    z20 = zBooleanValue;
                                    if (arrayList18.isEmpty()) {
                                        FileLog.d("showExtraNotifications: [" + j13 + "] continue; story but names is empty");
                                        notificationsController3 = notificationsController;
                                        notification2 = notification;
                                        i30 = i35 + 1;
                                        arrayList24 = arrayList25;
                                        arrayList22 = arrayList26;
                                        z21 = z14;
                                        z13 = z13;
                                        size6 = size6;
                                        hVar7 = hVar2;
                                        hVar8 = hVar3;
                                        notificationsSettings = sharedPreferences;
                                        clientUserId = j14;
                                        notificationB = notification2;
                                        hVar9 = hVar9;
                                    } else if (arrayList18.size() == 1) {
                                        if (iIntValue == 1) {
                                            sb2.append(LocaleController.getString("StoryNotificationSingle"));
                                        } else {
                                            sb2.append(LocaleController.formatPluralString("StoryNotification1", iIntValue, arrayList18.get(0)));
                                        }
                                    } else if (arrayList18.size() == 2) {
                                        sb2.append(LocaleController.formatString(R.string.StoryNotification2, arrayList18.get(0), arrayList18.get(1)));
                                    } else if (arrayList18.size() == 3 || notificationsController.storyPushMessages.size() != 3) {
                                        sb2.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1))));
                                    } else {
                                        sb2.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1)), notificationsController.cutLastName(arrayList18.get(2))));
                                    }
                                }
                                jMin2 = Long.MAX_VALUE;
                                i29 = 0;
                                while (i29 < notificationsController.storyPushMessages.size()) {
                                    jMin2 = Math.min(notificationsController.storyPushMessages.get(i29).date, jMin2);
                                    i29++;
                                    hVar9 = hVar9;
                                    messageObject = messageObject;
                                }
                                messageObject3 = messageObject;
                                hVar4 = hVar9;
                                a0Var.f5041i = Boolean.FALSE;
                                if (arrayList18.size() == 1 || z20) {
                                    r10 = 0;
                                    pluralString = LocaleController.formatPluralString(str7, iIntValue, new Object[0]);
                                } else {
                                    r10 = 0;
                                    pluralString = arrayList18.get(0);
                                }
                                e0.p0 p0Var5 = new e0.p0();
                                p0Var5.f5106a = pluralString;
                                arrayList8 = null;
                                p0Var5.f5107b = null;
                                p0Var5.f5108c = null;
                                p0Var5.d = null;
                                p0Var5.f5109e = r10;
                                p0Var5.f5110f = r10;
                                e0.z zVar2 = new e0.z(sb2, jMin2, p0Var5);
                                arrayList21 = a0Var.f5038e;
                                arrayList21.add(zVar2);
                                if (arrayList21.size() > 25) {
                                    arrayList21.remove((int) r10);
                                }
                                if (z20) {
                                    bitmapLoadMultipleAvatars = null;
                                } else {
                                    bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList20);
                                }
                                str12 = "currentAccount";
                                bitmap = bitmapLoadMultipleAvatars;
                                j16 = j15;
                                i20 = 0;
                                str13 = pluralString;
                            } else {
                                messageObject3 = messageObject;
                                hVar4 = hVar9;
                                str11 = "showExtraNotifications: [";
                                size2 = arrayList5.size() - 1;
                                arrayList7 = null;
                                i18 = 0;
                                while (true) {
                                    i19 = size2;
                                    if (i19 < 0) {
                                        break;
                                    }
                                    messageObject4 = (MessageObject) arrayList5.get(i19);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList29 = arrayList7;
                                    topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
                                    if (j15 != topicId) {
                                        StringBuilder sbQ2 = a9.p.q(j13, str11, "] continue; topic id is not equal: topicId=");
                                        dialogKey3 = dialogKey2;
                                        arrayList9 = arrayList5;
                                        long j25 = j15;
                                        sbQ2.append(j25);
                                        sbQ2.append(" messageTopicId=");
                                        sbQ2.append(topicId);
                                        sbQ2.append("; selfId=");
                                        sbQ2.append(notificationsController.getUserConfig().getClientUserId());
                                        FileLog.d(sbQ2.toString());
                                        j18 = j25;
                                        i21 = i18;
                                    } else {
                                        dialogKey3 = dialogKey2;
                                        arrayList9 = arrayList5;
                                        j17 = j15;
                                        shortStringForMessage = notificationsController.getShortStringForMessage(messageObject4, strArr, zArr);
                                        if (j13 == 489001) {
                                            strArr[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                            i21 = i18;
                                        } else if (j13 == 489000 || messageObject4.getForwardedFromId() == null) {
                                            i21 = i18;
                                            if (j13 == j14) {
                                                strArr[0] = str9;
                                            } else if (DialogObject.isChatDialog(j13) && messageObject4.messageOwner.from_scheduled) {
                                                strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                            }
                                        } else {
                                            i21 = i18;
                                            strArr[0] = notificationsController.getMessagesController().getPeerName(messageObject4.getForwardedFromId().longValue());
                                        }
                                        if (shortStringForMessage == null) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.w("message text is null for " + messageObject4.getId() + " did = " + messageObject4.getDialogId());
                                            }
                                            j18 = j17;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append("\n\n");
                                            }
                                            if (j13 == j14 && messageObject4.messageOwner.from_scheduled && DialogObject.isUserDialog(j13)) {
                                                zArr = zArr;
                                                shortStringForMessage = String.format("%1$s: %2$s", LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                                sb2.append(shortStringForMessage);
                                            } else {
                                                zArr = zArr;
                                                str14 = strArr[0];
                                                if (str14 != null) {
                                                    sb2.append(String.format("%1$s: %2$s", str14, shortStringForMessage));
                                                } else {
                                                    sb2.append(shortStringForMessage);
                                                }
                                            }
                                            str15 = shortStringForMessage;
                                            i22 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                            if (i22 != 0 && messageObject4.getForwardedFromId() != null) {
                                                senderId = messageObject4.getForwardedFromId().longValue();
                                            } else if (DialogObject.isUserDialog(j13)) {
                                                senderId = j13;
                                            } else if (z16) {
                                                senderId = -j13;
                                            } else if (DialogObject.isChatDialog(j13)) {
                                                senderId = messageObject4.getSenderId();
                                            } else {
                                                senderId = j13;
                                            }
                                            String[] strArr3 = strArr;
                                            str16 = str11;
                                            sb2 = sb2;
                                            hVar5 = hVar4;
                                            p0Var2 = (e0.p0) hVar5.f(senderId + (j17 << 16));
                                            string4 = strArr3[0];
                                            strArr2 = strArr3;
                                            if (string4 == null) {
                                                if (!z14) {
                                                    p0Var3 = p0Var2;
                                                } else if (!DialogObject.isChatDialog(j13)) {
                                                    p0Var3 = p0Var2;
                                                    if (Build.VERSION.SDK_INT > 27) {
                                                        string4 = LocaleController.getString(R.string.NotificationHiddenName);
                                                    }
                                                } else if (z16) {
                                                    p0Var3 = p0Var2;
                                                    if (Build.VERSION.SDK_INT > 27) {
                                                        string4 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                    }
                                                } else {
                                                    p0Var3 = p0Var2;
                                                    string4 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                }
                                                string4 = "";
                                            } else {
                                                p0Var3 = p0Var2;
                                            }
                                            if (p0Var3 == null && TextUtils.equals(p0Var3.b(), string4)) {
                                                j18 = j17;
                                                p0VarA = p0Var3;
                                                str8 = str8;
                                            } else {
                                                e0.o0 o0Var3 = new e0.o0();
                                                o0Var3.f5104a = string4;
                                                if (zArr[0] || DialogObject.isEncryptedDialog(j13)) {
                                                    str8 = str8;
                                                } else {
                                                    str8 = str8;
                                                    if (Build.VERSION.SDK_INT >= 28) {
                                                        if (DialogObject.isUserDialog(j13) || z16) {
                                                            i23 = i22;
                                                            j18 = j17;
                                                            pathToAttach = file;
                                                        } else {
                                                            long senderId2 = messageObject4.getSenderId();
                                                            i23 = i22;
                                                            j18 = j17;
                                                            TLRPC.User user6 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId2));
                                                            if (user6 == null && (user6 = notificationsController.getMessagesStorage().getUserSync(senderId2)) != null) {
                                                                notificationsController.getMessagesController().putUser(user6, true);
                                                            }
                                                            pathToAttach = (user6 == null || (userProfilePhoto3 = user6.photo) == null || (fileLocation7 = userProfilePhoto3.photo_small) == null || fileLocation7.volume_id == 0 || fileLocation7.local_id == 0) ? null : getFileLoader().getPathToAttach(user6.photo.photo_small, true);
                                                        }
                                                        if (pathToAttach == 0 && i23 == 0 && messageObject4.getForwardedFromId() != null) {
                                                            if (senderId >= 0) {
                                                                TLRPC.User user7 = getMessagesController().getUser(Long.valueOf(senderId));
                                                                if (user7 != null && (userProfilePhoto2 = user7.photo) != null && (fileLocation6 = userProfilePhoto2.photo_small) != null && fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                                    pathToAttach = getFileLoader().getPathToAttach(user7.photo.photo_small, true);
                                                                }
                                                            } else {
                                                                TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-senderId));
                                                                if (chat5 != null && (chatPhoto2 = chat5.photo) != null && (fileLocation5 = chatPhoto2.photo_small) != null && fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                                                    pathToAttach = getFileLoader().getPathToAttach(chat5.photo.photo_small, true);
                                                                }
                                                            }
                                                        }
                                                        loadRoundAvatar(j13, pathToAttach, o0Var3);
                                                    }
                                                    p0VarA = o0Var3.a();
                                                    hVar5.k(p0VarA, senderId);
                                                }
                                                j18 = j17;
                                                p0VarA = o0Var3.a();
                                                hVar5.k(p0VarA, senderId);
                                            }
                                            if (DialogObject.isEncryptedDialog(j13)) {
                                                notificationsController = this;
                                                hVar6 = hVar5;
                                                e0.z zVar3 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                arrayList10 = a0Var.f5038e;
                                                arrayList10.add(zVar3);
                                                if (arrayList10.size() > 25) {
                                                    arrayList10.remove(0);
                                                }
                                            } else {
                                                if (zArr[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z14 || messageObject4.isSecretMedia() || !(messageObject4.type == 1 || messageObject4.isSticker())) {
                                                    notificationsController = this;
                                                    hVar6 = hVar5;
                                                } else {
                                                    File pathToMessage = getFileLoader().getPathToMessage(messageObject4.messageOwner);
                                                    if (pathToMessage.exists() && messageObject4.hasMediaSpoilers()) {
                                                        file3 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                        if (file3.exists()) {
                                                            notificationsController = this;
                                                            file4 = pathToMessage;
                                                            hVar6 = hVar5;
                                                        } else {
                                                            try {
                                                                Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                                Bitmap bitmapStackBlurBitmapMax = Utilities.stackBlurBitmapMax(bitmapDecodeFile2);
                                                                bitmapDecodeFile2.recycle();
                                                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapStackBlurBitmapMax, bitmapDecodeFile2.getWidth(), bitmapDecodeFile2.getHeight(), true);
                                                                Utilities.stackBlurBitmap(bitmapCreateScaledBitmap, 5);
                                                                bitmapStackBlurBitmapMax.recycle();
                                                                Canvas canvas = new Canvas(bitmapCreateScaledBitmap);
                                                                notificationsController = this;
                                                                try {
                                                                    file4 = pathToMessage;
                                                                    try {
                                                                        notificationsController.mediaSpoilerEffect.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                        hVar6 = hVar5;
                                                                        try {
                                                                            notificationsController.mediaSpoilerEffect.setBounds(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
                                                                            notificationsController.mediaSpoilerEffect.draw(canvas);
                                                                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                            fileOutputStream.close();
                                                                            bitmapCreateScaledBitmap.recycle();
                                                                            file2 = file3;
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            FileLog.e(e);
                                                                            file2 = file4;
                                                                        }
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        hVar6 = hVar5;
                                                                        FileLog.e(e);
                                                                        file2 = file4;
                                                                        zVar = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                        if (messageObject4.isSticker()) {
                                                                            str17 = "image/webp";
                                                                        } else {
                                                                            str17 = "image/jpeg";
                                                                        }
                                                                        str18 = str17;
                                                                        if (file2.exists()) {
                                                                            try {
                                                                                uriD2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file2);
                                                                            } catch (Exception e11) {
                                                                                FileLog.e(e11);
                                                                                uriD2 = null;
                                                                            }
                                                                        } else if (notificationsController.getFileLoader().isLoadingFile(file2.getName())) {
                                                                            uriD2 = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController.currentAccount + "").appendPath(file2.getName()).appendQueryParameter("final_path", file2.getAbsolutePath()).build();
                                                                        } else {
                                                                            uriD2 = null;
                                                                        }
                                                                        if (uriD2 != null) {
                                                                            zVar.f5144e = str18;
                                                                            zVar.f5145f = uriD2;
                                                                            arrayList12 = a0Var.f5038e;
                                                                            arrayList12.add(zVar);
                                                                            if (arrayList12.size() > 25) {
                                                                                arrayList12.remove(0);
                                                                            }
                                                                            ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriD2, 1);
                                                                            AndroidUtilities.runOnUIThread(new sg(1, uriD2, file3), 20000L);
                                                                            if (!TextUtils.isEmpty(messageObject4.caption)) {
                                                                                e0.z zVar4 = new e0.z(messageObject4.caption, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                                arrayList13 = a0Var.f5038e;
                                                                                arrayList13.add(zVar4);
                                                                                if (arrayList13.size() > 25) {
                                                                                    arrayList13.remove(0);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            e0.z zVar5 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                            arrayList11 = a0Var.f5038e;
                                                                            arrayList11.add(zVar5);
                                                                            if (arrayList11.size() > 25) {
                                                                                c10 = 0;
                                                                                arrayList11.remove(0);
                                                                            }
                                                                            if (!zArr[c10]) {
                                                                            }
                                                                            if (j13 == 777000) {
                                                                                replyMarkup = messageObject4.messageOwner.reply_markup;
                                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList30 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                    id3 = messageObject4.getId();
                                                                                    arrayList7 = arrayList30;
                                                                                } else {
                                                                                    id3 = i21;
                                                                                    arrayList7 = arrayList29;
                                                                                }
                                                                            } else {
                                                                                id3 = i21;
                                                                                arrayList7 = arrayList29;
                                                                            }
                                                                            size2 = i19 - 1;
                                                                            i18 = id3;
                                                                            notificationsController = notificationsController;
                                                                            zArr = zArr;
                                                                            strArr = strArr2;
                                                                            arrayList5 = arrayList9;
                                                                            dialogKey2 = dialogKey3;
                                                                            sb2 = sb2;
                                                                            str8 = str8;
                                                                            str11 = str16;
                                                                            hVar4 = hVar6;
                                                                            j15 = j18;
                                                                        }
                                                                        c10 = 0;
                                                                        if (!zArr[c10]) {
                                                                        }
                                                                        if (j13 == 777000) {
                                                                            replyMarkup = messageObject4.messageOwner.reply_markup;
                                                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList31 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                id3 = messageObject4.getId();
                                                                                arrayList7 = arrayList31;
                                                                            } else {
                                                                                id3 = i21;
                                                                                arrayList7 = arrayList29;
                                                                            }
                                                                        } else {
                                                                            id3 = i21;
                                                                            arrayList7 = arrayList29;
                                                                        }
                                                                        size2 = i19 - 1;
                                                                        i18 = id3;
                                                                        notificationsController = notificationsController;
                                                                        zArr = zArr;
                                                                        strArr = strArr2;
                                                                        arrayList5 = arrayList9;
                                                                        dialogKey2 = dialogKey3;
                                                                        sb2 = sb2;
                                                                        str8 = str8;
                                                                        str11 = str16;
                                                                        hVar4 = hVar6;
                                                                        j15 = j18;
                                                                    }
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    file4 = pathToMessage;
                                                                    hVar6 = hVar5;
                                                                    FileLog.e(e);
                                                                    file2 = file4;
                                                                    zVar = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                    if (messageObject4.isSticker()) {
                                                                        str17 = "image/webp";
                                                                    } else {
                                                                        str17 = "image/jpeg";
                                                                    }
                                                                    str18 = str17;
                                                                    if (file2.exists()) {
                                                                        uriD2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file2);
                                                                    } else if (notificationsController.getFileLoader().isLoadingFile(file2.getName())) {
                                                                        uriD2 = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController.currentAccount + "").appendPath(file2.getName()).appendQueryParameter("final_path", file2.getAbsolutePath()).build();
                                                                    } else {
                                                                        uriD2 = null;
                                                                    }
                                                                    if (uriD2 != null) {
                                                                        zVar.f5144e = str18;
                                                                        zVar.f5145f = uriD2;
                                                                        arrayList12 = a0Var.f5038e;
                                                                        arrayList12.add(zVar);
                                                                        if (arrayList12.size() > 25) {
                                                                            arrayList12.remove(0);
                                                                        }
                                                                        ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriD2, 1);
                                                                        AndroidUtilities.runOnUIThread(new sg(1, uriD2, file3), 20000L);
                                                                        if (!TextUtils.isEmpty(messageObject4.caption)) {
                                                                            e0.z zVar6 = new e0.z(messageObject4.caption, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                            arrayList13 = a0Var.f5038e;
                                                                            arrayList13.add(zVar6);
                                                                            if (arrayList13.size() > 25) {
                                                                                arrayList13.remove(0);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        e0.z zVar7 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                                        arrayList11 = a0Var.f5038e;
                                                                        arrayList11.add(zVar7);
                                                                        if (arrayList11.size() > 25) {
                                                                            c10 = 0;
                                                                            arrayList11.remove(0);
                                                                        }
                                                                        if (!zArr[c10]) {
                                                                        }
                                                                        if (j13 == 777000) {
                                                                            replyMarkup = messageObject4.messageOwner.reply_markup;
                                                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList32 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                                id3 = messageObject4.getId();
                                                                                arrayList7 = arrayList32;
                                                                            } else {
                                                                                id3 = i21;
                                                                                arrayList7 = arrayList29;
                                                                            }
                                                                        } else {
                                                                            id3 = i21;
                                                                            arrayList7 = arrayList29;
                                                                        }
                                                                        size2 = i19 - 1;
                                                                        i18 = id3;
                                                                        notificationsController = notificationsController;
                                                                        zArr = zArr;
                                                                        strArr = strArr2;
                                                                        arrayList5 = arrayList9;
                                                                        dialogKey2 = dialogKey3;
                                                                        sb2 = sb2;
                                                                        str8 = str8;
                                                                        str11 = str16;
                                                                        hVar4 = hVar6;
                                                                        j15 = j18;
                                                                    }
                                                                    c10 = 0;
                                                                    if (!zArr[c10]) {
                                                                    }
                                                                    if (j13 == 777000) {
                                                                        replyMarkup = messageObject4.messageOwner.reply_markup;
                                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList33 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                            id3 = messageObject4.getId();
                                                                            arrayList7 = arrayList33;
                                                                        } else {
                                                                            id3 = i21;
                                                                            arrayList7 = arrayList29;
                                                                        }
                                                                    } else {
                                                                        id3 = i21;
                                                                        arrayList7 = arrayList29;
                                                                    }
                                                                    size2 = i19 - 1;
                                                                    i18 = id3;
                                                                    notificationsController = notificationsController;
                                                                    zArr = zArr;
                                                                    strArr = strArr2;
                                                                    arrayList5 = arrayList9;
                                                                    dialogKey2 = dialogKey3;
                                                                    sb2 = sb2;
                                                                    str8 = str8;
                                                                    str11 = str16;
                                                                    hVar4 = hVar6;
                                                                    j15 = j18;
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                notificationsController = this;
                                                            }
                                                        }
                                                        file2 = file4;
                                                    } else {
                                                        notificationsController = this;
                                                        hVar6 = hVar5;
                                                        file2 = pathToMessage;
                                                        file3 = null;
                                                    }
                                                    zVar = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                    if (messageObject4.isSticker()) {
                                                        str17 = "image/webp";
                                                    } else {
                                                        str17 = "image/jpeg";
                                                    }
                                                    str18 = str17;
                                                    if (file2.exists()) {
                                                        uriD2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file2);
                                                    } else if (notificationsController.getFileLoader().isLoadingFile(file2.getName())) {
                                                        uriD2 = new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController.currentAccount + "").appendPath(file2.getName()).appendQueryParameter("final_path", file2.getAbsolutePath()).build();
                                                    } else {
                                                        uriD2 = null;
                                                    }
                                                    if (uriD2 != null) {
                                                        zVar.f5144e = str18;
                                                        zVar.f5145f = uriD2;
                                                        arrayList12 = a0Var.f5038e;
                                                        arrayList12.add(zVar);
                                                        if (arrayList12.size() > 25) {
                                                            arrayList12.remove(0);
                                                        }
                                                        ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriD2, 1);
                                                        AndroidUtilities.runOnUIThread(new sg(1, uriD2, file3), 20000L);
                                                        if (!TextUtils.isEmpty(messageObject4.caption)) {
                                                            e0.z zVar8 = new e0.z(messageObject4.caption, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                            arrayList13 = a0Var.f5038e;
                                                            arrayList13.add(zVar8);
                                                            if (arrayList13.size() > 25) {
                                                                arrayList13.remove(0);
                                                            }
                                                        }
                                                    }
                                                    c10 = 0;
                                                    if (!zArr[c10] && !z14 && messageObject4.isVoice()) {
                                                        ArrayList arrayList34 = (ArrayList) a0Var.d();
                                                        if (!arrayList34.isEmpty()) {
                                                            File pathToMessage2 = notificationsController.getFileLoader().getPathToMessage(messageObject4.messageOwner);
                                                            if (pathToMessage2.exists()) {
                                                                if (Build.VERSION.SDK_INT >= 24) {
                                                                    try {
                                                                        uriD = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", pathToMessage2);
                                                                    } catch (Exception unused2) {
                                                                        uriD = null;
                                                                    }
                                                                } else {
                                                                    uriD = Uri.fromFile(pathToMessage2);
                                                                }
                                                                if (uriD != null) {
                                                                    e0.z zVar9 = (e0.z) i0.a.i(1, arrayList34);
                                                                    zVar9.f5144e = "audio/ogg";
                                                                    zVar9.f5145f = uriD;
                                                                }
                                                            } else if (messageObject4.getDocument() != null) {
                                                                String attachFileName = FileLoader.getAttachFileName(messageObject4.getDocument());
                                                                if (!notificationsController.pendingVoiceLoads.contains(attachFileName)) {
                                                                    notificationsController.pendingVoiceLoads.add(attachFileName);
                                                                    notificationsController.getFileLoader().loadFile(messageObject4.getDocument(), messageObject4, 3, 0);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                e0.z zVar10 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                arrayList11 = a0Var.f5038e;
                                                arrayList11.add(zVar10);
                                                if (arrayList11.size() > 25) {
                                                    c10 = 0;
                                                    arrayList11.remove(0);
                                                } else {
                                                    c10 = 0;
                                                }
                                                if (!zArr[c10]) {
                                                }
                                            }
                                            if (j13 == 777000) {
                                                replyMarkup = messageObject4.messageOwner.reply_markup;
                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList35 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                    id3 = messageObject4.getId();
                                                    arrayList7 = arrayList35;
                                                } else {
                                                    id3 = i21;
                                                    arrayList7 = arrayList29;
                                                }
                                            } else {
                                                id3 = i21;
                                                arrayList7 = arrayList29;
                                            }
                                        }
                                        size2 = i19 - 1;
                                        i18 = id3;
                                        notificationsController = notificationsController;
                                        zArr = zArr;
                                        strArr = strArr2;
                                        arrayList5 = arrayList9;
                                        dialogKey2 = dialogKey3;
                                        sb2 = sb2;
                                        str8 = str8;
                                        str11 = str16;
                                        hVar4 = hVar6;
                                        j15 = j18;
                                    }
                                    str16 = str11;
                                    hVar6 = hVar4;
                                    strArr2 = strArr;
                                    id3 = i21;
                                    arrayList7 = arrayList29;
                                    size2 = i19 - 1;
                                    i18 = id3;
                                    notificationsController = notificationsController;
                                    zArr = zArr;
                                    strArr = strArr2;
                                    arrayList5 = arrayList9;
                                    dialogKey2 = dialogKey3;
                                    sb2 = sb2;
                                    str8 = str8;
                                    str11 = str16;
                                    hVar4 = hVar6;
                                    j15 = j18;
                                }
                                str12 = str8;
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList36 = arrayList7;
                                j16 = j15;
                                str13 = str9;
                                bitmap = bitmapDecodeFile;
                                i20 = i18;
                                arrayList8 = arrayList36;
                            }
                            notificationsController2 = notificationsController;
                            dialogKey4 = dialogKey2;
                            arrayList14 = arrayList5;
                            StringBuilder sb3 = sb2;
                            a0.h hVar10 = hVar4;
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
                            intent2.setFlags(67108864);
                            intent2.addCategory("android.intent.category.LAUNCHER");
                            messageObject5 = messageObject3;
                            if (messageObject3 == null && messageObject5.isOauthPush) {
                                intent2.putExtra("oauth_url", messageObject5.localName);
                            } else if (messageObject5 == null && messageObject5.isStoryReactionPush) {
                                intent2.putExtra("storyId", Math.abs(messageObject5.getId()));
                            } else {
                                if (messageObject5 == null && messageObject5.isLiveStoryPush) {
                                    if (j13 < 0) {
                                        intent2.putExtra("chatId", -j13);
                                    } else if (j13 > 0) {
                                        intent2.putExtra("userId", j13);
                                    }
                                    intent2.putExtra("storyId", Math.abs(messageObject5.getId()));
                                } else {
                                    dialogKey5 = dialogKey4;
                                    if (dialogKey5.story) {
                                        jArr2 = new long[notificationsController2.storyPushMessages.size()];
                                        for (i24 = 0; i24 < notificationsController2.storyPushMessages.size(); i24++) {
                                            jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                                        }
                                        intent2.putExtra("storyDialogIds", jArr2);
                                    } else if (DialogObject.isEncryptedDialog(j13)) {
                                        intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                    } else if (DialogObject.isUserDialog(j13)) {
                                        intent2.putExtra("userId", j13);
                                    } else {
                                        intent2.putExtra("chatId", -j13);
                                    }
                                }
                                j19 = j16;
                                i0.a.y(a9.p.q(j13, "show extra notifications chatId ", " topicId "), j19);
                                if (j19 != 0) {
                                    intent2.putExtra("topicId", j19);
                                }
                                str19 = str12;
                                intent2.putExtra(str19, notificationsController2.currentAccount);
                                PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 1140850688);
                                g0Var = new e0.g0();
                                kVar = kVarB;
                                if (kVarB != null) {
                                    g0Var.a(kVar);
                                }
                                i25 = i20;
                                Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                                intent5.addFlags(32);
                                intent5.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent5.putExtra("dialog_id", j13);
                                intent5.putExtra("max_id", i16);
                                intent5.putExtra(str19, notificationsController2.currentAccount);
                                arrayList15 = arrayList8;
                                bitmap2 = bitmap;
                                e0.j jVar3 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent5, 167772160));
                                jVar3.f5073g = 2;
                                jVar3.h = false;
                                kVarB2 = jVar3.b();
                                if (!DialogObject.isEncryptedDialog(j13)) {
                                    kVar2 = kVarB2;
                                    messageObject6 = messageObject5;
                                    if (j13 != globalSecretChatId) {
                                        string5 = "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i16;
                                    } else {
                                        string5 = null;
                                    }
                                } else if (DialogObject.isUserDialog(j13)) {
                                    kVar2 = kVarB2;
                                    messageObject6 = messageObject5;
                                    string5 = "tguser" + j13 + "_" + i16;
                                } else {
                                    StringBuilder sb4 = new StringBuilder("tgchat");
                                    kVar2 = kVarB2;
                                    messageObject6 = messageObject5;
                                    sb4.append(-j13);
                                    sb4.append("_");
                                    sb4.append(i16);
                                    string5 = sb4.toString();
                                }
                                if (string5 != null) {
                                    g0Var.f5061g = string5;
                                    e0.g0 g0Var2 = new e0.g0();
                                    g0Var2.f5061g = "summary_".concat(string5);
                                    tVar.c(g0Var2);
                                }
                                StringBuilder sb5 = new StringBuilder("tgaccount");
                                kVar3 = kVar2;
                                j14 = j14;
                                sb5.append(j14);
                                g0Var.b(sb5.toString());
                                if (dialogKey5.story) {
                                    jMin = Long.MAX_VALUE;
                                    i28 = 0;
                                    while (i28 < notificationsController2.storyPushMessages.size()) {
                                        jMin = Math.min(notificationsController2.storyPushMessages.get(i28).date, jMin);
                                        i28++;
                                        kVar3 = kVar3;
                                    }
                                    kVar4 = kVar3;
                                    arrayList16 = arrayList14;
                                } else {
                                    kVar4 = kVar3;
                                    arrayList16 = arrayList14;
                                    jMin = ((long) ((MessageObject) arrayList16.get(0)).messageOwner.date) * 1000;
                                }
                                tVar2 = new e0.t(ApplicationLoader.applicationContext);
                                tVar2.g(str13);
                                arrayList17 = arrayList16;
                                tVar2.E.icon = R.drawable.notification;
                                tVar2.f(sb3.toString());
                                tVar2.h(16, true);
                                if (dialogKey5.story) {
                                    size3 = notificationsController2.storyPushMessages.size();
                                } else {
                                    size3 = arrayList17.size();
                                }
                                tVar2.f5124i = size3;
                                tVar2.f5137w = -15618822;
                                tVar2.f5133r = false;
                                tVar2.E.when = jMin;
                                tVar2.f5126k = true;
                                tVar2.n(a0Var);
                                tVar2.f5123g = activity;
                                tVar2.c(g0Var);
                                tVar2.l(String.valueOf(Long.MAX_VALUE - jMin));
                                tVar2.f5136u = "msg";
                                intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent4.putExtra("messageDate", i13);
                                intent4.putExtra("dialogId", j13);
                                intent4.putExtra(str19, notificationsController2.currentAccount);
                                if (dialogKey5.story) {
                                    intent4.putExtra("story", true);
                                }
                                if (messageObject6 != null) {
                                    messageObject7 = messageObject6;
                                    try {
                                        if (messageObject7.isStoryReactionPush) {
                                            intent4.putExtra("storyReaction", true);
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        FileLog.e(e);
                                    }
                                } else {
                                    messageObject7 = messageObject6;
                                }
                                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160);
                                if (z13 != 0) {
                                    tVar2.f5132q = notificationsController2.notificationGroup;
                                    tVar2.i();
                                }
                                if (messageObject7 != null || (message = messageObject7.messageOwner) == null) {
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                } else {
                                    TLRPC.ReplyMarkup replyMarkup2 = message.reply_markup;
                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                        TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup2;
                                        tL_inlineButtonTypeCopy = null;
                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = null;
                                        for (int i36 = 0; i36 < tL_replyInlineMarkup.rows.size(); i36++) {
                                            int i37 = 0;
                                            while (i37 < tL_replyInlineMarkup.rows.get(i36).buttons.size()) {
                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton4 = tL_replyInlineMarkup.rows.get(i36).buttons.get(i37);
                                                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) hf.c.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                if (tL_inlineButtonTypeCopy2 != null) {
                                                    keyboardInlineButton3 = keyboardInlineButton4;
                                                    tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                    break;
                                                } else {
                                                    i37++;
                                                    tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                }
                                            }
                                            if (keyboardInlineButton3 != null) {
                                                break;
                                            }
                                        }
                                        keyboardInlineButton = keyboardInlineButton3;
                                    } else {
                                        keyboardInlineButton = null;
                                        tL_inlineButtonTypeCopy = null;
                                    }
                                }
                                if (keyboardInlineButton != null) {
                                    Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                                    intent6.addFlags(32);
                                    intent6.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                    intent6.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                    e0.j jVar4 = new e0.j(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent6, 167772160));
                                    jVar4.h = false;
                                    tVar2.f5119b.add(jVar4.b());
                                }
                                j20 = dialogKey5.dialogId;
                                if (j20 != 489000 && j20 != 489001) {
                                    if (kVar != null) {
                                        tVar2.f5119b.add(kVar);
                                    }
                                    if (!z14 && !dialogKey5.story && (messageObject7 == null || !messageObject7.isStoryReactionPush)) {
                                        tVar2.f5119b.add(kVar4);
                                    }
                                }
                                if (arrayList26.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey5.story) {
                                    tVar2.o(str);
                                }
                                if (DialogObject.isEncryptedDialog(j13)) {
                                    tVar2.k();
                                }
                                if (bitmap2 != null) {
                                    tVar2.j(bitmap2);
                                }
                                if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList15 != null) {
                                    size4 = arrayList15.size();
                                    i26 = 0;
                                    while (i26 < size4) {
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList37 = arrayList15;
                                        keyboardInlineButtonRow = arrayList37.get(i26);
                                        size5 = keyboardInlineButtonRow.buttons.size();
                                        i27 = 0;
                                        while (i27 < size5) {
                                            keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i27);
                                            tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) hf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                            int i38 = size4;
                                            if (tL_inlineButtonTypeCallback != null) {
                                                intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                intent3.putExtra(str19, notificationsController2.currentAccount);
                                                intent3.putExtra("did", j13);
                                                bArr = tL_inlineButtonTypeCallback.data;
                                                if (bArr != null) {
                                                    intent3.putExtra("data", bArr);
                                                }
                                                intent3.putExtra("mid", i25);
                                                String str20 = keyboardInlineButton2.text;
                                                Context context = ApplicationLoader.applicationContext;
                                                int i39 = notificationsController2.lastButtonId;
                                                notificationsController2.lastButtonId = i39 + 1;
                                                tVar2.a(0, str20, PendingIntent.getBroadcast(context, i39, intent3, 167772160));
                                            }
                                            i27++;
                                            size4 = i38;
                                            keyboardInlineButtonRow = keyboardInlineButtonRow;
                                        }
                                        i26++;
                                        arrayList15 = arrayList37;
                                    }
                                }
                                if (chat4 == null || user2 == null) {
                                    user3 = user2;
                                } else {
                                    user3 = user2;
                                    String str21 = user3.phone;
                                    if (str21 != null && str21.length() > 0) {
                                        String str22 = "tel:+" + user3.phone;
                                        if (str22 != null && !str22.isEmpty()) {
                                            tVar2.F.add(str22);
                                        }
                                    }
                                }
                                z19 = z13;
                                notification3 = notification;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    notificationsController2.setNotificationChannel(notification3, tVar2, z19);
                                }
                                FileLog.d("showExtraNotifications: holders.add " + j13);
                                int iIntValue2 = num2.intValue();
                                boolean z25 = dialogKey5.story;
                                notification2 = notification3;
                                z13 = z19;
                                notificationsController3 = notificationsController2;
                                long j26 = j13;
                                arrayList26 = arrayList26;
                                i35 = i35;
                                hVar9 = hVar10;
                                C1NotificationHolder c1NotificationHolder = notificationsController3.new C1NotificationHolder(iIntValue2, j26, z25, j19, str13, user3, chat4, tVar2, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                arrayList25 = arrayList25;
                                arrayList25.add(c1NotificationHolder);
                                notificationsController3.wearNotificationsIds.k(num2, j26);
                                i30 = i35 + 1;
                                arrayList24 = arrayList25;
                                arrayList22 = arrayList26;
                                z21 = z14;
                                z13 = z13;
                                size6 = size6;
                                hVar7 = hVar2;
                                hVar8 = hVar3;
                                notificationsSettings = sharedPreferences;
                                clientUserId = j14;
                                notificationB = notification2;
                                hVar9 = hVar9;
                            }
                            dialogKey5 = dialogKey4;
                            j19 = j16;
                            i0.a.y(a9.p.q(j13, "show extra notifications chatId ", " topicId "), j19);
                            if (j19 != 0) {
                                intent2.putExtra("topicId", j19);
                            }
                            str19 = str12;
                            intent2.putExtra(str19, notificationsController2.currentAccount);
                            PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 1140850688);
                            g0Var = new e0.g0();
                            kVar = kVarB;
                            if (kVarB != null) {
                                g0Var.a(kVar);
                            }
                            i25 = i20;
                            Intent intent7 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                            intent7.addFlags(32);
                            intent7.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                            intent7.putExtra("dialog_id", j13);
                            intent7.putExtra("max_id", i16);
                            intent7.putExtra(str19, notificationsController2.currentAccount);
                            arrayList15 = arrayList8;
                            bitmap2 = bitmap;
                            e0.j jVar5 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent7, 167772160));
                            jVar5.f5073g = 2;
                            jVar5.h = false;
                            kVarB2 = jVar5.b();
                            if (!DialogObject.isEncryptedDialog(j13)) {
                                kVar2 = kVarB2;
                                messageObject6 = messageObject5;
                                if (j13 != globalSecretChatId) {
                                    string5 = "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i16;
                                } else {
                                    string5 = null;
                                }
                            } else if (DialogObject.isUserDialog(j13)) {
                                kVar2 = kVarB2;
                                messageObject6 = messageObject5;
                                string5 = "tguser" + j13 + "_" + i16;
                            } else {
                                StringBuilder sb6 = new StringBuilder("tgchat");
                                kVar2 = kVarB2;
                                messageObject6 = messageObject5;
                                sb6.append(-j13);
                                sb6.append("_");
                                sb6.append(i16);
                                string5 = sb6.toString();
                            }
                            if (string5 != null) {
                                g0Var.f5061g = string5;
                                e0.g0 g0Var3 = new e0.g0();
                                g0Var3.f5061g = "summary_".concat(string5);
                                tVar.c(g0Var3);
                            }
                            StringBuilder sb7 = new StringBuilder("tgaccount");
                            kVar3 = kVar2;
                            j14 = j14;
                            sb7.append(j14);
                            g0Var.b(sb7.toString());
                            if (dialogKey5.story) {
                                jMin = Long.MAX_VALUE;
                                i28 = 0;
                                while (i28 < notificationsController2.storyPushMessages.size()) {
                                    jMin = Math.min(notificationsController2.storyPushMessages.get(i28).date, jMin);
                                    i28++;
                                    kVar3 = kVar3;
                                }
                                kVar4 = kVar3;
                                arrayList16 = arrayList14;
                            } else {
                                kVar4 = kVar3;
                                arrayList16 = arrayList14;
                                jMin = ((long) ((MessageObject) arrayList16.get(0)).messageOwner.date) * 1000;
                            }
                            tVar2 = new e0.t(ApplicationLoader.applicationContext);
                            tVar2.g(str13);
                            arrayList17 = arrayList16;
                            tVar2.E.icon = R.drawable.notification;
                            tVar2.f(sb3.toString());
                            tVar2.h(16, true);
                            if (dialogKey5.story) {
                                size3 = notificationsController2.storyPushMessages.size();
                            } else {
                                size3 = arrayList17.size();
                            }
                            tVar2.f5124i = size3;
                            tVar2.f5137w = -15618822;
                            tVar2.f5133r = false;
                            tVar2.E.when = jMin;
                            tVar2.f5126k = true;
                            tVar2.n(a0Var);
                            tVar2.f5123g = activity2;
                            tVar2.c(g0Var);
                            tVar2.l(String.valueOf(Long.MAX_VALUE - jMin));
                            tVar2.f5136u = "msg";
                            intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent4.putExtra("messageDate", i13);
                            intent4.putExtra("dialogId", j13);
                            intent4.putExtra(str19, notificationsController2.currentAccount);
                            if (dialogKey5.story) {
                                intent4.putExtra("story", true);
                            }
                            if (messageObject6 != null) {
                                messageObject7 = messageObject6;
                                if (messageObject7.isStoryReactionPush) {
                                    intent4.putExtra("storyReaction", true);
                                }
                            } else {
                                messageObject7 = messageObject6;
                            }
                            tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160);
                            if (z13 != 0) {
                                tVar2.f5132q = notificationsController2.notificationGroup;
                                tVar2.i();
                            }
                            if (messageObject7 != null) {
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                            } else {
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                            }
                            if (keyboardInlineButton != null) {
                                Intent intent8 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                                intent8.addFlags(32);
                                intent8.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                intent8.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                e0.j jVar6 = new e0.j(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent8, 167772160));
                                jVar6.h = false;
                                tVar2.f5119b.add(jVar6.b());
                            }
                            j20 = dialogKey5.dialogId;
                            if (j20 != 489000) {
                                if (kVar != null) {
                                    tVar2.f5119b.add(kVar);
                                }
                                if (!z14) {
                                    tVar2.f5119b.add(kVar4);
                                }
                            }
                            if (arrayList26.size() != 1) {
                            }
                            if (DialogObject.isEncryptedDialog(j13)) {
                                tVar2.k();
                            }
                            if (bitmap2 != null) {
                                tVar2.j(bitmap2);
                            }
                            if (!AndroidUtilities.needShowPasscode(false)) {
                                size4 = arrayList15.size();
                                i26 = 0;
                                while (i26 < size4) {
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList38 = arrayList15;
                                    keyboardInlineButtonRow = arrayList38.get(i26);
                                    size5 = keyboardInlineButtonRow.buttons.size();
                                    i27 = 0;
                                    while (i27 < size5) {
                                        keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i27);
                                        tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) hf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                        int i310 = size4;
                                        if (tL_inlineButtonTypeCallback != null) {
                                            intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                            intent3.putExtra(str19, notificationsController2.currentAccount);
                                            intent3.putExtra("did", j13);
                                            bArr = tL_inlineButtonTypeCallback.data;
                                            if (bArr != null) {
                                                intent3.putExtra("data", bArr);
                                            }
                                            intent3.putExtra("mid", i25);
                                            String str23 = keyboardInlineButton2.text;
                                            Context context2 = ApplicationLoader.applicationContext;
                                            int i311 = notificationsController2.lastButtonId;
                                            notificationsController2.lastButtonId = i311 + 1;
                                            tVar2.a(0, str23, PendingIntent.getBroadcast(context2, i311, intent3, 167772160));
                                        }
                                        i27++;
                                        size4 = i310;
                                        keyboardInlineButtonRow = keyboardInlineButtonRow;
                                    }
                                    i26++;
                                    arrayList15 = arrayList38;
                                }
                            }
                            if (chat4 == null) {
                                user3 = user2;
                            } else {
                                user3 = user2;
                            }
                            z19 = z13;
                            notification3 = notification;
                            if (Build.VERSION.SDK_INT >= 26) {
                                notificationsController2.setNotificationChannel(notification3, tVar2, z19);
                            }
                            FileLog.d("showExtraNotifications: holders.add " + j13);
                            int iIntValue3 = num2.intValue();
                            boolean z26 = dialogKey5.story;
                            notification2 = notification3;
                            z13 = z19;
                            notificationsController3 = notificationsController2;
                            long j27 = j13;
                            arrayList26 = arrayList26;
                            i35 = i35;
                            hVar9 = hVar10;
                            C1NotificationHolder c1NotificationHolder2 = notificationsController3.new C1NotificationHolder(iIntValue3, j27, z26, j19, str13, user3, chat4, tVar2, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                            arrayList25 = arrayList25;
                            arrayList25.add(c1NotificationHolder2);
                            notificationsController3.wearNotificationsIds.k(num2, j27);
                            i30 = i35 + 1;
                            arrayList24 = arrayList25;
                            arrayList22 = arrayList26;
                            z21 = z14;
                            z13 = z13;
                            size6 = size6;
                            hVar7 = hVar2;
                            hVar8 = hVar3;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j14;
                            notificationB = notification2;
                            hVar9 = hVar9;
                        }
                        kVarB = null;
                        num3 = (Integer) notificationsController.pushDialogs.f(j13);
                        if (num3 == null) {
                            num3 = 0;
                        }
                        dialogKey2 = dialogKey;
                        if (dialogKey2.story) {
                            iMax = notificationsController.storyPushMessages.size();
                        } else {
                            iMax = Math.max(num3.intValue(), arrayList5.size());
                        }
                        if (iMax > 1) {
                            str10 = str9;
                        } else {
                            str10 = str9;
                        }
                        long j28 = clientUserId;
                        e0.p0 p0Var6 = (e0.p0) hVar9.f(j28);
                        i16 = id2;
                        if (Build.VERSION.SDK_INT >= 28) {
                            j15 = j12;
                        } else {
                            j15 = j12;
                        }
                        p0Var = p0Var6;
                        if (messageObject == null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (p0Var == null) {
                            a0Var = new e0.a0();
                        } else {
                            a0Var = new e0.a0();
                        }
                        i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 28) {
                            a0Var.f(str10);
                        } else {
                            a0Var.f(str10);
                        }
                        if (i17 >= 28) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        a0Var.f5041i = Boolean.valueOf(z18);
                        sb2 = new StringBuilder();
                        strArr = new String[1];
                        j14 = j28;
                        zArr = new boolean[1];
                        if (dialogKey2.story) {
                            arrayList18 = new ArrayList<>();
                            arrayList19 = new ArrayList<>();
                            Pair<Integer, Boolean> storyPushes2 = notificationsController.parseStoryPushes(arrayList18, arrayList19);
                            iIntValue = ((Integer) storyPushes2.first).intValue();
                            zBooleanValue = ((Boolean) storyPushes2.second).booleanValue();
                            if (zBooleanValue) {
                                arrayList20 = arrayList19;
                                z20 = zBooleanValue;
                                sb2.append(LocaleController.formatPluralString("StoryNotificationHidden", iIntValue, new Object[0]));
                            } else {
                                arrayList20 = arrayList19;
                                z20 = zBooleanValue;
                                if (arrayList18.isEmpty()) {
                                    FileLog.d("showExtraNotifications: [" + j13 + "] continue; story but names is empty");
                                    notificationsController3 = notificationsController;
                                    notification2 = notification;
                                    i30 = i35 + 1;
                                    arrayList24 = arrayList25;
                                    arrayList22 = arrayList26;
                                    z21 = z14;
                                    z13 = z13;
                                    size6 = size6;
                                    hVar7 = hVar2;
                                    hVar8 = hVar3;
                                    notificationsSettings = sharedPreferences;
                                    clientUserId = j14;
                                    notificationB = notification2;
                                    hVar9 = hVar9;
                                } else if (arrayList18.size() == 1) {
                                    if (iIntValue == 1) {
                                        sb2.append(LocaleController.getString("StoryNotificationSingle"));
                                    } else {
                                        sb2.append(LocaleController.formatPluralString("StoryNotification1", iIntValue, arrayList18.get(0)));
                                    }
                                } else if (arrayList18.size() == 2) {
                                    sb2.append(LocaleController.formatString(R.string.StoryNotification2, arrayList18.get(0), arrayList18.get(1)));
                                } else if (arrayList18.size() == 3) {
                                    sb2.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1))));
                                } else {
                                    sb2.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1))));
                                }
                            }
                            jMin2 = Long.MAX_VALUE;
                            i29 = 0;
                            while (i29 < notificationsController.storyPushMessages.size()) {
                                jMin2 = Math.min(notificationsController.storyPushMessages.get(i29).date, jMin2);
                                i29++;
                                hVar9 = hVar9;
                                messageObject = messageObject;
                            }
                            messageObject3 = messageObject;
                            hVar4 = hVar9;
                            a0Var.f5041i = Boolean.FALSE;
                            if (arrayList18.size() == 1) {
                                r10 = 0;
                                pluralString = LocaleController.formatPluralString(str7, iIntValue, new Object[0]);
                            } else {
                                r10 = 0;
                                pluralString = LocaleController.formatPluralString(str7, iIntValue, new Object[0]);
                            }
                            e0.p0 p0Var7 = new e0.p0();
                            p0Var7.f5106a = pluralString;
                            arrayList8 = null;
                            p0Var7.f5107b = null;
                            p0Var7.f5108c = null;
                            p0Var7.d = null;
                            p0Var7.f5109e = r10;
                            p0Var7.f5110f = r10;
                            e0.z zVar11 = new e0.z(sb2, jMin2, p0Var7);
                            arrayList21 = a0Var.f5038e;
                            arrayList21.add(zVar11);
                            if (arrayList21.size() > 25) {
                                arrayList21.remove((int) r10);
                            }
                            if (z20) {
                                bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList20);
                            } else {
                                bitmapLoadMultipleAvatars = null;
                            }
                            str12 = "currentAccount";
                            bitmap = bitmapLoadMultipleAvatars;
                            j16 = j15;
                            i20 = 0;
                            str13 = pluralString;
                        } else {
                            messageObject3 = messageObject;
                            hVar4 = hVar9;
                            str11 = "showExtraNotifications: [";
                            size2 = arrayList5.size() - 1;
                            arrayList7 = null;
                            i18 = 0;
                            while (true) {
                                i19 = size2;
                                if (i19 < 0) {
                                    break;
                                    break;
                                }
                                messageObject4 = (MessageObject) arrayList5.get(i19);
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList210 = arrayList7;
                                topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
                                if (j15 != topicId) {
                                    StringBuilder sbQ3 = a9.p.q(j13, str11, "] continue; topic id is not equal: topicId=");
                                    dialogKey3 = dialogKey2;
                                    arrayList9 = arrayList5;
                                    long j29 = j15;
                                    sbQ3.append(j29);
                                    sbQ3.append(" messageTopicId=");
                                    sbQ3.append(topicId);
                                    sbQ3.append("; selfId=");
                                    sbQ3.append(notificationsController.getUserConfig().getClientUserId());
                                    FileLog.d(sbQ3.toString());
                                    j18 = j29;
                                    i21 = i18;
                                } else {
                                    dialogKey3 = dialogKey2;
                                    arrayList9 = arrayList5;
                                    j17 = j15;
                                    shortStringForMessage = notificationsController.getShortStringForMessage(messageObject4, strArr, zArr);
                                    if (j13 == 489001) {
                                        strArr[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                        i21 = i18;
                                    } else if (j13 == 489000) {
                                        i21 = i18;
                                        if (j13 == j14) {
                                            strArr[0] = str9;
                                        } else if (DialogObject.isChatDialog(j13)) {
                                            strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                        }
                                    } else {
                                        i21 = i18;
                                        if (j13 == j14) {
                                            strArr[0] = str9;
                                        } else if (DialogObject.isChatDialog(j13)) {
                                            strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                        }
                                    }
                                    if (shortStringForMessage == null) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.w("message text is null for " + messageObject4.getId() + " did = " + messageObject4.getDialogId());
                                        }
                                        j18 = j17;
                                    } else {
                                        if (sb2.length() > 0) {
                                            sb2.append("\n\n");
                                        }
                                        if (j13 == j14) {
                                            zArr = zArr;
                                            str14 = strArr[0];
                                            if (str14 != null) {
                                                sb2.append(String.format("%1$s: %2$s", str14, shortStringForMessage));
                                            } else {
                                                sb2.append(shortStringForMessage);
                                            }
                                        } else {
                                            zArr = zArr;
                                            str14 = strArr[0];
                                            if (str14 != null) {
                                                sb2.append(String.format("%1$s: %2$s", str14, shortStringForMessage));
                                            } else {
                                                sb2.append(shortStringForMessage);
                                            }
                                        }
                                        str15 = shortStringForMessage;
                                        i22 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                        if (i22 != 0) {
                                            if (DialogObject.isUserDialog(j13)) {
                                                senderId = j13;
                                            } else if (z16) {
                                                senderId = -j13;
                                            } else if (DialogObject.isChatDialog(j13)) {
                                                senderId = messageObject4.getSenderId();
                                            } else {
                                                senderId = j13;
                                            }
                                        } else if (DialogObject.isUserDialog(j13)) {
                                            senderId = j13;
                                        } else if (z16) {
                                            senderId = -j13;
                                        } else if (DialogObject.isChatDialog(j13)) {
                                            senderId = messageObject4.getSenderId();
                                        } else {
                                            senderId = j13;
                                        }
                                        String[] strArr4 = strArr;
                                        str16 = str11;
                                        sb2 = sb2;
                                        hVar5 = hVar4;
                                        p0Var2 = (e0.p0) hVar5.f(senderId + (j17 << 16));
                                        string4 = strArr4[0];
                                        strArr2 = strArr4;
                                        if (string4 == null) {
                                            if (!z14) {
                                                p0Var3 = p0Var2;
                                            } else if (!DialogObject.isChatDialog(j13)) {
                                                p0Var3 = p0Var2;
                                                if (Build.VERSION.SDK_INT > 27) {
                                                    string4 = LocaleController.getString(R.string.NotificationHiddenName);
                                                }
                                            } else if (z16) {
                                                p0Var3 = p0Var2;
                                                if (Build.VERSION.SDK_INT > 27) {
                                                    string4 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                }
                                            } else {
                                                p0Var3 = p0Var2;
                                                string4 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                            }
                                            string4 = "";
                                        } else {
                                            p0Var3 = p0Var2;
                                        }
                                        if (p0Var3 == null) {
                                            e0.o0 o0Var4 = new e0.o0();
                                            o0Var4.f5104a = string4;
                                            if (zArr[0]) {
                                                str8 = str8;
                                                j18 = j17;
                                            } else {
                                                str8 = str8;
                                                j18 = j17;
                                            }
                                            p0VarA = o0Var4.a();
                                            hVar5.k(p0VarA, senderId);
                                        } else {
                                            e0.o0 o0Var5 = new e0.o0();
                                            o0Var5.f5104a = string4;
                                            if (zArr[0]) {
                                                str8 = str8;
                                                j18 = j17;
                                            } else {
                                                str8 = str8;
                                                j18 = j17;
                                            }
                                            p0VarA = o0Var5.a();
                                            hVar5.k(p0VarA, senderId);
                                        }
                                        if (DialogObject.isEncryptedDialog(j13)) {
                                            if (zArr[0]) {
                                                notificationsController = this;
                                                hVar6 = hVar5;
                                                e0.z zVar12 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                arrayList11 = a0Var.f5038e;
                                                arrayList11.add(zVar12);
                                                if (arrayList11.size() > 25) {
                                                    c10 = 0;
                                                    arrayList11.remove(0);
                                                }
                                                if (!zArr[c10]) {
                                                }
                                            } else {
                                                notificationsController = this;
                                                hVar6 = hVar5;
                                                e0.z zVar13 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                                arrayList11 = a0Var.f5038e;
                                                arrayList11.add(zVar13);
                                                if (arrayList11.size() > 25) {
                                                    c10 = 0;
                                                    arrayList11.remove(0);
                                                }
                                                if (!zArr[c10]) {
                                                }
                                            }
                                            c10 = 0;
                                            if (!zArr[c10]) {
                                            }
                                        } else {
                                            notificationsController = this;
                                            hVar6 = hVar5;
                                            e0.z zVar14 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                            arrayList10 = a0Var.f5038e;
                                            arrayList10.add(zVar14);
                                            if (arrayList10.size() > 25) {
                                                arrayList10.remove(0);
                                            }
                                        }
                                        if (j13 == 777000) {
                                            replyMarkup = messageObject4.messageOwner.reply_markup;
                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList39 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                id3 = messageObject4.getId();
                                                arrayList7 = arrayList39;
                                            } else {
                                                id3 = i21;
                                                arrayList7 = arrayList210;
                                            }
                                        } else {
                                            id3 = i21;
                                            arrayList7 = arrayList210;
                                        }
                                    }
                                    size2 = i19 - 1;
                                    i18 = id3;
                                    notificationsController = notificationsController;
                                    zArr = zArr;
                                    strArr = strArr2;
                                    arrayList5 = arrayList9;
                                    dialogKey2 = dialogKey3;
                                    sb2 = sb2;
                                    str8 = str8;
                                    str11 = str16;
                                    hVar4 = hVar6;
                                    j15 = j18;
                                }
                                str16 = str11;
                                hVar6 = hVar4;
                                strArr2 = strArr;
                                id3 = i21;
                                arrayList7 = arrayList210;
                                size2 = i19 - 1;
                                i18 = id3;
                                notificationsController = notificationsController;
                                zArr = zArr;
                                strArr = strArr2;
                                arrayList5 = arrayList9;
                                dialogKey2 = dialogKey3;
                                sb2 = sb2;
                                str8 = str8;
                                str11 = str16;
                                hVar4 = hVar6;
                                j15 = j18;
                            }
                            str12 = str8;
                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList310 = arrayList7;
                            j16 = j15;
                            str13 = str9;
                            bitmap = bitmapDecodeFile;
                            i20 = i18;
                            arrayList8 = arrayList310;
                        }
                        notificationsController2 = notificationsController;
                        dialogKey4 = dialogKey2;
                        arrayList14 = arrayList5;
                        StringBuilder sb8 = sb2;
                        a0.h hVar11 = hVar4;
                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
                        intent2.setFlags(67108864);
                        intent2.addCategory("android.intent.category.LAUNCHER");
                        messageObject5 = messageObject3;
                        if (messageObject3 == null) {
                            if (messageObject5 == null) {
                                if (messageObject5 == null) {
                                }
                                dialogKey5 = dialogKey4;
                                if (dialogKey5.story) {
                                    jArr2 = new long[notificationsController2.storyPushMessages.size()];
                                    while (i24 < notificationsController2.storyPushMessages.size()) {
                                        jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                                    }
                                    intent2.putExtra("storyDialogIds", jArr2);
                                } else if (DialogObject.isEncryptedDialog(j13)) {
                                    intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                } else if (DialogObject.isUserDialog(j13)) {
                                    intent2.putExtra("userId", j13);
                                } else {
                                    intent2.putExtra("chatId", -j13);
                                }
                            } else {
                                if (messageObject5 == null) {
                                }
                                dialogKey5 = dialogKey4;
                                if (dialogKey5.story) {
                                    jArr2 = new long[notificationsController2.storyPushMessages.size()];
                                    while (i24 < notificationsController2.storyPushMessages.size()) {
                                        jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                                    }
                                    intent2.putExtra("storyDialogIds", jArr2);
                                } else if (DialogObject.isEncryptedDialog(j13)) {
                                    intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                                } else if (DialogObject.isUserDialog(j13)) {
                                    intent2.putExtra("userId", j13);
                                } else {
                                    intent2.putExtra("chatId", -j13);
                                }
                            }
                        } else if (messageObject5 == null) {
                            if (messageObject5 == null) {
                            }
                            dialogKey5 = dialogKey4;
                            if (dialogKey5.story) {
                                jArr2 = new long[notificationsController2.storyPushMessages.size()];
                                while (i24 < notificationsController2.storyPushMessages.size()) {
                                    jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                                }
                                intent2.putExtra("storyDialogIds", jArr2);
                            } else if (DialogObject.isEncryptedDialog(j13)) {
                                intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                            } else if (DialogObject.isUserDialog(j13)) {
                                intent2.putExtra("userId", j13);
                            } else {
                                intent2.putExtra("chatId", -j13);
                            }
                        } else {
                            if (messageObject5 == null) {
                            }
                            dialogKey5 = dialogKey4;
                            if (dialogKey5.story) {
                                jArr2 = new long[notificationsController2.storyPushMessages.size()];
                                while (i24 < notificationsController2.storyPushMessages.size()) {
                                    jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                                }
                                intent2.putExtra("storyDialogIds", jArr2);
                            } else if (DialogObject.isEncryptedDialog(j13)) {
                                intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                            } else if (DialogObject.isUserDialog(j13)) {
                                intent2.putExtra("userId", j13);
                            } else {
                                intent2.putExtra("chatId", -j13);
                            }
                        }
                        j19 = j16;
                        i0.a.y(a9.p.q(j13, "show extra notifications chatId ", " topicId "), j19);
                        if (j19 != 0) {
                            intent2.putExtra("topicId", j19);
                        }
                        str19 = str12;
                        intent2.putExtra(str19, notificationsController2.currentAccount);
                        PendingIntent activity3 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 1140850688);
                        g0Var = new e0.g0();
                        kVar = kVarB;
                        if (kVarB != null) {
                            g0Var.a(kVar);
                        }
                        i25 = i20;
                        Intent intent9 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                        intent9.addFlags(32);
                        intent9.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                        intent9.putExtra("dialog_id", j13);
                        intent9.putExtra("max_id", i16);
                        intent9.putExtra(str19, notificationsController2.currentAccount);
                        arrayList15 = arrayList8;
                        bitmap2 = bitmap;
                        e0.j jVar7 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent9, 167772160));
                        jVar7.f5073g = 2;
                        jVar7.h = false;
                        kVarB2 = jVar7.b();
                        if (!DialogObject.isEncryptedDialog(j13)) {
                            kVar2 = kVarB2;
                            messageObject6 = messageObject5;
                            if (j13 != globalSecretChatId) {
                                string5 = "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i16;
                            } else {
                                string5 = null;
                            }
                        } else if (DialogObject.isUserDialog(j13)) {
                            kVar2 = kVarB2;
                            messageObject6 = messageObject5;
                            string5 = "tguser" + j13 + "_" + i16;
                        } else {
                            StringBuilder sb9 = new StringBuilder("tgchat");
                            kVar2 = kVarB2;
                            messageObject6 = messageObject5;
                            sb9.append(-j13);
                            sb9.append("_");
                            sb9.append(i16);
                            string5 = sb9.toString();
                        }
                        if (string5 != null) {
                            g0Var.f5061g = string5;
                            e0.g0 g0Var4 = new e0.g0();
                            g0Var4.f5061g = "summary_".concat(string5);
                            tVar.c(g0Var4);
                        }
                        StringBuilder sb10 = new StringBuilder("tgaccount");
                        kVar3 = kVar2;
                        j14 = j14;
                        sb10.append(j14);
                        g0Var.b(sb10.toString());
                        if (dialogKey5.story) {
                            jMin = Long.MAX_VALUE;
                            i28 = 0;
                            while (i28 < notificationsController2.storyPushMessages.size()) {
                                jMin = Math.min(notificationsController2.storyPushMessages.get(i28).date, jMin);
                                i28++;
                                kVar3 = kVar3;
                            }
                            kVar4 = kVar3;
                            arrayList16 = arrayList14;
                        } else {
                            kVar4 = kVar3;
                            arrayList16 = arrayList14;
                            jMin = ((long) ((MessageObject) arrayList16.get(0)).messageOwner.date) * 1000;
                        }
                        tVar2 = new e0.t(ApplicationLoader.applicationContext);
                        tVar2.g(str13);
                        arrayList17 = arrayList16;
                        tVar2.E.icon = R.drawable.notification;
                        tVar2.f(sb8.toString());
                        tVar2.h(16, true);
                        if (dialogKey5.story) {
                            size3 = notificationsController2.storyPushMessages.size();
                        } else {
                            size3 = arrayList17.size();
                        }
                        tVar2.f5124i = size3;
                        tVar2.f5137w = -15618822;
                        tVar2.f5133r = false;
                        tVar2.E.when = jMin;
                        tVar2.f5126k = true;
                        tVar2.n(a0Var);
                        tVar2.f5123g = activity3;
                        tVar2.c(g0Var);
                        tVar2.l(String.valueOf(Long.MAX_VALUE - jMin));
                        tVar2.f5136u = "msg";
                        intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent4.putExtra("messageDate", i13);
                        intent4.putExtra("dialogId", j13);
                        intent4.putExtra(str19, notificationsController2.currentAccount);
                        if (dialogKey5.story) {
                            intent4.putExtra("story", true);
                        }
                        if (messageObject6 != null) {
                            messageObject7 = messageObject6;
                            if (messageObject7.isStoryReactionPush) {
                                intent4.putExtra("storyReaction", true);
                            }
                        } else {
                            messageObject7 = messageObject6;
                        }
                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160);
                        if (z13 != 0) {
                            tVar2.f5132q = notificationsController2.notificationGroup;
                            tVar2.i();
                        }
                        if (messageObject7 != null) {
                            keyboardInlineButton = null;
                            tL_inlineButtonTypeCopy = null;
                        } else {
                            keyboardInlineButton = null;
                            tL_inlineButtonTypeCopy = null;
                        }
                        if (keyboardInlineButton != null) {
                            Intent intent10 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                            intent10.addFlags(32);
                            intent10.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                            intent10.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                            e0.j jVar8 = new e0.j(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent10, 167772160));
                            jVar8.h = false;
                            tVar2.f5119b.add(jVar8.b());
                        }
                        j20 = dialogKey5.dialogId;
                        if (j20 != 489000) {
                            if (kVar != null) {
                                tVar2.f5119b.add(kVar);
                            }
                            if (!z14) {
                                tVar2.f5119b.add(kVar4);
                            }
                        }
                        if (arrayList26.size() != 1) {
                        }
                        if (DialogObject.isEncryptedDialog(j13)) {
                            tVar2.k();
                        }
                        if (bitmap2 != null) {
                            tVar2.j(bitmap2);
                        }
                        if (!AndroidUtilities.needShowPasscode(false)) {
                            size4 = arrayList15.size();
                            i26 = 0;
                            while (i26 < size4) {
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList311 = arrayList15;
                                keyboardInlineButtonRow = arrayList311.get(i26);
                                size5 = keyboardInlineButtonRow.buttons.size();
                                i27 = 0;
                                while (i27 < size5) {
                                    keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i27);
                                    tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) hf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                    int i312 = size4;
                                    if (tL_inlineButtonTypeCallback != null) {
                                        intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                        intent3.putExtra(str19, notificationsController2.currentAccount);
                                        intent3.putExtra("did", j13);
                                        bArr = tL_inlineButtonTypeCallback.data;
                                        if (bArr != null) {
                                            intent3.putExtra("data", bArr);
                                        }
                                        intent3.putExtra("mid", i25);
                                        String str24 = keyboardInlineButton2.text;
                                        Context context3 = ApplicationLoader.applicationContext;
                                        int i313 = notificationsController2.lastButtonId;
                                        notificationsController2.lastButtonId = i313 + 1;
                                        tVar2.a(0, str24, PendingIntent.getBroadcast(context3, i313, intent3, 167772160));
                                    }
                                    i27++;
                                    size4 = i312;
                                    keyboardInlineButtonRow = keyboardInlineButtonRow;
                                }
                                i26++;
                                arrayList15 = arrayList311;
                            }
                        }
                        if (chat4 == null) {
                            user3 = user2;
                        } else {
                            user3 = user2;
                        }
                        z19 = z13;
                        notification3 = notification;
                        if (Build.VERSION.SDK_INT >= 26) {
                            notificationsController2.setNotificationChannel(notification3, tVar2, z19);
                        }
                        FileLog.d("showExtraNotifications: holders.add " + j13);
                        int iIntValue4 = num2.intValue();
                        boolean z27 = dialogKey5.story;
                        notification2 = notification3;
                        z13 = z19;
                        notificationsController3 = notificationsController2;
                        long j210 = j13;
                        arrayList26 = arrayList26;
                        i35 = i35;
                        hVar9 = hVar11;
                        C1NotificationHolder c1NotificationHolder3 = notificationsController3.new C1NotificationHolder(iIntValue4, j210, z27, j19, str13, user3, chat4, tVar2, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                        arrayList25 = arrayList25;
                        arrayList25.add(c1NotificationHolder3);
                        notificationsController3.wearNotificationsIds.k(num2, j210);
                        i30 = i35 + 1;
                        arrayList24 = arrayList25;
                        arrayList22 = arrayList26;
                        z21 = z14;
                        z13 = z13;
                        size6 = size6;
                        hVar7 = hVar2;
                        hVar8 = hVar3;
                        notificationsSettings = sharedPreferences;
                        clientUserId = j14;
                        notificationB = notification2;
                        hVar9 = hVar9;
                    } else {
                        str7 = str3;
                    }
                    file = pathToAttach2;
                } else {
                    sharedPreferences = notificationsSettings;
                    str7 = str3;
                    file = null;
                }
                if (dialogKey2.story) {
                    arrayList18 = new ArrayList<>();
                    arrayList19 = new ArrayList<>();
                    Pair<Integer, Boolean> storyPushes3 = notificationsController.parseStoryPushes(arrayList18, arrayList19);
                    iIntValue = ((Integer) storyPushes3.first).intValue();
                    zBooleanValue = ((Boolean) storyPushes3.second).booleanValue();
                    if (zBooleanValue) {
                        arrayList20 = arrayList19;
                        z20 = zBooleanValue;
                        sb2.append(LocaleController.formatPluralString("StoryNotificationHidden", iIntValue, new Object[0]));
                    } else {
                        arrayList20 = arrayList19;
                        z20 = zBooleanValue;
                        if (arrayList18.isEmpty()) {
                            FileLog.d("showExtraNotifications: [" + j13 + "] continue; story but names is empty");
                            notificationsController3 = notificationsController;
                            notification2 = notification;
                            i30 = i35 + 1;
                            arrayList24 = arrayList25;
                            arrayList22 = arrayList26;
                            z21 = z14;
                            z13 = z13;
                            size6 = size6;
                            hVar7 = hVar2;
                            hVar8 = hVar3;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j14;
                            notificationB = notification2;
                            hVar9 = hVar9;
                        } else if (arrayList18.size() == 1) {
                            if (iIntValue == 1) {
                                sb2.append(LocaleController.getString("StoryNotificationSingle"));
                            } else {
                                sb2.append(LocaleController.formatPluralString("StoryNotification1", iIntValue, arrayList18.get(0)));
                            }
                        } else if (arrayList18.size() == 2) {
                            sb2.append(LocaleController.formatString(R.string.StoryNotification2, arrayList18.get(0), arrayList18.get(1)));
                        } else if (arrayList18.size() == 3) {
                            sb2.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1))));
                        } else {
                            sb2.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList18.get(0)), notificationsController.cutLastName(arrayList18.get(1))));
                        }
                    }
                    jMin2 = Long.MAX_VALUE;
                    i29 = 0;
                    while (i29 < notificationsController.storyPushMessages.size()) {
                        jMin2 = Math.min(notificationsController.storyPushMessages.get(i29).date, jMin2);
                        i29++;
                        hVar9 = hVar9;
                        messageObject = messageObject;
                    }
                    messageObject3 = messageObject;
                    hVar4 = hVar9;
                    a0Var.f5041i = Boolean.FALSE;
                    if (arrayList18.size() == 1) {
                        r10 = 0;
                        pluralString = LocaleController.formatPluralString(str7, iIntValue, new Object[0]);
                    } else {
                        r10 = 0;
                        pluralString = LocaleController.formatPluralString(str7, iIntValue, new Object[0]);
                    }
                    e0.p0 p0Var8 = new e0.p0();
                    p0Var8.f5106a = pluralString;
                    arrayList8 = null;
                    p0Var8.f5107b = null;
                    p0Var8.f5108c = null;
                    p0Var8.d = null;
                    p0Var8.f5109e = r10;
                    p0Var8.f5110f = r10;
                    e0.z zVar15 = new e0.z(sb2, jMin2, p0Var8);
                    arrayList21 = a0Var.f5038e;
                    arrayList21.add(zVar15);
                    if (arrayList21.size() > 25) {
                        arrayList21.remove((int) r10);
                    }
                    if (z20) {
                        bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList20);
                    } else {
                        bitmapLoadMultipleAvatars = null;
                    }
                    str12 = "currentAccount";
                    bitmap = bitmapLoadMultipleAvatars;
                    j16 = j15;
                    i20 = 0;
                    str13 = pluralString;
                } else {
                    messageObject3 = messageObject;
                    hVar4 = hVar9;
                    str11 = "showExtraNotifications: [";
                    size2 = arrayList5.size() - 1;
                    arrayList7 = null;
                    i18 = 0;
                    while (true) {
                        i19 = size2;
                        if (i19 < 0) {
                            break;
                            break;
                        }
                        messageObject4 = (MessageObject) arrayList5.get(i19);
                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList211 = arrayList7;
                        topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
                        if (j15 != topicId) {
                            StringBuilder sbQ4 = a9.p.q(j13, str11, "] continue; topic id is not equal: topicId=");
                            dialogKey3 = dialogKey2;
                            arrayList9 = arrayList5;
                            long j211 = j15;
                            sbQ4.append(j211);
                            sbQ4.append(" messageTopicId=");
                            sbQ4.append(topicId);
                            sbQ4.append("; selfId=");
                            sbQ4.append(notificationsController.getUserConfig().getClientUserId());
                            FileLog.d(sbQ4.toString());
                            j18 = j211;
                            i21 = i18;
                        } else {
                            dialogKey3 = dialogKey2;
                            arrayList9 = arrayList5;
                            j17 = j15;
                            shortStringForMessage = notificationsController.getShortStringForMessage(messageObject4, strArr, zArr);
                            if (j13 == 489001) {
                                strArr[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                i21 = i18;
                            } else if (j13 == 489000) {
                                i21 = i18;
                                if (j13 == j14) {
                                    strArr[0] = str9;
                                } else if (DialogObject.isChatDialog(j13)) {
                                    strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                }
                            } else {
                                i21 = i18;
                                if (j13 == j14) {
                                    strArr[0] = str9;
                                } else if (DialogObject.isChatDialog(j13)) {
                                    strArr[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                }
                            }
                            if (shortStringForMessage == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("message text is null for " + messageObject4.getId() + " did = " + messageObject4.getDialogId());
                                }
                                j18 = j17;
                            } else {
                                if (sb2.length() > 0) {
                                    sb2.append("\n\n");
                                }
                                if (j13 == j14) {
                                    zArr = zArr;
                                    str14 = strArr[0];
                                    if (str14 != null) {
                                        sb2.append(String.format("%1$s: %2$s", str14, shortStringForMessage));
                                    } else {
                                        sb2.append(shortStringForMessage);
                                    }
                                } else {
                                    zArr = zArr;
                                    str14 = strArr[0];
                                    if (str14 != null) {
                                        sb2.append(String.format("%1$s: %2$s", str14, shortStringForMessage));
                                    } else {
                                        sb2.append(shortStringForMessage);
                                    }
                                }
                                str15 = shortStringForMessage;
                                i22 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                if (i22 != 0) {
                                    if (DialogObject.isUserDialog(j13)) {
                                        senderId = j13;
                                    } else if (z16) {
                                        senderId = -j13;
                                    } else if (DialogObject.isChatDialog(j13)) {
                                        senderId = messageObject4.getSenderId();
                                    } else {
                                        senderId = j13;
                                    }
                                } else if (DialogObject.isUserDialog(j13)) {
                                    senderId = j13;
                                } else if (z16) {
                                    senderId = -j13;
                                } else if (DialogObject.isChatDialog(j13)) {
                                    senderId = messageObject4.getSenderId();
                                } else {
                                    senderId = j13;
                                }
                                String[] strArr5 = strArr;
                                str16 = str11;
                                sb2 = sb2;
                                hVar5 = hVar4;
                                p0Var2 = (e0.p0) hVar5.f(senderId + (j17 << 16));
                                string4 = strArr5[0];
                                strArr2 = strArr5;
                                if (string4 == null) {
                                    if (!z14) {
                                        p0Var3 = p0Var2;
                                    } else if (!DialogObject.isChatDialog(j13)) {
                                        p0Var3 = p0Var2;
                                        if (Build.VERSION.SDK_INT > 27) {
                                            string4 = LocaleController.getString(R.string.NotificationHiddenName);
                                        }
                                    } else if (z16) {
                                        p0Var3 = p0Var2;
                                        if (Build.VERSION.SDK_INT > 27) {
                                            string4 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                        }
                                    } else {
                                        p0Var3 = p0Var2;
                                        string4 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                    }
                                    string4 = "";
                                } else {
                                    p0Var3 = p0Var2;
                                }
                                if (p0Var3 == null) {
                                    e0.o0 o0Var6 = new e0.o0();
                                    o0Var6.f5104a = string4;
                                    if (zArr[0]) {
                                        str8 = str8;
                                        j18 = j17;
                                    } else {
                                        str8 = str8;
                                        j18 = j17;
                                    }
                                    p0VarA = o0Var6.a();
                                    hVar5.k(p0VarA, senderId);
                                } else {
                                    e0.o0 o0Var7 = new e0.o0();
                                    o0Var7.f5104a = string4;
                                    if (zArr[0]) {
                                        str8 = str8;
                                        j18 = j17;
                                    } else {
                                        str8 = str8;
                                        j18 = j17;
                                    }
                                    p0VarA = o0Var7.a();
                                    hVar5.k(p0VarA, senderId);
                                }
                                if (DialogObject.isEncryptedDialog(j13)) {
                                    if (zArr[0]) {
                                        notificationsController = this;
                                        hVar6 = hVar5;
                                        e0.z zVar16 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                        arrayList11 = a0Var.f5038e;
                                        arrayList11.add(zVar16);
                                        if (arrayList11.size() > 25) {
                                            c10 = 0;
                                            arrayList11.remove(0);
                                        }
                                        if (!zArr[c10]) {
                                        }
                                    } else {
                                        notificationsController = this;
                                        hVar6 = hVar5;
                                        e0.z zVar17 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                        arrayList11 = a0Var.f5038e;
                                        arrayList11.add(zVar17);
                                        if (arrayList11.size() > 25) {
                                            c10 = 0;
                                            arrayList11.remove(0);
                                        }
                                        if (!zArr[c10]) {
                                        }
                                    }
                                    c10 = 0;
                                    if (!zArr[c10]) {
                                    }
                                } else {
                                    notificationsController = this;
                                    hVar6 = hVar5;
                                    e0.z zVar18 = new e0.z(str15, ((long) messageObject4.messageOwner.date) * 1000, p0VarA);
                                    arrayList10 = a0Var.f5038e;
                                    arrayList10.add(zVar18);
                                    if (arrayList10.size() > 25) {
                                        arrayList10.remove(0);
                                    }
                                }
                                if (j13 == 777000) {
                                    replyMarkup = messageObject4.messageOwner.reply_markup;
                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList312 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                        id3 = messageObject4.getId();
                                        arrayList7 = arrayList312;
                                    } else {
                                        id3 = i21;
                                        arrayList7 = arrayList211;
                                    }
                                } else {
                                    id3 = i21;
                                    arrayList7 = arrayList211;
                                }
                            }
                            size2 = i19 - 1;
                            i18 = id3;
                            notificationsController = notificationsController;
                            zArr = zArr;
                            strArr = strArr2;
                            arrayList5 = arrayList9;
                            dialogKey2 = dialogKey3;
                            sb2 = sb2;
                            str8 = str8;
                            str11 = str16;
                            hVar4 = hVar6;
                            j15 = j18;
                        }
                        str16 = str11;
                        hVar6 = hVar4;
                        strArr2 = strArr;
                        id3 = i21;
                        arrayList7 = arrayList211;
                        size2 = i19 - 1;
                        i18 = id3;
                        notificationsController = notificationsController;
                        zArr = zArr;
                        strArr = strArr2;
                        arrayList5 = arrayList9;
                        dialogKey2 = dialogKey3;
                        sb2 = sb2;
                        str8 = str8;
                        str11 = str16;
                        hVar4 = hVar6;
                        j15 = j18;
                    }
                    str12 = str8;
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList313 = arrayList7;
                    j16 = j15;
                    str13 = str9;
                    bitmap = bitmapDecodeFile;
                    i20 = i18;
                    arrayList8 = arrayList313;
                }
                intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                intent4.putExtra("messageDate", i13);
                intent4.putExtra("dialogId", j13);
                intent4.putExtra(str19, notificationsController2.currentAccount);
                if (dialogKey5.story) {
                    intent4.putExtra("story", true);
                }
                if (messageObject6 != null) {
                    messageObject7 = messageObject6;
                    if (messageObject7.isStoryReactionPush) {
                        intent4.putExtra("storyReaction", true);
                    }
                } else {
                    messageObject7 = messageObject6;
                }
                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160);
            } catch (Exception e15) {
                e = e15;
                messageObject7 = messageObject6;
            }
            hVar2 = hVar7;
            Integer numValueOf = (Integer) hVar8.f(dialogKey6.dialogId);
            if (dialogKey6.story) {
                num = 2147483646;
                arrayList3 = arrayList3;
            } else {
                if (numValueOf == null) {
                    long j30 = dialogKey6.dialogId;
                    numValueOf = Integer.valueOf(((int) j30) + ((int) (j30 >> 32)));
                } else {
                    hVar8.l(dialogKey6.dialogId);
                }
                num = numValueOf;
            }
            int i40 = 0;
            i13 = 0;
            while (true) {
                arrayList4 = arrayList3;
                if (i40 >= arrayList4.size()) {
                    break;
                }
                arrayList3 = arrayList4;
                Integer num4 = num;
                if (i13 < ((MessageObject) arrayList3.get(i40)).messageOwner.date) {
                    i13 = ((MessageObject) arrayList3.get(i40)).messageOwner.date;
                }
                i40++;
                num = num4;
            }
            num2 = num;
            arrayList5 = arrayList4;
            str3 = "Stories";
            if (messageObject != null && messageObject.isStoryReactionPush && !notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                string = LocaleController.getString(R.string.NotificationHiddenChatName);
                fileLocation = null;
                z15 = false;
            }
            if (z14) {
                string = DialogObject.isChatDialog(j13) ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName);
                fileLocation = null;
                z15 = false;
            }
            bitmapDecodeFile = null;
            if (chat != null) {
                o0Var = new e0.o0();
                o0Var.f5104a = string;
                if (file != 0) {
                    loadRoundAvatar(j13, file, o0Var);
                }
                hVar9.k(o0Var.a(), -chat.f22380id);
            }
            chat4 = chat;
            str8 = "currentAccount";
            if (z16) {
                str9 = string;
                notificationsController = this;
                if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j13) <= 0) {
                    file = file;
                    bitmapDecodeFile = bitmapDecodeFile;
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                    intent.putExtra("dialog_id", j13);
                    intent.putExtra("max_id", id2);
                    intent.putExtra("topic_id", j12);
                    intent.putExtra("currentAccount", notificationsController.currentAccount);
                    if (arrayList5.isEmpty()) {
                        arrayList6 = new ArrayList();
                        user2 = user2;
                        while (i14 < arrayList5.size()) {
                            messageObject2 = (MessageObject) arrayList5.get(i14);
                            if (messageObject2 == null) {
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            size = arrayList6.size();
                            iArr = new int[size];
                            while (i15 < size) {
                                iArr[i15] = ((Integer) arrayList6.get(i15)).intValue();
                            }
                            intent.putExtra("voice_msg_ids", iArr);
                        }
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                        e0.r0 r0Var3 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                        if (DialogObject.isChatDialog(j13)) {
                            string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                        } else {
                            string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                        }
                        e0.j jVar9 = new e0.j(R.drawable.ic_reply_icon, string3, broadcast3);
                        jVar9.c();
                        jVar9.f5073g = 1;
                        jVar9.a(r0Var3);
                        jVar9.h = false;
                        kVarB = jVar9.b();
                    } else {
                        user2 = user2;
                    }
                    PendingIntent broadcast4 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                    e0.r0 r0Var4 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                    if (DialogObject.isChatDialog(j13)) {
                        string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                    } else {
                        string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                    }
                    e0.j jVar10 = new e0.j(R.drawable.ic_reply_icon, string3, broadcast4);
                    jVar10.c();
                    jVar10.f5073g = 1;
                    jVar10.a(r0Var4);
                    jVar10.h = false;
                    kVarB = jVar10.b();
                } else {
                    kVarB = null;
                }
            } else {
                str9 = string;
                notificationsController = this;
                if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j13) <= 0) {
                    file = file;
                    bitmapDecodeFile = bitmapDecodeFile;
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                    intent.putExtra("dialog_id", j13);
                    intent.putExtra("max_id", id2);
                    intent.putExtra("topic_id", j12);
                    intent.putExtra("currentAccount", notificationsController.currentAccount);
                    if (arrayList5.isEmpty()) {
                        arrayList6 = new ArrayList();
                        user2 = user2;
                        while (i14 < arrayList5.size()) {
                            messageObject2 = (MessageObject) arrayList5.get(i14);
                            if (messageObject2 == null) {
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            size = arrayList6.size();
                            iArr = new int[size];
                            while (i15 < size) {
                                iArr[i15] = ((Integer) arrayList6.get(i15)).intValue();
                            }
                            intent.putExtra("voice_msg_ids", iArr);
                        }
                        PendingIntent broadcast5 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                        e0.r0 r0Var5 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                        if (DialogObject.isChatDialog(j13)) {
                            string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                        } else {
                            string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                        }
                        e0.j jVar11 = new e0.j(R.drawable.ic_reply_icon, string3, broadcast5);
                        jVar11.c();
                        jVar11.f5073g = 1;
                        jVar11.a(r0Var5);
                        jVar11.h = false;
                        kVarB = jVar11.b();
                    } else {
                        user2 = user2;
                    }
                    PendingIntent broadcast6 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent, 167772160);
                    e0.r0 r0Var6 = new e0.r0(LocaleController.getString(R.string.Reply), new Bundle(), new HashSet());
                    if (DialogObject.isChatDialog(j13)) {
                        string3 = LocaleController.formatString(R.string.ReplyToGroup, str9);
                    } else {
                        string3 = LocaleController.formatString(R.string.ReplyToUser, str9);
                    }
                    e0.j jVar12 = new e0.j(R.drawable.ic_reply_icon, string3, broadcast6);
                    jVar12.c();
                    jVar12.f5073g = 1;
                    jVar12.a(r0Var6);
                    jVar12.h = false;
                    kVarB = jVar12.b();
                } else {
                    kVarB = null;
                }
            }
            num3 = (Integer) notificationsController.pushDialogs.f(j13);
            if (num3 == null) {
                num3 = 0;
            }
            dialogKey2 = dialogKey;
            if (dialogKey2.story) {
                iMax = notificationsController.storyPushMessages.size();
            } else {
                iMax = Math.max(num3.intValue(), arrayList5.size());
            }
            if (iMax > 1) {
                str10 = str9;
            } else {
                str10 = str9;
            }
            long j212 = clientUserId;
            e0.p0 p0Var9 = (e0.p0) hVar9.f(j212);
            i16 = id2;
            if (Build.VERSION.SDK_INT >= 28) {
                j15 = j12;
            } else {
                j15 = j12;
            }
            p0Var = p0Var9;
            if (messageObject == null) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (p0Var == null) {
                a0Var = new e0.a0();
            } else {
                a0Var = new e0.a0();
            }
            i17 = Build.VERSION.SDK_INT;
            if (i17 >= 28) {
                a0Var.f(str10);
            } else {
                a0Var.f(str10);
            }
            if (i17 >= 28) {
                z18 = true;
            } else {
                z18 = true;
            }
            a0Var.f5041i = Boolean.valueOf(z18);
            sb2 = new StringBuilder();
            strArr = new String[1];
            j14 = j212;
            zArr = new boolean[1];
            notificationsController2 = notificationsController;
            dialogKey4 = dialogKey2;
            arrayList14 = arrayList5;
            StringBuilder sb11 = sb2;
            a0.h hVar12 = hVar4;
            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
            intent2.setFlags(67108864);
            intent2.addCategory("android.intent.category.LAUNCHER");
            messageObject5 = messageObject3;
            if (messageObject3 == null) {
                if (messageObject5 == null) {
                    if (messageObject5 == null) {
                    }
                    dialogKey5 = dialogKey4;
                    if (dialogKey5.story) {
                        jArr2 = new long[notificationsController2.storyPushMessages.size()];
                        while (i24 < notificationsController2.storyPushMessages.size()) {
                            jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                        }
                        intent2.putExtra("storyDialogIds", jArr2);
                    } else if (DialogObject.isEncryptedDialog(j13)) {
                        intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                    } else if (DialogObject.isUserDialog(j13)) {
                        intent2.putExtra("userId", j13);
                    } else {
                        intent2.putExtra("chatId", -j13);
                    }
                } else {
                    if (messageObject5 == null) {
                    }
                    dialogKey5 = dialogKey4;
                    if (dialogKey5.story) {
                        jArr2 = new long[notificationsController2.storyPushMessages.size()];
                        while (i24 < notificationsController2.storyPushMessages.size()) {
                            jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                        }
                        intent2.putExtra("storyDialogIds", jArr2);
                    } else if (DialogObject.isEncryptedDialog(j13)) {
                        intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                    } else if (DialogObject.isUserDialog(j13)) {
                        intent2.putExtra("userId", j13);
                    } else {
                        intent2.putExtra("chatId", -j13);
                    }
                }
            } else if (messageObject5 == null) {
                if (messageObject5 == null) {
                }
                dialogKey5 = dialogKey4;
                if (dialogKey5.story) {
                    jArr2 = new long[notificationsController2.storyPushMessages.size()];
                    while (i24 < notificationsController2.storyPushMessages.size()) {
                        jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                    }
                    intent2.putExtra("storyDialogIds", jArr2);
                } else if (DialogObject.isEncryptedDialog(j13)) {
                    intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                } else if (DialogObject.isUserDialog(j13)) {
                    intent2.putExtra("userId", j13);
                } else {
                    intent2.putExtra("chatId", -j13);
                }
            } else {
                if (messageObject5 == null) {
                }
                dialogKey5 = dialogKey4;
                if (dialogKey5.story) {
                    jArr2 = new long[notificationsController2.storyPushMessages.size()];
                    while (i24 < notificationsController2.storyPushMessages.size()) {
                        jArr2[i24] = notificationsController2.storyPushMessages.get(i24).dialogId;
                    }
                    intent2.putExtra("storyDialogIds", jArr2);
                } else if (DialogObject.isEncryptedDialog(j13)) {
                    intent2.putExtra("encId", DialogObject.getEncryptedChatId(j13));
                } else if (DialogObject.isUserDialog(j13)) {
                    intent2.putExtra("userId", j13);
                } else {
                    intent2.putExtra("chatId", -j13);
                }
            }
            j19 = j16;
            i0.a.y(a9.p.q(j13, "show extra notifications chatId ", " topicId "), j19);
            if (j19 != 0) {
                intent2.putExtra("topicId", j19);
            }
            str19 = str12;
            intent2.putExtra(str19, notificationsController2.currentAccount);
            PendingIntent activity4 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 1140850688);
            g0Var = new e0.g0();
            kVar = kVarB;
            if (kVarB != null) {
                g0Var.a(kVar);
            }
            i25 = i20;
            Intent intent11 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
            intent11.addFlags(32);
            intent11.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
            intent11.putExtra("dialog_id", j13);
            intent11.putExtra("max_id", i16);
            intent11.putExtra(str19, notificationsController2.currentAccount);
            arrayList15 = arrayList8;
            bitmap2 = bitmap;
            e0.j jVar13 = new e0.j(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent11, 167772160));
            jVar13.f5073g = 2;
            jVar13.h = false;
            kVarB2 = jVar13.b();
            if (!DialogObject.isEncryptedDialog(j13)) {
                kVar2 = kVarB2;
                messageObject6 = messageObject5;
                if (j13 != globalSecretChatId) {
                    string5 = "tgenc" + DialogObject.getEncryptedChatId(j13) + "_" + i16;
                } else {
                    string5 = null;
                }
            } else if (DialogObject.isUserDialog(j13)) {
                kVar2 = kVarB2;
                messageObject6 = messageObject5;
                string5 = "tguser" + j13 + "_" + i16;
            } else {
                StringBuilder sb12 = new StringBuilder("tgchat");
                kVar2 = kVarB2;
                messageObject6 = messageObject5;
                sb12.append(-j13);
                sb12.append("_");
                sb12.append(i16);
                string5 = sb12.toString();
            }
            if (string5 != null) {
                g0Var.f5061g = string5;
                e0.g0 g0Var5 = new e0.g0();
                g0Var5.f5061g = "summary_".concat(string5);
                tVar.c(g0Var5);
            }
            StringBuilder sb13 = new StringBuilder("tgaccount");
            kVar3 = kVar2;
            j14 = j14;
            sb13.append(j14);
            g0Var.b(sb13.toString());
            if (dialogKey5.story) {
                jMin = Long.MAX_VALUE;
                i28 = 0;
                while (i28 < notificationsController2.storyPushMessages.size()) {
                    jMin = Math.min(notificationsController2.storyPushMessages.get(i28).date, jMin);
                    i28++;
                    kVar3 = kVar3;
                }
                kVar4 = kVar3;
                arrayList16 = arrayList14;
            } else {
                kVar4 = kVar3;
                arrayList16 = arrayList14;
                jMin = ((long) ((MessageObject) arrayList16.get(0)).messageOwner.date) * 1000;
            }
            tVar2 = new e0.t(ApplicationLoader.applicationContext);
            tVar2.g(str13);
            arrayList17 = arrayList16;
            tVar2.E.icon = R.drawable.notification;
            tVar2.f(sb11.toString());
            tVar2.h(16, true);
            if (dialogKey5.story) {
                size3 = notificationsController2.storyPushMessages.size();
            } else {
                size3 = arrayList17.size();
            }
            tVar2.f5124i = size3;
            tVar2.f5137w = -15618822;
            tVar2.f5133r = false;
            tVar2.E.when = jMin;
            tVar2.f5126k = true;
            tVar2.n(a0Var);
            tVar2.f5123g = activity4;
            tVar2.c(g0Var);
            tVar2.l(String.valueOf(Long.MAX_VALUE - jMin));
            tVar2.f5136u = "msg";
            if (z13 != 0) {
                tVar2.f5132q = notificationsController2.notificationGroup;
                tVar2.i();
            }
            if (messageObject7 != null) {
                keyboardInlineButton = null;
                tL_inlineButtonTypeCopy = null;
            } else {
                keyboardInlineButton = null;
                tL_inlineButtonTypeCopy = null;
            }
            if (keyboardInlineButton != null) {
                Intent intent12 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                intent12.addFlags(32);
                intent12.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                intent12.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                e0.j jVar14 = new e0.j(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent12, 167772160));
                jVar14.h = false;
                tVar2.f5119b.add(jVar14.b());
            }
            j20 = dialogKey5.dialogId;
            if (j20 != 489000) {
                if (kVar != null) {
                    tVar2.f5119b.add(kVar);
                }
                if (!z14) {
                    tVar2.f5119b.add(kVar4);
                }
            }
            if (arrayList26.size() != 1) {
            }
            if (DialogObject.isEncryptedDialog(j13)) {
                tVar2.k();
            }
            if (bitmap2 != null) {
                tVar2.j(bitmap2);
            }
            if (!AndroidUtilities.needShowPasscode(false)) {
                size4 = arrayList15.size();
                i26 = 0;
                while (i26 < size4) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList314 = arrayList15;
                    keyboardInlineButtonRow = arrayList314.get(i26);
                    size5 = keyboardInlineButtonRow.buttons.size();
                    i27 = 0;
                    while (i27 < size5) {
                        keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i27);
                        tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) hf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        int i314 = size4;
                        if (tL_inlineButtonTypeCallback != null) {
                            intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                            intent3.putExtra(str19, notificationsController2.currentAccount);
                            intent3.putExtra("did", j13);
                            bArr = tL_inlineButtonTypeCallback.data;
                            if (bArr != null) {
                                intent3.putExtra("data", bArr);
                            }
                            intent3.putExtra("mid", i25);
                            String str25 = keyboardInlineButton2.text;
                            Context context4 = ApplicationLoader.applicationContext;
                            int i315 = notificationsController2.lastButtonId;
                            notificationsController2.lastButtonId = i315 + 1;
                            tVar2.a(0, str25, PendingIntent.getBroadcast(context4, i315, intent3, 167772160));
                        }
                        i27++;
                        size4 = i314;
                        keyboardInlineButtonRow = keyboardInlineButtonRow;
                    }
                    i26++;
                    arrayList15 = arrayList314;
                }
            }
            if (chat4 == null) {
                user3 = user2;
            } else {
                user3 = user2;
            }
            z19 = z13;
            notification3 = notification;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationsController2.setNotificationChannel(notification3, tVar2, z19);
            }
            FileLog.d("showExtraNotifications: holders.add " + j13);
            int iIntValue5 = num2.intValue();
            boolean z28 = dialogKey5.story;
            notification2 = notification3;
            z13 = z19;
            notificationsController3 = notificationsController2;
            long j213 = j13;
            arrayList26 = arrayList26;
            i35 = i35;
            hVar9 = hVar12;
            C1NotificationHolder c1NotificationHolder4 = notificationsController3.new C1NotificationHolder(iIntValue5, j213, z28, j19, str13, user3, chat4, tVar2, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
            arrayList25 = arrayList25;
            arrayList25.add(c1NotificationHolder4);
            notificationsController3.wearNotificationsIds.k(num2, j213);
            i30 = i35 + 1;
            arrayList24 = arrayList25;
            arrayList22 = arrayList26;
            z21 = z14;
            z13 = z13;
            size6 = size6;
            hVar7 = hVar2;
            hVar8 = hVar3;
            notificationsSettings = sharedPreferences;
            clientUserId = j14;
            notificationB = notification2;
            hVar9 = hVar9;
        }
        a0.h hVar13 = hVar8;
        a0.h hVar14 = hVar9;
        if (z13) {
            if (BuildVars.LOGS_ENABLED) {
                i0.a.v(notificationsController3.notificationId, new StringBuilder("show summary with id "));
            }
            try {
                notificationManager.d(notificationsController3.notificationId, notificationB);
                arrayList2 = arrayList;
            } catch (SecurityException e16) {
                FileLog.e(e16);
                arrayList2 = arrayList;
                notificationsController3.resetNotificationSound(tVar, j10, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
            }
        } else {
            arrayList2 = arrayList;
            if (notificationsController3.openedInBubbleDialogs.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    i0.a.v(notificationsController3.notificationId, new StringBuilder("cancel summary with id "));
                }
                notificationManager.b(notificationsController3.notificationId);
            }
        }
        int i41 = 0;
        while (i41 < hVar13.m()) {
            a0.h hVar15 = hVar13;
            if (!notificationsController3.openedInBubbleDialogs.contains(Long.valueOf(hVar15.j(i41)))) {
                Integer num5 = (Integer) hVar15.n(i41);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cancel notification id " + num5);
                }
                notificationManager.b(num5.intValue());
            }
            i41++;
            hVar13 = hVar15;
        }
        ArrayList arrayList40 = new ArrayList(arrayList2.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
        int size7 = arrayList2.size();
        int i42 = 0;
        while (i42 < size7) {
            ArrayList arrayList41 = arrayList2;
            C1NotificationHolder c1NotificationHolder5 = (C1NotificationHolder) arrayList41.get(i42);
            arrayList40.clear();
            if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(c1NotificationHolder5.dialogId)) {
                hVar = hVar14;
            } else {
                e0.t tVar3 = c1NotificationHolder5.notification;
                long j31 = c1NotificationHolder5.dialogId;
                hVar = hVar14;
                String strCreateNotificationShortcut = notificationsController3.createNotificationShortcut(tVar3, j31, c1NotificationHolder5.name, c1NotificationHolder5.user, c1NotificationHolder5.chat, (e0.p0) hVar.f(j31), !c1NotificationHolder5.story);
                if (strCreateNotificationShortcut != null) {
                    arrayList40.add(strCreateNotificationShortcut);
                }
            }
            FileLog.d("showExtraNotifications: holders[" + i42 + "].call()");
            c1NotificationHolder5.call();
            if (!unsupportedNotificationShortcut() && !arrayList40.isEmpty()) {
                g0.f.o(ApplicationLoader.applicationContext, arrayList40);
            }
            i42++;
            notificationsController3 = this;
            arrayList2 = arrayList41;
            hVar14 = hVar;
        }
    }

    private void showOrUpdateNotification(boolean z10) {
        String str;
        long j10;
        long j11;
        MessageObject messageObject;
        Bitmap bitmap;
        TLRPC.Chat chat;
        boolean z11;
        long j12;
        Bitmap bitmap2;
        TLRPC.User user;
        long j13;
        long j14;
        boolean zIsGlobalNotificationsEnabled;
        SharedPreferences sharedPreferences;
        ?? r10;
        boolean z12;
        String string;
        boolean z13;
        boolean z14;
        long j15;
        TLRPC.Chat chat2;
        String firstName;
        e0.t tVar;
        long j16;
        CharSequence charSequence;
        boolean[] zArr;
        String stringForMessage;
        boolean zIsSilentMessage;
        String strReplace;
        ?? r14;
        String str2;
        boolean z15;
        String str3;
        CharSequence charSequence2;
        SharedPreferences sharedPreferences2;
        long j17;
        boolean z16;
        long j18;
        String path;
        boolean z17;
        long j19;
        long j20;
        long j21;
        int property;
        int property2;
        boolean z18;
        String propertyString;
        Integer numValueOf;
        e0.t tVar2;
        long j22;
        String string2;
        boolean z19;
        String str4;
        int i10;
        int iIntValue;
        int i11;
        boolean z20;
        int i12;
        int i13;
        int i14;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int i15;
        String str5;
        int i16;
        Intent intent;
        int i17;
        int i18;
        boolean z25;
        long j23;
        long j24;
        int i19;
        String str6;
        boolean z26;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        long[] jArr;
        int i20;
        long[] jArr2;
        BitmapDrawable imageFromMemory;
        File pathToAttach;
        float fDp;
        int i21;
        Bitmap bitmapDecodeFile;
        int i22;
        int i23;
        long[] jArr3;
        Object obj;
        int i24;
        Object obj2;
        long j25;
        boolean z27;
        Object obj3;
        Object obj4;
        Object obj5;
        long j26;
        Object obj6;
        Uri uri;
        Uri uriD;
        Intent intent2;
        int i25;
        String str7;
        String str8;
        int ringerMode;
        String string3;
        boolean z28;
        String string4;
        boolean z29;
        String string5;
        boolean z30;
        long property3;
        StringBuilder sb2;
        int i26;
        CharSequence charSequence3;
        if (!getUserConfig().isClientActivated() || ((this.pushMessages.isEmpty() && this.storyPushMessages.isEmpty()) || !(SharedConfig.showNotificationsForAllAccounts || this.currentAccount == UserConfig.selectedAccount))) {
            dismissNotification();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j27 = 0;
            Object obj7 = null;
            for (int i27 = 0; i27 < this.pushMessages.size(); i27++) {
                MessageObject messageObject2 = this.pushMessages.get(i27);
                long j28 = messageObject2.messageOwner.date;
                if (j27 < j28) {
                    obj7 = messageObject2;
                    j27 = j28;
                }
            }
            for (int i28 = 0; i28 < this.storyPushMessages.size(); i28++) {
                StoryNotification storyNotification = this.storyPushMessages.get(i28);
                long j29 = storyNotification.date;
                if (j27 < j29 / 1000) {
                    obj7 = storyNotification;
                    j27 = j29 / 1000;
                }
            }
            if (obj7 == null) {
                return;
            }
            String str9 = "";
            if (obj7 instanceof StoryNotification) {
                StoryNotification storyNotification2 = (StoryNotification) obj7;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                j10 = 1000;
                int i29 = 0;
                boolean z31 = false;
                int size = 0;
                j11 = 0;
                while (i29 < this.storyPushMessages.size()) {
                    z31 |= this.storyPushMessages.get(i29).hidden;
                    tL_message.date = Math.min(tL_message.date, (int) (this.storyPushMessages.get(i29).date / 1000));
                    size += this.storyPushMessages.get(i29).dateByIds.size();
                    i29++;
                    str9 = str9;
                }
                String str10 = str9;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j30 = storyNotification2.dialogId;
                tL_peerUser.user_id = j30;
                tL_message.dialog_id = j30;
                tL_message.peer_id = tL_peerUser;
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<Object> arrayList2 = new ArrayList<>();
                parseStoryPushes(arrayList, arrayList2);
                Bitmap bitmapLoadMultipleAvatars = SharedConfig.getDevicePerformanceClass() >= 1 ? loadMultipleAvatars(arrayList2) : null;
                String pluralString = (z31 || this.storyPushMessages.size() >= 2 || arrayList.isEmpty()) ? LocaleController.formatPluralString("Stories", size, new Object[0]) : arrayList.get(0);
                if (z31) {
                    tL_message.message = LocaleController.formatPluralString("StoryNotificationHidden", size, new Object[0]);
                    str = str10;
                } else if (arrayList.isEmpty()) {
                    str = str10;
                    tL_message.message = str;
                } else {
                    str = str10;
                    if (arrayList.size() == 1) {
                        if (size == 1) {
                            tL_message.message = LocaleController.getString("StoryNotificationSingle");
                        } else {
                            tL_message.message = LocaleController.formatPluralString("StoryNotification1", size, arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification2, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.storyPushMessages.size() == 3) {
                        tL_message.message = LocaleController.formatString(R.string.StoryNotification3, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)), cutLastName(arrayList.get(2)));
                    } else {
                        tL_message.message = LocaleController.formatPluralString("StoryNotification4", this.storyPushMessages.size() - 2, cutLastName(arrayList.get(0)), cutLastName(arrayList.get(1)));
                    }
                }
                MessageObject messageObject3 = new MessageObject(this.currentAccount, tL_message, tL_message.message, pluralString, pluralString, false, false, false, false);
                messageObject3.isStoryPush = true;
                messageObject = messageObject3;
                bitmap = bitmapLoadMultipleAvatars;
            } else {
                str = "";
                j10 = 1000;
                j11 = 0;
                messageObject = this.pushMessages.get(0);
                bitmap = null;
            }
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            int i30 = notificationsSettings.getInt("dismissDate", 0);
            if (!messageObject.isStoryPush && messageObject.messageOwner.date <= i30) {
                dismissNotification();
                return;
            }
            long dialogId = messageObject.getDialogId();
            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, getMessagesController().isForum(messageObject));
            boolean z32 = messageObject.isStoryPush;
            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId;
            messageObject.getId();
            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
            long jLongValue = peer.chat_id;
            if (jLongValue == j11) {
                jLongValue = peer.channel_id;
            }
            CharSequence charSequence4 = str;
            long jLongValue2 = peer.user_id;
            if (messageObject.isFromUser() && (jLongValue2 == j11 || jLongValue2 == getUserConfig().getClientUserId())) {
                jLongValue2 = messageObject.messageOwner.from_id.user_id;
            }
            if (messageObject.getDialogId() == 489000 && messageObject.getForwardedFromId() != null) {
                if (messageObject.getForwardedFromId().longValue() >= j11) {
                    jLongValue2 = messageObject.getForwardedFromId().longValue();
                    jLongValue = j11;
                } else {
                    jLongValue = messageObject.getForwardedFromId().longValue();
                    jLongValue2 = j11;
                }
            }
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(jLongValue2));
            if (jLongValue != j11) {
                long j31 = jLongValue;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(j31));
                z11 = (chat4 == null && messageObject.isFcmMessage()) ? messageObject.localChannel : ChatObject.isChannel(chat4) && !chat4.megagroup;
                j12 = j31;
                chat = chat4;
            } else {
                chat = null;
                z11 = false;
                j12 = jLongValue;
            }
            int notifyOverride = getNotifyOverride(notificationsSettings, fromChatId, topicId);
            long j32 = fromChatId;
            if (notifyOverride == -1) {
                try {
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    boolean z33 = messageObject.isReactionPush;
                    NotificationsController notificationsController = this;
                    bitmap2 = bitmap;
                    user = user3;
                    j13 = dialogId;
                    j14 = topicId;
                    zIsGlobalNotificationsEnabled = notificationsController.isGlobalNotificationsEnabled(j13, boolValueOf, z33, z33);
                    sharedPreferences = notificationsSettings;
                    r10 = notificationsController;
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
            } else {
                NotificationsController notificationsController2 = this;
                bitmap2 = bitmap;
                user = user3;
                j13 = dialogId;
                j14 = topicId;
                zIsGlobalNotificationsEnabled = notifyOverride != 2;
            }
            String title = (((r15 == 0 || chat != null) && user != null) || !messageObject.isFcmMessage()) ? chat != null ? r10.getTitle(chat) : UserObject.getUserName(user) : messageObject.localName;
            boolean z34 = AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
            boolean z35 = zIsGlobalNotificationsEnabled;
            String str11 = title;
            boolean zEqualsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            try {
                if (!DialogObject.isEncryptedDialog(j13)) {
                    if (!zEqualsIgnoreCase) {
                        z12 = zEqualsIgnoreCase;
                        if (r10.pushDialogs.m() <= 1) {
                        }
                        if (!messageObject.isReactionPush || messageObject.isStoryReactionPush) {
                            z14 = z13;
                            if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                                string = LocaleController.getString(R.string.NotificationHiddenName);
                            }
                        } else {
                            z14 = z13;
                        }
                        if (z12) {
                            j15 = jLongValue2;
                            chat2 = chat;
                            firstName = charSequence4;
                        } else {
                            if (UserConfig.getActivatedAccountsCount() <= 1) {
                                firstName = charSequence4;
                            } else if (r10.pushDialogs.m() == 1) {
                                firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser());
                            } else {
                                firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser()) + "・";
                            }
                            chat2 = chat;
                            if (r10.pushDialogs.m() == 1 || Build.VERSION.SDK_INT < 23) {
                                j15 = jLongValue2;
                                if (r10.pushDialogs.m() == 1) {
                                    firstName = firstName + LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]);
                                } else {
                                    firstName = firstName + LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r10.pushDialogs.m(), new Object[0]));
                                }
                            } else {
                                j15 = jLongValue2;
                            }
                        }
                        tVar = new e0.t(ApplicationLoader.applicationContext);
                        if (r10.pushMessages.size() > 1 || z12) {
                            j16 = j13;
                            charSequence = charSequence4;
                            zArr = new boolean[1];
                            stringForMessage = r10.getStringForMessage(messageObject, false, zArr, null);
                            zIsSilentMessage = r10.isSilentMessage(messageObject);
                            if (stringForMessage == null) {
                                return;
                            }
                            if (!z14) {
                                strReplace = stringForMessage;
                            } else if (chat2 == null && !z12) {
                                strReplace = stringForMessage.replace(" @ " + string, charSequence);
                            } else if (zArr[0]) {
                                strReplace = stringForMessage.replace(string + ": ", charSequence);
                            } else {
                                strReplace = stringForMessage.replace(string + " ", charSequence);
                            }
                            tVar.f(strReplace);
                            if (z12) {
                                firstName = strReplace;
                            }
                            e0.o oVar = new e0.o(0);
                            oVar.e(strReplace);
                            tVar.n(oVar);
                            r14 = zIsSilentMessage;
                        } else {
                            tVar.f(firstName);
                            e0.o oVar2 = new e0.o(1);
                            oVar2.f(string);
                            int iMin = Math.min(10, r10.pushMessages.size());
                            boolean[] zArr2 = new boolean[1];
                            int i31 = 0;
                            ?? IsSilentMessage = 2;
                            String str12 = null;
                            while (i31 < iMin) {
                                int i32 = iMin;
                                MessageObject messageObject4 = r10.pushMessages.get(i31);
                                long j33 = j13;
                                int i33 = i31;
                                String stringForMessage2 = r10.getStringForMessage(messageObject4, false, zArr2, null);
                                if (stringForMessage2 == null || (!messageObject4.isStoryPush && messageObject4.messageOwner.date <= i30)) {
                                    charSequence3 = charSequence4;
                                } else {
                                    IsSilentMessage = IsSilentMessage;
                                    if (IsSilentMessage == 2) {
                                        str12 = stringForMessage2;
                                        IsSilentMessage = r10.isSilentMessage(messageObject4);
                                    }
                                    if (r10.pushDialogs.m() != 1 || !z14) {
                                        charSequence3 = charSequence4;
                                    } else if (chat2 != null) {
                                        charSequence3 = charSequence4;
                                        stringForMessage2 = stringForMessage2.replace(" @ " + string, charSequence3);
                                    } else {
                                        charSequence3 = charSequence4;
                                        stringForMessage2 = zArr2[0] ? stringForMessage2.replace(string + ": ", charSequence3) : stringForMessage2.replace(string + " ", charSequence3);
                                    }
                                    oVar2.d(stringForMessage2);
                                }
                                charSequence4 = charSequence3;
                                iMin = i32;
                                i31 = i33 + 1;
                                j13 = j33;
                                IsSilentMessage = IsSilentMessage;
                            }
                            j16 = j13;
                            charSequence = charSequence4;
                            oVar2.g(firstName);
                            tVar.n(oVar2);
                            stringForMessage = str12;
                            r14 = IsSilentMessage;
                        }
                        str2 = firstName;
                        if (z10 || !z35 || MediaController.getInstance().isRecordingAudio() || r14 == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15 && j16 == j32 && chat2 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("custom_");
                            j17 = j16;
                            sb3.append(j17);
                            sharedPreferences2 = sharedPreferences;
                            int i34 = 180;
                            if (sharedPreferences2.getBoolean(sb3.toString(), false)) {
                                i26 = sharedPreferences2.getInt("smart_max_count_" + j17, 2);
                                i34 = sharedPreferences2.getInt("smart_delay_" + j17, 180);
                            } else {
                                i26 = 2;
                            }
                            if (i26 == 0) {
                                str3 = str2;
                                charSequence2 = charSequence;
                            } else {
                                Point point = (Point) r10.smartNotificationsDialogs.f(j17);
                                if (point == null) {
                                    r10.smartNotificationsDialogs.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j10)), j17);
                                    str3 = str2;
                                    charSequence2 = charSequence;
                                } else {
                                    int i35 = point.y + i34;
                                    str3 = str2;
                                    charSequence2 = charSequence;
                                    if (i35 < SystemClock.elapsedRealtime() / j10) {
                                        point.set(1, (int) (SystemClock.elapsedRealtime() / j10));
                                    } else {
                                        int i36 = point.x;
                                        if (i36 < i26) {
                                            point.set(i36 + 1, (int) (SystemClock.elapsedRealtime() / j10));
                                        } else {
                                            tVar = tVar;
                                            stringForMessage = stringForMessage;
                                            z16 = true;
                                        }
                                    }
                                }
                            }
                            if (z16) {
                                j18 = j14;
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append("sound_enabled_");
                                j18 = j14;
                                sb2.append(getSharedPrefKey(j17, j18));
                                if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                                    z16 = true;
                                }
                            }
                            path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                            z17 = ApplicationLoader.mainInterfacePaused;
                            boolean z36 = !z17;
                            getSharedPrefKey(j17, j18);
                            j19 = j18;
                            j20 = j17;
                            if (r10.dialogsNotificationsFacade.getProperty("custom_", j20, j19, false)) {
                                property = r10.dialogsNotificationsFacade.getProperty("vibrate_", j20, j19, 0);
                                property2 = r10.dialogsNotificationsFacade.getProperty("priority_", j20, j19, 3);
                                property3 = r10.dialogsNotificationsFacade.getProperty("sound_document_id_", j20, j19, 0L);
                                if (property3 != j11) {
                                    propertyString = r10.getMediaDataController().ringtoneDataStore.e(property3);
                                    z18 = true;
                                } else {
                                    propertyString = r10.dialogsNotificationsFacade.getPropertyString("sound_path_", j20, j19, null);
                                    z18 = false;
                                }
                                int property4 = r10.dialogsNotificationsFacade.getProperty("color_", j20, j19, 0);
                                j21 = j20;
                                numValueOf = property4 != 0 ? Integer.valueOf(property4) : null;
                                tVar2 = tVar;
                                if (messageObject.isReactionPush && !messageObject.isStoryReactionPush) {
                                    if (jLongValue == j11) {
                                        z16 = z16;
                                        stringForMessage = stringForMessage;
                                        numValueOf = numValueOf;
                                        str3 = str3;
                                        long j34 = j11;
                                        if (j15 != j34) {
                                            long j35 = sharedPreferences2.getLong(z32 != 0 ? "StoriesSoundDocId" : "GlobalSoundDocId", j34);
                                            if (j35 != j34) {
                                                string3 = r10.getMediaDataController().ringtoneDataStore.e(j35);
                                                z28 = true;
                                            } else {
                                                string3 = sharedPreferences2.getString(z32 != 0 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                z28 = false;
                                            }
                                            str4 = string3;
                                            int i37 = sharedPreferences2.getInt("vibrate_messages", 0);
                                            i10 = sharedPreferences2.getInt("priority_messages", 1);
                                            iIntValue = sharedPreferences2.getInt("MessagesLed", -16776961);
                                            i11 = z32 ? 3 : 1;
                                            z20 = z28;
                                            i12 = i37;
                                            i13 = 4;
                                        } else {
                                            z18 = z18;
                                            iIntValue = -16776961;
                                            i12 = 0;
                                            str4 = null;
                                            i13 = 4;
                                            i10 = 0;
                                            i11 = 1;
                                            z20 = false;
                                        }
                                    } else if (z11) {
                                        long j36 = j11;
                                        long j37 = sharedPreferences2.getLong("ChannelSoundDocId", j36);
                                        if (j37 != j36) {
                                            string5 = r10.getMediaDataController().ringtoneDataStore.e(j37);
                                            z30 = true;
                                        } else {
                                            string5 = sharedPreferences2.getString("ChannelSoundPath", path);
                                            z30 = false;
                                        }
                                        str4 = string5;
                                        int i38 = sharedPreferences2.getInt("vibrate_channel", 0);
                                        i10 = sharedPreferences2.getInt("priority_channel", 1);
                                        iIntValue = sharedPreferences2.getInt("ChannelLed", -16776961);
                                        z20 = z30;
                                        i12 = i38;
                                        i11 = 2;
                                    } else {
                                        long j38 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                        if (j38 != 0) {
                                            string4 = r10.getMediaDataController().ringtoneDataStore.e(j38);
                                            z29 = true;
                                        } else {
                                            string4 = sharedPreferences2.getString("GroupSoundPath", path);
                                            z29 = false;
                                        }
                                        str4 = string4;
                                        int i39 = sharedPreferences2.getInt("vibrate_group", 0);
                                        i10 = sharedPreferences2.getInt("priority_group", 1);
                                        iIntValue = sharedPreferences2.getInt("GroupLed", -16776961);
                                        z20 = z29;
                                        i12 = i39;
                                        i11 = 0;
                                    }
                                    if (i12 == i13) {
                                        z21 = true;
                                        i14 = 0;
                                    } else {
                                        i14 = i12;
                                        z21 = false;
                                    }
                                    if (!TextUtils.isEmpty(propertyString) || TextUtils.equals(str4, propertyString)) {
                                        propertyString = str4;
                                        z18 = z20;
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    z23 = z21;
                                    if (property2 != 3 || i10 == property2) {
                                        property2 = i10;
                                    } else {
                                        z22 = false;
                                    }
                                    if (numValueOf != null && numValueOf.intValue() != iIntValue) {
                                        iIntValue = numValueOf.intValue();
                                        z22 = false;
                                    }
                                    if (property != 0 || property == 4 || property == i14) {
                                        z24 = z22;
                                        property = i14;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z17) {
                                        i15 = property;
                                        str5 = propertyString;
                                    } else {
                                        if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                            propertyString = null;
                                        }
                                        if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                            property = 2;
                                        }
                                        if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                            i15 = property;
                                            str5 = propertyString;
                                            property2 = 2;
                                        } else {
                                            i15 = property;
                                            str5 = propertyString;
                                            property2 = 0;
                                        }
                                    }
                                    if (z23 && i15 != 2) {
                                        try {
                                            ringerMode = audioManager.getRingerMode();
                                            if (ringerMode != 0 && ringerMode != 1) {
                                                i15 = 2;
                                            }
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                    int i40 = i11;
                                    if (z16) {
                                        i15 = 0;
                                        str5 = null;
                                        property2 = 0;
                                        i16 = 0;
                                    } else {
                                        i16 = iIntValue;
                                    }
                                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("com.tmessages.openchat");
                                    i17 = i15;
                                    sb4.append(Math.random());
                                    sb4.append(Integer.MAX_VALUE);
                                    intent.setAction(sb4.toString());
                                    intent.setFlags(67108864);
                                    if (messageObject.isOauthPush) {
                                        intent.putExtra("oauth_url", messageObject.localName);
                                    }
                                    if (!messageObject.isStoryReactionPush) {
                                        if (messageObject.isLiveStoryPush) {
                                            if (r15 != 0) {
                                                i18 = i17;
                                                z25 = z24;
                                                intent.putExtra("chatId", j12);
                                            } else {
                                                i18 = i17;
                                                z25 = z24;
                                                if (j15 != 0) {
                                                    intent.putExtra("userId", j15);
                                                }
                                            }
                                            intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                        } else {
                                            i18 = i17;
                                            z25 = z24;
                                            j23 = j12;
                                            j24 = j15;
                                            i19 = i16;
                                            str6 = path;
                                            if (messageObject.isStoryPush) {
                                                jArr = new long[r10.storyPushMessages.size()];
                                                for (i20 = 0; i20 < r10.storyPushMessages.size(); i20++) {
                                                    jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                                }
                                                intent.putExtra("storyDialogIds", jArr);
                                                z26 = z17;
                                                user2 = user;
                                                chat3 = chat2;
                                                fileLocation = null;
                                            } else {
                                                if (DialogObject.isEncryptedDialog(j21)) {
                                                    z26 = z17;
                                                    user2 = user;
                                                    chat3 = chat2;
                                                    if (r10.pushDialogs.m() == 1 && j21 != globalSecretChatId) {
                                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                                    }
                                                } else {
                                                    z26 = z17;
                                                    if (r10.pushDialogs.m() == 1) {
                                                        if (r15 != 0) {
                                                            intent.putExtra("chatId", j23);
                                                        } else if (j24 != 0) {
                                                            intent.putExtra("userId", j24);
                                                        }
                                                    }
                                                    if (!AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter || r10.pushDialogs.m() != 1 || Build.VERSION.SDK_INT >= 28) {
                                                        user2 = user;
                                                        chat3 = chat2;
                                                    } else if (chat2 != null) {
                                                        chat3 = chat2;
                                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                        if (chatPhoto == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                                                            user2 = user;
                                                        } else {
                                                            fileLocation = fileLocation2;
                                                            user2 = user;
                                                        }
                                                    } else {
                                                        chat3 = chat2;
                                                        if (user != null) {
                                                            user2 = user;
                                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                            if (userProfilePhoto == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                                            }
                                                        } else {
                                                            user2 = user;
                                                        }
                                                    }
                                                }
                                                fileLocation = null;
                                            }
                                        }
                                        intent.putExtra("currentAccount", r10.currentAccount);
                                        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                        tVar2.g(string);
                                        tVar2.E.icon = R.drawable.notification;
                                        tVar2.h(16, true);
                                        tVar2.f5124i = r10.total_unread_count;
                                        tVar2.f5123g = activity;
                                        tVar2.f5132q = r10.notificationGroup;
                                        tVar2.f5133r = true;
                                        tVar2.f5126k = true;
                                        tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                        tVar2.f5137w = -15618822;
                                        tVar2.f5136u = "msg";
                                        if (chat3 == null && user2 != null && (str7 = user2.phone) != null && str7.length() > 0) {
                                            str8 = "tel:+" + user2.phone;
                                            if (str8 != null && !str8.isEmpty()) {
                                                tVar2.F.add(str8);
                                            }
                                        }
                                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                        intent2.putExtra("currentAccount", r10.currentAccount);
                                        if (messageObject.isStoryPush) {
                                            intent2.putExtra("story", true);
                                        }
                                        if (messageObject.isStoryReactionPush) {
                                            i25 = 1;
                                            intent2.putExtra("storyReaction", true);
                                        } else {
                                            i25 = 1;
                                        }
                                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                        if (bitmap2 != null) {
                                            if (fileLocation != null) {
                                                jArr2 = null;
                                                imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                                if (imageFromMemory != null) {
                                                    tVar2.j(imageFromMemory.getBitmap());
                                                } else {
                                                    try {
                                                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                                        if (pathToAttach.exists()) {
                                                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                            BitmapFactory.Options options = new BitmapFactory.Options();
                                                            if (fDp < 1.0f) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = (int) fDp;
                                                            }
                                                            options.inSampleSize = i21;
                                                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options);
                                                            if (bitmapDecodeFile != null) {
                                                                tVar2.j(bitmapDecodeFile);
                                                            }
                                                        }
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (z10 || r14 == 1) {
                                                tVar2.f5125j = -1;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    i22 = 2;
                                                } else {
                                                    i22 = 0;
                                                }
                                            } else if (property2 == 0) {
                                                tVar2.f5125j = 0;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    i22 = 3;
                                                } else {
                                                    i22 = 0;
                                                }
                                            } else {
                                                int i41 = 1;
                                                if (property2 == 1) {
                                                    tVar2.f5125j = i41;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        i22 = 4;
                                                    } else {
                                                        i22 = 0;
                                                    }
                                                } else if (property2 == 2) {
                                                    i41 = 1;
                                                    tVar2.f5125j = i41;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        i22 = 4;
                                                    } else {
                                                        i22 = 0;
                                                    }
                                                } else {
                                                    if (property2 == 4) {
                                                        tVar2.f5125j = -2;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                            i22 = 1;
                                                        }
                                                    } else if (property2 == 5) {
                                                        tVar2.f5125j = -1;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                            i22 = 2;
                                                        }
                                                    }
                                                    i22 = 0;
                                                }
                                            }
                                            if (r14 != 1 || z16) {
                                                i23 = i19;
                                                jArr3 = new long[]{0, 0};
                                                tVar2.E.vibrate = jArr3;
                                                obj = jArr2;
                                            } else {
                                                if (z26 || (sharedPreferences2.getBoolean("EnableInAppPreview", true) && stringForMessage != null)) {
                                                    tVar2.p(stringForMessage.length() > 100 ? stringForMessage.substring(0, 100).replace('\n', ' ').trim() + "..." : stringForMessage);
                                                }
                                                if (str5 == null || str5.equalsIgnoreCase("NoSound")) {
                                                    obj6 = jArr2;
                                                } else {
                                                    int i42 = Build.VERSION.SDK_INT;
                                                    if (i42 < 26) {
                                                        if (str5.equals(str6)) {
                                                            tVar2.m(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                        } else if (i42 < 24 || !str5.startsWith("file://") || AndroidUtilities.isInternalUri(Uri.parse(str5))) {
                                                            tVar2.m(Uri.parse(str5));
                                                        } else {
                                                            try {
                                                                Uri uriD2 = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str5.replace("file://", charSequence2)));
                                                                ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriD2, 1);
                                                                tVar2.m(uriD2);
                                                            } catch (Exception unused2) {
                                                                tVar2.m(Uri.parse(str5));
                                                            }
                                                        }
                                                        obj6 = jArr2;
                                                    } else if (str5.equalsIgnoreCase("Default") || str5.equals(str6)) {
                                                        obj6 = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                    } else if (z18) {
                                                        uriD = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", new File(str5));
                                                        ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriD, 1);
                                                    } else {
                                                        uri = Uri.parse(str5);
                                                    }
                                                }
                                                if (i19 != 0) {
                                                    obj6 = uri;
                                                    obj6 = uriD;
                                                    Notification notification = tVar2.E;
                                                    i23 = i19;
                                                    notification.ledARGB = i23;
                                                    notification.ledOnMS = 1000;
                                                    notification.ledOffMS = 1000;
                                                    notification.flags = ((-2) & notification.flags) | 1;
                                                } else {
                                                    obj6 = uri;
                                                    obj6 = uriD;
                                                    i23 = i19;
                                                }
                                                int i43 = i18;
                                                if (i43 == 2) {
                                                    jArr3 = new long[]{0, 0};
                                                    tVar2.E.vibrate = jArr3;
                                                } else if (i43 == 1) {
                                                    jArr3 = new long[]{0, 100, 0, 100};
                                                    tVar2.E.vibrate = jArr3;
                                                } else if (i43 == 0 || i43 == 4) {
                                                    tVar2.E.defaults = 2;
                                                    jArr3 = new long[0];
                                                } else if (i43 == 3) {
                                                    jArr3 = new long[]{0, 1000};
                                                    tVar2.E.vibrate = jArr3;
                                                } else {
                                                    obj = obj6;
                                                    jArr3 = jArr2;
                                                }
                                                obj = obj6;
                                            }
                                            if (AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter && messageObject.getDialogId() == 777000) {
                                                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                    int size2 = arrayList3.size();
                                                    int i44 = 0;
                                                    boolean z37 = false;
                                                    while (i44 < size2) {
                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i44);
                                                        int size3 = keyboardInlineButtonRow.buttons.size();
                                                        boolean z38 = z37;
                                                        for (int i45 = 0; i45 < size3; i45++) {
                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i45);
                                                            TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) hf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                            if (tL_inlineButtonTypeCallback != null) {
                                                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                                                intent3.putExtra("currentAccount", r10.currentAccount);
                                                                Object obj8 = obj4;
                                                                j26 = j21;
                                                                intent3.putExtra("did", j26);
                                                                byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                if (bArr != null) {
                                                                    obj3 = obj;
                                                                    obj4 = obj3;
                                                                    intent3.putExtra("data", bArr);
                                                                }
                                                                obj3 = obj;
                                                                obj4 = obj3;
                                                                intent3.putExtra("mid", messageObject.getId());
                                                                String str13 = keyboardInlineButton.text;
                                                                Context context = ApplicationLoader.applicationContext;
                                                                int i46 = r10.lastButtonId;
                                                                obj5 = obj8;
                                                                r10.lastButtonId = i46 + 1;
                                                                tVar2.a(0, str13, PendingIntent.getBroadcast(context, i46, intent3, 167772160));
                                                                z38 = true;
                                                            } else {
                                                                obj3 = obj;
                                                                obj4 = obj3;
                                                                obj5 = obj4;
                                                                j26 = j21;
                                                            }
                                                            j21 = j26;
                                                            arrayList3 = arrayList3;
                                                            size2 = size2;
                                                            obj4 = obj5;
                                                            i23 = i23;
                                                        }
                                                        obj3 = obj;
                                                        obj4 = obj3;
                                                        i44++;
                                                        z37 = z38;
                                                        size2 = size2;
                                                        obj3 = obj4;
                                                    }
                                                    obj3 = obj;
                                                    i24 = i23;
                                                    z27 = z37;
                                                    obj2 = obj3;
                                                    j25 = j21;
                                                } else {
                                                    i24 = i23;
                                                    obj2 = obj;
                                                    j25 = j21;
                                                    z27 = false;
                                                }
                                            } else {
                                                i24 = i23;
                                                obj2 = obj;
                                                j25 = j21;
                                                z27 = false;
                                            }
                                            if (!z27 && Build.VERSION.SDK_INT < 24 && SharedConfig.passcodeHash.length() == 0 && r10.hasMessagesToReply()) {
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                                intent4.putExtra("currentAccount", r10.currentAccount);
                                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent4, 167772160));
                                            }
                                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i40);
                                            scheduleNotificationRepeat();
                                        }
                                        tVar2.j(bitmap2);
                                        jArr2 = null;
                                        if (z10) {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        } else {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        }
                                        if (r14 != 1) {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        } else {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        }
                                        if (AndroidUtilities.needShowPasscode()) {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        } else {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        }
                                        if (!z27) {
                                            Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                            intent5.putExtra("currentAccount", r10.currentAccount);
                                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent5, 167772160));
                                        }
                                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i40);
                                        scheduleNotificationRepeat();
                                    }
                                    intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                    i18 = i17;
                                    z25 = z24;
                                    i19 = i16;
                                    str6 = path;
                                    z26 = z17;
                                    user2 = user;
                                    chat3 = chat2;
                                    fileLocation = null;
                                    intent.putExtra("currentAccount", r10.currentAccount);
                                    PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                    tVar2.g(string);
                                    tVar2.E.icon = R.drawable.notification;
                                    tVar2.h(16, true);
                                    tVar2.f5124i = r10.total_unread_count;
                                    tVar2.f5123g = activity2;
                                    tVar2.f5132q = r10.notificationGroup;
                                    tVar2.f5133r = true;
                                    tVar2.f5126k = true;
                                    tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                    tVar2.f5137w = -15618822;
                                    tVar2.f5136u = "msg";
                                    if (chat3 == null) {
                                        str8 = "tel:+" + user2.phone;
                                        if (str8 != null) {
                                            tVar2.F.add(str8);
                                        }
                                    }
                                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                    intent2.putExtra("currentAccount", r10.currentAccount);
                                    if (messageObject.isStoryPush) {
                                        intent2.putExtra("story", true);
                                    }
                                    if (messageObject.isStoryReactionPush) {
                                        i25 = 1;
                                        intent2.putExtra("storyReaction", true);
                                    } else {
                                        i25 = 1;
                                    }
                                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                    if (bitmap2 != null) {
                                        if (fileLocation != null) {
                                            jArr2 = null;
                                            imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                            if (imageFromMemory != null) {
                                                tVar2.j(imageFromMemory.getBitmap());
                                            } else {
                                                pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                                if (pathToAttach.exists()) {
                                                    fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                                                    if (fDp < 1.0f) {
                                                        i21 = 1;
                                                    } else {
                                                        i21 = (int) fDp;
                                                    }
                                                    options2.inSampleSize = i21;
                                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options2);
                                                    if (bitmapDecodeFile != null) {
                                                        tVar2.j(bitmapDecodeFile);
                                                    }
                                                }
                                            }
                                        }
                                        if (z10) {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        } else {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        }
                                        if (r14 != 1) {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        } else {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        }
                                        if (AndroidUtilities.needShowPasscode()) {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        } else {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        }
                                        if (!z27) {
                                            Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                            intent6.putExtra("currentAccount", r10.currentAccount);
                                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent6, 167772160));
                                        }
                                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i40);
                                        scheduleNotificationRepeat();
                                    }
                                    tVar2.j(bitmap2);
                                    jArr2 = null;
                                    if (z10) {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    } else {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    if (r14 != 1) {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    } else {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    } else {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    }
                                    if (!z27) {
                                        Intent intent7 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                        intent7.putExtra("currentAccount", r10.currentAccount);
                                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent7, 167772160));
                                    }
                                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i40);
                                    scheduleNotificationRepeat();
                                }
                                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j22 != 0) {
                                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                    z19 = true;
                                } else {
                                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                    z19 = false;
                                }
                                str4 = string2;
                                int i47 = sharedPreferences2.getInt("vibrate_react", 0);
                                i10 = sharedPreferences2.getInt("priority_react", 1);
                                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject.isStoryReactionPush) {
                                    i11 = 5;
                                } else {
                                    i11 = 4;
                                }
                                z20 = z19;
                                i12 = i47;
                                i13 = 4;
                                if (i12 == i13) {
                                    z21 = true;
                                    i14 = 0;
                                } else {
                                    i14 = i12;
                                    z21 = false;
                                }
                                if (TextUtils.isEmpty(propertyString)) {
                                    propertyString = str4;
                                    z18 = z20;
                                    z22 = true;
                                } else {
                                    propertyString = str4;
                                    z18 = z20;
                                    z22 = true;
                                }
                                z23 = z21;
                                if (property2 != 3) {
                                    property2 = i10;
                                } else {
                                    property2 = i10;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    z22 = false;
                                }
                                if (property != 0) {
                                    z24 = z22;
                                    property = i14;
                                } else {
                                    z24 = z22;
                                    property = i14;
                                }
                                if (z17) {
                                    if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                        propertyString = null;
                                    }
                                    if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                        property = 2;
                                    }
                                    if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                        i15 = property;
                                        str5 = propertyString;
                                        property2 = 2;
                                    } else {
                                        i15 = property;
                                        str5 = propertyString;
                                        property2 = 0;
                                    }
                                } else {
                                    i15 = property;
                                    str5 = propertyString;
                                }
                                if (z23) {
                                    ringerMode = audioManager.getRingerMode();
                                    if (ringerMode != 0) {
                                        i15 = 2;
                                    }
                                }
                                int i48 = i11;
                                if (z16) {
                                    i15 = 0;
                                    str5 = null;
                                    property2 = 0;
                                    i16 = 0;
                                } else {
                                    i16 = iIntValue;
                                }
                                intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("com.tmessages.openchat");
                                i17 = i15;
                                sb5.append(Math.random());
                                sb5.append(Integer.MAX_VALUE);
                                intent.setAction(sb5.toString());
                                intent.setFlags(67108864);
                                if (messageObject.isOauthPush) {
                                    intent.putExtra("oauth_url", messageObject.localName);
                                }
                                if (!messageObject.isStoryReactionPush) {
                                    if (messageObject.isLiveStoryPush) {
                                        if (r15 != 0) {
                                            i18 = i17;
                                            z25 = z24;
                                            intent.putExtra("chatId", j12);
                                        } else {
                                            i18 = i17;
                                            z25 = z24;
                                            if (j15 != 0) {
                                                intent.putExtra("userId", j15);
                                            }
                                        }
                                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                    } else {
                                        i18 = i17;
                                        z25 = z24;
                                        j23 = j12;
                                        j24 = j15;
                                        i19 = i16;
                                        str6 = path;
                                        if (messageObject.isStoryPush) {
                                            jArr = new long[r10.storyPushMessages.size()];
                                            while (i20 < r10.storyPushMessages.size()) {
                                                jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                            }
                                            intent.putExtra("storyDialogIds", jArr);
                                            z26 = z17;
                                            user2 = user;
                                            chat3 = chat2;
                                            fileLocation = null;
                                        } else {
                                            if (DialogObject.isEncryptedDialog(j21)) {
                                                z26 = z17;
                                                if (r10.pushDialogs.m() == 1) {
                                                    if (r15 != 0) {
                                                        intent.putExtra("chatId", j23);
                                                    } else if (j24 != 0) {
                                                        intent.putExtra("userId", j24);
                                                    }
                                                }
                                                if (AndroidUtilities.needShowPasscode()) {
                                                    user2 = user;
                                                    chat3 = chat2;
                                                } else {
                                                    user2 = user;
                                                    chat3 = chat2;
                                                }
                                            } else {
                                                z26 = z17;
                                                user2 = user;
                                                chat3 = chat2;
                                                if (r10.pushDialogs.m() == 1) {
                                                    intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                                }
                                            }
                                            fileLocation = null;
                                        }
                                    }
                                    intent.putExtra("currentAccount", r10.currentAccount);
                                    PendingIntent activity3 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                    tVar2.g(string);
                                    tVar2.E.icon = R.drawable.notification;
                                    tVar2.h(16, true);
                                    tVar2.f5124i = r10.total_unread_count;
                                    tVar2.f5123g = activity3;
                                    tVar2.f5132q = r10.notificationGroup;
                                    tVar2.f5133r = true;
                                    tVar2.f5126k = true;
                                    tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                    tVar2.f5137w = -15618822;
                                    tVar2.f5136u = "msg";
                                    if (chat3 == null) {
                                        str8 = "tel:+" + user2.phone;
                                        if (str8 != null) {
                                            tVar2.F.add(str8);
                                        }
                                    }
                                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                    intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                    intent2.putExtra("currentAccount", r10.currentAccount);
                                    if (messageObject.isStoryPush) {
                                        intent2.putExtra("story", true);
                                    }
                                    if (messageObject.isStoryReactionPush) {
                                        i25 = 1;
                                        intent2.putExtra("storyReaction", true);
                                    } else {
                                        i25 = 1;
                                    }
                                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                    if (bitmap2 != null) {
                                        if (fileLocation != null) {
                                            jArr2 = null;
                                            imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                            if (imageFromMemory != null) {
                                                tVar2.j(imageFromMemory.getBitmap());
                                            } else {
                                                pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                                if (pathToAttach.exists()) {
                                                    fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                    BitmapFactory.Options options3 = new BitmapFactory.Options();
                                                    if (fDp < 1.0f) {
                                                        i21 = 1;
                                                    } else {
                                                        i21 = (int) fDp;
                                                    }
                                                    options3.inSampleSize = i21;
                                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options3);
                                                    if (bitmapDecodeFile != null) {
                                                        tVar2.j(bitmapDecodeFile);
                                                    }
                                                }
                                            }
                                        }
                                        if (z10) {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        } else {
                                            tVar2.f5125j = -1;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 0;
                                            }
                                        }
                                        if (r14 != 1) {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        } else {
                                            i23 = i19;
                                            jArr3 = new long[]{0, 0};
                                            tVar2.E.vibrate = jArr3;
                                            obj = jArr2;
                                        }
                                        if (AndroidUtilities.needShowPasscode()) {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        } else {
                                            i24 = i23;
                                            obj2 = obj;
                                            j25 = j21;
                                            z27 = false;
                                        }
                                        if (!z27) {
                                            Intent intent8 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                            intent8.putExtra("currentAccount", r10.currentAccount);
                                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent8, 167772160));
                                        }
                                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i48);
                                        scheduleNotificationRepeat();
                                    }
                                    tVar2.j(bitmap2);
                                    jArr2 = null;
                                    if (z10) {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    } else {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    if (r14 != 1) {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    } else {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    } else {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    }
                                    if (!z27) {
                                        Intent intent9 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                        intent9.putExtra("currentAccount", r10.currentAccount);
                                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent9, 167772160));
                                    }
                                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i48);
                                    scheduleNotificationRepeat();
                                }
                                intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                i18 = i17;
                                z25 = z24;
                                i19 = i16;
                                str6 = path;
                                z26 = z17;
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                                intent.putExtra("currentAccount", r10.currentAccount);
                                PendingIntent activity4 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                tVar2.g(string);
                                tVar2.E.icon = R.drawable.notification;
                                tVar2.h(16, true);
                                tVar2.f5124i = r10.total_unread_count;
                                tVar2.f5123g = activity4;
                                tVar2.f5132q = r10.notificationGroup;
                                tVar2.f5133r = true;
                                tVar2.f5126k = true;
                                tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                tVar2.f5137w = -15618822;
                                tVar2.f5136u = "msg";
                                if (chat3 == null) {
                                    str8 = "tel:+" + user2.phone;
                                    if (str8 != null) {
                                        tVar2.F.add(str8);
                                    }
                                }
                                intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                intent2.putExtra("currentAccount", r10.currentAccount);
                                if (messageObject.isStoryPush) {
                                    intent2.putExtra("story", true);
                                }
                                if (messageObject.isStoryReactionPush) {
                                    i25 = 1;
                                    intent2.putExtra("storyReaction", true);
                                } else {
                                    i25 = 1;
                                }
                                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                if (bitmap2 != null) {
                                    if (fileLocation != null) {
                                        jArr2 = null;
                                        imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                        if (imageFromMemory != null) {
                                            tVar2.j(imageFromMemory.getBitmap());
                                        } else {
                                            pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                            if (pathToAttach.exists()) {
                                                fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                BitmapFactory.Options options4 = new BitmapFactory.Options();
                                                if (fDp < 1.0f) {
                                                    i21 = 1;
                                                } else {
                                                    i21 = (int) fDp;
                                                }
                                                options4.inSampleSize = i21;
                                                bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options4);
                                                if (bitmapDecodeFile != null) {
                                                    tVar2.j(bitmapDecodeFile);
                                                }
                                            }
                                        }
                                    }
                                    if (z10) {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    } else {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    if (r14 != 1) {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    } else {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    } else {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    }
                                    if (!z27) {
                                        Intent intent10 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                        intent10.putExtra("currentAccount", r10.currentAccount);
                                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent10, 167772160));
                                    }
                                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i48);
                                    scheduleNotificationRepeat();
                                }
                                tVar2.j(bitmap2);
                                jArr2 = null;
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent11 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent11.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent11, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i48);
                                scheduleNotificationRepeat();
                            }
                            j21 = j20;
                            property = 0;
                            property2 = 3;
                            z18 = false;
                            propertyString = null;
                            tVar2 = tVar;
                            if (messageObject.isReactionPush) {
                                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j22 != 0) {
                                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                    z19 = true;
                                } else {
                                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                    z19 = false;
                                }
                                str4 = string2;
                                int i49 = sharedPreferences2.getInt("vibrate_react", 0);
                                i10 = sharedPreferences2.getInt("priority_react", 1);
                                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject.isStoryReactionPush) {
                                    i11 = 5;
                                } else {
                                    i11 = 4;
                                }
                                z20 = z19;
                                i12 = i49;
                                i13 = 4;
                            } else {
                                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j22 != 0) {
                                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                    z19 = true;
                                } else {
                                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                    z19 = false;
                                }
                                str4 = string2;
                                int i410 = sharedPreferences2.getInt("vibrate_react", 0);
                                i10 = sharedPreferences2.getInt("priority_react", 1);
                                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject.isStoryReactionPush) {
                                    i11 = 5;
                                } else {
                                    i11 = 4;
                                }
                                z20 = z19;
                                i12 = i410;
                                i13 = 4;
                            }
                            if (i12 == i13) {
                                z21 = true;
                                i14 = 0;
                            } else {
                                i14 = i12;
                                z21 = false;
                            }
                            if (TextUtils.isEmpty(propertyString)) {
                                propertyString = str4;
                                z18 = z20;
                                z22 = true;
                            } else {
                                propertyString = str4;
                                z18 = z20;
                                z22 = true;
                            }
                            z23 = z21;
                            if (property2 != 3) {
                                property2 = i10;
                            } else {
                                property2 = i10;
                            }
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                                z22 = false;
                            }
                            if (property != 0) {
                                z24 = z22;
                                property = i14;
                            } else {
                                z24 = z22;
                                property = i14;
                            }
                            if (z17) {
                                if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                    propertyString = null;
                                }
                                if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                    property = 2;
                                }
                                if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                    i15 = property;
                                    str5 = propertyString;
                                    property2 = 2;
                                } else {
                                    i15 = property;
                                    str5 = propertyString;
                                    property2 = 0;
                                }
                            } else {
                                i15 = property;
                                str5 = propertyString;
                            }
                            if (z23) {
                                ringerMode = audioManager.getRingerMode();
                                if (ringerMode != 0) {
                                    i15 = 2;
                                }
                            }
                            int i411 = i11;
                            if (z16) {
                                i15 = 0;
                                str5 = null;
                                property2 = 0;
                                i16 = 0;
                            } else {
                                i16 = iIntValue;
                            }
                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("com.tmessages.openchat");
                            i17 = i15;
                            sb6.append(Math.random());
                            sb6.append(Integer.MAX_VALUE);
                            intent.setAction(sb6.toString());
                            intent.setFlags(67108864);
                            if (messageObject.isOauthPush) {
                                intent.putExtra("oauth_url", messageObject.localName);
                            }
                            if (!messageObject.isStoryReactionPush) {
                                if (messageObject.isLiveStoryPush) {
                                    if (r15 != 0) {
                                        i18 = i17;
                                        z25 = z24;
                                        intent.putExtra("chatId", j12);
                                    } else {
                                        i18 = i17;
                                        z25 = z24;
                                        if (j15 != 0) {
                                            intent.putExtra("userId", j15);
                                        }
                                    }
                                    intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                } else {
                                    i18 = i17;
                                    z25 = z24;
                                    j23 = j12;
                                    j24 = j15;
                                    i19 = i16;
                                    str6 = path;
                                    if (messageObject.isStoryPush) {
                                        jArr = new long[r10.storyPushMessages.size()];
                                        while (i20 < r10.storyPushMessages.size()) {
                                            jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                        }
                                        intent.putExtra("storyDialogIds", jArr);
                                        z26 = z17;
                                        user2 = user;
                                        chat3 = chat2;
                                        fileLocation = null;
                                    } else {
                                        if (DialogObject.isEncryptedDialog(j21)) {
                                            z26 = z17;
                                            if (r10.pushDialogs.m() == 1) {
                                                if (r15 != 0) {
                                                    intent.putExtra("chatId", j23);
                                                } else if (j24 != 0) {
                                                    intent.putExtra("userId", j24);
                                                }
                                            }
                                            if (AndroidUtilities.needShowPasscode()) {
                                                user2 = user;
                                                chat3 = chat2;
                                            } else {
                                                user2 = user;
                                                chat3 = chat2;
                                            }
                                        } else {
                                            z26 = z17;
                                            user2 = user;
                                            chat3 = chat2;
                                            if (r10.pushDialogs.m() == 1) {
                                                intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                            }
                                        }
                                        fileLocation = null;
                                    }
                                }
                                intent.putExtra("currentAccount", r10.currentAccount);
                                PendingIntent activity5 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                tVar2.g(string);
                                tVar2.E.icon = R.drawable.notification;
                                tVar2.h(16, true);
                                tVar2.f5124i = r10.total_unread_count;
                                tVar2.f5123g = activity5;
                                tVar2.f5132q = r10.notificationGroup;
                                tVar2.f5133r = true;
                                tVar2.f5126k = true;
                                tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                tVar2.f5137w = -15618822;
                                tVar2.f5136u = "msg";
                                if (chat3 == null) {
                                    str8 = "tel:+" + user2.phone;
                                    if (str8 != null) {
                                        tVar2.F.add(str8);
                                    }
                                }
                                intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                intent2.putExtra("currentAccount", r10.currentAccount);
                                if (messageObject.isStoryPush) {
                                    intent2.putExtra("story", true);
                                }
                                if (messageObject.isStoryReactionPush) {
                                    i25 = 1;
                                    intent2.putExtra("storyReaction", true);
                                } else {
                                    i25 = 1;
                                }
                                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                if (bitmap2 != null) {
                                    if (fileLocation != null) {
                                        jArr2 = null;
                                        imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                        if (imageFromMemory != null) {
                                            tVar2.j(imageFromMemory.getBitmap());
                                        } else {
                                            pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                            if (pathToAttach.exists()) {
                                                fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                BitmapFactory.Options options5 = new BitmapFactory.Options();
                                                if (fDp < 1.0f) {
                                                    i21 = 1;
                                                } else {
                                                    i21 = (int) fDp;
                                                }
                                                options5.inSampleSize = i21;
                                                bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options5);
                                                if (bitmapDecodeFile != null) {
                                                    tVar2.j(bitmapDecodeFile);
                                                }
                                            }
                                        }
                                    }
                                    if (z10) {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    } else {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    if (r14 != 1) {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    } else {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    } else {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    }
                                    if (!z27) {
                                        Intent intent12 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                        intent12.putExtra("currentAccount", r10.currentAccount);
                                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent12, 167772160));
                                    }
                                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i411);
                                    scheduleNotificationRepeat();
                                }
                                tVar2.j(bitmap2);
                                jArr2 = null;
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent13 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent13.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent13, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i411);
                                scheduleNotificationRepeat();
                            }
                            intent.putExtra("storyId", Math.abs(messageObject.getId()));
                            i18 = i17;
                            z25 = z24;
                            i19 = i16;
                            str6 = path;
                            z26 = z17;
                            user2 = user;
                            chat3 = chat2;
                            fileLocation = null;
                            intent.putExtra("currentAccount", r10.currentAccount);
                            PendingIntent activity6 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                            tVar2.g(string);
                            tVar2.E.icon = R.drawable.notification;
                            tVar2.h(16, true);
                            tVar2.f5124i = r10.total_unread_count;
                            tVar2.f5123g = activity6;
                            tVar2.f5132q = r10.notificationGroup;
                            tVar2.f5133r = true;
                            tVar2.f5126k = true;
                            tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                            tVar2.f5137w = -15618822;
                            tVar2.f5136u = "msg";
                            if (chat3 == null) {
                                str8 = "tel:+" + user2.phone;
                                if (str8 != null) {
                                    tVar2.F.add(str8);
                                }
                            }
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent2.putExtra("messageDate", messageObject.messageOwner.date);
                            intent2.putExtra("currentAccount", r10.currentAccount);
                            if (messageObject.isStoryPush) {
                                intent2.putExtra("story", true);
                            }
                            if (messageObject.isStoryReactionPush) {
                                i25 = 1;
                                intent2.putExtra("storyReaction", true);
                            } else {
                                i25 = 1;
                            }
                            tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                            if (bitmap2 != null) {
                                if (fileLocation != null) {
                                    jArr2 = null;
                                    imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                    if (imageFromMemory != null) {
                                        tVar2.j(imageFromMemory.getBitmap());
                                    } else {
                                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                        if (pathToAttach.exists()) {
                                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                            BitmapFactory.Options options6 = new BitmapFactory.Options();
                                            if (fDp < 1.0f) {
                                                i21 = 1;
                                            } else {
                                                i21 = (int) fDp;
                                            }
                                            options6.inSampleSize = i21;
                                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options6);
                                            if (bitmapDecodeFile != null) {
                                                tVar2.j(bitmapDecodeFile);
                                            }
                                        }
                                    }
                                }
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent14 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent14.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent14, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i411);
                                scheduleNotificationRepeat();
                            }
                            tVar2.j(bitmap2);
                            jArr2 = null;
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent15 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent15.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent15, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z36, z16, i411);
                            scheduleNotificationRepeat();
                        }
                        str3 = str2;
                        charSequence2 = charSequence;
                        sharedPreferences2 = sharedPreferences;
                        j17 = j16;
                        z16 = z15;
                        if (z16) {
                            sb2 = new StringBuilder();
                            sb2.append("sound_enabled_");
                            j18 = j14;
                            sb2.append(getSharedPrefKey(j17, j18));
                            if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                                z16 = true;
                            }
                        } else {
                            j18 = j14;
                        }
                        path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                        z17 = ApplicationLoader.mainInterfacePaused;
                        boolean z39 = !z17;
                        getSharedPrefKey(j17, j18);
                        j19 = j18;
                        j20 = j17;
                        if (r10.dialogsNotificationsFacade.getProperty("custom_", j20, j19, false)) {
                            property = r10.dialogsNotificationsFacade.getProperty("vibrate_", j20, j19, 0);
                            property2 = r10.dialogsNotificationsFacade.getProperty("priority_", j20, j19, 3);
                            property3 = r10.dialogsNotificationsFacade.getProperty("sound_document_id_", j20, j19, 0L);
                            if (property3 != j11) {
                                propertyString = r10.getMediaDataController().ringtoneDataStore.e(property3);
                                z18 = true;
                            } else {
                                propertyString = r10.dialogsNotificationsFacade.getPropertyString("sound_path_", j20, j19, null);
                                z18 = false;
                            }
                            int property5 = r10.dialogsNotificationsFacade.getProperty("color_", j20, j19, 0);
                            j21 = j20;
                            if (property5 != 0) {
                            }
                            tVar2 = tVar;
                            if (messageObject.isReactionPush) {
                                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j22 != 0) {
                                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                    z19 = true;
                                } else {
                                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                    z19 = false;
                                }
                                str4 = string2;
                                int i412 = sharedPreferences2.getInt("vibrate_react", 0);
                                i10 = sharedPreferences2.getInt("priority_react", 1);
                                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject.isStoryReactionPush) {
                                    i11 = 5;
                                } else {
                                    i11 = 4;
                                }
                                z20 = z19;
                                i12 = i412;
                                i13 = 4;
                            } else {
                                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j22 != 0) {
                                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                    z19 = true;
                                } else {
                                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                    z19 = false;
                                }
                                str4 = string2;
                                int i413 = sharedPreferences2.getInt("vibrate_react", 0);
                                i10 = sharedPreferences2.getInt("priority_react", 1);
                                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                if (messageObject.isStoryReactionPush) {
                                    i11 = 5;
                                } else {
                                    i11 = 4;
                                }
                                z20 = z19;
                                i12 = i413;
                                i13 = 4;
                            }
                            if (i12 == i13) {
                                z21 = true;
                                i14 = 0;
                            } else {
                                i14 = i12;
                                z21 = false;
                            }
                            if (TextUtils.isEmpty(propertyString)) {
                                propertyString = str4;
                                z18 = z20;
                                z22 = true;
                            } else {
                                propertyString = str4;
                                z18 = z20;
                                z22 = true;
                            }
                            z23 = z21;
                            if (property2 != 3) {
                                property2 = i10;
                            } else {
                                property2 = i10;
                            }
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                                z22 = false;
                            }
                            if (property != 0) {
                                z24 = z22;
                                property = i14;
                            } else {
                                z24 = z22;
                                property = i14;
                            }
                            if (z17) {
                                if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                    propertyString = null;
                                }
                                if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                    property = 2;
                                }
                                if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                    i15 = property;
                                    str5 = propertyString;
                                    property2 = 2;
                                } else {
                                    i15 = property;
                                    str5 = propertyString;
                                    property2 = 0;
                                }
                            } else {
                                i15 = property;
                                str5 = propertyString;
                            }
                            if (z23) {
                                ringerMode = audioManager.getRingerMode();
                                if (ringerMode != 0) {
                                    i15 = 2;
                                }
                            }
                            int i414 = i11;
                            if (z16) {
                                i15 = 0;
                                str5 = null;
                                property2 = 0;
                                i16 = 0;
                            } else {
                                i16 = iIntValue;
                            }
                            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("com.tmessages.openchat");
                            i17 = i15;
                            sb7.append(Math.random());
                            sb7.append(Integer.MAX_VALUE);
                            intent.setAction(sb7.toString());
                            intent.setFlags(67108864);
                            if (messageObject.isOauthPush) {
                                intent.putExtra("oauth_url", messageObject.localName);
                            }
                            if (!messageObject.isStoryReactionPush) {
                                if (messageObject.isLiveStoryPush) {
                                    if (r15 != 0) {
                                        i18 = i17;
                                        z25 = z24;
                                        intent.putExtra("chatId", j12);
                                    } else {
                                        i18 = i17;
                                        z25 = z24;
                                        if (j15 != 0) {
                                            intent.putExtra("userId", j15);
                                        }
                                    }
                                    intent.putExtra("storyId", Math.abs(messageObject.getId()));
                                } else {
                                    i18 = i17;
                                    z25 = z24;
                                    j23 = j12;
                                    j24 = j15;
                                    i19 = i16;
                                    str6 = path;
                                    if (messageObject.isStoryPush) {
                                        jArr = new long[r10.storyPushMessages.size()];
                                        while (i20 < r10.storyPushMessages.size()) {
                                            jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                        }
                                        intent.putExtra("storyDialogIds", jArr);
                                        z26 = z17;
                                        user2 = user;
                                        chat3 = chat2;
                                        fileLocation = null;
                                    } else {
                                        if (DialogObject.isEncryptedDialog(j21)) {
                                            z26 = z17;
                                            if (r10.pushDialogs.m() == 1) {
                                                if (r15 != 0) {
                                                    intent.putExtra("chatId", j23);
                                                } else if (j24 != 0) {
                                                    intent.putExtra("userId", j24);
                                                }
                                            }
                                            if (AndroidUtilities.needShowPasscode()) {
                                                user2 = user;
                                                chat3 = chat2;
                                            } else {
                                                user2 = user;
                                                chat3 = chat2;
                                            }
                                        } else {
                                            z26 = z17;
                                            user2 = user;
                                            chat3 = chat2;
                                            if (r10.pushDialogs.m() == 1) {
                                                intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                            }
                                        }
                                        fileLocation = null;
                                    }
                                }
                                intent.putExtra("currentAccount", r10.currentAccount);
                                PendingIntent activity7 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                                tVar2.g(string);
                                tVar2.E.icon = R.drawable.notification;
                                tVar2.h(16, true);
                                tVar2.f5124i = r10.total_unread_count;
                                tVar2.f5123g = activity7;
                                tVar2.f5132q = r10.notificationGroup;
                                tVar2.f5133r = true;
                                tVar2.f5126k = true;
                                tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                                tVar2.f5137w = -15618822;
                                tVar2.f5136u = "msg";
                                if (chat3 == null) {
                                    str8 = "tel:+" + user2.phone;
                                    if (str8 != null) {
                                        tVar2.F.add(str8);
                                    }
                                }
                                intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                                intent2.putExtra("messageDate", messageObject.messageOwner.date);
                                intent2.putExtra("currentAccount", r10.currentAccount);
                                if (messageObject.isStoryPush) {
                                    intent2.putExtra("story", true);
                                }
                                if (messageObject.isStoryReactionPush) {
                                    i25 = 1;
                                    intent2.putExtra("storyReaction", true);
                                } else {
                                    i25 = 1;
                                }
                                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                                if (bitmap2 != null) {
                                    if (fileLocation != null) {
                                        jArr2 = null;
                                        imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                        if (imageFromMemory != null) {
                                            tVar2.j(imageFromMemory.getBitmap());
                                        } else {
                                            pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                            if (pathToAttach.exists()) {
                                                fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                                BitmapFactory.Options options7 = new BitmapFactory.Options();
                                                if (fDp < 1.0f) {
                                                    i21 = 1;
                                                } else {
                                                    i21 = (int) fDp;
                                                }
                                                options7.inSampleSize = i21;
                                                bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options7);
                                                if (bitmapDecodeFile != null) {
                                                    tVar2.j(bitmapDecodeFile);
                                                }
                                            }
                                        }
                                    }
                                    if (z10) {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    } else {
                                        tVar2.f5125j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            i22 = 2;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    if (r14 != 1) {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    } else {
                                        i23 = i19;
                                        jArr3 = new long[]{0, 0};
                                        tVar2.E.vibrate = jArr3;
                                        obj = jArr2;
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    } else {
                                        i24 = i23;
                                        obj2 = obj;
                                        j25 = j21;
                                        z27 = false;
                                    }
                                    if (!z27) {
                                        Intent intent16 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                        intent16.putExtra("currentAccount", r10.currentAccount);
                                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent16, 167772160));
                                    }
                                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i414);
                                    scheduleNotificationRepeat();
                                }
                                tVar2.j(bitmap2);
                                jArr2 = null;
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent17 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent17.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent17, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i414);
                                scheduleNotificationRepeat();
                            }
                            intent.putExtra("storyId", Math.abs(messageObject.getId()));
                            i18 = i17;
                            z25 = z24;
                            i19 = i16;
                            str6 = path;
                            z26 = z17;
                            user2 = user;
                            chat3 = chat2;
                            fileLocation = null;
                            intent.putExtra("currentAccount", r10.currentAccount);
                            PendingIntent activity8 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                            tVar2.g(string);
                            tVar2.E.icon = R.drawable.notification;
                            tVar2.h(16, true);
                            tVar2.f5124i = r10.total_unread_count;
                            tVar2.f5123g = activity8;
                            tVar2.f5132q = r10.notificationGroup;
                            tVar2.f5133r = true;
                            tVar2.f5126k = true;
                            tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                            tVar2.f5137w = -15618822;
                            tVar2.f5136u = "msg";
                            if (chat3 == null) {
                                str8 = "tel:+" + user2.phone;
                                if (str8 != null) {
                                    tVar2.F.add(str8);
                                }
                            }
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent2.putExtra("messageDate", messageObject.messageOwner.date);
                            intent2.putExtra("currentAccount", r10.currentAccount);
                            if (messageObject.isStoryPush) {
                                intent2.putExtra("story", true);
                            }
                            if (messageObject.isStoryReactionPush) {
                                i25 = 1;
                                intent2.putExtra("storyReaction", true);
                            } else {
                                i25 = 1;
                            }
                            tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                            if (bitmap2 != null) {
                                if (fileLocation != null) {
                                    jArr2 = null;
                                    imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                    if (imageFromMemory != null) {
                                        tVar2.j(imageFromMemory.getBitmap());
                                    } else {
                                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                        if (pathToAttach.exists()) {
                                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                            BitmapFactory.Options options8 = new BitmapFactory.Options();
                                            if (fDp < 1.0f) {
                                                i21 = 1;
                                            } else {
                                                i21 = (int) fDp;
                                            }
                                            options8.inSampleSize = i21;
                                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options8);
                                            if (bitmapDecodeFile != null) {
                                                tVar2.j(bitmapDecodeFile);
                                            }
                                        }
                                    }
                                }
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent18 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent18.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent18, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i414);
                                scheduleNotificationRepeat();
                            }
                            tVar2.j(bitmap2);
                            jArr2 = null;
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent19 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent19.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent19, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i414);
                            scheduleNotificationRepeat();
                        }
                        j21 = j20;
                        property = 0;
                        property2 = 3;
                        z18 = false;
                        propertyString = null;
                        tVar2 = tVar;
                        if (messageObject.isReactionPush) {
                            j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j22 != 0) {
                                string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                z19 = true;
                            } else {
                                string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                z19 = false;
                            }
                            str4 = string2;
                            int i415 = sharedPreferences2.getInt("vibrate_react", 0);
                            i10 = sharedPreferences2.getInt("priority_react", 1);
                            iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            if (messageObject.isStoryReactionPush) {
                                i11 = 5;
                            } else {
                                i11 = 4;
                            }
                            z20 = z19;
                            i12 = i415;
                            i13 = 4;
                        } else {
                            j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j22 != 0) {
                                string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                z19 = true;
                            } else {
                                string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                z19 = false;
                            }
                            str4 = string2;
                            int i416 = sharedPreferences2.getInt("vibrate_react", 0);
                            i10 = sharedPreferences2.getInt("priority_react", 1);
                            iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            if (messageObject.isStoryReactionPush) {
                                i11 = 5;
                            } else {
                                i11 = 4;
                            }
                            z20 = z19;
                            i12 = i416;
                            i13 = 4;
                        }
                        if (i12 == i13) {
                            z21 = true;
                            i14 = 0;
                        } else {
                            i14 = i12;
                            z21 = false;
                        }
                        if (TextUtils.isEmpty(propertyString)) {
                            propertyString = str4;
                            z18 = z20;
                            z22 = true;
                        } else {
                            propertyString = str4;
                            z18 = z20;
                            z22 = true;
                        }
                        z23 = z21;
                        if (property2 != 3) {
                            property2 = i10;
                        } else {
                            property2 = i10;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                            z22 = false;
                        }
                        if (property != 0) {
                            z24 = z22;
                            property = i14;
                        } else {
                            z24 = z22;
                            property = i14;
                        }
                        if (z17) {
                            if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                propertyString = null;
                            }
                            if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                property = 2;
                            }
                            if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                i15 = property;
                                str5 = propertyString;
                                property2 = 2;
                            } else {
                                i15 = property;
                                str5 = propertyString;
                                property2 = 0;
                            }
                        } else {
                            i15 = property;
                            str5 = propertyString;
                        }
                        if (z23) {
                            ringerMode = audioManager.getRingerMode();
                            if (ringerMode != 0) {
                                i15 = 2;
                            }
                        }
                        int i417 = i11;
                        if (z16) {
                            i15 = 0;
                            str5 = null;
                            property2 = 0;
                            i16 = 0;
                        } else {
                            i16 = iIntValue;
                        }
                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("com.tmessages.openchat");
                        i17 = i15;
                        sb8.append(Math.random());
                        sb8.append(Integer.MAX_VALUE);
                        intent.setAction(sb8.toString());
                        intent.setFlags(67108864);
                        if (messageObject.isOauthPush) {
                            intent.putExtra("oauth_url", messageObject.localName);
                        }
                        if (!messageObject.isStoryReactionPush) {
                            if (messageObject.isLiveStoryPush) {
                                if (r15 != 0) {
                                    i18 = i17;
                                    z25 = z24;
                                    intent.putExtra("chatId", j12);
                                } else {
                                    i18 = i17;
                                    z25 = z24;
                                    if (j15 != 0) {
                                        intent.putExtra("userId", j15);
                                    }
                                }
                                intent.putExtra("storyId", Math.abs(messageObject.getId()));
                            } else {
                                i18 = i17;
                                z25 = z24;
                                j23 = j12;
                                j24 = j15;
                                i19 = i16;
                                str6 = path;
                                if (messageObject.isStoryPush) {
                                    jArr = new long[r10.storyPushMessages.size()];
                                    while (i20 < r10.storyPushMessages.size()) {
                                        jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                    }
                                    intent.putExtra("storyDialogIds", jArr);
                                    z26 = z17;
                                    user2 = user;
                                    chat3 = chat2;
                                    fileLocation = null;
                                } else {
                                    if (DialogObject.isEncryptedDialog(j21)) {
                                        z26 = z17;
                                        if (r10.pushDialogs.m() == 1) {
                                            if (r15 != 0) {
                                                intent.putExtra("chatId", j23);
                                            } else if (j24 != 0) {
                                                intent.putExtra("userId", j24);
                                            }
                                        }
                                        if (AndroidUtilities.needShowPasscode()) {
                                            user2 = user;
                                            chat3 = chat2;
                                        } else {
                                            user2 = user;
                                            chat3 = chat2;
                                        }
                                    } else {
                                        z26 = z17;
                                        user2 = user;
                                        chat3 = chat2;
                                        if (r10.pushDialogs.m() == 1) {
                                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                        }
                                    }
                                    fileLocation = null;
                                }
                            }
                            intent.putExtra("currentAccount", r10.currentAccount);
                            PendingIntent activity9 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                            tVar2.g(string);
                            tVar2.E.icon = R.drawable.notification;
                            tVar2.h(16, true);
                            tVar2.f5124i = r10.total_unread_count;
                            tVar2.f5123g = activity9;
                            tVar2.f5132q = r10.notificationGroup;
                            tVar2.f5133r = true;
                            tVar2.f5126k = true;
                            tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                            tVar2.f5137w = -15618822;
                            tVar2.f5136u = "msg";
                            if (chat3 == null) {
                                str8 = "tel:+" + user2.phone;
                                if (str8 != null) {
                                    tVar2.F.add(str8);
                                }
                            }
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent2.putExtra("messageDate", messageObject.messageOwner.date);
                            intent2.putExtra("currentAccount", r10.currentAccount);
                            if (messageObject.isStoryPush) {
                                intent2.putExtra("story", true);
                            }
                            if (messageObject.isStoryReactionPush) {
                                i25 = 1;
                                intent2.putExtra("storyReaction", true);
                            } else {
                                i25 = 1;
                            }
                            tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                            if (bitmap2 != null) {
                                if (fileLocation != null) {
                                    jArr2 = null;
                                    imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                    if (imageFromMemory != null) {
                                        tVar2.j(imageFromMemory.getBitmap());
                                    } else {
                                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                        if (pathToAttach.exists()) {
                                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                            BitmapFactory.Options options9 = new BitmapFactory.Options();
                                            if (fDp < 1.0f) {
                                                i21 = 1;
                                            } else {
                                                i21 = (int) fDp;
                                            }
                                            options9.inSampleSize = i21;
                                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options9);
                                            if (bitmapDecodeFile != null) {
                                                tVar2.j(bitmapDecodeFile);
                                            }
                                        }
                                    }
                                }
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent110 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent110.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent110, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i417);
                                scheduleNotificationRepeat();
                            }
                            tVar2.j(bitmap2);
                            jArr2 = null;
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent111 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent111.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent111, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i417);
                            scheduleNotificationRepeat();
                        }
                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                        i18 = i17;
                        z25 = z24;
                        i19 = i16;
                        str6 = path;
                        z26 = z17;
                        user2 = user;
                        chat3 = chat2;
                        fileLocation = null;
                        intent.putExtra("currentAccount", r10.currentAccount);
                        PendingIntent activity10 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                        tVar2.g(string);
                        tVar2.E.icon = R.drawable.notification;
                        tVar2.h(16, true);
                        tVar2.f5124i = r10.total_unread_count;
                        tVar2.f5123g = activity10;
                        tVar2.f5132q = r10.notificationGroup;
                        tVar2.f5133r = true;
                        tVar2.f5126k = true;
                        tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                        tVar2.f5137w = -15618822;
                        tVar2.f5136u = "msg";
                        if (chat3 == null) {
                            str8 = "tel:+" + user2.phone;
                            if (str8 != null) {
                                tVar2.F.add(str8);
                            }
                        }
                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                        intent2.putExtra("currentAccount", r10.currentAccount);
                        if (messageObject.isStoryPush) {
                            intent2.putExtra("story", true);
                        }
                        if (messageObject.isStoryReactionPush) {
                            i25 = 1;
                            intent2.putExtra("storyReaction", true);
                        } else {
                            i25 = 1;
                        }
                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                        if (bitmap2 != null) {
                            if (fileLocation != null) {
                                jArr2 = null;
                                imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                if (imageFromMemory != null) {
                                    tVar2.j(imageFromMemory.getBitmap());
                                } else {
                                    pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                    if (pathToAttach.exists()) {
                                        fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                        BitmapFactory.Options options10 = new BitmapFactory.Options();
                                        if (fDp < 1.0f) {
                                            i21 = 1;
                                        } else {
                                            i21 = (int) fDp;
                                        }
                                        options10.inSampleSize = i21;
                                        bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options10);
                                        if (bitmapDecodeFile != null) {
                                            tVar2.j(bitmapDecodeFile);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent112 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent112.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent112, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i417);
                            scheduleNotificationRepeat();
                        }
                        tVar2.j(bitmap2);
                        jArr2 = null;
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent113 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent113.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent113, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z39, z16, i417);
                        scheduleNotificationRepeat();
                    }
                    z12 = zEqualsIgnoreCase;
                    if (!z34) {
                        string = str11;
                        z13 = true;
                    }
                    if (messageObject.isReactionPush) {
                        z14 = z13;
                        if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                            string = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                    } else {
                        z14 = z13;
                        if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                            string = LocaleController.getString(R.string.NotificationHiddenName);
                        }
                    }
                    if (z12) {
                        if (UserConfig.getActivatedAccountsCount() <= 1) {
                            firstName = charSequence4;
                        } else if (r10.pushDialogs.m() == 1) {
                            firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser());
                        } else {
                            firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser()) + "・";
                        }
                        chat2 = chat;
                        if (r10.pushDialogs.m() == 1) {
                            j15 = jLongValue2;
                            if (r10.pushDialogs.m() == 1) {
                                firstName = firstName + LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]);
                            } else {
                                firstName = firstName + LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r10.pushDialogs.m(), new Object[0]));
                            }
                        } else {
                            j15 = jLongValue2;
                            if (r10.pushDialogs.m() == 1) {
                                firstName = firstName + LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]);
                            } else {
                                firstName = firstName + LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r10.pushDialogs.m(), new Object[0]));
                            }
                        }
                    } else {
                        j15 = jLongValue2;
                        chat2 = chat;
                        firstName = charSequence4;
                    }
                    tVar = new e0.t(ApplicationLoader.applicationContext);
                    if (r10.pushMessages.size() > 1) {
                        j16 = j13;
                        charSequence = charSequence4;
                        zArr = new boolean[1];
                        stringForMessage = r10.getStringForMessage(messageObject, false, zArr, null);
                        zIsSilentMessage = r10.isSilentMessage(messageObject);
                        if (stringForMessage == null) {
                            return;
                        }
                        if (!z14) {
                            strReplace = stringForMessage;
                        } else if (chat2 == null) {
                            if (zArr[0]) {
                                strReplace = stringForMessage.replace(string + ": ", charSequence);
                            } else {
                                strReplace = stringForMessage.replace(string + " ", charSequence);
                            }
                        } else if (zArr[0]) {
                            strReplace = stringForMessage.replace(string + ": ", charSequence);
                        } else {
                            strReplace = stringForMessage.replace(string + " ", charSequence);
                        }
                        tVar.f(strReplace);
                        if (z12) {
                            firstName = strReplace;
                        }
                        e0.o oVar3 = new e0.o(0);
                        oVar3.e(strReplace);
                        tVar.n(oVar3);
                        r14 = zIsSilentMessage;
                    } else {
                        j16 = j13;
                        charSequence = charSequence4;
                        zArr = new boolean[1];
                        stringForMessage = r10.getStringForMessage(messageObject, false, zArr, null);
                        zIsSilentMessage = r10.isSilentMessage(messageObject);
                        if (stringForMessage == null) {
                            return;
                        }
                        if (!z14) {
                            strReplace = stringForMessage;
                        } else if (chat2 == null) {
                            if (zArr[0]) {
                                strReplace = stringForMessage.replace(string + ": ", charSequence);
                            } else {
                                strReplace = stringForMessage.replace(string + " ", charSequence);
                            }
                        } else if (zArr[0]) {
                            strReplace = stringForMessage.replace(string + ": ", charSequence);
                        } else {
                            strReplace = stringForMessage.replace(string + " ", charSequence);
                        }
                        tVar.f(strReplace);
                        if (z12) {
                            firstName = strReplace;
                        }
                        e0.o oVar4 = new e0.o(0);
                        oVar4.e(strReplace);
                        tVar.n(oVar4);
                        r14 = zIsSilentMessage;
                    }
                    str2 = firstName;
                    if (z10) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (z15) {
                        str3 = str2;
                        charSequence2 = charSequence;
                        sharedPreferences2 = sharedPreferences;
                        j17 = j16;
                        z16 = z15;
                    } else {
                        str3 = str2;
                        charSequence2 = charSequence;
                        sharedPreferences2 = sharedPreferences;
                        j17 = j16;
                        z16 = z15;
                    }
                    if (z16) {
                        sb2 = new StringBuilder();
                        sb2.append("sound_enabled_");
                        j18 = j14;
                        sb2.append(getSharedPrefKey(j17, j18));
                        if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                            z16 = true;
                        }
                    } else {
                        j18 = j14;
                    }
                    path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                    z17 = ApplicationLoader.mainInterfacePaused;
                    boolean z310 = !z17;
                    getSharedPrefKey(j17, j18);
                    j19 = j18;
                    j20 = j17;
                    if (r10.dialogsNotificationsFacade.getProperty("custom_", j20, j19, false)) {
                        property = r10.dialogsNotificationsFacade.getProperty("vibrate_", j20, j19, 0);
                        property2 = r10.dialogsNotificationsFacade.getProperty("priority_", j20, j19, 3);
                        property3 = r10.dialogsNotificationsFacade.getProperty("sound_document_id_", j20, j19, 0L);
                        if (property3 != j11) {
                            propertyString = r10.getMediaDataController().ringtoneDataStore.e(property3);
                            z18 = true;
                        } else {
                            propertyString = r10.dialogsNotificationsFacade.getPropertyString("sound_path_", j20, j19, null);
                            z18 = false;
                        }
                        int property6 = r10.dialogsNotificationsFacade.getProperty("color_", j20, j19, 0);
                        j21 = j20;
                        if (property6 != 0) {
                        }
                        tVar2 = tVar;
                        if (messageObject.isReactionPush) {
                            j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j22 != 0) {
                                string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                z19 = true;
                            } else {
                                string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                z19 = false;
                            }
                            str4 = string2;
                            int i418 = sharedPreferences2.getInt("vibrate_react", 0);
                            i10 = sharedPreferences2.getInt("priority_react", 1);
                            iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            if (messageObject.isStoryReactionPush) {
                                i11 = 5;
                            } else {
                                i11 = 4;
                            }
                            z20 = z19;
                            i12 = i418;
                            i13 = 4;
                        } else {
                            j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j22 != 0) {
                                string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                                z19 = true;
                            } else {
                                string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                                z19 = false;
                            }
                            str4 = string2;
                            int i419 = sharedPreferences2.getInt("vibrate_react", 0);
                            i10 = sharedPreferences2.getInt("priority_react", 1);
                            iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            if (messageObject.isStoryReactionPush) {
                                i11 = 5;
                            } else {
                                i11 = 4;
                            }
                            z20 = z19;
                            i12 = i419;
                            i13 = 4;
                        }
                        if (i12 == i13) {
                            z21 = true;
                            i14 = 0;
                        } else {
                            i14 = i12;
                            z21 = false;
                        }
                        if (TextUtils.isEmpty(propertyString)) {
                            propertyString = str4;
                            z18 = z20;
                            z22 = true;
                        } else {
                            propertyString = str4;
                            z18 = z20;
                            z22 = true;
                        }
                        z23 = z21;
                        if (property2 != 3) {
                            property2 = i10;
                        } else {
                            property2 = i10;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                            z22 = false;
                        }
                        if (property != 0) {
                            z24 = z22;
                            property = i14;
                        } else {
                            z24 = z22;
                            property = i14;
                        }
                        if (z17) {
                            if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                propertyString = null;
                            }
                            if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                                property = 2;
                            }
                            if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                                i15 = property;
                                str5 = propertyString;
                                property2 = 2;
                            } else {
                                i15 = property;
                                str5 = propertyString;
                                property2 = 0;
                            }
                        } else {
                            i15 = property;
                            str5 = propertyString;
                        }
                        if (z23) {
                            ringerMode = audioManager.getRingerMode();
                            if (ringerMode != 0) {
                                i15 = 2;
                            }
                        }
                        int i4110 = i11;
                        if (z16) {
                            i15 = 0;
                            str5 = null;
                            property2 = 0;
                            i16 = 0;
                        } else {
                            i16 = iIntValue;
                        }
                        intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("com.tmessages.openchat");
                        i17 = i15;
                        sb9.append(Math.random());
                        sb9.append(Integer.MAX_VALUE);
                        intent.setAction(sb9.toString());
                        intent.setFlags(67108864);
                        if (messageObject.isOauthPush) {
                            intent.putExtra("oauth_url", messageObject.localName);
                        }
                        if (!messageObject.isStoryReactionPush) {
                            if (messageObject.isLiveStoryPush) {
                                if (r15 != 0) {
                                    i18 = i17;
                                    z25 = z24;
                                    intent.putExtra("chatId", j12);
                                } else {
                                    i18 = i17;
                                    z25 = z24;
                                    if (j15 != 0) {
                                        intent.putExtra("userId", j15);
                                    }
                                }
                                intent.putExtra("storyId", Math.abs(messageObject.getId()));
                            } else {
                                i18 = i17;
                                z25 = z24;
                                j23 = j12;
                                j24 = j15;
                                i19 = i16;
                                str6 = path;
                                if (messageObject.isStoryPush) {
                                    jArr = new long[r10.storyPushMessages.size()];
                                    while (i20 < r10.storyPushMessages.size()) {
                                        jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                    }
                                    intent.putExtra("storyDialogIds", jArr);
                                    z26 = z17;
                                    user2 = user;
                                    chat3 = chat2;
                                    fileLocation = null;
                                } else {
                                    if (DialogObject.isEncryptedDialog(j21)) {
                                        z26 = z17;
                                        if (r10.pushDialogs.m() == 1) {
                                            if (r15 != 0) {
                                                intent.putExtra("chatId", j23);
                                            } else if (j24 != 0) {
                                                intent.putExtra("userId", j24);
                                            }
                                        }
                                        if (AndroidUtilities.needShowPasscode()) {
                                            user2 = user;
                                            chat3 = chat2;
                                        } else {
                                            user2 = user;
                                            chat3 = chat2;
                                        }
                                    } else {
                                        z26 = z17;
                                        user2 = user;
                                        chat3 = chat2;
                                        if (r10.pushDialogs.m() == 1) {
                                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                        }
                                    }
                                    fileLocation = null;
                                }
                            }
                            intent.putExtra("currentAccount", r10.currentAccount);
                            PendingIntent activity11 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                            tVar2.g(string);
                            tVar2.E.icon = R.drawable.notification;
                            tVar2.h(16, true);
                            tVar2.f5124i = r10.total_unread_count;
                            tVar2.f5123g = activity11;
                            tVar2.f5132q = r10.notificationGroup;
                            tVar2.f5133r = true;
                            tVar2.f5126k = true;
                            tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                            tVar2.f5137w = -15618822;
                            tVar2.f5136u = "msg";
                            if (chat3 == null) {
                                str8 = "tel:+" + user2.phone;
                                if (str8 != null) {
                                    tVar2.F.add(str8);
                                }
                            }
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                            intent2.putExtra("messageDate", messageObject.messageOwner.date);
                            intent2.putExtra("currentAccount", r10.currentAccount);
                            if (messageObject.isStoryPush) {
                                intent2.putExtra("story", true);
                            }
                            if (messageObject.isStoryReactionPush) {
                                i25 = 1;
                                intent2.putExtra("storyReaction", true);
                            } else {
                                i25 = 1;
                            }
                            tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                            if (bitmap2 != null) {
                                if (fileLocation != null) {
                                    jArr2 = null;
                                    imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                    if (imageFromMemory != null) {
                                        tVar2.j(imageFromMemory.getBitmap());
                                    } else {
                                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                        if (pathToAttach.exists()) {
                                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                            BitmapFactory.Options options11 = new BitmapFactory.Options();
                                            if (fDp < 1.0f) {
                                                i21 = 1;
                                            } else {
                                                i21 = (int) fDp;
                                            }
                                            options11.inSampleSize = i21;
                                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options11);
                                            if (bitmapDecodeFile != null) {
                                                tVar2.j(bitmapDecodeFile);
                                            }
                                        }
                                    }
                                }
                                if (z10) {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                } else {
                                    tVar2.f5125j = -1;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        i22 = 2;
                                    } else {
                                        i22 = 0;
                                    }
                                }
                                if (r14 != 1) {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                } else {
                                    i23 = i19;
                                    jArr3 = new long[]{0, 0};
                                    tVar2.E.vibrate = jArr3;
                                    obj = jArr2;
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                } else {
                                    i24 = i23;
                                    obj2 = obj;
                                    j25 = j21;
                                    z27 = false;
                                }
                                if (!z27) {
                                    Intent intent114 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                    intent114.putExtra("currentAccount", r10.currentAccount);
                                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent114, 167772160));
                                }
                                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4110);
                                scheduleNotificationRepeat();
                            }
                            tVar2.j(bitmap2);
                            jArr2 = null;
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent115 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent115.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent115, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4110);
                            scheduleNotificationRepeat();
                        }
                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                        i18 = i17;
                        z25 = z24;
                        i19 = i16;
                        str6 = path;
                        z26 = z17;
                        user2 = user;
                        chat3 = chat2;
                        fileLocation = null;
                        intent.putExtra("currentAccount", r10.currentAccount);
                        PendingIntent activity12 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                        tVar2.g(string);
                        tVar2.E.icon = R.drawable.notification;
                        tVar2.h(16, true);
                        tVar2.f5124i = r10.total_unread_count;
                        tVar2.f5123g = activity12;
                        tVar2.f5132q = r10.notificationGroup;
                        tVar2.f5133r = true;
                        tVar2.f5126k = true;
                        tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                        tVar2.f5137w = -15618822;
                        tVar2.f5136u = "msg";
                        if (chat3 == null) {
                            str8 = "tel:+" + user2.phone;
                            if (str8 != null) {
                                tVar2.F.add(str8);
                            }
                        }
                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                        intent2.putExtra("currentAccount", r10.currentAccount);
                        if (messageObject.isStoryPush) {
                            intent2.putExtra("story", true);
                        }
                        if (messageObject.isStoryReactionPush) {
                            i25 = 1;
                            intent2.putExtra("storyReaction", true);
                        } else {
                            i25 = 1;
                        }
                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                        if (bitmap2 != null) {
                            if (fileLocation != null) {
                                jArr2 = null;
                                imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                if (imageFromMemory != null) {
                                    tVar2.j(imageFromMemory.getBitmap());
                                } else {
                                    pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                    if (pathToAttach.exists()) {
                                        fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                        BitmapFactory.Options options12 = new BitmapFactory.Options();
                                        if (fDp < 1.0f) {
                                            i21 = 1;
                                        } else {
                                            i21 = (int) fDp;
                                        }
                                        options12.inSampleSize = i21;
                                        bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options12);
                                        if (bitmapDecodeFile != null) {
                                            tVar2.j(bitmapDecodeFile);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent116 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent116.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent116, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4110);
                            scheduleNotificationRepeat();
                        }
                        tVar2.j(bitmap2);
                        jArr2 = null;
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent117 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent117.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent117, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4110);
                        scheduleNotificationRepeat();
                    }
                    j21 = j20;
                    property = 0;
                    property2 = 3;
                    z18 = false;
                    propertyString = null;
                    tVar2 = tVar;
                    if (messageObject.isReactionPush) {
                        j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                        if (j22 != 0) {
                            string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                            z19 = true;
                        } else {
                            string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                            z19 = false;
                        }
                        str4 = string2;
                        int i4111 = sharedPreferences2.getInt("vibrate_react", 0);
                        i10 = sharedPreferences2.getInt("priority_react", 1);
                        iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                        if (messageObject.isStoryReactionPush) {
                            i11 = 5;
                        } else {
                            i11 = 4;
                        }
                        z20 = z19;
                        i12 = i4111;
                        i13 = 4;
                    } else {
                        j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                        if (j22 != 0) {
                            string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                            z19 = true;
                        } else {
                            string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                            z19 = false;
                        }
                        str4 = string2;
                        int i4112 = sharedPreferences2.getInt("vibrate_react", 0);
                        i10 = sharedPreferences2.getInt("priority_react", 1);
                        iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                        if (messageObject.isStoryReactionPush) {
                            i11 = 5;
                        } else {
                            i11 = 4;
                        }
                        z20 = z19;
                        i12 = i4112;
                        i13 = 4;
                    }
                    if (i12 == i13) {
                        z21 = true;
                        i14 = 0;
                    } else {
                        i14 = i12;
                        z21 = false;
                    }
                    if (TextUtils.isEmpty(propertyString)) {
                        propertyString = str4;
                        z18 = z20;
                        z22 = true;
                    } else {
                        propertyString = str4;
                        z18 = z20;
                        z22 = true;
                    }
                    z23 = z21;
                    if (property2 != 3) {
                        property2 = i10;
                    } else {
                        property2 = i10;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                        z22 = false;
                    }
                    if (property != 0) {
                        z24 = z22;
                        property = i14;
                    } else {
                        z24 = z22;
                        property = i14;
                    }
                    if (z17) {
                        if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                            propertyString = null;
                        }
                        if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                            property = 2;
                        }
                        if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                            i15 = property;
                            str5 = propertyString;
                            property2 = 2;
                        } else {
                            i15 = property;
                            str5 = propertyString;
                            property2 = 0;
                        }
                    } else {
                        i15 = property;
                        str5 = propertyString;
                    }
                    if (z23) {
                        ringerMode = audioManager.getRingerMode();
                        if (ringerMode != 0) {
                            i15 = 2;
                        }
                    }
                    int i4113 = i11;
                    if (z16) {
                        i15 = 0;
                        str5 = null;
                        property2 = 0;
                        i16 = 0;
                    } else {
                        i16 = iIntValue;
                    }
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("com.tmessages.openchat");
                    i17 = i15;
                    sb10.append(Math.random());
                    sb10.append(Integer.MAX_VALUE);
                    intent.setAction(sb10.toString());
                    intent.setFlags(67108864);
                    if (messageObject.isOauthPush) {
                        intent.putExtra("oauth_url", messageObject.localName);
                    }
                    if (!messageObject.isStoryReactionPush) {
                        if (messageObject.isLiveStoryPush) {
                            if (r15 != 0) {
                                i18 = i17;
                                z25 = z24;
                                intent.putExtra("chatId", j12);
                            } else {
                                i18 = i17;
                                z25 = z24;
                                if (j15 != 0) {
                                    intent.putExtra("userId", j15);
                                }
                            }
                            intent.putExtra("storyId", Math.abs(messageObject.getId()));
                        } else {
                            i18 = i17;
                            z25 = z24;
                            j23 = j12;
                            j24 = j15;
                            i19 = i16;
                            str6 = path;
                            if (messageObject.isStoryPush) {
                                jArr = new long[r10.storyPushMessages.size()];
                                while (i20 < r10.storyPushMessages.size()) {
                                    jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                }
                                intent.putExtra("storyDialogIds", jArr);
                                z26 = z17;
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                            } else {
                                if (DialogObject.isEncryptedDialog(j21)) {
                                    z26 = z17;
                                    if (r10.pushDialogs.m() == 1) {
                                        if (r15 != 0) {
                                            intent.putExtra("chatId", j23);
                                        } else if (j24 != 0) {
                                            intent.putExtra("userId", j24);
                                        }
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        user2 = user;
                                        chat3 = chat2;
                                    } else {
                                        user2 = user;
                                        chat3 = chat2;
                                    }
                                } else {
                                    z26 = z17;
                                    user2 = user;
                                    chat3 = chat2;
                                    if (r10.pushDialogs.m() == 1) {
                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                    }
                                }
                                fileLocation = null;
                            }
                        }
                        intent.putExtra("currentAccount", r10.currentAccount);
                        PendingIntent activity13 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                        tVar2.g(string);
                        tVar2.E.icon = R.drawable.notification;
                        tVar2.h(16, true);
                        tVar2.f5124i = r10.total_unread_count;
                        tVar2.f5123g = activity13;
                        tVar2.f5132q = r10.notificationGroup;
                        tVar2.f5133r = true;
                        tVar2.f5126k = true;
                        tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                        tVar2.f5137w = -15618822;
                        tVar2.f5136u = "msg";
                        if (chat3 == null) {
                            str8 = "tel:+" + user2.phone;
                            if (str8 != null) {
                                tVar2.F.add(str8);
                            }
                        }
                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                        intent2.putExtra("currentAccount", r10.currentAccount);
                        if (messageObject.isStoryPush) {
                            intent2.putExtra("story", true);
                        }
                        if (messageObject.isStoryReactionPush) {
                            i25 = 1;
                            intent2.putExtra("storyReaction", true);
                        } else {
                            i25 = 1;
                        }
                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                        if (bitmap2 != null) {
                            if (fileLocation != null) {
                                jArr2 = null;
                                imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                if (imageFromMemory != null) {
                                    tVar2.j(imageFromMemory.getBitmap());
                                } else {
                                    pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                    if (pathToAttach.exists()) {
                                        fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                        BitmapFactory.Options options13 = new BitmapFactory.Options();
                                        if (fDp < 1.0f) {
                                            i21 = 1;
                                        } else {
                                            i21 = (int) fDp;
                                        }
                                        options13.inSampleSize = i21;
                                        bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options13);
                                        if (bitmapDecodeFile != null) {
                                            tVar2.j(bitmapDecodeFile);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent118 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent118.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent118, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4113);
                            scheduleNotificationRepeat();
                        }
                        tVar2.j(bitmap2);
                        jArr2 = null;
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent119 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent119.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent119, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4113);
                        scheduleNotificationRepeat();
                    }
                    intent.putExtra("storyId", Math.abs(messageObject.getId()));
                    i18 = i17;
                    z25 = z24;
                    i19 = i16;
                    str6 = path;
                    z26 = z17;
                    user2 = user;
                    chat3 = chat2;
                    fileLocation = null;
                    intent.putExtra("currentAccount", r10.currentAccount);
                    PendingIntent activity14 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                    tVar2.g(string);
                    tVar2.E.icon = R.drawable.notification;
                    tVar2.h(16, true);
                    tVar2.f5124i = r10.total_unread_count;
                    tVar2.f5123g = activity14;
                    tVar2.f5132q = r10.notificationGroup;
                    tVar2.f5133r = true;
                    tVar2.f5126k = true;
                    tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                    tVar2.f5137w = -15618822;
                    tVar2.f5136u = "msg";
                    if (chat3 == null) {
                        str8 = "tel:+" + user2.phone;
                        if (str8 != null) {
                            tVar2.F.add(str8);
                        }
                    }
                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent2.putExtra("messageDate", messageObject.messageOwner.date);
                    intent2.putExtra("currentAccount", r10.currentAccount);
                    if (messageObject.isStoryPush) {
                        intent2.putExtra("story", true);
                    }
                    if (messageObject.isStoryReactionPush) {
                        i25 = 1;
                        intent2.putExtra("storyReaction", true);
                    } else {
                        i25 = 1;
                    }
                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                    if (bitmap2 != null) {
                        if (fileLocation != null) {
                            jArr2 = null;
                            imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                            if (imageFromMemory != null) {
                                tVar2.j(imageFromMemory.getBitmap());
                            } else {
                                pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                if (pathToAttach.exists()) {
                                    fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                    BitmapFactory.Options options14 = new BitmapFactory.Options();
                                    if (fDp < 1.0f) {
                                        i21 = 1;
                                    } else {
                                        i21 = (int) fDp;
                                    }
                                    options14.inSampleSize = i21;
                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options14);
                                    if (bitmapDecodeFile != null) {
                                        tVar2.j(bitmapDecodeFile);
                                    }
                                }
                            }
                        }
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent1110 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent1110.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1110, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4113);
                        scheduleNotificationRepeat();
                    }
                    tVar2.j(bitmap2);
                    jArr2 = null;
                    if (z10) {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    } else {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    }
                    if (r14 != 1) {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    } else {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    }
                    if (AndroidUtilities.needShowPasscode()) {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    } else {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    }
                    if (!z27) {
                        Intent intent1111 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                        intent1111.putExtra("currentAccount", r10.currentAccount);
                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1111, 167772160));
                    }
                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4113);
                    scheduleNotificationRepeat();
                }
                z12 = zEqualsIgnoreCase;
                if (r10.dialogsNotificationsFacade.getProperty("custom_", j20, j19, false)) {
                    property = r10.dialogsNotificationsFacade.getProperty("vibrate_", j20, j19, 0);
                    property2 = r10.dialogsNotificationsFacade.getProperty("priority_", j20, j19, 3);
                    property3 = r10.dialogsNotificationsFacade.getProperty("sound_document_id_", j20, j19, 0L);
                    if (property3 != j11) {
                        propertyString = r10.getMediaDataController().ringtoneDataStore.e(property3);
                        z18 = true;
                    } else {
                        propertyString = r10.dialogsNotificationsFacade.getPropertyString("sound_path_", j20, j19, null);
                        z18 = false;
                    }
                    int property7 = r10.dialogsNotificationsFacade.getProperty("color_", j20, j19, 0);
                    j21 = j20;
                    if (property7 != 0) {
                    }
                    tVar2 = tVar;
                    if (messageObject.isReactionPush) {
                        j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                        if (j22 != 0) {
                            string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                            z19 = true;
                        } else {
                            string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                            z19 = false;
                        }
                        str4 = string2;
                        int i4114 = sharedPreferences2.getInt("vibrate_react", 0);
                        i10 = sharedPreferences2.getInt("priority_react", 1);
                        iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                        if (messageObject.isStoryReactionPush) {
                            i11 = 5;
                        } else {
                            i11 = 4;
                        }
                        z20 = z19;
                        i12 = i4114;
                        i13 = 4;
                    } else {
                        j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                        if (j22 != 0) {
                            string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                            z19 = true;
                        } else {
                            string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                            z19 = false;
                        }
                        str4 = string2;
                        int i4115 = sharedPreferences2.getInt("vibrate_react", 0);
                        i10 = sharedPreferences2.getInt("priority_react", 1);
                        iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                        if (messageObject.isStoryReactionPush) {
                            i11 = 5;
                        } else {
                            i11 = 4;
                        }
                        z20 = z19;
                        i12 = i4115;
                        i13 = 4;
                    }
                    if (i12 == i13) {
                        z21 = true;
                        i14 = 0;
                    } else {
                        i14 = i12;
                        z21 = false;
                    }
                    if (TextUtils.isEmpty(propertyString)) {
                        propertyString = str4;
                        z18 = z20;
                        z22 = true;
                    } else {
                        propertyString = str4;
                        z18 = z20;
                        z22 = true;
                    }
                    z23 = z21;
                    if (property2 != 3) {
                        property2 = i10;
                    } else {
                        property2 = i10;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                        z22 = false;
                    }
                    if (property != 0) {
                        z24 = z22;
                        property = i14;
                    } else {
                        z24 = z22;
                        property = i14;
                    }
                    if (z17) {
                        if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                            propertyString = null;
                        }
                        if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                            property = 2;
                        }
                        if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                            i15 = property;
                            str5 = propertyString;
                            property2 = 2;
                        } else {
                            i15 = property;
                            str5 = propertyString;
                            property2 = 0;
                        }
                    } else {
                        i15 = property;
                        str5 = propertyString;
                    }
                    if (z23) {
                        ringerMode = audioManager.getRingerMode();
                        if (ringerMode != 0) {
                            i15 = 2;
                        }
                    }
                    int i4116 = i11;
                    if (z16) {
                        i15 = 0;
                        str5 = null;
                        property2 = 0;
                        i16 = 0;
                    } else {
                        i16 = iIntValue;
                    }
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("com.tmessages.openchat");
                    i17 = i15;
                    sb11.append(Math.random());
                    sb11.append(Integer.MAX_VALUE);
                    intent.setAction(sb11.toString());
                    intent.setFlags(67108864);
                    if (messageObject.isOauthPush) {
                        intent.putExtra("oauth_url", messageObject.localName);
                    }
                    if (!messageObject.isStoryReactionPush) {
                        if (messageObject.isLiveStoryPush) {
                            if (r15 != 0) {
                                i18 = i17;
                                z25 = z24;
                                intent.putExtra("chatId", j12);
                            } else {
                                i18 = i17;
                                z25 = z24;
                                if (j15 != 0) {
                                    intent.putExtra("userId", j15);
                                }
                            }
                            intent.putExtra("storyId", Math.abs(messageObject.getId()));
                        } else {
                            i18 = i17;
                            z25 = z24;
                            j23 = j12;
                            j24 = j15;
                            i19 = i16;
                            str6 = path;
                            if (messageObject.isStoryPush) {
                                jArr = new long[r10.storyPushMessages.size()];
                                while (i20 < r10.storyPushMessages.size()) {
                                    jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                                }
                                intent.putExtra("storyDialogIds", jArr);
                                z26 = z17;
                                user2 = user;
                                chat3 = chat2;
                                fileLocation = null;
                            } else {
                                if (DialogObject.isEncryptedDialog(j21)) {
                                    z26 = z17;
                                    if (r10.pushDialogs.m() == 1) {
                                        if (r15 != 0) {
                                            intent.putExtra("chatId", j23);
                                        } else if (j24 != 0) {
                                            intent.putExtra("userId", j24);
                                        }
                                    }
                                    if (AndroidUtilities.needShowPasscode()) {
                                        user2 = user;
                                        chat3 = chat2;
                                    } else {
                                        user2 = user;
                                        chat3 = chat2;
                                    }
                                } else {
                                    z26 = z17;
                                    user2 = user;
                                    chat3 = chat2;
                                    if (r10.pushDialogs.m() == 1) {
                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                    }
                                }
                                fileLocation = null;
                            }
                        }
                        intent.putExtra("currentAccount", r10.currentAccount);
                        PendingIntent activity15 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                        tVar2.g(string);
                        tVar2.E.icon = R.drawable.notification;
                        tVar2.h(16, true);
                        tVar2.f5124i = r10.total_unread_count;
                        tVar2.f5123g = activity15;
                        tVar2.f5132q = r10.notificationGroup;
                        tVar2.f5133r = true;
                        tVar2.f5126k = true;
                        tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                        tVar2.f5137w = -15618822;
                        tVar2.f5136u = "msg";
                        if (chat3 == null) {
                            str8 = "tel:+" + user2.phone;
                            if (str8 != null) {
                                tVar2.F.add(str8);
                            }
                        }
                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent2.putExtra("messageDate", messageObject.messageOwner.date);
                        intent2.putExtra("currentAccount", r10.currentAccount);
                        if (messageObject.isStoryPush) {
                            intent2.putExtra("story", true);
                        }
                        if (messageObject.isStoryReactionPush) {
                            i25 = 1;
                            intent2.putExtra("storyReaction", true);
                        } else {
                            i25 = 1;
                        }
                        tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                        if (bitmap2 != null) {
                            if (fileLocation != null) {
                                jArr2 = null;
                                imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                                if (imageFromMemory != null) {
                                    tVar2.j(imageFromMemory.getBitmap());
                                } else {
                                    pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                    if (pathToAttach.exists()) {
                                        fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                        BitmapFactory.Options options15 = new BitmapFactory.Options();
                                        if (fDp < 1.0f) {
                                            i21 = 1;
                                        } else {
                                            i21 = (int) fDp;
                                        }
                                        options15.inSampleSize = i21;
                                        bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options15);
                                        if (bitmapDecodeFile != null) {
                                            tVar2.j(bitmapDecodeFile);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            } else {
                                tVar2.f5125j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    i22 = 2;
                                } else {
                                    i22 = 0;
                                }
                            }
                            if (r14 != 1) {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            } else {
                                i23 = i19;
                                jArr3 = new long[]{0, 0};
                                tVar2.E.vibrate = jArr3;
                                obj = jArr2;
                            }
                            if (AndroidUtilities.needShowPasscode()) {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            } else {
                                i24 = i23;
                                obj2 = obj;
                                j25 = j21;
                                z27 = false;
                            }
                            if (!z27) {
                                Intent intent1112 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                                intent1112.putExtra("currentAccount", r10.currentAccount);
                                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1112, 167772160));
                            }
                            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                            scheduleNotificationRepeat();
                        }
                        tVar2.j(bitmap2);
                        jArr2 = null;
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent1113 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent1113.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1113, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                        scheduleNotificationRepeat();
                    }
                    intent.putExtra("storyId", Math.abs(messageObject.getId()));
                    i18 = i17;
                    z25 = z24;
                    i19 = i16;
                    str6 = path;
                    z26 = z17;
                    user2 = user;
                    chat3 = chat2;
                    fileLocation = null;
                    intent.putExtra("currentAccount", r10.currentAccount);
                    PendingIntent activity16 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                    tVar2.g(string);
                    tVar2.E.icon = R.drawable.notification;
                    tVar2.h(16, true);
                    tVar2.f5124i = r10.total_unread_count;
                    tVar2.f5123g = activity16;
                    tVar2.f5132q = r10.notificationGroup;
                    tVar2.f5133r = true;
                    tVar2.f5126k = true;
                    tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                    tVar2.f5137w = -15618822;
                    tVar2.f5136u = "msg";
                    if (chat3 == null) {
                        str8 = "tel:+" + user2.phone;
                        if (str8 != null) {
                            tVar2.F.add(str8);
                        }
                    }
                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent2.putExtra("messageDate", messageObject.messageOwner.date);
                    intent2.putExtra("currentAccount", r10.currentAccount);
                    if (messageObject.isStoryPush) {
                        intent2.putExtra("story", true);
                    }
                    if (messageObject.isStoryReactionPush) {
                        i25 = 1;
                        intent2.putExtra("storyReaction", true);
                    } else {
                        i25 = 1;
                    }
                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                    if (bitmap2 != null) {
                        if (fileLocation != null) {
                            jArr2 = null;
                            imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                            if (imageFromMemory != null) {
                                tVar2.j(imageFromMemory.getBitmap());
                            } else {
                                pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                if (pathToAttach.exists()) {
                                    fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                    BitmapFactory.Options options16 = new BitmapFactory.Options();
                                    if (fDp < 1.0f) {
                                        i21 = 1;
                                    } else {
                                        i21 = (int) fDp;
                                    }
                                    options16.inSampleSize = i21;
                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options16);
                                    if (bitmapDecodeFile != null) {
                                        tVar2.j(bitmapDecodeFile);
                                    }
                                }
                            }
                        }
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent1114 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent1114.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1114, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                        scheduleNotificationRepeat();
                    }
                    tVar2.j(bitmap2);
                    jArr2 = null;
                    if (z10) {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    } else {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    }
                    if (r14 != 1) {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    } else {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    }
                    if (AndroidUtilities.needShowPasscode()) {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    } else {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    }
                    if (!z27) {
                        Intent intent1115 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                        intent1115.putExtra("currentAccount", r10.currentAccount);
                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1115, 167772160));
                    }
                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                    scheduleNotificationRepeat();
                }
                j21 = j20;
                property = 0;
                property2 = 3;
                z18 = false;
                propertyString = null;
                if (!messageObject.isStoryReactionPush) {
                    if (messageObject.isLiveStoryPush) {
                        if (r15 != 0) {
                            i18 = i17;
                            z25 = z24;
                            intent.putExtra("chatId", j12);
                        } else {
                            i18 = i17;
                            z25 = z24;
                            if (j15 != 0) {
                                intent.putExtra("userId", j15);
                            }
                        }
                        intent.putExtra("storyId", Math.abs(messageObject.getId()));
                    } else {
                        i18 = i17;
                        z25 = z24;
                        j23 = j12;
                        j24 = j15;
                        i19 = i16;
                        str6 = path;
                        if (messageObject.isStoryPush) {
                            jArr = new long[r10.storyPushMessages.size()];
                            while (i20 < r10.storyPushMessages.size()) {
                                jArr[i20] = r10.storyPushMessages.get(i20).dialogId;
                            }
                            intent.putExtra("storyDialogIds", jArr);
                            z26 = z17;
                            user2 = user;
                            chat3 = chat2;
                            fileLocation = null;
                        } else {
                            if (DialogObject.isEncryptedDialog(j21)) {
                                z26 = z17;
                                if (r10.pushDialogs.m() == 1) {
                                    if (r15 != 0) {
                                        intent.putExtra("chatId", j23);
                                    } else if (j24 != 0) {
                                        intent.putExtra("userId", j24);
                                    }
                                }
                                if (AndroidUtilities.needShowPasscode()) {
                                    user2 = user;
                                    chat3 = chat2;
                                } else {
                                    user2 = user;
                                    chat3 = chat2;
                                }
                            } else {
                                z26 = z17;
                                user2 = user;
                                chat3 = chat2;
                                if (r10.pushDialogs.m() == 1) {
                                    intent.putExtra("encId", DialogObject.getEncryptedChatId(j21));
                                }
                            }
                            fileLocation = null;
                        }
                    }
                    intent.putExtra("currentAccount", r10.currentAccount);
                    PendingIntent activity17 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                    tVar2.g(string);
                    tVar2.E.icon = R.drawable.notification;
                    tVar2.h(16, true);
                    tVar2.f5124i = r10.total_unread_count;
                    tVar2.f5123g = activity17;
                    tVar2.f5132q = r10.notificationGroup;
                    tVar2.f5133r = true;
                    tVar2.f5126k = true;
                    tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
                    tVar2.f5137w = -15618822;
                    tVar2.f5136u = "msg";
                    if (chat3 == null) {
                        str8 = "tel:+" + user2.phone;
                        if (str8 != null) {
                            tVar2.F.add(str8);
                        }
                    }
                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent2.putExtra("messageDate", messageObject.messageOwner.date);
                    intent2.putExtra("currentAccount", r10.currentAccount);
                    if (messageObject.isStoryPush) {
                        intent2.putExtra("story", true);
                    }
                    if (messageObject.isStoryReactionPush) {
                        i25 = 1;
                        intent2.putExtra("storyReaction", true);
                    } else {
                        i25 = 1;
                    }
                    tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
                    if (bitmap2 != null) {
                        if (fileLocation != null) {
                            jArr2 = null;
                            imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                            if (imageFromMemory != null) {
                                tVar2.j(imageFromMemory.getBitmap());
                            } else {
                                pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                                if (pathToAttach.exists()) {
                                    fDp = 160.0f / AndroidUtilities.dp(50.0f);
                                    BitmapFactory.Options options17 = new BitmapFactory.Options();
                                    if (fDp < 1.0f) {
                                        i21 = 1;
                                    } else {
                                        i21 = (int) fDp;
                                    }
                                    options17.inSampleSize = i21;
                                    bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options17);
                                    if (bitmapDecodeFile != null) {
                                        tVar2.j(bitmapDecodeFile);
                                    }
                                }
                            }
                        }
                        if (z10) {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        } else {
                            tVar2.f5125j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                                i22 = 2;
                            } else {
                                i22 = 0;
                            }
                        }
                        if (r14 != 1) {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        } else {
                            i23 = i19;
                            jArr3 = new long[]{0, 0};
                            tVar2.E.vibrate = jArr3;
                            obj = jArr2;
                        }
                        if (AndroidUtilities.needShowPasscode()) {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        } else {
                            i24 = i23;
                            obj2 = obj;
                            j25 = j21;
                            z27 = false;
                        }
                        if (!z27) {
                            Intent intent1116 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                            intent1116.putExtra("currentAccount", r10.currentAccount);
                            tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1116, 167772160));
                        }
                        r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                        scheduleNotificationRepeat();
                    }
                    tVar2.j(bitmap2);
                    jArr2 = null;
                    if (z10) {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    } else {
                        tVar2.f5125j = -1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            i22 = 2;
                        } else {
                            i22 = 0;
                        }
                    }
                    if (r14 != 1) {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    } else {
                        i23 = i19;
                        jArr3 = new long[]{0, 0};
                        tVar2.E.vibrate = jArr3;
                        obj = jArr2;
                    }
                    if (AndroidUtilities.needShowPasscode()) {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    } else {
                        i24 = i23;
                        obj2 = obj;
                        j25 = j21;
                        z27 = false;
                    }
                    if (!z27) {
                        Intent intent1117 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                        intent1117.putExtra("currentAccount", r10.currentAccount);
                        tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1117, 167772160));
                    }
                    r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z310, z16, i4116);
                    scheduleNotificationRepeat();
                }
                intent.putExtra("storyId", Math.abs(messageObject.getId()));
                i18 = i17;
                z25 = z24;
                intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                intent2.putExtra("messageDate", messageObject.messageOwner.date);
                intent2.putExtra("currentAccount", r10.currentAccount);
                if (messageObject.isStoryPush) {
                    intent2.putExtra("story", true);
                }
                if (messageObject.isStoryReactionPush) {
                    i25 = 1;
                    intent2.putExtra("storyReaction", true);
                } else {
                    i25 = 1;
                }
                tVar2.E.deleteIntent = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, i25, intent2, 167772160);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            string = z34 ? r15 != 0 ? LocaleController.getString(R.string.NotificationHiddenChatName) : LocaleController.getString(R.string.NotificationHiddenName) : LocaleController.getString(R.string.AppName);
            z13 = false;
            if (messageObject.isReactionPush) {
                z14 = z13;
                if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                    string = LocaleController.getString(R.string.NotificationHiddenName);
                }
            } else {
                z14 = z13;
                if (!sharedPreferences.getBoolean("EnableReactionsPreview", true)) {
                    string = LocaleController.getString(R.string.NotificationHiddenName);
                }
            }
            if (z12) {
                if (UserConfig.getActivatedAccountsCount() <= 1) {
                    firstName = charSequence4;
                } else if (r10.pushDialogs.m() == 1) {
                    firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser());
                } else {
                    firstName = UserObject.getFirstName(r10.getUserConfig().getCurrentUser()) + "・";
                }
                chat2 = chat;
                if (r10.pushDialogs.m() == 1) {
                    j15 = jLongValue2;
                    if (r10.pushDialogs.m() == 1) {
                        firstName = firstName + LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]);
                    } else {
                        firstName = firstName + LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r10.pushDialogs.m(), new Object[0]));
                    }
                } else {
                    j15 = jLongValue2;
                    if (r10.pushDialogs.m() == 1) {
                        firstName = firstName + LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]);
                    } else {
                        firstName = firstName + LocaleController.formatString(R.string.NotificationMessagesPeopleDisplayOrder, LocaleController.formatPluralString("NewMessages", r10.total_unread_count, new Object[0]), LocaleController.formatPluralString("FromChats", r10.pushDialogs.m(), new Object[0]));
                    }
                }
            } else {
                j15 = jLongValue2;
                chat2 = chat;
                firstName = charSequence4;
            }
            tVar = new e0.t(ApplicationLoader.applicationContext);
            if (r10.pushMessages.size() > 1) {
                j16 = j13;
                charSequence = charSequence4;
                zArr = new boolean[1];
                stringForMessage = r10.getStringForMessage(messageObject, false, zArr, null);
                zIsSilentMessage = r10.isSilentMessage(messageObject);
                if (stringForMessage == null) {
                    return;
                }
                if (!z14) {
                    strReplace = stringForMessage;
                } else if (chat2 == null) {
                    if (zArr[0]) {
                        strReplace = stringForMessage.replace(string + ": ", charSequence);
                    } else {
                        strReplace = stringForMessage.replace(string + " ", charSequence);
                    }
                } else if (zArr[0]) {
                    strReplace = stringForMessage.replace(string + ": ", charSequence);
                } else {
                    strReplace = stringForMessage.replace(string + " ", charSequence);
                }
                tVar.f(strReplace);
                if (z12) {
                    firstName = strReplace;
                }
                e0.o oVar5 = new e0.o(0);
                oVar5.e(strReplace);
                tVar.n(oVar5);
                r14 = zIsSilentMessage;
            } else {
                j16 = j13;
                charSequence = charSequence4;
                zArr = new boolean[1];
                stringForMessage = r10.getStringForMessage(messageObject, false, zArr, null);
                zIsSilentMessage = r10.isSilentMessage(messageObject);
                if (stringForMessage == null) {
                    return;
                }
                if (!z14) {
                    strReplace = stringForMessage;
                } else if (chat2 == null) {
                    if (zArr[0]) {
                        strReplace = stringForMessage.replace(string + ": ", charSequence);
                    } else {
                        strReplace = stringForMessage.replace(string + " ", charSequence);
                    }
                } else if (zArr[0]) {
                    strReplace = stringForMessage.replace(string + ": ", charSequence);
                } else {
                    strReplace = stringForMessage.replace(string + " ", charSequence);
                }
                tVar.f(strReplace);
                if (z12) {
                    firstName = strReplace;
                }
                e0.o oVar6 = new e0.o(0);
                oVar6.e(strReplace);
                tVar.n(oVar6);
                r14 = zIsSilentMessage;
            }
            str2 = firstName;
            if (z10) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (z15) {
                str3 = str2;
                charSequence2 = charSequence;
                sharedPreferences2 = sharedPreferences;
                j17 = j16;
                z16 = z15;
            } else {
                str3 = str2;
                charSequence2 = charSequence;
                sharedPreferences2 = sharedPreferences;
                j17 = j16;
                z16 = z15;
            }
            if (z16) {
                sb2 = new StringBuilder();
                sb2.append("sound_enabled_");
                j18 = j14;
                sb2.append(getSharedPrefKey(j17, j18));
                if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                    z16 = true;
                }
            } else {
                j18 = j14;
            }
            path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
            z17 = ApplicationLoader.mainInterfacePaused;
            boolean z311 = !z17;
            getSharedPrefKey(j17, j18);
            j19 = j18;
            j20 = j17;
            tVar2 = tVar;
            if (messageObject.isReactionPush) {
                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                if (j22 != 0) {
                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                    z19 = true;
                } else {
                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                    z19 = false;
                }
                str4 = string2;
                int i4117 = sharedPreferences2.getInt("vibrate_react", 0);
                i10 = sharedPreferences2.getInt("priority_react", 1);
                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                if (messageObject.isStoryReactionPush) {
                    i11 = 5;
                } else {
                    i11 = 4;
                }
                z20 = z19;
                i12 = i4117;
                i13 = 4;
            } else {
                j22 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                if (j22 != 0) {
                    string2 = r10.getMediaDataController().ringtoneDataStore.e(j22);
                    z19 = true;
                } else {
                    string2 = sharedPreferences2.getString("ReactionSoundPath", path);
                    z19 = false;
                }
                str4 = string2;
                int i4118 = sharedPreferences2.getInt("vibrate_react", 0);
                i10 = sharedPreferences2.getInt("priority_react", 1);
                iIntValue = sharedPreferences2.getInt("ReactionsLed", -16776961);
                if (messageObject.isStoryReactionPush) {
                    i11 = 5;
                } else {
                    i11 = 4;
                }
                z20 = z19;
                i12 = i4118;
                i13 = 4;
            }
            if (i12 == i13) {
                z21 = true;
                i14 = 0;
            } else {
                i14 = i12;
                z21 = false;
            }
            if (TextUtils.isEmpty(propertyString)) {
                propertyString = str4;
                z18 = z20;
                z22 = true;
            } else {
                propertyString = str4;
                z18 = z20;
                z22 = true;
            }
            z23 = z21;
            if (property2 != 3) {
                property2 = i10;
            } else {
                property2 = i10;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
                z22 = false;
            }
            if (property != 0) {
                z24 = z22;
                property = i14;
            } else {
                z24 = z22;
                property = i14;
            }
            if (z17) {
                if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                    propertyString = null;
                }
                if (!sharedPreferences2.getBoolean("EnableInAppVibrate", true)) {
                    property = 2;
                }
                if (sharedPreferences2.getBoolean("EnableInAppPopup", true)) {
                    i15 = property;
                    str5 = propertyString;
                    property2 = 2;
                } else {
                    i15 = property;
                    str5 = propertyString;
                    property2 = 0;
                }
            } else {
                i15 = property;
                str5 = propertyString;
            }
            if (z23) {
                ringerMode = audioManager.getRingerMode();
                if (ringerMode != 0) {
                    i15 = 2;
                }
            }
            int i4119 = i11;
            if (z16) {
                i15 = 0;
                str5 = null;
                property2 = 0;
                i16 = 0;
            } else {
                i16 = iIntValue;
            }
            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("com.tmessages.openchat");
            i17 = i15;
            sb12.append(Math.random());
            sb12.append(Integer.MAX_VALUE);
            intent.setAction(sb12.toString());
            intent.setFlags(67108864);
            if (messageObject.isOauthPush) {
                intent.putExtra("oauth_url", messageObject.localName);
            }
            i19 = i16;
            str6 = path;
            z26 = z17;
            user2 = user;
            chat3 = chat2;
            fileLocation = null;
            intent.putExtra("currentAccount", r10.currentAccount);
            PendingIntent activity18 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
            tVar2.g(string);
            tVar2.E.icon = R.drawable.notification;
            tVar2.h(16, true);
            tVar2.f5124i = r10.total_unread_count;
            tVar2.f5123g = activity18;
            tVar2.f5132q = r10.notificationGroup;
            tVar2.f5133r = true;
            tVar2.f5126k = true;
            tVar2.E.when = ((long) messageObject.messageOwner.date) * j10;
            tVar2.f5137w = -15618822;
            tVar2.f5136u = "msg";
            if (chat3 == null) {
                str8 = "tel:+" + user2.phone;
                if (str8 != null) {
                    tVar2.F.add(str8);
                }
            }
            if (bitmap2 != null) {
                if (fileLocation != null) {
                    jArr2 = null;
                    imageFromMemory = ImageLoader.getInstance().getImageFromMemory(fileLocation, null, "50_50");
                    if (imageFromMemory != null) {
                        tVar2.j(imageFromMemory.getBitmap());
                    } else {
                        pathToAttach = r10.getFileLoader().getPathToAttach(fileLocation, true);
                        if (pathToAttach.exists()) {
                            fDp = 160.0f / AndroidUtilities.dp(50.0f);
                            BitmapFactory.Options options18 = new BitmapFactory.Options();
                            if (fDp < 1.0f) {
                                i21 = 1;
                            } else {
                                i21 = (int) fDp;
                            }
                            options18.inSampleSize = i21;
                            bitmapDecodeFile = BitmapFactory.decodeFile(pathToAttach.getAbsolutePath(), options18);
                            if (bitmapDecodeFile != null) {
                                tVar2.j(bitmapDecodeFile);
                            }
                        }
                    }
                }
                if (z10) {
                    tVar2.f5125j = -1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i22 = 2;
                    } else {
                        i22 = 0;
                    }
                } else {
                    tVar2.f5125j = -1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i22 = 2;
                    } else {
                        i22 = 0;
                    }
                }
                if (r14 != 1) {
                    i23 = i19;
                    jArr3 = new long[]{0, 0};
                    tVar2.E.vibrate = jArr3;
                    obj = jArr2;
                } else {
                    i23 = i19;
                    jArr3 = new long[]{0, 0};
                    tVar2.E.vibrate = jArr3;
                    obj = jArr2;
                }
                if (AndroidUtilities.needShowPasscode()) {
                    i24 = i23;
                    obj2 = obj;
                    j25 = j21;
                    z27 = false;
                } else {
                    i24 = i23;
                    obj2 = obj;
                    j25 = j21;
                    z27 = false;
                }
                if (!z27) {
                    Intent intent1118 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                    intent1118.putExtra("currentAccount", r10.currentAccount);
                    tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1118, 167772160));
                }
                r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z311, z16, i4119);
                scheduleNotificationRepeat();
            }
            tVar2.j(bitmap2);
            jArr2 = null;
            if (z10) {
                tVar2.f5125j = -1;
                if (Build.VERSION.SDK_INT >= 26) {
                    i22 = 2;
                } else {
                    i22 = 0;
                }
            } else {
                tVar2.f5125j = -1;
                if (Build.VERSION.SDK_INT >= 26) {
                    i22 = 2;
                } else {
                    i22 = 0;
                }
            }
            if (r14 != 1) {
                i23 = i19;
                jArr3 = new long[]{0, 0};
                tVar2.E.vibrate = jArr3;
                obj = jArr2;
            } else {
                i23 = i19;
                jArr3 = new long[]{0, 0};
                tVar2.E.vibrate = jArr3;
                obj = jArr2;
            }
            if (AndroidUtilities.needShowPasscode()) {
                i24 = i23;
                obj2 = obj;
                j25 = j21;
                z27 = false;
            } else {
                i24 = i23;
                obj2 = obj;
                j25 = j21;
                z27 = false;
            }
            if (!z27) {
                Intent intent1119 = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupReplyReceiver.class);
                intent1119.putExtra("currentAccount", r10.currentAccount);
                tVar2.a(R.drawable.ic_ab_reply, LocaleController.getString(R.string.Reply), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 2, intent1119, 167772160));
            }
            r10.showExtraNotifications(tVar2, str3, j25, j19, str11, jArr3, i24, obj2, i22, z25, z311, z16, i4119);
            scheduleNotificationRepeat();
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
        }
    }

    private boolean unsupportedNotificationShortcut() {
        return Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBubbles;
    }

    private void updateStoryPushesRunnable() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.storyPushMessages.size(); i10++) {
            Iterator<Pair<Long, Long>> it = this.storyPushMessages.get(i10).dateByIds.values().iterator();
            while (it.hasNext()) {
                jMin = Math.min(jMin, ((Long) it.next().second).longValue());
            }
        }
        DispatchQueue dispatchQueue = notificationsQueue;
        dispatchQueue.cancelRunnable(this.checkStoryPushesRunnable);
        long jCurrentTimeMillis = jMin - System.currentTimeMillis();
        if (jMin != Long.MAX_VALUE) {
            dispatchQueue.postRunnable(this.checkStoryPushesRunnable, Math.max(0L, jCurrentTimeMillis));
        }
    }

    private String validateChannelId(long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        String str2;
        String str3;
        char c10;
        String string;
        SharedPreferences sharedPreferences;
        String str4;
        boolean z13;
        boolean z14;
        String str5;
        String strMD5;
        String str6;
        boolean z15;
        String str7;
        int i13;
        String str8;
        String str9;
        String str10;
        String string2;
        NotificationChannel notificationChannel;
        boolean z16;
        AudioAttributes.Builder builder;
        long j12;
        long[] jArr2;
        boolean z17;
        String str11;
        String str12;
        long[] jArr3;
        boolean z18;
        boolean z19;
        SharedPreferences.Editor editorEdit;
        int i14;
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String string3 = "groups";
        if (z12) {
            str2 = "other" + this.currentAccount;
            str3 = null;
        } else if (i12 == 2) {
            str2 = "channels" + this.currentAccount;
            str3 = "overwrite_channel";
        } else if (i12 == 0) {
            str2 = "groups" + this.currentAccount;
            str3 = "overwrite_group";
        } else if (i12 == 3) {
            str2 = "stories" + this.currentAccount;
            str3 = "overwrite_stories";
        } else if (i12 == 4 || i12 == 5) {
            str2 = "reactions" + this.currentAccount;
            str3 = "overwrite_reactions";
        } else {
            str2 = "private" + this.currentAccount;
            str3 = "overwrite_private";
        }
        boolean z20 = !z10 && DialogObject.isEncryptedDialog(j10);
        boolean z21 = (z11 || str3 == null || !notificationsSettings.getBoolean(str3, false)) ? false : true;
        String strMD6 = Utilities.MD5(uri == null ? "NoSound2" : uri.toString());
        if (strMD6 != null && strMD6.length() > 5) {
            strMD6 = strMD6.substring(0, 5);
        }
        String str13 = "_";
        if (z12) {
            string3 = "silent";
            string = LocaleController.getString(R.string.NotificationsSilent);
            c10 = 0;
        } else if (z10) {
            string = LocaleController.getString(z11 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
            c10 = 0;
            if (i12 == 2) {
                string3 = z11 ? "channels_ia" : "channels";
            } else if (i12 == 0) {
                if (z11) {
                    string3 = "groups_ia";
                }
            } else if (i12 == 3) {
                string3 = z11 ? "stories_ia" : "stories";
            } else if (i12 == 4 || i12 == 5) {
                string3 = z11 ? "reactions_ia" : "reactions";
            } else {
                string3 = z11 ? "private_ia" : "private";
            }
        } else {
            c10 = 0;
            String string4 = z11 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? "org.telegram.keyia" : "org.telegram.key");
            sb2.append(j10);
            sb2.append("_");
            sb2.append(j11);
            string3 = sb2.toString();
            string = string4;
        }
        String strW = a9.p.w(string3, "_", strMD6);
        String string5 = notificationsSettings.getString(strW, null);
        String string6 = notificationsSettings.getString(strW + "_s", null);
        StringBuilder sb3 = new StringBuilder();
        String str14 = "_s";
        String str15 = "secret";
        if (string5 != null) {
            sharedPreferences = notificationsSettings;
            NotificationChannel notificationChannel2 = systemNotificationManager.getNotificationChannel(string5);
            str4 = string;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("current channel for " + string5 + " = " + notificationChannel2);
            }
            if (notificationChannel2 == null) {
                str14 = str14;
                jArr = jArr;
                str15 = "secret";
                strW = strW;
                str13 = "_";
                str2 = str2;
                z13 = false;
                z14 = z21;
                str6 = null;
                strMD5 = null;
                str5 = null;
                z15 = false;
            } else if (z12 || z21 != 0) {
                z13 = false;
            } else {
                int importance = notificationChannel2.getImportance();
                Uri sound = notificationChannel2.getSound();
                long[] vibrationPattern = notificationChannel2.getVibrationPattern();
                boolean zShouldVibrate = notificationChannel2.shouldVibrate();
                str2 = str2;
                if (zShouldVibrate || vibrationPattern != null) {
                    j12 = 0;
                    jArr2 = vibrationPattern;
                } else {
                    j12 = 0;
                    jArr2 = new long[2];
                    jArr2[c10] = 0;
                    jArr2[1] = 0;
                }
                int lightColor = notificationChannel2.getLightColor();
                strW = strW;
                str13 = "_";
                if (jArr2 != null) {
                    int i15 = 0;
                    while (true) {
                        z17 = zShouldVibrate;
                        if (i15 >= jArr2.length) {
                            break;
                        }
                        sb3.append(jArr2[i15]);
                        i15++;
                        zShouldVibrate = z17;
                    }
                } else {
                    z17 = zShouldVibrate;
                }
                sb3.append(lightColor);
                if (sound != null) {
                    sb3.append(sound.toString());
                }
                sb3.append(importance);
                if (!z10 && z20) {
                    sb3.append("secret");
                }
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb4 = new StringBuilder("current channel settings for ");
                    sb4.append(string5);
                    sb4.append(" = ");
                    sb4.append((Object) sb3);
                    sb4.append(" old = ");
                    org.telegram.ui.Cells.pa.v(string6, sb4);
                }
                String strMD7 = Utilities.MD5(sb3.toString());
                sb3.setLength(0);
                if (z11 && i11 != importance) {
                    jArr3 = jArr;
                    i10 = i10;
                    str15 = "secret";
                    str11 = string5;
                    z13 = false;
                    z19 = false;
                    str14 = str14;
                    sb3 = sb3;
                    str12 = strMD7;
                    z18 = true;
                } else if (strMD7.equals(string6)) {
                    i10 = i10;
                    str15 = "secret";
                    str11 = string5;
                    z13 = false;
                    str14 = str14;
                    sb3 = sb3;
                    str12 = strMD7;
                    jArr3 = jArr;
                    z18 = z21;
                    z19 = false;
                } else {
                    if (importance == 0) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        if (!z10) {
                            if (i12 == 3) {
                                editorEdit2.putBoolean(y1.j(j10, j12, new StringBuilder("stories_")), false);
                            } else {
                                editorEdit2.putInt(y1.j(j10, j12, new StringBuilder("notify2_")), 2);
                            }
                            updateServerNotificationsSettings(j10, 0L, true);
                        } else if (!z11) {
                            if (i12 == 3) {
                                editorEdit2.putBoolean("EnableAllStories", false);
                            } else if (i12 == 4) {
                                editorEdit2.putBoolean("EnableReactionsMessages", true);
                                editorEdit2.putBoolean("EnableReactionsStories", true);
                            } else {
                                editorEdit2.putInt(getGlobalNotificationsKey(i12), Integer.MAX_VALUE);
                            }
                            updateServerNotificationsSettings(i12);
                        }
                        editorEdit = editorEdit2;
                        str12 = strMD7;
                        str15 = "secret";
                        str11 = string5;
                        str14 = str14;
                        jArr3 = jArr2;
                        sb3 = sb3;
                        z13 = false;
                        z19 = true;
                    } else {
                        str11 = string5;
                        jArr3 = jArr2;
                        str14 = str14;
                        str12 = strMD7;
                        str15 = "secret";
                        sb3 = sb3;
                        if (importance != i11) {
                            if (z11) {
                                z13 = false;
                                editorEdit = null;
                            } else {
                                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                if (importance == 4 || importance == 5) {
                                    i14 = 1;
                                } else if (importance == 1) {
                                    i14 = 4;
                                } else {
                                    i14 = importance == 2 ? 5 : 0;
                                }
                                if (z10) {
                                    if (i12 == 3) {
                                        editorEdit3.putBoolean("EnableAllStories", true);
                                    } else {
                                        if (i12 == 4) {
                                            editorEdit3.putBoolean("EnableReactionsMessages", true);
                                            editorEdit3.putBoolean("EnableReactionsStories", true);
                                        } else {
                                            z13 = false;
                                            editorEdit3.putInt(getGlobalNotificationsKey(i12), 0);
                                        }
                                        if (i12 == 2) {
                                            editorEdit3.putInt("priority_channel", i14);
                                        } else if (i12 == 0) {
                                            editorEdit3.putInt("priority_group", i14);
                                        } else if (i12 == 3) {
                                            editorEdit3.putInt("priority_stories", i14);
                                        } else if (i12 != 4 || i12 == 5) {
                                            editorEdit3.putInt("priority_react", i14);
                                        } else {
                                            editorEdit3.putInt("priority_messages", i14);
                                        }
                                    }
                                    z13 = false;
                                    if (i12 == 2) {
                                        editorEdit3.putInt("priority_channel", i14);
                                    } else if (i12 == 0) {
                                        editorEdit3.putInt("priority_group", i14);
                                    } else if (i12 == 3) {
                                        editorEdit3.putInt("priority_stories", i14);
                                    } else if (i12 != 4) {
                                        editorEdit3.putInt("priority_react", i14);
                                    } else {
                                        editorEdit3.putInt("priority_react", i14);
                                    }
                                } else {
                                    z13 = false;
                                    if (i12 == 3) {
                                        editorEdit3.putBoolean("stories_" + j10, true);
                                    } else {
                                        editorEdit3.putInt("notify2_" + j10, 0);
                                        editorEdit3.remove("notifyuntil_" + j10);
                                        editorEdit3.putInt("priority_" + j10, i14);
                                    }
                                }
                                editorEdit = editorEdit3;
                            }
                            z19 = true;
                        } else {
                            str15 = str15;
                            z13 = false;
                            editorEdit = null;
                            z19 = false;
                        }
                    }
                    boolean z22 = z17;
                    if ((!isEmptyVibration(jArr)) != z22) {
                        if (!z11) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferences.edit();
                            }
                            if (!z10) {
                                editorEdit.putInt(a9.p.l(j10, "vibrate_"), z22 ? 0 : 2);
                            } else if (i12 == 2) {
                                editorEdit.putInt("vibrate_channel", z22 ? 0 : 2);
                            } else if (i12 == 0) {
                                editorEdit.putInt("vibrate_group", z22 ? 0 : 2);
                            } else if (i12 == 3) {
                                editorEdit.putInt("vibrate_stories", z22 ? 0 : 2);
                            } else if (i12 == 4 || i12 == 5) {
                                editorEdit.putInt("vibrate_react", z22 ? 0 : 2);
                            } else {
                                editorEdit.putInt("vibrate_messages", z22 ? 0 : 2);
                            }
                        }
                        z19 = true;
                    } else {
                        jArr3 = jArr;
                    }
                    i10 = i10;
                    if (lightColor != i10) {
                        if (!z11) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferences.edit();
                            }
                            if (!z10) {
                                editorEdit.putInt("color_" + j10, lightColor);
                            } else if (i12 == 2) {
                                editorEdit.putInt("ChannelLed", lightColor);
                            } else if (i12 == 0) {
                                editorEdit.putInt("GroupLed", lightColor);
                            } else if (i12 == 3) {
                                editorEdit.putInt("StoriesLed", lightColor);
                            } else if (i12 == 5 || i12 == 4) {
                                editorEdit.putInt("ReactionsLed", lightColor);
                            } else {
                                editorEdit.putInt("MessagesLed", lightColor);
                            }
                        }
                        i10 = lightColor;
                        z19 = true;
                    }
                    if (editorEdit != null) {
                        editorEdit.commit();
                    }
                    z18 = z21;
                }
                z14 = z18;
                z15 = z19;
                str5 = str11;
                jArr = jArr3;
                str6 = string6;
                strMD5 = str12;
            }
            if (z15 || strMD5 == null) {
                str7 = strW;
                if (z14 || strMD5 == null || !z11 || !z10) {
                    for (long j13 : jArr) {
                        sb3.append(j13);
                    }
                    sb3.append(i10);
                    if (uri != null) {
                        sb3.append(uri.toString());
                    }
                    sb3.append(i11);
                    if (!z10 && z20) {
                        sb3.append(str15);
                    }
                    strMD5 = Utilities.MD5(sb3.toString());
                    if (z12 && str5 != null && (z14 || !str6.equals(strMD5))) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(str5);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel by settings change ".concat(str5));
                        }
                        str8 = strMD5;
                        str9 = null;
                    }
                }
                if (str9 == null) {
                    if (z10) {
                        str10 = this.currentAccount + "channel_" + str7 + str13 + Utilities.random.nextLong();
                    } else {
                        str10 = this.currentAccount + "channel_" + j10 + str13 + Utilities.random.nextLong();
                    }
                    str9 = str10;
                    if (z20) {
                        string2 = LocaleController.getString(R.string.SecretChatName);
                    } else {
                        string2 = str4;
                    }
                    notificationChannel = new NotificationChannel(str9, string2, i11);
                    notificationChannel.setGroup(str2);
                    if (i10 != 0) {
                        z16 = true;
                        notificationChannel.enableLights(true);
                        notificationChannel.setLightColor(i10);
                    } else {
                        z16 = true;
                        notificationChannel.enableLights(z13);
                    }
                    if (isEmptyVibration(jArr)) {
                        notificationChannel.enableVibration(z13);
                    } else {
                        notificationChannel.enableVibration(z16);
                        if (jArr.length > 0) {
                            notificationChannel.setVibrationPattern(jArr);
                        }
                    }
                    builder = new AudioAttributes.Builder();
                    builder.setContentType(4);
                    builder.setUsage(5);
                    if (uri != null) {
                        notificationChannel.setSound(uri, builder.build());
                    } else {
                        notificationChannel.setSound(null, builder.build());
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("create new channel " + str9);
                    }
                    this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                    systemNotificationManager.createNotificationChannel(notificationChannel);
                    sharedPreferences.edit().putString(str7, str9).putString(str7 + str14, str8).commit();
                }
                return str9;
            }
            str7 = strW;
            sharedPreferences.edit().putString(str7, str5).putString(str7 + str14, strMD5).commit();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("change edited channel " + str5);
            }
            str8 = strMD5;
            str9 = str5;
            if (str9 == null) {
                if (z10) {
                    str10 = this.currentAccount + "channel_" + str7 + str13 + Utilities.random.nextLong();
                } else {
                    str10 = this.currentAccount + "channel_" + j10 + str13 + Utilities.random.nextLong();
                }
                str9 = str10;
                if (z20) {
                    string2 = LocaleController.getString(R.string.SecretChatName);
                } else {
                    string2 = str4;
                }
                notificationChannel = new NotificationChannel(str9, string2, i11);
                notificationChannel.setGroup(str2);
                if (i10 != 0) {
                    z16 = true;
                    notificationChannel.enableLights(true);
                    notificationChannel.setLightColor(i10);
                } else {
                    z16 = true;
                    notificationChannel.enableLights(z13);
                }
                if (isEmptyVibration(jArr)) {
                    notificationChannel.enableVibration(z16);
                    if (jArr.length > 0) {
                        notificationChannel.setVibrationPattern(jArr);
                    }
                } else {
                    notificationChannel.enableVibration(z13);
                }
                builder = new AudioAttributes.Builder();
                builder.setContentType(4);
                builder.setUsage(5);
                if (uri != null) {
                    notificationChannel.setSound(uri, builder.build());
                } else {
                    notificationChannel.setSound(null, builder.build());
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new channel " + str9);
                }
                this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                systemNotificationManager.createNotificationChannel(notificationChannel);
                sharedPreferences.edit().putString(str7, str9).putString(str7 + str14, str8).commit();
            }
            return str9;
        }
        sharedPreferences = notificationsSettings;
        str4 = string;
        z21 = z21;
        z13 = false;
        z14 = z21;
        str5 = string5;
        str6 = string6;
        strMD5 = null;
        z15 = false;
        if (z15) {
            str7 = strW;
            if (z14) {
                while (i13 < jArr.length) {
                    sb3.append(j13);
                }
                sb3.append(i10);
                if (uri != null) {
                    sb3.append(uri.toString());
                }
                sb3.append(i11);
                if (!z10) {
                    sb3.append(str15);
                }
                strMD5 = Utilities.MD5(sb3.toString());
                if (z12) {
                    str8 = strMD5;
                    str9 = str5;
                } else {
                    str8 = strMD5;
                    str9 = str5;
                }
            } else {
                while (i13 < jArr.length) {
                    sb3.append(j13);
                }
                sb3.append(i10);
                if (uri != null) {
                    sb3.append(uri.toString());
                }
                sb3.append(i11);
                if (!z10) {
                    sb3.append(str15);
                }
                strMD5 = Utilities.MD5(sb3.toString());
                if (z12) {
                    str8 = strMD5;
                    str9 = str5;
                } else {
                    str8 = strMD5;
                    str9 = str5;
                }
            }
        } else {
            str7 = strW;
            if (z14) {
                while (i13 < jArr.length) {
                    sb3.append(j13);
                }
                sb3.append(i10);
                if (uri != null) {
                    sb3.append(uri.toString());
                }
                sb3.append(i11);
                if (!z10) {
                    sb3.append(str15);
                }
                strMD5 = Utilities.MD5(sb3.toString());
                if (z12) {
                    str8 = strMD5;
                    str9 = str5;
                } else {
                    str8 = strMD5;
                    str9 = str5;
                }
            } else {
                while (i13 < jArr.length) {
                    sb3.append(j13);
                }
                sb3.append(i10);
                if (uri != null) {
                    sb3.append(uri.toString());
                }
                sb3.append(i11);
                if (!z10) {
                    sb3.append(str15);
                }
                strMD5 = Utilities.MD5(sb3.toString());
                if (z12) {
                    str8 = strMD5;
                    str9 = str5;
                } else {
                    str8 = strMD5;
                    str9 = str5;
                }
            }
        }
        if (str9 == null) {
            if (z10) {
                str10 = this.currentAccount + "channel_" + str7 + str13 + Utilities.random.nextLong();
            } else {
                str10 = this.currentAccount + "channel_" + j10 + str13 + Utilities.random.nextLong();
            }
            str9 = str10;
            if (z20) {
                string2 = LocaleController.getString(R.string.SecretChatName);
            } else {
                string2 = str4;
            }
            notificationChannel = new NotificationChannel(str9, string2, i11);
            notificationChannel.setGroup(str2);
            if (i10 != 0) {
                z16 = true;
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(i10);
            } else {
                z16 = true;
                notificationChannel.enableLights(z13);
            }
            if (isEmptyVibration(jArr)) {
                notificationChannel.enableVibration(z16);
                if (jArr.length > 0) {
                    notificationChannel.setVibrationPattern(jArr);
                }
            } else {
                notificationChannel.enableVibration(z13);
            }
            builder = new AudioAttributes.Builder();
            builder.setContentType(4);
            builder.setUsage(5);
            if (uri != null) {
                notificationChannel.setSound(uri, builder.build());
            } else {
                notificationChannel.setSound(null, builder.build());
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("create new channel " + str9);
            }
            this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
            systemNotificationManager.createNotificationChannel(notificationChannel);
            sharedPreferences.edit().putString(str7, str9).putString(str7 + str14, str8).commit();
        }
        return str9;
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new xg(this, 0));
    }

    public void clearDialogNotificationsSettings(long j10, long j11) {
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        String sharedPrefKey = getSharedPrefKey(j10, j11);
        editorEdit.remove("notify2_" + sharedPrefKey).remove("custom_" + sharedPrefKey);
        getMessagesStorage().setDialogFlags(j10, 0L);
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        if (dialog != null) {
            dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
        }
        editorEdit.commit();
        getNotificationsController().updateServerNotificationsSettings(j10, j11, true);
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new xg(this, 5));
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
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
            if (i11 == 0 || i11 == -1) {
                if (i10 == 2) {
                    str = "channels";
                } else if (i10 == 0) {
                    str = "groups";
                } else if (i10 == 3) {
                    str = "stories";
                } else {
                    str = (i10 == 4 || i10 == 5) ? "reactions" : "private";
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    editorEdit.remove(str).remove(str.concat("_s"));
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    str2 = (i10 == 4 || i10 == 5) ? "reactions_ia" : "private_ia";
                }
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    editorEdit.remove(str2).remove(str2.concat("_s"));
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                str3 = (i10 == 4 || i10 == 5) ? "overwrite_reactions" : "overwrite_private";
            }
            editorEdit.remove(str3);
            editorEdit.commit();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            notificationsQueue.postRunnable(new sg(3, this, (String) objArr[0]));
        }
    }

    public void ensureGroupsCreated() {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (this.groupsCreated == null) {
            this.groupsCreated = Boolean.valueOf(notificationsSettings.getBoolean("groupsCreated5", false));
        }
        if (!this.groupsCreated.booleanValue()) {
            try {
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                SharedPreferences.Editor editorEdit = null;
                for (int i10 = 0; i10 < size; i10++) {
                    NotificationChannel notificationChannelA = vg.a(notificationChannels.get(i10));
                    String id2 = notificationChannelA.getId();
                    if (id2.startsWith(str)) {
                        int importance = notificationChannelA.getImportance();
                        if (importance != 4 && importance != 5 && !id2.contains("_ia_")) {
                            if (id2.contains("_channels_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id2.contains("_reactions_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_react").remove("vibrate_react").remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id2.contains("_groups_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id2.contains("_private_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_messages");
                                editorEdit.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                long jLongValue = Utilities.parseLong(id2.substring(9, id2.indexOf(95, 9))).longValue();
                                if (jLongValue != 0) {
                                    if (editorEdit == null) {
                                        editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                    }
                                    editorEdit.remove("priority_" + jLongValue).remove("vibrate_" + jLongValue).remove("sound_path_" + jLongValue).remove("sound_" + jLongValue);
                                }
                            }
                        }
                        systemNotificationManager.deleteNotificationChannel(id2);
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            notificationsSettings.edit().putBoolean("groupsCreated5", true).commit();
            this.groupsCreated = Boolean.TRUE;
        }
        if (this.channelGroupsCreated) {
            return;
        }
        List<NotificationChannelGroup> notificationChannelGroups = systemNotificationManager.getNotificationChannelGroups();
        String str2 = "channels" + this.currentAccount;
        String str3 = "groups" + this.currentAccount;
        String str4 = "private" + this.currentAccount;
        String str5 = "stories" + this.currentAccount;
        String str6 = "reactions" + this.currentAccount;
        String str7 = "other" + this.currentAccount;
        int size2 = notificationChannelGroups.size();
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        for (int i11 = 0; i11 < size2; i11++) {
            String id3 = notificationChannelGroups.get(i11).getId();
            if (str2 != null && str2.equals(id3)) {
                str2 = null;
            } else if (str3 != null && str3.equals(id3)) {
                str3 = null;
            } else if (str10 != null && str10.equals(id3)) {
                str10 = null;
            } else if (str9 != null && str9.equals(id3)) {
                str9 = null;
            } else if (str11 != null && str11.equals(id3)) {
                str11 = null;
            } else if (str8 != null && str8.equals(id3)) {
                str8 = null;
            }
            if (str2 == null && str10 == null && str9 == null && str3 == null && str11 == null && str8 == null) {
                break;
            }
        }
        if (str2 != null || str3 != null || str9 != null || str10 != null || str11 != null || str8 != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                getUserConfig().getCurrentUser();
            }
            String str12 = user != null ? " (" + ContactsController.formatName(user.first_name, user.last_name) + ")" : "";
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(new NotificationChannelGroup(str2, LocaleController.getString(R.string.NotificationsChannels) + str12));
            }
            if (str3 != null) {
                arrayList.add(new NotificationChannelGroup(str3, LocaleController.getString(R.string.NotificationsGroups) + str12));
            }
            if (str10 != null) {
                arrayList.add(new NotificationChannelGroup(str10, LocaleController.getString(R.string.NotificationsStories) + str12));
            }
            if (str9 != null) {
                arrayList.add(new NotificationChannelGroup(str9, LocaleController.getString(R.string.NotificationsReactions) + str12));
            }
            if (str11 != null) {
                arrayList.add(new NotificationChannelGroup(str11, LocaleController.getString(R.string.NotificationsPrivateChats) + str12));
            }
            if (str8 != null) {
                arrayList.add(new NotificationChannelGroup(str8, LocaleController.getString(R.string.NotificationsOther) + str12));
            }
            systemNotificationManager.createNotificationChannelGroups(arrayList);
        }
        this.channelGroupsCreated = true;
    }

    public void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new xg(this, 11));
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
        notificationsQueue.postRunnable(new xg(this, 1));
    }

    public boolean isGlobalNotificationsEnabled(long j10, boolean z10, boolean z11) {
        return isGlobalNotificationsEnabled(j10, null, z10, z11);
    }

    public void loadTopicsNotificationsExceptions(long j10, Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, j10, consumer, 24));
    }

    public void muteDialog(long j10, long j11, boolean z10) {
        if (z10) {
            getInstance(this.currentAccount).muteUntil(j10, j11, Integer.MAX_VALUE);
            return;
        }
        boolean zIsGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
        boolean z11 = j11 != 0;
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        if (!zIsGlobalNotificationsEnabled || z11) {
            editorEdit.putInt(y1.j(j10, j11, new StringBuilder("notify2_")), 0);
        } else {
            editorEdit.remove(y1.j(j10, j11, new StringBuilder("notify2_")));
        }
        if (j11 == 0) {
            getMessagesStorage().setDialogFlags(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.apply();
        updateServerNotificationsSettings(j10, j11);
    }

    public void muteUntil(long j10, long j11, int i10) {
        long j12;
        if (j10 != 0) {
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            boolean z10 = j11 != 0;
            boolean zIsGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j10, false, false);
            String sharedPrefKey = getSharedPrefKey(j10, j11);
            if (i10 != Integer.MAX_VALUE) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 3);
                editorEdit.putInt("notifyuntil_" + sharedPrefKey, getConnectionsManager().getCurrentTime() + i10);
                j12 = (((long) i10) << 32) | 1;
            } else if (zIsGlobalNotificationsEnabled || z10) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                j12 = 1L;
            } else {
                editorEdit.remove("notify2_" + sharedPrefKey);
                j12 = 0;
            }
            editorEdit.apply();
            if (j11 == 0) {
                getInstance(this.currentAccount).removeNotificationsForDialog(j10);
                MessagesStorage.getInstance(this.currentAccount).setDialogFlags(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i10 != Integer.MAX_VALUE || zIsGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = i10;
                    }
                }
            }
            getInstance(this.currentAccount).updateServerNotificationsSettings(j10, j11);
        }
    }

    public void playOutChatSound() {
        if (!this.inChatSoundEnabled || MediaController.getInstance().isRecordingAudio()) {
            return;
        }
        try {
            if (audioManager.getRingerMode() == 0) {
                return;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        notificationsQueue.postRunnable(new xg(this, 6));
    }

    public void processDeleteStory(long j10, int i10) {
        notificationsQueue.postRunnable(new bh(this, j10, i10, 0));
    }

    public void processDialogsUpdateRead(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new ch(this, longSparseIntArray, new ArrayList(), 0));
    }

    public void processEditedMessages(a0.h hVar) {
        TLRPC.Message message;
        if (hVar == null || hVar.m() == 0) {
            return;
        }
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
        notificationsQueue.postRunnable(new sg(4, this, hVar));
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new xg(this, 3));
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new xg(this, 12));
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
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb2.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
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
                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date >= ((long) getMessagesController().callRingTimeout) / 1000) {
                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                        } else {
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
                                long jLongValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(DialogObject.getShortName(this.currentAccount, jLongValue));
                            }
                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getDialogId(), sb3.toString(), tL_messageActionConferenceCall.call_id, messageObject.getId(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i10);
                            i10--;
                        }
                    }
                }
                i10++;
            }
        }
        if (!arrayList.isEmpty()) {
            notificationsQueue.postRunnable(new sd(this, arrayList, new ArrayList(0), z13, z12, countDownLatch, 1));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void processReadMessages(LongSparseIntArray longSparseIntArray, long j10, int i10, int i11, boolean z10) {
        notificationsQueue.postRunnable(new o8(this, longSparseIntArray, new ArrayList(0), j10, i11, i10, z10));
    }

    public void processReadStories() {
    }

    public void processSeenStoryReactions(long j10, int i10) {
        if (j10 != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new wg(this, i10, 2));
    }

    public void removeDeletedHisoryFromNotifications(LongSparseIntArray longSparseIntArray) {
        notificationsQueue.postRunnable(new ch(this, longSparseIntArray, new ArrayList(0), 1));
    }

    public void removeDeletedMessagesFromNotifications(a0.h hVar, boolean z10) {
        notificationsQueue.postRunnable(new qj(this, hVar, z10, new ArrayList(0), 14));
    }

    public void removeNotificationsForDialog(long j10) {
        processReadMessages(null, j10, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new xg(this, 2));
    }

    public void setDialogNotificationsSettings(long j10, long j11, int i10) {
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.f(j10);
        if (i10 == 4) {
            if (isGlobalNotificationsEnabled(j10, false, false)) {
                editorEdit.remove(y1.j(j10, j11, new StringBuilder("notify2_")));
            } else {
                editorEdit.putInt(y1.j(j10, j11, new StringBuilder("notify2_")), 0);
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
                editorEdit.putInt(y1.j(j10, j11, new StringBuilder("notify2_")), 2);
            } else {
                editorEdit.putInt(y1.j(j10, j11, new StringBuilder("notify2_")), 3);
                editorEdit.putInt(y1.j(j10, j11, new StringBuilder("notifyuntil_")), currentTime);
                j12 = 1 | (((long) currentTime) << 32);
            }
            getInstance(UserConfig.selectedAccount).removeNotificationsForDialog(j10);
            MessagesStorage.getInstance(UserConfig.selectedAccount).setDialogFlags(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        editorEdit.commit();
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
        notificationsQueue.postRunnable(new wg(this, i10, 5));
    }

    public void setOpenedDialogId(long j10, long j11) {
        notificationsQueue.postRunnable(new gd(this, j10, j11, 1));
    }

    public void setOpenedInBubble(long j10, boolean z10) {
        notificationsQueue.postRunnable(new hh.ua(this, z10, j10, 4));
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new xg(this, 10));
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new xg(this, 4));
    }

    public void updateServerNotificationsSettings(long j10, long j11) {
        updateServerNotificationsSettings(j10, j11, true);
    }

    public static String getSharedPrefKey(long j10, long j11, boolean z10) {
        String strValueOf;
        if (z10) {
            if (j11 == 0) {
                return String.valueOf(j10);
            }
            Locale locale = Locale.US;
            return j10 + "_" + j11;
        }
        long j12 = (j11 << 12) + j10;
        a0.h hVar = sharedPrefCachedKeys;
        int iH = hVar.h(j12);
        if (iH >= 0) {
            return (String) hVar.n(iH);
        }
        if (j11 != 0) {
            Locale locale2 = Locale.US;
            strValueOf = j10 + "_" + j11;
        } else {
            strValueOf = String.valueOf(j10);
        }
        hVar.k(strValueOf, j12);
        return strValueOf;
    }

    public void deleteNotificationChannel(long j10, long j11, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new t7(this, j10, j11, i10, 1));
    }

    public void deleteNotificationChannelGlobal(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new r6(this, i10, i11, 2));
    }

    public boolean isGlobalNotificationsEnabled(long j10, Boolean bool, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            i10 = 4;
        } else if (z11) {
            i10 = 5;
        } else if (!DialogObject.isChatDialog(j10)) {
            i10 = 1;
        } else if (bool == null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                i10 = 0;
            } else {
                i10 = 2;
            }
        } else if (bool.booleanValue()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        return isGlobalNotificationsEnabled(i10);
    }

    public void processIgnoreStories(long j10) {
        notificationsQueue.postRunnable(new cg.b2(this, j10, 16));
    }

    public void processReadStories(long j10, int i10) {
        notificationsQueue.postRunnable(new bh(this, j10, i10, 1));
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
        int i10 = notificationsSettings.getInt(y1.j(j10, j11, new StringBuilder("notify2_")), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt(y1.j(j10, j11, new StringBuilder("notifyuntil_")), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i10 == 2 ? Integer.MAX_VALUE : 0;
            }
        }
        long j12 = notificationsSettings.getLong(y1.j(j10, j11, new StringBuilder("sound_document_id_")), 0L);
        String string = notificationsSettings.getString(y1.j(j10, j11, new StringBuilder("sound_path_")), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags |= 8;
        if (j12 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f22505id = j12;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string == null) {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        } else if (string.equalsIgnoreCase("NoSound")) {
            updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
        } else {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = notificationsSettings.getString(y1.j(j10, j11, new StringBuilder("sound_")), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
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
        getConnectionsManager().sendRequest(updatenotifysettings, new hd(7));
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
            getConnectionsManager().sendRequest(updatenotifysettings, new hd(6));
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
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new hd(5));
    }
}
