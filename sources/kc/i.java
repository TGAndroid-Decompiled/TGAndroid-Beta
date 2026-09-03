package kc;

import java.io.IOException;
public final class i extends Exception {
    public final g f10295a;

    public i(String str) {
        super(str);
        this.f10295a = g.BAD_REQUEST;
    }

    public final g a() {
        return this.f10295a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.f10295a = g.INTERNAL_ERROR;
    }
}
