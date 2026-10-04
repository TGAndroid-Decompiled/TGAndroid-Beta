package n;

import android.os.Looper;
import w7.a0;
public final class a extends a0 {
    public static volatile a f16473b;
    public final c f16474a = new c();

    public static a a() {
        if (f16473b != null) {
            return f16473b;
        }
        synchronized (a.class) {
            try {
                if (f16473b == null) {
                    f16473b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16473b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16474a;
        if (cVar.f16478c == null) {
            synchronized (cVar.f16476a) {
                try {
                    if (cVar.f16478c == null) {
                        cVar.f16478c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16478c.post(runnable);
    }
}
