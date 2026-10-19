package m4;

import android.os.Bundle;
public final class q {
    public static final String f16679a;
    public static final String f16680b;
    public static final String f16681c;
    public static final String d;

    static {
        String str = e2.m0.f8252a;
        f16679a = Integer.toString(0, 36);
        f16680b = Integer.toString(1, 36);
        f16681c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f16679a));
        bundle.getBoolean(f16680b, false);
        bundle.getBoolean(f16681c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
