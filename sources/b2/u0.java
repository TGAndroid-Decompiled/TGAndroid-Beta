package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f3329f;
    public static final String h;
    public static final String f3330n;
    public static final String f3331r;
    public final int f3332a;
    public final long f3333b;
    public final Bundle f3334c;

    static {
        String str = e2.d0.f7888a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f3329f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3330n = Integer.toString(4, 36);
        f3331r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3332a = i10;
        this.f3334c = bundle;
        this.f3333b = j3;
    }
}
