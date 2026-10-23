package b2;

import android.os.Bundle;
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f4151f;
    public static final String h;
    public static final String f4152n;
    public static final String f4153r;
    public final int f4154a;
    public final long f4155b;
    public final Bundle f4156c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f4151f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f4152n = Integer.toString(4, 36);
        f4153r = Integer.toString(5, 36);
    }

    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f4154a = i10;
        this.f4156c = bundle;
        this.f4155b = j10;
    }
}
