package defpackage;

import java.io.IOException;
public final class mk7 extends Exception {
    public final int a;

    public mk7(String str) {
        super(str);
        this.a = 13;
    }

    public mk7(String str, IOException iOException) {
        super(str, iOException);
        this.a = 29;
    }
}
