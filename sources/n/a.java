package n;

import android.os.Looper;
import c8.x9;
public final class a extends x9 {
    public static volatile a f21071b;
    public final b f21072a = new b();

    public static a a() {
        if (f21071b != null) {
            return f21071b;
        }
        synchronized (a.class) {
            try {
                if (f21071b == null) {
                    f21071b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21071b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21072a;
        if (bVar.f21075c == null) {
            synchronized (bVar.f21073a) {
                try {
                    if (bVar.f21075c == null) {
                        bVar.f21075c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21075c.post(runnable);
    }
}
