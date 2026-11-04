package o4;

import android.os.Bundle;
public final class q {
    public static final String f20800a;
    public static final String f20801b;
    public static final String f20802c;
    public static final String d;

    static {
        String str = g2.n0.f11873a;
        f20800a = Integer.toString(0, 36);
        f20801b = Integer.toString(1, 36);
        f20802c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = g2.n0.o(bundle.getBundle(f20800a));
        bundle.getBoolean(f20801b, false);
        bundle.getBoolean(f20802c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
