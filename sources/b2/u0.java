package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String f2418e;
    public static final String f2419f;
    public static final String h;
    public static final String f2420n;
    public static final String f2421r;
    public final int f2422a;
    public final long f2423b;
    public final Bundle f2424c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(0, 36);
        f2418e = Integer.toString(1, 36);
        f2419f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2420n = Integer.toString(4, 36);
        f2421r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2422a = i10;
        this.f2424c = bundle;
        this.f2423b = j3;
    }
}
