package n;

import android.os.Looper;
import h7.v;

public final class a extends v {

    public static volatile a f18066b;

    public final c f18067a = new c();

    public static a a() {
        if (f18066b != null) {
            return f18066b;
        }
        synchronized (a.class) {
            try {
                if (f18066b == null) {
                    f18066b = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18066b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f18067a;
        if (cVar.f18071c == null) {
            synchronized (cVar.f18069a) {
                try {
                    if (cVar.f18071c == null) {
                        cVar.f18071c = c.a(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cVar.f18071c.post(runnable);
    }
}
