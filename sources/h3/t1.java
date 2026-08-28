package h3;

import java.io.IOException;
public class t1 extends IOException {
    public final boolean f9771a;
    public final int f9772b;

    public t1(String str, Throwable th, boolean z10, int i9) {
        super(str, th);
        this.f9771a = z10;
        this.f9772b = i9;
    }

    public static t1 a(String str, Exception exc) {
        return new t1(str, exc, true, 1);
    }

    public static t1 b(String str, Exception exc) {
        return new t1(str, exc, true, 4);
    }

    public static t1 c(String str) {
        return new t1(str, null, false, 1);
    }
}
