package defpackage;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
public abstract class ucc {
    public static final ExecutorService a;

    static {
        wc3 wc3Var = new wc3(new AtomicLong(1L), (byte) 1);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), wc3Var, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new r54(unconfigurableExecutorService, (byte) 1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        a = unconfigurableExecutorService;
    }

    public static void a(Task task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(a, new ftb(countDownLatch, (byte) 8));
        Looper mainLooper = Looper.getMainLooper();
        Looper myLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == myLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else if (!task.isCanceled()) {
            if (task.isComplete()) {
                vr9.l(task.getException());
                return;
            }
            throw new TimeoutException();
        } else {
            throw new CancellationException("Task is already canceled");
        }
    }
}
