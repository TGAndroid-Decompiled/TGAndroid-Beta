package i9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r implements Thread.UncaughtExceptionHandler {
    public final y5.h f8001a;
    public final e3.g f8002b;
    public final Thread.UncaughtExceptionHandler f8003c;
    public final f9.a d;
    public final AtomicBoolean f8004e = new AtomicBoolean(false);

    public r(y5.h hVar, e3.g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, f9.a aVar) {
        this.f8001a = hVar;
        this.f8002b = gVar;
        this.f8003c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th2 == null) {
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
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        throw new UnsupportedOperationException("Method not decompiled: i9.r.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
