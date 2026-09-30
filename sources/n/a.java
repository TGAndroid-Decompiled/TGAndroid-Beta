package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15081b;
    public final c f15082a = new c();

    public static a a() {
        if (f15081b != null) {
            return f15081b;
        }
        synchronized (a.class) {
            try {
                if (f15081b == null) {
                    f15081b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15081b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15082a;
        if (cVar.f15086c == null) {
            synchronized (cVar.f15084a) {
                try {
                    if (cVar.f15086c == null) {
                        cVar.f15086c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15086c.post(runnable);
    }
}
