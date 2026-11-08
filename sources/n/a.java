package n;

import android.os.Looper;
import c8.w9;
public final class a extends w9 {
    public static volatile a f20112b;
    public final b f20113a = new b();

    public static a a() {
        if (f20112b != null) {
            return f20112b;
        }
        synchronized (a.class) {
            try {
                if (f20112b == null) {
                    f20112b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20112b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f20113a;
        if (bVar.f20116c == null) {
            synchronized (bVar.f20114a) {
                try {
                    if (bVar.f20116c == null) {
                        bVar.f20116c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f20116c.post(runnable);
    }
}
