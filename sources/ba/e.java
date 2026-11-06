package ba;

import android.util.Log;
import androidx.activity.v;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;
public final class e {
    public static final d d = new Object();
    public final c f3135a;
    public final c f3136b;
    public final c f3137c;

    public e(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        j.e(backgroundExecutorService, "backgroundExecutorService");
        j.e(blockingExecutorService, "blockingExecutorService");
        this.f3135a = new c(backgroundExecutorService);
        this.f3136b = new c(backgroundExecutorService);
        Tasks.forResult(null);
        this.f3137c = new c(blockingExecutorService);
    }

    public static final void a() {
        if (!((Boolean) new v(0, d, d.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 2).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void b() {
        if (!((Boolean) new v(0, d, d.class, "isBlockingThread", "isBlockingThread()Z", 0, 3).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }
}
