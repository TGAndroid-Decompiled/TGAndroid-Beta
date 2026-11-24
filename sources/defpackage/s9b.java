package defpackage;

import java.io.IOException;
public abstract class s9b extends Exception {
    public final String a;

    public s9b(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = b00.h("; request-id: ", str2);
        } else {
            str = "";
        }
        return b00.j(new StringBuilder(), super.toString(), str);
    }

    public s9b(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
