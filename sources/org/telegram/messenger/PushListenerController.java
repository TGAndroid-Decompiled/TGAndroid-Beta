package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static final class GooglePushListenerServiceProvider implements IPushListenerServiceProvider {
        public static final GooglePushListenerServiceProvider INSTANCE = new GooglePushListenerServiceProvider();
        private Boolean hasServices;

        private GooglePushListenerServiceProvider() {
        }

        public void lambda$onRequestPushToken$0(Task task) {
            SharedConfig.pushStringGetTimeEnd = SystemClock.elapsedRealtime();
            if (!task.isSuccessful()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Failed to get regid");
                }
                SharedConfig.pushStringStatus = "__FIREBASE_FAILED__";
                PushListenerController.sendRegistrationToServer(getPushType(), null);
                return;
            }
            String str = (String) task.getResult();
            if (!TextUtils.isEmpty(str)) {
                PushListenerController.sendRegistrationToServer(getPushType(), str);
            }
        }

        public void lambda$onRequestPushToken$1() {
            FirebaseMessaging firebaseMessaging;
            try {
                SharedConfig.pushStringGetTimeStart = SystemClock.elapsedRealtime();
                u8.g.f(ApplicationLoader.applicationContext);
                com.google.firebase.messaging.u uVar = FirebaseMessaging.f5109l;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(u8.g.c());
                }
                firebaseMessaging.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f5116f.execute(new a1.e(21, firebaseMessaging, taskCompletionSource));
                taskCompletionSource.getTask().addOnCompleteListener(new d(this, 12));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }

        @Override
        public String getLogTitle() {
            return "Google Play Services";
        }

        @Override
        public int getPushType() {
            return 2;
        }

        @Override
        public boolean hasServices() {
            boolean z10;
            if (this.hasServices == null) {
                try {
                    if (w5.d.d.d(ApplicationLoader.applicationContext, w5.e.f49768a) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.hasServices = Boolean.valueOf(z10);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    this.hasServices = Boolean.FALSE;
                }
            }
            return this.hasServices.booleanValue();
        }

        @Override
        public void onRequestPushToken() {
            String str = SharedConfig.pushString;
            if (!TextUtils.isEmpty(str)) {
                if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED) {
                    FileLog.d("FCM regId = " + str);
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("FCM Registration not found.");
            }
            Utilities.globalQueue.postRunnable(new ug(this, 5));
        }
    }

    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PushType {
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2114646919:
                if (str.equals("CHAT_REACT_CONTACT")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1891797827:
                if (str.equals("REACT_GEOLIVE")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1773019340:
                if (str.equals("REACT_STORY_HIDDEN")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1553058678:
                if (str.equals("REACT_HIDDEN")) {
                    c3 = 3;
                    break;
                }
                break;
            case -1415696683:
                if (str.equals("CHAT_REACT_NOTEXT")) {
                    c3 = 4;
                    break;
                }
                break;
            case -1375264434:
                if (str.equals("REACT_NOTEXT")) {
                    c3 = 5;
                    break;
                }
                break;
            case -1105974394:
                if (str.equals("CHAT_REACT_INVOICE")) {
                    c3 = 6;
                    break;
                }
                break;
            case -861247200:
                if (str.equals("REACT_CONTACT")) {
                    c3 = 7;
                    break;
                }
                break;
            case -661458538:
                if (str.equals("CHAT_REACT_STICKER")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 51977938:
                if (str.equals("REACT_GAME")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 52259487:
                if (str.equals("REACT_POLL")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 52294965:
                if (str.equals("REACT_QUIZ")) {
                    c3 = 11;
                    break;
                }
                break;
            case 52369421:
                if (str.equals("REACT_TEXT")) {
                    c3 = '\f';
                    break;
                }
                break;
            case 52378406:
                if (str.equals("REACT_TODO")) {
                    c3 = '\r';
                    break;
                }
                break;
            case 147425325:
                if (str.equals("REACT_INVOICE")) {
                    c3 = 14;
                    break;
                }
                break;
            case 192842257:
                if (str.equals("CHAT_REACT_DOC")) {
                    c3 = 15;
                    break;
                }
                break;
            case 192844842:
                if (str.equals("CHAT_REACT_GEO")) {
                    c3 = 16;
                    break;
                }
                break;
            case 192844957:
                if (str.equals("CHAT_REACT_GIF")) {
                    c3 = 17;
                    break;
                }
                break;
            case 591941181:
                if (str.equals("REACT_STICKER")) {
                    c3 = 18;
                    break;
                }
                break;
            case 635226735:
                if (str.equals("CHAT_REACT_AUDIO")) {
                    c3 = 19;
                    break;
                }
                break;
            case 648703179:
                if (str.equals("CHAT_REACT_PHOTO")) {
                    c3 = 20;
                    break;
                }
                break;
            case 650764327:
                if (str.equals("CHAT_REACT_ROUND")) {
                    c3 = 21;
                    break;
                }
                break;
            case 654263060:
                if (str.equals("CHAT_REACT_VIDEO")) {
                    c3 = 22;
                    break;
                }
                break;
            case 731873318:
                if (str.equals("CHAT_REACT_GIVEAWAY")) {
                    c3 = 23;
                    break;
                }
                break;
            case 932558943:
                if (str.equals("REACT_GIVEAWAY")) {
                    c3 = 24;
                    break;
                }
                break;
            case 1149769750:
                if (str.equals("CHAT_REACT_GEOLIVE")) {
                    c3 = 25;
                    break;
                }
                break;
            case 1606362326:
                if (str.equals("REACT_AUDIO")) {
                    c3 = 26;
                    break;
                }
                break;
            case 1619838770:
                if (str.equals("REACT_PHOTO")) {
                    c3 = 27;
                    break;
                }
                break;
            case 1621899918:
                if (str.equals("REACT_ROUND")) {
                    c3 = 28;
                    break;
                }
                break;
            case 1622966773:
                if (str.equals("REACT_STORY")) {
                    c3 = 29;
                    break;
                }
                break;
            case 1625398651:
                if (str.equals("REACT_VIDEO")) {
                    c3 = 30;
                    break;
                }
                break;
            case 1664242232:
                if (str.equals("REACT_DOC")) {
                    c3 = 31;
                    break;
                }
                break;
            case 1664244817:
                if (str.equals("REACT_GEO")) {
                    c3 = ' ';
                    break;
                }
                break;
            case 1664244932:
                if (str.equals("REACT_GIF")) {
                    c3 = '!';
                    break;
                }
                break;
            case 1683218969:
                if (str.equals("CHAT_REACT_GAME")) {
                    c3 = '\"';
                    break;
                }
                break;
            case 1683500518:
                if (str.equals("CHAT_REACT_POLL")) {
                    c3 = '#';
                    break;
                }
                break;
            case 1683535996:
                if (str.equals("CHAT_REACT_QUIZ")) {
                    c3 = '$';
                    break;
                }
                break;
            case 1683610452:
                if (str.equals("CHAT_REACT_TEXT")) {
                    c3 = '%';
                    break;
                }
                break;
            case 1683619437:
                if (str.equals("CHAT_REACT_TODO")) {
                    c3 = '&';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return LocaleController.formatString(R.string.PushChatReactContact, objArr);
            case 1:
                return LocaleController.formatString(R.string.PushReactGeoLocation, objArr);
            case 2:
                return LocaleController.formatString(R.string.PushReactStoryHidden, objArr);
            case 3:
                return LocaleController.formatString(R.string.PushReactHidden, objArr);
            case 4:
                return LocaleController.formatString(R.string.PushChatReactNotext, objArr);
            case 5:
                return LocaleController.formatString(R.string.PushReactNoText, objArr);
            case 6:
                return LocaleController.formatString(R.string.PushChatReactInvoice, objArr);
            case 7:
                return LocaleController.formatString(R.string.PushReactContect, objArr);
            case '\b':
                return LocaleController.formatString(R.string.PushChatReactSticker, objArr);
            case '\t':
                return LocaleController.formatString(R.string.PushReactGame, objArr);
            case '\n':
                return LocaleController.formatString(R.string.PushReactPoll, objArr);
            case 11:
                return LocaleController.formatString(R.string.PushReactQuiz, objArr);
            case '\f':
                return LocaleController.formatString(R.string.PushReactText, objArr);
            case '\r':
                return LocaleController.formatString(R.string.PushReactTodo, objArr);
            case 14:
                return LocaleController.formatString(R.string.PushReactInvoice, objArr);
            case 15:
                return LocaleController.formatString(R.string.PushChatReactDoc, objArr);
            case 16:
                return LocaleController.formatString(R.string.PushChatReactGeo, objArr);
            case 17:
                return LocaleController.formatString(R.string.PushChatReactGif, objArr);
            case 18:
                return LocaleController.formatString(R.string.PushReactSticker, objArr);
            case 19:
                return LocaleController.formatString(R.string.PushChatReactAudio, objArr);
            case 20:
                return LocaleController.formatString(R.string.PushChatReactPhoto, objArr);
            case 21:
                return LocaleController.formatString(R.string.PushChatReactRound, objArr);
            case 22:
                return LocaleController.formatString(R.string.PushChatReactVideo, objArr);
            case 23:
                return LocaleController.formatString(R.string.NotificationChatReactGiveaway, objArr);
            case 24:
                return LocaleController.formatString(R.string.NotificationReactGiveaway, objArr);
            case 25:
                return LocaleController.formatString(R.string.PushChatReactGeoLive, objArr);
            case 26:
                return LocaleController.formatString(R.string.PushReactAudio, objArr);
            case 27:
                return LocaleController.formatString(R.string.PushReactPhoto, objArr);
            case 28:
                return LocaleController.formatString(R.string.PushReactRound, objArr);
            case 29:
                return LocaleController.formatString(R.string.PushReactStory, objArr);
            case 30:
                return LocaleController.formatString(R.string.PushReactVideo, objArr);
            case 31:
                return LocaleController.formatString(R.string.PushReactDoc, objArr);
            case ' ':
                return LocaleController.formatString(R.string.PushReactGeo, objArr);
            case '!':
                return LocaleController.formatString(R.string.PushReactGif, objArr);
            case '\"':
                return LocaleController.formatString(R.string.PushChatReactGame, objArr);
            case '#':
                return LocaleController.formatString(R.string.PushChatReactPoll, objArr);
            case '$':
                return LocaleController.formatString(R.string.PushChatReactQuiz, objArr);
            case '%':
                return LocaleController.formatString(R.string.PushChatReactText, objArr);
            case '&':
                return LocaleController.formatString(R.string.PushChatReactTodo, objArr);
            default:
                return null;
        }
    }

    public static void lambda$processRemoteMessage$2(int i10, TLRPC.TL_updates tL_updates) {
        MessagesController.getInstance(i10).processUpdates(tL_updates, false);
    }

    public static void lambda$processRemoteMessage$3(int i10) {
        if (UserConfig.getInstance(i10).getClientUserId() != 0) {
            UserConfig.getInstance(i10).clearConfig();
            MessagesController.getInstance(i10).performLogout(0);
        }
    }

    public static void lambda$processRemoteMessage$4(int i10) {
        LocationController.getInstance(i10).setNewLocationEndWatchTime();
    }

    public static void lambda$processRemoteMessage$5(int i10, long j10, int i11) {
        MessagesController.getInstance(i10).reportMessageDelivery(j10, i11, true);
    }

    public static void lambda$processRemoteMessage$6(java.lang.String r72, java.lang.String r73, long r74) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    public static void lambda$processRemoteMessage$7(String str, String str2, long j10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " PRE INIT APP");
        }
        ApplicationLoader.postInitApplication();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " POST INIT APP");
        }
        Utilities.stageQueue.postRunnable(new sh(0, j10, str, str2));
    }

    public static void lambda$sendRegistrationToServer$0(int i10, int i11, String str) {
        MessagesController.getInstance(i10).registerForPush(i11, str);
    }

    public static void lambda$sendRegistrationToServer$1(String str, int i10) {
        boolean z10;
        String str2;
        ConnectionsManager.setRegId(str, i10, SharedConfig.pushStringStatus);
        if (str != null) {
            if (SharedConfig.pushStringGetTimeStart != 0 && SharedConfig.pushStringGetTimeEnd != 0 && (!SharedConfig.pushStatSent || !TextUtils.equals(SharedConfig.pushString, str))) {
                SharedConfig.pushStatSent = false;
                z10 = true;
            } else {
                z10 = false;
            }
            SharedConfig.pushString = str;
            SharedConfig.pushType = i10;
            for (int i11 = 0; i11 < 4; i11++) {
                UserConfig userConfig = UserConfig.getInstance(i11);
                userConfig.registeredForPush = false;
                userConfig.saveConfig(false);
                if (userConfig.getClientUserId() != 0) {
                    if (z10) {
                        if (i10 == 2) {
                            str2 = "fcm";
                        } else {
                            str2 = "hcm";
                        }
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = SharedConfig.pushStringGetTimeStart;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = SharedConfig.pushStringGetTimeEnd;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = SharedConfig.pushStringGetTimeEnd - SharedConfig.pushStringGetTimeStart;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        SharedConfig.pushStatSent = true;
                        SharedConfig.saveConfig();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_help_saveAppLog, null);
                        z10 = false;
                    }
                    AndroidUtilities.runOnUIThread(new t6(i11, i10, str));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                ConnectionsManager.onInternalPushReceived(i10);
                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i10, String str, long j10) {
        String str2;
        if (i10 == 2) {
            str2 = "FCM";
        } else {
            str2 = "HCM";
        }
        String str3 = str2;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str3.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AndroidUtilities.runOnUIThread(new sh(1, j10, str3, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder s10 = a4.w.s("finished ", str3, " service, time = ");
            s10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            FileLog.d(s10.toString());
        }
    }

    public static void sendRegistrationToServer(int i10, String str) {
        Utilities.stageQueue.postRunnable(new r6(str, i10, 8));
    }
}
