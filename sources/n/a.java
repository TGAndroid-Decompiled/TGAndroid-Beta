package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15066b;
    public final c f15067a = new c();

    public static a a() {
        if (f15066b != null) {
            return f15066b;
        }
        synchronized (a.class) {
            try {
                if (f15066b == null) {
                    f15066b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15066b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15067a;
        if (cVar.f15071c == null) {
            synchronized (cVar.f15069a) {
                try {
                    if (cVar.f15071c == null) {
                        cVar.f15071c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15071c.post(runnable);
    }
}
