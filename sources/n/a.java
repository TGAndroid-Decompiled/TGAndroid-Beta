package n;

import android.os.Looper;
import c8.y9;
public final class a extends y9 {
    public static volatile a f21133b;
    public final b f21134a = new b();

    public static a a() {
        if (f21133b != null) {
            return f21133b;
        }
        synchronized (a.class) {
            try {
                if (f21133b == null) {
                    f21133b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21133b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21134a;
        if (bVar.f21137c == null) {
            synchronized (bVar.f21135a) {
                try {
                    if (bVar.f21137c == null) {
                        bVar.f21137c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21137c.post(runnable);
    }
}
