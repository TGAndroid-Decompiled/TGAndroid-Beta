package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class l1 {
    public static final String f16170e;
    public static final String f16171f;
    public static final String f16172g;
    public static final String h;
    public final int f16173a;
    public final Bundle f16174b;
    public final long f16175c;
    public final j1 d;

    static {
        String str = e2.d0.f8532a;
        f16170e = Integer.toString(0, 36);
        f16171f = Integer.toString(1, 36);
        f16172g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public l1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static l1 a(Bundle bundle) {
        j1 j1Var;
        int i10 = bundle.getInt(f16170e, -1);
        Bundle bundle2 = bundle.getBundle(f16171f);
        long j3 = bundle.getLong(f16172g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(j1.d, 1000);
            String string = bundle3.getString(j1.f16123e, "");
            Bundle bundle4 = bundle3.getBundle(j1.f16124f);
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
        this.f16173a = i10;
        this.f16174b = new Bundle(bundle);
        this.f16175c = j3;
        if (j1Var == null && i10 < 0) {
            j1Var = new j1(i10);
        }
        this.d = j1Var;
    }
}
