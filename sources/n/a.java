package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15050b;
    public final c f15051a = new c();

    public static a a() {
        if (f15050b != null) {
            return f15050b;
        }
        synchronized (a.class) {
            try {
                if (f15050b == null) {
                    f15050b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15050b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15051a;
        if (cVar.f15055c == null) {
            synchronized (cVar.f15053a) {
                try {
                    if (cVar.f15055c == null) {
                        cVar.f15055c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15055c.post(runnable);
    }
}
