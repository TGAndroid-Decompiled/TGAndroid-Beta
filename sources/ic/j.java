package ic;

import java.io.IOException;
public final class j extends Exception {
    public final h f8865a;

    public j(String str) {
        super(str);
        this.f8865a = h.BAD_REQUEST;
    }

    public final h a() {
        return this.f8865a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.f8865a = h.INTERNAL_ERROR;
    }
}
