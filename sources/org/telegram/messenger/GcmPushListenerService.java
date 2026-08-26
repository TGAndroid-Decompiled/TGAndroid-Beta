package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class GcmPushListenerService extends FirebaseMessagingService {
    public static void lambda$onNewToken$0(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Refreshed FCM token: " + str);
        }
        ApplicationLoader.postInitApplication();
        PushListenerController.sendRegistrationToServer(2, str);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        long jLongValue;
        String string = remoteMessage.bundle.getString("from");
        ArrayMap arrayMap = remoteMessage.data;
        Bundle bundle = remoteMessage.bundle;
        if (arrayMap == null) {
            ArrayMap arrayMap2 = new ArrayMap(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap2.put(str, str2);
                    }
                }
            }
            remoteMessage.data = arrayMap2;
        }
        ArrayMap arrayMap3 = remoteMessage.data;
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
            FileLog.d("FCM received data: " + arrayMap3 + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) arrayMap3.get("p"), jLongValue);
    }

    @Override
    public void onNewToken(String str) {
        AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda1(str, 4));
    }
}
