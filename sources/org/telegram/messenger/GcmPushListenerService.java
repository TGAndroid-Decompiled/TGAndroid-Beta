package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final int f14365n = 0;

    @Override
    public final void c(xa.l lVar) {
        long parseLong;
        Bundle bundle = lVar.f53569a;
        String string = bundle.getString("from");
        if (lVar.f53570b == null) {
            ?? lVar2 = new a0.l(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        lVar2.put(str, str2);
                    }
                }
            }
            lVar.f53570b = lVar2;
        }
        a0.f fVar = lVar.f53570b;
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
        if (v2.f18578a) {
            f8.b("FCM received data: " + fVar + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) fVar.get("p"), parseLong);
    }

    @Override
    public final void d(String str) {
        i0.g3(new o4(str, 4));
    }
}
