package defpackage;

import java.io.IOException;
public class bx7 extends IOException {
    public final boolean a;
    public final byte b;

    public bx7(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static bx7 a(String str, Exception exc) {
        return new bx7(str, exc, true, 1);
    }

    public static bx7 b(String str, Exception exc) {
        return new bx7(str, exc, true, 4);
    }

    public static bx7 c(String str) {
        return new bx7(str, null, true, 8);
    }

    public static bx7 d(String str) {
        return new bx7(str, null, false, 1);
    }

    @Override
    public String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return hg9.k(sb, this.b, "}");
    }
}
