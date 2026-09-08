package m4;

import android.os.Bundle;
public final class n {
    public static final String f16033a;
    public static final String f16034b;
    public static final String f16035c;
    public static final String d;

    static {
        String str = e2.d0.f8765a;
        f16033a = Integer.toString(0, 36);
        f16034b = Integer.toString(1, 36);
        f16035c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16033a);
        bundle.getBoolean(f16034b, false);
        bundle.getBoolean(f16035c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
