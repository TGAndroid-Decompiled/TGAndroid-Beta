package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f16989b;
    public final c f16990a = new c();

    public static a a() {
        if (f16989b != null) {
            return f16989b;
        }
        synchronized (a.class) {
            try {
                if (f16989b == null) {
                    f16989b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16989b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16990a;
        if (cVar.f16994c == null) {
            synchronized (cVar.f16992a) {
                try {
                    if (cVar.f16994c == null) {
                        cVar.f16994c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16994c.post(runnable);
    }
}
