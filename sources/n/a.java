package n;

import android.os.Looper;
import w7.w;
public final class a extends w {
    public static volatile a f16199b;
    public final c f16200a = new c();

    public static a a() {
        if (f16199b != null) {
            return f16199b;
        }
        synchronized (a.class) {
            try {
                if (f16199b == null) {
                    f16199b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16199b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f16200a;
        if (cVar.f16204c == null) {
            synchronized (cVar.f16202a) {
                try {
                    if (cVar.f16204c == null) {
                        cVar.f16204c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f16204c.post(runnable);
    }
}
