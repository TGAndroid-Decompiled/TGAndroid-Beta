package b2;

import android.os.Bundle;
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f4144f;
    public static final String h;
    public static final String f4145n;
    public static final String f4146r;
    public final int f4147a;
    public final long f4148b;
    public final Bundle f4149c;

    static {
        String str = e2.m0.f8252a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f4144f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f4145n = Integer.toString(4, 36);
        f4146r = Integer.toString(5, 36);
    }

    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f4147a = i10;
        this.f4149c = bundle;
        this.f4148b = j10;
    }
}
