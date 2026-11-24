package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class mm2 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static defpackage.tg2 a(com.google.firebase.messaging.FirebaseMessagingService r20, defpackage.z24 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm2.a(com.google.firebase.messaging.FirebaseMessagingService, z24):tg2");
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
