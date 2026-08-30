package g5;

import java.io.IOException;
public final class l0 extends IOException {
    public l0(Throwable th2) {
        super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
    }
}
