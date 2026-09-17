package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class p1 {
    public static final String f16073e;
    public static final String f16074f;
    public static final String f16075g;
    public static final String h;
    public final int f16076a;
    public final Bundle f16077b;
    public final long f16078c;
    public final n1 d;

    static {
        String str = e2.d0.f8765a;
        f16073e = Integer.toString(0, 36);
        f16074f = Integer.toString(1, 36);
        f16075g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public p1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static p1 a(Bundle bundle) {
        n1 n1Var;
        int i10 = bundle.getInt(f16073e, -1);
        Bundle bundle2 = bundle.getBundle(f16074f);
        long j3 = bundle.getLong(f16075g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(n1.d, 1000);
            String string = bundle3.getString(n1.f16038e, "");
            Bundle bundle4 = bundle3.getBundle(n1.f16039f);
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
        this.f16076a = i10;
        this.f16077b = new Bundle(bundle);
        this.f16078c = j3;
        if (n1Var == null && i10 < 0) {
            n1Var = new n1(i10);
        }
        this.d = n1Var;
    }
}
