package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f14837b;
    public final c f14838a = new c();

    public static a a() {
        if (f14837b != null) {
            return f14837b;
        }
        synchronized (a.class) {
            try {
                if (f14837b == null) {
                    f14837b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14837b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14838a;
        if (cVar.f14842c == null) {
            synchronized (cVar.f14840a) {
                try {
                    if (cVar.f14842c == null) {
                        cVar.f14842c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14842c.post(runnable);
    }
}
