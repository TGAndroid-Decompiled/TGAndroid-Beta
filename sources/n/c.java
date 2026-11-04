package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b8.qe;
import d1.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class c extends qe {
    public final Object f20103a = new Object();
    public final ExecutorService f20104b = Executors.newFixedThreadPool(4, new b());
    public volatile Handler f20105c;

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
