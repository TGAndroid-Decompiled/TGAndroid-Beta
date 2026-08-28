package n;

import android.os.Looper;
import g7.z;
public final class a extends z {
    public static volatile a f18241b;
    public final c f18242a = new c();

    public static a a() {
        if (f18241b != null) {
            return f18241b;
        }
        synchronized (a.class) {
            try {
                if (f18241b == null) {
                    f18241b = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18241b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f18242a;
        if (cVar.f18246c == null) {
            synchronized (cVar.f18244a) {
                try {
                    if (cVar.f18246c == null) {
                        cVar.f18246c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f18246c.post(runnable);
    }
}
