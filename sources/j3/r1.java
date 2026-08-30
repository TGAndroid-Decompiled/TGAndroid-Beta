package j3;

import java.io.IOException;
public class r1 extends IOException {
    public final boolean f8810a;
    public final int f8811b;

    public r1(String str, Throwable th2, boolean z4, int i10) {
        super(str, th2);
        this.f8810a = z4;
        this.f8811b = i10;
    }

    public static r1 a(String str, Exception exc) {
        return new r1(str, exc, true, 1);
    }

    public static r1 b(String str, Exception exc) {
        return new r1(str, exc, true, 4);
    }

    public static r1 c(String str) {
        return new r1(str, null, false, 1);
    }

    @Override
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f8810a);
        sb.append(", dataType=");
        return android.support.v4.media.a.m(this.f8811b, "}", sb);
    }
}
