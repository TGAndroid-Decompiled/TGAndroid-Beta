package n;

import android.os.Looper;
import w7.a0;
public final class a extends a0 {
    public static volatile a f16478b;
    public final c f16479a = new c();

    public static a a() {
        if (f16478b != null) {
            return f16478b;
        }
        synchronized (a.class) {
            try {
                if (f16478b == null) {
                    f16478b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16478b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16479a;
        if (cVar.f16483c == null) {
            synchronized (cVar.f16481a) {
                try {
                    if (cVar.f16483c == null) {
                        cVar.f16483c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16483c.post(runnable);
    }
}
