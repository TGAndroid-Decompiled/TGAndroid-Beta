package mb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import l9.u;
public final class f {
    public static final Object f19227b = new Object();
    public static f f19228c;
    public final z f19229a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f19229a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f19227b) {
            try {
                if (f19228c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f19228c = new f(handlerThread.getLooper());
                }
                fVar = f19228c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f19245a.execute(new u(19, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
