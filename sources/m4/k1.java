package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class k1 {
    public static final String f16223e;
    public static final String f16224f;
    public static final String f16225g;
    public static final String h;
    public final int f16226a;
    public final Bundle f16227b;
    public final long f16228c;
    public final i1 d;

    static {
        String str = e2.d0.f8537a;
        f16223e = Integer.toString(0, 36);
        f16224f = Integer.toString(1, 36);
        f16225g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public k1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static k1 a(Bundle bundle) {
        i1 i1Var;
        int i10 = bundle.getInt(f16223e, -1);
        Bundle bundle2 = bundle.getBundle(f16224f);
        long j3 = bundle.getLong(f16225g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(i1.d, 1000);
            String string = bundle3.getString(i1.f16182e, "");
            Bundle bundle4 = bundle3.getBundle(i1.f16183f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            i1Var = new i1(string, i11, bundle4);
        } else if (i10 != 0) {
            i1Var = new i1(i10);
        } else {
            i1Var = null;
        }
        i1 i1Var2 = i1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new k1(i10, bundle2, j3, i1Var2);
    }

    public k1(int i10, Bundle bundle, long j3, i1 i1Var) {
        e2.d.b(i1Var == null || i10 < 0);
        this.f16226a = i10;
        this.f16227b = new Bundle(bundle);
        this.f16228c = j3;
        if (i1Var == null && i10 < 0) {
            i1Var = new i1(i10);
        }
        this.d = i1Var;
    }
}
