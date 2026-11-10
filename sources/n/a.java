package n;

import android.os.Looper;
import c8.w9;
public final class a extends w9 {
    public static volatile a f20117b;
    public final b f20118a = new b();

    public static a a() {
        if (f20117b != null) {
            return f20117b;
        }
        synchronized (a.class) {
            try {
                if (f20117b == null) {
                    f20117b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20117b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f20118a;
        if (bVar.f20121c == null) {
            synchronized (bVar.f20119a) {
                try {
                    if (bVar.f20121c == null) {
                        bVar.f20121c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f20121c.post(runnable);
    }
}
