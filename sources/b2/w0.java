package b2;

import java.io.IOException;
public class w0 extends IOException {
    public final boolean f4137a;
    public final int f4138b;

    public w0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f4137a = z10;
        this.f4138b = i10;
    }

    public static w0 a(RuntimeException runtimeException, String str) {
        return new w0(str, runtimeException, true, 1);
    }

    public static w0 b(String str, Exception exc) {
        return new w0(str, exc, true, 4);
    }

    public static w0 c(String str) {
        return new w0(str, null, false, 1);
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
        sb2.append(this.f4137a);
        sb2.append(", dataType=");
        return a1.g.n(this.f4138b, "}", sb2);
    }
}
