package ab;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class h extends Service {
    public final ExecutorService f932a;
    public n0 f933b;
    public final Object f934c;
    public int d;
    public int f935e;

    public h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f5.s("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f932a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f934c = new Object();
        this.f935e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            m0.b(intent);
        }
        synchronized (this.f934c) {
            try {
                int i7 = this.f935e - 1;
                this.f935e = i7;
                if (i7 == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f933b == null) {
                this.f933b = new n0(new cb.c(this, 3));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f933b;
    }

    @Override
    public final void onDestroy() {
        this.f932a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(Intent intent, int i7, int i10) {
        synchronized (this.f934c) {
            this.d = i10;
            this.f935e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) c0.q().f911e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f932a.execute(new aa.r(this, intent2, taskCompletionSource, 1));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new d3.b(3), new g(0, this, intent));
        return 3;
    }
}
