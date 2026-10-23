package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f17049b;
    public final c f17050a = new c();

    public static a a() {
        if (f17049b != null) {
            return f17049b;
        }
        synchronized (a.class) {
            try {
                if (f17049b == null) {
                    f17049b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17049b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f17050a;
        if (cVar.f17054c == null) {
            synchronized (cVar.f17052a) {
                try {
                    if (cVar.f17054c == null) {
                        cVar.f17054c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f17054c.post(runnable);
    }
}
