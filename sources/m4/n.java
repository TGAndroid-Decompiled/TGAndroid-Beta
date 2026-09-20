package m4;

import android.os.Bundle;
public final class n {
    public static final String f14840a;
    public static final String f14841b;
    public static final String f14842c;
    public static final String d;

    static {
        String str = e2.d0.f7888a;
        f14840a = Integer.toString(0, 36);
        f14841b = Integer.toString(1, 36);
        f14842c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14840a);
        bundle.getBoolean(f14841b, false);
        bundle.getBoolean(f14842c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
