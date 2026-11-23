package c8;

import java.io.Closeable;
public abstract class sb {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                b5.a.a(th2, th3);
            }
        }
    }
}
