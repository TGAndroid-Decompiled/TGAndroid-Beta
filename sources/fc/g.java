package fc;

import java.io.IOException;
import vh.w2;
public abstract class g extends Exception {
    public final String f6097a;

    public g(String str, String str2) {
        super(str, null);
        this.f6097a = str2;
    }

    @Override
    public final String toString() {
        String str;
        String str2 = this.f6097a;
        if (str2 != null) {
            str = w2.e("; request-id: ", str2);
        } else {
            str = "";
        }
        return android.support.v4.media.a.r(new StringBuilder(), super.toString(), str);
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f6097a = str2;
    }
}
