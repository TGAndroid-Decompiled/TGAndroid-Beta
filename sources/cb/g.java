package cb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class g {
    public static final Object f2407b = new Object();
    public static g f2408c;
    public final a7.e f2409a;

    public g(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f2409a = handler;
    }

    public static g a() {
        g gVar;
        synchronized (f2407b) {
            try {
                if (f2408c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f2408c = new g(handlerThread.getLooper());
                }
                gVar = f2408c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        o.f2429a.execute(new androidx.biometric.k(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
