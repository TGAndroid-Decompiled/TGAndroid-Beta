package m4;

import android.os.Bundle;
public final class r {
    public static final String f18206a;
    public static final String f18207b;
    public static final String f18208c;
    public static final String d;

    static {
        String str = e2.n0.f9691a;
        f18206a = Integer.toString(0, 36);
        f18207b = Integer.toString(1, 36);
        f18208c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.n0.o(bundle.getBundle(f18206a));
        bundle.getBoolean(f18207b, false);
        bundle.getBoolean(f18208c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
