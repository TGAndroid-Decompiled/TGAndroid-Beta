package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f16988b;
    public final c f16989a = new c();

    public static a a() {
        if (f16988b != null) {
            return f16988b;
        }
        synchronized (a.class) {
            try {
                if (f16988b == null) {
                    f16988b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16988b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16989a;
        if (cVar.f16993c == null) {
            synchronized (cVar.f16991a) {
                try {
                    if (cVar.f16993c == null) {
                        cVar.f16993c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16993c.post(runnable);
    }
}
