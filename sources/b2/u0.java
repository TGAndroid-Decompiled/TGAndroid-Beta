package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String f3585e;
    public static final String f3586f;
    public static final String h;
    public static final String f3587n;
    public static final String f3588r;
    public final int f3589a;
    public final long f3590b;
    public final Bundle f3591c;

    static {
        String str = e2.d0.f8538a;
        d = Integer.toString(0, 36);
        f3585e = Integer.toString(1, 36);
        f3586f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3587n = Integer.toString(4, 36);
        f3588r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3589a = i10;
        this.f3591c = bundle;
        this.f3590b = j3;
    }
}
