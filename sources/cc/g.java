package cc;

import a9.p;
import java.io.IOException;

public abstract class g extends Exception {

    public final String f2570a;

    public g(String str, String str2) {
        super(str, null);
        this.f2570a = str2;
    }

    @Override
    public final String toString() {
        String str = this.f2570a;
        return p.p(new StringBuilder(), super.toString(), str != null ? s3.c.e("; request-id: ", str) : "");
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.f2570a = str2;
    }
}
