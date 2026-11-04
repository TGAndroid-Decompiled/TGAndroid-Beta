package d2;

import java.io.IOException;
public class v0 extends IOException {
    public final boolean f8496a;
    public final int f8497b;

    public v0(String str, Throwable th2, boolean z10, int i3) {
        super(str, th2);
        this.f8496a = z10;
        this.f8497b = i3;
    }

    public static v0 a(RuntimeException runtimeException, String str) {
        return new v0(str, runtimeException, true, 1);
    }

    public static v0 b(String str, Exception exc) {
        return new v0(str, exc, true, 4);
    }

    public static v0 c(String str) {
        return new v0(str, null, false, 1);
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
        sb2.append(this.f8496a);
        sb2.append(", dataType=");
        return a1.g.o(this.f8497b, "}", sb2);
    }
}
