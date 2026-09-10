package m4;

import android.os.Bundle;
public final class n {
    public static final String f13450a;
    public static final String f13451b;
    public static final String f13452c;
    public static final String d;

    static {
        String str = e2.d0.f7188a;
        f13450a = Integer.toString(0, 36);
        f13451b = Integer.toString(1, 36);
        f13452c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f13450a);
        bundle.getBoolean(f13451b, false);
        bundle.getBoolean(f13452c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
