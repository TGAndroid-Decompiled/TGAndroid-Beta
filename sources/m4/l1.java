package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class l1 {
    public static final String f16174e;
    public static final String f16175f;
    public static final String f16176g;
    public static final String h;
    public final int f16177a;
    public final Bundle f16178b;
    public final long f16179c;
    public final j1 d;

    static {
        String str = e2.d0.f8532a;
        f16174e = Integer.toString(0, 36);
        f16175f = Integer.toString(1, 36);
        f16176g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public l1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static l1 a(Bundle bundle) {
        j1 j1Var;
        int i10 = bundle.getInt(f16174e, -1);
        Bundle bundle2 = bundle.getBundle(f16175f);
        long j3 = bundle.getLong(f16176g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(j1.d, 1000);
            String string = bundle3.getString(j1.f16127e, "");
            Bundle bundle4 = bundle3.getBundle(j1.f16128f);
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
        this.f16177a = i10;
        this.f16178b = new Bundle(bundle);
        this.f16179c = j3;
        if (j1Var == null && i10 < 0) {
            j1Var = new j1(i10);
        }
        this.d = j1Var;
    }
}
