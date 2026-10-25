package m9;

import a8.hd;
import java.io.Closeable;
public abstract class b {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                hd.a(th2, th3);
            }
        }
    }
}
