package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f14839b;
    public final c f14840a = new c();

    public static a a() {
        if (f14839b != null) {
            return f14839b;
        }
        synchronized (a.class) {
            try {
                if (f14839b == null) {
                    f14839b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14839b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14840a;
        if (cVar.f14844c == null) {
            synchronized (cVar.f14842a) {
                try {
                    if (cVar.f14844c == null) {
                        cVar.f14844c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14844c.post(runnable);
    }
}
