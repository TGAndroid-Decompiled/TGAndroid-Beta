package f9;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s implements Thread.UncaughtExceptionHandler {

    public final ga.c f5991a;

    public final c3.g f5992b;

    public final Thread.UncaughtExceptionHandler f5993c;
    public final c9.a d;

    public final AtomicBoolean f5994e = new AtomicBoolean(false);

    public s(ga.c cVar, c3.g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c9.a aVar) {
        this.f5991a = cVar;
        this.f5992b = gVar;
        this.f5993c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5993c;
        AtomicBoolean atomicBoolean = this.f5994e;
        atomicBoolean.set(true);
        try {
            if (a(thread, th)) {
                this.f5991a.g(this.f5992b, thread, th);
            } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
            }
        } catch (Exception e9) {
            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e9);
        } finally {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}
