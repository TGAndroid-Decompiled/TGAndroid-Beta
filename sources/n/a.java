package n;

import android.os.Looper;
import w7.y;
public final class a extends y {
    public static volatile a f13668b;
    public final c f13669a = new c();

    public static a a() {
        if (f13668b != null) {
            return f13668b;
        }
        synchronized (a.class) {
            try {
                if (f13668b == null) {
                    f13668b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13668b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.f13669a;
        if (cVar.f13673c == null) {
            synchronized (cVar.f13671a) {
                try {
                    if (cVar.f13673c == null) {
                        cVar.f13673c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f13673c.post(runnable);
    }
}
