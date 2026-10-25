package n;

import a8.re;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c5.d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class c extends re {
    public final Object f18560a = new Object();
    public final ExecutorService f18561b = Executors.newFixedThreadPool(4, new b());
    public volatile Handler f18562c;

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.c(looper);
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
