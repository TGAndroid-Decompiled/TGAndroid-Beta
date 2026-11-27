package defpackage;

import java.io.IOException;
public final class nk7 extends Exception {
    public final int a;

    public nk7(String str) {
        super(str);
        this.a = 13;
    }

    public nk7(String str, IOException iOException) {
        super(str, iOException);
        this.a = 29;
    }
}
