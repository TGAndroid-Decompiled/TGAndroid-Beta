package n;

import android.os.Looper;
import i7.b0;
public final class a extends b0 {
    public static volatile a f17067b;
    public final c f17068a = new c();

    public static a a() {
        if (f17067b != null) {
            return f17067b;
        }
        synchronized (a.class) {
            try {
                if (f17067b == null) {
                    f17067b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17067b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f17068a;
        if (cVar.f17072c == null) {
            synchronized (cVar.f17070a) {
                try {
                    if (cVar.f17072c == null) {
                        cVar.f17072c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f17072c.post(runnable);
    }
}
