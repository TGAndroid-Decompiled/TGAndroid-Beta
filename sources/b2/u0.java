package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String f2391e;
    public static final String f2392f;
    public static final String h;
    public static final String f2393n;
    public static final String f2394r;
    public final int f2395a;
    public final long f2396b;
    public final Bundle f2397c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(0, 36);
        f2391e = Integer.toString(1, 36);
        f2392f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2393n = Integer.toString(4, 36);
        f2394r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2395a = i10;
        this.f2397c = bundle;
        this.f2396b = j3;
    }
}
