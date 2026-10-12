package b2;

import android.os.Bundle;
public abstract class z0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f2535f;
    public static final String h;
    public static final String f2536n;
    public static final String f2537r;
    public final int f2538a;
    public final long f2539b;
    public final Bundle f2540c;

    static {
        String str = e2.m0.f8372a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2535f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2536n = Integer.toString(4, 36);
        f2537r = Integer.toString(5, 36);
    }

    public z0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2538a = i10;
        this.f2540c = bundle;
        this.f2539b = j10;
    }
}
