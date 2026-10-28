package n;

import a8.re;
import android.os.Looper;
public final class a extends re {
    public static volatile a f18556b;
    public final c f18557a = new c();

    public static a a() {
        if (f18556b != null) {
            return f18556b;
        }
        synchronized (a.class) {
            try {
                if (f18556b == null) {
                    f18556b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f18556b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f18557a;
        if (cVar.f18561c == null) {
            synchronized (cVar.f18559a) {
                try {
                    if (cVar.f18561c == null) {
                        cVar.f18561c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f18561c.post(runnable);
    }
}
