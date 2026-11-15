package e2;

import android.os.Bundle;
public abstract class v0 extends Exception {
    public static final String d;
    public static final String f10461e;
    public static final String f10462f;
    public static final String h;
    public static final String f10463n;
    public static final String f10464r;
    public final int f10465a;
    public final long f10466b;
    public final Bundle f10467c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(0, 36);
        f10461e = Integer.toString(1, 36);
        f10462f = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
        f10463n = Integer.toString(4, 36);
        f10464r = Integer.toString(5, 36);
    }

    public v0(String str, Throwable th2, int i7, long j3) {
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f10465a = i7;
        this.f10467c = bundle;
        this.f10466b = j3;
    }
}
