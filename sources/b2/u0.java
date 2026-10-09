package b2;

import android.os.Bundle;
public abstract class u0 extends Exception {
    public static final String d;
    public static final String f3664e;
    public static final String f3665f;
    public static final String h;
    public static final String f3666n;
    public static final String f3667r;
    public final int f3668a;
    public final long f3669b;
    public final Bundle f3670c;

    static {
        String str = e2.d0.f8532a;
        d = Integer.toString(0, 36);
        f3664e = Integer.toString(1, 36);
        f3665f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f3666n = Integer.toString(4, 36);
        f3667r = Integer.toString(5, 36);
    }

    public u0(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f3668a = i10;
        this.f3670c = bundle;
        this.f3669b = j3;
    }
}
