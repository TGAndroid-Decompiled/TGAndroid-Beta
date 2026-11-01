package jb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j9.u;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f9780b = new Object();
    public static f f9781c;
    public final z f9782a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f9782a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f9780b) {
            try {
                if (f9781c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f9781c = new f(handlerThread.getLooper());
                }
                fVar = f9781c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f9798a.execute(new u(19, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
