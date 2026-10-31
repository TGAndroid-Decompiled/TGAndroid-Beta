package n;

import android.os.Looper;
import w7.b0;
public final class a extends b0 {
    public static volatile a f13393b;
    public final c f13394a = new c();

    public static a a() {
        if (f13393b != null) {
            return f13393b;
        }
        synchronized (a.class) {
            try {
                if (f13393b == null) {
                    f13393b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13393b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f13394a;
        if (cVar.f13398c == null) {
            synchronized (cVar.f13396a) {
                try {
                    if (cVar.f13398c == null) {
                        cVar.f13398c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f13398c.post(runnable);
    }
}
