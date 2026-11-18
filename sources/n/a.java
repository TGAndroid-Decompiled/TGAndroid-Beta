package n;

import android.os.Looper;
import c8.x9;
public final class a extends x9 {
    public static volatile a f21043b;
    public final b f21044a = new b();

    public static a a() {
        if (f21043b != null) {
            return f21043b;
        }
        synchronized (a.class) {
            try {
                if (f21043b == null) {
                    f21043b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21043b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21044a;
        if (bVar.f21047c == null) {
            synchronized (bVar.f21045a) {
                try {
                    if (bVar.f21047c == null) {
                        bVar.f21047c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21047c.post(runnable);
    }
}
