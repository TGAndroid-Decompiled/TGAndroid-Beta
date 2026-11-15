package ab;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class e {
    public static final AtomicInteger f918a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static ab.k a(com.google.firebase.messaging.FirebaseMessagingService r18, ab.w r19) {
        throw new UnsupportedOperationException("Method not decompiled: ab.e.a(com.google.firebase.messaging.FirebaseMessagingService, ab.w):ab.k");
    }

    public static boolean b(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }
}
