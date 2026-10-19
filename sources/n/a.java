package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f16986b;
    public final c f16987a = new c();

    public static a a() {
        if (f16986b != null) {
            return f16986b;
        }
        synchronized (a.class) {
            try {
                if (f16986b == null) {
                    f16986b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16986b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16987a;
        if (cVar.f16991c == null) {
            synchronized (cVar.f16989a) {
                try {
                    if (cVar.f16991c == null) {
                        cVar.f16991c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16991c.post(runnable);
    }
}
