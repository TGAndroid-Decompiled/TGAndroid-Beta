package m4;

import android.os.Bundle;
public final class n {
    public static final String f16182a;
    public static final String f16183b;
    public static final String f16184c;
    public static final String d;

    static {
        String str = e2.d0.f8532a;
        f16182a = Integer.toString(0, 36);
        f16183b = Integer.toString(1, 36);
        f16184c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16182a);
        bundle.getBoolean(f16183b, false);
        bundle.getBoolean(f16184c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
