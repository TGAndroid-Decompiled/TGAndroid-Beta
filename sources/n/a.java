package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15061b;
    public final c f15062a = new c();

    public static a a() {
        if (f15061b != null) {
            return f15061b;
        }
        synchronized (a.class) {
            try {
                if (f15061b == null) {
                    f15061b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15061b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15062a;
        if (cVar.f15066c == null) {
            synchronized (cVar.f15064a) {
                try {
                    if (cVar.f15066c == null) {
                        cVar.f15066c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15066c.post(runnable);
    }
}
