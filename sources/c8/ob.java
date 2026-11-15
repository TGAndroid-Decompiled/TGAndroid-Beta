package c8;

import java.io.Closeable;
public abstract class ob {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                a8.ma.a(th2, th3);
            }
        }
    }
}
