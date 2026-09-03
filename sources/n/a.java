package n;

import android.os.Looper;
import k7.w;
public final class a extends w {
    public static volatile a f15168b;
    public final c f15169a = new c();

    public static a a() {
        if (f15168b != null) {
            return f15168b;
        }
        synchronized (a.class) {
            try {
                if (f15168b == null) {
                    f15168b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15168b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15169a;
        if (cVar.f15173c == null) {
            synchronized (cVar.f15171a) {
                try {
                    if (cVar.f15173c == null) {
                        cVar.f15173c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15173c.post(runnable);
    }
}
