package gc;

import java.io.IOException;
public final class i extends Exception {
    public final g f7729a;

    public i(String str) {
        super(str);
        this.f7729a = g.BAD_REQUEST;
    }

    public final g a() {
        return this.f7729a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.f7729a = g.INTERNAL_ERROR;
    }
}
