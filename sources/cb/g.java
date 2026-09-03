package cb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class g {
    public static final Object f2239b = new Object();
    public static g f2240c;
    public final a7.e f2241a;

    public g(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f2241a = handler;
    }

    public static g a() {
        g gVar;
        synchronized (f2239b) {
            try {
                if (f2240c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f2240c = new g(handlerThread.getLooper());
                }
                gVar = f2240c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        o.f2260a.execute(new androidx.biometric.j(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
