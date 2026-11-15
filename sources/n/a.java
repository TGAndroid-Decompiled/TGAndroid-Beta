package n;

import android.os.Looper;
import c8.v9;
public final class a extends v9 {
    public static volatile a f20679b;
    public final b f20680a = new b();

    public static a a() {
        if (f20679b != null) {
            return f20679b;
        }
        synchronized (a.class) {
            try {
                if (f20679b == null) {
                    f20679b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20679b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f20680a;
        if (bVar.f20683c == null) {
            synchronized (bVar.f20681a) {
                try {
                    if (bVar.f20683c == null) {
                        bVar.f20683c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f20683c.post(runnable);
    }
}
