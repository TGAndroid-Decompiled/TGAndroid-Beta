package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.r;

public class GcmPushListenerService extends FirebaseMessagingService {
    public static void lambda$onNewToken$0(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Refreshed FCM token: " + str);
        }
        ApplicationLoader.postInitApplication();
        PushListenerController.sendRegistrationToServer(2, str);
    }

    @Override
    public void onMessageReceived(r rVar) {
        long jLongValue;
        Bundle bundle = rVar.f4615a;
        String string = bundle.getString("from");
        if (rVar.f4616b == null) {
            a0.f fVar = new a0.f(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        fVar.put(str, str2);
                    }
                }
            }
            rVar.f4616b = fVar;
        }
        a0.f fVar2 = rVar.f4616b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("FCM received data: " + fVar2 + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) fVar2.get("p"), jLongValue);
    }

    @Override
    public void onNewToken(String str) {
        AndroidUtilities.runOnUIThread(new u1(str, 4));
    }
}
