package n;

import android.os.Looper;
import c8.w9;
public final class a extends w9 {
    public static volatile a f20109b;
    public final b f20110a = new b();

    public static a a() {
        if (f20109b != null) {
            return f20109b;
        }
        synchronized (a.class) {
            try {
                if (f20109b == null) {
                    f20109b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20109b;
    }

    public final void b(Runnable runnable) {
        b bVar = this.f20110a;
        if (bVar.f20113c == null) {
            synchronized (bVar.f20111a) {
                try {
                    if (bVar.f20113c == null) {
                        bVar.f20113c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f20113c.post(runnable);
    }
}
