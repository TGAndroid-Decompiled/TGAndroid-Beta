package c8;

import java.io.Closeable;
public abstract class rb {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                af.b.a(th2, th3);
            }
        }
    }
}
