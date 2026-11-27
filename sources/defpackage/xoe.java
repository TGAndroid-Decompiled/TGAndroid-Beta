package defpackage;

import java.io.Closeable;
import java.io.IOException;
public abstract class xoe {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
