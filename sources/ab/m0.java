package ab;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
public abstract class m0 {
    public static final long f972a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f973b = new Object();
    public static s8.a f974c;

    public static void a(Context context) {
        if (f974c == null) {
            s8.a aVar = new s8.a(context);
            f974c = aVar;
            synchronized (aVar.f54983a) {
                aVar.f54988g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f973b) {
            try {
                if (f974c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f974c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, p0 p0Var, Intent intent) {
        synchronized (f973b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f974c.a(f972a);
                }
                p0Var.b(intent).addOnCompleteListener(new a1.c(intent, 5));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f973b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f974c.a(f972a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
