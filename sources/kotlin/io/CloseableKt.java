package kotlin.io;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.ExceptionsKt;

public abstract class CloseableKt {
    public static final void closeFinally(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }
}
