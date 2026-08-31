package n;

import android.os.Looper;
import k7.w;
public final class a extends w {
    public static volatile a f15166b;
    public final c f15167a = new c();

    public static a a() {
        if (f15166b != null) {
            return f15166b;
        }
        synchronized (a.class) {
            try {
                if (f15166b == null) {
                    f15166b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15166b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f15167a;
        if (cVar.f15171c == null) {
            synchronized (cVar.f15169a) {
                try {
                    if (cVar.f15171c == null) {
                        cVar.f15171c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f15171c.post(runnable);
    }
}
