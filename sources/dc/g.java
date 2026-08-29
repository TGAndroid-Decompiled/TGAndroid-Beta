package dc;

import a4.w;
import java.io.IOException;
public abstract class g extends Exception {
    public final String f5540a;

    public g(String str, String str2) {
        super(str, null);
        this.f5540a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f5540a;
        if (str2 != null) {
            str = u3.c.e("; request-id: ", str2);
        } else {
            str = "";
        }
        return w.q(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f5540a = str2;
    }
}
