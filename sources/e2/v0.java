package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10776e;
    public static final String f10777f;
    public static final String h;
    public static final String f10778n;
    public static final String f10779r;
    public final int f10780a;
    public final long f10781b;
    public final Bundle f10782c;

    static {
        String str = h2.l0.f13783a;
        d = Integer.toString(0, 36);
        f10776e = Integer.toString(1, 36);
        f10777f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10778n = Integer.toString(4, 36);
        f10779r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10780a = i7;
        this.f10782c = bundle;
        this.f10781b = j3;
    }
}
