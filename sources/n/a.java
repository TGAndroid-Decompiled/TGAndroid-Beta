package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16532b;
    public final c f16533a = new c();

    public static a a() {
        if (f16532b != null) {
            return f16532b;
        }
        synchronized (a.class) {
            try {
                if (f16532b == null) {
                    f16532b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16532b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16533a;
        if (cVar.f16537c == null) {
            synchronized (cVar.f16535a) {
                try {
                    if (cVar.f16537c == null) {
                        cVar.f16537c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16537c.post(runnable);
    }
}
