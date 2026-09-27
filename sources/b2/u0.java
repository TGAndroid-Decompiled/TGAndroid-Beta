package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3323f;
    public static final String h;
    public static final String f3324n;
    public static final String f3325r;
    public final int f3326a;
    public final long f3327b;
    public final Bundle f3328c;

    static {
        String str = e2.d0.f7872a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3323f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3324n = Integer.toString(4, 36);
        f3325r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3326a = i10;
        this.f3328c = bundle;
        this.f3327b = j3;
    }
}
