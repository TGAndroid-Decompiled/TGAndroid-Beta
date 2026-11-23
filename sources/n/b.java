package n;

import aa.y;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.y9;
import d1.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class b extends y9 {
    public final Object f21039a = new Object();
    public final ExecutorService f21040b = Executors.newFixedThreadPool(4, new y());
    public volatile Handler f21041c;

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
