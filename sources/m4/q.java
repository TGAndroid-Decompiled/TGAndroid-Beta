package m4;

import android.os.Bundle;
public final class q {
    public static final String f15321a;
    public static final String f15322b;
    public static final String f15323c;
    public static final String d;

    static {
        String str = e2.m0.f8375a;
        f15321a = Integer.toString(0, 36);
        f15322b = Integer.toString(1, 36);
        f15323c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f15321a));
        bundle.getBoolean(f15322b, false);
        bundle.getBoolean(f15323c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
