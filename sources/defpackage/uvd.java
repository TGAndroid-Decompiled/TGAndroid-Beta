package defpackage;

import java.io.Closeable;
public abstract class uvd {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kke.a(th, th2);
            }
        }
    }
}
