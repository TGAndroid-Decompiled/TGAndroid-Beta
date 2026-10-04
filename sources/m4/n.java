package m4;

import android.os.Bundle;
public final class n {
    public static final String f16260a;
    public static final String f16261b;
    public static final String f16262c;
    public static final String d;

    static {
        String str = e2.d0.f8537a;
        f16260a = Integer.toString(0, 36);
        f16261b = Integer.toString(1, 36);
        f16262c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16260a);
        bundle.getBoolean(f16261b, false);
        bundle.getBoolean(f16262c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
