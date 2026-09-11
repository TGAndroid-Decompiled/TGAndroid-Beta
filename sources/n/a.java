package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16332b;
    public final c f16333a = new c();

    public static a a() {
        if (f16332b != null) {
            return f16332b;
        }
        synchronized (a.class) {
            try {
                if (f16332b == null) {
                    f16332b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16332b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16333a;
        if (cVar.f16337c == null) {
            synchronized (cVar.f16335a) {
                try {
                    if (cVar.f16337c == null) {
                        cVar.f16337c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16337c.post(runnable);
    }
}
