package kc;

import java.io.IOException;
public final class j extends Exception {
    public final h f10316a;

    public j(String str) {
        super(str);
        this.f10316a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f10316a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f10316a = h.INTERNAL_ERROR;
    }
}
