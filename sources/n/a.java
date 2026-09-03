package n;

import android.os.Looper;
import k7.v;
public final class a extends v {
    public static volatile a f14180b;
    public final c f14181a = new c();

    public static a a() {
        if (f14180b != null) {
            return f14180b;
        }
        synchronized (a.class) {
            try {
                if (f14180b == null) {
                    f14180b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14180b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f14181a;
        if (cVar.f14185c == null) {
            synchronized (cVar.f14183a) {
                try {
                    if (cVar.f14185c == null) {
                        cVar.f14185c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f14185c.post(runnable);
    }
}
