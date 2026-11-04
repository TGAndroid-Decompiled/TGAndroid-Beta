package d2;

import android.os.Bundle;
public abstract class x0 extends Exception {
    public static final String d;
    public static final String f8508e;
    public static final String f8509f;
    public static final String h;
    public static final String f8510n;
    public static final String f8511r;
    public final int f8512a;
    public final long f8513b;
    public final Bundle f8514c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(0, 36);
        f8508e = Integer.toString(1, 36);
        f8509f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f8510n = Integer.toString(4, 36);
        f8511r = Integer.toString(5, 36);
    }

    public x0(String str, Throwable th2, int i3, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f8512a = i3;
        this.f8514c = bundle;
        this.f8513b = j10;
    }
}
