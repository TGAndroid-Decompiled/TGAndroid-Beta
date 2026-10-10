package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16454b;
    public final c f16455a = new c();

    public static a a() {
        if (f16454b != null) {
            return f16454b;
        }
        synchronized (a.class) {
            try {
                if (f16454b == null) {
                    f16454b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16454b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16455a;
        if (cVar.f16459c == null) {
            synchronized (cVar.f16457a) {
                try {
                    if (cVar.f16459c == null) {
                        cVar.f16459c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16459c.post(runnable);
    }
}
