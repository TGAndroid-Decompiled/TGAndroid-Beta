package n;

import android.os.Looper;
import c8.y9;
public final class a extends y9 {
    public static volatile a f21037b;
    public final b f21038a = new b();

    public static a a() {
        if (f21037b != null) {
            return f21037b;
        }
        synchronized (a.class) {
            try {
                if (f21037b == null) {
                    f21037b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f21037b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f21038a;
        if (bVar.f21041c == null) {
            synchronized (bVar.f21039a) {
                try {
                    if (bVar.f21041c == null) {
                        bVar.f21041c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f21041c.post(runnable);
    }
}
