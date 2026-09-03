package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
public class GcmPushListenerService extends FirebaseMessagingService {
    public static void lambda$onNewToken$0(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Refreshed FCM token: " + str);
        }
        ApplicationLoader.postInitApplication();
        PushListenerController.sendRegistrationToServer(2, str);
    }

    @Override
    public void onMessageReceived(com.google.firebase.messaging.q qVar) {
        long parseLong;
        Bundle bundle = qVar.f4002a;
        String string = bundle.getString("from");
        if (qVar.f4003b == null) {
            ?? kVar = new a0.k(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        kVar.put(str, str2);
                    }
                }
            }
            qVar.f4003b = kVar;
        }
        a0.f fVar = qVar.f4003b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            parseLong = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                }
            }
            parseLong = 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("FCM received data: " + fVar + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) fVar.get("p"), parseLong);
    }

    @Override
    public void onNewToken(String str) {
        AndroidUtilities.runOnUIThread(new v1(str, 4));
    }
}
