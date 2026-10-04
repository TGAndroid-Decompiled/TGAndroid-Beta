package n;

import android.os.Looper;
import w7.a0;
public final class a extends a0 {
    public static volatile a f16474b;
    public final c f16475a = new c();

    public static a a() {
        if (f16474b != null) {
            return f16474b;
        }
        synchronized (a.class) {
            try {
                if (f16474b == null) {
                    f16474b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16474b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16475a;
        if (cVar.f16479c == null) {
            synchronized (cVar.f16477a) {
                try {
                    if (cVar.f16479c == null) {
                        cVar.f16479c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16479c.post(runnable);
    }
}
