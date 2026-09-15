package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3324f;
    public static final String h;
    public static final String f3325n;
    public static final String f3326r;
    public final int f3327a;
    public final long f3328b;
    public final Bundle f3329c;

    static {
        String str = e2.d0.f7883a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3324f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3325n = Integer.toString(4, 36);
        f3326r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3327a = i10;
        this.f3329c = bundle;
        this.f3328b = j3;
    }
}
