package defpackage;

import java.io.IOException;
public final class di7 extends Exception {
    public final int a;

    public di7(String str) {
        super(str);
        this.a = 13;
    }

    public di7(String str, IOException iOException) {
        super(str, iOException);
        this.a = 29;
    }
}
