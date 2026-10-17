package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f16982b;
    public final c f16983a = new c();

    public static a a() {
        if (f16982b != null) {
            return f16982b;
        }
        synchronized (a.class) {
            try {
                if (f16982b == null) {
                    f16982b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16982b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16983a;
        if (cVar.f16987c == null) {
            synchronized (cVar.f16985a) {
                try {
                    if (cVar.f16987c == null) {
                        cVar.f16987c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16987c.post(runnable);
    }
}
