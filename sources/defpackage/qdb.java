package defpackage;

import java.io.IOException;
public abstract class qdb extends Exception {
    public final String a;

    public qdb(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = c00.i("; request-id: ", str2);
        } else {
            str = "";
        }
        return c00.k(new StringBuilder(), super.toString(), str);
    }

    public qdb(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
