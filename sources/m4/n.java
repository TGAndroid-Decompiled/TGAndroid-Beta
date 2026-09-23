package m4;

import android.os.Bundle;
public final class n {
    public static final String f14632a;
    public static final String f14633b;
    public static final String f14634c;
    public static final String d;

    static {
        String str = e2.d0.f7871a;
        f14632a = Integer.toString(0, 36);
        f14633b = Integer.toString(1, 36);
        f14634c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14632a);
        bundle.getBoolean(f14633b, false);
        bundle.getBoolean(f14634c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
