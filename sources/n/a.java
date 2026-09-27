package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15102b;
    public final c f15103a = new c();

    public static a a() {
        if (f15102b != null) {
            return f15102b;
        }
        synchronized (a.class) {
            try {
                if (f15102b == null) {
                    f15102b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15102b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15103a;
        if (cVar.f15107c == null) {
            synchronized (cVar.f15105a) {
                try {
                    if (cVar.f15107c == null) {
                        cVar.f15107c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15107c.post(runnable);
    }
}
