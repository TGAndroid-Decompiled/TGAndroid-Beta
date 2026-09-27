package m4;

import android.os.Bundle;
public final class n {
    public static final String f14927a;
    public static final String f14928b;
    public static final String f14929c;
    public static final String d;

    static {
        String str = e2.d0.f7872a;
        f14927a = Integer.toString(0, 36);
        f14928b = Integer.toString(1, 36);
        f14929c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14927a);
        bundle.getBoolean(f14928b, false);
        bundle.getBoolean(f14929c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
