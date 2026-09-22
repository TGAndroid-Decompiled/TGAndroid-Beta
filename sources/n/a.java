package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15076b;
    public final c f15077a = new c();

    public static a a() {
        if (f15076b != null) {
            return f15076b;
        }
        synchronized (a.class) {
            try {
                if (f15076b == null) {
                    f15076b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15076b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15077a;
        if (cVar.f15081c == null) {
            synchronized (cVar.f15079a) {
                try {
                    if (cVar.f15081c == null) {
                        cVar.f15081c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15081c.post(runnable);
    }
}
