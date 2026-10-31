package m4;

import android.os.Bundle;
public final class r {
    public static final String f12904a;
    public static final String f12905b;
    public static final String f12906c;
    public static final String d;

    static {
        String str = e2.l0.f6165a;
        f12904a = Integer.toString(0, 36);
        f12905b = Integer.toString(1, 36);
        f12906c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static r a(Bundle bundle) {
        Bundle o10 = e2.l0.o(bundle.getBundle(f12904a));
        bundle.getBoolean(f12905b, false);
        bundle.getBoolean(f12906c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
