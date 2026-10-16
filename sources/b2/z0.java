package b2;

import android.os.Bundle;
public abstract class z0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f2539f;
    public static final String h;
    public static final String f2540n;
    public static final String f2541r;
    public final int f2542a;
    public final long f2543b;
    public final Bundle f2544c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2539f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2540n = Integer.toString(4, 36);
        f2541r = Integer.toString(5, 36);
    }

    public z0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2542a = i10;
        this.f2544c = bundle;
        this.f2543b = j10;
    }
}
