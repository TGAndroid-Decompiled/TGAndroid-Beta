package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f15606b;
    public final c f15607a = new c();

    public static a a() {
        if (f15606b != null) {
            return f15606b;
        }
        synchronized (a.class) {
            try {
                if (f15606b == null) {
                    f15606b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15606b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15607a;
        if (cVar.f15611c == null) {
            synchronized (cVar.f15609a) {
                try {
                    if (cVar.f15611c == null) {
                        cVar.f15611c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15611c.post(runnable);
    }
}
