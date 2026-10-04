package m4;

import android.os.Bundle;
public final class n {
    public static final String f16259a;
    public static final String f16260b;
    public static final String f16261c;
    public static final String d;

    static {
        String str = e2.d0.f8537a;
        f16259a = Integer.toString(0, 36);
        f16260b = Integer.toString(1, 36);
        f16261c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static n a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f16259a);
        bundle.getBoolean(f16260b, false);
        bundle.getBoolean(f16261c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
