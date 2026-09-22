package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3328f;
    public static final String h;
    public static final String f3329n;
    public static final String f3330r;
    public final int f3331a;
    public final long f3332b;
    public final Bundle f3333c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3328f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3329n = Integer.toString(4, 36);
        f3330r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3331a = i10;
        this.f3333c = bundle;
        this.f3332b = j3;
    }
}
