package j7;

import java.io.Closeable;
public abstract class f0 {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                k7.n7.a(th2, th3);
            }
        }
    }
}
