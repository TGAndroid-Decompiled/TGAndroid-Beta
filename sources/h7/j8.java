package h7;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class j8 {
    public static final void a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                i6.a(th, th2);
            }
        }
    }
}
