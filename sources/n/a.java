package n;

import android.os.Looper;
import b8.qe;
public final class a extends qe {
    public static volatile a f20099b;
    public final c f20100a = new c();

    public static a a() {
        if (f20099b != null) {
            return f20099b;
        }
        synchronized (a.class) {
            try {
                if (f20099b == null) {
                    f20099b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20099b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f20100a;
        if (cVar.f20105c == null) {
            synchronized (cVar.f20103a) {
                try {
                    if (cVar.f20105c == null) {
                        cVar.f20105c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f20105c.post(runnable);
    }
}
