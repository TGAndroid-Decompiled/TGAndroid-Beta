package b2;

import android.os.Bundle;
public abstract class z0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3602f;
    public static final String h;
    public static final String f3603n;
    public static final String f3604r;
    public final int f3605a;
    public final long f3606b;
    public final Bundle f3607c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3602f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3603n = Integer.toString(4, 36);
        f3604r = Integer.toString(5, 36);
    }

    public z0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3605a = i10;
        this.f3607c = bundle;
        this.f3606b = j10;
    }
}
