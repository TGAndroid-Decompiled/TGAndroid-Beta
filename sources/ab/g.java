package ab;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c2.v0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class g {
    public static final Object f307b = new Object();
    public static g f308c;
    public final v0 f309a;

    public g(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f309a = handler;
    }

    public static g a() {
        g gVar;
        synchronized (f307b) {
            try {
                if (f308c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f308c = new g(handlerThread.getLooper());
                }
                gVar = f308c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q.f333a.execute(new o(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
