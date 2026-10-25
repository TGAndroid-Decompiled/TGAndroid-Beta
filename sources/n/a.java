package n;

import a8.re;
import android.os.Looper;
public final class a extends re {
    public static volatile a f18557b;
    public final c f18558a = new c();

    public static a a() {
        if (f18557b != null) {
            return f18557b;
        }
        synchronized (a.class) {
            try {
                if (f18557b == null) {
                    f18557b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f18557b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f18558a;
        if (cVar.f18562c == null) {
            synchronized (cVar.f18560a) {
                try {
                    if (cVar.f18562c == null) {
                        cVar.f18562c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f18562c.post(runnable);
    }
}
