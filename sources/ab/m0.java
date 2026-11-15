package ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
public abstract class m0 {
    public static final long f971a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f972b = new Object();
    public static s8.a f973c;

    public static void a(Context context) {
        if (f973c == null) {
            s8.a aVar = new s8.a(context);
            f973c = aVar;
            synchronized (aVar.f56539a) {
                aVar.f56544g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f972b) {
            try {
                if (f973c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f973c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, p0 p0Var, Intent intent) {
        synchronized (f972b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f973c.a(f971a);
                }
                p0Var.b(intent).addOnCompleteListener(new a1.c(intent, 5));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f972b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f973c.a(f971a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
