package m4;

import android.os.Bundle;
public final class n {
    public static final String f14885a;
    public static final String f14886b;
    public static final String f14887c;
    public static final String d;

    static {
        String str = e2.d0.f7870a;
        f14885a = Integer.toString(0, 36);
        f14886b = Integer.toString(1, 36);
        f14887c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14885a);
        bundle.getBoolean(f14886b, false);
        bundle.getBoolean(f14887c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
