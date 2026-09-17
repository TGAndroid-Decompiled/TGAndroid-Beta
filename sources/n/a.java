package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f14849b;
    public final c f14850a = new c();

    public static a a() {
        if (f14849b != null) {
            return f14849b;
        }
        synchronized (a.class) {
            try {
                if (f14849b == null) {
                    f14849b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14849b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14850a;
        if (cVar.f14854c == null) {
            synchronized (cVar.f14852a) {
                try {
                    if (cVar.f14854c == null) {
                        cVar.f14854c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14854c.post(runnable);
    }
}
