package h3;

import java.io.IOException;

public class t1 extends IOException {

    public final boolean f8195a;

    public final int f8196b;

    public t1(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f8195a = z10;
        this.f8196b = i10;
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
