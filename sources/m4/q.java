package m4;

import android.os.Bundle;
public final class q {
    public static final String f16742a;
    public static final String f16743b;
    public static final String f16744c;
    public static final String d;

    static {
        String str = e2.m0.f8259a;
        f16742a = Integer.toString(0, 36);
        f16743b = Integer.toString(1, 36);
        f16744c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    public static q a(Bundle bundle) {
        Bundle o10 = e2.m0.o(bundle.getBundle(f16742a));
        bundle.getBoolean(f16743b, false);
        bundle.getBoolean(f16744c, false);
        bundle.getBoolean(d, false);
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(o10);
        return obj;
    }
}
