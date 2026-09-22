package m4;

import android.os.Bundle;
public final class n {
    public static final String f14855a;
    public static final String f14856b;
    public static final String f14857c;
    public static final String d;

    static {
        String str = e2.d0.f7887a;
        f14855a = Integer.toString(0, 36);
        f14856b = Integer.toString(1, 36);
        f14857c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14855a);
        bundle.getBoolean(f14856b, false);
        bundle.getBoolean(f14857c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
