package org.telegram.messenger;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
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
import android.graphics.PostProcessor;
import android.graphics.Rect;
import android.graphics.Shader;
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
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import com.google.common.collect.Lists;
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
import java.util.function.ToLongFunction;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
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

    public static void lambda$updateServerNotificationsSettings$50(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$updateServerNotificationsSettings$51(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$updateServerNotificationsSettings$52(TLObject tLObject, TLRPC.TL_error tL_error) {
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
        NotificationsController notificationsController = Instance[i];
        if (notificationsController == null) {
            synchronized (lockObjects[i]) {
                try {
                    notificationsController = Instance[i];
                    if (notificationsController == null) {
                        NotificationsController[] notificationsControllerArr = Instance;
                        NotificationsController notificationsController2 = new NotificationsController(i);
                        notificationsControllerArr[i] = notificationsController2;
                        notificationsController = notificationsController2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
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
                this.f$0.lambda$new$0();
            }
        };
        this.dialogsNotificationsFacade = new NotificationsSettingsFacade(this.currentAccount);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1();
            }
        });
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$new$1() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
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
                this.f$0.lambda$cleanup$2();
            }
        });
    }

    public void lambda$cleanup$2() {
        this.openedDialogId = 0L;
        this.openedTopicId = 0L;
        this.total_unread_count = 0;
        this.personalCount = 0;
        this.pushMessages.clear();
        this.pushMessagesDict.clear();
        this.fcmRandomMessagesDict.clear();
        this.pushDialogs.clear();
        this.wearNotificationsIds.clear();
        this.lastWearNotifiedMessageId.clear();
        this.openedInBubbleDialogs.clear();
        this.delayedPushMessages.clear();
        this.notifyCheck = false;
        this.lastBadgeCount = 0;
        try {
            if (this.notificationDelayWakelock.isHeld()) {
                this.notificationDelayWakelock.release();
            }
        } catch (Exception e) {
            FileLog.e(e);
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
                this.f$0.lambda$setOpenedDialogId$3(j, j2);
            }
        });
    }

    public void lambda$setOpenedDialogId$3(long j, long j2) {
        this.openedDialogId = j;
        this.openedTopicId = j2;
    }

    public void setOpenedInBubble(final long j, final boolean z) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setOpenedInBubble$4(z, j);
            }
        });
    }

    public void lambda$setOpenedInBubble$4(boolean z, long j) {
        if (z) {
            this.openedInBubbleDialogs.add(Long.valueOf(j));
        } else {
            this.openedInBubbleDialogs.remove(Long.valueOf(j));
        }
    }

    public void setLastOnlineFromOtherDevice(final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setLastOnlineFromOtherDevice$5(i);
            }
        });
    }

    public void lambda$setLastOnlineFromOtherDevice$5(int i) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set last online from other device = " + i);
        }
        this.lastOnlineFromOtherDevice = i;
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
                this.f$0.lambda$forceShowPopupForReply$7();
            }
        });
    }

    public void lambda$forceShowPopupForReply$7() {
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.pushMessages.size(); i++) {
            MessageObject messageObject = this.pushMessages.get(i);
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
                this.f$0.lambda$forceShowPopupForReply$6(arrayList);
            }
        });
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

    public void removeDeletedMessagesFromNotifications(final LongSparseArray longSparseArray, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeDeletedMessagesFromNotifications$10(longSparseArray, z, arrayList);
            }
        });
    }

    public void lambda$removeDeletedMessagesFromNotifications$10(LongSparseArray longSparseArray, boolean z, final ArrayList arrayList) {
        Integer num;
        int i = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(jKeyAt);
            if (sparseArray != null) {
                ArrayList arrayList2 = (ArrayList) longSparseArray.get(jKeyAt);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    int iIntValue = ((Integer) arrayList2.get(i3)).intValue();
                    MessageObject messageObject = (MessageObject) sparseArray.get(iIntValue);
                    if (messageObject != null && !messageObject.isStoryReactionPush && (!z || messageObject.isReactionPush)) {
                        long dialogId = messageObject.getDialogId();
                        Integer num2 = (Integer) this.pushDialogs.get(dialogId);
                        if (num2 == null) {
                            num2 = 0;
                        }
                        int iIntValue2 = num2.intValue() - 1;
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        if (iIntValue2 <= 0) {
                            this.smartNotificationsDialogs.remove(dialogId);
                            num = 0;
                        } else {
                            num = numValueOf;
                        }
                        if (!num.equals(num2)) {
                            if (!getMessagesController().isCommunity(dialogId)) {
                                if (getMessagesController().isForum(dialogId)) {
                                    int i4 = this.total_unread_count - (num2.intValue() > 0 ? 1 : 0);
                                    this.total_unread_count = i4;
                                    this.total_unread_count = i4 + (num.intValue() > 0 ? 1 : 0);
                                } else {
                                    int iIntValue3 = this.total_unread_count - num2.intValue();
                                    this.total_unread_count = iIntValue3;
                                    this.total_unread_count = iIntValue3 + num.intValue();
                                }
                            }
                            this.pushDialogs.put(dialogId, num);
                        }
                        if (num.intValue() == 0) {
                            this.pushDialogs.remove(dialogId);
                            this.pushDialogsOverrideMention.remove(dialogId);
                        }
                        sparseArray.remove(iIntValue);
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                    }
                    i3++;
                    jKeyAt = jKeyAt;
                }
                long j = jKeyAt;
                if (sparseArray.size() == 0) {
                    this.pushMessagesDict.remove(j);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeDeletedMessagesFromNotifications$8(arrayList);
                }
            });
        }
        if (i != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size2 = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeDeletedMessagesFromNotifications$9(size2);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$removeDeletedMessagesFromNotifications$8(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$removeDeletedMessagesFromNotifications$9(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void removeDeletedHisoryFromNotifications(final LongSparseIntArray longSparseIntArray) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeDeletedHisoryFromNotifications$13(longSparseIntArray, arrayList);
            }
        });
    }

    public void lambda$removeDeletedHisoryFromNotifications$13(LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        Integer num;
        int i = this.total_unread_count;
        getAccountInstance().getNotificationsSettings();
        Integer num2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= longSparseIntArray.size()) {
                break;
            }
            long jKeyAt = longSparseIntArray.keyAt(i2);
            long j = -jKeyAt;
            long j2 = longSparseIntArray.get(jKeyAt);
            Integer num3 = (Integer) this.pushDialogs.get(j);
            if (num3 == null) {
                num3 = num2;
            }
            Integer numValueOf = num3;
            int i3 = 0;
            while (i3 < this.pushMessages.size()) {
                MessageObject messageObject = this.pushMessages.get(i3);
                if (messageObject.getDialogId() == j) {
                    num = num2;
                    if (messageObject.getId() <= j2) {
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.remove(j);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(messageObject);
                        i3--;
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
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
                this.smartNotificationsDialogs.remove(j);
                numValueOf = num4;
            }
            if (!numValueOf.equals(num3)) {
                if (!getMessagesController().isCommunity(j)) {
                    if (getMessagesController().isForum(j)) {
                        int i4 = this.total_unread_count - (num3.intValue() > 0 ? 1 : 0);
                        this.total_unread_count = i4;
                        this.total_unread_count = i4 + (numValueOf.intValue() <= 0 ? 0 : 1);
                    } else {
                        int iIntValue = this.total_unread_count - num3.intValue();
                        this.total_unread_count = iIntValue;
                        this.total_unread_count = iIntValue + numValueOf.intValue();
                    }
                }
                this.pushDialogs.put(j, numValueOf);
            }
            if (numValueOf.intValue() == 0) {
                this.pushDialogs.remove(j);
                this.pushDialogsOverrideMention.remove(j);
            }
            i2++;
            num2 = num4;
        }
        if (arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeDeletedHisoryFromNotifications$11(arrayList);
                }
            });
        }
        if (i != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeDeletedHisoryFromNotifications$12(size);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$removeDeletedHisoryFromNotifications$11(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$removeDeletedHisoryFromNotifications$12(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processSeenStoryReactions(long j, final int i) {
        if (j != getUserConfig().getClientUserId()) {
            return;
        }
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processSeenStoryReactions$14(i);
            }
        });
    }

    public void lambda$processSeenStoryReactions$14(int i) {
        int i2 = 0;
        boolean z = false;
        while (i2 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i2);
            if (messageObject.isStoryReactionPush && Math.abs(messageObject.getId()) == i) {
                this.pushMessages.remove(i2);
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(messageObject.getId()));
                getMessagesStorage().deletePushMessages(messageObject.getDialogId(), arrayList);
                i2--;
                z = true;
            }
            i2++;
        }
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processDeleteStory(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDeleteStory$15(j, i);
            }
        });
    }

    public void lambda$processDeleteStory$15(long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            storyNotification.dateByIds.remove(Integer.valueOf(i));
            if (storyNotification.dateByIds.isEmpty()) {
                this.storyPushMessagesDict.remove(j);
                this.storyPushMessages.remove(storyNotification);
                getMessagesStorage().deleteStoryPushMessage(j);
                z = true;
            } else {
                getMessagesStorage().putStoryPushMessage(storyNotification);
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() == i) {
                this.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processReadStories(final long j, final int i) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processReadStories$16(j, i);
            }
        });
    }

    public void lambda$processReadStories$16(long j, int i) {
        boolean z;
        StoryNotification storyNotification = (StoryNotification) this.storyPushMessagesDict.get(j);
        if (storyNotification != null) {
            this.storyPushMessagesDict.remove(j);
            this.storyPushMessages.remove(storyNotification);
            getMessagesStorage().deleteStoryPushMessage(j);
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i2);
            if (messageObject != null && messageObject.isLiveStoryPush && messageObject.getId() <= i) {
                this.pushMessages.remove(i2);
                i2--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i2++;
        }
        if (z) {
            showOrUpdateNotification(false);
            updateStoryPushesRunnable();
        }
    }

    public void processIgnoreStories() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processIgnoreStories$17();
            }
        });
    }

    public void lambda$processIgnoreStories$17() {
        boolean zIsEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        getMessagesStorage().deleteAllStoryPushMessages();
        if (zIsEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    public void processIgnoreStoryReactions() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processIgnoreStoryReactions$18();
            }
        });
    }

    public void lambda$processIgnoreStoryReactions$18() {
        int i = 0;
        boolean z = false;
        while (i < this.pushMessages.size()) {
            MessageObject messageObject = this.pushMessages.get(i);
            if (messageObject != null && messageObject.isStoryReactionPush) {
                this.pushMessages.remove(i);
                i--;
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(messageObject.getDialogId());
                if (sparseArray != null) {
                    sparseArray.remove(messageObject.getId());
                }
                if (sparseArray != null && sparseArray.size() <= 0) {
                    this.pushMessagesDict.remove(messageObject.getDialogId());
                }
                z = true;
            }
            i++;
        }
        getMessagesStorage().deleteAllStoryReactionPushMessages();
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processIgnoreStories(final long j) {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processIgnoreStories$19(j);
            }
        });
    }

    public void lambda$processIgnoreStories$19(long j) {
        boolean zIsEmpty = this.storyPushMessages.isEmpty();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        getMessagesStorage().deleteStoryPushMessage(j);
        if (zIsEmpty) {
            return;
        }
        showOrUpdateNotification(false);
    }

    public void processReadMessages(final LongSparseIntArray longSparseIntArray, final long j, final int i, final int i2, final boolean z) {
        final ArrayList arrayList = new ArrayList(0);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processReadMessages$21(longSparseIntArray, arrayList, j, i2, i, z);
            }
        });
    }

    public void lambda$processReadMessages$21(LongSparseIntArray longSparseIntArray, final ArrayList arrayList, long j, int i, int i2, boolean z) {
        long dialogId;
        long dialogId2;
        long j2 = 0;
        if (longSparseIntArray != null) {
            int i3 = 0;
            while (i3 < longSparseIntArray.size()) {
                long jKeyAt = longSparseIntArray.keyAt(i3);
                int i4 = longSparseIntArray.get(jKeyAt);
                int i5 = 0;
                while (i5 < this.pushMessages.size()) {
                    MessageObject messageObject = this.pushMessages.get(i5);
                    if (!messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && messageObject.getId() <= i4 && !messageObject.isStoryReactionPush) {
                        if (isPersonalMessage(messageObject)) {
                            this.personalCount--;
                        }
                        arrayList.add(messageObject);
                        if (messageObject.isStoryReactionPush) {
                            dialogId2 = messageObject.getDialogId();
                        } else {
                            long j3 = messageObject.messageOwner.peer_id.channel_id;
                            dialogId2 = j3 != j2 ? -j3 : j2;
                        }
                        SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(dialogId2);
                        if (sparseArray != null) {
                            sparseArray.remove(messageObject.getId());
                            if (sparseArray.size() == 0) {
                                this.pushMessagesDict.remove(dialogId2);
                            }
                        }
                        this.delayedPushMessages.remove(messageObject);
                        this.pushMessages.remove(i5);
                        i5--;
                    }
                    i5++;
                    j2 = 0;
                }
                i3++;
                j2 = 0;
            }
        }
        if (j != j2 && (i != 0 || i2 != 0)) {
            int i6 = 0;
            while (i6 < this.pushMessages.size()) {
                MessageObject messageObject2 = this.pushMessages.get(i6);
                if (messageObject2.getDialogId() == j && !messageObject2.isStoryReactionPush && (i2 == 0 ? z ? messageObject2.getId() == i || i < 0 : messageObject2.getId() <= i || i < 0 : messageObject2.messageOwner.date <= i2)) {
                    if (isPersonalMessage(messageObject2)) {
                        this.personalCount--;
                    }
                    if (messageObject2.isStoryReactionPush) {
                        dialogId = messageObject2.getDialogId();
                    } else {
                        long j4 = messageObject2.messageOwner.peer_id.channel_id;
                        dialogId = j4 != 0 ? -j4 : 0L;
                    }
                    SparseArray sparseArray2 = (SparseArray) this.pushMessagesDict.get(dialogId);
                    if (sparseArray2 != null) {
                        sparseArray2.remove(messageObject2.getId());
                        if (sparseArray2.size() == 0) {
                            this.pushMessagesDict.remove(dialogId);
                        }
                    }
                    this.pushMessages.remove(i6);
                    this.delayedPushMessages.remove(messageObject2);
                    arrayList.add(messageObject2);
                    i6--;
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
                this.f$0.lambda$processReadMessages$20(arrayList);
            }
        });
    }

    public void lambda$processReadMessages$20(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
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
                this.f$0.lambda$processEditedMessages$22(longSparseArray);
            }
        });
    }

    public void lambda$processEditedMessages$22(LongSparseArray longSparseArray) {
        long dialogId;
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
                SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(dialogId);
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
                    z = true;
                }
            }
        }
        if (z) {
            showOrUpdateNotification(false);
        }
    }

    public void processNewMessages(final ArrayList<MessageObject> arrayList, final boolean z, final boolean z2, final CountDownLatch countDownLatch) {
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationsController: processNewMessages msgs.size()=");
            sb.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            sb.append(z);
            sb.append(" isFcm=");
            sb.append(z2);
            sb.append(")");
            FileLog.d(sb.toString());
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
                            Iterator<TLRPC.Peer> it = tL_messageActionConferenceCall.other_participants.iterator();
                            while (it.hasNext()) {
                                hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(it.next())));
                            }
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                long jLongValue = ((Long) it2.next()).longValue();
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
            final ArrayList arrayList2 = new ArrayList(0);
            notificationsQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processNewMessages$27(arrayList, arrayList2, z2, z, countDownLatch);
                }
            });
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void lambda$processNewMessages$27(ArrayList arrayList, final ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean zIsGlobalNotificationsEnabled;
        int i;
        int iIntValue;
        Integer num;
        boolean z3;
        int id;
        long j;
        long dialogId;
        boolean z4;
        TLRPC.Chat chat;
        long j2;
        long j3;
        long dialogId2;
        SparseArray sparseArray;
        MessageObject messageObject;
        long j4;
        MessageObject messageObject2;
        MessageObject messageObject3;
        long j5;
        boolean z5;
        long j6;
        long topicId;
        TLRPC.Message message;
        long fromChatId;
        int iIndexOfKey;
        long j7;
        int notifyOverride;
        long j8;
        boolean zIsGlobalNotificationsEnabled2;
        long j9;
        Integer num2;
        int iIntValue2;
        int iIndexOf;
        boolean z6;
        long j10;
        TLRPC.Message message2;
        final int i2;
        long j11;
        long currentTime;
        TLRPC.Message message3;
        long jCurrentTimeMillis;
        long j12;
        long dialogId3;
        int id2;
        StoryNotification storyNotification;
        boolean z7;
        boolean z8;
        LongSparseArray longSparseArray = new LongSparseArray();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        boolean z9 = notificationsSettings.getBoolean("PinnedMessages", true);
        int iAddToPopupMessages = 0;
        int i3 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
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
                    j12 = jCurrentTimeMillis;
                    dialogId3 = messageObject4.getDialogId();
                    id2 = messageObject4.getId();
                    storyNotification = (StoryNotification) this.storyPushMessagesDict.get(dialogId3);
                    if (storyNotification != null) {
                        storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(j12), Long.valueOf(j12 + 86400000)));
                        z7 = storyNotification.hidden;
                        z8 = messageObject4.isStoryPushHidden;
                        if (z7 != z8) {
                            storyNotification.hidden = z8;
                            z13 = true;
                        }
                        storyNotification.date = storyNotification.getLeastDate();
                        getMessagesStorage().putStoryPushMessage(storyNotification);
                        z11 = true;
                    } else {
                        StoryNotification storyNotification2 = new StoryNotification(dialogId3, messageObject4.localName, id2, j12);
                        storyNotification2.hidden = messageObject4.isStoryPushHidden;
                        this.storyPushMessages.add(storyNotification2);
                        this.storyPushMessagesDict.put(dialogId3, storyNotification2);
                        getMessagesStorage().putStoryPushMessage(storyNotification2);
                        z10 = true;
                        z13 = true;
                    }
                    Collections.sort(this.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                        @Override
                        public final long applyAsLong(Object obj) {
                            return ((NotificationsController.StoryNotification) obj).date;
                        }
                    }));
                    z3 = z9;
                    i3 = i3;
                } else {
                    if (messageObject4.isOauthPush) {
                        message2 = messageObject4.messageOwner;
                        if (message2 == null) {
                            i2 = message2.id;
                            j11 = ((long) message2.date) + 60;
                            z3 = z9;
                            currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                            if (currentTime > j11) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$processNewMessages$24(i2);
                                    }
                                }, (j11 - currentTime) * 1000);
                            }
                        }
                        i3 = i3;
                        z5 = z10;
                        z10 = z5;
                        iAddToPopupMessages = iAddToPopupMessages;
                    } else {
                        z3 = z9;
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
                        chat = getMessagesController().getChat(Long.valueOf(-dialogId));
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
                        j2 = dialogId;
                    } else {
                        j2 = dialogId;
                        j3 = messageObject4.messageOwner.peer_id.channel_id;
                        if (j3 != 0) {
                            dialogId2 = -j3;
                        } else {
                            dialogId2 = 0;
                        }
                    }
                    sparseArray = (SparseArray) this.pushMessagesDict.get(dialogId2);
                    if (sparseArray != null) {
                        messageObject = (MessageObject) sparseArray.get(id);
                    } else {
                        messageObject = null;
                    }
                    MessageObject messageObject5 = messageObject;
                    if (messageObject == null) {
                        j4 = j;
                        j10 = messageObject4.messageOwner.random_id;
                        if (j10 != 0) {
                            messageObject2 = (MessageObject) this.fcmRandomMessagesDict.get(j10);
                            if (messageObject2 != null) {
                                this.fcmRandomMessagesDict.remove(messageObject4.messageOwner.random_id);
                            }
                        }
                        if (messageObject2 != null) {
                            if (messageObject2.isFcmMessage()) {
                                if (sparseArray == null) {
                                    sparseArray = new SparseArray();
                                    this.pushMessagesDict.put(dialogId2, sparseArray);
                                }
                                sparseArray.put(id, messageObject4);
                                iIndexOf = this.pushMessages.indexOf(messageObject2);
                                if (iIndexOf >= 0) {
                                    this.pushMessages.set(iIndexOf, messageObject4);
                                    iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject4, j2, z4, notificationsSettings);
                                }
                                if (z) {
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    z6 = messageObject4.localEdit;
                                    if (z6) {
                                        getMessagesStorage().putPushMessage(messageObject4);
                                    }
                                    z11 = z6;
                                }
                            } else {
                                i3 = i3;
                                z10 = z10;
                                dialogId2 = dialogId2;
                                iAddToPopupMessages = iAddToPopupMessages;
                            }
                            iAddToPopupMessages = iAddToPopupMessages;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                            }
                            z10 = z10;
                        } else {
                            messageObject3 = messageObject4;
                            j5 = j2;
                            i3 = i3;
                            z5 = z10;
                            j6 = dialogId2;
                            if (z11) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("skipped message because edited");
                                }
                            } else {
                                if (z && !messageObject3.isOauthPush) {
                                    getMessagesStorage().putPushMessage(messageObject3);
                                }
                                topicId = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                                if (j5 != this.openedDialogId && ApplicationLoader.isScreenOn && !messageObject3.isStoryReactionPush && !messageObject3.isOauthPush) {
                                    if (!z) {
                                        playInChatSound();
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because chat is already opened (openedDialogId = " + this.openedDialogId + ")");
                                    }
                                } else {
                                    message = messageObject3.messageOwner;
                                    if (!message.mentioned) {
                                        fromChatId = j5;
                                    } else if (z3 && (message.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because message is mention of pinned");
                                        }
                                    } else {
                                        fromChatId = messageObject3.getFromChatId();
                                    }
                                    if (isPersonalMessage(messageObject3)) {
                                        this.personalCount++;
                                    }
                                    DialogObject.isChatDialog(fromChatId);
                                    iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                    if (iIndexOfKey < 0 && topicId == 0) {
                                        long j13 = fromChatId;
                                        zIsGlobalNotificationsEnabled2 = ((Boolean) longSparseArray.valueAt(iIndexOfKey)).booleanValue();
                                        j8 = j13;
                                    } else {
                                        j7 = fromChatId;
                                        notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                        if (notifyOverride == -1) {
                                            zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                            if (BuildVars.LOGS_ENABLED) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                j8 = j7;
                                                sb.append(j8);
                                                sb.append(", ");
                                                sb.append(z4);
                                                sb.append(", ");
                                                sb.append(messageObject3.isReactionPush);
                                                sb.append(", ");
                                                sb.append(messageObject3.isStoryReactionPush);
                                                sb.append(") = ");
                                                sb.append(zIsGlobalNotificationsEnabled2);
                                                FileLog.d(sb.toString());
                                            } else {
                                                j8 = j7;
                                            }
                                        } else {
                                            j8 = j7;
                                            if (notifyOverride != 2) {
                                                zIsGlobalNotificationsEnabled2 = true;
                                            } else {
                                                zIsGlobalNotificationsEnabled2 = false;
                                            }
                                        }
                                        longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                    }
                                    if (zIsGlobalNotificationsEnabled2) {
                                        if (!z) {
                                            iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                        }
                                        if (!z12) {
                                            iAddToPopupMessages = iAddToPopupMessages;
                                            z12 = messageObject3.messageOwner.from_scheduled;
                                        }
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        this.delayedPushMessages.add(messageObject3);
                                        appendMessage(messageObject3);
                                        if (id != 0) {
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                this.pushMessagesDict.put(j6, sparseArray);
                                            }
                                            sparseArray.put(id, messageObject3);
                                        } else {
                                            j9 = j4;
                                            if (j9 != 0) {
                                                this.fcmRandomMessagesDict.put(j9, messageObject3);
                                            }
                                        }
                                        if (j5 != j8) {
                                            num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                            LongSparseArray longSparseArray2 = this.pushDialogsOverrideMention;
                                            if (num2 == null) {
                                                iIntValue2 = 1;
                                            } else {
                                                iIntValue2 = num2.intValue() + 1;
                                            }
                                            longSparseArray2.put(j5, Integer.valueOf(iIntValue2));
                                        }
                                    } else {
                                        j8 = j8;
                                        messageObject3 = messageObject3;
                                        iAddToPopupMessages = iAddToPopupMessages;
                                    }
                                    if (messageObject3.isReactionPush) {
                                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                        sparseBooleanArray.put(id, true);
                                        getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray);
                                    }
                                    z10 = true;
                                }
                            }
                            z10 = z5;
                            iAddToPopupMessages = iAddToPopupMessages;
                        }
                    } else {
                        j4 = j;
                    }
                    messageObject2 = messageObject5;
                    if (messageObject2 != null) {
                        if (messageObject2.isFcmMessage()) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                this.pushMessagesDict.put(dialogId2, sparseArray);
                            }
                            sparseArray.put(id, messageObject4);
                            iIndexOf = this.pushMessages.indexOf(messageObject2);
                            if (iIndexOf >= 0) {
                                this.pushMessages.set(iIndexOf, messageObject4);
                                iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject4, j2, z4, notificationsSettings);
                            }
                            if (z) {
                                iAddToPopupMessages = iAddToPopupMessages;
                                z6 = messageObject4.localEdit;
                                if (z6) {
                                    getMessagesStorage().putPushMessage(messageObject4);
                                }
                                z11 = z6;
                            }
                        } else {
                            i3 = i3;
                            z10 = z10;
                            dialogId2 = dialogId2;
                            iAddToPopupMessages = iAddToPopupMessages;
                        }
                        iAddToPopupMessages = iAddToPopupMessages;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                        }
                        z10 = z10;
                    } else {
                        messageObject3 = messageObject4;
                        j5 = j2;
                        i3 = i3;
                        z5 = z10;
                        j6 = dialogId2;
                        if (z11) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("skipped message because edited");
                            }
                        } else {
                            if (z) {
                                getMessagesStorage().putPushMessage(messageObject3);
                            }
                            topicId = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                            if (j5 != this.openedDialogId) {
                                message = messageObject3.messageOwner;
                                if (!message.mentioned) {
                                    if (z3) {
                                    }
                                    fromChatId = messageObject3.getFromChatId();
                                } else {
                                    fromChatId = j5;
                                }
                                if (isPersonalMessage(messageObject3)) {
                                    this.personalCount++;
                                }
                                DialogObject.isChatDialog(fromChatId);
                                iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                if (iIndexOfKey < 0) {
                                    j7 = fromChatId;
                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                    if (notifyOverride == -1) {
                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                            j8 = j7;
                                            sb2.append(j8);
                                            sb2.append(", ");
                                            sb2.append(z4);
                                            sb2.append(", ");
                                            sb2.append(messageObject3.isReactionPush);
                                            sb2.append(", ");
                                            sb2.append(messageObject3.isStoryReactionPush);
                                            sb2.append(") = ");
                                            sb2.append(zIsGlobalNotificationsEnabled2);
                                            FileLog.d(sb2.toString());
                                        } else {
                                            j8 = j7;
                                        }
                                    } else {
                                        j8 = j7;
                                        if (notifyOverride != 2) {
                                            zIsGlobalNotificationsEnabled2 = true;
                                        } else {
                                            zIsGlobalNotificationsEnabled2 = false;
                                        }
                                    }
                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                } else {
                                    j7 = fromChatId;
                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                    if (notifyOverride == -1) {
                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                            j8 = j7;
                                            sb3.append(j8);
                                            sb3.append(", ");
                                            sb3.append(z4);
                                            sb3.append(", ");
                                            sb3.append(messageObject3.isReactionPush);
                                            sb3.append(", ");
                                            sb3.append(messageObject3.isStoryReactionPush);
                                            sb3.append(") = ");
                                            sb3.append(zIsGlobalNotificationsEnabled2);
                                            FileLog.d(sb3.toString());
                                        } else {
                                            j8 = j7;
                                        }
                                    } else {
                                        j8 = j7;
                                        if (notifyOverride != 2) {
                                            zIsGlobalNotificationsEnabled2 = true;
                                        } else {
                                            zIsGlobalNotificationsEnabled2 = false;
                                        }
                                    }
                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                }
                                if (zIsGlobalNotificationsEnabled2) {
                                    if (!z) {
                                        iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                    }
                                    if (!z12) {
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        z12 = messageObject3.messageOwner.from_scheduled;
                                    }
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    this.delayedPushMessages.add(messageObject3);
                                    appendMessage(messageObject3);
                                    if (id != 0) {
                                        if (sparseArray == null) {
                                            sparseArray = new SparseArray();
                                            this.pushMessagesDict.put(j6, sparseArray);
                                        }
                                        sparseArray.put(id, messageObject3);
                                    } else {
                                        j9 = j4;
                                        if (j9 != 0) {
                                            this.fcmRandomMessagesDict.put(j9, messageObject3);
                                        }
                                    }
                                    if (j5 != j8) {
                                        num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                        LongSparseArray longSparseArray3 = this.pushDialogsOverrideMention;
                                        if (num2 == null) {
                                            iIntValue2 = 1;
                                        } else {
                                            iIntValue2 = num2.intValue() + 1;
                                        }
                                        longSparseArray3.put(j5, Integer.valueOf(iIntValue2));
                                    }
                                } else {
                                    j8 = j8;
                                    messageObject3 = messageObject3;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                }
                                if (messageObject3.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                                    sparseBooleanArray2.put(id, true);
                                    getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray2);
                                }
                                z10 = true;
                            } else {
                                message = messageObject3.messageOwner;
                                if (!message.mentioned) {
                                    if (z3) {
                                    }
                                    fromChatId = messageObject3.getFromChatId();
                                } else {
                                    fromChatId = j5;
                                }
                                if (isPersonalMessage(messageObject3)) {
                                    this.personalCount++;
                                }
                                DialogObject.isChatDialog(fromChatId);
                                iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                if (iIndexOfKey < 0) {
                                    j7 = fromChatId;
                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                    if (notifyOverride == -1) {
                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                            j8 = j7;
                                            sb4.append(j8);
                                            sb4.append(", ");
                                            sb4.append(z4);
                                            sb4.append(", ");
                                            sb4.append(messageObject3.isReactionPush);
                                            sb4.append(", ");
                                            sb4.append(messageObject3.isStoryReactionPush);
                                            sb4.append(") = ");
                                            sb4.append(zIsGlobalNotificationsEnabled2);
                                            FileLog.d(sb4.toString());
                                        } else {
                                            j8 = j7;
                                        }
                                    } else {
                                        j8 = j7;
                                        if (notifyOverride != 2) {
                                            zIsGlobalNotificationsEnabled2 = true;
                                        } else {
                                            zIsGlobalNotificationsEnabled2 = false;
                                        }
                                    }
                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                } else {
                                    j7 = fromChatId;
                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                    if (notifyOverride == -1) {
                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                            j8 = j7;
                                            sb5.append(j8);
                                            sb5.append(", ");
                                            sb5.append(z4);
                                            sb5.append(", ");
                                            sb5.append(messageObject3.isReactionPush);
                                            sb5.append(", ");
                                            sb5.append(messageObject3.isStoryReactionPush);
                                            sb5.append(") = ");
                                            sb5.append(zIsGlobalNotificationsEnabled2);
                                            FileLog.d(sb5.toString());
                                        } else {
                                            j8 = j7;
                                        }
                                    } else {
                                        j8 = j7;
                                        if (notifyOverride != 2) {
                                            zIsGlobalNotificationsEnabled2 = true;
                                        } else {
                                            zIsGlobalNotificationsEnabled2 = false;
                                        }
                                    }
                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                }
                                if (zIsGlobalNotificationsEnabled2) {
                                    if (!z) {
                                        iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                    }
                                    if (!z12) {
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        z12 = messageObject3.messageOwner.from_scheduled;
                                    }
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    this.delayedPushMessages.add(messageObject3);
                                    appendMessage(messageObject3);
                                    if (id != 0) {
                                        if (sparseArray == null) {
                                            sparseArray = new SparseArray();
                                            this.pushMessagesDict.put(j6, sparseArray);
                                        }
                                        sparseArray.put(id, messageObject3);
                                    } else {
                                        j9 = j4;
                                        if (j9 != 0) {
                                            this.fcmRandomMessagesDict.put(j9, messageObject3);
                                        }
                                    }
                                    if (j5 != j8) {
                                        num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                        LongSparseArray longSparseArray4 = this.pushDialogsOverrideMention;
                                        if (num2 == null) {
                                            iIntValue2 = 1;
                                        } else {
                                            iIntValue2 = num2.intValue() + 1;
                                        }
                                        longSparseArray4.put(j5, Integer.valueOf(iIntValue2));
                                    }
                                } else {
                                    j8 = j8;
                                    messageObject3 = messageObject3;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                }
                                if (messageObject3.isReactionPush) {
                                    SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
                                    sparseBooleanArray3.put(id, true);
                                    getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray3);
                                }
                                z10 = true;
                            }
                        }
                        z10 = z5;
                        iAddToPopupMessages = iAddToPopupMessages;
                    }
                }
                z3 = z9;
                i3 = i3;
                z5 = z10;
                z10 = z5;
                iAddToPopupMessages = iAddToPopupMessages;
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
                                j12 = jCurrentTimeMillis;
                                dialogId3 = messageObject4.getDialogId();
                                id2 = messageObject4.getId();
                                storyNotification = (StoryNotification) this.storyPushMessagesDict.get(dialogId3);
                                if (storyNotification != null) {
                                    storyNotification.dateByIds.put(Integer.valueOf(id2), new Pair<>(Long.valueOf(j12), Long.valueOf(j12 + 86400000)));
                                    z7 = storyNotification.hidden;
                                    z8 = messageObject4.isStoryPushHidden;
                                    if (z7 != z8) {
                                        storyNotification.hidden = z8;
                                        z13 = true;
                                    }
                                    storyNotification.date = storyNotification.getLeastDate();
                                    getMessagesStorage().putStoryPushMessage(storyNotification);
                                    z11 = true;
                                } else {
                                    StoryNotification storyNotification3 = new StoryNotification(dialogId3, messageObject4.localName, id2, j12);
                                    storyNotification3.hidden = messageObject4.isStoryPushHidden;
                                    this.storyPushMessages.add(storyNotification3);
                                    this.storyPushMessagesDict.put(dialogId3, storyNotification3);
                                    getMessagesStorage().putStoryPushMessage(storyNotification3);
                                    z10 = true;
                                    z13 = true;
                                }
                                Collections.sort(this.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                                    @Override
                                    public final long applyAsLong(Object obj) {
                                        return ((NotificationsController.StoryNotification) obj).date;
                                    }
                                }));
                                z3 = z9;
                                i3 = i3;
                            } else {
                                if (messageObject4.isOauthPush) {
                                    message2 = messageObject4.messageOwner;
                                    if (message2 == null) {
                                        i2 = message2.id;
                                        j11 = ((long) message2.date) + 60;
                                        z3 = z9;
                                        currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                                        if (currentTime > j11) {
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    this.f$0.lambda$processNewMessages$24(i2);
                                                }
                                            }, (j11 - currentTime) * 1000);
                                        }
                                    }
                                    i3 = i3;
                                    z5 = z10;
                                    z10 = z5;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                } else {
                                    z3 = z9;
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
                                    chat = getMessagesController().getChat(Long.valueOf(-dialogId));
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
                                    j2 = dialogId;
                                } else {
                                    j2 = dialogId;
                                    j3 = messageObject4.messageOwner.peer_id.channel_id;
                                    if (j3 != 0) {
                                        dialogId2 = -j3;
                                    } else {
                                        dialogId2 = 0;
                                    }
                                }
                                sparseArray = (SparseArray) this.pushMessagesDict.get(dialogId2);
                                if (sparseArray != null) {
                                    messageObject = (MessageObject) sparseArray.get(id);
                                } else {
                                    messageObject = null;
                                }
                                MessageObject messageObject6 = messageObject;
                                if (messageObject == null) {
                                    j4 = j;
                                    j10 = messageObject4.messageOwner.random_id;
                                    if (j10 != 0) {
                                        messageObject2 = (MessageObject) this.fcmRandomMessagesDict.get(j10);
                                        if (messageObject2 != null) {
                                            this.fcmRandomMessagesDict.remove(messageObject4.messageOwner.random_id);
                                        }
                                    }
                                    if (messageObject2 != null) {
                                        if (messageObject2.isFcmMessage()) {
                                            if (sparseArray == null) {
                                                sparseArray = new SparseArray();
                                                this.pushMessagesDict.put(dialogId2, sparseArray);
                                            }
                                            sparseArray.put(id, messageObject4);
                                            iIndexOf = this.pushMessages.indexOf(messageObject2);
                                            if (iIndexOf >= 0) {
                                                this.pushMessages.set(iIndexOf, messageObject4);
                                                iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject4, j2, z4, notificationsSettings);
                                            }
                                            if (z) {
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                z6 = messageObject4.localEdit;
                                                if (z6) {
                                                    getMessagesStorage().putPushMessage(messageObject4);
                                                }
                                                z11 = z6;
                                            }
                                        } else {
                                            i3 = i3;
                                            z10 = z10;
                                            dialogId2 = dialogId2;
                                            iAddToPopupMessages = iAddToPopupMessages;
                                        }
                                        iAddToPopupMessages = iAddToPopupMessages;
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                                        }
                                        z10 = z10;
                                    } else {
                                        messageObject3 = messageObject4;
                                        j5 = j2;
                                        i3 = i3;
                                        z5 = z10;
                                        j6 = dialogId2;
                                        if (z11) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("skipped message because edited");
                                            }
                                        } else {
                                            if (z) {
                                                getMessagesStorage().putPushMessage(messageObject3);
                                            }
                                            topicId = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                                            if (j5 != this.openedDialogId) {
                                                message = messageObject3.messageOwner;
                                                if (!message.mentioned) {
                                                    if (z3) {
                                                    }
                                                    fromChatId = messageObject3.getFromChatId();
                                                } else {
                                                    fromChatId = j5;
                                                }
                                                if (isPersonalMessage(messageObject3)) {
                                                    this.personalCount++;
                                                }
                                                DialogObject.isChatDialog(fromChatId);
                                                iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                                if (iIndexOfKey < 0) {
                                                    j7 = fromChatId;
                                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                    if (notifyOverride == -1) {
                                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            StringBuilder sb6 = new StringBuilder();
                                                            sb6.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                            j8 = j7;
                                                            sb6.append(j8);
                                                            sb6.append(", ");
                                                            sb6.append(z4);
                                                            sb6.append(", ");
                                                            sb6.append(messageObject3.isReactionPush);
                                                            sb6.append(", ");
                                                            sb6.append(messageObject3.isStoryReactionPush);
                                                            sb6.append(") = ");
                                                            sb6.append(zIsGlobalNotificationsEnabled2);
                                                            FileLog.d(sb6.toString());
                                                        } else {
                                                            j8 = j7;
                                                        }
                                                    } else {
                                                        j8 = j7;
                                                        if (notifyOverride != 2) {
                                                            zIsGlobalNotificationsEnabled2 = true;
                                                        } else {
                                                            zIsGlobalNotificationsEnabled2 = false;
                                                        }
                                                    }
                                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                } else {
                                                    j7 = fromChatId;
                                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                    if (notifyOverride == -1) {
                                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            StringBuilder sb7 = new StringBuilder();
                                                            sb7.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                            j8 = j7;
                                                            sb7.append(j8);
                                                            sb7.append(", ");
                                                            sb7.append(z4);
                                                            sb7.append(", ");
                                                            sb7.append(messageObject3.isReactionPush);
                                                            sb7.append(", ");
                                                            sb7.append(messageObject3.isStoryReactionPush);
                                                            sb7.append(") = ");
                                                            sb7.append(zIsGlobalNotificationsEnabled2);
                                                            FileLog.d(sb7.toString());
                                                        } else {
                                                            j8 = j7;
                                                        }
                                                    } else {
                                                        j8 = j7;
                                                        if (notifyOverride != 2) {
                                                            zIsGlobalNotificationsEnabled2 = true;
                                                        } else {
                                                            zIsGlobalNotificationsEnabled2 = false;
                                                        }
                                                    }
                                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                }
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                                }
                                                if (zIsGlobalNotificationsEnabled2) {
                                                    if (!z) {
                                                        iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                                    }
                                                    if (!z12) {
                                                        iAddToPopupMessages = iAddToPopupMessages;
                                                        z12 = messageObject3.messageOwner.from_scheduled;
                                                    }
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    this.delayedPushMessages.add(messageObject3);
                                                    appendMessage(messageObject3);
                                                    if (id != 0) {
                                                        if (sparseArray == null) {
                                                            sparseArray = new SparseArray();
                                                            this.pushMessagesDict.put(j6, sparseArray);
                                                        }
                                                        sparseArray.put(id, messageObject3);
                                                    } else {
                                                        j9 = j4;
                                                        if (j9 != 0) {
                                                            this.fcmRandomMessagesDict.put(j9, messageObject3);
                                                        }
                                                    }
                                                    if (j5 != j8) {
                                                        num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                                        LongSparseArray longSparseArray5 = this.pushDialogsOverrideMention;
                                                        if (num2 == null) {
                                                            iIntValue2 = 1;
                                                        } else {
                                                            iIntValue2 = num2.intValue() + 1;
                                                        }
                                                        longSparseArray5.put(j5, Integer.valueOf(iIntValue2));
                                                    }
                                                } else {
                                                    j8 = j8;
                                                    messageObject3 = messageObject3;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                }
                                                if (messageObject3.isReactionPush) {
                                                    SparseBooleanArray sparseBooleanArray4 = new SparseBooleanArray();
                                                    sparseBooleanArray4.put(id, true);
                                                    getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray4);
                                                }
                                                z10 = true;
                                            } else {
                                                message = messageObject3.messageOwner;
                                                if (!message.mentioned) {
                                                    if (z3) {
                                                    }
                                                    fromChatId = messageObject3.getFromChatId();
                                                } else {
                                                    fromChatId = j5;
                                                }
                                                if (isPersonalMessage(messageObject3)) {
                                                    this.personalCount++;
                                                }
                                                DialogObject.isChatDialog(fromChatId);
                                                iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                                if (iIndexOfKey < 0) {
                                                    j7 = fromChatId;
                                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                    if (notifyOverride == -1) {
                                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            StringBuilder sb8 = new StringBuilder();
                                                            sb8.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                            j8 = j7;
                                                            sb8.append(j8);
                                                            sb8.append(", ");
                                                            sb8.append(z4);
                                                            sb8.append(", ");
                                                            sb8.append(messageObject3.isReactionPush);
                                                            sb8.append(", ");
                                                            sb8.append(messageObject3.isStoryReactionPush);
                                                            sb8.append(") = ");
                                                            sb8.append(zIsGlobalNotificationsEnabled2);
                                                            FileLog.d(sb8.toString());
                                                        } else {
                                                            j8 = j7;
                                                        }
                                                    } else {
                                                        j8 = j7;
                                                        if (notifyOverride != 2) {
                                                            zIsGlobalNotificationsEnabled2 = true;
                                                        } else {
                                                            zIsGlobalNotificationsEnabled2 = false;
                                                        }
                                                    }
                                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                } else {
                                                    j7 = fromChatId;
                                                    notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                    if (notifyOverride == -1) {
                                                        zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            StringBuilder sb9 = new StringBuilder();
                                                            sb9.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                            j8 = j7;
                                                            sb9.append(j8);
                                                            sb9.append(", ");
                                                            sb9.append(z4);
                                                            sb9.append(", ");
                                                            sb9.append(messageObject3.isReactionPush);
                                                            sb9.append(", ");
                                                            sb9.append(messageObject3.isStoryReactionPush);
                                                            sb9.append(") = ");
                                                            sb9.append(zIsGlobalNotificationsEnabled2);
                                                            FileLog.d(sb9.toString());
                                                        } else {
                                                            j8 = j7;
                                                        }
                                                    } else {
                                                        j8 = j7;
                                                        if (notifyOverride != 2) {
                                                            zIsGlobalNotificationsEnabled2 = true;
                                                        } else {
                                                            zIsGlobalNotificationsEnabled2 = false;
                                                        }
                                                    }
                                                    longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                                }
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                                }
                                                if (zIsGlobalNotificationsEnabled2) {
                                                    if (!z) {
                                                        iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                                    }
                                                    if (!z12) {
                                                        iAddToPopupMessages = iAddToPopupMessages;
                                                        z12 = messageObject3.messageOwner.from_scheduled;
                                                    }
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    this.delayedPushMessages.add(messageObject3);
                                                    appendMessage(messageObject3);
                                                    if (id != 0) {
                                                        if (sparseArray == null) {
                                                            sparseArray = new SparseArray();
                                                            this.pushMessagesDict.put(j6, sparseArray);
                                                        }
                                                        sparseArray.put(id, messageObject3);
                                                    } else {
                                                        j9 = j4;
                                                        if (j9 != 0) {
                                                            this.fcmRandomMessagesDict.put(j9, messageObject3);
                                                        }
                                                    }
                                                    if (j5 != j8) {
                                                        num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                                        LongSparseArray longSparseArray6 = this.pushDialogsOverrideMention;
                                                        if (num2 == null) {
                                                            iIntValue2 = 1;
                                                        } else {
                                                            iIntValue2 = num2.intValue() + 1;
                                                        }
                                                        longSparseArray6.put(j5, Integer.valueOf(iIntValue2));
                                                    }
                                                } else {
                                                    j8 = j8;
                                                    messageObject3 = messageObject3;
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                }
                                                if (messageObject3.isReactionPush) {
                                                    SparseBooleanArray sparseBooleanArray5 = new SparseBooleanArray();
                                                    sparseBooleanArray5.put(id, true);
                                                    getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray5);
                                                }
                                                z10 = true;
                                            }
                                        }
                                        z10 = z5;
                                        iAddToPopupMessages = iAddToPopupMessages;
                                    }
                                } else {
                                    j4 = j;
                                }
                                messageObject2 = messageObject6;
                                if (messageObject2 != null) {
                                    if (messageObject2.isFcmMessage()) {
                                        if (sparseArray == null) {
                                            sparseArray = new SparseArray();
                                            this.pushMessagesDict.put(dialogId2, sparseArray);
                                        }
                                        sparseArray.put(id, messageObject4);
                                        iIndexOf = this.pushMessages.indexOf(messageObject2);
                                        if (iIndexOf >= 0) {
                                            this.pushMessages.set(iIndexOf, messageObject4);
                                            iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject4, j2, z4, notificationsSettings);
                                        }
                                        if (z) {
                                            iAddToPopupMessages = iAddToPopupMessages;
                                            z6 = messageObject4.localEdit;
                                            if (z6) {
                                                getMessagesStorage().putPushMessage(messageObject4);
                                            }
                                            z11 = z6;
                                        }
                                    } else {
                                        i3 = i3;
                                        z10 = z10;
                                        dialogId2 = dialogId2;
                                        iAddToPopupMessages = iAddToPopupMessages;
                                    }
                                    iAddToPopupMessages = iAddToPopupMessages;
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("skipped message because old message with same dialog and message ids exist: did=" + dialogId2 + ", mid=" + id);
                                    }
                                    z10 = z10;
                                } else {
                                    messageObject3 = messageObject4;
                                    j5 = j2;
                                    i3 = i3;
                                    z5 = z10;
                                    j6 = dialogId2;
                                    if (z11) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("skipped message because edited");
                                        }
                                    } else {
                                        if (z) {
                                            getMessagesStorage().putPushMessage(messageObject3);
                                        }
                                        topicId = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                                        if (j5 != this.openedDialogId) {
                                            message = messageObject3.messageOwner;
                                            if (!message.mentioned) {
                                                if (z3) {
                                                }
                                                fromChatId = messageObject3.getFromChatId();
                                            } else {
                                                fromChatId = j5;
                                            }
                                            if (isPersonalMessage(messageObject3)) {
                                                this.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                            if (iIndexOfKey < 0) {
                                                j7 = fromChatId;
                                                notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        StringBuilder sb10 = new StringBuilder();
                                                        sb10.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                        j8 = j7;
                                                        sb10.append(j8);
                                                        sb10.append(", ");
                                                        sb10.append(z4);
                                                        sb10.append(", ");
                                                        sb10.append(messageObject3.isReactionPush);
                                                        sb10.append(", ");
                                                        sb10.append(messageObject3.isStoryReactionPush);
                                                        sb10.append(") = ");
                                                        sb10.append(zIsGlobalNotificationsEnabled2);
                                                        FileLog.d(sb10.toString());
                                                    } else {
                                                        j8 = j7;
                                                    }
                                                } else {
                                                    j8 = j7;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                            } else {
                                                j7 = fromChatId;
                                                notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        StringBuilder sb11 = new StringBuilder();
                                                        sb11.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                        j8 = j7;
                                                        sb11.append(j8);
                                                        sb11.append(", ");
                                                        sb11.append(z4);
                                                        sb11.append(", ");
                                                        sb11.append(messageObject3.isReactionPush);
                                                        sb11.append(", ");
                                                        sb11.append(messageObject3.isStoryReactionPush);
                                                        sb11.append(") = ");
                                                        sb11.append(zIsGlobalNotificationsEnabled2);
                                                        FileLog.d(sb11.toString());
                                                    } else {
                                                        j8 = j7;
                                                    }
                                                } else {
                                                    j8 = j7;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                            }
                                            if (zIsGlobalNotificationsEnabled2) {
                                                if (!z) {
                                                    iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                                }
                                                if (!z12) {
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    z12 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                this.delayedPushMessages.add(messageObject3);
                                                appendMessage(messageObject3);
                                                if (id != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray = new SparseArray();
                                                        this.pushMessagesDict.put(j6, sparseArray);
                                                    }
                                                    sparseArray.put(id, messageObject3);
                                                } else {
                                                    j9 = j4;
                                                    if (j9 != 0) {
                                                        this.fcmRandomMessagesDict.put(j9, messageObject3);
                                                    }
                                                }
                                                if (j5 != j8) {
                                                    num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                                    LongSparseArray longSparseArray7 = this.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue2 = 1;
                                                    } else {
                                                        iIntValue2 = num2.intValue() + 1;
                                                    }
                                                    longSparseArray7.put(j5, Integer.valueOf(iIntValue2));
                                                }
                                            } else {
                                                j8 = j8;
                                                messageObject3 = messageObject3;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray6 = new SparseBooleanArray();
                                                sparseBooleanArray6.put(id, true);
                                                getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray6);
                                            }
                                            z10 = true;
                                        } else {
                                            message = messageObject3.messageOwner;
                                            if (!message.mentioned) {
                                                if (z3) {
                                                }
                                                fromChatId = messageObject3.getFromChatId();
                                            } else {
                                                fromChatId = j5;
                                            }
                                            if (isPersonalMessage(messageObject3)) {
                                                this.personalCount++;
                                            }
                                            DialogObject.isChatDialog(fromChatId);
                                            iIndexOfKey = longSparseArray.indexOfKey(fromChatId);
                                            if (iIndexOfKey < 0) {
                                                j7 = fromChatId;
                                                notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        StringBuilder sb12 = new StringBuilder();
                                                        sb12.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                        j8 = j7;
                                                        sb12.append(j8);
                                                        sb12.append(", ");
                                                        sb12.append(z4);
                                                        sb12.append(", ");
                                                        sb12.append(messageObject3.isReactionPush);
                                                        sb12.append(", ");
                                                        sb12.append(messageObject3.isStoryReactionPush);
                                                        sb12.append(") = ");
                                                        sb12.append(zIsGlobalNotificationsEnabled2);
                                                        FileLog.d(sb12.toString());
                                                    } else {
                                                        j8 = j7;
                                                    }
                                                } else {
                                                    j8 = j7;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                            } else {
                                                j7 = fromChatId;
                                                notifyOverride = getNotifyOverride(notificationsSettings, j7, topicId);
                                                if (notifyOverride == -1) {
                                                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(j7, Boolean.valueOf(z4), messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        StringBuilder sb13 = new StringBuilder();
                                                        sb13.append("NotificationsController: process new messages, isGlobalNotificationsEnabled(");
                                                        j8 = j7;
                                                        sb13.append(j8);
                                                        sb13.append(", ");
                                                        sb13.append(z4);
                                                        sb13.append(", ");
                                                        sb13.append(messageObject3.isReactionPush);
                                                        sb13.append(", ");
                                                        sb13.append(messageObject3.isStoryReactionPush);
                                                        sb13.append(") = ");
                                                        sb13.append(zIsGlobalNotificationsEnabled2);
                                                        FileLog.d(sb13.toString());
                                                    } else {
                                                        j8 = j7;
                                                    }
                                                } else {
                                                    j8 = j7;
                                                    if (notifyOverride != 2) {
                                                        zIsGlobalNotificationsEnabled2 = true;
                                                    } else {
                                                        zIsGlobalNotificationsEnabled2 = false;
                                                    }
                                                }
                                                longSparseArray.put(j8, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.d("NotificationsController: process new messages, value is " + zIsGlobalNotificationsEnabled2 + " (" + j8 + ", " + z4 + ", " + messageObject3.isReactionPush + ", " + messageObject3.isStoryReactionPush + ")");
                                            }
                                            if (zIsGlobalNotificationsEnabled2) {
                                                if (!z) {
                                                    iAddToPopupMessages = addToPopupMessages(arrayList2, messageObject3, j8, z4, notificationsSettings);
                                                }
                                                if (!z12) {
                                                    iAddToPopupMessages = iAddToPopupMessages;
                                                    z12 = messageObject3.messageOwner.from_scheduled;
                                                }
                                                iAddToPopupMessages = iAddToPopupMessages;
                                                this.delayedPushMessages.add(messageObject3);
                                                appendMessage(messageObject3);
                                                if (id != 0) {
                                                    if (sparseArray == null) {
                                                        sparseArray = new SparseArray();
                                                        this.pushMessagesDict.put(j6, sparseArray);
                                                    }
                                                    sparseArray.put(id, messageObject3);
                                                } else {
                                                    j9 = j4;
                                                    if (j9 != 0) {
                                                        this.fcmRandomMessagesDict.put(j9, messageObject3);
                                                    }
                                                }
                                                if (j5 != j8) {
                                                    num2 = (Integer) this.pushDialogsOverrideMention.get(j5);
                                                    LongSparseArray longSparseArray8 = this.pushDialogsOverrideMention;
                                                    if (num2 == null) {
                                                        iIntValue2 = 1;
                                                    } else {
                                                        iIntValue2 = num2.intValue() + 1;
                                                    }
                                                    longSparseArray8.put(j5, Integer.valueOf(iIntValue2));
                                                }
                                            } else {
                                                j8 = j8;
                                                messageObject3 = messageObject3;
                                                iAddToPopupMessages = iAddToPopupMessages;
                                            }
                                            if (messageObject3.isReactionPush) {
                                                SparseBooleanArray sparseBooleanArray7 = new SparseBooleanArray();
                                                sparseBooleanArray7.put(id, true);
                                                getMessagesController().checkUnreadReactions(j8, topicId, sparseBooleanArray7);
                                            }
                                            z10 = true;
                                        }
                                    }
                                    z10 = z5;
                                    iAddToPopupMessages = iAddToPopupMessages;
                                }
                            }
                        }
                        z3 = z9;
                        i3 = i3;
                        z5 = z10;
                        z10 = z5;
                        iAddToPopupMessages = iAddToPopupMessages;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("skipped message because 1");
                }
                z3 = z9;
                i3 = i3;
                z5 = z10;
                z10 = z5;
                iAddToPopupMessages = iAddToPopupMessages;
            }
            i3++;
            z9 = z3;
        }
        final int i4 = iAddToPopupMessages;
        boolean z14 = z10;
        if (z14) {
            this.notifyCheck = z2;
        }
        if (!arrayList2.isEmpty() && !AndroidUtilities.needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processNewMessages$25(arrayList2, i4);
                }
            });
        }
        if (z || z12) {
            if (z11) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + this.notifyCheck);
                }
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else if (z14) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("NotificationsController processNewMessages: added branch");
                }
                MessageObject messageObject7 = (MessageObject) arrayList.get(0);
                long dialogId4 = messageObject7.getDialogId();
                long topicId2 = MessageObject.getTopicId(this.currentAccount, messageObject7.messageOwner, getMessagesController().isForum(dialogId4));
                Boolean boolValueOf = messageObject7.isFcmMessage() ? Boolean.valueOf(messageObject7.localChannel) : null;
                int i5 = this.total_unread_count;
                int notifyOverride2 = getNotifyOverride(notificationsSettings, dialogId4, topicId2);
                if (notifyOverride2 == -1) {
                    zIsGlobalNotificationsEnabled = isGlobalNotificationsEnabled(dialogId4, boolValueOf, messageObject7.isReactionPush, messageObject7.isStoryReactionPush);
                } else {
                    zIsGlobalNotificationsEnabled = notifyOverride2 != 2;
                }
                Integer num3 = (Integer) this.pushDialogs.get(dialogId4);
                if (num3 != null) {
                    i = 1;
                    iIntValue = num3.intValue() + 1;
                } else {
                    i = 1;
                    iIntValue = 1;
                }
                if (this.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) this.pushDialogsOverrideMention.get(dialogId4)) != null && num.intValue() != 0) {
                    iIntValue = num.intValue();
                    zIsGlobalNotificationsEnabled = true;
                }
                if (zIsGlobalNotificationsEnabled && !messageObject7.isStoryPush) {
                    if (!getMessagesController().isCommunity(dialogId4)) {
                        if (getMessagesController().isForum(dialogId4)) {
                            int i6 = this.total_unread_count - ((num3 == null || num3.intValue() <= 0) ? 0 : 1);
                            this.total_unread_count = i6;
                            if (iIntValue <= 0) {
                                i = 0;
                            }
                            this.total_unread_count = i6 + i;
                        } else {
                            if (num3 != null) {
                                this.total_unread_count -= num3.intValue();
                            }
                            this.total_unread_count += iIntValue;
                        }
                    }
                    this.pushDialogs.put(dialogId4, Integer.valueOf(iIntValue));
                }
                if (i5 != this.total_unread_count || z13) {
                    this.delayedPushMessages.clear();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("NotificationsController processNewMessages: added branch: " + this.notifyCheck);
                    }
                    showOrUpdateNotification(this.notifyCheck);
                    final int size = this.pushDialogs.size();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$processNewMessages$26(size);
                        }
                    });
                }
                this.notifyCheck = false;
                if (this.showBadgeNumber) {
                    setBadge(getTotalAllUnreadCount());
                }
            }
        }
        if (z13) {
            updateStoryPushesRunnable();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void lambda$processNewMessages$24(int i) {
        LongSparseArray longSparseArray = new LongSparseArray();
        longSparseArray.put(0L, Lists.newArrayList(Integer.valueOf(i)));
        removeDeletedMessagesFromNotifications(longSparseArray, false);
    }

    public void lambda$processNewMessages$25(ArrayList arrayList, int i) {
        this.popupMessages.addAll(0, arrayList);
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

    public void lambda$processNewMessages$26(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
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
                this.f$0.lambda$processDialogsUpdateRead$30(longSparseIntArray, arrayList);
            }
        });
    }

    public void lambda$processDialogsUpdateRead$30(LongSparseIntArray longSparseIntArray, final ArrayList arrayList) {
        int iIntValue;
        boolean z;
        boolean zIsGlobalNotificationsEnabled;
        int i;
        int i2;
        MessageObject messageObject;
        Integer num;
        int i3 = this.total_unread_count;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        int i4 = 0;
        while (true) {
            if (i4 >= longSparseIntArray.size()) {
                break;
            }
            long jKeyAt = longSparseIntArray.keyAt(i4);
            Integer num2 = (Integer) this.pushDialogs.get(jKeyAt);
            int i5 = longSparseIntArray.get(jKeyAt);
            if (DialogObject.isChatDialog(jKeyAt)) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-jKeyAt));
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
                int notifyOverride = getNotifyOverride(notificationsSettings, jKeyAt, 0L);
                if (notifyOverride == -1) {
                    zIsGlobalNotificationsEnabled = isGlobalNotificationsEnabled(jKeyAt, false, false);
                } else if (notifyOverride != 2) {
                    zIsGlobalNotificationsEnabled = true;
                } else {
                    zIsGlobalNotificationsEnabled = false;
                }
            }
            if (this.notifyCheck && !zIsGlobalNotificationsEnabled && (num = (Integer) this.pushDialogsOverrideMention.get(jKeyAt)) != null && num.intValue() != 0) {
                iIntValue = num.intValue();
                zIsGlobalNotificationsEnabled = true;
            }
            if (iIntValue == 0) {
                this.smartNotificationsDialogs.remove(jKeyAt);
            }
            if (iIntValue >= 0) {
                if ((!zIsGlobalNotificationsEnabled || iIntValue == 0) && num2 != null) {
                    if (getMessagesController().isForum(jKeyAt)) {
                        int i6 = this.total_unread_count;
                        if (num2.intValue() > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.total_unread_count = i6 - i;
                    } else {
                        this.total_unread_count -= num2.intValue();
                    }
                }
                if (iIntValue == 0) {
                    this.pushDialogs.remove(jKeyAt);
                    this.pushDialogsOverrideMention.remove(jKeyAt);
                    i2 = 0;
                    while (i2 < this.pushMessages.size()) {
                        messageObject = this.pushMessages.get(i2);
                        if (messageObject.messageOwner.from_scheduled && messageObject.getDialogId() == jKeyAt && !messageObject.isStoryReactionPush) {
                            if (isPersonalMessage(messageObject)) {
                                this.personalCount--;
                            }
                            this.pushMessages.remove(i2);
                            i2--;
                            this.delayedPushMessages.remove(messageObject);
                            long j = messageObject.messageOwner.peer_id.channel_id;
                            long j2 = j != 0 ? -j : 0L;
                            SparseArray sparseArray = (SparseArray) this.pushMessagesDict.get(j2);
                            if (sparseArray != null) {
                                sparseArray.remove(messageObject.getId());
                                if (sparseArray.size() == 0) {
                                    this.pushMessagesDict.remove(j2);
                                }
                            }
                            arrayList.add(messageObject);
                        }
                        i2++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!getMessagesController().isCommunity(jKeyAt)) {
                        if (getMessagesController().isForum(jKeyAt)) {
                            this.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            this.total_unread_count += iIntValue;
                        }
                    }
                    this.pushDialogs.put(jKeyAt, Integer.valueOf(iIntValue));
                }
            } else if (num2 != null) {
                iIntValue = num2.intValue() + iIntValue;
                if (!zIsGlobalNotificationsEnabled) {
                    if (getMessagesController().isForum(jKeyAt)) {
                        int i7 = this.total_unread_count;
                        if (num2.intValue() > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.total_unread_count = i7 - i;
                    } else {
                        this.total_unread_count -= num2.intValue();
                    }
                } else if (getMessagesController().isForum(jKeyAt)) {
                    int i8 = this.total_unread_count;
                    if (num2.intValue() > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.total_unread_count = i8 - i;
                } else {
                    this.total_unread_count -= num2.intValue();
                }
                if (iIntValue == 0) {
                    this.pushDialogs.remove(jKeyAt);
                    this.pushDialogsOverrideMention.remove(jKeyAt);
                    i2 = 0;
                    while (i2 < this.pushMessages.size()) {
                        messageObject = this.pushMessages.get(i2);
                        if (messageObject.messageOwner.from_scheduled) {
                        }
                        i2++;
                    }
                } else if (!zIsGlobalNotificationsEnabled) {
                    if (!getMessagesController().isCommunity(jKeyAt)) {
                        if (getMessagesController().isForum(jKeyAt)) {
                            this.total_unread_count += iIntValue <= 0 ? 0 : 1;
                        } else {
                            this.total_unread_count += iIntValue;
                        }
                    }
                    this.pushDialogs.put(jKeyAt, Integer.valueOf(iIntValue));
                }
            }
            i4++;
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processDialogsUpdateRead$28(arrayList);
                }
            });
        }
        if (i3 != this.total_unread_count) {
            if (!this.notifyCheck) {
                this.delayedPushMessages.clear();
                showOrUpdateNotification(this.notifyCheck);
            } else {
                scheduleNotificationDelay(this.lastOnlineFromOtherDevice > getConnectionsManager().getCurrentTime());
            }
            final int size = this.pushDialogs.size();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processDialogsUpdateRead$29(size);
                }
            });
        }
        this.notifyCheck = false;
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$processDialogsUpdateRead$28(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.popupMessages.remove(arrayList.get(i));
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
    }

    public void lambda$processDialogsUpdateRead$29(int i) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
    }

    public void processLoadedUnreadMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final ArrayList<MessageObject> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5, final Collection<StoryNotification> collection) {
        getMessagesController().putUsers(arrayList3, true);
        getMessagesController().putChats(arrayList4, true);
        getMessagesController().putEncryptedChats(arrayList5, true);
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedUnreadMessages$33(arrayList, longSparseArray, arrayList2, collection);
            }
        });
    }

    public void lambda$processLoadedUnreadMessages$33(ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, Collection collection) {
        long j;
        boolean zIsGlobalNotificationsEnabled;
        LongSparseArray longSparseArray2;
        long dialogId;
        boolean zIsGlobalNotificationsEnabled2;
        boolean zBooleanValue;
        TLRPC.MessageFwdHeader messageFwdHeader;
        SharedPreferences sharedPreferences;
        MessageObject messageObject;
        boolean zIsGlobalNotificationsEnabled3;
        SparseArray sparseArray;
        ArrayList arrayList3 = arrayList;
        this.pushDialogs.clear();
        this.pushMessages.clear();
        this.pushMessagesDict.clear();
        this.storyPushMessages.clear();
        this.storyPushMessagesDict.clear();
        boolean z = false;
        this.total_unread_count = 0;
        this.personalCount = 0;
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        LongSparseArray longSparseArray3 = new LongSparseArray();
        long j2 = 0;
        if (arrayList3 != null) {
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC.Message message = (TLRPC.Message) arrayList3.get(i);
                if (message != null && ((messageFwdHeader = message.fwd_from) == null || !messageFwdHeader.imported)) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) || (message.silent && ((messageAction instanceof TLRPC.TL_messageActionContactSignUp) || (messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                        i = i;
                        sharedPreferences = notificationsSettings;
                    } else {
                        long j3 = message.peer_id.channel_id;
                        long j4 = j3 != j2 ? -j3 : j2;
                        SparseArray sparseArray2 = (SparseArray) this.pushMessagesDict.get(j4);
                        if (sparseArray2 == null || sparseArray2.indexOfKey(message.id) < 0) {
                            MessageObject messageObject2 = new MessageObject(this.currentAccount, message, z, z);
                            if (isPersonalMessage(messageObject2)) {
                                this.personalCount++;
                            }
                            sharedPreferences = notificationsSettings;
                            long dialogId2 = messageObject2.getDialogId();
                            long topicId = MessageObject.getTopicId(this.currentAccount, messageObject2.messageOwner, getMessagesController().isForum(messageObject2));
                            long fromChatId = messageObject2.messageOwner.mentioned ? messageObject2.getFromChatId() : dialogId2;
                            int iIndexOfKey = longSparseArray3.indexOfKey(fromChatId);
                            if (iIndexOfKey >= 0 && topicId == 0) {
                                zIsGlobalNotificationsEnabled3 = ((Boolean) longSparseArray3.valueAt(iIndexOfKey)).booleanValue();
                                messageObject = messageObject2;
                            } else {
                                messageObject = messageObject2;
                                int notifyOverride = getNotifyOverride(sharedPreferences, fromChatId, topicId);
                                if (notifyOverride == -1) {
                                    zIsGlobalNotificationsEnabled3 = isGlobalNotificationsEnabled(fromChatId, messageObject.isReactionPush, messageObject.isStoryReactionPush);
                                } else {
                                    zIsGlobalNotificationsEnabled3 = notifyOverride != 2;
                                }
                                longSparseArray3.put(fromChatId, Boolean.valueOf(zIsGlobalNotificationsEnabled3));
                            }
                            if (zIsGlobalNotificationsEnabled3 && (fromChatId != this.openedDialogId || !ApplicationLoader.isScreenOn)) {
                                if (sparseArray2 == 0) {
                                    sparseArray = new SparseArray();
                                    this.pushMessagesDict.put(j4, sparseArray);
                                } else {
                                    sparseArray = sparseArray2;
                                }
                                sparseArray.put(message.id, messageObject);
                                appendMessage(messageObject);
                                if (dialogId2 != fromChatId) {
                                    Integer num = (Integer) this.pushDialogsOverrideMention.get(dialogId2);
                                    this.pushDialogsOverrideMention.put(dialogId2, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                                }
                            }
                        } else {
                            i = i;
                            sharedPreferences = notificationsSettings;
                        }
                    }
                } else {
                    i = i;
                    sharedPreferences = notificationsSettings;
                }
                i++;
                arrayList3 = arrayList;
                notificationsSettings = sharedPreferences;
                z = false;
                j2 = 0;
            }
        }
        SharedPreferences sharedPreferences2 = notificationsSettings;
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            int iIndexOfKey2 = longSparseArray3.indexOfKey(jKeyAt);
            if (iIndexOfKey2 >= 0) {
                zBooleanValue = ((Boolean) longSparseArray3.valueAt(iIndexOfKey2)).booleanValue();
            } else {
                int notifyOverride2 = getNotifyOverride(sharedPreferences2, jKeyAt, 0L);
                if (notifyOverride2 == -1) {
                    zIsGlobalNotificationsEnabled2 = isGlobalNotificationsEnabled(jKeyAt, false, false);
                } else {
                    zIsGlobalNotificationsEnabled2 = notifyOverride2 != 2;
                }
                longSparseArray3.put(jKeyAt, Boolean.valueOf(zIsGlobalNotificationsEnabled2));
                zBooleanValue = zIsGlobalNotificationsEnabled2;
            }
            if (zBooleanValue) {
                Integer num2 = (Integer) longSparseArray.valueAt(i2);
                int iIntValue = num2.intValue();
                this.pushDialogs.put(jKeyAt, num2);
                if (!getMessagesController().isCommunity(jKeyAt)) {
                    if (getMessagesController().isForum(jKeyAt)) {
                        this.total_unread_count += iIntValue > 0 ? 1 : 0;
                    } else {
                        this.total_unread_count += iIntValue;
                    }
                }
            }
        }
        if (arrayList2 != null) {
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                MessageObject messageObject3 = (MessageObject) arrayList2.get(i3);
                int id = messageObject3.getId();
                if (this.pushMessagesDict.indexOfKey(id) < 0) {
                    if (isPersonalMessage(messageObject3)) {
                        this.personalCount++;
                    }
                    long dialogId3 = messageObject3.getDialogId();
                    long topicId2 = MessageObject.getTopicId(this.currentAccount, messageObject3.messageOwner, getMessagesController().isForum(messageObject3));
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    long j5 = message2.random_id;
                    long fromChatId2 = message2.mentioned ? messageObject3.getFromChatId() : dialogId3;
                    int iIndexOfKey3 = longSparseArray3.indexOfKey(fromChatId2);
                    if (iIndexOfKey3 >= 0 && topicId2 == 0) {
                        zIsGlobalNotificationsEnabled = ((Boolean) longSparseArray3.valueAt(iIndexOfKey3)).booleanValue();
                        j = fromChatId2;
                    } else {
                        long j6 = fromChatId2;
                        int notifyOverride3 = getNotifyOverride(sharedPreferences2, j6, topicId2);
                        if (notifyOverride3 == -1) {
                            j = j6;
                            zIsGlobalNotificationsEnabled = isGlobalNotificationsEnabled(j, messageObject3.isReactionPush, messageObject3.isStoryReactionPush);
                        } else {
                            j = j6;
                            zIsGlobalNotificationsEnabled = notifyOverride3 != 2;
                        }
                        longSparseArray3.put(j, Boolean.valueOf(zIsGlobalNotificationsEnabled));
                    }
                    if (!zIsGlobalNotificationsEnabled || (j == this.openedDialogId && ApplicationLoader.isScreenOn)) {
                        longSparseArray2 = longSparseArray3;
                    } else {
                        if (id != 0) {
                            if (messageObject3.isStoryReactionPush) {
                                dialogId = messageObject3.getDialogId();
                            } else {
                                long j7 = messageObject3.messageOwner.peer_id.channel_id;
                                dialogId = j7 != 0 ? -j7 : 0L;
                            }
                            SparseArray sparseArray3 = (SparseArray) this.pushMessagesDict.get(dialogId);
                            if (sparseArray3 == null) {
                                sparseArray3 = new SparseArray();
                                this.pushMessagesDict.put(dialogId, sparseArray3);
                            }
                            sparseArray3.put(id, messageObject3);
                            longSparseArray2 = longSparseArray3;
                        } else {
                            longSparseArray2 = longSparseArray3;
                            if (j5 != 0) {
                                this.fcmRandomMessagesDict.put(j5, messageObject3);
                            }
                        }
                        appendMessage(messageObject3);
                        if (dialogId3 != j) {
                            Integer num3 = (Integer) this.pushDialogsOverrideMention.get(dialogId3);
                            this.pushDialogsOverrideMention.put(dialogId3, Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1));
                        }
                        Integer num4 = (Integer) this.pushDialogs.get(j);
                        int iIntValue2 = num4 != null ? num4.intValue() + 1 : 1;
                        if (!getMessagesController().isCommunity(j)) {
                            if (getMessagesController().isForum(j)) {
                                if (num4 != null) {
                                    this.total_unread_count -= num4.intValue() > 0 ? 1 : 0;
                                }
                                this.total_unread_count += iIntValue2 > 0 ? 1 : 0;
                            } else {
                                if (num4 != null) {
                                    this.total_unread_count -= num4.intValue();
                                }
                                this.total_unread_count += iIntValue2;
                            }
                        }
                        this.pushDialogs.put(j, Integer.valueOf(iIntValue2));
                    }
                } else {
                    longSparseArray2 = longSparseArray3;
                }
                i3++;
                longSparseArray3 = longSparseArray2;
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                StoryNotification storyNotification = (StoryNotification) it.next();
                long j8 = storyNotification.dialogId;
                StoryNotification storyNotification2 = (StoryNotification) this.storyPushMessagesDict.get(j8);
                if (storyNotification2 != null) {
                    storyNotification2.dateByIds.putAll(storyNotification.dateByIds);
                } else {
                    this.storyPushMessages.add(storyNotification);
                    this.storyPushMessagesDict.put(j8, storyNotification);
                }
            }
            Collections.sort(this.storyPushMessages, Comparator$CC.comparingLong(new ToLongFunction() {
                @Override
                public final long applyAsLong(Object obj) {
                    return ((NotificationsController.StoryNotification) obj).date;
                }
            }));
        }
        final int size = this.pushDialogs.size();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedUnreadMessages$32(size);
            }
        });
        showOrUpdateNotification(SystemClock.elapsedRealtime() / 1000 < 60);
        if (this.showBadgeNumber) {
            setBadge(getTotalAllUnreadCount());
        }
    }

    public void lambda$processLoadedUnreadMessages$32(int i) {
        if (this.total_unread_count == 0) {
            this.popupMessages.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsCountUpdated, Integer.valueOf(this.currentAccount));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadCounterChanged, Integer.valueOf(i));
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

    public void lambda$updateBadge$34() {
        setBadge(getTotalAllUnreadCount());
    }

    public void updateBadge() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateBadge$34();
            }
        });
    }

    private void setBadge(int i) {
        if (this.lastBadgeCount == i) {
            return;
        }
        FileLog.d("setBadge " + i);
        this.lastBadgeCount = i;
        NotificationBadge.applyCount(i);
    }

    public java.lang.String getShortStringForMessage(org.telegram.messenger.MessageObject r27, java.lang.String[] r28, boolean[] r29) {
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
        String str;
        String str2;
        String string;
        TLRPC.Chat chat;
        String string2;
        boolean z2;
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.MessageAction messageAction;
        String str3;
        char c;
        char c2;
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode;
        TLRPC.Chat chat2;
        String title;
        long jLongValue;
        StringBuilder sb;
        int i;
        TLRPC.User user;
        TLRPC.User user2;
        long jLongValue2;
        StringBuilder sb2;
        int i2;
        TLRPC.User user3;
        TLRPC.User user4;
        char c3;
        boolean z3;
        String string3;
        String string4;
        String string5;
        if (AndroidUtilities.needShowPasscode() || SharedConfig.isWaitingForPasscodeEnter) {
            return LocaleController.getString(R.string.YouHaveNewMessage);
        }
        if (messageObject.isStoryPush || messageObject.isStoryMentionPush) {
            return "!" + messageObject.messageOwner.message;
        }
        TLRPC.Message message3 = messageObject.messageOwner;
        long j = message3.dialog_id;
        TLRPC.Peer peer = message3.peer_id;
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
        boolean z4 = notificationsSettings.getBoolean("content_preview_" + j, true);
        if (messageObject.isFcmMessage()) {
            if (j2 == 0 && fromChatId != 0) {
                if (!z4 || !notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                    if (zArr2 != null) {
                        zArr2[0] = false;
                    }
                    return LocaleController.formatString(R.string.NotificationMessageNoText, messageObject.localName);
                }
            } else if (j2 != 0 && (!z4 || ((!messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewGroup", true)) || (messageObject.localChannel && !notificationsSettings.getBoolean("EnablePreviewChannel", true))))) {
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
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
            string = LocaleController.getString(R.string.BotAuthNotificationTitle);
        } else if (fromChatId > 0) {
            if (messageObject.messageOwner.from_scheduled) {
                if (j == clientUserId) {
                    string5 = LocaleController.getString(R.string.MessageScheduledReminderNotification);
                } else {
                    string5 = LocaleController.getString(R.string.NotificationMessageScheduledName);
                }
                str2 = "EnablePreviewGroup";
                String str4 = string5;
                str = "EnablePreviewChannel";
                string = str4;
            } else {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(fromChatId));
                if (user5 != null) {
                    str = "EnablePreviewChannel";
                    str2 = "EnablePreviewGroup";
                    string = UserObject.getUserName(user5);
                } else {
                    str = "EnablePreviewChannel";
                    str2 = "EnablePreviewGroup";
                }
            }
        } else {
            str = "EnablePreviewChannel";
            str2 = "EnablePreviewGroup";
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-fromChatId));
            string = chat3 != null ? getTitle(chat3) : null;
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
        if (!DialogObject.isEncryptedDialog(j)) {
            String str5 = str2;
            String str6 = str;
            if (j2 != 0 || fromChatId == 0) {
                if (j2 != 0) {
                    boolean z5 = ChatObject.isChannel(chat) && !chat.megagroup;
                    if (z4) {
                        if (z5) {
                            z2 = true;
                        } else {
                            z2 = true;
                            if (!notificationsSettings.getBoolean(str5, true)) {
                            }
                            message = messageObject.messageOwner;
                            if (message instanceof TLRPC.TL_messageService) {
                                messageAction = message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionChatAddUser) {
                                    jLongValue2 = messageAction.user_id;
                                    if (jLongValue2 == 0 && messageAction.users.size() == 1) {
                                        jLongValue2 = messageObject.messageOwner.action.users.get(0).longValue();
                                    }
                                    if (jLongValue2 != 0) {
                                        sb2 = new StringBuilder();
                                        for (i2 = 0; i2 < messageObject.messageOwner.action.users.size(); i2++) {
                                            user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i2));
                                            if (user3 != null) {
                                                String userName = UserObject.getUserName(user3);
                                                if (sb2.length() != 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(userName);
                                            }
                                        }
                                        string2 = LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), sb2.toString());
                                    } else if (messageObject.messageOwner.peer_id.channel_id == 0 && !chat.megagroup) {
                                        string2 = LocaleController.formatString(R.string.ChannelAddedByNotification, string, getTitle(chat));
                                    } else if (jLongValue2 == clientUserId) {
                                        string2 = LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                                    } else {
                                        user4 = getMessagesController().getUser(Long.valueOf(jLongValue2));
                                        if (user4 == null) {
                                            return null;
                                        }
                                        if (fromChatId == user4.id) {
                                            if (chat.megagroup) {
                                                string2 = LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat));
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat));
                                            }
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user4));
                                        }
                                    }
                                } else {
                                    if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                                        return messageAction.duration != 0 ? LocaleController.formatString(R.string.NotificationGroupEndedCall, string, getTitle(chat)) : LocaleController.formatString(R.string.NotificationGroupCreatedCall, string, getTitle(chat));
                                    }
                                    if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                        string2 = messageObject.messageText.toString();
                                    } else if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                        jLongValue = messageAction.user_id;
                                        if (jLongValue == 0 && messageAction.users.size() == 1) {
                                            jLongValue = messageObject.messageOwner.action.users.get(0).longValue();
                                        }
                                        if (jLongValue != 0) {
                                            sb = new StringBuilder();
                                            for (i = 0; i < messageObject.messageOwner.action.users.size(); i++) {
                                                user = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i));
                                                if (user != null) {
                                                    String userName2 = UserObject.getUserName(user);
                                                    if (sb.length() != 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(userName2);
                                                }
                                            }
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), sb.toString());
                                        } else if (jLongValue == clientUserId) {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, string, getTitle(chat));
                                        } else {
                                            user2 = getMessagesController().getUser(Long.valueOf(jLongValue));
                                            if (user2 == null) {
                                                return null;
                                            }
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), UserObject.getUserName(user2));
                                        }
                                    } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                        tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
                                        chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                                        if (chat2 == null) {
                                            title = null;
                                        } else {
                                            title = getTitle(chat2);
                                        }
                                        if (title == null) {
                                            string2 = LocaleController.getString(R.string.BoostingReceivedGiftNoName);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
                                        }
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                        string2 = LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, string, getTitle(chat));
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatEditTitle) {
                                        string2 = LocaleController.formatString(R.string.NotificationEditedGroupName, string, messageAction.title);
                                    } else if (!(messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                                        string2 = messageObject.messageText.toString();
                                    } else if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                                        if (message.peer_id.channel_id == 0 && !chat.megagroup) {
                                            if (messageObject.isVideoAvatar()) {
                                                string2 = LocaleController.formatString(R.string.ChannelVideoEditNotification, getTitle(chat));
                                            } else {
                                                string2 = LocaleController.formatString(R.string.ChannelPhotoEditNotification, getTitle(chat));
                                            }
                                        } else if (messageObject.isVideoAvatar()) {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                                        }
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                        long j3 = messageAction.user_id;
                                        if (j3 == clientUserId) {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupKickYou, string, getTitle(chat));
                                        } else if (j3 == fromChatId) {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupLeftMember, string, getTitle(chat));
                                        } else {
                                            TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.action.user_id));
                                            if (user6 == null) {
                                                return null;
                                            }
                                            string2 = LocaleController.formatString(R.string.NotificationGroupKickMember, string, getTitle(chat), UserObject.getUserName(user6));
                                        }
                                    } else {
                                        str3 = null;
                                        if ((messageAction instanceof TLRPC.TL_messageActionChatCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                                            string2 = messageObject.messageText.toString();
                                        } else if (messageAction instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                            string2 = LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, getTitle(chat));
                                        } else if (messageAction instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                            string2 = LocaleController.formatString(R.string.ActionMigrateFromGroupNotify, messageAction.title);
                                        } else if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                            string2 = messageObject.messageText.toString();
                                        } else if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                                                MessageObject messageObject2 = messageObject.replyMessageObject;
                                                if (messageObject2 == null) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                                                } else if (messageObject2.isMusic()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedMusic, string, getTitle(chat));
                                                } else if (messageObject2.isVideo()) {
                                                    if (!TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📹 " + messageObject2.messageOwner.message, getTitle(chat));
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedVideo, string, getTitle(chat));
                                                    }
                                                } else if (messageObject2.isGif()) {
                                                    if (!TextUtils.isEmpty(messageObject2.messageOwner.message)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🎬 " + messageObject2.messageOwner.message, getTitle(chat));
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGif, string, getTitle(chat));
                                                    }
                                                } else if (messageObject2.isVoice()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedVoice, string, getTitle(chat));
                                                } else if (messageObject2.isRoundVideo()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedRound, string, getTitle(chat));
                                                } else if (messageObject2.isSticker() || messageObject2.isAnimatedSticker()) {
                                                    String stickerEmoji = messageObject2.getStickerEmoji();
                                                    if (stickerEmoji != null) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedStickerEmoji, string, getTitle(chat), stickerEmoji);
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedSticker, string, getTitle(chat));
                                                    }
                                                } else {
                                                    TLRPC.Message message4 = messageObject2.messageOwner;
                                                    TLRPC.MessageMedia messageMedia2 = message4.media;
                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                                        if (!TextUtils.isEmpty(message4.message)) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedText, string, "📎 " + messageObject2.messageOwner.message, getTitle(chat));
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedFile, string, getTitle(chat));
                                                        }
                                                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGeo, string, getTitle(chat));
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, string, getTitle(chat));
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                                                        TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                        if (tL_messageMediaPoll2.poll.quiz) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, string, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedPoll2, string, getTitle(chat), tL_messageMediaPoll2.poll.question.text);
                                                        }
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia2).todo.title.text);
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                        if (!TextUtils.isEmpty(message4.message)) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedText, string, "🖼 " + messageObject2.messageOwner.message, getTitle(chat));
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedPhoto, string, getTitle(chat));
                                                        }
                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGame, string, getTitle(chat));
                                                    } else {
                                                        CharSequence charSequence = messageObject2.messageText;
                                                        if (charSequence != null && charSequence.length() > 0) {
                                                            CharSequence string6 = messageObject2.messageText;
                                                            if (string6.length() > 20) {
                                                                StringBuilder sb3 = new StringBuilder();
                                                                c = 0;
                                                                sb3.append((Object) string6.subSequence(0, 20));
                                                                sb3.append("...");
                                                                string6 = sb3.toString();
                                                            } else {
                                                                c = 0;
                                                            }
                                                            int i3 = R.string.NotificationActionPinnedText;
                                                            String title2 = getTitle(chat);
                                                            Object[] objArr = new Object[3];
                                                            objArr[c] = string;
                                                            objArr[1] = string6;
                                                            objArr[2] = title2;
                                                            string2 = LocaleController.formatString(i3, objArr);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedNoText, string, getTitle(chat));
                                                        }
                                                    }
                                                }
                                            } else {
                                                MessageObject messageObject3 = messageObject.replyMessageObject;
                                                if (messageObject3 == null) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                                                } else if (messageObject3.isMusic()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedMusicChannel, getTitle(chat));
                                                } else if (messageObject3.isVideo()) {
                                                    if (!TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📹 " + messageObject3.messageOwner.message);
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedVideoChannel, getTitle(chat));
                                                    }
                                                } else if (messageObject3.isGif()) {
                                                    if (!TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🎬 " + messageObject3.messageOwner.message);
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, getTitle(chat));
                                                    }
                                                } else if (messageObject3.isVoice()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedVoiceChannel, getTitle(chat));
                                                } else if (messageObject3.isRoundVideo()) {
                                                    string2 = LocaleController.formatString(R.string.NotificationActionPinnedRoundChannel, getTitle(chat));
                                                } else if (messageObject3.isSticker() || messageObject3.isAnimatedSticker()) {
                                                    String stickerEmoji2 = messageObject3.getStickerEmoji();
                                                    if (stickerEmoji2 != null) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedStickerEmojiChannel, getTitle(chat), stickerEmoji2);
                                                    } else {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedStickerChannel, getTitle(chat));
                                                    }
                                                } else {
                                                    TLRPC.Message message5 = messageObject3.messageOwner;
                                                    TLRPC.MessageMedia messageMedia3 = message5.media;
                                                    if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                                        if (!TextUtils.isEmpty(message5.message)) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "📎 " + messageObject3.messageOwner.message);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedFileChannel, getTitle(chat));
                                                        }
                                                    } else if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, getTitle(chat));
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, getTitle(chat));
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                                                        TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageObject.messageOwner.media;
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedContactChannel2, getTitle(chat), ContactsController.formatName(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) messageMedia3;
                                                        if (tL_messageMediaPoll3.poll.quiz) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, getTitle(chat), tL_messageMediaPoll3.poll.question.text);
                                                        }
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                                                        if (!TextUtils.isEmpty(message5.message)) {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedTextChannel, getTitle(chat), "🖼 " + messageObject3.messageOwner.message);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedPhotoChannel, getTitle(chat));
                                                        }
                                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaGame) {
                                                        string2 = LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, getTitle(chat));
                                                    } else {
                                                        CharSequence charSequence2 = messageObject3.messageText;
                                                        if (charSequence2 != null && charSequence2.length() > 0) {
                                                            CharSequence string7 = messageObject3.messageText;
                                                            if (string7.length() > 20) {
                                                                StringBuilder sb4 = new StringBuilder();
                                                                c2 = 0;
                                                                sb4.append((Object) string7.subSequence(0, 20));
                                                                sb4.append("...");
                                                                string7 = sb4.toString();
                                                            } else {
                                                                c2 = 0;
                                                            }
                                                            int i4 = R.string.NotificationActionPinnedTextChannel;
                                                            String title3 = getTitle(chat);
                                                            Object[] objArr2 = new Object[2];
                                                            objArr2[c2] = title3;
                                                            objArr2[1] = string7;
                                                            string2 = LocaleController.formatString(i4, objArr2);
                                                        } else {
                                                            string2 = LocaleController.formatString(R.string.NotificationActionPinnedNoTextChannel, getTitle(chat));
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                            string2 = messageObject.messageText.toString();
                                        } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                                            String themeEmoticonOrGiftTitle = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction).theme);
                                            if (TextUtils.isEmpty(themeEmoticonOrGiftTitle)) {
                                                if (j == clientUserId) {
                                                    string2 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                                                } else {
                                                    string2 = LocaleController.formatString("ChatThemeDisabled", R.string.ChatThemeDisabled, string, themeEmoticonOrGiftTitle);
                                                }
                                            } else if (j == clientUserId) {
                                                string2 = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle);
                                            } else {
                                                string2 = LocaleController.formatString(R.string.ChatThemeChangedTo, string, themeEmoticonOrGiftTitle);
                                            }
                                        } else if (messageAction instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                            string2 = messageObject.messageText.toString();
                                        }
                                    }
                                }
                            } else if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                                if (messageObject.isMediaEmpty()) {
                                    if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                        String string8 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                                        zArr[0] = true;
                                        return string8;
                                    }
                                    string2 = LocaleController.formatString(R.string.ChannelMessageNoText, string);
                                } else if (messageObject.type == 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                    string2 = LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, getTitle(chat));
                                } else {
                                    TLRPC.Message message6 = messageObject.messageOwner;
                                    if (message6.media instanceof TLRPC.TL_messageMediaPhoto) {
                                        if (!z && !TextUtils.isEmpty(message6.message)) {
                                            String string9 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                                            zArr[0] = true;
                                            return string9;
                                        }
                                        string2 = LocaleController.formatString(R.string.ChannelMessagePhoto, string);
                                    } else if (messageObject.isVideo()) {
                                        if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                            String string10 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                                            zArr[0] = true;
                                            return string10;
                                        }
                                        string2 = LocaleController.formatString(R.string.ChannelMessageVideo, string);
                                    } else if (messageObject.isVoice()) {
                                        string2 = LocaleController.formatString(R.string.ChannelMessageAudio, string);
                                    } else if (messageObject.isRoundVideo()) {
                                        string2 = LocaleController.formatString(R.string.ChannelMessageRound, string);
                                    } else if (messageObject.isMusic()) {
                                        string2 = LocaleController.formatString(R.string.ChannelMessageMusic, string);
                                    } else {
                                        TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                                        if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                                            TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageMedia4;
                                            string2 = LocaleController.formatString(R.string.ChannelMessageContact2, string, ContactsController.formatName(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                                            TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia4).poll;
                                            if (poll.quiz) {
                                                string2 = LocaleController.formatString(R.string.ChannelMessageQuiz2, string, poll.question.text);
                                            } else {
                                                string2 = LocaleController.formatString(R.string.ChannelMessagePoll2, string, poll.question.text);
                                            }
                                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                                            string2 = LocaleController.formatString(R.string.ChannelMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaGiveaway) {
                                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia4;
                                            string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway.quantity), Integer.valueOf(tL_messageMediaGiveaway.months));
                                        } else if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                                            string2 = LocaleController.formatString(R.string.ChannelMessageMap, string);
                                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                                            string2 = LocaleController.formatString(R.string.ChannelMessageLiveLocation, string);
                                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                                String stickerEmoji3 = messageObject.getStickerEmoji();
                                                if (stickerEmoji3 != null) {
                                                    string2 = LocaleController.formatString(R.string.ChannelMessageStickerEmoji, string, stickerEmoji3);
                                                } else {
                                                    string2 = LocaleController.formatString(R.string.ChannelMessageSticker, string);
                                                }
                                            } else if (messageObject.isGif()) {
                                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                    String string11 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                                                    zArr[0] = true;
                                                    return string11;
                                                }
                                                string2 = LocaleController.formatString(R.string.ChannelMessageGIF, string);
                                            } else {
                                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                    String string12 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                                                    zArr[0] = true;
                                                    return string12;
                                                }
                                                string2 = LocaleController.formatString(R.string.ChannelMessageDocument, string);
                                            }
                                        } else {
                                            if (!z && !TextUtils.isEmpty(messageObject.messageText)) {
                                                String string13 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                                                zArr[0] = true;
                                                return string13;
                                            }
                                            string2 = LocaleController.formatString(R.string.ChannelMessageNoText, string);
                                        }
                                    }
                                }
                            } else if (messageObject.isMediaEmpty()) {
                                if (z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageOwner.message);
                                } else {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                }
                            } else if (messageObject.type != 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                string2 = LocaleController.formatPluralString("NotificationChatMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string, getTitle(chat));
                            } else {
                                message2 = messageObject.messageOwner;
                                if (message2.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (z && !TextUtils.isEmpty(message2.message)) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🖼 " + messageObject.messageOwner.message);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVideo()) {
                                    if (z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📹 " + messageObject.messageOwner.message);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVoice()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                                } else if (messageObject.isRoundVideo()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                } else if (messageObject.isMusic()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                } else {
                                    messageMedia = messageObject.messageOwner.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                        TLRPC.TL_messageMediaContact tL_messageMediaContact4 = (TLRPC.TL_messageMediaContact) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact4.first_name, tL_messageMediaContact4.last_name));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                        if (tL_messageMediaPoll.poll.quiz) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway2.quantity), Integer.valueOf(tL_messageMediaGiveaway2.months));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                        string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) && !(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupLiveLocation, string, getTitle(chat));
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                                String stickerEmoji4 = messageObject.getStickerEmoji();
                                                if (stickerEmoji4 != null) {
                                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupStickerEmoji, string, getTitle(chat), stickerEmoji4);
                                                } else {
                                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupSticker, string, getTitle(chat));
                                                }
                                            } else if (messageObject.isGif()) {
                                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "🎬 " + messageObject.messageOwner.message);
                                                } else {
                                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupGif, string, getTitle(chat));
                                                }
                                            } else if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), "📎 " + messageObject.messageOwner.message);
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupDocument, string, getTitle(chat));
                                            }
                                        } else if (!z && !TextUtils.isEmpty(messageObject.messageText)) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupText, string, getTitle(chat), messageObject.messageText);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                        }
                                    }
                                }
                            }
                        }
                        if (z5 && notificationsSettings.getBoolean(str6, z2)) {
                            message = messageObject.messageOwner;
                            if (message instanceof TLRPC.TL_messageService) {
                                messageAction = message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionChatAddUser) {
                                    jLongValue2 = messageAction.user_id;
                                    if (jLongValue2 == 0) {
                                        jLongValue2 = messageObject.messageOwner.action.users.get(0).longValue();
                                    }
                                    if (jLongValue2 != 0) {
                                        sb2 = new StringBuilder();
                                        while (i2 < messageObject.messageOwner.action.users.size()) {
                                            user3 = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i2));
                                            if (user3 != null) {
                                                String userName3 = UserObject.getUserName(user3);
                                                if (sb2.length() != 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(userName3);
                                            }
                                        }
                                        string2 = LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), sb2.toString());
                                    } else if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                        if (jLongValue2 == clientUserId) {
                                            string2 = LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                                        } else {
                                            user4 = getMessagesController().getUser(Long.valueOf(jLongValue2));
                                            if (user4 == null) {
                                                return null;
                                            }
                                            if (fromChatId == user4.id) {
                                                if (chat.megagroup) {
                                                    string2 = LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat));
                                                } else {
                                                    string2 = LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat));
                                                }
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user4));
                                            }
                                        }
                                    } else if (jLongValue2 == clientUserId) {
                                        string2 = LocaleController.formatString(R.string.NotificationInvitedToGroup, string, getTitle(chat));
                                    } else {
                                        user4 = getMessagesController().getUser(Long.valueOf(jLongValue2));
                                        if (user4 == null) {
                                            return null;
                                        }
                                        if (fromChatId == user4.id) {
                                            if (chat.megagroup) {
                                                string2 = LocaleController.formatString(R.string.NotificationGroupAddSelfMega, string, getTitle(chat));
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationGroupAddSelf, string, getTitle(chat));
                                            }
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupAddMember, string, getTitle(chat), UserObject.getUserName(user4));
                                        }
                                    }
                                } else {
                                    if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                                        if (messageAction.duration != 0) {
                                        }
                                    }
                                    if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                        string2 = messageObject.messageText.toString();
                                    } else if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                        jLongValue = messageAction.user_id;
                                        if (jLongValue == 0) {
                                            jLongValue = messageObject.messageOwner.action.users.get(0).longValue();
                                        }
                                        if (jLongValue != 0) {
                                            sb = new StringBuilder();
                                            while (i < messageObject.messageOwner.action.users.size()) {
                                                user = getMessagesController().getUser(messageObject.messageOwner.action.users.get(i));
                                                if (user != null) {
                                                    String userName4 = UserObject.getUserName(user);
                                                    if (sb.length() != 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(userName4);
                                                }
                                            }
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), sb.toString());
                                        } else if (jLongValue == clientUserId) {
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedYouToCall, string, getTitle(chat));
                                        } else {
                                            user2 = getMessagesController().getUser(Long.valueOf(jLongValue));
                                            if (user2 == null) {
                                                return null;
                                            }
                                            string2 = LocaleController.formatString(R.string.NotificationGroupInvitedToCall, string, getTitle(chat), UserObject.getUserName(user2));
                                        }
                                    } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                        tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
                                        chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
                                        if (chat2 == null) {
                                            title = null;
                                        } else {
                                            title = getTitle(chat2);
                                        }
                                        if (title == null) {
                                            string2 = LocaleController.getString(R.string.BoostingReceivedGiftNoName);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGiftCode, title, LocaleController.formatPluralString("Months", tL_messageActionGiftCode.months, new Object[0]));
                                        }
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                        string2 = LocaleController.formatString(R.string.NotificationInvitedToGroupByLink, string, getTitle(chat));
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatEditTitle) {
                                        string2 = LocaleController.formatString(R.string.NotificationEditedGroupName, string, messageAction.title);
                                    } else if (!(messageAction instanceof TLRPC.TL_messageActionTodoCompletions)) {
                                        string2 = messageObject.messageText.toString();
                                    } else if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        if (message.peer_id.channel_id == 0) {
                                            if (messageObject.isVideoAvatar()) {
                                                string2 = LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat));
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                                            }
                                        } else if (messageObject.isVideoAvatar()) {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                                        }
                                    } else if (message.peer_id.channel_id == 0) {
                                        if (messageObject.isVideoAvatar()) {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                                        }
                                    } else if (messageObject.isVideoAvatar()) {
                                        string2 = LocaleController.formatString(R.string.NotificationEditedGroupVideo, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationEditedGroupPhoto, string, getTitle(chat));
                                    }
                                }
                            } else if (!ChatObject.isChannel(chat)) {
                                if (messageObject.isMediaEmpty()) {
                                    if (z) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                    }
                                } else if (messageObject.type != 29) {
                                    message2 = messageObject.messageOwner;
                                    if (message2.media instanceof TLRPC.TL_messageMediaPhoto) {
                                        if (z) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                        }
                                    } else if (messageObject.isVideo()) {
                                        if (z) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                        }
                                    } else if (messageObject.isVoice()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                                    } else if (messageObject.isRoundVideo()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                    } else if (messageObject.isMusic()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                    } else {
                                        messageMedia = messageObject.messageOwner.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                            TLRPC.TL_messageMediaContact tL_messageMediaContact5 = (TLRPC.TL_messageMediaContact) messageMedia;
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact5.first_name, tL_messageMediaContact5.last_name));
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                            if (tL_messageMediaPoll.poll.quiz) {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                            }
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                                            string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway3.quantity), Integer.valueOf(tL_messageMediaGiveaway3.months));
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                            string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                        } else {
                                            string2 = messageMedia instanceof TLRPC.TL_messageMediaGeo ? LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, string, getTitle(chat)) : LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, string, getTitle(chat));
                                        }
                                    }
                                } else {
                                    message2 = messageObject.messageOwner;
                                    if (message2.media instanceof TLRPC.TL_messageMediaPhoto) {
                                        if (z) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                        }
                                    } else if (messageObject.isVideo()) {
                                        if (z) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                        }
                                    } else if (messageObject.isVoice()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                                    } else if (messageObject.isRoundVideo()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                    } else if (messageObject.isMusic()) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                    } else {
                                        messageMedia = messageObject.messageOwner.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                            TLRPC.TL_messageMediaContact tL_messageMediaContact6 = (TLRPC.TL_messageMediaContact) messageMedia;
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact6.first_name, tL_messageMediaContact6.last_name));
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                            if (tL_messageMediaPoll.poll.quiz) {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                            } else {
                                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                            }
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway4 = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                                            string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway4.quantity), Integer.valueOf(tL_messageMediaGiveaway4.months));
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                            string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
                                        }
                                    }
                                }
                            } else if (messageObject.isMediaEmpty()) {
                                if (z) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                } else {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                }
                            } else if (messageObject.type != 29) {
                                message2 = messageObject.messageOwner;
                                if (message2.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (z) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVideo()) {
                                    if (z) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVoice()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                                } else if (messageObject.isRoundVideo()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                } else if (messageObject.isMusic()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                } else {
                                    messageMedia = messageObject.messageOwner.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                        TLRPC.TL_messageMediaContact tL_messageMediaContact7 = (TLRPC.TL_messageMediaContact) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact7.first_name, tL_messageMediaContact7.last_name));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                        if (tL_messageMediaPoll.poll.quiz) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway5 = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway5.quantity), Integer.valueOf(tL_messageMediaGiveaway5.months));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                        string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
                                    }
                                }
                            } else {
                                message2 = messageObject.messageOwner;
                                if (message2.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (z) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupPhoto, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVideo()) {
                                    if (z) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                    } else {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupVideo, string, getTitle(chat));
                                    }
                                } else if (messageObject.isVoice()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupAudio, string, getTitle(chat));
                                } else if (messageObject.isRoundVideo()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupRound, string, getTitle(chat));
                                } else if (messageObject.isMusic()) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupMusic, string, getTitle(chat));
                                } else {
                                    messageMedia = messageObject.messageOwner.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
                                        TLRPC.TL_messageMediaContact tL_messageMediaContact8 = (TLRPC.TL_messageMediaContact) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupContact2, string, getTitle(chat), ContactsController.formatName(tL_messageMediaContact8.first_name, tL_messageMediaContact8.last_name));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                        if (tL_messageMediaPoll.poll.quiz) {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupQuiz2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, string, getTitle(chat), tL_messageMediaPoll.poll.question.text);
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, string, getTitle(chat), ((TLRPC.TL_messageMediaToDo) messageMedia).todo.title.text);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        string2 = LocaleController.formatString(R.string.NotificationMessageGroupGame, string, getTitle(chat), messageObject.messageOwner.media.game.title);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
                                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway6 = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                                        string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, getTitle(chat), Integer.valueOf(tL_messageMediaGiveaway6.quantity), Integer.valueOf(tL_messageMediaGiveaway6.months));
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                        string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
                                    }
                                }
                            }
                        } else {
                            if (zArr2 != null) {
                                zArr2[0] = false;
                            }
                            if (!ChatObject.isChannel(chat)) {
                                if (messageObject.type != 29) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                } else {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                                }
                            } else if (messageObject.type != 29) {
                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                            } else {
                                string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                            }
                        }
                    } else {
                        if (zArr2 != null) {
                            zArr2[0] = false;
                        }
                        if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                            string2 = LocaleController.formatString(R.string.ChannelMessageNoText, string);
                        } else if (messageObject.type != 29 && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            string2 = LocaleController.formatPluralString("NotificationMessagePaidMedia", (int) ((TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject)).stars_amount, string);
                        } else {
                            string2 = LocaleController.formatString(R.string.NotificationMessageGroupNoText, string, getTitle(chat));
                        }
                    }
                } else {
                    str3 = null;
                }
            } else if (z4 && notificationsSettings.getBoolean("EnablePreviewAll", true)) {
                TLRPC.Message message7 = messageObject.messageOwner;
                if (message7 instanceof TLRPC.TL_messageService) {
                    TLRPC.MessageAction messageAction2 = message7.action;
                    if ((messageAction2 instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction2 instanceof TLRPC.TL_messageActionNewCreatorPending)) {
                        string2 = messageObject.messageText.toString();
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                        string2 = LocaleController.getString(R.string.WallpaperSameNotification);
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        string2 = LocaleController.getString(R.string.WallpaperNotification);
                    } else if ((messageAction2 instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction2 instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction2 instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                        string2 = messageObject.messageText.toString();
                    } else if ((messageAction2 instanceof TLRPC.TL_messageActionUserJoined) || (messageAction2 instanceof TLRPC.TL_messageActionContactSignUp)) {
                        string2 = LocaleController.formatString(R.string.NotificationContactJoined, string);
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        string2 = LocaleController.formatString(R.string.NotificationContactNewPhoto, string);
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                        String string14 = LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(((long) messageObject.messageOwner.date) * 1000), LocaleController.getInstance().getFormatterDay().format(((long) messageObject.messageOwner.date) * 1000));
                        int i5 = R.string.NotificationUnrecognizedDevice;
                        String str7 = getUserConfig().getCurrentUser().first_name;
                        TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                        string2 = LocaleController.formatString(i5, str7, string14, messageAction3.title, messageAction3.address);
                    } else if ((messageAction2 instanceof TLRPC.TL_messageActionGameScore) || (messageAction2 instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction2 instanceof TLRPC.TL_messageActionPaymentSentMe) || (messageAction2 instanceof TLRPC.TL_messageActionStarGift) || (messageAction2 instanceof TLRPC.TL_messageActionGiftPremium) || (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) || (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) || (messageAction2 instanceof TLRPC.TL_messageActionSuggestBirthday) || (messageAction2 instanceof TLRPC.TL_messageActionPaidMessagesRefunded) || (messageAction2 instanceof TLRPC.TL_messageActionPaidMessagesPrice)) {
                        string2 = messageObject.messageText.toString();
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionPhoneCall) {
                        if (messageAction2.video) {
                            string2 = LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
                        } else {
                            string2 = LocaleController.getString(R.string.CallMessageIncomingMissed);
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        if (messageAction2.video) {
                            string2 = LocaleController.getString(R.string.CallMessageVideoIncomingConferenceMissed);
                        } else {
                            string2 = LocaleController.getString(R.string.CallMessageIncomingConferenceMissed);
                        }
                    } else {
                        if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                            String themeEmoticonOrGiftTitle2 = TlUtils.getThemeEmoticonOrGiftTitle(((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme);
                            if (TextUtils.isEmpty(themeEmoticonOrGiftTitle2)) {
                                if (j == clientUserId) {
                                    c3 = 0;
                                    string4 = LocaleController.formatString(R.string.ChatThemeDisabledYou, new Object[0]);
                                    z3 = true;
                                } else {
                                    c3 = 0;
                                    z3 = true;
                                    string3 = LocaleController.formatString(R.string.ChatThemeDisabled, string, themeEmoticonOrGiftTitle2);
                                }
                                zArr[c3] = z3;
                                return string4;
                            }
                            c3 = 0;
                            z3 = true;
                            if (j == clientUserId) {
                                string3 = LocaleController.formatString(R.string.ChatThemeChangedYou, themeEmoticonOrGiftTitle2);
                            } else {
                                string3 = LocaleController.formatString(R.string.ChatThemeChangedTo, string, themeEmoticonOrGiftTitle2);
                            }
                            string4 = string3;
                            zArr[c3] = z3;
                            return string4;
                        }
                        str3 = null;
                    }
                } else if (messageObject.isMediaEmpty()) {
                    if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                        String string15 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageOwner.message);
                        zArr[0] = true;
                        return string15;
                    }
                    string2 = LocaleController.formatString(R.string.NotificationMessageNoText, string);
                } else {
                    TLRPC.Message message8 = messageObject.messageOwner;
                    if (message8.media instanceof TLRPC.TL_messageMediaPhoto) {
                        if (!z && !TextUtils.isEmpty(message8.message)) {
                            String string16 = LocaleController.formatString(R.string.NotificationMessageText, string, "🖼 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string16;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            string2 = LocaleController.formatString(R.string.NotificationMessageSDPhoto, string);
                        } else {
                            string2 = LocaleController.formatString(R.string.NotificationMessagePhoto, string);
                        }
                    } else if (messageObject.isVideo()) {
                        if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                            String string17 = LocaleController.formatString(R.string.NotificationMessageText, string, "📹 " + messageObject.messageOwner.message);
                            zArr[0] = true;
                            return string17;
                        }
                        if (messageObject.messageOwner.media.ttl_seconds != 0) {
                            string2 = LocaleController.formatString(R.string.NotificationMessageSDVideo, string);
                        } else {
                            string2 = LocaleController.formatString(R.string.NotificationMessageVideo, string);
                        }
                    } else if (messageObject.isGame()) {
                        string2 = LocaleController.formatString(R.string.NotificationMessageGame, string, messageObject.messageOwner.media.game.title);
                    } else if (messageObject.isVoice()) {
                        string2 = LocaleController.formatString(R.string.NotificationMessageAudio, string);
                    } else if (messageObject.isRoundVideo()) {
                        string2 = LocaleController.formatString(R.string.NotificationMessageRound, string);
                    } else if (messageObject.isMusic()) {
                        string2 = LocaleController.formatString(R.string.NotificationMessageMusic, string);
                    } else {
                        TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
                        if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                            TLRPC.TL_messageMediaContact tL_messageMediaContact9 = (TLRPC.TL_messageMediaContact) messageMedia5;
                            string2 = LocaleController.formatString(R.string.NotificationMessageContact2, string, ContactsController.formatName(tL_messageMediaContact9.first_name, tL_messageMediaContact9.last_name));
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway7 = (TLRPC.TL_messageMediaGiveaway) messageMedia5;
                            string2 = LocaleController.formatString(R.string.NotificationMessageChannelGiveaway, string, Integer.valueOf(tL_messageMediaGiveaway7.quantity), Integer.valueOf(tL_messageMediaGiveaway7.months));
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            string2 = LocaleController.formatString(R.string.BoostingGiveawayResults, new Object[0]);
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                            TLRPC.Poll poll2 = ((TLRPC.TL_messageMediaPoll) messageMedia5).poll;
                            if (poll2.quiz) {
                                string2 = LocaleController.formatString(R.string.NotificationMessageQuiz2, string, poll2.question.text);
                            } else {
                                string2 = LocaleController.formatString(R.string.NotificationMessagePoll2, string, poll2.question.text);
                            }
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                            string2 = LocaleController.formatString(R.string.NotificationMessageTodo2, string, ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                        } else if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                            string2 = LocaleController.formatString(R.string.NotificationMessageMap, string);
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                            string2 = LocaleController.formatString(R.string.NotificationMessageLiveLocation, string);
                        } else if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                            if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
                                String stickerEmoji5 = messageObject.getStickerEmoji();
                                if (stickerEmoji5 != null) {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageStickerEmoji, string, stickerEmoji5);
                                } else {
                                    string2 = LocaleController.formatString(R.string.NotificationMessageSticker, string);
                                }
                            } else if (messageObject.isGif()) {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String string18 = LocaleController.formatString(R.string.NotificationMessageText, string, "🎬 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return string18;
                                }
                                string2 = LocaleController.formatString(R.string.NotificationMessageGif, string);
                            } else {
                                if (!z && !TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    String string19 = LocaleController.formatString(R.string.NotificationMessageText, string, "📎 " + messageObject.messageOwner.message);
                                    zArr[0] = true;
                                    return string19;
                                }
                                string2 = LocaleController.formatString(R.string.NotificationMessageDocument, string);
                            }
                        } else {
                            if (!z && !TextUtils.isEmpty(messageObject.messageText)) {
                                String string20 = LocaleController.formatString(R.string.NotificationMessageText, string, messageObject.messageText);
                                zArr[0] = true;
                                return string20;
                            }
                            string2 = LocaleController.formatString(R.string.NotificationMessageNoText, string);
                        }
                    }
                }
            } else {
                if (zArr2 != null) {
                    zArr2[0] = false;
                }
                string2 = LocaleController.formatString(R.string.NotificationMessageNoText, string);
            }
            return str3;
        }
        string2 = LocaleController.getString(R.string.YouHaveNewMessage);
        return string2;
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

    public void lambda$showNotifications$35() {
        showOrUpdateNotification(false);
    }

    public void showNotifications() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showNotifications$35();
            }
        });
    }

    public void hideNotifications() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$hideNotifications$36();
            }
        });
    }

    public void lambda$hideNotifications$36() {
        notificationManager.cancel(this.notificationId);
        this.lastWearNotifiedMessageId.clear();
        for (int i = 0; i < this.wearNotificationsIds.size(); i++) {
            notificationManager.cancel(((Integer) this.wearNotificationsIds.valueAt(i)).intValue());
        }
        this.wearNotificationsIds.clear();
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
                    NotificationsController.lambda$dismissNotification$37();
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$dismissNotification$37() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pushMessagesUpdated, new Object[0]);
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
                    this.f$0.lambda$didReceivedNotification$38(str);
                }
            });
        }
    }

    public void lambda$didReceivedNotification$38(String str) {
        if (this.pendingVoiceLoads.remove(str)) {
            showOrUpdateNotification(true);
        }
    }

    private void playInChatSound() {
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
        try {
            if (getNotifyOverride(getAccountInstance().getNotificationsSettings(), this.openedDialogId, this.openedTopicId) == 2) {
                return;
            }
            notificationsQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$playInChatSound$40();
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
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
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playInChatSound$39(soundPool2, i, i2);
                    }
                });
            }
            if (this.soundIn == 0 && !this.soundInLoaded) {
                this.soundInLoaded = true;
                this.soundIn = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_in, 1);
            }
            int i = this.soundIn;
            if (i != 0) {
                try {
                    this.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void lambda$playInChatSound$39(SoundPool soundPool, int i, int i2) {
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

    protected void repeatNotificationMaybe() {
        notificationsQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$repeatNotificationMaybe$41();
            }
        });
    }

    public void lambda$repeatNotificationMaybe$41() {
        int i = Calendar.getInstance().get(11);
        if (i >= 11 && i <= 22) {
            notificationManager.cancel(this.notificationId);
            showOrUpdateNotification(true);
        } else {
            scheduleNotificationRepeat();
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

    public void lambda$deleteNotificationChannel$42(long j, long j2, int i) {
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
                this.f$0.lambda$deleteNotificationChannel$42(j, j2, i);
            }
        });
    }

    public void deleteNotificationChannelGlobal(int i) {
        deleteNotificationChannelGlobal(i, -1);
    }

    public void lambda$deleteNotificationChannelGlobal$43(int i, int i2) {
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
                this.f$0.lambda$deleteNotificationChannelGlobal$43(i, i2);
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
                this.f$0.lambda$deleteAllNotificationChannels$44();
            }
        });
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
            } else {
                builder.setBubbleMetadata(null);
            }
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
        String str5;
        String str6;
        String string;
        String str7;
        String string2;
        String str8;
        String string3;
        StringBuilder sb;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        boolean z4;
        String str16;
        int i4;
        String str17;
        Uri uri2;
        String strMD5;
        String str18;
        NotificationChannel notificationChannelM;
        boolean z5;
        boolean z6;
        AudioAttributes.Builder builder;
        NotificationChannel notificationChannel;
        SharedPreferences.Editor editorEdit;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        NotificationsController notificationsController = this;
        long j3 = j;
        String str19 = "channel_";
        ensureGroupsCreated();
        SharedPreferences notificationsSettings = getAccountInstance().getNotificationsSettings();
        String string4 = "stories";
        if (z3) {
            str4 = "other" + notificationsController.currentAccount;
            str5 = null;
        } else {
            if (i3 == 2) {
                str2 = "channels" + notificationsController.currentAccount;
                str3 = "overwrite_channel";
            } else if (i3 == 0) {
                str2 = "groups" + notificationsController.currentAccount;
                str3 = "overwrite_group";
            } else if (i3 == 3) {
                str2 = "stories" + notificationsController.currentAccount;
                str3 = "overwrite_stories";
            } else if (i3 == 4 || i3 == 5) {
                str2 = "reactions" + notificationsController.currentAccount;
                str3 = "overwrite_reactions";
            } else {
                str2 = "private" + notificationsController.currentAccount;
                str3 = "overwrite_private";
            }
            String str20 = str3;
            str4 = str2;
            str5 = str20;
        }
        boolean z8 = !z && DialogObject.isEncryptedDialog(j);
        boolean z9 = (z2 || str5 == null || !notificationsSettings.getBoolean(str5, false)) ? false : true;
        String strMD6 = Utilities.MD5(uri == null ? "NoSound2" : uri.toString());
        if (strMD6 != null) {
            str6 = "private";
            if (strMD6.length() > 5) {
                strMD6 = strMD6.substring(0, 5);
            }
        } else {
            str6 = "private";
        }
        if (z3) {
            string = LocaleController.getString(R.string.NotificationsSilent);
            string4 = "silent";
        } else {
            if (z) {
                String string5 = LocaleController.getString(z2 ? R.string.NotificationsInAppDefault : R.string.NotificationsDefault);
                if (i3 == 2) {
                    if (z2) {
                        str7 = "channels_ia";
                        string2 = string5;
                    } else {
                        string2 = string5;
                        str7 = "channels";
                    }
                } else if (i3 != 0) {
                    if (i3 == 3) {
                        if (z2) {
                            str7 = "stories_ia";
                        } else {
                            string2 = string5;
                            str7 = string4;
                        }
                    } else if (i3 == 4 || i3 == 5) {
                        str7 = z2 ? "reactions_ia" : "reactions";
                    } else if (z2) {
                        str7 = "private_ia";
                    } else {
                        string2 = string5;
                        str7 = str6;
                    }
                    string2 = string5;
                } else if (z2) {
                    str7 = "groups_ia";
                    string2 = string5;
                } else {
                    string2 = string5;
                    str7 = "groups";
                }
            } else {
                string = z2 ? LocaleController.formatString(R.string.NotificationsChatInApp, str) : str;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z2 ? "org.telegram.keyia" : "org.telegram.key");
                sb2.append(j3);
                sb2.append("_");
                sb2.append(j2);
                string4 = sb2.toString();
            }
            str8 = str7 + "_" + strMD6;
            string3 = notificationsSettings.getString(str8, null);
            String string6 = notificationsSettings.getString(str8 + "_s", null);
            sb = new StringBuilder();
            str9 = "_";
            str10 = "secret";
            if (string3 != null) {
                str11 = "_s";
                str19 = "channel_";
                str4 = str4;
                str12 = str8;
            } else {
                str11 = "_s";
                notificationChannel = systemNotificationManager.getNotificationChannel(string3);
                str12 = str8;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current channel for " + string3 + " = " + notificationChannel);
                }
                if (notificationChannel == null) {
                    str11 = str11;
                    jArr = jArr;
                    sb = sb;
                    str10 = "secret";
                    notificationsController = notificationsController;
                    j3 = j3;
                    z9 = z9;
                    str9 = str9;
                    str12 = str12;
                    i = i;
                    str15 = null;
                    str14 = null;
                    str13 = null;
                    z4 = false;
                } else if (!z3 || z9) {
                    str11 = str11;
                    str12 = str12;
                } else {
                    int importance = notificationChannel.getImportance();
                    Uri sound = notificationChannel.getSound();
                    long[] vibrationPattern = notificationChannel.getVibrationPattern();
                    z9 = z9;
                    boolean zShouldVibrate = notificationChannel.shouldVibrate();
                    long[] jArr2 = (zShouldVibrate || vibrationPattern != null) ? vibrationPattern : new long[]{0, 0};
                    int lightColor = notificationChannel.getLightColor();
                    if (jArr2 != null) {
                        for (long j4 : jArr2) {
                            sb.append(j4);
                        }
                    }
                    sb.append(lightColor);
                    if (sound != null) {
                        sb.append(sound.toString());
                    }
                    sb.append(importance);
                    if (!z && z8) {
                        sb.append("secret");
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("current channel settings for " + string3 + " = " + ((Object) sb) + " old = " + string6);
                    }
                    String strMD7 = Utilities.MD5(sb.toString());
                    sb.setLength(0);
                    if (z2 && i2 != importance) {
                        str11 = str11;
                        jArr = jArr;
                        i = i;
                        sb = sb;
                        string6 = string6;
                        string3 = string3;
                        str10 = "secret";
                        notificationsController = notificationsController;
                        strMD7 = strMD7;
                        str9 = str9;
                        z4 = false;
                        z9 = true;
                        j3 = j;
                        str12 = str12;
                    } else if (strMD7.equals(string6)) {
                        str11 = str11;
                        jArr = jArr;
                        i = i;
                        sb = sb;
                        string6 = string6;
                        string3 = string3;
                        str10 = "secret";
                        notificationsController = notificationsController;
                        strMD7 = strMD7;
                        str9 = str9;
                        j3 = j;
                        str12 = str12;
                        z4 = false;
                    } else {
                        if (importance == 0) {
                            SharedPreferences.Editor editorEdit2 = notificationsSettings.edit();
                            if (z) {
                                if (!z2) {
                                    if (i3 == 3) {
                                        editorEdit2.putBoolean("EnableAllStories", false);
                                    } else if (i3 == 4) {
                                        editorEdit2.putBoolean("EnableReactionsMessages", true);
                                        editorEdit2.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        editorEdit2.putInt(getGlobalNotificationsKey(i3), Integer.MAX_VALUE);
                                    }
                                    notificationsController.updateServerNotificationsSettings(i3);
                                }
                                lightColor = lightColor;
                                sb = sb;
                            } else {
                                if (i3 == 3) {
                                    editorEdit2.putBoolean("stories_" + getSharedPrefKey(j, 0L), false);
                                } else {
                                    editorEdit2.putInt("notify2_" + getSharedPrefKey(j, 0L), 2);
                                }
                                sb = sb;
                                updateServerNotificationsSettings(j, 0L, true);
                            }
                            j3 = j;
                            str10 = "secret";
                            editorEdit = editorEdit2;
                        } else {
                            str11 = str11;
                            str12 = str12;
                            string3 = string3;
                            str10 = "secret";
                            strMD7 = strMD7;
                            lightColor = lightColor;
                            str9 = str9;
                            sb = sb;
                            j3 = j;
                            string6 = string6;
                            if (importance == i2) {
                                jArr2 = jArr2;
                                editorEdit = null;
                                z7 = false;
                            } else if (z2) {
                                editorEdit = null;
                            } else {
                                SharedPreferences.Editor editorEdit3 = notificationsSettings.edit();
                                if (importance == 4 || importance == 5) {
                                    i5 = 1;
                                } else if (importance == 1) {
                                    i5 = 4;
                                } else {
                                    i5 = importance == 2 ? 5 : 0;
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
                                        editorEdit3.putInt("priority_channel", i5);
                                    } else if (i3 == 0) {
                                        editorEdit3.putInt("priority_group", i5);
                                    } else if (i3 == 3) {
                                        editorEdit3.putInt("priority_stories", i5);
                                    } else if (i3 == 4 || i3 == 5) {
                                        editorEdit3.putInt("priority_react", i5);
                                    } else {
                                        editorEdit3.putInt("priority_messages", i5);
                                    }
                                } else if (i3 == 3) {
                                    editorEdit3.putBoolean("stories_" + j3, true);
                                } else {
                                    editorEdit3.putInt("notify2_" + j3, 0);
                                    editorEdit3.remove("notifyuntil_" + j3);
                                    editorEdit3.putInt("priority_" + j3, i5);
                                }
                                editorEdit = editorEdit3;
                            }
                            notificationsController = this;
                            jArr = jArr;
                            if ((!notificationsController.isEmptyVibration(jArr)) == zShouldVibrate) {
                                if (!z2) {
                                    if (editorEdit == null) {
                                        editorEdit = notificationsSettings.edit();
                                    }
                                    if (z) {
                                        String str21 = "vibrate_" + j3;
                                        if (zShouldVibrate) {
                                            i6 = 0;
                                        } else {
                                            i6 = 2;
                                        }
                                        editorEdit.putInt(str21, i6);
                                    } else if (i3 == 2) {
                                        if (zShouldVibrate) {
                                            i10 = 0;
                                        } else {
                                            i10 = 2;
                                        }
                                        editorEdit.putInt("vibrate_channel", i10);
                                    } else if (i3 == 0) {
                                        if (zShouldVibrate) {
                                            i9 = 0;
                                        } else {
                                            i9 = 2;
                                        }
                                        editorEdit.putInt("vibrate_group", i9);
                                    } else if (i3 == 3) {
                                        if (zShouldVibrate) {
                                            i8 = 0;
                                        } else {
                                            i8 = 2;
                                        }
                                        editorEdit.putInt("vibrate_stories", i8);
                                    } else if (i3 != 4 || i3 == 5) {
                                        if (zShouldVibrate) {
                                            i7 = 0;
                                        } else {
                                            i7 = 2;
                                        }
                                        editorEdit.putInt("vibrate_react", i7);
                                    } else {
                                        editorEdit.putInt("vibrate_messages", zShouldVibrate ? 0 : 2);
                                    }
                                }
                                jArr = jArr2;
                                z7 = true;
                            }
                            if (lightColor != i) {
                                if (!z2) {
                                    if (editorEdit == null) {
                                        editorEdit = notificationsSettings.edit();
                                    }
                                    if (z) {
                                        editorEdit.putInt("color_" + j3, lightColor);
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
                                z7 = true;
                            }
                            if (editorEdit != null) {
                                editorEdit.commit();
                            }
                            z4 = z7;
                        }
                        z7 = true;
                        notificationsController = this;
                        jArr = jArr;
                        if ((!notificationsController.isEmptyVibration(jArr)) == zShouldVibrate) {
                            if (!z2) {
                                if (editorEdit == null) {
                                    editorEdit = notificationsSettings.edit();
                                }
                                if (z) {
                                    String str22 = "vibrate_" + j3;
                                    if (zShouldVibrate) {
                                        i6 = 0;
                                    } else {
                                        i6 = 2;
                                    }
                                    editorEdit.putInt(str22, i6);
                                } else if (i3 == 2) {
                                    if (zShouldVibrate) {
                                        i10 = 0;
                                    } else {
                                        i10 = 2;
                                    }
                                    editorEdit.putInt("vibrate_channel", i10);
                                } else if (i3 == 0) {
                                    if (zShouldVibrate) {
                                        i9 = 0;
                                    } else {
                                        i9 = 2;
                                    }
                                    editorEdit.putInt("vibrate_group", i9);
                                } else if (i3 == 3) {
                                    if (zShouldVibrate) {
                                        i8 = 0;
                                    } else {
                                        i8 = 2;
                                    }
                                    editorEdit.putInt("vibrate_stories", i8);
                                } else if (i3 != 4) {
                                    if (zShouldVibrate) {
                                        i7 = 0;
                                    } else {
                                        i7 = 2;
                                    }
                                    editorEdit.putInt("vibrate_react", i7);
                                } else {
                                    if (zShouldVibrate) {
                                        i7 = 0;
                                    } else {
                                        i7 = 2;
                                    }
                                    editorEdit.putInt("vibrate_react", i7);
                                }
                            }
                            jArr = jArr2;
                            z7 = true;
                        }
                        if (lightColor != i) {
                            if (!z2) {
                                if (editorEdit == null) {
                                    editorEdit = notificationsSettings.edit();
                                }
                                if (z) {
                                    editorEdit.putInt("color_" + j3, lightColor);
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
                            z7 = true;
                        }
                        if (editorEdit != null) {
                            editorEdit.commit();
                        }
                        z4 = z7;
                    }
                    str14 = strMD7;
                    str15 = string6;
                    str13 = string3;
                }
                if (z4 || str14 == null) {
                    str16 = str11;
                    if (!z9 || str14 == null || !z2 || !z) {
                        i4 = 0;
                        while (i4 < jArr.length) {
                            sb.append(jArr[i4]);
                            i4++;
                            str16 = str16;
                        }
                        str17 = str16;
                        sb.append(i);
                        uri2 = uri;
                        if (uri2 != null) {
                            sb.append(uri.toString());
                        }
                        sb.append(i2);
                        if (!z && z8) {
                            sb.append(str10);
                        }
                        strMD5 = Utilities.MD5(sb.toString());
                        if (!z3 && str13 != null && (z9 || !str15.equals(strMD5))) {
                            try {
                                systemNotificationManager.deleteNotificationChannel(str13);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("delete channel by settings change " + str13);
                            }
                            str13 = null;
                        }
                    }
                    if (str13 == null) {
                        if (z) {
                            str18 = notificationsController.currentAccount + str19 + str12 + str9 + Utilities.random.nextLong();
                        } else {
                            str18 = notificationsController.currentAccount + str19 + j3 + str9 + Utilities.random.nextLong();
                        }
                        str13 = str18;
                        SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                        if (z8) {
                            string2 = LocaleController.getString(R.string.SecretChatName);
                        }
                        notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str13, string2, i2);
                        notificationChannelM.setGroup(str4);
                        if (i != 0) {
                            z5 = true;
                            notificationChannelM.enableLights(true);
                            notificationChannelM.setLightColor(i);
                            z6 = false;
                        } else {
                            z5 = true;
                            z6 = false;
                            notificationChannelM.enableLights(false);
                        }
                        if (!notificationsController.isEmptyVibration(jArr)) {
                            notificationChannelM.enableVibration(z5);
                            if (jArr.length > 0) {
                                notificationChannelM.setVibrationPattern(jArr);
                            }
                        } else {
                            notificationChannelM.enableVibration(z6);
                        }
                        builder = new AudioAttributes.Builder();
                        builder.setContentType(4);
                        builder.setUsage(5);
                        if (uri2 != null) {
                            notificationChannelM.setSound(uri2, builder.build());
                        } else {
                            notificationChannelM.setSound(null, builder.build());
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("create new channel " + str13);
                        }
                        notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                        systemNotificationManager.createNotificationChannel(notificationChannelM);
                        notificationsSettings.edit().putString(str12, str13).putString(str12 + str17, strMD5).commit();
                    }
                    return str13;
                }
                SharedPreferences.Editor editorPutString = notificationsSettings.edit().putString(str12, str13);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str12);
                str16 = str11;
                sb3.append(str16);
                editorPutString.putString(sb3.toString(), str14).commit();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("change edited channel " + str13);
                }
                strMD5 = str14;
                str17 = str16;
                uri2 = uri;
                if (str13 == null) {
                    if (z) {
                        str18 = notificationsController.currentAccount + str19 + str12 + str9 + Utilities.random.nextLong();
                    } else {
                        str18 = notificationsController.currentAccount + str19 + j3 + str9 + Utilities.random.nextLong();
                    }
                    str13 = str18;
                    SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                    if (z8) {
                        string2 = LocaleController.getString(R.string.SecretChatName);
                    }
                    notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str13, string2, i2);
                    notificationChannelM.setGroup(str4);
                    if (i != 0) {
                        z5 = true;
                        notificationChannelM.enableLights(true);
                        notificationChannelM.setLightColor(i);
                        z6 = false;
                    } else {
                        z5 = true;
                        z6 = false;
                        notificationChannelM.enableLights(false);
                    }
                    if (!notificationsController.isEmptyVibration(jArr)) {
                        notificationChannelM.enableVibration(z5);
                        if (jArr.length > 0) {
                            notificationChannelM.setVibrationPattern(jArr);
                        }
                    } else {
                        notificationChannelM.enableVibration(z6);
                    }
                    builder = new AudioAttributes.Builder();
                    builder.setContentType(4);
                    builder.setUsage(5);
                    if (uri2 != null) {
                        notificationChannelM.setSound(uri2, builder.build());
                    } else {
                        notificationChannelM.setSound(null, builder.build());
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("create new channel " + str13);
                    }
                    notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                    systemNotificationManager.createNotificationChannel(notificationChannelM);
                    notificationsSettings.edit().putString(str12, str13).putString(str12 + str17, strMD5).commit();
                }
                return str13;
            }
            str15 = string6;
            str13 = string3;
            str14 = null;
            z4 = false;
            if (z4) {
                str16 = str11;
                if (!z9) {
                }
                i4 = 0;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    str16 = str16;
                }
                str17 = str16;
                sb.append(i);
                uri2 = uri;
                if (uri2 != null) {
                    sb.append(uri.toString());
                }
                sb.append(i2);
                if (!z) {
                    sb.append(str10);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str13);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str13);
                    }
                    str13 = null;
                }
            } else {
                str16 = str11;
                if (!z9) {
                }
                i4 = 0;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    str16 = str16;
                }
                str17 = str16;
                sb.append(i);
                uri2 = uri;
                if (uri2 != null) {
                    sb.append(uri.toString());
                }
                sb.append(i2);
                if (!z) {
                    sb.append(str10);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str13);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str13);
                    }
                    str13 = null;
                }
            }
            if (str13 == null) {
                if (z) {
                    str18 = notificationsController.currentAccount + str19 + str12 + str9 + Utilities.random.nextLong();
                } else {
                    str18 = notificationsController.currentAccount + str19 + j3 + str9 + Utilities.random.nextLong();
                }
                str13 = str18;
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                if (z8) {
                    string2 = LocaleController.getString(R.string.SecretChatName);
                }
                notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str13, string2, i2);
                notificationChannelM.setGroup(str4);
                if (i != 0) {
                    z5 = true;
                    notificationChannelM.enableLights(true);
                    notificationChannelM.setLightColor(i);
                    z6 = false;
                } else {
                    z5 = true;
                    z6 = false;
                    notificationChannelM.enableLights(false);
                }
                if (!notificationsController.isEmptyVibration(jArr)) {
                    notificationChannelM.enableVibration(z5);
                    if (jArr.length > 0) {
                        notificationChannelM.setVibrationPattern(jArr);
                    }
                } else {
                    notificationChannelM.enableVibration(z6);
                }
                builder = new AudioAttributes.Builder();
                builder.setContentType(4);
                builder.setUsage(5);
                if (uri2 != null) {
                    notificationChannelM.setSound(uri2, builder.build());
                } else {
                    notificationChannelM.setSound(null, builder.build());
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new channel " + str13);
                }
                notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                systemNotificationManager.createNotificationChannel(notificationChannelM);
                notificationsSettings.edit().putString(str12, str13).putString(str12 + str17, strMD5).commit();
            }
            return str13;
        }
        string2 = string;
        str7 = string4;
        str8 = str7 + "_" + strMD6;
        string3 = notificationsSettings.getString(str8, null);
        String string7 = notificationsSettings.getString(str8 + "_s", null);
        sb = new StringBuilder();
        str9 = "_";
        str10 = "secret";
        if (string3 != null) {
            str11 = "_s";
            str19 = "channel_";
            str4 = str4;
            str12 = str8;
        } else {
            str11 = "_s";
            notificationChannel = systemNotificationManager.getNotificationChannel(string3);
            str12 = str8;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("current channel for " + string3 + " = " + notificationChannel);
            }
            if (notificationChannel == null) {
                if (z3) {
                }
                str11 = str11;
                str12 = str12;
            } else {
                str11 = str11;
                jArr = jArr;
                sb = sb;
                str10 = "secret";
                notificationsController = notificationsController;
                j3 = j3;
                z9 = z9;
                str9 = str9;
                str12 = str12;
                i = i;
                str15 = null;
                str14 = null;
                str13 = null;
                z4 = false;
            }
            if (z4) {
                str16 = str11;
                if (!z9) {
                }
                i4 = 0;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    str16 = str16;
                }
                str17 = str16;
                sb.append(i);
                uri2 = uri;
                if (uri2 != null) {
                    sb.append(uri.toString());
                }
                sb.append(i2);
                if (!z) {
                    sb.append(str10);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str13);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str13);
                    }
                    str13 = null;
                }
            } else {
                str16 = str11;
                if (!z9) {
                }
                i4 = 0;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    str16 = str16;
                }
                str17 = str16;
                sb.append(i);
                uri2 = uri;
                if (uri2 != null) {
                    sb.append(uri.toString());
                }
                sb.append(i2);
                if (!z) {
                    sb.append(str10);
                }
                strMD5 = Utilities.MD5(sb.toString());
                if (!z3) {
                    systemNotificationManager.deleteNotificationChannel(str13);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("delete channel by settings change " + str13);
                    }
                    str13 = null;
                }
            }
            if (str13 == null) {
                if (z) {
                    str18 = notificationsController.currentAccount + str19 + str12 + str9 + Utilities.random.nextLong();
                } else {
                    str18 = notificationsController.currentAccount + str19 + j3 + str9 + Utilities.random.nextLong();
                }
                str13 = str18;
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                if (z8) {
                    string2 = LocaleController.getString(R.string.SecretChatName);
                }
                notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str13, string2, i2);
                notificationChannelM.setGroup(str4);
                if (i != 0) {
                    z5 = true;
                    notificationChannelM.enableLights(true);
                    notificationChannelM.setLightColor(i);
                    z6 = false;
                } else {
                    z5 = true;
                    z6 = false;
                    notificationChannelM.enableLights(false);
                }
                if (!notificationsController.isEmptyVibration(jArr)) {
                    notificationChannelM.enableVibration(z5);
                    if (jArr.length > 0) {
                        notificationChannelM.setVibrationPattern(jArr);
                    }
                } else {
                    notificationChannelM.enableVibration(z6);
                }
                builder = new AudioAttributes.Builder();
                builder.setContentType(4);
                builder.setUsage(5);
                if (uri2 != null) {
                    notificationChannelM.setSound(uri2, builder.build());
                } else {
                    notificationChannelM.setSound(null, builder.build());
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new channel " + str13);
                }
                notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
                systemNotificationManager.createNotificationChannel(notificationChannelM);
                notificationsSettings.edit().putString(str12, str13).putString(str12 + str17, strMD5).commit();
            }
            return str13;
        }
        str15 = string7;
        str13 = string3;
        str14 = null;
        z4 = false;
        if (z4) {
            str16 = str11;
            if (!z9) {
            }
            i4 = 0;
            while (i4 < jArr.length) {
                sb.append(jArr[i4]);
                i4++;
                str16 = str16;
            }
            str17 = str16;
            sb.append(i);
            uri2 = uri;
            if (uri2 != null) {
                sb.append(uri.toString());
            }
            sb.append(i2);
            if (!z) {
                sb.append(str10);
            }
            strMD5 = Utilities.MD5(sb.toString());
            if (!z3) {
                systemNotificationManager.deleteNotificationChannel(str13);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("delete channel by settings change " + str13);
                }
                str13 = null;
            }
        } else {
            str16 = str11;
            if (!z9) {
            }
            i4 = 0;
            while (i4 < jArr.length) {
                sb.append(jArr[i4]);
                i4++;
                str16 = str16;
            }
            str17 = str16;
            sb.append(i);
            uri2 = uri;
            if (uri2 != null) {
                sb.append(uri.toString());
            }
            sb.append(i2);
            if (!z) {
                sb.append(str10);
            }
            strMD5 = Utilities.MD5(sb.toString());
            if (!z3) {
                systemNotificationManager.deleteNotificationChannel(str13);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("delete channel by settings change " + str13);
                }
                str13 = null;
            }
        }
        if (str13 == null) {
            if (z) {
                str18 = notificationsController.currentAccount + str19 + str12 + str9 + Utilities.random.nextLong();
            } else {
                str18 = notificationsController.currentAccount + str19 + j3 + str9 + Utilities.random.nextLong();
            }
            str13 = str18;
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            if (z8) {
                string2 = LocaleController.getString(R.string.SecretChatName);
            }
            notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m(str13, string2, i2);
            notificationChannelM.setGroup(str4);
            if (i != 0) {
                z5 = true;
                notificationChannelM.enableLights(true);
                notificationChannelM.setLightColor(i);
                z6 = false;
            } else {
                z5 = true;
                z6 = false;
                notificationChannelM.enableLights(false);
            }
            if (!notificationsController.isEmptyVibration(jArr)) {
                notificationChannelM.enableVibration(z5);
                if (jArr.length > 0) {
                    notificationChannelM.setVibrationPattern(jArr);
                }
            } else {
                notificationChannelM.enableVibration(z6);
            }
            builder = new AudioAttributes.Builder();
            builder.setContentType(4);
            builder.setUsage(5);
            if (uri2 != null) {
                notificationChannelM.setSound(uri2, builder.build());
            } else {
                notificationChannelM.setSound(null, builder.build());
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("create new channel " + str13);
            }
            notificationsController.lastNotificationChannelCreateTime = SystemClock.elapsedRealtime();
            systemNotificationManager.createNotificationChannel(notificationChannelM);
            notificationsSettings.edit().putString(str12, str13).putString(str12 + str17, strMD5).commit();
        }
        return str13;
    }

    private void showOrUpdateNotification(boolean r58) {
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
            getNotificationsController().lambda$deleteNotificationChannelGlobal$43(i3, -1);
        } else {
            editorEdit.putString("sound_" + getSharedPrefKey(j, j2), string2);
            editorEdit.putString("sound_path_" + getSharedPrefKey(j, j2), string);
            lambda$deleteNotificationChannel$42(j, j2, -1);
        }
        editorEdit.commit();
        builder.setChannelId(validateChannelId(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3));
        notificationManager.notify(this.notificationId, builder.build());
    }

    private void showExtraNotifications(androidx.core.app.NotificationCompat.Builder r89, java.lang.String r90, long r91, long r93, java.lang.String r95, long[] r96, int r97, android.net.Uri r98, int r99, boolean r100, boolean r101, boolean r102, int r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationsController.showExtraNotifications(androidx.core.app.NotificationCompat$Builder, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
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

    public static void lambda$showExtraNotifications$45(Uri uri, File file) {
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
                        NotificationsController.lambda$loadRoundAvatar$47(imageDecoder, imageInfo, source);
                    }
                })));
            } catch (Throwable unused) {
            }
        }
        return builder;
    }

    public static void lambda$loadRoundAvatar$47(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new PostProcessor() {
            @Override
            public final int onPostProcess(Canvas canvas) {
                return NotificationsController.lambda$loadRoundAvatar$46(canvas);
            }
        });
    }

    public static int lambda$loadRoundAvatar$46(Canvas canvas) {
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
        int i2;
        TextPaint textPaint;
        ArrayList<Object> arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2 == null || arrayList.size() == 0) {
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
        float f3 = 1.0f;
        if (arrayList.size() == 1) {
            f = 1.0f;
        } else {
            f = arrayList.size() == 2 ? 0.65f : 0.5f;
        }
        int i3 = 0;
        TextPaint textPaint2 = null;
        while (i3 < arrayList.size()) {
            float f4 = iDp;
            float f5 = (f3 - f) * f4;
            try {
                float size = ((arrayList.size() - 1) - i3) * (f5 / arrayList.size());
                float size2 = i3 * (f5 / arrayList.size());
                float f6 = f4 * f;
                float f7 = f6 / 2.0f;
                i = iDp;
                float f8 = size + f7;
                f2 = f;
                float f9 = size2 + f7;
                bitmap = bitmapCreateBitmap;
                try {
                    canvas.drawCircle(f8, f9, AndroidUtilities.dp(2.0f) + f7, paint3);
                    Object obj = arrayList2.get(i3);
                    paint = paint3;
                    try {
                        if (obj instanceof File) {
                            String absolutePath = ((File) arrayList2.get(i3)).getAbsolutePath();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(absolutePath, options);
                            int i4 = (int) f6;
                            options.inSampleSize = StoryEntry.calculateInSampleSize(options, i4, i4);
                            options.inJustDecodeBounds = false;
                            options.inDither = true;
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                            matrix.reset();
                            matrix.postScale(f6 / bitmapDecodeFile.getWidth(), f6 / bitmapDecodeFile.getHeight());
                            matrix.postTranslate(size, size2);
                            bitmapShader.setLocalMatrix(matrix);
                            paint2.setShader(bitmapShader);
                            canvas.drawCircle(f8, f9, f7, paint2);
                            bitmapDecodeFile.recycle();
                        } else {
                            if (obj instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) obj;
                                Rect rect2 = rect;
                                try {
                                    i2 = i3;
                                    textPaint = textPaint2;
                                    try {
                                        try {
                                            paint2.setShader(new LinearGradient(size, size2, size, size2 + f6, new int[]{Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(user.id)]), Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(user.id)])}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                                            canvas.drawCircle(f8, f9, f7, paint2);
                                            if (textPaint == null) {
                                                TextPaint textPaint3 = new TextPaint(1);
                                                try {
                                                    textPaint3.setTypeface(AndroidUtilities.bold());
                                                    textPaint3.setTextSize(f4 * 0.25f);
                                                    textPaint3.setColor(-1);
                                                    textPaint2 = textPaint3;
                                                } catch (Throwable unused) {
                                                    textPaint2 = textPaint3;
                                                    rect = rect2;
                                                }
                                            } else {
                                                textPaint2 = textPaint;
                                            }
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                AvatarDrawable.getAvatarSymbols(user.first_name, user.last_name, null, sb);
                                                String string = sb.toString();
                                                rect = rect2;
                                                try {
                                                    textPaint2.getTextBounds(string, 0, string.length(), rect);
                                                    canvas.drawText(string, (f8 - (rect.width() / 2.0f)) - rect.left, (f9 - (rect.height() / 2.0f)) - rect.top, textPaint2);
                                                } catch (Throwable unused2) {
                                                }
                                            } catch (Throwable unused3) {
                                                rect = rect2;
                                            }
                                        } catch (Throwable unused4) {
                                            rect = rect2;
                                            textPaint2 = textPaint;
                                        }
                                    } catch (Throwable unused5) {
                                        rect = rect2;
                                    }
                                } catch (Throwable unused6) {
                                    i2 = i3;
                                    textPaint = textPaint2;
                                }
                                i3 = i2 + 1;
                                arrayList2 = arrayList;
                                rect = rect;
                                iDp = i;
                                f = f2;
                                bitmapCreateBitmap = bitmap;
                                paint3 = paint;
                                f3 = 1.0f;
                            }
                            textPaint2 = textPaint;
                            i3 = i2 + 1;
                            arrayList2 = arrayList;
                            rect = rect;
                            iDp = i;
                            f = f2;
                            bitmapCreateBitmap = bitmap;
                            paint3 = paint;
                            f3 = 1.0f;
                        }
                        rect = rect;
                        i2 = i3;
                        textPaint = textPaint2;
                    } catch (Throwable unused7) {
                        i2 = i3;
                        textPaint = textPaint2;
                        textPaint2 = textPaint;
                        i3 = i2 + 1;
                        arrayList2 = arrayList;
                        rect = rect;
                        iDp = i;
                        f = f2;
                        bitmapCreateBitmap = bitmap;
                        paint3 = paint;
                        f3 = 1.0f;
                    }
                } catch (Throwable unused8) {
                    paint = paint3;
                }
            } catch (Throwable unused9) {
                i = iDp;
                bitmap = bitmapCreateBitmap;
                paint = paint3;
                f2 = f;
            }
            textPaint2 = textPaint;
            i3 = i2 + 1;
            arrayList2 = arrayList;
            rect = rect;
            iDp = i;
            f = f2;
            bitmapCreateBitmap = bitmap;
            paint3 = paint;
            f3 = 1.0f;
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
                this.f$0.lambda$playOutChatSound$49();
            }
        });
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
                soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                        NotificationsController.lambda$playOutChatSound$48(soundPool2, i, i2);
                    }
                });
            }
            if (this.soundOut == 0 && !this.soundOutLoaded) {
                this.soundOutLoaded = true;
                this.soundOut = this.soundPool.load(ApplicationLoader.applicationContext, R.raw.sound_out, 1);
            }
            int i = this.soundOut;
            if (i != 0) {
                try {
                    this.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void lambda$playOutChatSound$48(SoundPool soundPool, int i, int i2) {
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
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
                NotificationsController.lambda$updateServerNotificationsSettings$50(tLObject, tL_error);
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
                    NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
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
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
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
                this.f$0.lambda$loadTopicsNotificationsExceptions$54(j, consumer);
            }
        });
    }

    public void lambda$loadTopicsNotificationsExceptions$54(long j, final Consumer consumer) {
        final HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it = MessagesController.getNotificationsSettings(this.currentAccount).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.startsWith("notify2_" + j)) {
                Integer num = Utilities.parseInt((CharSequence) key.replace("notify2_" + j, ""));
                int iIntValue = num.intValue();
                if (iIntValue != 0 && getMessagesController().isDialogMuted(j, iIntValue) != getMessagesController().isDialogMuted(j, 0L)) {
                    hashSet.add(num);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsController.lambda$loadTopicsNotificationsExceptions$53(consumer, hashSet);
            }
        });
    }

    public static void lambda$loadTopicsNotificationsExceptions$53(Consumer consumer, HashSet hashSet) {
        if (consumer != null) {
            consumer.p(hashSet);
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
