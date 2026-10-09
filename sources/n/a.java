package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16450b;
    public final c f16451a = new c();

    public static a a() {
        if (f16450b != null) {
            return f16450b;
        }
        synchronized (a.class) {
            try {
                if (f16450b == null) {
                    f16450b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16450b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16451a;
        if (cVar.f16455c == null) {
            synchronized (cVar.f16453a) {
                try {
                    if (cVar.f16455c == null) {
                        cVar.f16455c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16455c.post(runnable);
    }
}
