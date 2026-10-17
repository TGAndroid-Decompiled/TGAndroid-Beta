package ad;

import java.io.IOException;
public final class k extends Exception {
    public final i f533a;

    public k(String str) {
        super(str);
        this.f533a = i.BAD_REQUEST;
    }

    public final i a() {
        return this.f533a;
    }

    public k(String str, IOException iOException) {
        super(str, iOException);
        this.f533a = i.INTERNAL_ERROR;
    }
}
