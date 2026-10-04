package m4;

import android.os.Bundle;
public final class n {
    public static final String f16264a;
    public static final String f16265b;
    public static final String f16266c;
    public static final String d;

    static {
        String str = e2.d0.f8538a;
        f16264a = Integer.toString(0, 36);
        f16265b = Integer.toString(1, 36);
        f16266c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16264a);
        bundle.getBoolean(f16265b, false);
        bundle.getBoolean(f16266c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
