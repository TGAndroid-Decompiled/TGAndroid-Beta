package m4;

import android.os.Bundle;
public final class n {
    public static final String f14618a;
    public static final String f14619b;
    public static final String f14620c;
    public static final String d;

    static {
        String str = e2.d0.f7885a;
        f14618a = Integer.toString(0, 36);
        f14619b = Integer.toString(1, 36);
        f14620c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14618a);
        bundle.getBoolean(f14619b, false);
        bundle.getBoolean(f14620c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
