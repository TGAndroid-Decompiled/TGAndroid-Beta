package kc;

import java.io.IOException;
public final class j extends Exception {
    public final h f11085a;

    public j(String str) {
        super(str);
        this.f11085a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f11085a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f11085a = h.INTERNAL_ERROR;
    }
}
