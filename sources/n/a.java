package n;

import android.os.Looper;
import w7.a0;
public final class a extends a0 {
    public static volatile a f16483b;
    public final c f16484a = new c();

    public static a a() {
        if (f16483b != null) {
            return f16483b;
        }
        synchronized (a.class) {
            try {
                if (f16483b == null) {
                    f16483b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16483b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16484a;
        if (cVar.f16488c == null) {
            synchronized (cVar.f16486a) {
                try {
                    if (cVar.f16488c == null) {
                        cVar.f16488c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16488c.post(runnable);
    }
}
