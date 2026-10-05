package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class k1 {
    public static final String f16232e;
    public static final String f16233f;
    public static final String f16234g;
    public static final String h;
    public final int f16235a;
    public final Bundle f16236b;
    public final long f16237c;
    public final i1 d;

    static {
        String str = e2.d0.f8538a;
        f16232e = Integer.toString(0, 36);
        f16233f = Integer.toString(1, 36);
        f16234g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public k1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static k1 a(Bundle bundle) {
        i1 i1Var;
        int i10 = bundle.getInt(f16232e, -1);
        Bundle bundle2 = bundle.getBundle(f16233f);
        long j3 = bundle.getLong(f16234g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(i1.d, 1000);
            String string = bundle3.getString(i1.f16191e, "");
            Bundle bundle4 = bundle3.getBundle(i1.f16192f);
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
        this.f16235a = i10;
        this.f16236b = new Bundle(bundle);
        this.f16237c = j3;
        if (i1Var == null && i10 < 0) {
            i1Var = new i1(i10);
        }
        this.d = i1Var;
    }
}
