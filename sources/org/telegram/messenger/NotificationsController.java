package org.telegram.messenger;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
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
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.PostProcessor;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
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
import android.util.SparseBooleanArray;
import androidx.collection.LongSparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.content.FileProvider;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import com.google.common.collect.Lists;
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
import java.util.function.ToLongFunction;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;

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
    private static NotificationManagerCompat notificationManager;
    private static final LongSparseArray sharedPrefCachedKeys;
    private static NotificationManager systemNotificationManager;
    private AlarmManager alarmManager;
    private boolean channelGroupsCreated;
    private Runnable checkStoryPushesRunnable;
    private final ArrayList<MessageObject> delayedPushMessages;
    NotificationsSettingsFacade dialogsNotificationsFacade;
    private final LongSparseArray fcmRandomMessagesDict;
    private Boolean groupsCreated;
    private boolean inChatSoundEnabled;
    private int lastBadgeCount;
    private int lastButtonId;
    public long lastNotificationChannelCreateTime;
    private int lastOnlineFromOtherDevice;
    private long lastSoundOutPlay;
    private long lastSoundPlay;
    private final LongSparseArray lastWearNotifiedMessageId;
    private String launcherClassName;
    private SpoilerEffect mediaSpoilerEffect;
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
    private final LongSparseArray pushDialogs;
    private final LongSparseArray pushDialogsOverrideMention;
    private final ArrayList<MessageObject> pushMessages;
    private final LongSparseArray pushMessagesDict;
    public boolean showBadgeMessages;
    public boolean showBadgeMuted;
    public boolean showBadgeNumber;
    private final LongSparseArray smartNotificationsDialogs;
    private int soundIn;
    private boolean soundInLoaded;
    private int soundOut;
    private boolean soundOutLoaded;
    private SoundPool soundPool;
    private int soundRecord;
    private boolean soundRecordLoaded;
    char[] spoilerChars;
    private final ArrayList<StoryNotification> storyPushMessages;
    private final LongSparseArray storyPushMessagesDict;
    private int total_unread_count;
    private final LongSparseArray wearNotificationsIds;
    private static final DispatchQueue notificationsQueue = new DispatchQueue("notificationsQueue");
    public static long globalSecretChatId = DialogObject.makeEncryptedDialogId(1);

    public static void m942$r8$lambda$1t1axbSYGQIU_GMVkHnzrj3Llc(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void m946$r8$lambda$H_bZLJEQVx9OdWW6ZrpVB2xjp0(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$TMEsjTkj9lYdR59uaNuAf1n8IoU(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void processReadStories() {
    }

    static {
        notificationManager = null;
        systemNotificationManager = null;
        if (Build.VERSION.SDK_INT >= 26 && ApplicationLoader.applicationContext != null) {
            notificationManager = NotificationManagerCompat.from(ApplicationLoader.applicationContext);
            systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
            checkOtherNotificationsChannel();
        }
        audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        Instance = new NotificationsController[4];
        lockObjects = new Object[4];
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        sharedPrefCachedKeys = new LongSparseArray();
    }

    public static NotificationsController getInstance(int i) {
        NotificationsController notificationsController;
        NotificationsController notificationsController2 = Instance[i];
        if (notificationsController2 != null) {
            return notificationsController2;
        }
        synchronized (lockObjects[i]) {
            try {
                notificationsController = Instance[i];
                if (notificationsController == null) {
                    NotificationsController[] notificationsControllerArr = Instance;
                    NotificationsController notificationsController3 = new NotificationsController(i);
                    notificationsControllerArr[i] = notificationsController3;
                    notificationsController = notificationsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return notificationsController;
    }

    public NotificationsController(int i) {
        super(i);
        this.pushMessages = new ArrayList<>();
        this.delayedPushMessages = new ArrayList<>();
        this.pushMessagesDict = new LongSparseArray();
        this.fcmRandomMessagesDict = new LongSparseArray();
        this.smartNotificationsDialogs = new LongSparseArray();
        this.pushDialogs = new LongSparseArray();
        this.wearNotificationsIds = new LongSparseArray();
        this.lastWearNotifiedMessageId = new LongSparseArray();
        this.pushDialogsOverrideMention = new LongSparseArray();
        this.pendingVoiceLoads = new HashSet<>();
        this.popupMessages = new ArrayList<>();
        this.popupReplyMessages = new ArrayList<>();
        this.openedInBubbleDialogs = new HashSet<>();
        this.storyPushMessages = new ArrayList<>();
        this.storyPushMessagesDict = new LongSparseArray();
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.lastButtonId = 5000;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.notifyCheck = false;
        this.lastOnlineFromOtherDevice = 0;
        this.lastBadgeCount = -1;
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.spoilerChars = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.checkStoryPushesRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.checkStoryPushes();
            }
        };
        this.notificationId = this.currentAccount + 1;
        StringBuilder sb = new StringBuilder();
        sb.append("messages");
        int i2 = this.currentAccount;
        sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
        this.notificationGroup = sb.toString();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        this.inChatSoundEnabled = notificationsSettings.getBoolean("EnableInChatSound", true);
        this.showBadgeNumber = notificationsSettings.getBoolean("badgeNumber", true);
        this.showBadgeMuted = notificationsSettings.getBoolean("badgeNumberMuted", false);
        this.showBadgeMessages = notificationsSettings.getBoolean("badgeNumberMessages", true);
        notificationManager = NotificationManagerCompat.from(ApplicationLoader.applicationContext);
        systemNotificationManager = (NotificationManager) ApplicationLoader.applicationContext.getSystemService("notification");
        try {
            audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.alarmManager = (AlarmManager) ApplicationLoader.applicationContext.getSystemService("alarm");
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.notificationDelayWakelock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        this.notificationDelayRunnable = new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m954$r8$lambda$YjlEA4UsSMCZjKLgnFG9tPD1uY(this.f$0);
            }
        };
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController notificationsController = this.f$0;
                notificationsController.getNotificationCenter().addObserver(notificationsController, NotificationCenter.fileLoaded);
            }
        });
    }

    public static void m954$r8$lambda$YjlEA4UsSMCZjKLgnFG9tPD1uY(NotificationsController notificationsController) {
        notificationsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay reached");
        }
        if (!notificationsController.delayedPushMessages.isEmpty()) {
            notificationsController.showOrUpdateNotification(true);
            notificationsController.delayedPushMessages.clear();
        }
        try {
            if (notificationsController.notificationDelayWakelock.isHeld()) {
                notificationsController.notificationDelayWakelock.release();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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
            } catch (Exception e) {
                FileLog.e(e);
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
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            NotificationChannel notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(OTHER_NOTIFICATIONS_CHANNEL, "Internal notifications", 3);
            notificationChannelM.enableLights(false);
            notificationChannelM.enableVibration(false);
            notificationChannelM.setSound(null, null);
            try {
                systemNotificationManager.createNotificationChannel(notificationChannelM);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
    }

    public static String getSharedPrefKey(long j, long j2) {
        return getSharedPrefKey(j, j2, false);
    }

    public static String getSharedPrefKey(long j, long j2, boolean z) {
        String strValueOf;
        if (z) {
            return j2 != 0 ? String.format(Locale.US, "%d_%d", Long.valueOf(j), Long.valueOf(j2)) : String.valueOf(j);
        }
        long j3 = (j2 << 12) + j;
        LongSparseArray longSparseArray = sharedPrefCachedKeys;
        int iIndexOfKey = longSparseArray.indexOfKey(j3);
        if (iIndexOfKey >= 0) {
            return (String) longSparseArray.valueAt(iIndexOfKey);
        }
        if (j2 != 0) {
            strValueOf = String.format(Locale.US, "%d_%d", Long.valueOf(j), Long.valueOf(j2));
        } else {
            strValueOf = String.valueOf(j);
        }
        longSparseArray.put(j3, strValueOf);
        return strValueOf;
    }

    public void muteUntil(long j, long j2, int i) {
        long j3;
        if (j != 0) {
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            boolean z = j2 != 0;
            boolean zIsGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
            String sharedPrefKey = getSharedPrefKey(j, j2);
            if (i != Integer.MAX_VALUE) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 3);
                editorEdit.putInt("notifyuntil_" + sharedPrefKey, getConnectionsManager().getCurrentTime() + i);
                j3 = (((long) i) << 32) | 1;
            } else if (!zIsGlobalNotificationsEnabled && !z) {
                editorEdit.remove("notify2_" + sharedPrefKey);
                j3 = 0;
            } else {
                editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                j3 = 1L;
            }
            editorEdit.apply();
            if (j2 == 0) {
                getInstance(this.currentAccount).removeNotificationsForDialog(j);
                MessagesStorage.getInstance(this.currentAccount).setDialogFlags(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(j);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i != Integer.MAX_VALUE || zIsGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = i;
                    }
                }
            }
            getInstance(this.currentAccount).updateServerNotificationsSettings(j, j2);
        }
    }

    public void cleanup() {
        this.popupMessages.clear();
        this.popupReplyMessages.clear();
        this.channelGroupsCreated = false;
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$j8sc2Oc5thH9qf6t4YZaQzJylYM(this.f$0);
            }
        });
    }

    public static void $r8$lambda$j8sc2Oc5thH9qf6t4YZaQzJylYM(NotificationsController notificationsController) {
        notificationsController.openedDialogId = 0L;
        notificationsController.openedTopicId = 0L;
        notificationsController.total_unread_count = 0;
        notificationsController.personalCount = 0;
        notificationsController.pushMessages.clear();
        notificationsController.pushMessagesDict.clear();
        notificationsController.fcmRandomMessagesDict.clear();
        notificationsController.pushDialogs.clear();
        notificationsController.wearNotificationsIds.clear();
        notificationsController.lastWearNotifiedMessageId.clear();
        notificationsController.openedInBubbleDialogs.clear();
        notificationsController.delayedPushMessages.clear();
        notificationsController.notifyCheck = false;
        notificationsController.lastBadgeCount = 0;
        try {
            if (notificationsController.notificationDelayWakelock.isHeld()) {
                notificationsController.notificationDelayWakelock.release();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        notificationsController.dismissNotification();
        notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        SharedPreferences.Editor editorEdit = notificationsController.getAccountInstance().getNotificationsSettings().edit();
        editorEdit.clear();
        editorEdit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                systemNotificationManager.deleteNotificationChannelGroup("channels" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("groups" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("private" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("stories" + notificationsController.currentAccount);
                systemNotificationManager.deleteNotificationChannelGroup("other" + notificationsController.currentAccount);
                String str = notificationsController.currentAccount + "channel";
                List notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i = 0; i < size; i++) {
                    String id = NotificationsController$$ExternalSyntheticApiModelOutline7.m(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            systemNotificationManager.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public void setInChatSoundEnabled(boolean z) {
        this.inChatSoundEnabled = z;
    }

    public void setOpenedDialogId(final long j, final long j2) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m950$r8$lambda$UkCGl5RrEJ0cfBQHKFazw8DYEY(this.f$0, j, j2);
            }
        });
    }

    public static void m950$r8$lambda$UkCGl5RrEJ0cfBQHKFazw8DYEY(NotificationsController notificationsController, long j, long j2) {
        notificationsController.openedDialogId = j;
        notificationsController.openedTopicId = j2;
    }

    public void setOpenedInBubble(final long j, final boolean z) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$tbCTJoUn8gEA9DB5taeF2DHLAKM(this.f$0, z, j);
            }
        });
    }

    public static void $r8$lambda$tbCTJoUn8gEA9DB5taeF2DHLAKM(NotificationsController notificationsController, boolean z, long j) {
        if (z) {
            notificationsController.openedInBubbleDialogs.add(Long.valueOf(j));
        } else {
            notificationsController.openedInBubbleDialogs.remove(Long.valueOf(j));
        }
    }

    public void setLastOnlineFromOtherDevice(final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$WBr8c8N60WWOuQsa3c2E9OAODDA(this.f$0, i);
            }
        });
    }

    public static void $r8$lambda$WBr8c8N60WWOuQsa3c2E9OAODDA(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i);
        }
        notificationsController.lastOnlineFromOtherDevice = i;
    }

    public void removeNotificationsForDialog(long j) {
        processReadMessages(null, j, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        processDialogsUpdateRead(longSparseIntArray);
    }

    public boolean hasMessagesToReply() {
        for (int i = 0; i < this.pushMessages.size(); i++) {
            MessageObject messageObject = this.pushMessages.get(i);
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

    protected void forceShowPopupForReply() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m943$r8$lambda$9je_l1dCrLbSBh5ZPR5sV7qzY8(this.f$0);
            }
        });
    }

    public static void m943$r8$lambda$9je_l1dCrLbSBh5ZPR5sV7qzY8(final NotificationsController notificationsController) {
        notificationsController.getClass();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < notificationsController.pushMessages.size(); i++) {
            MessageObject messageObject = notificationsController.pushMessages.get(i);
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !DialogObject.isEncryptedDialog(dialogId) && (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup())) {
                arrayList.add(0, messageObject);
            }
        }
        if (arrayList.isEmpty() || AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m957$r8$lambda$fWygwckxgAuKqh6UZhdBNL_fbg(this.f$0, arrayList);
            }
        });
    }

    public static void m957$r8$lambda$fWygwckxgAuKqh6UZhdBNL_fbg(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.popupReplyMessages = arrayList;
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
        intent.putExtra("force", true);
        intent.putExtra("currentAccount", notificationsController.currentAccount);
        intent.setFlags(268763140);
        ApplicationLoader.applicationContext.startActivity(intent);
        ApplicationLoader.applicationContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void removeDeletedMessagesFromNotifications(final LongSparseArray longSparseArray, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m952$r8$lambda$XLBG2o6oPQF1GomXw6vC__VvGI(this.f$0, longSparseArray, z, arrayList);
            }
        });
    }

    public static void m952$r8$lambda$XLBG2o6oPQF1GomXw6vC__VvGI(final NotificationsController notificationsController, LongSparseArray longSparseArray, boolean z, final ArrayList arrayList) {
        Integer num;
        int i;
        Integer num2;
        Integer num3;
        int i2 = notificationsController.total_unread_count;
        notificationsController.getAccountInstance().getNotificationsSettings();
        Integer num4 = 0;
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long jKeyAt = longSparseArray.keyAt(i3);
            SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(jKeyAt);
            if (sparseArray == null) {
                num = num4;
                i = i3;
            } else {
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(jKeyAt);
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(iIntValue);
                    if (messageObject == null) {
                        num2 = num4;
                        i3 = i3;
                    } else if (!messageObject.isStoryReactionPush && (!z || messageObject.isReactionPush)) {
                        num2 = num4;
                        long dialogId = messageObject.getDialogId();
                        Integer num5 = (Integer) notificationsController.pushDialogs.get(dialogId);
                        if (num5 == null) {
                            num5 = num2;
                        }
                        int iIntValue2 = num5.intValue() - 1;
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        if (iIntValue2 <= 0) {
                            notificationsController.smartNotificationsDialogs.remove(dialogId);
                            num3 = num2;
                        } else {
                            num3 = numValueOf;
                        }
                        if (!num3.equals(num5)) {
                            if (!notificationsController.getMessagesController().isCommunity(dialogId)) {
                                if (notificationsController.getMessagesController().isForum(dialogId)) {
                                    int i5 = notificationsController.total_unread_count - (num5.intValue() > 0 ? 1 : 0);
                                    notificationsController.total_unread_count = i5;
                                    notificationsController.total_unread_count = i5 + (num3.intValue() > 0 ? 1 : 0);
                                } else {
                                    int iIntValue3 = notificationsController.total_unread_count - num5.intValue();
                                    notificationsController.total_unread_count = iIntValue3;
                                    notificationsController.total_unread_count = iIntValue3 + num3.intValue();
                                }
                            }
                            notificationsController.pushDialogs.put(dialogId, num3);
                        }
                        if (num3.intValue() == 0) {
                            notificationsController.pushDialogs.remove(dialogId);
                            notificationsController.pushDialogsOverrideMention.remove(dialogId);
                        }
                        sparseArray.remove(iIntValue);
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(messageObject);
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
                        }
                        arrayList.add(messageObject);
                    } else {
                        num2 = num4;
                        i3 = i3;
                    }
                    i4++;
                    num4 = num2;
                    i3 = i3;
                }
                num = num4;
                i = i3;
                if (sparseArray.size() == 0) {
                    notificationsController.pushMessagesDict.remove(jKeyAt);
                }
            }
            i3 = i + 1;
            num4 = num;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$e0LLLsExdVWUR1Y44kQxbBfvchg(this.f$0, arrayList);
                }
            });
        }
        if (i2 != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size2 = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$ZP9ImSQZ0gmFLrtAEIkNcDsP4LU(this.f$0, size2);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static void $r8$lambda$e0LLLsExdVWUR1Y44kQxbBfvchg(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static void $r8$lambda$ZP9ImSQZ0gmFLrtAEIkNcDsP4LU(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void removeDeletedHisoryFromNotifications(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$9joOzTYGXKxyxEjWeGWQfaf61Rg(this.f$0, longSparseIntArray, arrayList);
            }
        });
    }

    public static void $r8$lambda$9joOzTYGXKxyxEjWeGWQfaf61Rg(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        Integer num;
        int i = notificationsController.total_unread_count;
        notificationsController.getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i2 = 0;
        while (i2 < longSparseIntArray.size()) {
            long jKeyAt = longSparseIntArray.keyAt(i2);
            long j = -jKeyAt;
            long j2 = longSparseIntArray.get(jKeyAt);
            Integer num3 = (Integer) notificationsController.pushDialogs.get(j);
            if (num3 == null) {
                num3 = num2;
            }
            Integer numValueOf = num3;
            int i3 = 0;
            while (i3 < notificationsController.pushMessages.size()) {
                MessageObject messageObject = notificationsController.pushMessages.get(i3);
                if (messageObject.getDialogId() == j) {
                    num = num2;
                    if (messageObject.getId() <= j2) {
                        SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                notificationsController.pushMessagesDict.remove(j);
                            }
                        }
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(messageObject);
                        i3--;
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
                        }
                        arrayList.add(messageObject);
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                    }
                } else {
                    num = num2;
                }
                i3++;
                num2 = num;
            }
            Integer num4 = num2;
            if (numValueOf.intValue() <= 0) {
                notificationsController.smartNotificationsDialogs.remove(j);
                numValueOf = num4;
            }
            if (!numValueOf.equals(num3)) {
                if (!notificationsController.getMessagesController().isCommunity(j)) {
                    if (notificationsController.getMessagesController().isForum(j)) {
                        int i4 = notificationsController.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        notificationsController.total_unread_count = i4;
                        notificationsController.total_unread_count = i4 + (numValueOf.intValue() > 0 ? 1 : 0);
                    } else {
                        int iIntValue = notificationsController.total_unread_count - num3.intValue();
                        notificationsController.total_unread_count = iIntValue;
                        notificationsController.total_unread_count = iIntValue + numValueOf.intValue();
                    }
                }
                notificationsController.pushDialogs.put(j, numValueOf);
            }
            if (numValueOf.intValue() == 0) {
                notificationsController.pushDialogs.remove(j);
                notificationsController.pushDialogsOverrideMention.remove(j);
            }
            i2++;
            num2 = num4;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.m955$r8$lambda$cQtLpzui0CzihBzXg0Zyu_2y1Y(this.f$0, arrayList);
                }
            });
        }
        if (i != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$tGMVFhSO59Mr0OvrT1oLSEA2DUE(this.f$0, size);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static void m955$r8$lambda$cQtLpzui0CzihBzXg0Zyu_2y1Y(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static void $r8$lambda$tGMVFhSO59Mr0OvrT1oLSEA2DUE(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processSeenStoryReactions(long j, final int i) {
        if (j != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m964$r8$lambda$wikeq51v71LMWj1H0CS3F1rH8(this.f$0, i);
            }
        });
    }

    public static void m964$r8$lambda$wikeq51v71LMWj1H0CS3F1rH8(NotificationsController notificationsController, int i) {
        int i2 = 0;
        boolean z = false;
        while (i2 < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i2);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i) {
                notificationsController.pushMessages.remove(i2);
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                notificationsController.getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i2--;
                z = true;
            }
            i2++;
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processDeleteStory(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$dNkRwqog2oqXZhDIqfVtPgOMvoA(this.f$0, j, i);
            }
        });
    }

    public static void $r8$lambda$dNkRwqog2oqXZhDIqfVtPgOMvoA(NotificationsController notificationsController, long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i));
            if (storyNotification.dateByIds.isEmpty()) {
                notificationsController.storyPushMessagesDict.remove(j);
                notificationsController.storyPushMessages.remove(storyNotification);
                notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
                z = true;
            } else {
                notificationsController.getMessagesStorage().putStoryPushMessage(storyNotification);
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i) {
                notificationsController.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processReadStories(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m958$r8$lambda$fjjypkd1tkGySJVbOi2WVp2hUo(this.f$0, j, i);
            }
        });
    }

    public static void m958$r8$lambda$fjjypkd1tkGySJVbOi2WVp2hUo(NotificationsController notificationsController, long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) notificationsController.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            notificationsController.storyPushMessagesDict.remove(j);
            notificationsController.storyPushMessages.remove(storyNotification);
            notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i) {
                notificationsController.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
            notificationsController.updateStoryPushesRunnable();
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m961$r8$lambda$sxZ2Lkjhs_92jVazC7vsmujxbc(this.f$0);
            }
        });
    }

    public static void m961$r8$lambda$sxZ2Lkjhs_92jVazC7vsmujxbc(NotificationsController notificationsController) {
        boolean zIsEmpty = notificationsController.storyPushMessages.isEmpty();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.clear();
        notificationsController.getMessagesStorage().deleteAllStoryPushMessages();
        if (zIsEmpty) {
            return;
        }
        notificationsController.showOrUpdateNotification(false);
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m949$r8$lambda$Te7iXqov7nGXMKaqGRt6vHJQvo(this.f$0);
            }
        });
    }

    public static void m949$r8$lambda$Te7iXqov7nGXMKaqGRt6vHJQvo(NotificationsController notificationsController) {
        int i = 0;
        boolean z = false;
        while (i < notificationsController.pushMessages.size()) {
            MessageObject messageObject = notificationsController.pushMessages.get(i);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                notificationsController.pushMessages.remove(i);
                i--;
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    notificationsController.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i++;
        }
        notificationsController.getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processIgnoreStories(final long j) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$067jPUUJzWnsuAGI2YHwwJBOB_o(this.f$0, j);
            }
        });
    }

    public static void $r8$lambda$067jPUUJzWnsuAGI2YHwwJBOB_o(NotificationsController notificationsController, long j) {
        boolean zIsEmpty = notificationsController.storyPushMessages.isEmpty();
        notificationsController.storyPushMessages.clear();
        notificationsController.storyPushMessagesDict.clear();
        notificationsController.getMessagesStorage().deleteStoryPushMessage(j);
        if (zIsEmpty) {
            return;
        }
        notificationsController.showOrUpdateNotification(false);
    }

    public void processReadMessages(final LongSparseIntArray longSparseIntArray, final long j, final int i, final int i2, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$eCNzlLQuAUYTZ4ml7Mm4KVdbI_c(this.f$0, longSparseIntArray, arrayList, j, i2, i, z);
            }
        });
    }

    public static void $r8$lambda$eCNzlLQuAUYTZ4ml7Mm4KVdbI_c(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList, long j, int i, int i2, boolean z) {
        long j2;
        long dialogId;
        SparseArray sparseArray;
        long dialogId2;
        notificationsController.getClass();
        long j3 = 0;
        if (longSparseIntArray != null) {
            for (int i3 = 0; i3 < longSparseIntArray.size(); i3++) {
                long jKeyAt = longSparseIntArray.keyAt(i3);
                int i4 = longSparseIntArray.get(jKeyAt);
                int i5 = 0;
                while (i5 < notificationsController.pushMessages.size()) {
                    MessageObject messageObject = notificationsController.pushMessages.get(i5);
                    if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && messageObject.getId() <= i4 && !messageObject.isStoryReactionPush) {
                        if (notificationsController.isPersonalMessage(messageObject)) {
                            notificationsController.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            dialogId2 = messageObject.getDialogId();
                        } else {
                            long j4 = messageObject.messageOwner.peer_id.channel_id;
                            dialogId2 = j4 != j3 ? -j4 : j3;
                        }
                        SparseArray sparseArray2 = (SparseArray) notificationsController.pushMessagesDict.get(dialogId2);
                        if (sparseArray2 != null) {
                            sparseArray2.remove(messageObject.getId());
                            if (sparseArray2.size() == 0) {
                                notificationsController.pushMessagesDict.remove(dialogId2);
                            }
                        }
                        notificationsController.delayedPushMessages.remove(messageObject);
                        notificationsController.pushMessages.remove(i5);
                        i5--;
                    }
                    i5++;
                    j3 = j3;
                }
            }
        }
        long j5 = j3;
        if (j != j5 && (i != 0 || i2 != 0)) {
            int i6 = 0;
            while (i6 < notificationsController.pushMessages.size()) {
                MessageObject messageObject2 = notificationsController.pushMessages.get(i6);
                if (messageObject2.getDialogId() == j && !messageObject2.isStoryReactionPush) {
                    if (i2 != 0) {
                        if (messageObject2.messageOwner.date <= i2) {
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount--;
                            }
                            if (messageObject2.isStoryReactionPush) {
                                dialogId = messageObject2.getDialogId();
                            } else {
                                j2 = messageObject2.messageOwner.peer_id.channel_id;
                                if (j2 != j5) {
                                    dialogId = -j2;
                                } else {
                                    dialogId = j5;
                                }
                            }
                            sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(dialogId);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject2.getId());
                                if (sparseArray.size() == 0) {
                                    notificationsController.pushMessagesDict.remove(dialogId);
                                }
                            }
                            notificationsController.pushMessages.remove(i6);
                            notificationsController.delayedPushMessages.remove(messageObject2);
                            arrayList.add(messageObject2);
                            i6--;
                        }
                    } else if (!z) {
                        if (messageObject2.getId() <= i || i < 0) {
                            if (notificationsController.isPersonalMessage(messageObject2)) {
                                notificationsController.personalCount--;
                            }
                            if (messageObject2.isStoryReactionPush) {
                                dialogId = messageObject2.getDialogId();
                            } else {
                                j2 = messageObject2.messageOwner.peer_id.channel_id;
                                if (j2 != j5) {
                                    dialogId = -j2;
                                } else {
                                    dialogId = j5;
                                }
                            }
                            sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(dialogId);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject2.getId());
                                if (sparseArray.size() == 0) {
                                    notificationsController.pushMessagesDict.remove(dialogId);
                                }
                            }
                            notificationsController.pushMessages.remove(i6);
                            notificationsController.delayedPushMessages.remove(messageObject2);
                            arrayList.add(messageObject2);
                            i6--;
                        }
                    } else if (messageObject2.getId() == i || i < 0) {
                        if (notificationsController.isPersonalMessage(messageObject2)) {
                            notificationsController.personalCount--;
                        }
                        if (messageObject2.isStoryReactionPush) {
                            dialogId = messageObject2.getDialogId();
                        } else {
                            j2 = messageObject2.messageOwner.peer_id.channel_id;
                            if (j2 != j5) {
                                dialogId = -j2;
                            } else {
                                dialogId = j5;
                            }
                        }
                        sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(dialogId);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject2.getId());
                            if (sparseArray.size() == 0) {
                                notificationsController.pushMessagesDict.remove(dialogId);
                            }
                        }
                        notificationsController.pushMessages.remove(i6);
                        notificationsController.delayedPushMessages.remove(messageObject2);
                        arrayList.add(messageObject2);
                        i6--;
                    }
                }
                i6++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m960$r8$lambda$okgPiAtDPWzWvHm3PnDTT_MEmc(this.f$0, arrayList);
            }
        });
    }

    public static void m960$r8$lambda$okgPiAtDPWzWvHm3PnDTT_MEmc(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    private int addToPopupMessages(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j, boolean z, SharedPreferences sharedPreferences) {
        int i;
        if (messageObject.isStoryReactionPush) {
            return 0;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            i = 0;
        } else {
            if (sharedPreferences.getBoolean("custom_" + j, false)) {
                i = sharedPreferences.getInt("popup_" + j, 0);
            } else {
                i = 0;
            }
            if (i == 0) {
                if (z) {
                    i = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i = sharedPreferences.getInt(DialogObject.isChatDialog(j) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i == 1) {
                i = 3;
            } else if (i == 2) {
                i = 0;
            }
        }
        if (i != 0 && messageObject.messageOwner.peer_id.channel_id != 0 && !messageObject.isSupergroup()) {
            i = 0;
        }
        if (i != 0) {
            arrayList.add(0, messageObject);
        }
        return i;
    }

    public void processEditedMessages(final LongSparseArray longSparseArray) {
        TLRPC.Message message;
        if (longSparseArray == null || longSparseArray.size() == 0) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            ArrayList arrayList = (ArrayList) longSparseArray.valueAt(i);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i2);
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
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$EII47SQDShx1ozUZ9S58yICptT8(this.f$0, longSparseArray);
            }
        });
    }

    public static void $r8$lambda$EII47SQDShx1ozUZ9S58yICptT8(NotificationsController notificationsController, LongSparseArray longSparseArray) {
        long dialogId;
        notificationsController.getClass();
        int size = longSparseArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            longSparseArray.keyAt(i);
            ArrayList arrayList = (ArrayList) longSparseArray.valueAt(i);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                if (messageObject.isStoryReactionPush) {
                    dialogId = messageObject.getDialogId();
                } else {
                    long j = messageObject.messageOwner.peer_id.channel_id;
                    dialogId = j != 0 ? -j : 0L;
                }
                SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(dialogId);
                if (sparseArray == null) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.get(messageObject.getId());
                if (messageObject2 != null && (messageObject2.isReactionPush || messageObject2.isStoryReactionPush)) {
                    messageObject2 = null;
                }
                if (messageObject2 != null) {
                    sparseArray.put(messageObject.getId(), messageObject);
                    int iIndexOf = notificationsController.pushMessages.indexOf(messageObject2);
                    if (iIndexOf >= 0) {
                        notificationsController.pushMessages.set(iIndexOf, messageObject);
                    }
                    int iIndexOf2 = notificationsController.delayedPushMessages.indexOf(messageObject2);
                    if (iIndexOf2 >= 0) {
                        notificationsController.delayedPushMessages.set(iIndexOf2, messageObject);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            notificationsController.showOrUpdateNotification(false);
        }
    }

    public void processNewMessages(final ArrayList<MessageObject> arrayList, boolean z, boolean z2, final CountDownLatch countDownLatch) {
        final boolean z3;
        final boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationsController: processNewMessages msgs.size()=");
            sb.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            FileLog.d(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
        }
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                MessageObject messageObject = arrayList.get(i);
                if (messageObject != null && messageObject.messageOwner != null && !messageObject.isOutOwner()) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - messageObject.messageOwner.date < ((long) getMessagesController().callRingTimeout) / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(messageObject.getDialogId()));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                TLRPC.Peer peer = arrayList2.get(i2);
                                i2++;
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                            }
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long jLongValue = ((Long) it.next()).longValue();
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(DialogObject.getShortName(this.currentAccount, jLongValue));
                            }
                            VoIPGroupNotification.request(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getDialogId(), sb2.toString(), tL_messageActionConferenceCall.call_id, messageObject.getId(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i);
                            i--;
                        } else {
                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, this.currentAccount, messageObject.getId());
                        }
                    }
                }
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList3 = new ArrayList(0);
            notificationsQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$UcsHZKcLFLi3UyXgliaorOBH9cA(this.f$0, arrayList, arrayList3, z4, z3, countDownLatch);
                }
            });
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void $r8$lambda$UcsHZKcLFLi3UyXgliaorOBH9cA(NotificationsController notificationsController, ArrayList arrayList, final ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean zIsGlobalNotificationsEnabled;
        Integer num;
        boolean z3;
        int i;
        int id;
        long j;
        long dialogId;
        boolean z4;
        TLRPC.Chat chat;
        long j2;
        long dialogId2;
        SparseArray sparseArray;
        MessageObject messageObject;
        SharedPreferences sharedPreferences;
        long j3;
        MessageObject messageObject2;
        long j4;
        boolean z5;
        SharedPreferences sharedPreferences2;
        long topicId;
        TLRPC.Message message;
        long fromChatId;
        int iIndexOfKey;
        long j5;
        int notifyOverride;
        SharedPreferences sharedPreferences3;
        boolean zIsGlobalNotificationsEnabled2;
        boolean zBooleanValue;
        long j6;
        MessageObject messageObject3;
        Integer num2;
        int iIntValue;
        SparseArray sparseArray2;
        int iIndexOf;
        long j7;
        TLRPC.Message message2;
        final int i2;
        long j8;
        long currentTime;
        TLRPC.Message message3;
        long jCurrentTimeMillis;
        long j9;
        long dialogId3;
        int id2;
        StoryNotification storyNotification;
        boolean z6;
        boolean z7;
        final NotificationsController notificationsController2 = notificationsController;
        notificationsController2.getClass();
        LongSparseArray longSparseArray = new LongSparseArray();
        SharedPreferences notificationsSettings = notificationsController2.getAccountInstance().getNotificationsSettings();
        boolean z8 = notificationsSettings.getBoolean("PinnedMessages", true);
        int i3 = 0;
        boolean z9 = false;
        int iAddToPopupMessages = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i3 < arrayList.size()) {
            MessageObject messageObject4 = (MessageObject) arrayList.get(i3);
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
                    j9 = jCurrentTimeMillis;
                    dialogId3 = messageObject4.getDialogId();
                    id2 = messageObject4.getId();
                    storyNotification = (StoryNotification) notificationsController2.storyPushMessagesDict.get(dialogId3);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(j9), Long.valueOf(j9 + 86400000)));
                        z6 = storyNotification.hidden;
                        z7 = messageObject4.isStoryPushHidden;
                        if (z6 != z7) {
                            storyNotification.hidden = z7;
                            z12 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification);
                        z10 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId3, messageObject4.localName, id2, j9);
                        storyNotification2.hidden = messageObject4.isStoryPushHidden;
                        notificationsController2.storyPushMessages.add(storyNotification2);
                        notificationsController2.storyPushMessagesDict.put(dialogId3, storyNotification2);
                        notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z9 = true;
                        z12 = true;
                    }
                    Collections.sort(notificationsController2.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                        @Override
                        public final long applyAsLong(Object obj) {
                            return ((NotificationsController.StoryNotification) obj).date;
                        }
                    }));
                    z3 = z8;
                    i = i3;
                } else {
                    if (messageObject4.isOauthPush) {
                        message2 = messageObject4.messageOwner;
                        if (message2 == null) {
                            i2 = message2.id;
                            z3 = z8;
                            j8 = ((long) message2.date) + 60;
                            i = i3;
                            currentTime = ConnectionsManager.getInstance(notificationsController2.currentAccount).getCurrentTime();
                            if (currentTime > j8) {
                                sharedPreferences2 = notificationsSettings;
                            } else {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        NotificationsController.$r8$lambda$uCWKZm0vi9uhobwlW5cR7HSaokI(this.f$0, i2);
                                    }
                                }, (j8 - currentTime) * 1000);
                            }
                        }
                        notificationsSettings = sharedPreferences2;
                    } else {
                        z3 = z8;
                        i = i3;
                    }
                    id = messageObject4.getId();
                    if (messageObject4.isFcmMessage()) {
                        j = messageObject4.messageOwner.random_id;
                    } else {
                        j = 0;
                    }
                    dialogId = messageObject4.getDialogId();
                    if (messageObject4.isFcmMessage()) {
                        z4 = messageObject4.localChannel;
                    } else if (DialogObject.isChatDialog(dialogId)) {
                        chat = notificationsController2.getMessagesController().getChat(Long.valueOf(-dialogId));
                        if (ChatObject.isChannel(chat) || chat.megagroup) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                    if (messageObject4.isStoryReactionPush) {
                        dialogId2 = messageObject4.getDialogId();
                    } else {
                        j2 = messageObject4.messageOwner.peer_id.channel_id;
                        if (j2 != 0) {
                            dialogId2 = -j2;
                        } else {
                            dialogId2 = 0;
                        }
                    }
                    sparseArray = (SparseArray) notificationsController2.pushMessagesDict.get(dialogId2);
                    if (sparseArray != null) {
                        messageObject = (MessageObject) sparseArray.get(id);
                    } else {
                        messageObject = null;
                    }
                    sharedPreferences = notificationsSettings;
                    if (messageObject == null) {
                        j3 = j;
                        j7 = messageObject4.messageOwner.random_id;
                        if (j7 != 0 && (messageObject = (MessageObject) notificationsController2.fcmRandomMessagesDict.get(j7)) != null) {
                            notificationsController2.fcmRandomMessagesDict.remove(messageObject4.messageOwner.random_id);
                        }
                    } else {
                        j3 = j;
                    }
                    messageObject2 = messageObject;
                    if (messageObject2 != null) {
                        if (messageObject2.isFcmMessage()) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                notificationsController2.pushMessagesDict.put(dialogId2, sparseArray);
                            }
                            sparseArray.put(id, messageObject4);
                            iIndexOf = notificationsController2.pushMessages.indexOf(messageObject2);
                            if (iIndexOf >= 0) {
                                notificationsController2.pushMessages.set(iIndexOf, messageObject4);
                                iAddToPopupMessages = notificationsController2.addToPopupMessages(arrayList2, messageObject4, dialogId, z4, sharedPreferences);
                                notificationsSettings = sharedPreferences;
                            } else {
                                notificationsSettings = sharedPreferences;
                            }
                            if (z && (z10 = messageObject4.localEdit)) {
                                notificationsController2.getMessagesStorage().putPushMessage(messageObject4);
                            }
                        } else {
                            dialogId2 = dialogId2;
                            notificationsSettings = sharedPreferences;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                        }
                    } else {
                        notificationsSettings = sharedPreferences;
                        j4 = dialogId2;
                        z5 = z4;
                        if (z10) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("skipped message because edited");
                            }
                            sharedPreferences2 = notificationsSettings;
                            notificationsSettings = sharedPreferences2;
                        } else {
                            if (z && !messageObject4.isOauthPush) {
                                notificationsController2.getMessagesStorage().putPushMessage(messageObject4);
                            }
                            sharedPreferences2 = notificationsSettings;
                            topicId = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject4.messageOwner, notificationsController2.getMessagesController().isForum(messageObject4));
                            if (dialogId != notificationsController2.openedDialogId && ApplicationLoader.isScreenOn && !messageObject4.isStoryReactionPush && !messageObject4.isOauthPush) {
                                if (!z) {
                                    notificationsController2.playInChatSound();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because chat is already opened (openedDialogId = " + notificationsController2.openedDialogId + ")");
                                }
                            } else {
                                message = messageObject4.messageOwner;
                                if (!message.mentioned) {
                                    fromChatId = dialogId;
                                } else if (z3 && (message.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because message is mention of pinned");
                                    }
                                } else {
                                    fromChatId = messageObject4.getFromChatId();
                                }
                                if (notificationsController2.isPersonalMessage(messageObject4)) {
                                    notificationsController2.personalCount++;
                                }
                                DialogObject.isChatDialog(fromChatId);
                                iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                if (iIndexOfKey < 0 && topicId == 0) {
                                    zBooleanValue = ((Boolean) longSparseArray.valueAt(iIndexOfKey)).booleanValue();
                                    sharedPreferences3 = sharedPreferences2;
                                } else {
                                    j5 = fromChatId;
                                    notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences2, j5, topicId);
                                    sharedPreferences3 = sharedPreferences2;
                                    topicId = topicId;
                                    if (notifyOverride == -1) {
                                        fromChatId = j5;
                                        zIsGlobalNotificationsEnabled2 = notificationsController.isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                        }
                                    } else {
                                        fromChatId = j5;
                                        if (notifyOverride != 2) {
                                            zIsGlobalNotificationsEnabled2 = true;
                                        } else {
                                            zIsGlobalNotificationsEnabled2 = false;
                                        }
                                    }
                                    longSparseArray.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                    zBooleanValue = zIsGlobalNotificationsEnabled2;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                }
                                notificationsController2 = notificationsController;
                                if (zBooleanValue) {
                                    if (z) {
                                        j6 = fromChatId;
                                        notificationsSettings = sharedPreferences3;
                                    } else {
                                        long j10 = fromChatId;
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        iAddToPopupMessages = notificationsController2.addToPopupMessages(arrayList2, messageObject3, j10, z5, sharedPreferences4);
                                        j6 = j10;
                                        notificationsSettings = sharedPreferences4;
                                    }
                                    if (!z11) {
                                        messageObject3 = messageObject4;
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        messageObject3 = messageObject4;
                                        z11 = messageObject3.messageOwner.from_scheduled;
                                    }
                                    messageObject3 = messageObject4;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    messageObject3 = messageObject4;
                                    notificationsController2.delayedPushMessages.add(messageObject3);
                                    notificationsController2.appendMessage(messageObject3);
                                    if (id != 0) {
                                        if (sparseArray == null) {
                                            sparseArray2 = new SparseArray();
                                            notificationsController2.pushMessagesDict.put(j4, sparseArray2);
                                        } else {
                                            sparseArray2 = sparseArray;
                                        }
                                        sparseArray2.put(id, messageObject3);
                                    } else if (j3 != 0) {
                                        notificationsController2.fcmRandomMessagesDict.put(j3, messageObject3);
                                    }
                                    if (dialogId != j6) {
                                        num2 = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId);
                                        LongSparseArray longSparseArray2 = notificationsController2.pushDialogsOverrideMention;
                                        if (num2 == null) {
                                            iIntValue = 1;
                                        } else {
                                            iIntValue = num2.intValue() + 1;
                                        }
                                        longSparseArray2.put(dialogId, Integer.valueOf(iIntValue));
                                    }
                                } else {
                                    j6 = fromChatId;
                                    messageObject3 = messageObject4;
                                    notificationsSettings = sharedPreferences3;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                }
                                if (messageObject3.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(id, true);
                                    notificationsController2.getMessagesController().checkUnreadReactions(j6, topicId, sparseBooleanArray);
                                }
                                z10 = z10;
                                z9 = true;
                            }
                            notificationsSettings = sharedPreferences2;
                        }
                    }
                }
                sharedPreferences2 = notificationsSettings;
                z3 = z8;
                i = i3;
                notificationsSettings = sharedPreferences2;
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
                                j9 = jCurrentTimeMillis;
                                dialogId3 = messageObject4.getDialogId();
                                id2 = messageObject4.getId();
                                storyNotification = (StoryNotification) notificationsController2.storyPushMessagesDict.get(dialogId3);
                                if (storyNotification != null) {
                                    storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(j9), Long.valueOf(j9 + 86400000)));
                                    z6 = storyNotification.hidden;
                                    z7 = messageObject4.isStoryPushHidden;
                                    if (z6 != z7) {
                                        storyNotification.hidden = z7;
                                        z12 = true;
                                    }
                                    storyNotification.date = storyNotification.getLeastDate();
                                    notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification);
                                    z10 = true;
                                } else {
                                    StoryNotification storyNotification3 = new StoryNotification(dialogId3, messageObject4.localName, id2, j9);
                                    storyNotification3.hidden = messageObject4.isStoryPushHidden;
                                    notificationsController2.storyPushMessages.add(storyNotification3);
                                    notificationsController2.storyPushMessagesDict.put(dialogId3, storyNotification3);
                                    notificationsController2.getMessagesStorage().putStoryPushMessage(storyNotification3);
                                    z9 = true;
                                    z12 = true;
                                }
                                Collections.sort(notificationsController2.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                                    @Override
                                    public final long applyAsLong(Object obj) {
                                        return ((NotificationsController.StoryNotification) obj).date;
                                    }
                                }));
                                z3 = z8;
                                i = i3;
                            } else {
                                if (messageObject4.isOauthPush) {
                                    message2 = messageObject4.messageOwner;
                                    if (message2 == null) {
                                        i2 = message2.id;
                                        z3 = z8;
                                        j8 = ((long) message2.date) + 60;
                                        i = i3;
                                        currentTime = ConnectionsManager.getInstance(notificationsController2.currentAccount).getCurrentTime();
                                        if (currentTime > j8) {
                                            sharedPreferences2 = notificationsSettings;
                                        } else {
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    NotificationsController.$r8$lambda$uCWKZm0vi9uhobwlW5cR7HSaokI(this.f$0, i2);
                                                }
                                            }, (j8 - currentTime) * 1000);
                                        }
                                    }
                                    notificationsSettings = sharedPreferences2;
                                } else {
                                    z3 = z8;
                                    i = i3;
                                }
                                id = messageObject4.getId();
                                if (messageObject4.isFcmMessage()) {
                                    j = messageObject4.messageOwner.random_id;
                                } else {
                                    j = 0;
                                }
                                dialogId = messageObject4.getDialogId();
                                if (messageObject4.isFcmMessage()) {
                                    z4 = messageObject4.localChannel;
                                } else if (DialogObject.isChatDialog(dialogId)) {
                                    chat = notificationsController2.getMessagesController().getChat(Long.valueOf(-dialogId));
                                    if (ChatObject.isChannel(chat)) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                if (messageObject4.isStoryReactionPush) {
                                    dialogId2 = messageObject4.getDialogId();
                                } else {
                                    j2 = messageObject4.messageOwner.peer_id.channel_id;
                                    if (j2 != 0) {
                                        dialogId2 = -j2;
                                    } else {
                                        dialogId2 = 0;
                                    }
                                }
                                sparseArray = (SparseArray) notificationsController2.pushMessagesDict.get(dialogId2);
                                if (sparseArray != null) {
                                    messageObject = (MessageObject) sparseArray.get(id);
                                } else {
                                    messageObject = null;
                                }
                                sharedPreferences = notificationsSettings;
                                if (messageObject == null) {
                                    j3 = j;
                                    j7 = messageObject4.messageOwner.random_id;
                                    if (j7 != 0) {
                                        notificationsController2.fcmRandomMessagesDict.remove(messageObject4.messageOwner.random_id);
                                    }
                                } else {
                                    j3 = j;
                                }
                                messageObject2 = messageObject;
                                if (messageObject2 != null) {
                                    if (messageObject2.isFcmMessage()) {
                                        if (sparseArray == null) {
                                            sparseArray = new SparseArray();
                                            notificationsController2.pushMessagesDict.put(dialogId2, sparseArray);
                                        }
                                        sparseArray.put(id, messageObject4);
                                        iIndexOf = notificationsController2.pushMessages.indexOf(messageObject2);
                                        if (iIndexOf >= 0) {
                                            notificationsController2.pushMessages.set(iIndexOf, messageObject4);
                                            iAddToPopupMessages = notificationsController2.addToPopupMessages(arrayList2, messageObject4, dialogId, z4, sharedPreferences);
                                            notificationsSettings = sharedPreferences;
                                        } else {
                                            notificationsSettings = sharedPreferences;
                                        }
                                        if (z) {
                                            notificationsController2.getMessagesStorage().putPushMessage(messageObject4);
                                        }
                                    } else {
                                        dialogId2 = dialogId2;
                                        notificationsSettings = sharedPreferences;
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                                    }
                                } else {
                                    notificationsSettings = sharedPreferences;
                                    j4 = dialogId2;
                                    z5 = z4;
                                    if (z10) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because edited");
                                        }
                                        sharedPreferences2 = notificationsSettings;
                                        notificationsSettings = sharedPreferences2;
                                    } else {
                                        if (z) {
                                            notificationsController2.getMessagesStorage().putPushMessage(messageObject4);
                                        }
                                        sharedPreferences2 = notificationsSettings;
                                        topicId = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject4.messageOwner, notificationsController2.getMessagesController().isForum(messageObject4));
                                        if (dialogId != notificationsController2.openedDialogId) {
                                            message = messageObject4.messageOwner;
                                            if (!message.mentioned) {
                                                if (z3) {
                                                }
                                                fromChatId = messageObject4.getFromChatId();
                                            } else {
                                                fromChatId = dialogId;
                                            }
                                            if (notificationsController2.isPersonalMessage(messageObject4)) {
                                                notificationsController2.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                            if (iIndexOfKey < 0) {
                                                j5 = fromChatId;
                                                notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences2, j5, topicId);
                                                sharedPreferences3 = sharedPreferences2;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    fromChatId = j5;
                                                    zIsGlobalNotificationsEnabled2 = notificationsController.isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                } else {
                                                    fromChatId = j5;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                zBooleanValue = zIsGlobalNotificationsEnabled2;
                                            } else {
                                                j5 = fromChatId;
                                                notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences2, j5, topicId);
                                                sharedPreferences3 = sharedPreferences2;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    fromChatId = j5;
                                                    zIsGlobalNotificationsEnabled2 = notificationsController.isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                } else {
                                                    fromChatId = j5;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                zBooleanValue = zIsGlobalNotificationsEnabled2;
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                            }
                                            notificationsController2 = notificationsController;
                                            if (zBooleanValue) {
                                                if (z) {
                                                    long j11 = fromChatId;
                                                    SharedPreferences sharedPreferences5 = sharedPreferences3;
                                                    iAddToPopupMessages = notificationsController2.addToPopupMessages(arrayList2, messageObject3, j11, z5, sharedPreferences5);
                                                    j6 = j11;
                                                    notificationsSettings = sharedPreferences5;
                                                } else {
                                                    j6 = fromChatId;
                                                    notificationsSettings = sharedPreferences3;
                                                }
                                                if (!z11) {
                                                    messageObject3 = messageObject4;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    messageObject3 = messageObject4;
                                                    z11 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                messageObject3 = messageObject4;
                                                notificationsController2.delayedPushMessages.add(messageObject3);
                                                notificationsController2.appendMessage(messageObject3);
                                                if (id != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray2 = new SparseArray();
                                                        notificationsController2.pushMessagesDict.put(j4, sparseArray2);
                                                    } else {
                                                        sparseArray2 = sparseArray;
                                                    }
                                                    sparseArray2.put(id, messageObject3);
                                                } else if (j3 != 0) {
                                                    notificationsController2.fcmRandomMessagesDict.put(j3, messageObject3);
                                                }
                                                if (dialogId != j6) {
                                                    num2 = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId);
                                                    LongSparseArray longSparseArray3 = notificationsController2.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue = 1;
                                                    } else {
                                                        iIntValue = num2.intValue() + 1;
                                                    }
                                                    longSparseArray3.put(dialogId, Integer.valueOf(iIntValue));
                                                }
                                            } else {
                                                j6 = fromChatId;
                                                messageObject3 = messageObject4;
                                                notificationsSettings = sharedPreferences3;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                                                sparseBooleanArray2.put(id, true);
                                                notificationsController2.getMessagesController().checkUnreadReactions(j6, topicId, sparseBooleanArray2);
                                            }
                                            z10 = z10;
                                            z9 = true;
                                        } else {
                                            message = messageObject4.messageOwner;
                                            if (!message.mentioned) {
                                                if (z3) {
                                                }
                                                fromChatId = messageObject4.getFromChatId();
                                            } else {
                                                fromChatId = dialogId;
                                            }
                                            if (notificationsController2.isPersonalMessage(messageObject4)) {
                                                notificationsController2.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                            if (iIndexOfKey < 0) {
                                                j5 = fromChatId;
                                                notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences2, j5, topicId);
                                                sharedPreferences3 = sharedPreferences2;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    fromChatId = j5;
                                                    zIsGlobalNotificationsEnabled2 = notificationsController.isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                } else {
                                                    fromChatId = j5;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                zBooleanValue = zIsGlobalNotificationsEnabled2;
                                            } else {
                                                j5 = fromChatId;
                                                notifyOverride = notificationsController2.getNotifyOverride(sharedPreferences2, j5, topicId);
                                                sharedPreferences3 = sharedPreferences2;
                                                topicId = topicId;
                                                if (notifyOverride == -1) {
                                                    fromChatId = j5;
                                                    zIsGlobalNotificationsEnabled2 = notificationsController.isGlobalNotificationsEnabled(fromChatId, Boolean.valueOf(z5), messageObject4.isReactionPush, messageObject4.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.d("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ") = " + zIsGlobalNotificationsEnabled2);
                                                    }
                                                } else {
                                                    fromChatId = j5;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                zBooleanValue = zIsGlobalNotificationsEnabled2;
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zBooleanValue + " (" + fromChatId + ", " + z5 + ", " + messageObject4.isReactionPush + ", " + messageObject4.isStoryReactionPush + ")");
                                            }
                                            notificationsController2 = notificationsController;
                                            if (zBooleanValue) {
                                                if (z) {
                                                    long j12 = fromChatId;
                                                    SharedPreferences sharedPreferences6 = sharedPreferences3;
                                                    iAddToPopupMessages = notificationsController2.addToPopupMessages(arrayList2, messageObject3, j12, z5, sharedPreferences6);
                                                    j6 = j12;
                                                    notificationsSettings = sharedPreferences6;
                                                } else {
                                                    j6 = fromChatId;
                                                    notificationsSettings = sharedPreferences3;
                                                }
                                                if (!z11) {
                                                    messageObject3 = messageObject4;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    messageObject3 = messageObject4;
                                                    z11 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                messageObject3 = messageObject4;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                messageObject3 = messageObject4;
                                                notificationsController2.delayedPushMessages.add(messageObject3);
                                                notificationsController2.appendMessage(messageObject3);
                                                if (id != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray2 = new SparseArray();
                                                        notificationsController2.pushMessagesDict.put(j4, sparseArray2);
                                                    } else {
                                                        sparseArray2 = sparseArray;
                                                    }
                                                    sparseArray2.put(id, messageObject3);
                                                } else if (j3 != 0) {
                                                    notificationsController2.fcmRandomMessagesDict.put(j3, messageObject3);
                                                }
                                                if (dialogId != j6) {
                                                    num2 = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId);
                                                    LongSparseArray longSparseArray4 = notificationsController2.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue = 1;
                                                    } else {
                                                        iIntValue = num2.intValue() + 1;
                                                    }
                                                    longSparseArray4.put(dialogId, Integer.valueOf(iIntValue));
                                                }
                                            } else {
                                                j6 = fromChatId;
                                                messageObject3 = messageObject4;
                                                notificationsSettings = sharedPreferences3;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
                                                sparseBooleanArray3.put(id, true);
                                                notificationsController2.getMessagesController().checkUnreadReactions(j6, topicId, sparseBooleanArray3);
                                            }
                                            z10 = z10;
                                            z9 = true;
                                        }
                                    }
                                }
                            }
                        }
                        sharedPreferences2 = notificationsSettings;
                        z3 = z8;
                        i = i3;
                        notificationsSettings = sharedPreferences2;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("skipped message because 1");
                }
                sharedPreferences2 = notificationsSettings;
                z3 = z8;
                i = i3;
                notificationsSettings = sharedPreferences2;
            }
            i3 = i + 1;
            z8 = z3;
        }
        final int i4 = iAddToPopupMessages;
        boolean z13 = z10;
        if (z9) {
            notificationsController2.notifyCheck = z2;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$bUCpxV4xLTOCbOHcVuSRPm214lI(this.f$0, arrayList2, i4);
                }
            });
        }
        if (z || z11) {
            if (z13) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + notificationsController2.notifyCheck);
                }
                notificationsController2.delayedPushMessages.clear();
                notificationsController2.showOrUpdateNotification(notificationsController2.notifyCheck);
            } else if (z9) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject5 = (MessageObject) arrayList.get(0);
                long dialogId4 = messageObject5.getDialogId();
                long topicId2 = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject5.messageOwner, notificationsController2.getMessagesController().isForum(dialogId4));
                Boolean boolValueOf = messageObject5.isFcmMessage() ? Boolean.valueOf(messageObject5.localChannel) : null;
                int i5 = notificationsController2.total_unread_count;
                int notifyOverride2 = notificationsController2.getNotifyOverride(notificationsSettings, dialogId4, topicId2);
                if (notifyOverride2 == -1) {
                    notificationsController2 = notificationsController;
                    zIsGlobalNotificationsEnabled = notificationsController2.isGlobalNotificationsEnabled(dialogId4, boolValueOf, messageObject5.isReactionPush, messageObject5.isStoryReactionPush);
                    dialogId4 = dialogId4;
                } else {
                    notificationsController2 = notificationsController;
                    zIsGlobalNotificationsEnabled = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) notificationsController2.pushDialogs.get(dialogId4);
                int iIntValue2 = num3 != null ? num3.intValue() + 1 : 1;
                if (notificationsController2.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId4)) != null && num.intValue() != 0) {
                    iIntValue2 = num.intValue();
                    zIsGlobalNotificationsEnabled = true;
                }
                if (zIsGlobalNotificationsEnabled && !messageObject5.isStoryPush) {
                    if (!notificationsController2.getMessagesController().isCommunity(dialogId4)) {
                        if (notificationsController2.getMessagesController().isForum(dialogId4)) {
                            int i6 = notificationsController2.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                            notificationsController2.total_unread_count = i6;
                            notificationsController2.total_unread_count = i6 + (iIntValue2 > 0 ? 1 : 0);
                        } else {
                            if (num3 != null) {
                                notificationsController2.total_unread_count -= num3.intValue();
                            }
                            notificationsController2.total_unread_count += iIntValue2;
                        }
                    }
                    notificationsController2.pushDialogs.put(dialogId4, Integer.valueOf(iIntValue2));
                }
                if (i5 != notificationsController2.total_unread_count || z12) {
                    notificationsController2.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + notificationsController2.notifyCheck);
                    }
                    notificationsController2.showOrUpdateNotification(notificationsController2.notifyCheck);
                    final int size = notificationsController2.pushDialogs.size();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            NotificationsController.m945$r8$lambda$BpOgJyPo1GDwY3RPWlPuboZ3ZA(this.f$0, size);
                        }
                    });
                }
                notificationsController2.notifyCheck = false;
                if (notificationsController2.showBadgeNumber) {
                    notificationsController2.setBadge(notificationsController2.getTotalAllUnreadCount());
                }
            }
        }
        if (z12) {
            notificationsController2.updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void $r8$lambda$uCWKZm0vi9uhobwlW5cR7HSaokI(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        LongSparseArray longSparseArray = new LongSparseArray();
        longSparseArray.put(0L, Lists.newArrayList(Integer.valueOf(i)));
        notificationsController.removeDeletedMessagesFromNotifications(longSparseArray, false);
    }

    public static void $r8$lambda$bUCpxV4xLTOCbOHcVuSRPm214lI(NotificationsController notificationsController, ArrayList arrayList, int i) {
        notificationsController.popupMessages.addAll(0, arrayList);
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            if (i == 3 || ((i == 1 && ApplicationLoader.isScreenOn) || (i == 2 && !ApplicationLoader.isScreenOn))) {
                Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) PopupNotificationActivity.class);
                intent.setFlags(268763140);
                try {
                    ApplicationLoader.applicationContext.startActivity(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void m945$r8$lambda$BpOgJyPo1GDwY3RPWlPuboZ3ZA(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    private void appendMessage(MessageObject messageObject) {
        for (int i = 0; i < this.pushMessages.size(); i++) {
            if (this.pushMessages.get(i).getId() == messageObject.getId() && this.pushMessages.get(i).getDialogId() == messageObject.getDialogId() && this.pushMessages.get(i).isStoryPush == messageObject.isStoryPush) {
                return;
            }
        }
        this.pushMessages.add(0, messageObject);
    }

    public int getTotalUnreadCount() {
        return this.total_unread_count;
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList();
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m944$r8$lambda$ALMGl2KEmzFLTKmQWGOoXdAJO4(this.f$0, longSparseIntArray, arrayList);
            }
        });
    }

    public static void m944$r8$lambda$ALMGl2KEmzFLTKmQWGOoXdAJO4(final NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        int iIntValue;
        boolean z;
        boolean zIsGlobalNotificationsEnabled;
        int i;
        int i2;
        MessageObject messageObject;
        Integer num;
        int i3 = notificationsController.total_unread_count;
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        int i4 = 0;
        while (true) {
            if (i4 >= longSparseIntArray.size()) {
                break;
            }
            long jKeyAt = longSparseIntArray.keyAt(i4);
            Integer num2 = (Integer) notificationsController.pushDialogs.get(jKeyAt);
            int i5 = longSparseIntArray.get(jKeyAt);
            if (DialogObject.isChatDialog(jKeyAt)) {
                TLRPC.Chat chat = notificationsController.getMessagesController().getChat(Long.valueOf(-jKeyAt));
                if (chat == null || chat.min || ChatObject.isNotInChat(chat) || ChatObject.isCommunity(chat)) {
                    i5 = 0;
                }
                if (chat != null) {
                    z = chat.forum;
                    iIntValue = i5;
                } else {
                    iIntValue = i5;
                    z = false;
                }
            } else {
                iIntValue = i5;
                z = false;
            }
            if (z) {
                zIsGlobalNotificationsEnabled = true;
            } else {
                int notifyOverride = notificationsController.getNotifyOverride(notificationsSettings, jKeyAt, 0L);
                if (notifyOverride == -1) {
                    zIsGlobalNotificationsEnabled = notificationsController.isGlobalNotificationsEnabled(jKeyAt, false, false);
                } else if (notifyOverride != 2) {
                    zIsGlobalNotificationsEnabled = true;
                } else {
                    zIsGlobalNotificationsEnabled = false;
                }
            }
            if (notificationsController.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) notificationsController.pushDialogsOverrideMention.get(jKeyAt)) != null && num.intValue() != 0) {
                iIntValue = num.intValue();
                zIsGlobalNotificationsEnabled = true;
            }
            if (iIntValue == 0) {
                notificationsController.smartNotificationsDialogs.remove(jKeyAt);
            }
            if (iIntValue >= 0) {
                if ((!zIsGlobalNotificationsEnabled || iIntValue == 0) && num2 != null) {
                    if (notificationsController.getMessagesController().isForum(jKeyAt)) {
                        int i6 = notificationsController.total_unread_count;
                        if (num2.intValue() > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        notificationsController.total_unread_count = i6 - i;
                    } else {
                        notificationsController.total_unread_count -= num2.intValue();
                    }
                }
                if (iIntValue == 0) {
                    notificationsController.pushDialogs.remove(jKeyAt);
                    notificationsController.pushDialogsOverrideMention.remove(jKeyAt);
                    i2 = 0;
                    while (i2 < notificationsController.pushMessages.size()) {
                        messageObject = notificationsController.pushMessages.get(i2);
                        if (messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && !messageObject.isStoryReactionPush) {
                            if (notificationsController.isPersonalMessage(messageObject)) {
                                notificationsController.personalCount--;
                            }
                            notificationsController.pushMessages.remove(i2);
                            i2--;
                            notificationsController.delayedPushMessages.remove(messageObject);
                            long j = messageObject.messageOwner.peer_id.channel_id;
                            long j2 = j != 0 ? -j : 0L;
                            SparseArray sparseArray = (SparseArray) notificationsController.pushMessagesDict.get(j2);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject.getId());
                                if (sparseArray.size() == 0) {
                                    notificationsController.pushMessagesDict.remove(j2);
                                }
                            }
                            arrayList.add(messageObject);
                        }
                        i2++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!notificationsController.getMessagesController().isCommunity(jKeyAt)) {
                        if (notificationsController.getMessagesController().isForum(jKeyAt)) {
                            notificationsController.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            notificationsController.total_unread_count += iIntValue;
                        }
                    }
                    notificationsController.pushDialogs.put(jKeyAt, Integer.valueOf(iIntValue));
                }
            } else if (num2 != null) {
                iIntValue += num2.intValue();
                if (!zIsGlobalNotificationsEnabled) {
                    if (notificationsController.getMessagesController().isForum(jKeyAt)) {
                        int i7 = notificationsController.total_unread_count;
                        if (num2.intValue() > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        notificationsController.total_unread_count = i7 - i;
                    } else {
                        notificationsController.total_unread_count -= num2.intValue();
                    }
                } else if (notificationsController.getMessagesController().isForum(jKeyAt)) {
                    int i8 = notificationsController.total_unread_count;
                    if (num2.intValue() > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    notificationsController.total_unread_count = i8 - i;
                } else {
                    notificationsController.total_unread_count -= num2.intValue();
                }
                if (iIntValue == 0) {
                    notificationsController.pushDialogs.remove(jKeyAt);
                    notificationsController.pushDialogsOverrideMention.remove(jKeyAt);
                    i2 = 0;
                    while (i2 < notificationsController.pushMessages.size()) {
                        messageObject = notificationsController.pushMessages.get(i2);
                        if (messageObject.messageOwner.from_scheduled) {
                        }
                        i2++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!notificationsController.getMessagesController().isCommunity(jKeyAt)) {
                        if (notificationsController.getMessagesController().isForum(jKeyAt)) {
                            notificationsController.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            notificationsController.total_unread_count += iIntValue;
                        }
                    }
                    notificationsController.pushDialogs.put(jKeyAt, Integer.valueOf(iIntValue));
                }
            }
            i4++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.m963$r8$lambda$wYml7LEGBP9OwuBBoiGkG0553g(this.f$0, arrayList);
                }
            });
        }
        if (i3 != notificationsController.total_unread_count) {
            if (!notificationsController.notifyCheck) {
                notificationsController.delayedPushMessages.clear();
                notificationsController.showOrUpdateNotification(notificationsController.notifyCheck);
            } else {
                notificationsController.scheduleNotificationDelay(notificationsController.lastOnlineFromOtherDevice > notificationsController.getConnectionsManager().getCurrentTime());
            }
            final int size = notificationsController.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.m959$r8$lambda$kWgqnzNS4Zr6gXPTRz6HG3Lm0Y(this.f$0, size);
                }
            });
        }
        notificationsController.notifyCheck = false;
        if (notificationsController.showBadgeNumber) {
            notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
        }
    }

    public static void m963$r8$lambda$wYml7LEGBP9OwuBBoiGkG0553g(NotificationsController notificationsController, ArrayList arrayList) {
        notificationsController.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            notificationsController.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public static void m959$r8$lambda$kWgqnzNS4Zr6gXPTRz6HG3Lm0Y(NotificationsController notificationsController, int i) {
        notificationsController.getClass();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processLoadedUnreadMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, final Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$B_N0ijfPmJGf_Z8SKBJyDCbKwA8(this.f$0, arrayList, longSparseArray, arrayList2, collection);
            }
        });
    }

    public static void $r8$lambda$B_N0ijfPmJGf_Z8SKBJyDCbKwA8(NotificationsController notificationsController, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
        long j;
        boolean zIsGlobalNotificationsEnabled;
        long dialogId;
        SharedPreferences sharedPreferences;
        long j2;
        boolean zIsGlobalNotificationsEnabled2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j3;
        long j4;
        TLRPC.Message message;
        boolean zIsGlobalNotificationsEnabled3;
        SharedPreferences sharedPreferences2;
        final NotificationsController notificationsController2 = notificationsController;
        ArrayList arrayList3 = arrayList;
        notificationsController2.pushDialogs.clear();
        notificationsController2.pushMessages.clear();
        notificationsController2.pushMessagesDict.clear();
        notificationsController2.storyPushMessages.clear();
        notificationsController2.storyPushMessagesDict.clear();
        boolean z = false;
        notificationsController2.total_unread_count = 0;
        notificationsController2.personalCount = 0;
        SharedPreferences notificationsSettings = notificationsController2.getAccountInstance().getNotificationsSettings();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        long j5 = 0;
        if (arrayList3 != null) {
            int i = 0;
            while (i < arrayList3.size()) {
                TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i);
                if (message2 != null && ((messageFwdHeader = message2.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message2.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) || (message2.silent && ((messageAction instanceof TLRPC.TL_messageActionContactSignUp) || (messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        sharedPreferences2 = notificationsSettings;
                        i = i;
                        j3 = j5;
                    } else {
                        long j6 = message2.peer_id.channel_id;
                        long j7 = j6 != j5 ? -j6 : j5;
                        SparseArray sparseArray = (SparseArray) notificationsController2.pushMessagesDict.get(j7);
                        j3 = j5;
                        if (sparseArray == null || sparseArray.indexOfKey(message2.id) < 0) {
                            MessageObject messageObject = new MessageObject(notificationsController2.currentAccount, message2, z, z);
                            if (notificationsController2.isPersonalMessage(messageObject)) {
                                notificationsController2.personalCount++;
                            }
                            long dialogId2 = messageObject.getDialogId();
                            long topicId = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject.messageOwner, notificationsController.getMessagesController().isForum(messageObject));
                            long fromChatId = messageObject.messageOwner.mentioned ? messageObject.getFromChatId() : dialogId2;
                            int iIndexOfKey = longSparseArray2.indexOfKey(fromChatId);
                            if (iIndexOfKey >= 0 && topicId == j3) {
                                j4 = fromChatId;
                                zIsGlobalNotificationsEnabled3 = ((Boolean) longSparseArray2.valueAt(iIndexOfKey)).booleanValue();
                                message = message2;
                                notificationsController2 = notificationsController;
                            } else {
                                notificationsController2 = notificationsController;
                                int notifyOverride = notificationsController2.getNotifyOverride(notificationsSettings, fromChatId, topicId);
                                j4 = fromChatId;
                                if (notifyOverride == -1) {
                                    zIsGlobalNotificationsEnabled3 = notificationsController2.isGlobalNotificationsEnabled(j4, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                                    message = message2;
                                } else if (notifyOverride != 2) {
                                    message = message2;
                                    zIsGlobalNotificationsEnabled3 = true;
                                } else {
                                    message = message2;
                                    zIsGlobalNotificationsEnabled3 = false;
                                }
                                longSparseArray2.put(j4, Boolean.valueOf(zIsGlobalNotificationsEnabled3));
                            }
                            sharedPreferences2 = notificationsSettings;
                            if (zIsGlobalNotificationsEnabled3 && (j4 != notificationsController2.openedDialogId || !ApplicationLoader.isScreenOn)) {
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    notificationsController2.pushMessagesDict.put(j7, sparseArray);
                                }
                                sparseArray.put(message.id, messageObject);
                                notificationsController2.appendMessage(messageObject);
                                if (dialogId2 != j4) {
                                    Integer num = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId2);
                                    notificationsController2.pushDialogsOverrideMention.put(dialogId2, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                                }
                            }
                        } else {
                            sharedPreferences2 = notificationsSettings;
                            i = i;
                        }
                    }
                } else {
                    sharedPreferences2 = notificationsSettings;
                    i = i;
                    j3 = j5;
                }
                i++;
                arrayList3 = arrayList;
                notificationsSettings = sharedPreferences2;
                j5 = j3;
                z = false;
            }
        }
        SharedPreferences sharedPreferences3 = notificationsSettings;
        long j8 = j5;
        int i2 = 0;
        while (i2 < longSparseArray.size()) {
            long jKeyAt = longSparseArray.keyAt(i2);
            int iIndexOfKey2 = longSparseArray2.indexOfKey(jKeyAt);
            if (iIndexOfKey2 >= 0) {
                j2 = jKeyAt;
                zIsGlobalNotificationsEnabled2 = ((Boolean) longSparseArray2.valueAt(iIndexOfKey2)).booleanValue();
                sharedPreferences = sharedPreferences3;
            } else {
                sharedPreferences = sharedPreferences3;
                int notifyOverride2 = notificationsController2.getNotifyOverride(sharedPreferences, jKeyAt, 0L);
                j2 = jKeyAt;
                if (notifyOverride2 == -1) {
                    zIsGlobalNotificationsEnabled2 = notificationsController2.isGlobalNotificationsEnabled(j2, false, false);
                } else {
                    zIsGlobalNotificationsEnabled2 = notifyOverride2 != 2;
                }
                longSparseArray2.put(j2, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
            }
            if (zIsGlobalNotificationsEnabled2) {
                Integer num2 = (Integer) longSparseArray.valueAt(i2);
                int iIntValue = num2.intValue();
                notificationsController2.pushDialogs.put(j2, num2);
                if (!notificationsController2.getMessagesController().isCommunity(j2)) {
                    if (notificationsController2.getMessagesController().isForum(j2)) {
                        notificationsController2.total_unread_count += iIntValue > 0 ? 1 : 0;
                    } else {
                        notificationsController2.total_unread_count += iIntValue;
                    }
                }
            }
            i2++;
            sharedPreferences3 = sharedPreferences;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences3;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i3);
                int id = messageObject2.getId();
                if (notificationsController2.pushMessagesDict.indexOfKey(id) < 0) {
                    if (notificationsController2.isPersonalMessage(messageObject2)) {
                        notificationsController2.personalCount++;
                    }
                    long dialogId3 = messageObject2.getDialogId();
                    long topicId2 = MessageObject.getTopicId(notificationsController2.currentAccount, messageObject2.messageOwner, notificationsController2.getMessagesController().isForum(messageObject2));
                    TLRPC.Message message3 = messageObject2.messageOwner;
                    long j9 = message3.random_id;
                    long fromChatId2 = message3.mentioned ? messageObject2.getFromChatId() : dialogId3;
                    int iIndexOfKey3 = longSparseArray2.indexOfKey(fromChatId2);
                    if (iIndexOfKey3 >= 0 && topicId2 == j8) {
                        zIsGlobalNotificationsEnabled = ((Boolean) longSparseArray2.valueAt(iIndexOfKey3)).booleanValue();
                        j = fromChatId2;
                    } else {
                        int notifyOverride3 = notificationsController2.getNotifyOverride(sharedPreferences4, fromChatId2, topicId2);
                        j = fromChatId2;
                        if (notifyOverride3 == -1) {
                            zIsGlobalNotificationsEnabled = notificationsController2.isGlobalNotificationsEnabled(j, messageObject2.isReactionPush, messageObject2.isStoryReactionPush);
                        } else {
                            zIsGlobalNotificationsEnabled = notifyOverride3 != 2;
                        }
                        longSparseArray2.put(j, Boolean.valueOf(zIsGlobalNotificationsEnabled));
                    }
                    if (zIsGlobalNotificationsEnabled && (j != notificationsController2.openedDialogId || !ApplicationLoader.isScreenOn)) {
                        if (id != 0) {
                            if (messageObject2.isStoryReactionPush) {
                                dialogId = messageObject2.getDialogId();
                            } else {
                                long j10 = messageObject2.messageOwner.peer_id.channel_id;
                                dialogId = j10 != j8 ? -j10 : j8;
                            }
                            SparseArray sparseArray2 = (SparseArray) notificationsController2.pushMessagesDict.get(dialogId);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                notificationsController2.pushMessagesDict.put(dialogId, sparseArray2);
                            }
                            sparseArray2.put(id, messageObject2);
                        } else if (j9 != j8) {
                            notificationsController2.fcmRandomMessagesDict.put(j9, messageObject2);
                        }
                        notificationsController2.appendMessage(messageObject2);
                        if (dialogId3 != j) {
                            Integer num3 = (Integer) notificationsController2.pushDialogsOverrideMention.get(dialogId3);
                            notificationsController2.pushDialogsOverrideMention.put(dialogId3, Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1));
                        }
                        Integer num4 = (Integer) notificationsController2.pushDialogs.get(j);
                        int iIntValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (!notificationsController2.getMessagesController().isCommunity(j)) {
                            if (notificationsController2.getMessagesController().isForum(j)) {
                                if (num4 != null) {
                                    notificationsController2.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                                }
                                notificationsController2.total_unread_count += iIntValue2 > 0 ? 1 : 0;
                            } else {
                                if (num4 != null) {
                                    notificationsController2.total_unread_count -= num4.intValue();
                                }
                                notificationsController2.total_unread_count += iIntValue2;
                            }
                        }
                        notificationsController2.pushDialogs.put(j, Integer.valueOf(iIntValue2));
                    }
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j11 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) notificationsController2.storyPushMessagesDict.get(j11);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    notificationsController2.storyPushMessages.add(storyNotification);
                    notificationsController2.storyPushMessagesDict.put(j11, storyNotification);
                }
            }
            Collections.sort(notificationsController2.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                @Override
                public final long applyAsLong(Object obj) {
                    return ((NotificationsController.StoryNotification) obj).date;
                }
            }));
        }
        final int size = notificationsController2.pushDialogs.size();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.m948$r8$lambda$RyBK0NfdMZxyaUBSyeUzVqpw0(this.f$0, size);
            }
        });
        notificationsController2.showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (notificationsController2.showBadgeNumber) {
            notificationsController2.setBadge(notificationsController2.getTotalAllUnreadCount());
        }
    }

    public static void m948$r8$lambda$RyBK0NfdMZxyaUBSyeUzVqpw0(NotificationsController notificationsController, int i) {
        if (notificationsController.total_unread_count == 0) {
            notificationsController.popupMessages.clear();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.notificationsCountUpdated, Integer.valueOf(notificationsController.currentAccount));
        notificationsController.getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    private int getTotalAllUnreadCount() {
        int size;
        int dialogUnreadCount = 0;
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated() && (SharedConfig.showNotificationsForAllAccounts || UserConfig.selectedAccount == i)) {
                NotificationsController notificationsController = getInstance(i);
                if (notificationsController.showBadgeNumber) {
                    if (notificationsController.showBadgeMessages) {
                        if (notificationsController.showBadgeMuted) {
                            try {
                                ArrayList arrayList = new ArrayList(MessagesController.getInstance(i).allDialogs);
                                int size2 = arrayList.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
                                    if (dialog != null && DialogObject.isChatDialog(dialog.id)) {
                                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-dialog.id));
                                        if (!ChatObject.isNotInChat(chat) && !ChatObject.isCommunity(chat)) {
                                            if (dialog != null) {
                                                dialogUnreadCount += MessagesController.getInstance(i).getDialogUnreadCount(dialog);
                                            }
                                        }
                                    } else if (dialog != null) {
                                        dialogUnreadCount += MessagesController.getInstance(i).getDialogUnreadCount(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else {
                            size = notificationsController.total_unread_count;
                            dialogUnreadCount += size;
                        }
                    } else if (notificationsController.showBadgeMuted) {
                        try {
                            int size3 = MessagesController.getInstance(i).allDialogs.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                TLRPC.Dialog dialog2 = MessagesController.getInstance(i).allDialogs.get(i3);
                                if (DialogObject.isChatDialog(dialog2.id)) {
                                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-dialog2.id));
                                    if (!ChatObject.isNotInChat(chat2) && !ChatObject.isCommunity(chat2)) {
                                        if (MessagesController.getInstance(i).getDialogUnreadCount(dialog2) != 0) {
                                            dialogUnreadCount++;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i).getDialogUnreadCount(dialog2) != 0) {
                                    dialogUnreadCount++;
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e((Throwable) e2, false);
                        }
                    } else {
                        size = notificationsController.pushDialogs.size();
                        dialogUnreadCount += size;
                    }
                }
            }
        }
        return dialogUnreadCount;
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController notificationsController = this.f$0;
                notificationsController.setBadge(notificationsController.getTotalAllUnreadCount());
            }
        });
    }

    public void setBadge(int i) {
        if (this.lastBadgeCount == i) {
            return;
        }
        FileLog.d("setBadge " + i);
        this.lastBadgeCount = i;
        NotificationBadge.applyCount(i);
    }

    public java.lang.String getShortStringForMessage(org.telegram.messenger.MessageObject r30, java.lang.String[] r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.getShortStringForMessage(org.telegram.messenger.MessageObject, java.lang.String[], boolean[]):java.lang.String");
    }

    private String replaceSpoilers(MessageObject messageObject) {
        TLRPC.Message message;
        String str;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (messageObject.didSpoilLoginCode()) {
            return sb.toString();
        }
        for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
            if (messageObject.messageOwner.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) messageObject.messageOwner.entities.get(i);
                for (int i2 = 0; i2 < tL_messageEntitySpoiler.length; i2++) {
                    int i3 = tL_messageEntitySpoiler.offset + i2;
                    char[] cArr = this.spoilerChars;
                    sb.setCharAt(i3, cArr[i2 % cArr.length]);
                }
            }
        }
        return sb.toString();
    }

    private String getStringForMessage(MessageObject messageObject, boolean z, boolean[] zArr, boolean[] zArr2) {
        SharedPreferences sharedPreferences;
        String string;
        TLRPC.Chat chat;
        char c;
        char c2;
        char c3;
        boolean z2;
        String string2;
        String userName;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (messageObject.isStoryPush || messageObject.isStoryMentionPush) {
            return "!" + messageObject.messageOwner.message;
        }
        TLRPC.Message message = messageObject.messageOwner;
        long j = message.dialog_id;
        TLRPC.Peer peer = message.peer_id;
        long j2 = peer.chat_id;
        if (j2 == 0) {
            j2 = peer.channel_id;
        }
        long fromChatId = peer.user_id;
        if (zArr2 != null) {
            zArr2[0] = true;
        }
        if (messageObject.getDialogId() == 489000 && messageObject.getForwardedFromId() != null) {
            fromChatId = messageObject.getForwardedFromId().longValue();
            j2 = fromChatId < 0 ? -fromChatId : 0L;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z3 = notificationsSettings.getBoolean("content_preview_" + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && fromChatId != 0) {
                if (!z3 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
                }
            } else if (j2 != 0 && (!z3 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return (messageObject.messageOwner.peer_id.channel_id == 0 || messageObject.isSupergroup()) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, messageObject.localUserName, messageObject.localName) : LocaleController.formatString(R.string.ChannelMessageNoText, messageObject.localName);
            }
            zArr[0] = true;
            return (String) messageObject.messageText;
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (fromChatId == 0) {
            fromChatId = messageObject.getFromChatId();
            if (fromChatId == 0) {
                fromChatId = -j2;
            }
        } else if (fromChatId == clientUserId) {
            fromChatId = messageObject.getFromChatId();
        }
        if (j == 0) {
            if (j2 != 0) {
                j = -j2;
            } else if (fromChatId != 0) {
                j = fromChatId;
            }
        }
        if (messageObject.getDialogId() == 489001 || messageObject.isOauthPush) {
            sharedPreferences = notificationsSettings;
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (fromChatId > 0) {
            if (!messageObject.messageOwner.from_scheduled) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    userName = UserObject.getUserName(user);
                } else {
                    sharedPreferences = notificationsSettings;
                }
            } else if (j == clientUserId) {
                userName = LocaleController.getString(R.string.MessageScheduledReminderNotification);
            } else {
                userName = LocaleController.getString(R.string.NotificationMessageScheduledName);
            }
            string = userName;
            sharedPreferences = notificationsSettings;
        } else {
            sharedPreferences = notificationsSettings;
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-fromChatId));
            string = chat2 != null ? getTitle(chat2) : null;
        }
        if (string == null) {
            return null;
        }
        if (j2 != 0) {
            chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat == null) {
                return null;
            }
        } else {
            chat = null;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        String str = string;
        if (j2 == 0 && fromChatId != 0) {
            if (!z3 || !sharedPreferences.getBoolean("EnablePreviewAll", true)) {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                return LocaleController.formatString(R.string.NotificationMessageNoText, str);
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 instanceof TLRPC.TL_messageService) {
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
                    return LocaleController.formatString(R.string.NotificationContactJoined, str);
                }
                if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                    return LocaleController.formatString(R.string.NotificationContactNewPhoto, str);
                }
                if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                    String string3 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(((long) messageObject.messageOwner.date) * 1000), LocaleController.getInstance().getFormatterDay().format(((long) messageObject.messageOwner.date) * 1000));
                    int i = R.string.NotificationUnrecognizedDevice;
                    String str2 = getUserConfig().getCurrentUser().first_name;
                    TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                    return LocaleController.formatString(i, str2, string3, messageAction2.title, messageAction2.address);
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
                    if (messageAction.video) {
                        return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                    }
                    return LocaleController.getString(R.string.CallMessageIncomingMissed);
                }
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    if (messageAction.video) {
                        return LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed);
                    }
                    return LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
                }
                if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                    String themeEmoticonOrGiftTitle = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                    if (!TextUtils.isEmpty(themeEmoticonOrGiftTitle)) {
                        c3 = 0;
                        z2 = true;
                        if (j == clientUserId) {
                            string2 = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                        } else {
                            string2 = LocaleController.formatString(R.string.ChatThemeChangedTo, str, themeEmoticonOrGiftTitle);
                        }
                    } else if (j == clientUserId) {
                        c3 = 0;
                        string2 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                        z2 = true;
                    } else {
                        c3 = 0;
                        z2 = true;
                        string2 = LocaleController.formatString(R.string.ChatThemeDisabled, str, themeEmoticonOrGiftTitle);
                    }
                    zArr[c3] = z2;
                    return string2;
                }
            } else {
                if (messageObject.isMediaEmpty()) {
                    if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String string4 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return string4;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, str);
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                if (message3.media instanceof TLRPC.TL_messageMediaPhoto) {
                    if (z || TextUtils.isEmpty(message3.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDPhoto, str) : LocaleController.formatString(R.string.NotificationMessagePhoto, str);
                    }
                    String string5 = LocaleController.formatString(R.string.NotificationMessageText, str, "🖼 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string5;
                }
                if (messageObject.isVideo()) {
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return messageObject.messageOwner.media.ttl_seconds != 0 ? LocaleController.formatString(R.string.NotificationMessageSDVideo, str) : LocaleController.formatString(R.string.NotificationMessageVideo, str);
                    }
                    String string6 = LocaleController.formatString(R.string.NotificationMessageText, str, "📹 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string6;
                }
                if (messageObject.isGame()) {
                    return LocaleController.formatString(R.string.NotificationMessageGame, str, messageObject.messageOwner.media.game.title);
                }
                if (messageObject.isVoice()) {
                    return LocaleController.formatString(R.string.NotificationMessageAudio, str);
                }
                if (messageObject.isRoundVideo()) {
                    return LocaleController.formatString(R.string.NotificationMessageRound, str);
                }
                if (messageObject.isMusic()) {
                    return LocaleController.formatString(R.string.NotificationMessageMusic, str);
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageContact2, str, ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                    TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                    return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, str, Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    return poll.quiz ? LocaleController.formatString(R.string.NotificationMessageQuiz2, str, poll.question.text) : LocaleController.formatString(R.string.NotificationMessagePoll2, str, poll.question.text);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    return LocaleController.formatString(R.string.NotificationMessageTodo2, str, ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                }
                if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return LocaleController.formatString(R.string.NotificationMessageMap, str);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                    return LocaleController.formatString(R.string.NotificationMessageLiveLocation, str);
                }
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                        String stickerEmoji = messageObject.getStickerEmoji();
                        return stickerEmoji != null ? LocaleController.formatString(R.string.NotificationMessageStickerEmoji, str, stickerEmoji) : LocaleController.formatString(R.string.NotificationMessageSticker, str);
                    }
                    if (messageObject.isGif()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGif, str);
                        }
                        String string7 = LocaleController.formatString(R.string.NotificationMessageText, str, "🎬 " + messageObject.messageOwner.message);
                        zArr[0] = true;
                        return string7;
                    }
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageDocument, str);
                    }
                    String string8 = LocaleController.formatString(R.string.NotificationMessageText, str, "📎 " + messageObject.messageOwner.message);
                    zArr[0] = true;
                    return string8;
                }
                if (z || TextUtils.isEmpty(messageObject.messageText)) {
                    return LocaleController.formatString(R.string.NotificationMessageNoText, str);
                }
                String string9 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageText);
                zArr[0] = true;
                return string9;
            }
        } else if (j2 != 0) {
            boolean z4 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z3 && ((!z4 && sharedPreferences.getBoolean("EnablePreviewGroup", true)) || (z4 && sharedPreferences.getBoolean("EnablePreviewChannel", true)))) {
                TLRPC.Message message4 = messageObject.messageOwner;
                if (message4 instanceof TLRPC.TL_messageService) {
                    TLRPC.MessageAction messageAction3 = message4.action;
                    if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                        long jLongValue = messageAction3.user_id;
                        if (jLongValue == 0 && messageAction3.users.size() == 1) {
                            jLongValue = messageObject.messageOwner.action.users.get(0).longValue();
                        }
                        if (jLongValue != 0) {
                            if (messageObject.messageOwner.peer_id.channel_id != 0 && !chat.megagroup) {
                                return LocaleController.formatString(R.string.ChannelAddedByNotification, str, getTitle(chat));
                            }
                            if (jLongValue == clientUserId) {
                                return LocaleController.formatString(R.string.NotificationInvitedToGroup, str, getTitle(chat));
                            }
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(jLongValue));
                            if (user2 == null) {
                                return null;
                            }
                            if (fromChatId == user2.id) {
                                return chat.megagroup ? LocaleController.formatString(R.string.NotificationGroupAddSelfMega, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupAddSelf, str, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationGroupAddMember, str, getTitle(chat), UserObject.getUserName(user2));
                        }
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < messageObject.messageOwner.action.users.size(); i2++) {
                            TLRPC.User user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i2));
                            if (user3 != null) {
                                String userName2 = UserObject.getUserName(user3);
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(userName2);
                            }
                        }
                        return LocaleController.formatString(R.string.NotificationGroupAddMember, str, getTitle(chat), sb.toString());
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                        return messageAction3.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, str, getTitle(chat));
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
                                return LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, str, getTitle(chat));
                            }
                            TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(jLongValue2));
                            if (user4 == null) {
                                return null;
                            }
                            return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, str, getTitle(chat), UserObject.getUserName(user4));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < messageObject.messageOwner.action.users.size(); i3++) {
                            TLRPC.User user5 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i3));
                            if (user5 != null) {
                                String userName3 = UserObject.getUserName(user5);
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(userName3);
                            }
                        }
                        return LocaleController.formatString(R.string.NotificationGroupInvitedToCall, str, getTitle(chat), sb2.toString());
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction3;
                        TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                        String title = chat3 == null ? null : getTitle(chat3);
                        return title == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                        return LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, str, getTitle(chat));
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                        return LocaleController.formatString(R.string.NotificationEditedGroupName, str, messageAction3.title);
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                        return messageObject.messageText.toString();
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                        return messageObject.messageText.toString();
                    }
                    if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                        if (message4.peer_id.channel_id == 0 || chat.megagroup) {
                            return messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.NotificationEditedGroupVideo, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationEditedGroupPhoto, str, getTitle(chat));
                        }
                        return messageObject.isVideoAvatar() ? LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat)) : LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                        long j3 = messageAction3.user_id;
                        if (j3 == clientUserId) {
                            return LocaleController.formatString(R.string.NotificationGroupKickYou, str, getTitle(chat));
                        }
                        if (j3 == fromChatId) {
                            return LocaleController.formatString(R.string.NotificationGroupLeftMember, str, getTitle(chat));
                        }
                        TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                        if (user6 == null) {
                            return null;
                        }
                        return LocaleController.formatString(R.string.NotificationGroupKickMember, str, getTitle(chat), UserObject.getUserName(user6));
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
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            MessageObject messageObject2 = messageObject.replyMessageObject;
                            if (messageObject2 == null) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedNoText, str, getTitle(chat));
                            }
                            if (messageObject2.isMusic()) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedMusic, str, getTitle(chat));
                            }
                            if (messageObject2.isVideo()) {
                                if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                    return LocaleController.formatString(R.string.NotificationActionPinnedVideo, str, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "📹 " + messageObject2.messageOwner.message, getTitle(chat));
                            }
                            if (messageObject2.isGif()) {
                                if (TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                    return LocaleController.formatString(R.string.NotificationActionPinnedGif, str, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "🎬 " + messageObject2.messageOwner.message, getTitle(chat));
                            }
                            if (messageObject2.isVoice()) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedVoice, str, getTitle(chat));
                            }
                            if (messageObject2.isRoundVideo()) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedRound, str, getTitle(chat));
                            }
                            if (messageObject2.isSticker() || messageObject2.isAnimatedSticker()) {
                                String stickerEmoji2 = messageObject2.getStickerEmoji();
                                return stickerEmoji2 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, str, getTitle(chat), stickerEmoji2) : LocaleController.formatString(R.string.NotificationActionPinnedSticker, str, getTitle(chat));
                            }
                            TLRPC.Message message5 = messageObject2.messageOwner;
                            TLRPC.MessageMedia messageMedia2 = message5.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                if (TextUtils.isEmpty(message5.message)) {
                                    return LocaleController.formatString(R.string.NotificationActionPinnedFile, str, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "📎 " + messageObject2.messageOwner.message, getTitle(chat));
                            }
                            if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedGeo, str, getTitle(chat));
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, str, getTitle(chat));
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                                TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                                return LocaleController.formatString(R.string.NotificationActionPinnedContact2, str, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                return tL_messageMediaPoll.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, str, getTitle(chat), tL_messageMediaPoll.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPoll2, str, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedTodo2, str, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                if (TextUtils.isEmpty(message5.message)) {
                                    return LocaleController.formatString(R.string.NotificationActionPinnedPhoto, str, getTitle(chat));
                                }
                                return LocaleController.formatString(R.string.NotificationActionPinnedText, str, "🖼 " + messageObject2.messageOwner.message, getTitle(chat));
                            }
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedGame, str, getTitle(chat));
                            }
                            CharSequence charSequence = messageObject2.messageText;
                            if (charSequence == null || charSequence.length() <= 0) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedNoText, str, getTitle(chat));
                            }
                            CharSequence string10 = messageObject2.messageText;
                            if (string10.length() > 20) {
                                StringBuilder sb3 = new StringBuilder();
                                c = 0;
                                sb3.append((Object) string10.subSequence(0, 20));
                                sb3.append("...");
                                string10 = sb3.toString();
                            } else {
                                c = 0;
                            }
                            int i4 = R.string.NotificationActionPinnedText;
                            String title2 = getTitle(chat);
                            Object[] objArr = new Object[3];
                            objArr[c] = str;
                            objArr[1] = string10;
                            objArr[2] = title2;
                            return LocaleController.formatString(i4, objArr);
                        }
                        MessageObject messageObject3 = messageObject.replyMessageObject;
                        if (messageObject3 == null) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                        }
                        if (messageObject3.isMusic()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedMusicChannel, getTitle(chat));
                        }
                        if (messageObject3.isVideo()) {
                            if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedVideoChannel, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📹 " + messageObject3.messageOwner.message);
                        }
                        if (messageObject3.isGif()) {
                            if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject3.messageOwner.message);
                        }
                        if (messageObject3.isVoice()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                        }
                        if (messageObject3.isRoundVideo()) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                        }
                        if (messageObject3.isSticker() || messageObject3.isAnimatedSticker()) {
                            String stickerEmoji3 = messageObject3.getStickerEmoji();
                            return stickerEmoji3 != null ? LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji3) : LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                        }
                        TLRPC.Message message6 = messageObject3.messageOwner;
                        TLRPC.MessageMedia messageMedia3 = message6.media;
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                            if (TextUtils.isEmpty(message6.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject3.messageOwner.message);
                        }
                        if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                            return LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia3;
                            return tL_messageMediaPoll2.poll.quiz ? LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text) : LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                            if (TextUtils.isEmpty(message6.message)) {
                                return LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                            }
                            return LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject3.messageOwner.message);
                        }
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaGame) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                        }
                        CharSequence charSequence2 = messageObject3.messageText;
                        if (charSequence2 == null || charSequence2.length() <= 0) {
                            return LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                        }
                        CharSequence string11 = messageObject3.messageText;
                        if (string11.length() > 20) {
                            StringBuilder sb4 = new StringBuilder();
                            c2 = 0;
                            sb4.append((Object) string11.subSequence(0, 20));
                            sb4.append("...");
                            string11 = sb4.toString();
                        } else {
                            c2 = 0;
                        }
                        int i5 = R.string.NotificationActionPinnedTextChannel;
                        Object[] objArr2 = new Object[2];
                        objArr2[c2] = getTitle(chat);
                        objArr2[1] = string11;
                        return LocaleController.formatString(i5, objArr2);
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionGameScore) {
                        return messageObject.messageText.toString();
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                        String themeEmoticonOrGiftTitle2 = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                        if (TextUtils.isEmpty(themeEmoticonOrGiftTitle2)) {
                            return j == clientUserId ? LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]) : LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, str, themeEmoticonOrGiftTitle2);
                        }
                        return j == clientUserId ? LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle2) : LocaleController.formatString(R.string.ChatThemeChangedTo, str, themeEmoticonOrGiftTitle2);
                    }
                    if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                        return messageObject.messageText.toString();
                    }
                } else {
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        if (messageObject.isMediaEmpty()) {
                            if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                return LocaleController.formatString(R.string.ChannelMessageNoText, str);
                            }
                            String string12 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string12;
                        }
                        if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            return LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                        }
                        TLRPC.Message message7 = messageObject.messageOwner;
                        if (message7.media instanceof TLRPC.TL_messageMediaPhoto) {
                            if (z || TextUtils.isEmpty(message7.message)) {
                                return LocaleController.formatString(R.string.ChannelMessagePhoto, str);
                            }
                            String string13 = LocaleController.formatString(R.string.NotificationMessageText, str, "🖼 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string13;
                        }
                        if (messageObject.isVideo()) {
                            if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                return LocaleController.formatString(R.string.ChannelMessageVideo, str);
                            }
                            String string14 = LocaleController.formatString(R.string.NotificationMessageText, str, "📹 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string14;
                        }
                        if (messageObject.isVoice()) {
                            return LocaleController.formatString(R.string.ChannelMessageAudio, str);
                        }
                        if (messageObject.isRoundVideo()) {
                            return LocaleController.formatString(R.string.ChannelMessageRound, str);
                        }
                        if (messageObject.isMusic()) {
                            return LocaleController.formatString(R.string.ChannelMessageMusic, str);
                        }
                        TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageMedia4;
                            return LocaleController.formatString(R.string.ChannelMessageContact2, str, ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                        }
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia4).poll;
                            return poll2.quiz ? LocaleController.formatString(R.string.ChannelMessageQuiz2, str, poll2.question.text) : LocaleController.formatString(R.string.ChannelMessagePoll2, str, poll2.question.text);
                        }
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                            return LocaleController.formatString(R.string.ChannelMessageTodo2, str, ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                        }
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia4;
                            return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                        }
                        if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                            return LocaleController.formatString(R.string.ChannelMessageMap, str);
                        }
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                            return LocaleController.formatString(R.string.ChannelMessageLiveLocation, str);
                        }
                        if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                String stickerEmoji4 = messageObject.getStickerEmoji();
                                return stickerEmoji4 != null ? LocaleController.formatString(R.string.ChannelMessageStickerEmoji, str, stickerEmoji4) : LocaleController.formatString(R.string.ChannelMessageSticker, str);
                            }
                            if (messageObject.isGif()) {
                                if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    return LocaleController.formatString(R.string.ChannelMessageGIF, str);
                                }
                                String string15 = LocaleController.formatString(R.string.NotificationMessageText, str, "🎬 " + messageObject.messageOwner.message);
                                zArr[0] = true;
                                return string15;
                            }
                            if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                return LocaleController.formatString(R.string.ChannelMessageDocument, str);
                            }
                            String string16 = LocaleController.formatString(R.string.NotificationMessageText, str, "📎 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string16;
                        }
                        if (z || TextUtils.isEmpty(messageObject.messageText)) {
                            return LocaleController.formatString(R.string.ChannelMessageNoText, str);
                        }
                        String string17 = LocaleController.formatString(R.string.NotificationMessageText, str, messageObject.messageText);
                        zArr[0] = true;
                        return string17;
                    }
                    if (messageObject.isMediaEmpty()) {
                        return (z || TextUtils.isEmpty(messageObject.messageOwner.message)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), messageObject.messageOwner.message);
                    }
                    if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                        return LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, str, getTitle(chat));
                    }
                    TLRPC.Message message8 = messageObject.messageOwner;
                    if (message8.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (z || TextUtils.isEmpty(message8.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupPhoto, str, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVideo()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupVideo, str, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                    }
                    if (messageObject.isVoice()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupAudio, str, getTitle(chat));
                    }
                    if (messageObject.isRoundVideo()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupRound, str, getTitle(chat));
                    }
                    if (messageObject.isMusic()) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupMusic, str, getTitle(chat));
                    }
                    TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                        TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageMedia5;
                        return LocaleController.formatString(R.string.NotificationMessageGroupContact2, str, getTitle(chat), ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                        return tL_messageMediaPoll3.poll.quiz ? LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, str, getTitle(chat), tL_messageMediaPoll3.poll.question.text) : LocaleController.formatString(R.string.NotificationMessageGroupPoll2, str, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupTodo2, str, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupGame, str, getTitle(chat), messageObject.messageOwner.media.game.title);
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveaway) {
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia5;
                        return LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                        return LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                    }
                    if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                        return LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, str, getTitle(chat));
                    }
                    if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, str, getTitle(chat));
                    }
                    if (!(messageMedia5 instanceof TLRPC.TL_messageMediaDocument)) {
                        return (z || TextUtils.isEmpty(messageObject.messageText)) ? LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat)) : LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), messageObject.messageText);
                    }
                    if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                        String stickerEmoji5 = messageObject.getStickerEmoji();
                        return stickerEmoji5 != null ? LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, str, getTitle(chat), stickerEmoji5) : LocaleController.formatString(R.string.NotificationMessageGroupSticker, str, getTitle(chat));
                    }
                    if (messageObject.isGif()) {
                        if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            return LocaleController.formatString(R.string.NotificationMessageGroupGif, str, getTitle(chat));
                        }
                        return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                    }
                    if (z || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        return LocaleController.formatString(R.string.NotificationMessageGroupDocument, str, getTitle(chat));
                    }
                    return LocaleController.formatString(R.string.NotificationMessageGroupText, str, getTitle(chat), "📎 " + messageObject.messageOwner.message);
                }
            } else {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    return (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) ? LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, str) : LocaleController.formatString(R.string.NotificationMessageGroupNoText, str, getTitle(chat));
                }
                return LocaleController.formatString(R.string.ChannelMessageNoText, str);
            }
        }
        return null;
    }

    private void scheduleNotificationRepeat() {
        try {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(ApplicationLoader.applicationContext, 0, intent, 33554432);
            int i = getAccountInstance().getNotificationsSettings().getInt("repeat_messages", 60);
            if (i > 0 && this.personalCount > 0) {
                this.alarmManager.set(2, SystemClock.elapsedRealtime() + ((long) (i * 60000)), service);
            } else {
                this.alarmManager.cancel(service);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean isPersonalMessage(MessageObject messageObject) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || messageObject.isStoryReactionPush;
    }

    private int getNotifyOverride(SharedPreferences sharedPreferences, long j, long j2) {
        int property = this.dialogsNotificationsFacade.getProperty("notify2_", j, j2, -1);
        if (property != 3 || this.dialogsNotificationsFacade.getProperty("notifyuntil_", j, j2, 0) < getConnectionsManager().getCurrentTime()) {
            return property;
        }
        return 2;
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.showOrUpdateNotification(false);
            }
        });
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$A3HJIpMiVTz6qC9GdrpDpkcVtwA(this.f$0);
            }
        });
    }

    public static void $r8$lambda$A3HJIpMiVTz6qC9GdrpDpkcVtwA(NotificationsController notificationsController) {
        notificationManager.cancel(notificationsController.notificationId);
        notificationsController.lastWearNotifiedMessageId.clear();
        for (int i = 0; i < notificationsController.wearNotificationsIds.size(); i++) {
            notificationManager.cancel(((Integer) notificationsController.wearNotificationsIds.valueAt(i)).intValue());
        }
        notificationsController.wearNotificationsIds.clear();
    }

    private void dismissNotification() {
        FileLog.d("NotificationsController dismissNotification");
        try {
            notificationManager.cancel(this.notificationId);
            this.pushMessages.clear();
            this.pushMessagesDict.clear();
            this.lastWearNotifiedMessageId.clear();
            for (int i = 0; i < this.wearNotificationsIds.size(); i++) {
                if (!this.openedInBubbleDialogs.contains(Long.valueOf(this.wearNotificationsIds.keyAt(i)))) {
                    notificationManager.cancel(((Integer) this.wearNotificationsIds.valueAt(i)).intValue());
                }
            }
            this.wearNotificationsIds.clear();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.pushMessagesUpdated, new Object[0]);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ArrayList<MessageObject> getPushMessagesSnapshot() {
        ArrayList<MessageObject> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.pushMessages);
        }
        return arrayList;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            final String str = (String) objArr[0];
            notificationsQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    NotificationsController.$r8$lambda$tCp5deJHIKLKtDtGtmJreFj2_M0(this.f$0, str);
                }
            });
        }
    }

    public static void $r8$lambda$tCp5deJHIKLKtDtGtmJreFj2_M0(NotificationsController notificationsController, String str) {
        if (notificationsController.pendingVoiceLoads.remove(str)) {
            notificationsController.showOrUpdateNotification(true);
        }
    }

    private void playInChatSound() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.playInChatSound():void");
    }

    public static void $r8$lambda$fo8d0a1DCcD93QBhKMJlqvVt1o0(NotificationsController notificationsController) {
        notificationsController.getClass();
        if (Math.abs(SystemClock.elapsedRealtime() - notificationsController.lastSoundPlay) <= 500) {
            return;
        }
        try {
            if (notificationsController.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                notificationsController.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.$r8$lambda$FC_HwUM3QBEiCRgKZAe2XqW3hzc(soundPool2, i, i2);
                    }
                });
            }
            if (notificationsController.soundIn == 0 && !notificationsController.soundInLoaded) {
                notificationsController.soundInLoaded = true;
                notificationsController.soundIn = notificationsController.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i = notificationsController.soundIn;
            if (i != 0) {
                try {
                    notificationsController.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void $r8$lambda$FC_HwUM3QBEiCRgKZAe2XqW3hzc(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            try {
                soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void scheduleNotificationDelay(boolean z) {
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay notification start, onlineReason = " + z);
            }
            this.notificationDelayWakelock.acquire(10000L);
            DispatchQueue dispatchQueue = notificationsQueue;
            dispatchQueue.cancelRunnable(this.notificationDelayRunnable);
            dispatchQueue.postRunnable(this.notificationDelayRunnable, z ? 3000 : 1000);
        } catch (Exception e) {
            FileLog.e(e);
            showOrUpdateNotification(this.notifyCheck);
        }
    }

    public void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$aIvWURtIq5Q37hUZhEHyIGJwbZc(this.f$0);
            }
        });
    }

    public static void $r8$lambda$aIvWURtIq5Q37hUZhEHyIGJwbZc(NotificationsController notificationsController) {
        notificationsController.getClass();
        int i = Calendar.getInstance().get(11);
        if (i >= 11 && i <= 22) {
            notificationManager.cancel(notificationsController.notificationId);
            notificationsController.showOrUpdateNotification(true);
        } else {
            notificationsController.scheduleNotificationRepeat();
        }
    }

    private boolean isEmptyVibration(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        for (long j : jArr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public void deleteNotificationChannel(long j, long j2) {
        deleteNotificationChannel(j, j2, -1);
    }

    public void deleteNotificationChannelInternal(long j, long j2, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
            if (i == 0 || i == -1) {
                String str = "org.telegram.key" + j;
                if (j2 != 0) {
                    str = str + ".topic" + j2;
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    editorEdit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal " + string);
                    }
                }
            }
            if (i == 1 || i == -1) {
                String str2 = "org.telegram.keyia" + j;
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    editorEdit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel internal " + string2);
                    }
                }
            }
            editorEdit.commit();
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void deleteNotificationChannel(final long j, final long j2, final int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.deleteNotificationChannelInternal(j, j2, i);
            }
        });
    }

    public void deleteNotificationChannelGlobal(int i) {
        deleteNotificationChannelGlobal(i, -1);
    }

    public void deleteNotificationChannelGlobalInternal(int i, int i2) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
            if (i2 == 0 || i2 == -1) {
                if (i == 2) {
                    str = "channels";
                } else if (i == 0) {
                    str = "groups";
                } else if (i == 3) {
                    str = "stories";
                } else if (i == 4 || i == 5) {
                    str = "reactions";
                } else {
                    str = "private";
                }
                String string = notificationsSettings.getString(str, null);
                if (string != null) {
                    editorEdit.remove(str).remove(str + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal " + string);
                    }
                }
            }
            if (i2 == 1 || i2 == -1) {
                if (i == 2) {
                    str2 = "channels_ia";
                } else if (i == 0) {
                    str2 = "groups_ia";
                } else if (i == 3) {
                    str2 = "stories_ia";
                } else if (i == 4 || i == 5) {
                    str2 = "reactions_ia";
                } else {
                    str2 = "private_ia";
                }
                String string2 = notificationsSettings.getString(str2, null);
                if (string2 != null) {
                    editorEdit.remove(str2).remove(str2 + "_s");
                    try {
                        systemNotificationManager.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel global internal " + string2);
                    }
                }
            }
            if (i == 2) {
                str3 = "overwrite_channel";
            } else if (i == 0) {
                str3 = "overwrite_group";
            } else if (i == 3) {
                str3 = "overwrite_stories";
            } else if (i == 4 || i == 5) {
                str3 = "overwrite_reactions";
            } else {
                str3 = "overwrite_private";
            }
            editorEdit.remove(str3);
            editorEdit.commit();
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void deleteNotificationChannelGlobal(final int i, final int i2) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.deleteNotificationChannelGlobalInternal(i, i2);
            }
        });
    }

    public void deleteAllNotificationChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$Nfmwpr5cW8zxAuxZyE34tMoFAF8(this.f$0);
            }
        });
    }

    public static void $r8$lambda$Nfmwpr5cW8zxAuxZyE34tMoFAF8(NotificationsController notificationsController) {
        notificationsController.getClass();
        try {
            SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean unsupportedNotificationShortcut() {
        return Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBubbles;
    }

    private String createNotificationShortcut(NotificationCompat.Builder builder, long j, String str, TLRPC.User user, TLRPC.Chat chat, Person person, boolean z) {
        Bitmap bitmap;
        IconCompat iconCompatCreateWithResource;
        if (unsupportedNotificationShortcut() || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            return null;
        }
        try {
            String str2 = "ndid_" + j;
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
            if (j > 0) {
                intent.putExtra("userId", j);
            } else {
                intent.putExtra("chatId", -j);
            }
            ShortcutInfoCompat.Builder locusId = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str2).setShortLabel(chat != null ? str : UserObject.getFirstName(user)).setLongLabel(str).setIntent(new Intent("android.intent.action.VIEW")).setIntent(intent).setLongLived(true).setLocusId(new LocusIdCompat(str2));
            if (person != null) {
                locusId.setPerson(person);
                locusId.setIcon(person.getIcon());
                if (person.getIcon() != null) {
                    bitmap = person.getIcon().getBitmap();
                } else {
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            ShortcutInfoCompat shortcutInfoCompatBuild = locusId.build();
            ShortcutManagerCompat.pushDynamicShortcut(ApplicationLoader.applicationContext, shortcutInfoCompatBuild);
            builder.setShortcutInfo(shortcutInfoCompatBuild);
            Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) BubbleActivity.class);
            intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
            if (DialogObject.isUserDialog(j)) {
                intent2.putExtra("userId", j);
            } else {
                intent2.putExtra("chatId", -j);
            }
            intent2.putExtra("currentAccount", this.currentAccount);
            if (bitmap != null) {
                iconCompatCreateWithResource = IconCompat.createWithAdaptiveBitmap(bitmap);
            } else if (user != null) {
                iconCompatCreateWithResource = IconCompat.createWithResource(ApplicationLoader.applicationContext, user.bot ? R.drawable.book_bot : R.drawable.book_user);
            } else {
                iconCompatCreateWithResource = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
            }
            if (z) {
                NotificationCompat.BubbleMetadata.Builder builder2 = new NotificationCompat.BubbleMetadata.Builder(PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160), iconCompatCreateWithResource);
                builder2.setSuppressNotification(this.openedDialogId == j);
                builder2.setAutoExpandBubble(false);
                builder2.setDesiredHeight(AndroidUtilities.dp(640.0f));
                builder.setBubbleMetadata(builder2.build());
                return str2;
            }
            builder.setBubbleMetadata(null);
            return str2;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    protected void ensureGroupsCreated() {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (this.groupsCreated == null) {
            this.groupsCreated = Boolean.valueOf(notificationsSettings.getBoolean("groupsCreated5", false));
        }
        if (!this.groupsCreated.booleanValue()) {
            try {
                String str = this.currentAccount + "channel";
                List notificationChannels = systemNotificationManager.getNotificationChannels();
                int size = notificationChannels.size();
                SharedPreferences.Editor editorEdit = null;
                for (int i = 0; i < size; i++) {
                    NotificationChannel notificationChannelM = NotificationsController$$ExternalSyntheticApiModelOutline7.m(notificationChannels.get(i));
                    String id = notificationChannelM.getId();
                    if (id.startsWith(str)) {
                        int importance = notificationChannelM.getImportance();
                        if (importance != 4 && importance != 5 && !id.contains("_ia_")) {
                            if (id.contains("_channels_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id.contains("_reactions_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_react").remove("vibrate_react").remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id.contains("_groups_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id.contains("_private_")) {
                                if (editorEdit == null) {
                                    editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                }
                                editorEdit.remove("priority_messages");
                                editorEdit.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                long jLongValue = Utilities.parseLong(id.substring(9, id.indexOf(95, 9))).longValue();
                                if (jLongValue != 0) {
                                    if (editorEdit == null) {
                                        editorEdit = getAccountInstance().getNotificationsSettings().edit();
                                    }
                                    editorEdit.remove("priority_" + jLongValue).remove("vibrate_" + jLongValue).remove("sound_path_" + jLongValue).remove("sound_" + jLongValue);
                                }
                            }
                        }
                        systemNotificationManager.deleteNotificationChannel(id);
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            notificationsSettings.edit().putBoolean("groupsCreated5", true).commit();
            this.groupsCreated = Boolean.TRUE;
        }
        if (this.channelGroupsCreated) {
            return;
        }
        List notificationChannelGroups = systemNotificationManager.getNotificationChannelGroups();
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
        for (int i2 = 0; i2 < size2; i2++) {
            String id2 = NotificationsController$$ExternalSyntheticApiModelOutline18.m(notificationChannelGroups.get(i2)).getId();
            if (str2 != null && str2.equals(id2)) {
                str2 = null;
            } else if (str3 != null && str3.equals(id2)) {
                str3 = null;
            } else if (str10 != null && str10.equals(id2)) {
                str10 = null;
            } else if (str9 != null && str9.equals(id2)) {
                str9 = null;
            } else if (str11 != null && str11.equals(id2)) {
                str11 = null;
            } else if (str8 != null && str8.equals(id2)) {
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
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str2, LocaleController.getString(R.string.NotificationsChannels) + str12));
            }
            if (str3 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str3, LocaleController.getString(R.string.NotificationsGroups) + str12));
            }
            if (str10 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str10, LocaleController.getString(R.string.NotificationsStories) + str12));
            }
            if (str9 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str9, LocaleController.getString(R.string.NotificationsReactions) + str12));
            }
            if (str11 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str11, LocaleController.getString(R.string.NotificationsPrivateChats) + str12));
            }
            if (str8 != null) {
                NotificationsController$$ExternalSyntheticApiModelOutline23.m();
                arrayList.add(NotificationsController$$ExternalSyntheticApiModelOutline22.m(str8, LocaleController.getString(R.string.NotificationsOther) + str12));
            }
            systemNotificationManager.createNotificationChannelGroups(arrayList);
        }
        this.channelGroupsCreated = true;
    }

    private String validateChannelId(long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        String str6;
        String str7;
        String string2;
        String str8;
        StringBuilder sb;
        boolean z4;
        String str9;
        SharedPreferences sharedPreferences;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z5;
        String str14;
        int i4;
        int i5;
        String strMD5;
        String str15;
        String string3;
        NotificationChannel notificationChannelM;
        boolean z6;
        boolean z7;
        AudioAttributes.Builder builder;
        NotificationChannel notificationChannel;
        long j3;
        long[] jArr2;
        String str16;
        long[] jArr3;
        SharedPreferences.Editor editorEdit;
        boolean z8;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str17 = "channel_";
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String string4 = "stories";
        if (z3) {
            str2 = "other" + this.currentAccount;
            str3 = null;
        } else if (i3 == 2) {
            str2 = "channels" + this.currentAccount;
            str3 = "overwrite_channel";
        } else if (i3 == 0) {
            str2 = "groups" + this.currentAccount;
            str3 = "overwrite_group";
        } else if (i3 == 3) {
            str2 = "stories" + this.currentAccount;
            str3 = "overwrite_stories";
        } else if (i3 == 4 || i3 == 5) {
            str2 = "reactions" + this.currentAccount;
            str3 = "overwrite_reactions";
        } else {
            str2 = "private" + this.currentAccount;
            str3 = "overwrite_private";
        }
        boolean z9 = !z && DialogObject.isEncryptedDialog(j);
        boolean z10 = (z2 || str3 == null || !notificationsSettings.getBoolean(str3, false)) ? false : true;
        String strMD6 = Utilities.MD5(uri == null ? "NoSound2" : uri.toString());
        if (strMD6 != null) {
            str4 = "private";
            if (strMD6.length() > 5) {
                strMD6 = strMD6.substring(0, 5);
            }
        } else {
            str4 = "private";
        }
        String str18 = "_";
        if (z3) {
            string = LocaleController.getString(R.string.NotificationsSilent);
            string4 = "silent";
        } else {
            if (z) {
                String string5 = LocaleController.getString(z2 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
                if (i3 != 2) {
                    if (i3 == 0) {
                        str6 = z2 ? "groups_ia" : "groups";
                    } else if (i3 == 3) {
                        if (z2) {
                            str6 = "stories_ia";
                        } else {
                            str5 = string5;
                            str6 = string4;
                        }
                    } else if (i3 == 4 || i3 == 5) {
                        if (z2) {
                            str6 = "reactions_ia";
                        } else {
                            str5 = string5;
                            str6 = "reactions";
                        }
                    } else if (z2) {
                        str6 = "private_ia";
                    } else {
                        str5 = string5;
                        str6 = str4;
                    }
                    str5 = string5;
                } else if (z2) {
                    str6 = "channels_ia";
                    str5 = string5;
                } else {
                    str5 = string5;
                    str6 = "channels";
                }
            } else {
                string = z2 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z2 ? "org.telegram.keyia" : "org.telegram.key");
                sb2.append(j);
                sb2.append("_");
                sb2.append(j2);
                string4 = sb2.toString();
            }
            str7 = str6 + "_" + strMD6;
            string2 = notificationsSettings.getString(str7, null);
            str8 = "_s";
            String string6 = notificationsSettings.getString(str7 + "_s", null);
            sb = new StringBuilder();
            z4 = z10;
            str9 = "secret";
            if (string2 != null) {
                sharedPreferences = notificationsSettings;
                notificationChannel = systemNotificationManager.getNotificationChannel(string2);
                str10 = str5;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current channel for " + string2 + " = " + notificationChannel);
                }
                if (notificationChannel != null) {
                    jArr = jArr;
                    i = i;
                    sb = sb;
                    str17 = "channel_";
                    str9 = "secret";
                    str7 = str7;
                    str18 = "_";
                    str8 = str8;
                    str13 = null;
                    str12 = null;
                    str11 = null;
                    z5 = false;
                } else if (z3 && !z4) {
                    int importance = notificationChannel.getImportance();
                    Uri sound = notificationChannel.getSound();
                    long[] vibrationPattern = notificationChannel.getVibrationPattern();
                    boolean zShouldVibrate = notificationChannel.shouldVibrate();
                    str7 = str7;
                    str18 = "_";
                    if (zShouldVibrate || vibrationPattern != null) {
                        j3 = 0;
                        jArr2 = vibrationPattern;
                    } else {
                        j3 = 0;
                        jArr2 = new long[]{0, 0};
                    }
                    int lightColor = notificationChannel.getLightColor();
                    str17 = "channel_";
                    if (jArr2 != null) {
                        int i12 = 0;
                        while (i12 < jArr2.length) {
                            int i13 = i12;
                            long[] jArr4 = jArr2;
                            sb.append(jArr4[i13]);
                            i12 = i13 + 1;
                            jArr2 = jArr4;
                        }
                    }
                    long[] jArr5 = jArr2;
                    sb.append(lightColor);
                    if (sound != null) {
                        sb.append(sound.toString());
                    }
                    sb.append(importance);
                    if (!z && z9) {
                        sb.append("secret");
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("current channel settings for " + string2 + " = " + ((Object) sb) + " old = " + string6);
                    }
                    String strMD7 = Utilities.MD5(sb.toString());
                    sb.setLength(0);
                    if (z2 && i2 != importance) {
                        str8 = str8;
                        i = i;
                        str9 = "secret";
                        str16 = strMD7;
                        z5 = false;
                        z4 = true;
                        jArr = jArr;
                        sb = sb;
                    } else if (strMD7.equals(string6)) {
                        str8 = str8;
                        i = i;
                        str9 = "secret";
                        str16 = strMD7;
                        jArr = jArr;
                        sb = sb;
                        z5 = false;
                    } else {
                        if (importance == 0) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            if (!z) {
                                if (i3 == 3) {
                                    editorEdit2.putBoolean("stories_" + getSharedPrefKey(j, j3), false);
                                } else {
                                    editorEdit2.putInt("notify2_" + getSharedPrefKey(j, j3), 2);
                                }
                                updateServerNotificationsSettings(j, 0L, true);
                            } else if (!z2) {
                                if (i3 == 3) {
                                    editorEdit2.putBoolean("EnableAllStories", false);
                                } else if (i3 == 4) {
                                    editorEdit2.putBoolean("EnableReactionsMessages", true);
                                    editorEdit2.putBoolean("EnableReactionsStories", true);
                                } else {
                                    editorEdit2.putInt(getGlobalNotificationsKey(i3), Integer.MAX_VALUE);
                                }
                                updateServerNotificationsSettings(i3);
                            }
                            editorEdit = editorEdit2;
                            jArr3 = jArr5;
                            str9 = "secret";
                            str16 = strMD7;
                            str8 = str8;
                            sb = sb;
                        } else {
                            str8 = str8;
                            jArr3 = jArr5;
                            sb = sb;
                            str16 = strMD7;
                            str9 = "secret";
                            if (importance == i2) {
                                editorEdit = null;
                                z8 = false;
                            } else if (z2) {
                                editorEdit = null;
                            } else {
                                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                if (importance == 4 || importance == 5) {
                                    i6 = 1;
                                } else if (importance == 1) {
                                    i6 = 4;
                                } else {
                                    i6 = importance == 2 ? 5 : 0;
                                }
                                if (z) {
                                    if (i3 == 3) {
                                        editorEdit3.putBoolean("EnableAllStories", true);
                                    } else if (i3 == 4) {
                                        editorEdit3.putBoolean("EnableReactionsMessages", true);
                                        editorEdit3.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        editorEdit3.putInt(getGlobalNotificationsKey(i3), 0);
                                    }
                                    if (i3 == 2) {
                                        editorEdit3.putInt("priority_channel", i6);
                                    } else if (i3 == 0) {
                                        editorEdit3.putInt("priority_group", i6);
                                    } else if (i3 == 3) {
                                        editorEdit3.putInt("priority_stories", i6);
                                    } else if (i3 == 4 || i3 == 5) {
                                        editorEdit3.putInt("priority_react", i6);
                                    } else {
                                        editorEdit3.putInt("priority_messages", i6);
                                    }
                                } else if (i3 == 3) {
                                    editorEdit3.putBoolean("stories_" + j, true);
                                } else {
                                    editorEdit3.putInt("notify2_" + j, 0);
                                    editorEdit3.remove("notifyuntil_" + j);
                                    editorEdit3.putInt("priority_" + j, i6);
                                }
                                editorEdit = editorEdit3;
                            }
                            jArr = jArr;
                            if ((!isEmptyVibration(jArr)) != zShouldVibrate) {
                                if (!z2) {
                                    if (editorEdit == null) {
                                        editorEdit = sharedPreferences.edit();
                                    }
                                    if (z) {
                                        String str19 = "vibrate_" + j;
                                        if (zShouldVibrate) {
                                            i7 = 0;
                                        } else {
                                            i7 = 2;
                                        }
                                        editorEdit.putInt(str19, i7);
                                    } else if (i3 == 2) {
                                        if (zShouldVibrate) {
                                            i11 = 0;
                                        } else {
                                            i11 = 2;
                                        }
                                        editorEdit.putInt("vibrate_channel", i11);
                                    } else if (i3 == 0) {
                                        if (zShouldVibrate) {
                                            i10 = 0;
                                        } else {
                                            i10 = 2;
                                        }
                                        editorEdit.putInt("vibrate_group", i10);
                                    } else if (i3 == 3) {
                                        if (zShouldVibrate) {
                                            i9 = 0;
                                        } else {
                                            i9 = 2;
                                        }
                                        editorEdit.putInt("vibrate_stories", i9);
                                    } else if (i3 != 4 || i3 == 5) {
                                        if (zShouldVibrate) {
                                            i8 = 0;
                                        } else {
                                            i8 = 2;
                                        }
                                        editorEdit.putInt("vibrate_react", i8);
                                    } else {
                                        editorEdit.putInt("vibrate_messages", zShouldVibrate ? 0 : 2);
                                    }
                                }
                                jArr = jArr3;
                                z8 = true;
                            }
                            i = i;
                            if (lightColor != i) {
                                if (!z2) {
                                    if (editorEdit == null) {
                                        editorEdit = sharedPreferences.edit();
                                    }
                                    if (z) {
                                        editorEdit.putInt("color_" + j, lightColor);
                                    } else if (i3 == 2) {
                                        editorEdit.putInt("ChannelLed", lightColor);
                                    } else if (i3 == 0) {
                                        editorEdit.putInt("GroupLed", lightColor);
                                    } else if (i3 == 3) {
                                        editorEdit.putInt("StoriesLed", lightColor);
                                    } else if (i3 != 5 || i3 == 4) {
                                        editorEdit.putInt("ReactionsLed", lightColor);
                                    } else {
                                        editorEdit.putInt("MessagesLed", lightColor);
                                    }
                                }
                                i = lightColor;
                                z8 = true;
                            }
                            if (editorEdit != null) {
                                editorEdit.commit();
                            }
                            z5 = z8;
                        }
                        z8 = true;
                        jArr = jArr;
                        if ((!isEmptyVibration(jArr)) != zShouldVibrate) {
                            if (!z2) {
                                if (editorEdit == null) {
                                    editorEdit = sharedPreferences.edit();
                                }
                                if (z) {
                                    String str110 = "vibrate_" + j;
                                    if (zShouldVibrate) {
                                        i7 = 0;
                                    } else {
                                        i7 = 2;
                                    }
                                    editorEdit.putInt(str110, i7);
                                } else if (i3 == 2) {
                                    if (zShouldVibrate) {
                                        i11 = 0;
                                    } else {
                                        i11 = 2;
                                    }
                                    editorEdit.putInt("vibrate_channel", i11);
                                } else if (i3 == 0) {
                                    if (zShouldVibrate) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    editorEdit.putInt("vibrate_group", i10);
                                } else if (i3 == 3) {
                                    if (zShouldVibrate) {
                                        i9 = 0;
                                    } else {
                                        i9 = 2;
                                    }
                                    editorEdit.putInt("vibrate_stories", i9);
                                } else if (i3 != 4) {
                                    if (zShouldVibrate) {
                                        i8 = 0;
                                    } else {
                                        i8 = 2;
                                    }
                                    editorEdit.putInt("vibrate_react", i8);
                                } else {
                                    if (zShouldVibrate) {
                                        i8 = 0;
                                    } else {
                                        i8 = 2;
                                    }
                                    editorEdit.putInt("vibrate_react", i8);
                                }
                            }
                            jArr = jArr3;
                            z8 = true;
                        }
                        i = i;
                        if (lightColor != i) {
                            if (!z2) {
                                if (editorEdit == null) {
                                    editorEdit = sharedPreferences.edit();
                                }
                                if (z) {
                                    editorEdit.putInt("color_" + j, lightColor);
                                } else if (i3 == 2) {
                                    editorEdit.putInt("ChannelLed", lightColor);
                                } else if (i3 == 0) {
                                    editorEdit.putInt("GroupLed", lightColor);
                                } else if (i3 == 3) {
                                    editorEdit.putInt("StoriesLed", lightColor);
                                } else if (i3 != 5) {
                                    editorEdit.putInt("ReactionsLed", lightColor);
                                } else {
                                    editorEdit.putInt("ReactionsLed", lightColor);
                                }
                            }
                            i = lightColor;
                            z8 = true;
                        }
                        if (editorEdit != null) {
                            editorEdit.commit();
                        }
                        z5 = z8;
                    }
                    str12 = str16;
                    str11 = string2;
                    str13 = string6;
                }
                if (z5 || str12 == null) {
                    str14 = str7;
                    if (!z4 || str12 == null || !z2 || !z) {
                        for (long j4 : jArr) {
                            sb.append(j4);
                        }
                        sb.append(i);
                        if (uri != null) {
                            sb.append(uri.toString());
                        }
                        i5 = i2;
                        sb.append(i5);
                        if (!z && z9) {
                            sb.append(str9);
                        }
                        strMD5 = Utilities.MD5(sb.toString());
                        if (!z3 && str11 != null && (z4 || !str13.equals(strMD5))) {
                            try {
                                systemNotificationManager.deleteNotificationChannel(str11);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("delete channel by settings change " + str11);
                            }
                            str11 = null;
                        }
                    }
                    if (str11 == null) {
                        if (z) {
                            str15 = this.currentAccount + str17 + str14 + str18 + Utilities.random.nextLong();
                        } else {
                            str15 = this.currentAccount + str17 + j + str18 + Utilities.random.nextLong();
                        }
                        str11 = str15;
                        SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                        if (z9) {
                            string3 = LocaleController.getString(R.string.SecretChatName);
                        } else {
                            string3 = str10;
                        }
                        notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str11, string3, i5);
                        notificationChannelM.setGroup(str2);
                        if (i != 0) {
                            z6 = true;
                            notificationChannelM.enableLights(true);
                            notificationChannelM.setLightColor(i);
                            z7 = false;
                        } else {
                            z6 = true;
                            z7 = false;
                            notificationChannelM.enableLights(false);
                        }
                        if (!isEmptyVibration(jArr)) {
                            notificationChannelM.enableVibration(z6);
                            if (jArr.length > 0) {
                                notificationChannelM.setVibrationPattern(jArr);
                            }
                        } else {
                            notificationChannelM.enableVibration(z7);
                        }
                        builder = new AudioAttributes.Builder();
                        builder.setContentType(4);
                        builder.setUsage(5);
                        if (uri != null) {
                            notificationChannelM.setSound(uri, builder.build());
                        } else {
                            notificationChannelM.setSound(null, builder.build());
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("create new channel " + str11);
                        }
                        this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                        systemNotificationManager.createNotificationChannel(notificationChannelM);
                        sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, strMD5).commit();
                    }
                    return str11;
                }
                str14 = str7;
                sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, str12).commit();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("change edited channel " + str11);
                }
                strMD5 = str12;
                i5 = i2;
                if (str11 == null) {
                    if (z) {
                        str15 = this.currentAccount + str17 + str14 + str18 + Utilities.random.nextLong();
                    } else {
                        str15 = this.currentAccount + str17 + j + str18 + Utilities.random.nextLong();
                    }
                    str11 = str15;
                    SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                    if (z9) {
                        string3 = LocaleController.getString(R.string.SecretChatName);
                    } else {
                        string3 = str10;
                    }
                    notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str11, string3, i5);
                    notificationChannelM.setGroup(str2);
                    if (i != 0) {
                        z6 = true;
                        notificationChannelM.enableLights(true);
                        notificationChannelM.setLightColor(i);
                        z7 = false;
                    } else {
                        z6 = true;
                        z7 = false;
                        notificationChannelM.enableLights(false);
                    }
                    if (!isEmptyVibration(jArr)) {
                        notificationChannelM.enableVibration(z6);
                        if (jArr.length > 0) {
                            notificationChannelM.setVibrationPattern(jArr);
                        }
                    } else {
                        notificationChannelM.enableVibration(z7);
                    }
                    builder = new AudioAttributes.Builder();
                    builder.setContentType(4);
                    builder.setUsage(5);
                    if (uri != null) {
                        notificationChannelM.setSound(uri, builder.build());
                    } else {
                        notificationChannelM.setSound(null, builder.build());
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("create new channel " + str11);
                    }
                    this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                    systemNotificationManager.createNotificationChannel(notificationChannelM);
                    sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, strMD5).commit();
                }
                return str11;
            }
            str2 = str2;
            sharedPreferences = notificationsSettings;
            str10 = str5;
            str11 = string2;
            str13 = string6;
            str12 = null;
            z5 = false;
            if (z5) {
                str14 = str7;
                if (!z4) {
                }
                while (i4 < jArr.length) {
                    sb.append(j4);
                }
                sb.append(i);
                if (uri != null) {
                    sb.append(uri.toString());
                }
                i5 = i2;
                sb.append(i5);
                if (!z) {
                    sb.append(str9);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str11);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str11);
                    }
                    str11 = null;
                }
            } else {
                str14 = str7;
                if (!z4) {
                }
                while (i4 < jArr.length) {
                    sb.append(j4);
                }
                sb.append(i);
                if (uri != null) {
                    sb.append(uri.toString());
                }
                i5 = i2;
                sb.append(i5);
                if (!z) {
                    sb.append(str9);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str11);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str11);
                    }
                    str11 = null;
                }
            }
            if (str11 == null) {
                if (z) {
                    str15 = this.currentAccount + str17 + str14 + str18 + Utilities.random.nextLong();
                } else {
                    str15 = this.currentAccount + str17 + j + str18 + Utilities.random.nextLong();
                }
                str11 = str15;
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                if (z9) {
                    string3 = LocaleController.getString(R.string.SecretChatName);
                } else {
                    string3 = str10;
                }
                notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str11, string3, i5);
                notificationChannelM.setGroup(str2);
                if (i != 0) {
                    z6 = true;
                    notificationChannelM.enableLights(true);
                    notificationChannelM.setLightColor(i);
                    z7 = false;
                } else {
                    z6 = true;
                    z7 = false;
                    notificationChannelM.enableLights(false);
                }
                if (!isEmptyVibration(jArr)) {
                    notificationChannelM.enableVibration(z6);
                    if (jArr.length > 0) {
                        notificationChannelM.setVibrationPattern(jArr);
                    }
                } else {
                    notificationChannelM.enableVibration(z7);
                }
                builder = new AudioAttributes.Builder();
                builder.setContentType(4);
                builder.setUsage(5);
                if (uri != null) {
                    notificationChannelM.setSound(uri, builder.build());
                } else {
                    notificationChannelM.setSound(null, builder.build());
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new channel " + str11);
                }
                this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                systemNotificationManager.createNotificationChannel(notificationChannelM);
                sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, strMD5).commit();
            }
            return str11;
        }
        str5 = string;
        str6 = string4;
        str7 = str6 + "_" + strMD6;
        string2 = notificationsSettings.getString(str7, null);
        str8 = "_s";
        String string7 = notificationsSettings.getString(str7 + "_s", null);
        sb = new StringBuilder();
        z4 = z10;
        str9 = "secret";
        if (string2 != null) {
            sharedPreferences = notificationsSettings;
            notificationChannel = systemNotificationManager.getNotificationChannel(string2);
            str10 = str5;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("current channel for " + string2 + " = " + notificationChannel);
            }
            if (notificationChannel != null) {
                jArr = jArr;
                i = i;
                sb = sb;
                str17 = "channel_";
                str9 = "secret";
                str7 = str7;
                str18 = "_";
                str8 = str8;
                str13 = null;
                str12 = null;
                str11 = null;
                z5 = false;
            } else if (z3) {
            }
            if (z5) {
                str14 = str7;
                if (!z4) {
                }
                while (i4 < jArr.length) {
                    sb.append(j4);
                }
                sb.append(i);
                if (uri != null) {
                    sb.append(uri.toString());
                }
                i5 = i2;
                sb.append(i5);
                if (!z) {
                    sb.append(str9);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str11);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str11);
                    }
                    str11 = null;
                }
            } else {
                str14 = str7;
                if (!z4) {
                }
                while (i4 < jArr.length) {
                    sb.append(j4);
                }
                sb.append(i);
                if (uri != null) {
                    sb.append(uri.toString());
                }
                i5 = i2;
                sb.append(i5);
                if (!z) {
                    sb.append(str9);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str11);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str11);
                    }
                    str11 = null;
                }
            }
            if (str11 == null) {
                if (z) {
                    str15 = this.currentAccount + str17 + str14 + str18 + Utilities.random.nextLong();
                } else {
                    str15 = this.currentAccount + str17 + j + str18 + Utilities.random.nextLong();
                }
                str11 = str15;
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                if (z9) {
                    string3 = LocaleController.getString(R.string.SecretChatName);
                } else {
                    string3 = str10;
                }
                notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str11, string3, i5);
                notificationChannelM.setGroup(str2);
                if (i != 0) {
                    z6 = true;
                    notificationChannelM.enableLights(true);
                    notificationChannelM.setLightColor(i);
                    z7 = false;
                } else {
                    z6 = true;
                    z7 = false;
                    notificationChannelM.enableLights(false);
                }
                if (!isEmptyVibration(jArr)) {
                    notificationChannelM.enableVibration(z6);
                    if (jArr.length > 0) {
                        notificationChannelM.setVibrationPattern(jArr);
                    }
                } else {
                    notificationChannelM.enableVibration(z7);
                }
                builder = new AudioAttributes.Builder();
                builder.setContentType(4);
                builder.setUsage(5);
                if (uri != null) {
                    notificationChannelM.setSound(uri, builder.build());
                } else {
                    notificationChannelM.setSound(null, builder.build());
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new channel " + str11);
                }
                this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                systemNotificationManager.createNotificationChannel(notificationChannelM);
                sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, strMD5).commit();
            }
            return str11;
        }
        str2 = str2;
        sharedPreferences = notificationsSettings;
        str10 = str5;
        str11 = string2;
        str13 = string7;
        str12 = null;
        z5 = false;
        if (z5) {
            str14 = str7;
            if (!z4) {
            }
            while (i4 < jArr.length) {
                sb.append(j4);
            }
            sb.append(i);
            if (uri != null) {
                sb.append(uri.toString());
            }
            i5 = i2;
            sb.append(i5);
            if (!z) {
                sb.append(str9);
            }
            strMD5 = Utilities.MD5(sb.toString());
            if (!z3) {
                systemNotificationManager.deleteNotificationChannel(str11);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("delete channel by settings change " + str11);
                }
                str11 = null;
            }
        } else {
            str14 = str7;
            if (!z4) {
            }
            while (i4 < jArr.length) {
                sb.append(j4);
            }
            sb.append(i);
            if (uri != null) {
                sb.append(uri.toString());
            }
            i5 = i2;
            sb.append(i5);
            if (!z) {
                sb.append(str9);
            }
            strMD5 = Utilities.MD5(sb.toString());
            if (!z3) {
                systemNotificationManager.deleteNotificationChannel(str11);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("delete channel by settings change " + str11);
                }
                str11 = null;
            }
        }
        if (str11 == null) {
            if (z) {
                str15 = this.currentAccount + str17 + str14 + str18 + Utilities.random.nextLong();
            } else {
                str15 = this.currentAccount + str17 + j + str18 + Utilities.random.nextLong();
            }
            str11 = str15;
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            if (z9) {
                string3 = LocaleController.getString(R.string.SecretChatName);
            } else {
                string3 = str10;
            }
            notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str11, string3, i5);
            notificationChannelM.setGroup(str2);
            if (i != 0) {
                z6 = true;
                notificationChannelM.enableLights(true);
                notificationChannelM.setLightColor(i);
                z7 = false;
            } else {
                z6 = true;
                z7 = false;
                notificationChannelM.enableLights(false);
            }
            if (!isEmptyVibration(jArr)) {
                notificationChannelM.enableVibration(z6);
                if (jArr.length > 0) {
                    notificationChannelM.setVibrationPattern(jArr);
                }
            } else {
                notificationChannelM.enableVibration(z7);
            }
            builder = new AudioAttributes.Builder();
            builder.setContentType(4);
            builder.setUsage(5);
            if (uri != null) {
                notificationChannelM.setSound(uri, builder.build());
            } else {
                notificationChannelM.setSound(null, builder.build());
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("create new channel " + str11);
            }
            this.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
            systemNotificationManager.createNotificationChannel(notificationChannelM);
            sharedPreferences.edit().putString(str14, str11).putString(str14 + str8, strMD5).commit();
        }
        return str11;
    }

    public void showOrUpdateNotification(boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.showOrUpdateNotification(boolean):void");
    }

    private boolean isSilentMessage(MessageObject messageObject) {
        return messageObject.messageOwner.silent || messageObject.isReactionPush;
    }

    private void setNotificationChannel(Notification notification, NotificationCompat.Builder builder, boolean z) {
        if (z) {
            builder.setChannelId(OTHER_NOTIFICATIONS_CHANNEL);
        } else {
            builder.setChannelId(notification.getChannelId());
        }
    }

    public void resetNotificationSound(NotificationCompat.Builder builder, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        FileLog.d("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        String string = uri2.toString();
        String string2 = LocaleController.getString(R.string.DefaultRingtone);
        if (z) {
            if (i3 == 2) {
                editorEdit.putString("ChannelSound", string2);
            } else if (i3 == 0) {
                editorEdit.putString("GroupSound", string2);
            } else if (i3 == 1) {
                editorEdit.putString("GlobalSound", string2);
            } else if (i3 == 3) {
                editorEdit.putString("StoriesSound", string2);
            } else if (i3 == 4 || i3 == 5) {
                editorEdit.putString("ReactionSound", string2);
            }
            if (i3 == 2) {
                editorEdit.putString("ChannelSoundPath", string);
            } else if (i3 == 0) {
                editorEdit.putString("GroupSoundPath", string);
            } else if (i3 == 1) {
                editorEdit.putString("GlobalSoundPath", string);
            } else if (i3 == 3) {
                editorEdit.putString("StoriesSoundPath", string);
            } else if (i3 == 4 || i3 == 5) {
                editorEdit.putString("ReactionSound", string);
            }
            getNotificationsController().deleteNotificationChannelGlobalInternal(i3, -1);
        } else {
            editorEdit.putString("sound_" + getSharedPrefKey(j, j2), string2);
            editorEdit.putString("sound_path_" + getSharedPrefKey(j, j2), string);
            deleteNotificationChannelInternal(j, j2, -1);
        }
        editorEdit.commit();
        builder.setChannelId(validateChannelId(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3));
        notificationManager.notify(this.notificationId, builder.build());
    }

    private void showExtraNotifications(NotificationCompat.Builder builder, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        int i4;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        LongSparseArray longSparseArray;
        long j3;
        ArrayList arrayList3;
        int id;
        MessageObject messageObject;
        long j4;
        long j5;
        Integer num;
        int i5;
        LongSparseArray longSparseArray2;
        Integer num2;
        int i6;
        DialogKey dialogKey;
        TLRPC.User user;
        String string;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        boolean z5;
        boolean zCanSendPlain;
        boolean z6;
        SharedPreferences sharedPreferences;
        String str3;
        long j6;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        String str4;
        TLRPC.User user3;
        TLRPC.Chat chat2;
        TLRPC.FileLocation fileLocation4;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.FileLocation fileLocation5;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation6;
        String str5;
        Notification notification;
        boolean z7;
        File file;
        Bitmap bitmap;
        String str6;
        TLRPC.Chat chat4;
        String str7;
        ?? r11;
        String string2;
        NotificationCompat.Action actionBuild;
        Integer num3;
        DialogKey dialogKey2;
        int iMax;
        String str8;
        Person person;
        long j7;
        Person personBuild;
        boolean z8;
        String str9;
        NotificationCompat.MessagingStyle messagingStyle;
        NotificationCompat.MessagingStyle messagingStyle2;
        int i7;
        boolean z9;
        StringBuilder sb;
        String[] strArr;
        boolean[] zArr;
        DialogKey dialogKey3;
        String str10;
        int size;
        int id2;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4;
        StringBuilder sb2;
        String str11;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList5;
        Bitmap bitmapLoadMultipleAvatars;
        int i8;
        MessageObject messageObject2;
        long topicId;
        long j8;
        String shortStringForMessage;
        String[] strArr2;
        boolean[] zArr2;
        String str12;
        String str13;
        String str14;
        int i9;
        ArrayList arrayList6;
        long senderId;
        long j9;
        Person personBuild2;
        String string3;
        NotificationCompat.MessagingStyle messagingStyle3;
        int i10;
        File pathToAttach;
        String str15;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation7;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation8;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation9;
        TLRPC.ReplyMarkup replyMarkup;
        Uri uriForFile;
        final File file2;
        final Uri uriForFile2;
        Intent intent;
        MessageObject messageObject3;
        String str16;
        String str17;
        String str18;
        String str19;
        DialogKey dialogKey4;
        LongSparseArray longSparseArray3;
        int i11;
        long[] jArr2;
        int i12;
        long j10;
        NotificationCompat.WearableExtender wearableExtender;
        NotificationCompat.Action action;
        int i13;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList7;
        NotificationCompat.Action actionBuild2;
        NotificationCompat.Action action2;
        Bitmap bitmap2;
        String string4;
        ArrayList arrayList8;
        long jMin;
        ArrayList arrayList9;
        int size2;
        NotificationCompat.Builder category;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        long j11;
        TLRPC.User user4;
        boolean z10;
        Notification notification2;
        int size3;
        int i14;
        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow;
        int size4;
        int i15;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton2;
        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback;
        Intent intent2;
        byte[] bArr;
        TLRPC.Message message;
        Intent intent3;
        int i16;
        ArrayList<String> arrayList10;
        ArrayList<Object> arrayList11;
        int iIntValue;
        boolean zBooleanValue;
        ArrayList<Object> arrayList12;
        boolean z11;
        long jMin2;
        int i17;
        String pluralString;
        TLRPC.FileLocation fileLocation10;
        Bitmap bitmap3;
        Bitmap bitmapDecodeFile;
        String string5;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        NotificationsController notificationsController = this;
        String str20 = "userId";
        String str21 = "chatId";
        String str22 = "storyId";
        String str23 = ".provider";
        String str24 = "%1$s: %2$s";
        String str25 = "max_id";
        FileLog.d("showExtraNotifications pushMessages.size()=" + notificationsController.pushMessages.size());
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = -1;
            builder.setChannelId(notificationsController.validateChannelId(j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
        } else {
            i4 = -1;
        }
        Notification notificationBuild = builder.build();
        SharedPreferences notificationsSettings = notificationsController.getAccountInstance().getNotificationsSettings();
        ArrayList arrayList13 = new ArrayList();
        if (!notificationsController.storyPushMessages.isEmpty()) {
            arrayList13.add(new DialogKey(0L, 0L, true));
        }
        LongSparseArray longSparseArray4 = new LongSparseArray();
        for (int i18 = 0; i18 < notificationsController.pushMessages.size(); i18++) {
            MessageObject messageObject4 = notificationsController.pushMessages.get(i18);
            long dialogId = messageObject4.getDialogId();
            long topicId2 = MessageObject.getTopicId(notificationsController.currentAccount, messageObject4.messageOwner, notificationsController.getMessagesController().isForum(messageObject4));
            int i19 = notificationsSettings.getInt("dismissDate" + dialogId, 0);
            if (!messageObject4.isStoryPush && messageObject4.messageOwner.date <= i19) {
                FileLog.d("showExtraNotifications: dialog " + dialogId + " is skipped, message date (" + messageObject4.messageOwner.date + " <= " + i19 + ")");
            } else {
                ArrayList arrayList14 = (ArrayList) longSparseArray4.get(dialogId);
                if (arrayList14 == null) {
                    arrayList14 = new ArrayList();
                    longSparseArray4.put(dialogId, arrayList14);
                    FileLog.d("showExtraNotifications: sortedDialogs += " + dialogId);
                    arrayList13.add(new DialogKey(dialogId, topicId2, false));
                }
                arrayList14.add(messageObject4);
            }
        }
        int i20 = 0;
        LongSparseArray longSparseArray5 = new LongSparseArray();
        for (int i21 = 0; i21 < notificationsController.wearNotificationsIds.size(); i21++) {
            longSparseArray5.put(notificationsController.wearNotificationsIds.keyAt(i21), (Integer) notificationsController.wearNotificationsIds.valueAt(i21));
        }
        notificationsController.wearNotificationsIds.clear();
        ArrayList arrayList15 = new ArrayList();
        int i22 = Build.VERSION.SDK_INT;
        if (i22 <= 27) {
            z4 = true;
        } else if (arrayList13.size() > (notificationsController.storyPushMessages.isEmpty() ? 1 : 2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && i22 >= 26) {
            checkOtherNotificationsChannel();
        }
        long clientUserId = notificationsController.getUserConfig().getClientUserId();
        boolean z12 = AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter;
        FileLog.d("showExtraNotifications: passcode=" + (SharedConfig.passcodeHash.length() > 0) + " waitingForPasscode=" + z12 + " selfUserId=" + clientUserId + " useSummaryNotification=" + z4);
        LongSparseArray longSparseArray6 = new LongSparseArray();
        int size5 = arrayList13.size();
        while (true) {
            if (i20 >= size5) {
                arrayList = arrayList15;
                break;
            }
            ArrayList arrayList16 = arrayList15;
            if (arrayList15.size() >= 7) {
                FileLog.d("showExtraNotifications: break from holders, count over 7");
                arrayList = arrayList16;
                break;
            }
            DialogKey dialogKey5 = (DialogKey) arrayList13.get(i20);
            ArrayList arrayList17 = arrayList13;
            String str26 = "showExtraNotifications: [";
            int i23 = i20;
            try {
                if (dialogKey5.story) {
                    ArrayList arrayList18 = new ArrayList();
                    if (notificationsController.storyPushMessages.isEmpty()) {
                        FileLog.d("showExtraNotifications: [" + dialogKey5.dialogId + "] continue; story but storyPushMessages is empty");
                        notification = notificationBuild;
                        sharedPreferences = notificationsSettings;
                        longSparseArray4 = longSparseArray4;
                        longSparseArray6 = longSparseArray6;
                        longSparseArray2 = longSparseArray5;
                        size5 = size5;
                        z4 = z4;
                        z12 = z12;
                        j6 = clientUserId;
                        arrayList16 = arrayList16;
                        arrayList17 = arrayList17;
                        i23 = i23;
                        str3 = str25;
                        str21 = str21;
                    } else {
                        long j12 = notificationsController.storyPushMessages.get(0).dialogId;
                        Iterator<Integer> it = notificationsController.storyPushMessages.get(0).dateByIds.keySet().iterator();
                        int iMax2 = 0;
                        while (it.hasNext()) {
                            iMax2 = Math.max(iMax2, it.next().intValue());
                            arrayList18 = arrayList18;
                        }
                        arrayList3 = arrayList18;
                        j4 = j12;
                        messageObject = null;
                        id = iMax2;
                        j3 = 0;
                    }
                    i20 = i23 + 1;
                    arrayList15 = arrayList16;
                    arrayList13 = arrayList17;
                    size5 = size5;
                    z4 = z4;
                    z12 = z12;
                    longSparseArray4 = longSparseArray4;
                    str21 = str21;
                    longSparseArray5 = longSparseArray2;
                    str25 = str3;
                    notificationsSettings = sharedPreferences;
                    clientUserId = j6;
                    notificationBuild = notification;
                    longSparseArray6 = longSparseArray6;
                } else {
                    long j13 = dialogKey5.dialogId;
                    j3 = dialogKey5.topicId;
                    ArrayList arrayList19 = (ArrayList) longSparseArray4.get(j13);
                    arrayList3 = arrayList19;
                    id = ((MessageObject) arrayList19.get(0)).getId();
                    messageObject = (MessageObject) arrayList19.get(0);
                    j4 = j13;
                }
                if (dialogKey5.story) {
                    longSparseArray2 = longSparseArray5;
                    TLRPC.User user5 = notificationsController.getMessagesController().getUser(Long.valueOf(j4));
                    num2 = num;
                    if (notificationsController.storyPushMessages.size() != 1) {
                        string = LocaleController.formatPluralString("Stories", notificationsController.storyPushMessages.size(), new Object[0]);
                    } else if (user5 != null) {
                        string = UserObject.getFirstName(user5);
                    } else {
                        string = notificationsController.storyPushMessages.get(0).localName;
                    }
                    if (user5 == null || (userProfilePhoto3 = user5.photo) == null || (fileLocation = userProfilePhoto3.photo_small) == null) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                        if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            chat = null;
                        }
                        z5 = false;
                        zCanSendPlain = false;
                        z6 = false;
                        dialogKey = dialogKey5;
                        user2 = user5;
                    }
                    chat = null;
                    fileLocation = null;
                    z5 = false;
                    zCanSendPlain = false;
                    z6 = false;
                    dialogKey = dialogKey5;
                    user2 = user5;
                } else {
                    notificationBuild = notificationBuild;
                    longSparseArray2 = longSparseArray5;
                    num2 = num;
                    i6 = i5;
                    if (!DialogObject.isEncryptedDialog(j4)) {
                        boolean z13 = (messageObject == null || messageObject.isReactionPush || messageObject.isStoryReactionPush || j4 == 777000) ? false : true;
                        if (DialogObject.isUserDialog(j4)) {
                            user3 = notificationsController.getMessagesController().getUser(Long.valueOf(j4));
                            if (user3 == null) {
                                if (messageObject.isFcmMessage()) {
                                    string = messageObject.localName;
                                    j4 = j4;
                                    zCanSendPlain = z13;
                                    dialogKey = dialogKey5;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found user to show dialog notification " + j4);
                                    }
                                    sharedPreferences = notificationsSettings;
                                    str3 = str25;
                                    j6 = j5;
                                    notification = notificationBuild;
                                }
                            } else {
                                j4 = j4;
                                String userName = UserObject.getUserName(user3);
                                zCanSendPlain = z13;
                                TLRPC.UserProfilePhoto userProfilePhoto4 = user3.photo;
                                if (userProfilePhoto4 == null || (fileLocation4 = userProfilePhoto4.photo_small) == null) {
                                    str5 = userName;
                                    dialogKey = dialogKey5;
                                } else {
                                    str5 = userName;
                                    dialogKey = dialogKey5;
                                    if (fileLocation4.volume_id != 0 && fileLocation4.local_id != 0) {
                                        string = str5;
                                    }
                                    if (j4 == 489001) {
                                        string = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                    } else if (j4 == 489000) {
                                        string = LocaleController.getString(R.string.VerifyCodesNotifications);
                                    } else if (UserObject.isReplyUser(j4)) {
                                        string = LocaleController.getString(R.string.RepliesTitle);
                                    } else if (j4 == j5) {
                                        string = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                                    }
                                    str26 = "showExtraNotifications: [";
                                    arrayList3 = arrayList3;
                                    chat2 = null;
                                    z5 = false;
                                    z6 = false;
                                    if (j4 == 489000 || messageObject == null || messageObject.getForwardedFromId() == null) {
                                        fileLocation5 = fileLocation4;
                                        chat3 = chat2;
                                    } else {
                                        Long forwardedFromId = messageObject.getForwardedFromId();
                                        fileLocation5 = fileLocation4;
                                        chat3 = chat2;
                                        long jLongValue = forwardedFromId.longValue();
                                        if (DialogObject.isUserDialog(jLongValue)) {
                                            TLRPC.UserProfilePhoto userProfilePhoto5 = getMessagesController().getUser(forwardedFromId).photo;
                                            if (userProfilePhoto5 != null && (fileLocation6 = userProfilePhoto5.photo_small) != null) {
                                                user2 = user3;
                                                if (fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                    fileLocation = fileLocation6;
                                                }
                                            }
                                            fileLocation = fileLocation5;
                                        } else {
                                            user2 = user3;
                                            TLRPC.ChatPhoto chatPhoto2 = getMessagesController().getChat(Long.valueOf(-jLongValue)).photo;
                                            if (chatPhoto2 == null || (fileLocation6 = chatPhoto2.photo_small) == null || fileLocation6.volume_id == 0 || fileLocation6.local_id == 0) {
                                                fileLocation = fileLocation5;
                                            } else {
                                                fileLocation = fileLocation6;
                                            }
                                        }
                                        chat = chat3;
                                        if (j4 == 489000) {
                                            zCanSendPlain = false;
                                        }
                                    }
                                    user2 = user3;
                                    fileLocation = fileLocation5;
                                    chat = chat3;
                                    if (j4 == 489000) {
                                        zCanSendPlain = false;
                                    }
                                }
                                string = str5;
                            }
                            fileLocation4 = null;
                            if (j4 == 489001) {
                                string = LocaleController.getString(R.string.BotAuthNotificationTitle);
                            } else if (j4 == 489000) {
                                string = LocaleController.getString(R.string.VerifyCodesNotifications);
                            } else if (UserObject.isReplyUser(j4)) {
                                string = LocaleController.getString(R.string.RepliesTitle);
                            } else if (j4 == j5) {
                                string = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                            }
                            str26 = "showExtraNotifications: [";
                            arrayList3 = arrayList3;
                            chat2 = null;
                            z5 = false;
                            z6 = false;
                            if (j4 == 489000) {
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                            } else {
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                            }
                            chat = chat3;
                            if (j4 == 489000) {
                                zCanSendPlain = false;
                            }
                        } else {
                            j4 = j4;
                            zCanSendPlain = z13;
                            dialogKey = dialogKey5;
                            TLRPC.Chat chat5 = notificationsController.getMessagesController().getChat(Long.valueOf(-j4));
                            if (chat5 == null) {
                                if (messageObject.isFcmMessage()) {
                                    boolean zIsSupergroup = messageObject.isSupergroup();
                                    string = messageObject.localName;
                                    chat2 = chat5;
                                    z6 = zIsSupergroup;
                                    str26 = "showExtraNotifications: [";
                                    arrayList3 = arrayList3;
                                    z5 = messageObject.localChannel;
                                    fileLocation4 = null;
                                    user3 = null;
                                    zCanSendPlain = false;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found chat to show dialog notification " + j4);
                                    }
                                    sharedPreferences = notificationsSettings;
                                    str3 = str25;
                                    j6 = j5;
                                    notification = notificationBuild;
                                }
                            } else {
                                boolean z14 = chat5.megagroup;
                                boolean z15 = ChatObject.isChannel(chat5) && !chat5.megagroup;
                                String title = notificationsController.getTitle(chat5);
                                z6 = z14;
                                TLRPC.ChatPhoto chatPhoto3 = chat5.photo;
                                if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                    str26 = "showExtraNotifications: [";
                                    arrayList3 = arrayList3;
                                } else {
                                    str26 = "showExtraNotifications: [";
                                    arrayList3 = arrayList3;
                                    if (fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                                    }
                                    if (j3 != 0) {
                                        fileLocation3 = fileLocation2;
                                        tL_forumTopicFindTopic = notificationsController.getMessagesController().getTopicsController().findTopic(chat5.id, j3);
                                        if (tL_forumTopicFindTopic != null) {
                                            str4 = tL_forumTopicFindTopic.title + " in " + title;
                                        }
                                        if (zCanSendPlain) {
                                            zCanSendPlain = ChatObject.canSendPlain(chat5);
                                        }
                                        z5 = z15;
                                        user3 = null;
                                        string = str4;
                                        chat2 = chat5;
                                        fileLocation4 = fileLocation3;
                                    } else {
                                        fileLocation3 = fileLocation2;
                                    }
                                    str4 = title;
                                    if (zCanSendPlain) {
                                        zCanSendPlain = ChatObject.canSendPlain(chat5);
                                    }
                                    z5 = z15;
                                    user3 = null;
                                    string = str4;
                                    chat2 = chat5;
                                    fileLocation4 = fileLocation3;
                                }
                                fileLocation2 = null;
                                if (j3 != 0) {
                                    fileLocation3 = fileLocation2;
                                    tL_forumTopicFindTopic = notificationsController.getMessagesController().getTopicsController().findTopic(chat5.id, j3);
                                    if (tL_forumTopicFindTopic != null) {
                                        str4 = tL_forumTopicFindTopic.title + " in " + title;
                                    }
                                    if (zCanSendPlain) {
                                        zCanSendPlain = ChatObject.canSendPlain(chat5);
                                    }
                                    z5 = z15;
                                    user3 = null;
                                    string = str4;
                                    chat2 = chat5;
                                    fileLocation4 = fileLocation3;
                                } else {
                                    fileLocation3 = fileLocation2;
                                }
                                str4 = title;
                                if (zCanSendPlain) {
                                    zCanSendPlain = ChatObject.canSendPlain(chat5);
                                }
                                z5 = z15;
                                user3 = null;
                                string = str4;
                                chat2 = chat5;
                                fileLocation4 = fileLocation3;
                            }
                            if (j4 == 489000) {
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                            } else {
                                fileLocation5 = fileLocation4;
                                chat3 = chat2;
                                user2 = user3;
                                fileLocation = fileLocation5;
                            }
                            chat = chat3;
                            if (j4 == 489000) {
                                zCanSendPlain = false;
                            }
                        }
                        i20 = i23 + 1;
                        arrayList15 = arrayList16;
                        arrayList13 = arrayList17;
                        size5 = size5;
                        z4 = z4;
                        z12 = z12;
                        longSparseArray4 = longSparseArray4;
                        str21 = str21;
                        longSparseArray5 = longSparseArray2;
                        str25 = str3;
                        notificationsSettings = sharedPreferences;
                        clientUserId = j6;
                        notificationBuild = notification;
                        longSparseArray6 = longSparseArray6;
                    } else {
                        str26 = "showExtraNotifications: [";
                        arrayList3 = arrayList3;
                        j4 = j4;
                        dialogKey = dialogKey5;
                        if (j4 != globalSecretChatId) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(j4);
                            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("not found secret chat to show dialog notification " + encryptedChatId);
                                }
                            } else {
                                user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                                if (user == null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("not found secret chat user to show dialog notification " + encryptedChat.user_id);
                                    }
                                }
                            }
                            notificationsController = this;
                            sharedPreferences = notificationsSettings;
                            str3 = str25;
                            j6 = j5;
                            notification = notificationBuild;
                        } else {
                            user = null;
                        }
                        string = LocaleController.getString(R.string.SecretChatName);
                        user2 = user;
                        chat = null;
                        fileLocation = null;
                        z5 = false;
                        zCanSendPlain = false;
                        z6 = false;
                    }
                    i20 = i23 + 1;
                    arrayList15 = arrayList16;
                    arrayList13 = arrayList17;
                    size5 = size5;
                    z4 = z4;
                    z12 = z12;
                    longSparseArray4 = longSparseArray4;
                    str21 = str21;
                    longSparseArray5 = longSparseArray2;
                    str25 = str3;
                    notificationsSettings = sharedPreferences;
                    clientUserId = j6;
                    notificationBuild = notification;
                    longSparseArray6 = longSparseArray6;
                }
                if ((z7 && !z6) || !zCanSendPlain || SharedConfig.isWaitingForPasscodeEnter || j5 == j4 || UserObject.isReplyUser(j4)) {
                    chat4 = chat;
                    notificationsController = this;
                } else {
                    chat4 = chat;
                    notificationsController = this;
                    if (MessagesController.getInstance(notificationsController.currentAccount).getSendPaidMessagesStars(j4) <= 0) {
                        file = file;
                        bitmap = bitmap;
                        Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) WearReplyReceiver.class);
                        intent4.putExtra("dialog_id", j4);
                        str3 = str25;
                        intent4.putExtra(str3, id);
                        intent4.putExtra("topic_id", j3);
                        intent4.putExtra("currentAccount", notificationsController.currentAccount);
                        if (arrayList3.isEmpty()) {
                            str7 = string;
                            user2 = user2;
                            arrayList3 = arrayList3;
                        } else {
                            ArrayList arrayList20 = new ArrayList();
                            str7 = string;
                            user2 = user2;
                            int i24 = 0;
                            while (i24 < arrayList3.size()) {
                                ArrayList arrayList21 = arrayList3;
                                MessageObject messageObject5 = (MessageObject) arrayList21.get(i24);
                                if (messageObject5 != null && messageObject5.isVoice() && messageObject5.isContentUnread() && !messageObject5.isOut()) {
                                    arrayList20.add(Integer.valueOf(messageObject5.getId()));
                                }
                                i24++;
                                arrayList3 = arrayList21;
                            }
                            arrayList3 = arrayList3;
                            if (!arrayList20.isEmpty()) {
                                int size6 = arrayList20.size();
                                int[] iArr = new int[size6];
                                for (int i25 = 0; i25 < size6; i25++) {
                                    iArr[i25] = ((Integer) arrayList20.get(i25)).intValue();
                                }
                                intent4.putExtra("voice_msg_ids", iArr);
                            }
                        }
                        PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent4, 167772160);
                        RemoteInput remoteInputBuild = new RemoteInput.Builder("extra_voice_reply").setLabel(LocaleController.getString(R.string.Reply)).build();
                        if (DialogObject.isChatDialog(j4)) {
                            string2 = LocaleController.formatString(R.string.ReplyToGroup, str7);
                            r11 = 1;
                        } else {
                            r11 = 1;
                            string2 = LocaleController.formatString(R.string.ReplyToUser, str7);
                        }
                        str6 = "dialog_id";
                        actionBuild = new NotificationCompat.Action.Builder(R.drawable.ic_reply_icon, string2, broadcast).setAllowGeneratedReplies(r11).setSemanticAction(r11).addRemoteInput(remoteInputBuild).setShowsUserInterface(false).build();
                    }
                    num3 = (Integer) notificationsController.pushDialogs.get(j4);
                    if (num3 == null) {
                        num3 = 0;
                    }
                    dialogKey2 = dialogKey;
                    if (dialogKey2.story) {
                        iMax = notificationsController.storyPushMessages.size();
                    } else {
                        iMax = Math.max(num3.intValue(), arrayList3.size());
                    }
                    str8 = (iMax > 1 || Build.VERSION.SDK_INT >= 28) ? str7 : String.format("%1$s (%2$d)", str7, Integer.valueOf(iMax));
                    person = (Person) longSparseArray6.get(j5);
                    if (Build.VERSION.SDK_INT >= 28 || person != null) {
                        j7 = j3;
                        personBuild = person;
                    } else {
                        TLRPC.User user6 = notificationsController.getMessagesController().getUser(Long.valueOf(j5));
                        if (user6 == null) {
                            user6 = notificationsController.getUserConfig().getCurrentUser();
                        }
                        if (user6 != null) {
                            try {
                                TLRPC.UserProfilePhoto userProfilePhoto6 = user6.photo;
                                if (userProfilePhoto6 == null || (fileLocation10 = userProfilePhoto6.photo_small) == null) {
                                    j7 = j3;
                                } else {
                                    j7 = j3;
                                    try {
                                        if (fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                            Person.Builder name = new Person.Builder().setName(LocaleController.getString(R.string.FromYou));
                                            loadRoundAvatar(notificationsController.getUserConfig().getClientUserId(), notificationsController.getFileLoader().getPathToAttach(user6.photo.photo_small, true), name);
                                            personBuild = name.build();
                                            try {
                                                longSparseArray6.put(j5, personBuild);
                                            } catch (Throwable th) {
                                                th = th;
                                                person = personBuild;
                                                FileLog.e(th);
                                                personBuild = person;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j7 = j3;
                            }
                            personBuild = person;
                        } else {
                            j7 = j3;
                            personBuild = person;
                        }
                    }
                    if (messageObject == null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    str9 = "";
                    if (personBuild == null && z8) {
                        messagingStyle = new NotificationCompat.MessagingStyle(personBuild);
                    } else {
                        messagingStyle = new NotificationCompat.MessagingStyle("");
                    }
                    messagingStyle2 = messagingStyle;
                    i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 28 || ((DialogObject.isChatDialog(j4) && !z7) || UserObject.isReplyUser(j4))) {
                        messagingStyle2.setConversationTitle(str8);
                    }
                    if (i7 >= 28 || ((!z7 && DialogObject.isChatDialog(j4)) || UserObject.isReplyUser(j4))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    messagingStyle2.setGroupConversation(z9);
                    sb = new StringBuilder();
                    j6 = j5;
                    strArr = new String[1];
                    zArr = new boolean[1];
                    if (dialogKey2.story) {
                        arrayList10 = new ArrayList<>();
                        arrayList11 = new ArrayList<>();
                        Pair<Integer, Boolean> storyPushes = notificationsController.parseStoryPushes(arrayList10, arrayList11);
                        iIntValue = ((Integer) storyPushes.first).intValue();
                        zBooleanValue = ((Boolean) storyPushes.second).booleanValue();
                        if (zBooleanValue) {
                            arrayList12 = arrayList11;
                            sb.append(LocaleController.formatPluralString("StoryNotificationHidden", iIntValue, new Object[0]));
                        } else {
                            arrayList12 = arrayList11;
                            if (arrayList10.isEmpty()) {
                                FileLog.d(str26 + j4 + "] continue; story but names is empty");
                                notification = notificationBuild;
                                i20 = i23 + 1;
                                arrayList15 = arrayList16;
                                arrayList13 = arrayList17;
                                size5 = size5;
                                z4 = z4;
                                z12 = z12;
                                longSparseArray4 = longSparseArray4;
                                str21 = str21;
                                longSparseArray5 = longSparseArray2;
                                str25 = str3;
                                notificationsSettings = sharedPreferences;
                                clientUserId = j6;
                                notificationBuild = notification;
                                longSparseArray6 = longSparseArray6;
                            } else {
                                if (arrayList10.size() == 1) {
                                    if (iIntValue == 1) {
                                        sb.append(LocaleController.getString("StoryNotificationSingle"));
                                    } else {
                                        sb.append(LocaleController.formatPluralString("StoryNotification1", iIntValue, arrayList10.get(0)));
                                    }
                                } else if (arrayList10.size() == 2) {
                                    z11 = zBooleanValue;
                                    sb.append(LocaleController.formatString(R.string.StoryNotification2, arrayList10.get(0), arrayList10.get(1)));
                                } else {
                                    z11 = zBooleanValue;
                                    if (arrayList10.size() == 3 || notificationsController.storyPushMessages.size() != 3) {
                                        sb.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList10.get(0)), notificationsController.cutLastName(arrayList10.get(1))));
                                    } else {
                                        sb.append(LocaleController.formatString(R.string.StoryNotification3, notificationsController.cutLastName(arrayList10.get(0)), notificationsController.cutLastName(arrayList10.get(1)), notificationsController.cutLastName(arrayList10.get(2))));
                                    }
                                }
                                jMin2 = Long.MAX_VALUE;
                                i17 = 0;
                                while (i17 < notificationsController.storyPushMessages.size()) {
                                    jMin2 = Math.min(notificationsController.storyPushMessages.get(i17).date, jMin2);
                                    i17++;
                                    dialogKey2 = dialogKey2;
                                }
                                dialogKey3 = dialogKey2;
                                messagingStyle2.setGroupConversation(false);
                                if (arrayList10.size() == 1 || z11) {
                                    pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                                } else {
                                    pluralString = arrayList10.get(0);
                                }
                                messagingStyle2.addMessage(sb, jMin2, new Person.Builder().setName(pluralString).build());
                                if (z11) {
                                    arrayList5 = null;
                                    bitmapLoadMultipleAvatars = null;
                                } else {
                                    bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList12);
                                    arrayList5 = null;
                                }
                                i8 = 0;
                                str11 = pluralString;
                                sb2 = sb;
                            }
                        }
                        z11 = zBooleanValue;
                        jMin2 = Long.MAX_VALUE;
                        i17 = 0;
                        while (i17 < notificationsController.storyPushMessages.size()) {
                            jMin2 = Math.min(notificationsController.storyPushMessages.get(i17).date, jMin2);
                            i17++;
                            dialogKey2 = dialogKey2;
                        }
                        dialogKey3 = dialogKey2;
                        messagingStyle2.setGroupConversation(false);
                        if (arrayList10.size() == 1) {
                            pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                        } else {
                            pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                        }
                        messagingStyle2.addMessage(sb, jMin2, new Person.Builder().setName(pluralString).build());
                        if (z11) {
                            bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList12);
                            arrayList5 = null;
                        } else {
                            arrayList5 = null;
                            bitmapLoadMultipleAvatars = null;
                        }
                        i8 = 0;
                        str11 = pluralString;
                        sb2 = sb;
                    } else {
                        dialogKey3 = dialogKey2;
                        str10 = str26;
                        size = arrayList3.size() - 1;
                        id2 = 0;
                        arrayList4 = null;
                        while (size >= 0) {
                            messageObject2 = (MessageObject) arrayList3.get(size);
                            int i26 = size;
                            int i27 = id2;
                            MessageObject messageObject6 = messageObject;
                            topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, notificationsController.getMessagesController().isForum(messageObject2));
                            if (j7 != topicId) {
                                FileLog.d(str10 + j4 + "] continue; topic id is not equal: topicId=" + j7 + " messageTopicId=" + topicId + "; selfId=" + notificationsController.getUserConfig().getClientUserId());
                                zArr2 = zArr;
                                j9 = j7;
                                strArr2 = strArr;
                            } else {
                                j8 = j7;
                                shortStringForMessage = notificationsController.getShortStringForMessage(messageObject2, strArr, zArr);
                                if (j4 == 489001) {
                                    strArr[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                    strArr2 = strArr;
                                    zArr2 = zArr;
                                } else if (j4 == 489000 || messageObject2.getForwardedFromId() == null) {
                                    strArr2 = strArr;
                                    zArr2 = zArr;
                                    if (j4 == j6) {
                                        strArr2[0] = str7;
                                    } else if (DialogObject.isChatDialog(j4) && messageObject2.messageOwner.from_scheduled) {
                                        strArr2[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                    }
                                } else {
                                    strArr2 = strArr;
                                    zArr2 = zArr;
                                    strArr2[0] = notificationsController.getMessagesController().getPeerName(messageObject2.getForwardedFromId().longValue());
                                }
                                if (shortStringForMessage == null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.w("message text is null for " + messageObject2.getId() + " did = " + messageObject2.getDialogId());
                                    }
                                    j9 = j8;
                                } else {
                                    if (sb.length() > 0) {
                                        sb.append("\n\n");
                                    }
                                    if (j4 == j6 && messageObject2.messageOwner.from_scheduled && DialogObject.isUserDialog(j4)) {
                                        str12 = str24;
                                        shortStringForMessage = String.format(str12, LocaleController.getString(R.string.NotificationMessageScheduledName), shortStringForMessage);
                                        sb.append(shortStringForMessage);
                                    } else {
                                        str12 = str24;
                                        str13 = strArr2[0];
                                        if (str13 != null) {
                                            sb.append(String.format(str12, str13, shortStringForMessage));
                                        } else {
                                            sb.append(shortStringForMessage);
                                        }
                                    }
                                    str14 = shortStringForMessage;
                                    i9 = (j4 > 489000L ? 1 : (j4 == 489000L ? 0 : -1));
                                    if (i9 != 0 && messageObject2.getForwardedFromId() != null) {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                        senderId = messageObject2.getForwardedFromId().longValue();
                                    } else {
                                        if (DialogObject.isUserDialog(j4)) {
                                            sb = sb;
                                            arrayList6 = arrayList3;
                                        } else if (z7) {
                                            sb = sb;
                                            arrayList6 = arrayList3;
                                            senderId = -j4;
                                        } else {
                                            sb = sb;
                                            arrayList6 = arrayList3;
                                            if (DialogObject.isChatDialog(j4)) {
                                                senderId = messageObject2.getSenderId();
                                            }
                                        }
                                        senderId = j4;
                                    }
                                    str10 = str10;
                                    j9 = j8;
                                    personBuild2 = (Person) longSparseArray6.get(senderId + (j8 << 16));
                                    string3 = strArr2[0];
                                    if (string3 != null) {
                                        if (z12 == 0) {
                                            if (DialogObject.isChatDialog(j4)) {
                                                if (z7) {
                                                    if (Build.VERSION.SDK_INT > 27) {
                                                        string3 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                    }
                                                } else {
                                                    string3 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                                }
                                            } else if (Build.VERSION.SDK_INT > 27) {
                                                string3 = LocaleController.getString(R.string.NotificationHiddenName);
                                            }
                                        }
                                        string3 = str9;
                                    }
                                    if (personBuild2 == null && TextUtils.equals(personBuild2.getName(), string3)) {
                                        str24 = str12;
                                        messagingStyle3 = messagingStyle2;
                                    } else {
                                        Person.Builder name2 = new Person.Builder().setName(string3);
                                        if (zArr2[0] || DialogObject.isEncryptedDialog(j4) || Build.VERSION.SDK_INT < 28) {
                                            str24 = str12;
                                            messagingStyle3 = messagingStyle2;
                                        } else {
                                            if (DialogObject.isUserDialog(j4) || z7) {
                                                i10 = i9;
                                                str24 = str12;
                                                pathToAttach = file;
                                            } else {
                                                long senderId2 = messageObject2.getSenderId();
                                                i10 = i9;
                                                str24 = str12;
                                                TLRPC.User user7 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId2));
                                                if (user7 == null && (user7 = notificationsController.getMessagesStorage().getUserSync(senderId2)) != null) {
                                                    notificationsController.getMessagesController().putUser(user7, true);
                                                }
                                                pathToAttach = (user7 == null || (userProfilePhoto2 = user7.photo) == null || (fileLocation9 = userProfilePhoto2.photo_small) == null || fileLocation9.volume_id == 0 || fileLocation9.local_id == 0) ? null : notificationsController.getFileLoader().getPathToAttach(user7.photo.photo_small, true);
                                            }
                                            if (pathToAttach == null && i10 == 0 && messageObject2.getForwardedFromId() != null) {
                                                if (senderId >= 0) {
                                                    TLRPC.User user8 = notificationsController.getMessagesController().getUser(Long.valueOf(senderId));
                                                    if (user8 == null || (userProfilePhoto = user8.photo) == null || (fileLocation8 = userProfilePhoto.photo_small) == null) {
                                                        messagingStyle3 = messagingStyle2;
                                                    } else {
                                                        messagingStyle3 = messagingStyle2;
                                                        str15 = str9;
                                                        if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                            pathToAttach = notificationsController.getFileLoader().getPathToAttach(user8.photo.photo_small, true);
                                                        }
                                                    }
                                                } else {
                                                    messagingStyle3 = messagingStyle2;
                                                    str15 = str9;
                                                    TLRPC.Chat chat6 = notificationsController.getMessagesController().getChat(Long.valueOf(-senderId));
                                                    if (chat6 != null && (chatPhoto = chat6.photo) != null && (fileLocation7 = chatPhoto.photo_small) != null) {
                                                        str9 = str15;
                                                        if (fileLocation7.volume_id != 0 && fileLocation7.local_id != 0) {
                                                            pathToAttach = notificationsController.getFileLoader().getPathToAttach(chat6.photo.photo_small, true);
                                                        }
                                                    }
                                                }
                                                str9 = str15;
                                            } else {
                                                messagingStyle3 = messagingStyle2;
                                            }
                                            loadRoundAvatar(j4, pathToAttach, name2);
                                        }
                                        personBuild2 = name2.build();
                                        longSparseArray6.put(senderId, personBuild2);
                                    }
                                    if (!DialogObject.isEncryptedDialog(j4)) {
                                        if (zArr2[0] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).isLowRamDevice() || z12 != 0 || messageObject2.isSecretMedia() || !(messageObject2.type == 1 || messageObject2.isSticker())) {
                                            arrayList3 = arrayList6;
                                            str23 = str23;
                                        } else {
                                            File pathToMessage = notificationsController.getFileLoader().getPathToMessage(messageObject2.messageOwner);
                                            if (pathToMessage.exists() && messageObject2.hasMediaSpoilers()) {
                                                file2 = new File(pathToMessage.getParentFile(), pathToMessage.getName() + ".blur.jpg");
                                                if (file2.exists()) {
                                                    arrayList3 = arrayList6;
                                                } else {
                                                    try {
                                                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(pathToMessage.getAbsolutePath());
                                                        Bitmap bitmapStackBlurBitmapMax = Utilities.stackBlurBitmapMax(bitmapDecodeFile2);
                                                        bitmapDecodeFile2.recycle();
                                                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapStackBlurBitmapMax, bitmapDecodeFile2.getWidth(), bitmapDecodeFile2.getHeight(), true);
                                                        Utilities.stackBlurBitmap(bitmapCreateScaledBitmap, 5);
                                                        bitmapStackBlurBitmapMax.recycle();
                                                        Canvas canvas = new Canvas(bitmapCreateScaledBitmap);
                                                        try {
                                                            notificationsController.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i4) * 0.325f)));
                                                            i4 = -1;
                                                            arrayList3 = arrayList6;
                                                            try {
                                                                notificationsController.mediaSpoilerEffect.setBounds(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
                                                                notificationsController.mediaSpoilerEffect.draw(canvas);
                                                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                fileOutputStream.close();
                                                                bitmapCreateScaledBitmap.recycle();
                                                                pathToMessage = file2;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                FileLog.e(e);
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            arrayList3 = arrayList6;
                                                            i4 = -1;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        arrayList3 = arrayList6;
                                                    }
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                                file2 = null;
                                            }
                                            NotificationCompat.MessagingStyle.Message message2 = new NotificationCompat.MessagingStyle.Message(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                            String str27 = messageObject2.isSticker() ? "image/webp" : "image/jpeg";
                                            if (pathToMessage.exists()) {
                                                try {
                                                    Context context = ApplicationLoader.applicationContext;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(ApplicationLoader.getApplicationId());
                                                    str23 = str23;
                                                    try {
                                                        sb3.append(str23);
                                                        uriForFile2 = FileProvider.getUriForFile(context, sb3.toString(), pathToMessage);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        FileLog.e(e);
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    str23 = str23;
                                                }
                                            } else {
                                                str23 = str23;
                                                uriForFile2 = notificationsController.getFileLoader().isLoadingFile(pathToMessage.getName()) ? new Uri.Builder().scheme("content").authority(NotificationImageProvider.getAuthority()).appendPath("msg_media_raw").appendPath(notificationsController.currentAccount + str9).appendPath(pathToMessage.getName()).appendQueryParameter("final_path", pathToMessage.getAbsolutePath()).build() : null;
                                            }
                                            if (uriForFile2 != null) {
                                                message2.setData(str27, uriForFile2);
                                                messagingStyle2 = messagingStyle3;
                                                messagingStyle2.addMessage(message2);
                                                ApplicationLoader.applicationContext.grantUriPermission("com.android.systemui", uriForFile2, 1);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        NotificationsController.$r8$lambda$gQghIUHs5ZKeIK8dHwFQ_2pzquE(uriForFile2, file2);
                                                    }
                                                }, 20000L);
                                                if (!TextUtils.isEmpty(messageObject2.caption)) {
                                                    messagingStyle2.addMessage(messageObject2.caption, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                                }
                                            }
                                            if (!zArr2[0] && z12 == 0 && messageObject2.isVoice()) {
                                                List messages = messagingStyle2.getMessages();
                                                if (!messages.isEmpty()) {
                                                    File pathToMessage2 = notificationsController.getFileLoader().getPathToMessage(messageObject2.messageOwner);
                                                    if (pathToMessage2.exists()) {
                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                            try {
                                                                uriForFile = FileProvider.getUriForFile(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + str23, pathToMessage2);
                                                            } catch (Exception unused) {
                                                                uriForFile = null;
                                                            }
                                                        } else {
                                                            uriForFile = Uri.fromFile(pathToMessage2);
                                                        }
                                                        if (uriForFile != null) {
                                                            ((NotificationCompat.MessagingStyle.Message) messages.get(messages.size() - 1)).setData("audio/ogg", uriForFile);
                                                        }
                                                    } else if (messageObject2.getDocument() != null) {
                                                        String attachFileName = FileLoader.getAttachFileName(messageObject2.getDocument());
                                                        if (!notificationsController.pendingVoiceLoads.contains(attachFileName)) {
                                                            notificationsController.pendingVoiceLoads.add(attachFileName);
                                                            notificationsController.getFileLoader().loadFile(messageObject2.getDocument(), messageObject2, 3, 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        messagingStyle2 = messagingStyle3;
                                        messagingStyle2.addMessage(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                        if (!zArr2[0]) {
                                        }
                                    } else {
                                        arrayList3 = arrayList6;
                                        str23 = str23;
                                        messagingStyle2 = messagingStyle3;
                                        messagingStyle2.addMessage(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                    }
                                    if (j4 == 777000) {
                                        replyMarkup = messageObject2.messageOwner.reply_markup;
                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                            arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                            id2 = messageObject2.getId();
                                        } else {
                                            id2 = i27;
                                        }
                                    } else {
                                        id2 = i27;
                                    }
                                }
                                size = i26 - 1;
                                messagingStyle2 = messagingStyle2;
                                str23 = str23;
                                sb = sb;
                                str10 = str10;
                                strArr = strArr2;
                                messageObject = messageObject6;
                                zArr = zArr2;
                                str24 = str24;
                                j7 = j9;
                                arrayList3 = arrayList3;
                            }
                            id2 = i27;
                            size = i26 - 1;
                            messagingStyle2 = messagingStyle2;
                            str23 = str23;
                            sb = sb;
                            str10 = str10;
                            strArr = strArr2;
                            messageObject = messageObject6;
                            zArr = zArr2;
                            str24 = str24;
                            j7 = j9;
                            arrayList3 = arrayList3;
                        }
                        arrayList3 = arrayList3;
                        messagingStyle2 = messagingStyle2;
                        messageObject = messageObject;
                        str24 = str24;
                        str23 = str23;
                        j7 = j7;
                        sb2 = sb;
                        str11 = str7;
                        arrayList5 = arrayList4;
                        bitmapLoadMultipleAvatars = bitmap;
                        i8 = id2;
                    }
                    intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
                    intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
                    intent.setFlags(67108864);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    messageObject3 = messageObject;
                    if (messageObject == null && messageObject3.isOauthPush) {
                        intent.putExtra("oauth_url", messageObject3.localName);
                    } else {
                        if (messageObject3 == null && messageObject3.isStoryReactionPush) {
                            intent.putExtra(str22, Math.abs(messageObject3.getId()));
                        } else {
                            str16 = str22;
                            if (messageObject3 == null && messageObject3.isLiveStoryPush) {
                                if (j4 < 0) {
                                    str17 = str11;
                                    str18 = str21;
                                    intent.putExtra(str18, -j4);
                                    str19 = str20;
                                } else {
                                    str17 = str11;
                                    str18 = str21;
                                    str19 = str20;
                                    if (j4 > 0) {
                                        intent.putExtra(str19, j4);
                                    }
                                }
                                intent.putExtra(str16, Math.abs(messageObject3.getId()));
                                longSparseArray3 = longSparseArray6;
                                str22 = str16;
                                i11 = i8;
                                dialogKey4 = dialogKey3;
                            } else {
                                str17 = str11;
                                str18 = str21;
                                str19 = str20;
                                dialogKey4 = dialogKey3;
                                if (dialogKey4.story) {
                                    jArr2 = new long[notificationsController.storyPushMessages.size()];
                                    longSparseArray3 = longSparseArray6;
                                    str22 = str16;
                                    i12 = 0;
                                    while (i12 < notificationsController.storyPushMessages.size()) {
                                        jArr2[i12] = notificationsController.storyPushMessages.get(i12).dialogId;
                                        i12++;
                                        i8 = i8;
                                    }
                                    i11 = i8;
                                    intent.putExtra("storyDialogIds", jArr2);
                                } else {
                                    longSparseArray3 = longSparseArray6;
                                    str22 = str16;
                                    i11 = i8;
                                    if (DialogObject.isEncryptedDialog(j4)) {
                                        intent.putExtra("encId", DialogObject.getEncryptedChatId(j4));
                                    } else if (DialogObject.isUserDialog(j4)) {
                                        intent.putExtra(str19, j4);
                                    } else {
                                        intent.putExtra(str18, -j4);
                                    }
                                }
                            }
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("show extra notifications chatId ");
                        sb4.append(j4);
                        sb4.append(" topicId ");
                        j10 = j7;
                        sb4.append(j10);
                        FileLog.d(sb4.toString());
                        if (j10 != 0) {
                            intent.putExtra("topicId", j10);
                        }
                        intent.putExtra("currentAccount", notificationsController.currentAccount);
                        str20 = str19;
                        PendingIntent activity = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                        wearableExtender = new NotificationCompat.WearableExtender();
                        action = actionBuild;
                        if (actionBuild != null) {
                            wearableExtender.addAction(action);
                        }
                        String str28 = str23;
                        Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                        intent5.addFlags(32);
                        str21 = str18;
                        intent5.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                        intent5.putExtra(str6, j4);
                        i13 = id;
                        intent5.putExtra(str3, i13);
                        intent5.putExtra("currentAccount", notificationsController.currentAccount);
                        arrayList7 = arrayList5;
                        actionBuild2 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent5, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                        if (DialogObject.isEncryptedDialog(j4)) {
                            action2 = actionBuild2;
                            bitmap2 = bitmapLoadMultipleAvatars;
                            if (j4 != globalSecretChatId) {
                                string4 = "tgenc" + DialogObject.getEncryptedChatId(j4) + "_" + i13;
                            } else {
                                string4 = null;
                            }
                        } else if (DialogObject.isUserDialog(j4)) {
                            string4 = "tguser" + j4 + "_" + i13;
                            action2 = actionBuild2;
                            bitmap2 = bitmapLoadMultipleAvatars;
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("tgchat");
                            action2 = actionBuild2;
                            bitmap2 = bitmapLoadMultipleAvatars;
                            sb5.append(-j4);
                            sb5.append("_");
                            sb5.append(i13);
                            string4 = sb5.toString();
                        }
                        if (string4 != null) {
                            wearableExtender.setDismissalId(string4);
                            NotificationCompat.WearableExtender wearableExtender2 = new NotificationCompat.WearableExtender();
                            wearableExtender2.setDismissalId("summary_" + string4);
                            builder.extend(wearableExtender2);
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("tgaccount");
                        j6 = j6;
                        sb6.append(j6);
                        wearableExtender.setBridgeTag(sb6.toString());
                        if (dialogKey4.story) {
                            jMin = Long.MAX_VALUE;
                            for (i16 = 0; i16 < notificationsController.storyPushMessages.size(); i16++) {
                                jMin = Math.min(notificationsController.storyPushMessages.get(i16).date, jMin);
                            }
                            arrayList8 = arrayList3;
                        } else {
                            arrayList8 = arrayList3;
                            jMin = ((long) ((MessageObject) arrayList8.get(0)).messageOwner.date) * 1000;
                        }
                        String str29 = str17;
                        arrayList9 = arrayList8;
                        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str29).setSmallIcon(R.drawable.notification).setContentText(sb2.toString()).setAutoCancel(true);
                        if (dialogKey4.story) {
                            size2 = notificationsController.storyPushMessages.size();
                        } else {
                            size2 = arrayList9.size();
                        }
                        category = autoCancel.setNumber(size2).setColor(-15618822).setGroupSummary(false).setWhen(jMin).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - jMin)).setCategory("msg");
                        intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                        intent3.putExtra("messageDate", i6);
                        intent3.putExtra("dialogId", j4);
                        intent3.putExtra("currentAccount", notificationsController.currentAccount);
                        if (dialogKey4.story) {
                            intent3.putExtra("story", true);
                        }
                        if (messageObject3 != null && messageObject3.isStoryReactionPush) {
                            intent3.putExtra("storyReaction", true);
                        }
                        category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent3, 167772160));
                        if (z4 != 0) {
                            category.setGroup(notificationsController.notificationGroup);
                            category.setGroupAlertBehavior(1);
                        }
                        if (messageObject3 != null || (message = messageObject3.messageOwner) == null) {
                            tL_inlineButtonTypeCopy = null;
                            keyboardInlineButton = null;
                        } else {
                            TLRPC.ReplyMarkup replyMarkup2 = message.reply_markup;
                            if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup2;
                                keyboardInlineButton = null;
                                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = null;
                                for (int i28 = 0; i28 < tL_replyInlineMarkup.rows.size(); i28++) {
                                    for (int i29 = 0; i29 < tL_replyInlineMarkup.rows.get(i28).buttons.size(); i29++) {
                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = tL_replyInlineMarkup.rows.get(i28).buttons.get(i29);
                                        tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) TLKeyboardHelper.getType(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                        if (tL_inlineButtonTypeCopy2 != null) {
                                            keyboardInlineButton = keyboardInlineButton3;
                                            break;
                                        }
                                    }
                                    if (keyboardInlineButton != null) {
                                        break;
                                    }
                                }
                                tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                            } else {
                                tL_inlineButtonTypeCopy = null;
                                keyboardInlineButton = null;
                            }
                        }
                        if (keyboardInlineButton != null) {
                            Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                            intent6.addFlags(32);
                            intent6.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                            intent6.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                            category.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent6, 167772160)).setShowsUserInterface(false).build());
                        }
                        j11 = dialogKey4.dialogId;
                        if (j11 != 489000 && j11 != 489001) {
                            if (action != null) {
                                category.addAction(action);
                            }
                            if (!z12 && !dialogKey4.story && (messageObject3 == null || !messageObject3.isStoryReactionPush)) {
                                category.addAction(action2);
                            }
                        }
                        if (arrayList17.size() != 1 && !TextUtils.isEmpty(str) && !dialogKey4.story) {
                            category.setSubText(str);
                        }
                        if (DialogObject.isEncryptedDialog(j4)) {
                            category.setLocalOnly(true);
                        }
                        if (bitmap2 != null) {
                            category.setLargeIcon(bitmap2);
                        }
                        if (!AndroidUtilities.needShowPasscode(false) && !SharedConfig.isWaitingForPasscodeEnter && arrayList7 != null) {
                            size3 = arrayList7.size();
                            i14 = 0;
                            while (i14 < size3) {
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList22 = arrayList7;
                                keyboardInlineButtonRow = arrayList22.get(i14);
                                size4 = keyboardInlineButtonRow.buttons.size();
                                i15 = 0;
                                while (i15 < size4) {
                                    keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i15);
                                    tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) TLKeyboardHelper.getType(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                    int i30 = size3;
                                    if (tL_inlineButtonTypeCallback != null) {
                                        intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                        intent2.putExtra("currentAccount", notificationsController.currentAccount);
                                        intent2.putExtra("did", j4);
                                        bArr = tL_inlineButtonTypeCallback.data;
                                        if (bArr != null) {
                                            intent2.putExtra("data", bArr);
                                        }
                                        intent2.putExtra("mid", i11);
                                        String str30 = keyboardInlineButton2.text;
                                        Context context2 = ApplicationLoader.applicationContext;
                                        int i31 = notificationsController.lastButtonId;
                                        notificationsController.lastButtonId = i31 + 1;
                                        category.addAction(0, str30, PendingIntent.getBroadcast(context2, i31, intent2, 167772160));
                                    }
                                    i15++;
                                    size3 = i30;
                                    i14 = i14;
                                }
                                i14++;
                                size3 = size3;
                                arrayList7 = arrayList22;
                            }
                        }
                        if (chat4 == null || user2 == null) {
                            user4 = user2;
                        } else {
                            user4 = user2;
                            String str31 = user4.phone;
                            if (str31 != null && str31.length() > 0) {
                                category.addPerson("tel:+" + user4.phone);
                            }
                        }
                        z10 = z4;
                        notification2 = notificationBuild;
                        if (Build.VERSION.SDK_INT >= 26) {
                            notificationsController.setNotificationChannel(notification2, category, z10);
                        }
                        FileLog.d("showExtraNotifications: holders.add " + j4);
                        notification = notification2;
                        z4 = z10;
                        long j14 = j4;
                        arrayList17 = arrayList17;
                        i23 = i23;
                        longSparseArray6 = longSparseArray3;
                        str24 = str24;
                        str23 = str28;
                        C1NotificationHolder c1NotificationHolder = notificationsController.new C1NotificationHolder(num2.intValue(), j14, dialogKey4.story, j10, str29, user4, chat4, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                        arrayList16 = arrayList16;
                        arrayList16.add(c1NotificationHolder);
                        notificationsController.wearNotificationsIds.put(j14, num2);
                        i20 = i23 + 1;
                        arrayList15 = arrayList16;
                        arrayList13 = arrayList17;
                        size5 = size5;
                        z4 = z4;
                        z12 = z12;
                        longSparseArray4 = longSparseArray4;
                        str21 = str21;
                        longSparseArray5 = longSparseArray2;
                        str25 = str3;
                        notificationsSettings = sharedPreferences;
                        clientUserId = j6;
                        notificationBuild = notification;
                        longSparseArray6 = longSparseArray6;
                    }
                    longSparseArray3 = longSparseArray6;
                    str17 = str11;
                    str18 = str21;
                    str19 = str20;
                    dialogKey4 = dialogKey3;
                    i11 = i8;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("show extra notifications chatId ");
                    sb7.append(j4);
                    sb7.append(" topicId ");
                    j10 = j7;
                    sb7.append(j10);
                    FileLog.d(sb7.toString());
                    if (j10 != 0) {
                        intent.putExtra("topicId", j10);
                    }
                    intent.putExtra("currentAccount", notificationsController.currentAccount);
                    str20 = str19;
                    PendingIntent activity2 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
                    wearableExtender = new NotificationCompat.WearableExtender();
                    action = actionBuild;
                    if (actionBuild != null) {
                        wearableExtender.addAction(action);
                    }
                    String str210 = str23;
                    Intent intent7 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
                    intent7.addFlags(32);
                    str21 = str18;
                    intent7.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent7.putExtra(str6, j4);
                    i13 = id;
                    intent7.putExtra(str3, i13);
                    intent7.putExtra("currentAccount", notificationsController.currentAccount);
                    arrayList7 = arrayList5;
                    actionBuild2 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent7, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
                    if (DialogObject.isEncryptedDialog(j4)) {
                        action2 = actionBuild2;
                        bitmap2 = bitmapLoadMultipleAvatars;
                        if (j4 != globalSecretChatId) {
                            string4 = "tgenc" + DialogObject.getEncryptedChatId(j4) + "_" + i13;
                        } else {
                            string4 = null;
                        }
                    } else if (DialogObject.isUserDialog(j4)) {
                        string4 = "tguser" + j4 + "_" + i13;
                        action2 = actionBuild2;
                        bitmap2 = bitmapLoadMultipleAvatars;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("tgchat");
                        action2 = actionBuild2;
                        bitmap2 = bitmapLoadMultipleAvatars;
                        sb8.append(-j4);
                        sb8.append("_");
                        sb8.append(i13);
                        string4 = sb8.toString();
                    }
                    if (string4 != null) {
                        wearableExtender.setDismissalId(string4);
                        NotificationCompat.WearableExtender wearableExtender3 = new NotificationCompat.WearableExtender();
                        wearableExtender3.setDismissalId("summary_" + string4);
                        builder.extend(wearableExtender3);
                    }
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("tgaccount");
                    j6 = j6;
                    sb9.append(j6);
                    wearableExtender.setBridgeTag(sb9.toString());
                    if (dialogKey4.story) {
                        jMin = Long.MAX_VALUE;
                        while (i16 < notificationsController.storyPushMessages.size()) {
                            jMin = Math.min(notificationsController.storyPushMessages.get(i16).date, jMin);
                        }
                        arrayList8 = arrayList3;
                    } else {
                        arrayList8 = arrayList3;
                        jMin = ((long) ((MessageObject) arrayList8.get(0)).messageOwner.date) * 1000;
                    }
                    String str211 = str17;
                    arrayList9 = arrayList8;
                    NotificationCompat.Builder autoCancel2 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str211).setSmallIcon(R.drawable.notification).setContentText(sb2.toString()).setAutoCancel(true);
                    if (dialogKey4.story) {
                        size2 = notificationsController.storyPushMessages.size();
                    } else {
                        size2 = arrayList9.size();
                    }
                    category = autoCancel2.setNumber(size2).setColor(-15618822).setGroupSummary(false).setWhen(jMin).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity2).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - jMin)).setCategory("msg");
                    intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                    intent3.putExtra("messageDate", i6);
                    intent3.putExtra("dialogId", j4);
                    intent3.putExtra("currentAccount", notificationsController.currentAccount);
                    if (dialogKey4.story) {
                        intent3.putExtra("story", true);
                    }
                    if (messageObject3 != null) {
                        intent3.putExtra("storyReaction", true);
                    }
                    category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent3, 167772160));
                    if (z4 != 0) {
                        category.setGroup(notificationsController.notificationGroup);
                        category.setGroupAlertBehavior(1);
                    }
                    if (messageObject3 != null) {
                        tL_inlineButtonTypeCopy = null;
                        keyboardInlineButton = null;
                    } else {
                        tL_inlineButtonTypeCopy = null;
                        keyboardInlineButton = null;
                    }
                    if (keyboardInlineButton != null) {
                        Intent intent8 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                        intent8.addFlags(32);
                        intent8.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                        intent8.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                        category.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent8, 167772160)).setShowsUserInterface(false).build());
                    }
                    j11 = dialogKey4.dialogId;
                    if (j11 != 489000) {
                        if (action != null) {
                            category.addAction(action);
                        }
                        if (!z12) {
                            category.addAction(action2);
                        }
                    }
                    if (arrayList17.size() != 1) {
                    }
                    if (DialogObject.isEncryptedDialog(j4)) {
                        category.setLocalOnly(true);
                    }
                    if (bitmap2 != null) {
                        category.setLargeIcon(bitmap2);
                    }
                    if (!AndroidUtilities.needShowPasscode(false)) {
                        size3 = arrayList7.size();
                        i14 = 0;
                        while (i14 < size3) {
                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList23 = arrayList7;
                            keyboardInlineButtonRow = arrayList23.get(i14);
                            size4 = keyboardInlineButtonRow.buttons.size();
                            i15 = 0;
                            while (i15 < size4) {
                                keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i15);
                                tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) TLKeyboardHelper.getType(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                int i32 = size3;
                                if (tL_inlineButtonTypeCallback != null) {
                                    intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                                    intent2.putExtra("currentAccount", notificationsController.currentAccount);
                                    intent2.putExtra("did", j4);
                                    bArr = tL_inlineButtonTypeCallback.data;
                                    if (bArr != null) {
                                        intent2.putExtra("data", bArr);
                                    }
                                    intent2.putExtra("mid", i11);
                                    String str32 = keyboardInlineButton2.text;
                                    Context context3 = ApplicationLoader.applicationContext;
                                    int i33 = notificationsController.lastButtonId;
                                    notificationsController.lastButtonId = i33 + 1;
                                    category.addAction(0, str32, PendingIntent.getBroadcast(context3, i33, intent2, 167772160));
                                }
                                i15++;
                                size3 = i32;
                                i14 = i14;
                            }
                            i14++;
                            size3 = size3;
                            arrayList7 = arrayList23;
                        }
                    }
                    if (chat4 == null) {
                        user4 = user2;
                    } else {
                        user4 = user2;
                    }
                    z10 = z4;
                    notification2 = notificationBuild;
                    if (Build.VERSION.SDK_INT >= 26) {
                        notificationsController.setNotificationChannel(notification2, category, z10);
                    }
                    FileLog.d("showExtraNotifications: holders.add " + j4);
                    notification = notification2;
                    z4 = z10;
                    long j15 = j4;
                    arrayList17 = arrayList17;
                    i23 = i23;
                    longSparseArray6 = longSparseArray3;
                    str24 = str24;
                    str23 = str210;
                    C1NotificationHolder c1NotificationHolder2 = notificationsController.new C1NotificationHolder(num2.intValue(), j15, dialogKey4.story, j10, str211, user4, chat4, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    arrayList16 = arrayList16;
                    arrayList16.add(c1NotificationHolder2);
                    notificationsController.wearNotificationsIds.put(j15, num2);
                    i20 = i23 + 1;
                    arrayList15 = arrayList16;
                    arrayList13 = arrayList17;
                    size5 = size5;
                    z4 = z4;
                    z12 = z12;
                    longSparseArray4 = longSparseArray4;
                    str21 = str21;
                    longSparseArray5 = longSparseArray2;
                    str25 = str3;
                    notificationsSettings = sharedPreferences;
                    clientUserId = j6;
                    notificationBuild = notification;
                    longSparseArray6 = longSparseArray6;
                }
                if (dialogKey2.story) {
                    arrayList10 = new ArrayList<>();
                    arrayList11 = new ArrayList<>();
                    Pair<Integer, Boolean> storyPushes2 = notificationsController.parseStoryPushes(arrayList10, arrayList11);
                    iIntValue = ((Integer) storyPushes2.first).intValue();
                    zBooleanValue = ((Boolean) storyPushes2.second).booleanValue();
                    if (zBooleanValue) {
                        arrayList12 = arrayList11;
                        sb.append(LocaleController.formatPluralString("StoryNotificationHidden", iIntValue, new Object[0]));
                    } else {
                        arrayList12 = arrayList11;
                        if (arrayList10.isEmpty()) {
                            FileLog.d(str26 + j4 + "] continue; story but names is empty");
                            notification = notificationBuild;
                            i20 = i23 + 1;
                            arrayList15 = arrayList16;
                            arrayList13 = arrayList17;
                            size5 = size5;
                            z4 = z4;
                            z12 = z12;
                            longSparseArray4 = longSparseArray4;
                            str21 = str21;
                            longSparseArray5 = longSparseArray2;
                            str25 = str3;
                            notificationsSettings = sharedPreferences;
                            clientUserId = j6;
                            notificationBuild = notification;
                            longSparseArray6 = longSparseArray6;
                        } else {
                            if (arrayList10.size() == 1) {
                                if (iIntValue == 1) {
                                    sb.append(LocaleController.getString("StoryNotificationSingle"));
                                } else {
                                    sb.append(LocaleController.formatPluralString("StoryNotification1", iIntValue, arrayList10.get(0)));
                                }
                            } else if (arrayList10.size() == 2) {
                                z11 = zBooleanValue;
                                sb.append(LocaleController.formatString(R.string.StoryNotification2, arrayList10.get(0), arrayList10.get(1)));
                            } else {
                                z11 = zBooleanValue;
                                if (arrayList10.size() == 3) {
                                    sb.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList10.get(0)), notificationsController.cutLastName(arrayList10.get(1))));
                                } else {
                                    sb.append(LocaleController.formatPluralString("StoryNotification4", notificationsController.storyPushMessages.size() - 2, notificationsController.cutLastName(arrayList10.get(0)), notificationsController.cutLastName(arrayList10.get(1))));
                                }
                            }
                            jMin2 = Long.MAX_VALUE;
                            i17 = 0;
                            while (i17 < notificationsController.storyPushMessages.size()) {
                                jMin2 = Math.min(notificationsController.storyPushMessages.get(i17).date, jMin2);
                                i17++;
                                dialogKey2 = dialogKey2;
                            }
                            dialogKey3 = dialogKey2;
                            messagingStyle2.setGroupConversation(false);
                            if (arrayList10.size() == 1) {
                                pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                            } else {
                                pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                            }
                            messagingStyle2.addMessage(sb, jMin2, new Person.Builder().setName(pluralString).build());
                            if (z11) {
                                bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList12);
                                arrayList5 = null;
                            } else {
                                arrayList5 = null;
                                bitmapLoadMultipleAvatars = null;
                            }
                            i8 = 0;
                            str11 = pluralString;
                            sb2 = sb;
                        }
                    }
                    z11 = zBooleanValue;
                    jMin2 = Long.MAX_VALUE;
                    i17 = 0;
                    while (i17 < notificationsController.storyPushMessages.size()) {
                        jMin2 = Math.min(notificationsController.storyPushMessages.get(i17).date, jMin2);
                        i17++;
                        dialogKey2 = dialogKey2;
                    }
                    dialogKey3 = dialogKey2;
                    messagingStyle2.setGroupConversation(false);
                    if (arrayList10.size() == 1) {
                        pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Stories", iIntValue, new Object[0]);
                    }
                    messagingStyle2.addMessage(sb, jMin2, new Person.Builder().setName(pluralString).build());
                    if (z11) {
                        bitmapLoadMultipleAvatars = loadMultipleAvatars(arrayList12);
                        arrayList5 = null;
                    } else {
                        arrayList5 = null;
                        bitmapLoadMultipleAvatars = null;
                    }
                    i8 = 0;
                    str11 = pluralString;
                    sb2 = sb;
                } else {
                    dialogKey3 = dialogKey2;
                    str10 = str26;
                    size = arrayList3.size() - 1;
                    id2 = 0;
                    arrayList4 = null;
                    while (size >= 0) {
                        messageObject2 = (MessageObject) arrayList3.get(size);
                        int i210 = size;
                        int i211 = id2;
                        MessageObject messageObject7 = messageObject;
                        topicId = MessageObject.getTopicId(notificationsController.currentAccount, messageObject2.messageOwner, notificationsController.getMessagesController().isForum(messageObject2));
                        if (j7 != topicId) {
                            FileLog.d(str10 + j4 + "] continue; topic id is not equal: topicId=" + j7 + " messageTopicId=" + topicId + "; selfId=" + notificationsController.getUserConfig().getClientUserId());
                            zArr2 = zArr;
                            j9 = j7;
                            strArr2 = strArr;
                        } else {
                            j8 = j7;
                            shortStringForMessage = notificationsController.getShortStringForMessage(messageObject2, strArr, zArr);
                            if (j4 == 489001) {
                                strArr[0] = LocaleController.getString(R.string.BotAuthNotificationTitle);
                                strArr2 = strArr;
                                zArr2 = zArr;
                            } else if (j4 == 489000) {
                                strArr2 = strArr;
                                zArr2 = zArr;
                                if (j4 == j6) {
                                    strArr2[0] = str7;
                                } else if (DialogObject.isChatDialog(j4)) {
                                    strArr2[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                }
                            } else {
                                strArr2 = strArr;
                                zArr2 = zArr;
                                if (j4 == j6) {
                                    strArr2[0] = str7;
                                } else if (DialogObject.isChatDialog(j4)) {
                                    strArr2[0] = LocaleController.getString(R.string.NotificationMessageScheduledName);
                                }
                            }
                            if (shortStringForMessage == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.w("message text is null for " + messageObject2.getId() + " did = " + messageObject2.getDialogId());
                                }
                                j9 = j8;
                            } else {
                                if (sb.length() > 0) {
                                    sb.append("\n\n");
                                }
                                if (j4 == j6) {
                                    str12 = str24;
                                    str13 = strArr2[0];
                                    if (str13 != null) {
                                        sb.append(String.format(str12, str13, shortStringForMessage));
                                    } else {
                                        sb.append(shortStringForMessage);
                                    }
                                } else {
                                    str12 = str24;
                                    str13 = strArr2[0];
                                    if (str13 != null) {
                                        sb.append(String.format(str12, str13, shortStringForMessage));
                                    } else {
                                        sb.append(shortStringForMessage);
                                    }
                                }
                                str14 = shortStringForMessage;
                                i9 = (j4 > 489000L ? 1 : (j4 == 489000L ? 0 : -1));
                                if (i9 != 0) {
                                    if (DialogObject.isUserDialog(j4)) {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                    } else if (z7) {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                        senderId = -j4;
                                    } else {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                        if (DialogObject.isChatDialog(j4)) {
                                            senderId = messageObject2.getSenderId();
                                        }
                                    }
                                    senderId = j4;
                                } else {
                                    if (DialogObject.isUserDialog(j4)) {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                    } else if (z7) {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                        senderId = -j4;
                                    } else {
                                        sb = sb;
                                        arrayList6 = arrayList3;
                                        if (DialogObject.isChatDialog(j4)) {
                                            senderId = messageObject2.getSenderId();
                                        }
                                    }
                                    senderId = j4;
                                }
                                str10 = str10;
                                j9 = j8;
                                personBuild2 = (Person) longSparseArray6.get(senderId + (j8 << 16));
                                string3 = strArr2[0];
                                if (string3 != null) {
                                    if (z12 == 0) {
                                        if (DialogObject.isChatDialog(j4)) {
                                            if (z7) {
                                                if (Build.VERSION.SDK_INT > 27) {
                                                    string3 = LocaleController.getString(R.string.NotificationHiddenChatName);
                                                }
                                            } else {
                                                string3 = LocaleController.getString(R.string.NotificationHiddenChatUserName);
                                            }
                                        } else if (Build.VERSION.SDK_INT > 27) {
                                            string3 = LocaleController.getString(R.string.NotificationHiddenName);
                                        }
                                    }
                                    string3 = str9;
                                }
                                if (personBuild2 == null) {
                                    Person.Builder name3 = new Person.Builder().setName(string3);
                                    if (zArr2[0]) {
                                        str24 = str12;
                                        messagingStyle3 = messagingStyle2;
                                    } else {
                                        str24 = str12;
                                        messagingStyle3 = messagingStyle2;
                                    }
                                    personBuild2 = name3.build();
                                    longSparseArray6.put(senderId, personBuild2);
                                } else {
                                    Person.Builder name4 = new Person.Builder().setName(string3);
                                    if (zArr2[0]) {
                                        str24 = str12;
                                        messagingStyle3 = messagingStyle2;
                                    } else {
                                        str24 = str12;
                                        messagingStyle3 = messagingStyle2;
                                    }
                                    personBuild2 = name4.build();
                                    longSparseArray6.put(senderId, personBuild2);
                                }
                                if (!DialogObject.isEncryptedDialog(j4)) {
                                    if (zArr2[0]) {
                                        arrayList3 = arrayList6;
                                        str23 = str23;
                                        messagingStyle2 = messagingStyle3;
                                        messagingStyle2.addMessage(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                    } else {
                                        arrayList3 = arrayList6;
                                        str23 = str23;
                                        messagingStyle2 = messagingStyle3;
                                        messagingStyle2.addMessage(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                    }
                                    if (!zArr2[0]) {
                                    }
                                } else {
                                    arrayList3 = arrayList6;
                                    str23 = str23;
                                    messagingStyle2 = messagingStyle3;
                                    messagingStyle2.addMessage(str14, ((long) messageObject2.messageOwner.date) * 1000, personBuild2);
                                }
                                if (j4 == 777000) {
                                    replyMarkup = messageObject2.messageOwner.reply_markup;
                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                        arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                        id2 = messageObject2.getId();
                                    } else {
                                        id2 = i211;
                                    }
                                } else {
                                    id2 = i211;
                                }
                            }
                            size = i210 - 1;
                            messagingStyle2 = messagingStyle2;
                            str23 = str23;
                            sb = sb;
                            str10 = str10;
                            strArr = strArr2;
                            messageObject = messageObject7;
                            zArr = zArr2;
                            str24 = str24;
                            j7 = j9;
                            arrayList3 = arrayList3;
                        }
                        id2 = i211;
                        size = i210 - 1;
                        messagingStyle2 = messagingStyle2;
                        str23 = str23;
                        sb = sb;
                        str10 = str10;
                        strArr = strArr2;
                        messageObject = messageObject7;
                        zArr = zArr2;
                        str24 = str24;
                        j7 = j9;
                        arrayList3 = arrayList3;
                    }
                    arrayList3 = arrayList3;
                    messagingStyle2 = messagingStyle2;
                    messageObject = messageObject;
                    str24 = str24;
                    str23 = str23;
                    j7 = j7;
                    sb2 = sb;
                    str11 = str7;
                    arrayList5 = arrayList4;
                    bitmapLoadMultipleAvatars = bitmap;
                    i8 = id2;
                }
                intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationDismissReceiver.class);
                intent3.putExtra("messageDate", i6);
                intent3.putExtra("dialogId", j4);
                intent3.putExtra("currentAccount", notificationsController.currentAccount);
                if (dialogKey4.story) {
                    intent3.putExtra("story", true);
                }
                if (messageObject3 != null) {
                    intent3.putExtra("storyReaction", true);
                }
                category.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent3, 167772160));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            j5 = clientUserId;
            Integer numValueOf = (Integer) longSparseArray5.get(dialogKey5.dialogId);
            if (dialogKey5.story) {
                num = 2147483646;
            } else {
                if (numValueOf == null) {
                    long j16 = dialogKey5.dialogId;
                    numValueOf = Integer.valueOf(((int) j16) + ((int) (j16 >> 32)));
                } else {
                    longSparseArray5.remove(dialogKey5.dialogId);
                }
                num = numValueOf;
            }
            i5 = 0;
            for (int i34 = 0; i34 < arrayList3.size(); i34++) {
                if (i5 < ((MessageObject) arrayList3.get(i34)).messageOwner.date) {
                    i5 = ((MessageObject) arrayList3.get(i34)).messageOwner.date;
                }
            }
            if (messageObject != null && messageObject.isStoryReactionPush && !notificationsSettings.getBoolean("EnableReactionsPreview", true)) {
                string = LocaleController.getString(R.string.NotificationHiddenChatName);
                fileLocation = null;
                zCanSendPlain = false;
            }
            if (z12 != 0) {
                if (DialogObject.isChatDialog(j4)) {
                    string5 = LocaleController.getString(R.string.NotificationHiddenChatName);
                } else {
                    string5 = LocaleController.getString(R.string.NotificationHiddenName);
                }
                string = string5;
                fileLocation = null;
                zCanSendPlain = false;
            }
            if (fileLocation != null) {
                File pathToAttach2 = getFileLoader().getPathToAttach(fileLocation, true);
                sharedPreferences = notificationsSettings;
                if (Build.VERSION.SDK_INT < 28) {
                    z7 = z5;
                    bitmap3 = null;
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
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    bitmap = bitmapDecodeFile;
                    file = pathToAttach2;
                } else {
                    z7 = z5;
                    bitmap3 = null;
                }
                file = pathToAttach2;
                bitmap = bitmap3;
            } else {
                sharedPreferences = notificationsSettings;
                z7 = z5;
                file = null;
                bitmap = null;
            }
            if (chat != null) {
                Person.Builder name5 = new Person.Builder().setName(string);
                if (file != null && file.exists() && Build.VERSION.SDK_INT >= 28) {
                    loadRoundAvatar(j4, file, name5);
                }
                longSparseArray6.put(-chat.id, name5.build());
            }
            str6 = "dialog_id";
            str3 = str25;
            str7 = string;
            actionBuild = null;
            num3 = (Integer) notificationsController.pushDialogs.get(j4);
            if (num3 == null) {
                num3 = 0;
            }
            dialogKey2 = dialogKey;
            if (dialogKey2.story) {
                iMax = notificationsController.storyPushMessages.size();
            } else {
                iMax = Math.max(num3.intValue(), arrayList3.size());
            }
            if (iMax > 1) {
            }
            person = (Person) longSparseArray6.get(j5);
            if (Build.VERSION.SDK_INT >= 28) {
                j7 = j3;
                personBuild = person;
            } else {
                j7 = j3;
                personBuild = person;
            }
            if (messageObject == null) {
                z8 = true;
            } else {
                z8 = true;
            }
            str9 = "";
            if (personBuild == null) {
                messagingStyle = new NotificationCompat.MessagingStyle("");
            } else {
                messagingStyle = new NotificationCompat.MessagingStyle("");
            }
            messagingStyle2 = messagingStyle;
            i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                messagingStyle2.setConversationTitle(str8);
            } else {
                messagingStyle2.setConversationTitle(str8);
            }
            if (i7 >= 28) {
                z9 = true;
            } else {
                z9 = true;
            }
            messagingStyle2.setGroupConversation(z9);
            sb = new StringBuilder();
            j6 = j5;
            strArr = new String[1];
            zArr = new boolean[1];
            intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
            intent.setFlags(67108864);
            intent.addCategory("android.intent.category.LAUNCHER");
            messageObject3 = messageObject;
            if (messageObject == null) {
                if (messageObject3 == null) {
                }
                str16 = str22;
                if (messageObject3 == null) {
                    str17 = str11;
                    str18 = str21;
                    str19 = str20;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                        jArr2 = new long[notificationsController.storyPushMessages.size()];
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i12 = 0;
                        while (i12 < notificationsController.storyPushMessages.size()) {
                            jArr2[i12] = notificationsController.storyPushMessages.get(i12).dialogId;
                            i12++;
                            i8 = i8;
                        }
                        i11 = i8;
                        intent.putExtra("storyDialogIds", jArr2);
                    } else {
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i11 = i8;
                        if (DialogObject.isEncryptedDialog(j4)) {
                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j4));
                        } else if (DialogObject.isUserDialog(j4)) {
                            intent.putExtra(str19, j4);
                        } else {
                            intent.putExtra(str18, -j4);
                        }
                    }
                } else {
                    str17 = str11;
                    str18 = str21;
                    str19 = str20;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                        jArr2 = new long[notificationsController.storyPushMessages.size()];
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i12 = 0;
                        while (i12 < notificationsController.storyPushMessages.size()) {
                            jArr2[i12] = notificationsController.storyPushMessages.get(i12).dialogId;
                            i12++;
                            i8 = i8;
                        }
                        i11 = i8;
                        intent.putExtra("storyDialogIds", jArr2);
                    } else {
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i11 = i8;
                        if (DialogObject.isEncryptedDialog(j4)) {
                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j4));
                        } else if (DialogObject.isUserDialog(j4)) {
                            intent.putExtra(str19, j4);
                        } else {
                            intent.putExtra(str18, -j4);
                        }
                    }
                }
            } else {
                if (messageObject3 == null) {
                }
                str16 = str22;
                if (messageObject3 == null) {
                    str17 = str11;
                    str18 = str21;
                    str19 = str20;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                        jArr2 = new long[notificationsController.storyPushMessages.size()];
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i12 = 0;
                        while (i12 < notificationsController.storyPushMessages.size()) {
                            jArr2[i12] = notificationsController.storyPushMessages.get(i12).dialogId;
                            i12++;
                            i8 = i8;
                        }
                        i11 = i8;
                        intent.putExtra("storyDialogIds", jArr2);
                    } else {
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i11 = i8;
                        if (DialogObject.isEncryptedDialog(j4)) {
                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j4));
                        } else if (DialogObject.isUserDialog(j4)) {
                            intent.putExtra(str19, j4);
                        } else {
                            intent.putExtra(str18, -j4);
                        }
                    }
                } else {
                    str17 = str11;
                    str18 = str21;
                    str19 = str20;
                    dialogKey4 = dialogKey3;
                    if (dialogKey4.story) {
                        jArr2 = new long[notificationsController.storyPushMessages.size()];
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i12 = 0;
                        while (i12 < notificationsController.storyPushMessages.size()) {
                            jArr2[i12] = notificationsController.storyPushMessages.get(i12).dialogId;
                            i12++;
                            i8 = i8;
                        }
                        i11 = i8;
                        intent.putExtra("storyDialogIds", jArr2);
                    } else {
                        longSparseArray3 = longSparseArray6;
                        str22 = str16;
                        i11 = i8;
                        if (DialogObject.isEncryptedDialog(j4)) {
                            intent.putExtra("encId", DialogObject.getEncryptedChatId(j4));
                        } else if (DialogObject.isUserDialog(j4)) {
                            intent.putExtra(str19, j4);
                        } else {
                            intent.putExtra(str18, -j4);
                        }
                    }
                }
            }
            StringBuilder sb10 = new StringBuilder();
            sb10.append("show extra notifications chatId ");
            sb10.append(j4);
            sb10.append(" topicId ");
            j10 = j7;
            sb10.append(j10);
            FileLog.d(sb10.toString());
            if (j10 != 0) {
                intent.putExtra("topicId", j10);
            }
            intent.putExtra("currentAccount", notificationsController.currentAccount);
            str20 = str19;
            PendingIntent activity3 = PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent, 1140850688);
            wearableExtender = new NotificationCompat.WearableExtender();
            action = actionBuild;
            if (actionBuild != null) {
                wearableExtender.addAction(action);
            }
            String str212 = str23;
            Intent intent9 = new Intent(ApplicationLoader.applicationContext, (Class<?>) AutoMessageHeardReceiver.class);
            intent9.addFlags(32);
            str21 = str18;
            intent9.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
            intent9.putExtra(str6, j4);
            i13 = id;
            intent9.putExtra(str3, i13);
            intent9.putExtra("currentAccount", notificationsController.currentAccount);
            arrayList7 = arrayList5;
            actionBuild2 = new NotificationCompat.Action.Builder(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead), PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent9, 167772160)).setSemanticAction(2).setShowsUserInterface(false).build();
            if (DialogObject.isEncryptedDialog(j4)) {
                action2 = actionBuild2;
                bitmap2 = bitmapLoadMultipleAvatars;
                if (j4 != globalSecretChatId) {
                    string4 = "tgenc" + DialogObject.getEncryptedChatId(j4) + "_" + i13;
                } else {
                    string4 = null;
                }
            } else if (DialogObject.isUserDialog(j4)) {
                string4 = "tguser" + j4 + "_" + i13;
                action2 = actionBuild2;
                bitmap2 = bitmapLoadMultipleAvatars;
            } else {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("tgchat");
                action2 = actionBuild2;
                bitmap2 = bitmapLoadMultipleAvatars;
                sb11.append(-j4);
                sb11.append("_");
                sb11.append(i13);
                string4 = sb11.toString();
            }
            if (string4 != null) {
                wearableExtender.setDismissalId(string4);
                NotificationCompat.WearableExtender wearableExtender4 = new NotificationCompat.WearableExtender();
                wearableExtender4.setDismissalId("summary_" + string4);
                builder.extend(wearableExtender4);
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append("tgaccount");
            j6 = j6;
            sb12.append(j6);
            wearableExtender.setBridgeTag(sb12.toString());
            if (dialogKey4.story) {
                jMin = Long.MAX_VALUE;
                while (i16 < notificationsController.storyPushMessages.size()) {
                    jMin = Math.min(notificationsController.storyPushMessages.get(i16).date, jMin);
                }
                arrayList8 = arrayList3;
            } else {
                arrayList8 = arrayList3;
                jMin = ((long) ((MessageObject) arrayList8.get(0)).messageOwner.date) * 1000;
            }
            String str213 = str17;
            arrayList9 = arrayList8;
            NotificationCompat.Builder autoCancel3 = new NotificationCompat.Builder(ApplicationLoader.applicationContext).setContentTitle(str213).setSmallIcon(R.drawable.notification).setContentText(sb2.toString()).setAutoCancel(true);
            if (dialogKey4.story) {
                size2 = notificationsController.storyPushMessages.size();
            } else {
                size2 = arrayList9.size();
            }
            category = autoCancel3.setNumber(size2).setColor(-15618822).setGroupSummary(false).setWhen(jMin).setShowWhen(true).setStyle(messagingStyle2).setContentIntent(activity3).extend(wearableExtender).setSortKey(String.valueOf(Long.MAX_VALUE - jMin)).setCategory("msg");
            if (z4 != 0) {
                category.setGroup(notificationsController.notificationGroup);
                category.setGroupAlertBehavior(1);
            }
            if (messageObject3 != null) {
                tL_inlineButtonTypeCopy = null;
                keyboardInlineButton = null;
            } else {
                tL_inlineButtonTypeCopy = null;
                keyboardInlineButton = null;
            }
            if (keyboardInlineButton != null) {
                Intent intent10 = new Intent(ApplicationLoader.applicationContext, (Class<?>) CopyCodeReceiver.class);
                intent10.addFlags(32);
                intent10.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                intent10.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                category.addAction(new NotificationCompat.Action.Builder(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(ApplicationLoader.applicationContext, num2.intValue(), intent10, 167772160)).setShowsUserInterface(false).build());
            }
            j11 = dialogKey4.dialogId;
            if (j11 != 489000) {
                if (action != null) {
                    category.addAction(action);
                }
                if (!z12) {
                    category.addAction(action2);
                }
            }
            if (arrayList17.size() != 1) {
            }
            if (DialogObject.isEncryptedDialog(j4)) {
                category.setLocalOnly(true);
            }
            if (bitmap2 != null) {
                category.setLargeIcon(bitmap2);
            }
            if (!AndroidUtilities.needShowPasscode(false)) {
                size3 = arrayList7.size();
                i14 = 0;
                while (i14 < size3) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24 = arrayList7;
                    keyboardInlineButtonRow = arrayList24.get(i14);
                    size4 = keyboardInlineButtonRow.buttons.size();
                    i15 = 0;
                    while (i15 < size4) {
                        keyboardInlineButton2 = keyboardInlineButtonRow.buttons.get(i15);
                        tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) TLKeyboardHelper.getType(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        int i35 = size3;
                        if (tL_inlineButtonTypeCallback != null) {
                            intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) NotificationCallbackReceiver.class);
                            intent2.putExtra("currentAccount", notificationsController.currentAccount);
                            intent2.putExtra("did", j4);
                            bArr = tL_inlineButtonTypeCallback.data;
                            if (bArr != null) {
                                intent2.putExtra("data", bArr);
                            }
                            intent2.putExtra("mid", i11);
                            String str33 = keyboardInlineButton2.text;
                            Context context4 = ApplicationLoader.applicationContext;
                            int i36 = notificationsController.lastButtonId;
                            notificationsController.lastButtonId = i36 + 1;
                            category.addAction(0, str33, PendingIntent.getBroadcast(context4, i36, intent2, 167772160));
                        }
                        i15++;
                        size3 = i35;
                        i14 = i14;
                    }
                    i14++;
                    size3 = size3;
                    arrayList7 = arrayList24;
                }
            }
            if (chat4 == null) {
                user4 = user2;
            } else {
                user4 = user2;
            }
            z10 = z4;
            notification2 = notificationBuild;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationsController.setNotificationChannel(notification2, category, z10);
            }
            FileLog.d("showExtraNotifications: holders.add " + j4);
            notification = notification2;
            z4 = z10;
            long j17 = j4;
            arrayList17 = arrayList17;
            i23 = i23;
            longSparseArray6 = longSparseArray3;
            str24 = str24;
            str23 = str212;
            C1NotificationHolder c1NotificationHolder3 = notificationsController.new C1NotificationHolder(num2.intValue(), j17, dialogKey4.story, j10, str213, user4, chat4, category, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
            arrayList16 = arrayList16;
            arrayList16.add(c1NotificationHolder3);
            notificationsController.wearNotificationsIds.put(j17, num2);
            i20 = i23 + 1;
            arrayList15 = arrayList16;
            arrayList13 = arrayList17;
            size5 = size5;
            z4 = z4;
            z12 = z12;
            longSparseArray4 = longSparseArray4;
            str21 = str21;
            longSparseArray5 = longSparseArray2;
            str25 = str3;
            notificationsSettings = sharedPreferences;
            clientUserId = j6;
            notificationBuild = notification;
            longSparseArray6 = longSparseArray6;
        }
        LongSparseArray longSparseArray7 = longSparseArray6;
        LongSparseArray longSparseArray8 = longSparseArray5;
        if (z4) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("show summary with id " + notificationsController.notificationId);
            }
            try {
                notificationManager.notify(notificationsController.notificationId, notificationBuild);
                arrayList2 = arrayList;
            } catch (SecurityException e7) {
                FileLog.e(e7);
                arrayList2 = arrayList;
                notificationsController.resetNotificationSound(builder, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
            }
        } else {
            arrayList2 = arrayList;
            if (notificationsController.openedInBubbleDialogs.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cancel summary with id " + notificationsController.notificationId);
                }
                notificationManager.cancel(notificationsController.notificationId);
            }
        }
        int i37 = 0;
        while (i37 < longSparseArray8.size()) {
            LongSparseArray longSparseArray9 = longSparseArray8;
            if (!notificationsController.openedInBubbleDialogs.contains(Long.valueOf(longSparseArray9.keyAt(i37)))) {
                Integer num4 = (Integer) longSparseArray9.valueAt(i37);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cancel notification id " + num4);
                }
                notificationManager.cancel(num4.intValue());
            }
            i37++;
            longSparseArray8 = longSparseArray9;
        }
        ArrayList arrayList25 = new ArrayList(arrayList2.size());
        FileLog.d("showExtraNotifications: holders.size()=" + arrayList2.size());
        int size7 = arrayList2.size();
        int i38 = 0;
        while (i38 < size7) {
            ArrayList arrayList26 = arrayList2;
            C1NotificationHolder c1NotificationHolder4 = (C1NotificationHolder) arrayList26.get(i38);
            arrayList25.clear();
            if (Build.VERSION.SDK_INT < 29 || DialogObject.isEncryptedDialog(c1NotificationHolder4.dialogId)) {
                longSparseArray = longSparseArray7;
            } else {
                NotificationCompat.Builder builder2 = c1NotificationHolder4.notification;
                long j18 = c1NotificationHolder4.dialogId;
                longSparseArray = longSparseArray7;
                String strCreateNotificationShortcut = notificationsController.createNotificationShortcut(builder2, j18, c1NotificationHolder4.name, c1NotificationHolder4.user, c1NotificationHolder4.chat, (Person) longSparseArray.get(j18), !c1NotificationHolder4.story);
                if (strCreateNotificationShortcut != null) {
                    arrayList25.add(strCreateNotificationShortcut);
                }
            }
            FileLog.d("showExtraNotifications: holders[" + i38 + "].call()");
            c1NotificationHolder4.call();
            if (!unsupportedNotificationShortcut() && !arrayList25.isEmpty()) {
                ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList25);
            }
            i38++;
            notificationsController = this;
            arrayList2 = arrayList26;
            longSparseArray7 = longSparseArray;
        }
    }

    class C1NotificationHolder {
        TLRPC.Chat chat;
        long dialogId;
        int id;
        String name;
        NotificationCompat.Builder notification;
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

        C1NotificationHolder(int i, long j, boolean z, long j2, String str, TLRPC.User user, TLRPC.Chat chat, NotificationCompat.Builder builder, long j3, String str2, long[] jArr, int i2, Uri uri, int i3, boolean z2, boolean z3, boolean z4, int i4) {
            this.val$lastTopicId = j3;
            this.val$chatName = str2;
            this.val$vibrationPattern = jArr;
            this.val$ledColor = i2;
            this.val$sound = uri;
            this.val$importance = i3;
            this.val$isDefault = z2;
            this.val$isInApp = z3;
            this.val$isSilent = z4;
            this.val$chatType = i4;
            this.id = i;
            this.name = str;
            this.user = user;
            this.chat = chat;
            this.notification = builder;
            this.dialogId = j;
            this.story = z;
            this.topicId = j2;
        }

        void call() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("show dialog notification with id " + this.id + " " + this.dialogId + " user=" + this.user + " chat=" + this.chat);
            }
            try {
                NotificationsController.notificationManager.notify(this.id, this.notification.build());
            } catch (SecurityException e) {
                FileLog.e(e);
                NotificationsController.this.resetNotificationSound(this.notification, this.dialogId, this.val$lastTopicId, this.val$chatName, this.val$vibrationPattern, this.val$ledColor, this.val$sound, this.val$importance, this.val$isDefault, this.val$isInApp, this.val$isSilent, this.val$chatType);
            }
        }
    }

    public static void $r8$lambda$gQghIUHs5ZKeIK8dHwFQ_2pzquE(Uri uri, File file) {
        try {
            ApplicationLoader.applicationContext.revokeUriPermission(uri, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
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
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, iIndexOf));
        sb.append(str.endsWith("…") ? "…" : "");
        return sb.toString();
    }

    private Pair<Integer, Boolean> parseStoryPushes(ArrayList<String> arrayList, ArrayList<Object> arrayList2) {
        String userName;
        TLRPC.FileLocation fileLocation;
        int iMin = Math.min(3, this.storyPushMessages.size());
        boolean z = false;
        int size = 0;
        for (int i = 0; i < iMin; i++) {
            StoryNotification storyNotification = this.storyPushMessages.get(i);
            size += storyNotification.dateByIds.size();
            z |= storyNotification.hidden;
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
        if (z) {
            arrayList2.clear();
        }
        return new Pair<>(Integer.valueOf(size), Boolean.valueOf(z));
    }

    public static Person.Builder loadRoundAvatar(long j, File file, Person.Builder builder) {
        if (j == 489001) {
            builder.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.ic_launcher_dr));
            return builder;
        }
        if (file != null && Build.VERSION.SDK_INT >= 28) {
            try {
                builder.setIcon(IconCompat.createWithBitmap(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new ImageDecoder.OnHeaderDecodedListener() {
                    @Override
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        imageDecoder.setPostProcessor(new PostProcessor() {
                            @Override
                            public final int onPostProcess(Canvas canvas) {
                                return NotificationsController.$r8$lambda$Z_KcXEDiTLz__0aNAPod1LbZsYY(canvas);
                            }
                        });
                    }
                })));
            } catch (Throwable unused) {
            }
        }
        return builder;
    }

    public static int $r8$lambda$Z_KcXEDiTLz__0aNAPod1LbZsYY(Canvas canvas) {
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        int width = canvas.getWidth();
        float f = width / 2;
        path.addRoundRect(0.0f, 0.0f, width, canvas.getHeight(), f, f, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        canvas.drawPath(path, paint);
        return -3;
    }

    public static Bitmap loadMultipleAvatars(ArrayList<Object> arrayList) {
        float f;
        int i;
        Bitmap bitmap;
        Paint paint;
        float f2;
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
            f = 1.0f;
        } else {
            f = arrayList2.size() == 2 ? 0.65f : 0.5f;
        }
        int i2 = 0;
        TextPaint textPaint = null;
        while (i2 < arrayList2.size()) {
            float f3 = iDp;
            float f4 = (1.0f - f) * f3;
            try {
                float size = (f4 / arrayList2.size()) * ((arrayList2.size() - 1) - i2);
                float size2 = i2 * (f4 / arrayList2.size());
                float f5 = f3 * f;
                float f6 = f5 / 2.0f;
                i = iDp;
                float f7 = size + f6;
                bitmap = bitmapCreateBitmap;
                float f8 = size2 + f6;
                f2 = f;
                try {
                    canvas.drawCircle(f7, f8, AndroidUtilities.dp(2.0f) + f6, paint3);
                    Object obj = arrayList2.get(i2);
                    paint = paint3;
                    try {
                        if (obj instanceof File) {
                            String absolutePath = ((File) arrayList2.get(i2)).getAbsolutePath();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(absolutePath, options);
                            int i3 = (int) f5;
                            options.inSampleSize = StoryEntry.calculateInSampleSize(options, i3, i3);
                            try {
                                options.inJustDecodeBounds = false;
                                options.inDither = true;
                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options);
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                                matrix.reset();
                                matrix.postScale(f5 / bitmapDecodeFile.getWidth(), f5 / bitmapDecodeFile.getHeight());
                                matrix.postTranslate(size, size2);
                                bitmapShader.setLocalMatrix(matrix);
                                paint2.setShader(bitmapShader);
                                canvas.drawCircle(f7, f8, f6, paint2);
                                bitmapDecodeFile.recycle();
                            } catch (Throwable unused) {
                            }
                        } else if (obj instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj;
                            try {
                                paint2.setShader(new LinearGradient(size, size2, size, size2 + f5, new int[]{Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(user.id)]), Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(user.id)])}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                                canvas.drawCircle(f7, f8, f6, paint2);
                                if (textPaint == null) {
                                    TextPaint textPaint2 = new TextPaint(1);
                                    try {
                                        textPaint2.setTypeface(AndroidUtilities.bold());
                                        textPaint2.setTextSize(f3 * 0.25f);
                                        textPaint2.setColor(-1);
                                        textPaint = textPaint2;
                                    } catch (Throwable unused2) {
                                        textPaint = textPaint2;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                AvatarDrawable.getAvatarSymbols(user.first_name, user.last_name, null, sb);
                                String string = sb.toString();
                                try {
                                    textPaint.getTextBounds(string, 0, string.length(), rect);
                                    canvas.drawText(string, (f7 - (rect.width() / 2.0f)) - rect.left, (f8 - (rect.height() / 2.0f)) - rect.top, textPaint);
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable unused6) {
                    paint = paint3;
                }
            } catch (Throwable unused7) {
                i = iDp;
                bitmap = bitmapCreateBitmap;
                paint = paint3;
                f2 = f;
            }
            i2++;
            arrayList2 = arrayList;
            iDp = i;
            bitmapCreateBitmap = bitmap;
            f = f2;
            paint3 = paint;
        }
        return bitmapCreateBitmap;
    }

    public void playOutChatSound() {
        if (!this.inChatSoundEnabled || MediaController.getInstance().isRecordingAudio()) {
            return;
        }
        try {
            if (audioManager.getRingerMode() == 0) {
                return;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$NXeeLudOQpE7Rg_nQ3KbeZD8eoU(this.f$0);
            }
        });
    }

    public static void $r8$lambda$NXeeLudOQpE7Rg_nQ3KbeZD8eoU(NotificationsController notificationsController) {
        notificationsController.getClass();
        try {
            if (Math.abs(SystemClock.elapsedRealtime() - notificationsController.lastSoundOutPlay) <= 100) {
                return;
            }
            notificationsController.lastSoundOutPlay = SystemClock.elapsedRealtime();
            if (notificationsController.soundPool == null) {
                SoundPool soundPool = new SoundPool(3, 1, 0);
                notificationsController.soundPool = soundPool;
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.$r8$lambda$el0xJHhpeENCEpDJ0w96gt65p0Q(soundPool2, i, i2);
                    }
                });
            }
            if (notificationsController.soundOut == 0 && !notificationsController.soundOutLoaded) {
                notificationsController.soundOutLoaded = true;
                notificationsController.soundOut = notificationsController.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i = notificationsController.soundOut;
            if (i != 0) {
                try {
                    notificationsController.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void $r8$lambda$el0xJHhpeENCEpDJ0w96gt65p0Q(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            try {
                soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void clearDialogNotificationsSettings(long j, long j2) {
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        String sharedPrefKey = getSharedPrefKey(j, j2);
        editorEdit.remove("notify2_" + sharedPrefKey).remove("custom_" + sharedPrefKey);
        getMessagesStorage().setDialogFlags(j, 0L);
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j);
        if (dialog != null) {
            dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
        }
        editorEdit.commit();
        getNotificationsController().updateServerNotificationsSettings(j, j2, true);
    }

    public void setDialogNotificationsSettings(long j, long j2, int i) {
        SharedPreferences.Editor editorEdit = getAccountInstance().getNotificationsSettings().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(UserConfig.selectedAccount).dialogs_dict.get(j);
        if (i == 4) {
            if (isGlobalNotificationsEnabled(j, false, false)) {
                editorEdit.remove("notify2_" + getSharedPrefKey(j, j2));
            } else {
                editorEdit.putInt("notify2_" + getSharedPrefKey(j, j2), 0);
            }
            getMessagesStorage().setDialogFlags(j, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            if (i == 0) {
                currentTime += 3600;
            } else if (i == 1) {
                currentTime += 28800;
            } else if (i == 2) {
                currentTime += 172800;
            } else if (i == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j3 = 1;
            if (i == 3) {
                editorEdit.putInt("notify2_" + getSharedPrefKey(j, j2), 2);
            } else {
                editorEdit.putInt("notify2_" + getSharedPrefKey(j, j2), 3);
                editorEdit.putInt("notifyuntil_" + getSharedPrefKey(j, j2), currentTime);
                j3 = 1 | (((long) currentTime) << 32);
            }
            getInstance(UserConfig.selectedAccount).removeNotificationsForDialog(j);
            MessagesStorage.getInstance(UserConfig.selectedAccount).setDialogFlags(j, j3);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        editorEdit.commit();
        updateServerNotificationsSettings(j, j2);
    }

    public void updateServerNotificationsSettings(long j, long j2) {
        updateServerNotificationsSettings(j, j2, true);
    }

    public void updateServerNotificationsSettings(long j, long j2, boolean z) {
        if (z) {
            getNotificationCenter().postNotificationName(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String sharedPrefKey = getSharedPrefKey(j, j2);
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
        int i = notificationsSettings.getInt("notify2_" + getSharedPrefKey(j, j2), -1);
        if (i != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i == 3) {
                tL_inputPeerNotifySettings4.mute_until = notificationsSettings.getInt("notifyuntil_" + getSharedPrefKey(j, j2), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i == 2 ? Integer.MAX_VALUE : 0;
            }
        }
        long j3 = notificationsSettings.getLong("sound_document_id_" + getSharedPrefKey(j, j2), 0L);
        String string = notificationsSettings.getString("sound_path_" + getSharedPrefKey(j, j2), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = notificationsSettings.getString("sound_" + getSharedPrefKey(j, j2), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j2 != 0 && j != getUserConfig().getClientUserId()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().getInputPeer(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else if (ChatObject.isCommunity(this.currentAccount, j)) {
            TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
            tL_inputNotifyCommunity.community = getMessagesController().getInputChannel(-j);
            updatenotifysettings.peer = tL_inputNotifyCommunity;
        } else {
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(j);
            updatenotifysettings.peer = tL_inputNotifyPeer;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.m942$r8$lambda$1t1axbSYGQIU_GMVkHnzrj3Llc(tLObject, tL_error);
            }
        });
    }

    public void updateServerNotificationsSettings(int i) {
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        if (i == 4 || i == 5) {
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
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    NotificationsController.m946$r8$lambda$H_bZLJEQVx9OdWW6ZrpVB2xjp0(tLObject, tL_error);
                }
            });
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = getInputSound(notificationsSettings, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i == 1 || i == 3) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableAll2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewAll", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 128;
            tL_inputPeerNotifySettings3.stories_hide_sender = notificationsSettings.getBoolean("EnableHideStoriesSenders", false);
            if (notificationsSettings.contains("EnableAllStories")) {
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 64;
                tL_inputPeerNotifySettings4.stories_muted = !notificationsSettings.getBoolean("EnableAllStories", true);
            }
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings5.flags |= 8;
            tL_inputPeerNotifySettings5.sound = getInputSound(notificationsSettings, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = getInputSound(notificationsSettings, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = notificationsSettings.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = notificationsSettings.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = getInputSound(notificationsSettings, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsController.$r8$lambda$TMEsjTkj9lYdR59uaNuAf1n8IoU(tLObject, tL_error);
            }
        });
    }

    private TLRPC.NotificationSound getInputSound(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j;
            return tL_notificationSoundRingtone;
        }
        if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                return new TLRPC.TL_notificationSoundNone();
            }
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
            tL_notificationSoundLocal.data = string;
            return tL_notificationSoundLocal;
        }
        return new TLRPC.TL_notificationSoundDefault();
    }

    public boolean isGlobalNotificationsEnabled(long j, boolean z, boolean z2) {
        return isGlobalNotificationsEnabled(j, null, z, z2);
    }

    public boolean isGlobalNotificationsEnabled(long j, Boolean bool, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 4;
        } else if (z2) {
            i = 5;
        } else if (!DialogObject.isChatDialog(j)) {
            i = 1;
        } else if (bool != null) {
            if (bool.booleanValue()) {
                i = 2;
            } else {
                i = 0;
            }
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                i = 0;
            } else {
                i = 2;
            }
        }
        return isGlobalNotificationsEnabled(i);
    }

    public boolean isGlobalNotificationsEnabled(int i) {
        if (i == 4) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsMessages", true);
        }
        if (i == 5) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableReactionsStories", true);
        }
        if (i == 3) {
            return getAccountInstance().getNotificationsSettings().getBoolean("EnableAllStories", true);
        }
        return getAccountInstance().getNotificationsSettings().getInt(getGlobalNotificationsKey(i), 0) < getConnectionsManager().getCurrentTime();
    }

    public void setGlobalNotificationsEnabled(int i, int i2) {
        getAccountInstance().getNotificationsSettings().edit().putInt(getGlobalNotificationsKey(i), i2).commit();
        updateServerNotificationsSettings(i);
        getMessagesStorage().updateMutedDialogsFiltersCounters();
        deleteNotificationChannelGlobal(i);
    }

    public static String getGlobalNotificationsKey(int i) {
        if (i == 0) {
            return "EnableGroup2";
        }
        if (i == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public void muteDialog(long j, long j2, boolean z) {
        if (z) {
            getInstance(this.currentAccount).muteUntil(j, j2, Integer.MAX_VALUE);
            return;
        }
        boolean zIsGlobalNotificationsEnabled = getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
        boolean z2 = j2 != 0;
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        if (zIsGlobalNotificationsEnabled && !z2) {
            editorEdit.remove("notify2_" + getSharedPrefKey(j, j2));
        } else {
            editorEdit.putInt("notify2_" + getSharedPrefKey(j, j2), 0);
        }
        if (j2 == 0) {
            getMessagesStorage().setDialogFlags(j, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.apply();
        updateServerNotificationsSettings(j, j2);
    }

    public NotificationsSettingsFacade getNotificationsSettingsFacade() {
        return this.dialogsNotificationsFacade;
    }

    public void loadTopicsNotificationsExceptions(final long j, final Consumer<HashSet<Integer>> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$zmMaJZXAIF9S3HhrFAdu8FHaPmA(this.f$0, j, consumer);
            }
        });
    }

    public static void $r8$lambda$zmMaJZXAIF9S3HhrFAdu8FHaPmA(NotificationsController notificationsController, long j, final Consumer consumer) {
        notificationsController.getClass();
        final HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(notificationsController.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith("notify2_" + j)) {
                Integer num = Utilities.parseInt((CharSequence) key.replace("notify2_" + j, ""));
                int iIntValue = num.intValue();
                if (iIntValue != 0 && notificationsController.getMessagesController().isDialogMuted(j, iIntValue) != notificationsController.getMessagesController().isDialogMuted(j, 0L)) {
                    hashSet.add(num);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.$r8$lambda$LakEptqhCv9OhMJsIqb7LZKKyO8(consumer, hashSet);
            }
        });
    }

    public static void $r8$lambda$LakEptqhCv9OhMJsIqb7LZKKyO8(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.s(hashSet);
        }
    }

    private static class DialogKey {
        final long dialogId;
        final boolean story;
        final long topicId;

        private DialogKey(long j, long j2, boolean z) {
            this.dialogId = j;
            this.topicId = j2;
            this.story = z;
        }
    }

    public static class StoryNotification {
        public long date;
        final HashMap<Integer, Pair<Long, Long>> dateByIds;
        final long dialogId;
        boolean hidden;
        String localName;

        public StoryNotification(long j, String str, int i, long j2) {
            this(j, str, i, j2, j2 + 86400000);
        }

        public StoryNotification(long j, String str, int i, long j2, long j3) {
            HashMap<Integer, Pair<Long, Long>> map = new HashMap<>();
            this.dateByIds = map;
            this.dialogId = j;
            this.localName = str;
            map.put(Integer.valueOf(i), new Pair<>(Long.valueOf(j2), Long.valueOf(j3)));
            this.date = j2;
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
    }

    public void checkStoryPushes() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        boolean z = false;
        while (i < this.storyPushMessages.size()) {
            StoryNotification storyNotification = this.storyPushMessages.get(i);
            Iterator<Map.Entry<Integer, Pair<Long, Long>>> it = storyNotification.dateByIds.entrySet().iterator();
            while (it.hasNext()) {
                if (jCurrentTimeMillis >= ((Long) it.next().getValue().second).longValue()) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                if (storyNotification.dateByIds.isEmpty()) {
                    getMessagesStorage().deleteStoryPushMessage(storyNotification.dialogId);
                    this.storyPushMessages.remove(i);
                    i--;
                } else {
                    getMessagesStorage().putStoryPushMessage(storyNotification);
                }
            }
            i++;
        }
        if (z) {
            showOrUpdateNotification(false);
        }
        updateStoryPushesRunnable();
    }

    private void updateStoryPushesRunnable() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.storyPushMessages.size(); i++) {
            Iterator<Pair<Long, Long>> it = this.storyPushMessages.get(i).dateByIds.values().iterator();
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

    private String getTitle(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return ForumUtilities.getMonoForumTitle(this.currentAccount, chat);
        }
        return chat.title;
    }
}
