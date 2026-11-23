package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10771e;
    public static final String f10772f;
    public static final String h;
    public static final String f10773n;
    public static final String f10774r;
    public final int f10775a;
    public final long f10776b;
    public final Bundle f10777c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f10771e = Integer.toString(1, 36);
        f10772f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10773n = Integer.toString(4, 36);
        f10774r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10775a = i7;
        this.f10777c = bundle;
        this.f10776b = j3;
    }
}
