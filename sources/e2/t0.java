package e2;

import java.io.IOException;
public class t0 extends IOException {
    public final boolean f10576a;
    public final int f10577b;

    public t0(String str, Throwable th2, boolean z9, int i7) {
        super(str, th2);
        this.f10576a = z9;
        this.f10577b = i7;
    }

    public static t0 a(RuntimeException runtimeException, String str) {
        return new t0(str, runtimeException, true, 1);
    }

    public static t0 b(String str, Exception exc) {
        return new t0(str, exc, true, 4);
    }

    public static t0 c(String str) {
        return new t0(str, null, false, 1);
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
        sb2.append(this.f10576a);
        sb2.append(", dataType=");
        return a8.p0.n(this.f10577b, "}", sb2);
    }
}
