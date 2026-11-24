package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final int n = 0;

    @Override
    public final void c(l89 l89Var) {
        long parseLong;
        Bundle bundle = l89Var.a;
        String string = bundle.getString("from");
        if (l89Var.b == null) {
            ?? ckaVar = new cka(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        ckaVar.put(str, str2);
                    }
                }
            }
            l89Var.b = ckaVar;
        }
        HashMap hashMap = new HashMap(l89Var.b);
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
        if (e21.a) {
            fc4.b("FCM received data: " + hashMap + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) hashMap.get("p"), parseLong);
    }

    @Override
    public final void d(String str) {
        gm.c3(new iv2(str, (byte) 5));
    }
}
