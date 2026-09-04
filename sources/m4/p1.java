package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class p1 {
    public static final String f16046e;
    public static final String f16047f;
    public static final String f16048g;
    public static final String h;
    public final int f16049a;
    public final Bundle f16050b;
    public final long f16051c;
    public final n1 d;

    static {
        String str = e2.d0.f8737a;
        f16046e = Integer.toString(0, 36);
        f16047f = Integer.toString(1, 36);
        f16048g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public p1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static p1 a(Bundle bundle) {
        n1 n1Var;
        int i10 = bundle.getInt(f16046e, -1);
        Bundle bundle2 = bundle.getBundle(f16047f);
        long j3 = bundle.getLong(f16048g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(n1.d, 1000);
            String string = bundle3.getString(n1.f16011e, "");
            Bundle bundle4 = bundle3.getBundle(n1.f16012f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            n1Var = new n1(string, i11, bundle4);
        } else if (i10 != 0) {
            n1Var = new n1(i10);
        } else {
            n1Var = null;
        }
        n1 n1Var2 = n1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new p1(i10, bundle2, j3, n1Var2);
    }

    public p1(int i10, Bundle bundle, long j3, n1 n1Var) {
        e2.d.b(n1Var == null || i10 < 0);
        this.f16049a = i10;
        this.f16050b = new Bundle(bundle);
        this.f16051c = j3;
        if (n1Var == null && i10 < 0) {
            n1Var = new n1(i10);
        }
        this.d = n1Var;
    }
}
