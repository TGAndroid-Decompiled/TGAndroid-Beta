package j3;

import java.io.IOException;
public class r1 extends IOException {
    public final boolean f9401a;
    public final int f9402b;

    public r1(String str, Throwable th2, boolean z4, int i10) {
        super(str, th2);
        this.f9401a = z4;
        this.f9402b = i10;
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
        sb.append(this.f9401a);
        sb.append(", dataType=");
        return android.support.v4.media.a.m(this.f9402b, "}", sb);
    }
}
