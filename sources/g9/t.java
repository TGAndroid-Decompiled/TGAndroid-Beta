package g9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class t implements Thread.UncaughtExceptionHandler {
    public final za.c f7216a;
    public final e3.f f7217b;
    public final Thread.UncaughtExceptionHandler f7218c;
    public final d9.b d;
    public final AtomicBoolean f7219e = new AtomicBoolean(false);

    public t(za.c cVar, e3.f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, d9.b bVar) {
        this.f7216a = cVar;
        this.f7217b = fVar;
        this.f7218c = uncaughtExceptionHandler;
        this.d = bVar;
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
        throw new UnsupportedOperationException("Method not decompiled: g9.t.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
