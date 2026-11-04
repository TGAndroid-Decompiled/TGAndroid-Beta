package aa;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;
public final class g {
    public static final f d = new Object();
    public final d f286a;
    public final d f287b;
    public final d f288c;

    public g(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        j.e(backgroundExecutorService, "backgroundExecutorService");
        j.e(blockingExecutorService, "blockingExecutorService");
        this.f286a = new d(backgroundExecutorService);
        this.f287b = new d(backgroundExecutorService);
        Tasks.forResult(null);
        this.f288c = new d(blockingExecutorService);
    }

    public static final void a() {
        if (!((Boolean) new e(0, d, f.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void b() {
        if (!((Boolean) new e(0, d, f.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }
}
