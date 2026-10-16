package b2;

import java.io.IOException;
public class x0 extends IOException {
    public final boolean f2530a;
    public final int f2531b;

    public x0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f2530a = z10;
        this.f2531b = i10;
    }

    public static x0 a(RuntimeException runtimeException, String str) {
        return new x0(str, runtimeException, true, 1);
    }

    public static x0 b(String str, Exception exc) {
        return new x0(str, exc, true, 4);
    }

    public static x0 c(String str) {
        return new x0(str, null, false, 1);
    }

    @Override
    public String getMessage() {
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
        sb2.append(this.f2530a);
        sb2.append(", dataType=");
        return a1.g.n(this.f2531b, "}", sb2);
    }
}
