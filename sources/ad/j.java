package ad;

import java.io.IOException;
public final class j extends Exception {
    public final h f533a;

    public j(String str) {
        super(str);
        this.f533a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f533a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f533a = h.INTERNAL_ERROR;
    }
}
