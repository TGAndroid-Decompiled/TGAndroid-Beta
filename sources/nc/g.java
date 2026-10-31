package nc;

import java.io.IOException;
public abstract class g extends Exception {
    public final String f13747a;

    public g(String str, String str2) {
        super(str, null);
        this.f13747a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f13747a;
        if (str2 != null) {
            str = sc.e.h("; request-id: ", str2);
        } else {
            str = "";
        }
        return a1.g.r(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f13747a = str2;
    }
}
