package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10769e;
    public static final String f10770f;
    public static final String h;
    public static final String f10771n;
    public static final String f10772r;
    public final int f10773a;
    public final long f10774b;
    public final Bundle f10775c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(0, 36);
        f10769e = Integer.toString(1, 36);
        f10770f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10771n = Integer.toString(4, 36);
        f10772r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10773a = i7;
        this.f10775c = bundle;
        this.f10774b = j3;
    }
}
