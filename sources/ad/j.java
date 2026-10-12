package ad;

import java.io.IOException;
public final class j extends Exception {
    public final h f529a;

    public j(String str) {
        super(str);
        this.f529a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f529a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f529a = h.INTERNAL_ERROR;
    }
}
