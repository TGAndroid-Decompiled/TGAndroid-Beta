package b2;

import java.io.IOException;
public class s0 extends IOException {
    public final boolean f2010a;
    public final int f2011b;

    public s0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f2010a = z10;
        this.f2011b = i10;
    }

    public static s0 a(RuntimeException runtimeException, String str) {
        return new s0(str, runtimeException, true, 1);
    }

    public static s0 b(String str, Exception exc) {
        return new s0(str, exc, true, 4);
    }

    public static s0 c(String str) {
        return new s0(str, null, false, 1);
    }

    @Override
    public final String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f2010a);
        sb2.append(", dataType=");
        return a4.a.n(this.f2011b, "}", sb2);
    }
}
