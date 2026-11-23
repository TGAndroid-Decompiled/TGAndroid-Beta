package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10808e;
    public static final String f10809f;
    public static final String h;
    public static final String f10810n;
    public static final String f10811r;
    public final int f10812a;
    public final long f10813b;
    public final Bundle f10814c;

    static {
        String str = h2.l0.f13815a;
        d = Integer.toString(0, 36);
        f10808e = Integer.toString(1, 36);
        f10809f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10810n = Integer.toString(4, 36);
        f10811r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10812a = i7;
        this.f10814c = bundle;
        this.f10813b = j3;
    }
}
