package m4;

import android.os.Bundle;
public final class q {
    public static final String f16680a;
    public static final String f16681b;
    public static final String f16682c;
    public static final String d;

    static {
        String str = e2.m0.f8255a;
        f16680a = Integer.toString(0, 36);
        f16681b = Integer.toString(1, 36);
        f16682c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f16680a));
        bundle.getBoolean(f16681b, false);
        bundle.getBoolean(f16682c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
