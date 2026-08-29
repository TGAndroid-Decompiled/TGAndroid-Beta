package j3;

import java.io.IOException;
public class t1 extends IOException {
    public final boolean f10808a;
    public final int f10809b;

    public t1(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f10808a = z10;
        this.f10809b = i10;
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
