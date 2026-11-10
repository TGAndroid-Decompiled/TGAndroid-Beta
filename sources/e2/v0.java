package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10630e;
    public static final String f10631f;
    public static final String h;
    public static final String f10632n;
    public static final String f10633r;
    public final int f10634a;
    public final long f10635b;
    public final Bundle f10636c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(0, 36);
        f10630e = Integer.toString(1, 36);
        f10631f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10632n = Integer.toString(4, 36);
        f10633r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10634a = i7;
        this.f10636c = bundle;
        this.f10635b = j3;
    }
}
