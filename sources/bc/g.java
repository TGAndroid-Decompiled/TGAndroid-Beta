package bc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f1666a;

    public g(String str, String str2) {
        super(str, null);
        this.f1666a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f1666a;
        if (str2 != null) {
            str = ta.b.d("; request-id: ", str2);
        } else {
            str = "";
        }
        return aa.d.r(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f1666a = str2;
    }
}
