package n;

import android.os.Looper;
import w7.w;
public final class a extends w {
    public static volatile a f16198b;
    public final c f16199a = new c();

    public static a a() {
        if (f16198b != null) {
            return f16198b;
        }
        synchronized (a.class) {
            try {
                if (f16198b == null) {
                    f16198b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16198b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16199a;
        if (cVar.f16203c == null) {
            synchronized (cVar.f16201a) {
                try {
                    if (cVar.f16203c == null) {
                        cVar.f16203c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16203c.post(runnable);
    }
}
