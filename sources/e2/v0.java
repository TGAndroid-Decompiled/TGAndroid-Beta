package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10779e;
    public static final String f10780f;
    public static final String h;
    public static final String f10781n;
    public static final String f10782r;
    public final int f10783a;
    public final long f10784b;
    public final Bundle f10785c;

    static {
        String str = h2.l0.f13786a;
        d = Integer.toString(0, 36);
        f10779e = Integer.toString(1, 36);
        f10780f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10781n = Integer.toString(4, 36);
        f10782r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10783a = i7;
        this.f10785c = bundle;
        this.f10784b = j3;
    }
}
