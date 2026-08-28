package g7;

import java.io.Closeable;
public abstract class f8 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                w5.a(th, th2);
            }
        }
    }
}
