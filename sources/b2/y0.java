package b2;

import android.os.Bundle;
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f2434f;
    public static final String h;
    public static final String f2435n;
    public static final String f2436r;
    public final int f2437a;
    public final long f2438b;
    public final Bundle f2439c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2434f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2435n = Integer.toString(4, 36);
        f2436r = Integer.toString(5, 36);
    }

    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2437a = i10;
        this.f2439c = bundle;
        this.f2438b = j10;
    }
}
