package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15022b;
    public final c f15023a = new c();

    public static a a() {
        if (f15022b != null) {
            return f15022b;
        }
        synchronized (a.class) {
            try {
                if (f15022b == null) {
                    f15022b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15022b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15023a;
        if (cVar.f15027c == null) {
            synchronized (cVar.f15025a) {
                try {
                    if (cVar.f15027c == null) {
                        cVar.f15027c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15027c.post(runnable);
    }
}
