package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f16985b;
    public final c f16986a = new c();

    public static a a() {
        if (f16985b != null) {
            return f16985b;
        }
        synchronized (a.class) {
            try {
                if (f16985b == null) {
                    f16985b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16985b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16986a;
        if (cVar.f16990c == null) {
            synchronized (cVar.f16988a) {
                try {
                    if (cVar.f16990c == null) {
                        cVar.f16990c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16990c.post(runnable);
    }
}
