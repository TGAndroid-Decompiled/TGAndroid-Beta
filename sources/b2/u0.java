package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String e;
    public static final String f2022f;
    public static final String h;
    public static final String f2023n;
    public static final String f2024r;
    public final int f2025a;
    public final long f2026b;
    public final Bundle f2027c;

    static {
        String str = e2.d0.f7188a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f2022f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f2023n = Integer.toString(4, 36);
        f2024r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f2025a = i10;
        this.f2027c = bundle;
        this.f2026b = j3;
    }
}
