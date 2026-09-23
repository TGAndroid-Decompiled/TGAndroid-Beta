package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class l1 {
    public static final String e;
    public static final String f14621f;
    public static final String f14622g;
    public static final String h;
    public final int f14623a;
    public final Bundle f14624b;
    public final long f14625c;
    public final j1 d;

    static {
        String str = e2.d0.f7871a;
        e = Integer.toString(0, 36);
        f14621f = Integer.toString(1, 36);
        f14622g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public l1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static l1 a(Bundle bundle) {
        j1 j1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f14621f);
        long j3 = bundle.getLong(f14622g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(j1.d, 1000);
            String string = bundle3.getString(j1.e, "");
            Bundle bundle4 = bundle3.getBundle(j1.f14577f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            j1Var = new j1(string, i11, bundle4);
        } else if (i10 != 0) {
            j1Var = new j1(i10);
        } else {
            j1Var = null;
        }
        j1 j1Var2 = j1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new l1(i10, bundle2, j3, j1Var2);
    }

    public l1(int i10, Bundle bundle, long j3, j1 j1Var) {
        e2.d.b(j1Var == null || i10 < 0);
        this.f14623a = i10;
        this.f14624b = new Bundle(bundle);
        this.f14625c = j3;
        if (j1Var == null && i10 < 0) {
            j1Var = new j1(i10);
        }
        this.d = j1Var;
    }
}
