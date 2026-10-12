package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15892b;
    public final c f15893a = new c();

    public static a a() {
        if (f15892b != null) {
            return f15892b;
        }
        synchronized (a.class) {
            try {
                if (f15892b == null) {
                    f15892b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15892b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15893a;
        if (cVar.f15897c == null) {
            synchronized (cVar.f15895a) {
                try {
                    if (cVar.f15897c == null) {
                        cVar.f15897c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15897c.post(runnable);
    }
}
