package m4;

import android.os.Bundle;
public final class r {
    public static final String f12905a;
    public static final String f12906b;
    public static final String f12907c;
    public static final String d;

    static {
        String str = e2.l0.f6165a;
        f12905a = Integer.toString(0, 36);
        f12906b = Integer.toString(1, 36);
        f12907c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.l0.o(bundle.getBundle(f12905a));
        bundle.getBoolean(f12906b, false);
        bundle.getBoolean(f12907c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
