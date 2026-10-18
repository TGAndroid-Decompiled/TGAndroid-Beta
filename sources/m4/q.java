package m4;

import android.os.Bundle;
public final class q {
    public static final String f16678a;
    public static final String f16679b;
    public static final String f16680c;
    public static final String d;

    static {
        String str = e2.m0.f8253a;
        f16678a = Integer.toString(0, 36);
        f16679b = Integer.toString(1, 36);
        f16680c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f16678a));
        bundle.getBoolean(f16679b, false);
        bundle.getBoolean(f16680c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
