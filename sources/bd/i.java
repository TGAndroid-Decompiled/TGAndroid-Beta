package bd;

import java.io.IOException;
public final class i extends Exception {
    public final g f3884a;

    public i(String str) {
        super(str);
        this.f3884a = g.BAD_REQUEST;
    }

    public final g a() {
        return this.f3884a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.f3884a = g.INTERNAL_ERROR;
    }
}
