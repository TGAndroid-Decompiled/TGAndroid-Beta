package b2;

import android.os.Bundle;
public abstract class y0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f4146f;
    public static final String h;
    public static final String f4147n;
    public static final String f4148r;
    public final int f4149a;
    public final long f4150b;
    public final Bundle f4151c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f4146f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f4147n = Integer.toString(4, 36);
        f4148r = Integer.toString(5, 36);
    }

    public y0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f4149a = i10;
        this.f4151c = bundle;
        this.f4150b = j10;
    }
}
