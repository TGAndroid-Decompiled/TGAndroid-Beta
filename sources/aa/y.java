package aa;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class y implements Runnable {
    public final int f885a = 0;
    public final Object f886b;

    public y(Runnable runnable) {
        this.f886b = runnable;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f885a) {
            case 0:
                ((Runnable) this.f886b).run();
                return;
            default:
                ExecutorService executorService = (ExecutorService) this.f886b;
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

    public y(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f886b = executorService;
    }
}
