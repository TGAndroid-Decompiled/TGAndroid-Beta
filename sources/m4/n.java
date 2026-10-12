package m4;

import android.os.Bundle;
public final class n {
    public static final String f15925a;
    public static final String f15926b;
    public static final String f15927c;
    public static final String d;

    static {
        String str = e2.d0.f8529a;
        f15925a = Integer.toString(0, 36);
        f15926b = Integer.toString(1, 36);
        f15927c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f15925a);
        bundle.getBoolean(f15926b, false);
        bundle.getBoolean(f15927c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
