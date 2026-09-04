package m4;

import android.os.Bundle;
public final class n {
    public static final String f16006a;
    public static final String f16007b;
    public static final String f16008c;
    public static final String d;

    static {
        String str = e2.d0.f8737a;
        f16006a = Integer.toString(0, 36);
        f16007b = Integer.toString(1, 36);
        f16008c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16006a);
        bundle.getBoolean(f16007b, false);
        bundle.getBoolean(f16008c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
