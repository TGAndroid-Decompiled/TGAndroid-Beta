package m4;

import android.os.Bundle;
public final class n {
    public static final String f14620a;
    public static final String f14621b;
    public static final String f14622c;
    public static final String d;

    static {
        String str = e2.d0.f7883a;
        f14620a = Integer.toString(0, 36);
        f14621b = Integer.toString(1, 36);
        f14622c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14620a);
        bundle.getBoolean(f14621b, false);
        bundle.getBoolean(f14622c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
