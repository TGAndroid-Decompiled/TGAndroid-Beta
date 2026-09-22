package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3326f;
    public static final String h;
    public static final String f3327n;
    public static final String f3328r;
    public final int f3329a;
    public final long f3330b;
    public final Bundle f3331c;

    static {
        String str = e2.d0.f7885a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3326f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3327n = Integer.toString(4, 36);
        f3328r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3329a = i10;
        this.f3331c = bundle;
        this.f3330b = j3;
    }
}
