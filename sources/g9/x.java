package g9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class x extends d {
    public final String f7230a;
    public final ExecutorService f7231b;

    public x(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7230a = str;
        this.f7231b = executorService;
    }

    @Override
    public final void a() {
        String str = this.f7230a;
        ExecutorService executorService = this.f7231b;
        try {
            String concat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                String concat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", concat2, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String n10 = a4.w.n("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", n10, null);
            }
            executorService.shutdownNow();
        }
    }
}
