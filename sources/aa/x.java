package aa;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class x implements Runnable {
    public final int f881a = 0;
    public final Object f882b;

    public x(Runnable runnable) {
        this.f882b = runnable;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f881a) {
            case 0:
                ((Runnable) this.f882b).run();
                return;
            default:
                ExecutorService executorService = (ExecutorService) this.f882b;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                        }
                        executorService.shutdownNow();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    }
                    executorService.shutdownNow();
                    return;
                }
        }
    }

    public x(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f882b = executorService;
    }
}
