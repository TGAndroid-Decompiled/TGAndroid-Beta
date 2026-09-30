package m4;

import android.os.Bundle;
public final class n {
    public static final String f14916a;
    public static final String f14917b;
    public static final String f14918c;
    public static final String d;

    static {
        String str = e2.d0.f7882a;
        f14916a = Integer.toString(0, 36);
        f14917b = Integer.toString(1, 36);
        f14918c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f14916a);
        bundle.getBoolean(f14917b, false);
        bundle.getBoolean(f14918c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
