package n;

import android.os.Looper;
import c8.x9;
public final class a extends x9 {
    public static volatile a f21040b;
    public final b f21041a = new b();

    public static a a() {
        if (f21040b != null) {
            return f21040b;
        }
        synchronized (a.class) {
            try {
                if (f21040b == null) {
                    f21040b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21040b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21041a;
        if (bVar.f21044c == null) {
            synchronized (bVar.f21042a) {
                try {
                    if (bVar.f21044c == null) {
                        bVar.f21044c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21044c.post(runnable);
    }
}
