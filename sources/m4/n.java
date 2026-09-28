package m4;

import android.os.Bundle;
public final class n {
    public static final String f14900a;
    public static final String f14901b;
    public static final String f14902c;
    public static final String d;

    static {
        String str = e2.d0.f7870a;
        f14900a = Integer.toString(0, 36);
        f14901b = Integer.toString(1, 36);
        f14902c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14900a);
        bundle.getBoolean(f14901b, false);
        bundle.getBoolean(f14902c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
