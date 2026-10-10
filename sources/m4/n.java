package m4;

import android.os.Bundle;
public final class n {
    public static final String f16186a;
    public static final String f16187b;
    public static final String f16188c;
    public static final String d;

    static {
        String str = e2.d0.f8532a;
        f16186a = Integer.toString(0, 36);
        f16187b = Integer.toString(1, 36);
        f16188c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16186a);
        bundle.getBoolean(f16187b, false);
        bundle.getBoolean(f16188c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
