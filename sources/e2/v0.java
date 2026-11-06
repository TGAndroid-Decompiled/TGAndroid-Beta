package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10625e;
    public static final String f10626f;
    public static final String h;
    public static final String f10627n;
    public static final String f10628r;
    public final int f10629a;
    public final long f10630b;
    public final Bundle f10631c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(0, 36);
        f10625e = Integer.toString(1, 36);
        f10626f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10627n = Integer.toString(4, 36);
        f10628r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10629a = i7;
        this.f10631c = bundle;
        this.f10630b = j3;
    }
}
