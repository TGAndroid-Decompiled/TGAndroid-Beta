package org.telegram.messenger;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;
public class GcmPushListenerService extends FirebaseMessagingService {
    public static final int f21181n = 0;

    @Override
    public final void c(ab.z zVar) {
        long parseLong;
        Bundle bundle = zVar.f1010a;
        String string = bundle.getString("from");
        if (zVar.f1011b == null) {
            ?? lVar = new a0.l(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        lVar.put(str, str2);
                    }
                }
            }
            zVar.f1011b = lVar;
        }
        HashMap hashMap = new HashMap(zVar.f1011b);
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
        if (r2.f25216a) {
            a8.b("FCM received data: " + hashMap + " from: " + string);
        }
        PushListenerController.processRemoteMessage(2, (String) hashMap.get("p"), parseLong);
    }

    @Override
    public final void d(String str) {
        g0.h3(new l4(str, 4));
    }
}
