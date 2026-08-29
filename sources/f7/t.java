package f7;

import android.os.StrictMode;
import java.util.concurrent.Callable;
public abstract class t {
    public static s f6680a;

    public static synchronized r a(o oVar) {
        r rVar;
        synchronized (t.class) {
            try {
                if (f6680a == null) {
                    f6680a = new s(0);
                }
                rVar = (r) f6680a.G(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static Object b(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
