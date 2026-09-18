package m4;

import android.os.Bundle;
public final class n {
    public static final String f14630a;
    public static final String f14631b;
    public static final String f14632c;
    public static final String d;

    static {
        String str = e2.d0.f7888a;
        f14630a = Integer.toString(0, 36);
        f14631b = Integer.toString(1, 36);
        f14632c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14630a);
        bundle.getBoolean(f14631b, false);
        bundle.getBoolean(f14632c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
