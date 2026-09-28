package n;

import android.os.Looper;
import w7.z;
public final class a extends z {
    public static volatile a f15065b;
    public final c f15066a = new c();

    public static a a() {
        if (f15065b != null) {
            return f15065b;
        }
        synchronized (a.class) {
            try {
                if (f15065b == null) {
                    f15065b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15065b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15066a;
        if (cVar.f15070c == null) {
            synchronized (cVar.f15068a) {
                try {
                    if (cVar.f15070c == null) {
                        cVar.f15070c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15070c.post(runnable);
    }
}
