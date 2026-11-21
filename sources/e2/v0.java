package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10805e;
    public static final String f10806f;
    public static final String h;
    public static final String f10807n;
    public static final String f10808r;
    public final int f10809a;
    public final long f10810b;
    public final Bundle f10811c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(0, 36);
        f10805e = Integer.toString(1, 36);
        f10806f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10807n = Integer.toString(4, 36);
        f10808r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10809a = i7;
        this.f10811c = bundle;
        this.f10810b = j3;
    }
}
