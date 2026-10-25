package m4;

import android.os.Bundle;
public final class r {
    public static final String f18207a;
    public static final String f18208b;
    public static final String f18209c;
    public static final String d;

    static {
        String str = e2.n0.f9692a;
        f18207a = Integer.toString(0, 36);
        f18208b = Integer.toString(1, 36);
        f18209c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.n0.o(bundle.getBundle(f18207a));
        bundle.getBoolean(f18208b, false);
        bundle.getBoolean(f18209c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
