package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3321f;
    public static final String h;
    public static final String f3322n;
    public static final String f3323r;
    public final int f3324a;
    public final long f3325b;
    public final Bundle f3326c;

    static {
        String str = e2.d0.f7870a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3321f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3322n = Integer.toString(4, 36);
        f3323r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3324a = i10;
        this.f3326c = bundle;
        this.f3325b = j3;
    }
}
