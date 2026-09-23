package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f14814b;
    public final c f14815a = new c();

    public static a a() {
        if (f14814b != null) {
            return f14814b;
        }
        synchronized (a.class) {
            try {
                if (f14814b == null) {
                    f14814b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14814b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14815a;
        if (cVar.f14819c == null) {
            synchronized (cVar.f14817a) {
                try {
                    if (cVar.f14819c == null) {
                        cVar.f14819c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14819c.post(runnable);
    }
}
