package cb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class g {
    public static final Object f2216b = new Object();
    public static g f2217c;
    public final a7.e f2218a;

    public g(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f2218a = handler;
    }

    public static g a() {
        g gVar;
        synchronized (f2216b) {
            try {
                if (f2217c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f2217c = new g(handlerThread.getLooper());
                }
                gVar = f2217c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        o.f2237a.execute(new androidx.biometric.k(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
