package b2;

import android.os.Bundle;
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f4148f;
    public static final String h;
    public static final String f4149n;
    public static final String f4150r;
    public final int f4151a;
    public final long f4152b;
    public final Bundle f4153c;

    static {
        String str = e2.m0.f8255a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f4148f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f4149n = Integer.toString(4, 36);
        f4150r = Integer.toString(5, 36);
    }

    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f4151a = i10;
        this.f4153c = bundle;
        this.f4152b = j10;
    }
}
