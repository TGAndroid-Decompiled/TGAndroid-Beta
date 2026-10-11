package m4;

import android.os.Bundle;
public final class n {
    public static final String f16240a;
    public static final String f16241b;
    public static final String f16242c;
    public static final String d;

    static {
        String str = e2.d0.f8531a;
        f16240a = Integer.toString(0, 36);
        f16241b = Integer.toString(1, 36);
        f16242c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16240a);
        bundle.getBoolean(f16241b, false);
        bundle.getBoolean(f16242c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
