package n;

import android.os.Looper;
import k7.v;
public final class a extends v {
    public static volatile a f14192b;
    public final c f14193a = new c();

    public static a a() {
        if (f14192b != null) {
            return f14192b;
        }
        synchronized (a.class) {
            try {
                if (f14192b == null) {
                    f14192b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14192b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14193a;
        if (cVar.f14197c == null) {
            synchronized (cVar.f14195a) {
                try {
                    if (cVar.f14197c == null) {
                        cVar.f14197c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14197c.post(runnable);
    }
}
