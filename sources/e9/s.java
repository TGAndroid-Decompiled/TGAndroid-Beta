package e9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class s implements Thread.UncaughtExceptionHandler {
    public final fa.c f5059a;
    public final c3.h f5060b;
    public final Thread.UncaughtExceptionHandler f5061c;
    public final b9.b d;
    public final AtomicBoolean f5062e = new AtomicBoolean(false);

    public s(fa.c cVar, c3.h hVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, b9.b bVar) {
        this.f5059a = cVar;
        this.f5060b = hVar;
        this.f5061c = uncaughtExceptionHandler;
        this.d = bVar;
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
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        throw new UnsupportedOperationException("Method not decompiled: e9.s.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
