package m4;

import android.os.Bundle;
public final class r {
    public static final String f15591a;
    public static final String f15592b;
    public static final String f15593c;
    public static final String d;

    static {
        String str = e2.m0.f8372a;
        f15591a = Integer.toString(0, 36);
        f15592b = Integer.toString(1, 36);
        f15593c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f15591a));
        bundle.getBoolean(f15592b, false);
        bundle.getBoolean(f15593c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
