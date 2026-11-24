package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class oz2 implements Thread.UncaughtExceptionHandler {
    public final i4d a;
    public final dv8 b;
    public final Thread.UncaughtExceptionHandler c;
    public final fy2 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public oz2(i4d i4dVar, dv8 dv8Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fy2 fy2Var) {
        this.a = i4dVar;
        this.b = dv8Var;
        this.c = uncaughtExceptionHandler;
        this.d = fy2Var;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else if (this.d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.a.J2(this.b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e) {
                c6e c6eVar = c6e.b;
                if (c6eVar.d(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    c6eVar.g("Completed exception processing. Invoking default exception handler.");
                } else {
                    c6eVar.g("Completed exception processing, but no default exception handler.");
                }
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
        }
    }
}
