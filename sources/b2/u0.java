package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String f3662e;
    public static final String f3663f;
    public static final String h;
    public static final String f3664n;
    public static final String f3665r;
    public final int f3666a;
    public final long f3667b;
    public final Bundle f3668c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(0, 36);
        f3662e = Integer.toString(1, 36);
        f3663f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3664n = Integer.toString(4, 36);
        f3665r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3666a = i10;
        this.f3668c = bundle;
        this.f3667b = j3;
    }
}
