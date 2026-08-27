package hc;

import java.io.IOException;

public final class j extends Exception {

    public final h f8901a;

    public j(String str) {
        super(str);
        this.f8901a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f8901a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f8901a = h.INTERNAL_ERROR;
    }
}
