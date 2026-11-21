package n;

import android.os.Looper;
import c8.x9;
public final class a extends x9 {
    public static volatile a f21068b;
    public final b f21069a = new b();

    public static a a() {
        if (f21068b != null) {
            return f21068b;
        }
        synchronized (a.class) {
            try {
                if (f21068b == null) {
                    f21068b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21068b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21069a;
        if (bVar.f21072c == null) {
            synchronized (bVar.f21070a) {
                try {
                    if (bVar.f21072c == null) {
                        bVar.f21072c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21072c.post(runnable);
    }
}
