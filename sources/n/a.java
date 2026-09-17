package n;

import android.os.Looper;
import w7.x;
public final class a extends x {
    public static volatile a f16359b;
    public final c f16360a = new c();

    public static a a() {
        if (f16359b != null) {
            return f16359b;
        }
        synchronized (a.class) {
            try {
                if (f16359b == null) {
                    f16359b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16359b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16360a;
        if (cVar.f16364c == null) {
            synchronized (cVar.f16362a) {
                try {
                    if (cVar.f16364c == null) {
                        cVar.f16364c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16364c.post(runnable);
    }
}
