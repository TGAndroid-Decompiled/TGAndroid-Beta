package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16496b;
    public final c f16497a = new c();

    public static a a() {
        if (f16496b != null) {
            return f16496b;
        }
        synchronized (a.class) {
            try {
                if (f16496b == null) {
                    f16496b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16496b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16497a;
        if (cVar.f16501c == null) {
            synchronized (cVar.f16499a) {
                try {
                    if (cVar.f16501c == null) {
                        cVar.f16501c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16501c.post(runnable);
    }
}
