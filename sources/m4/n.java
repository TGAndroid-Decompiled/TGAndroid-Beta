package m4;

import android.os.Bundle;
public final class n {
    public static final String f15926a;
    public static final String f15927b;
    public static final String f15928c;
    public static final String d;

    static {
        String str = e2.d0.f8529a;
        f15926a = Integer.toString(0, 36);
        f15927b = Integer.toString(1, 36);
        f15928c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f15926a);
        bundle.getBoolean(f15927b, false);
        bundle.getBoolean(f15928c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
