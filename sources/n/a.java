package n;

import android.os.Looper;
import w7.b0;
public final class a extends b0 {
    public static volatile a f13394b;
    public final c f13395a = new c();

    public static a a() {
        if (f13394b != null) {
            return f13394b;
        }
        synchronized (a.class) {
            try {
                if (f13394b == null) {
                    f13394b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13394b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f13395a;
        if (cVar.f13399c == null) {
            synchronized (cVar.f13397a) {
                try {
                    if (cVar.f13399c == null) {
                        cVar.f13399c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f13399c.post(runnable);
    }
}
