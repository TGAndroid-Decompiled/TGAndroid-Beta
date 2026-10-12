package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class m1 {
    public static final String f15919e;
    public static final String f15920f;
    public static final String f15921g;
    public static final String h;
    public final int f15922a;
    public final Bundle f15923b;
    public final long f15924c;
    public final k1 d;

    static {
        String str = e2.d0.f8529a;
        f15919e = Integer.toString(0, 36);
        f15920f = Integer.toString(1, 36);
        f15921g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public m1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static m1 a(Bundle bundle) {
        k1 k1Var;
        int i10 = bundle.getInt(f15919e, -1);
        Bundle bundle2 = bundle.getBundle(f15920f);
        long j3 = bundle.getLong(f15921g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(k1.d, 1000);
            String string = bundle3.getString(k1.f15873e, "");
            Bundle bundle4 = bundle3.getBundle(k1.f15874f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            k1Var = new k1(string, i11, bundle4);
        } else if (i10 != 0) {
            k1Var = new k1(i10);
        } else {
            k1Var = null;
        }
        k1 k1Var2 = k1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new m1(i10, bundle2, j3, k1Var2);
    }

    public m1(int i10, Bundle bundle, long j3, k1 k1Var) {
        e2.d.b(k1Var == null || i10 < 0);
        this.f15922a = i10;
        this.f15923b = new Bundle(bundle);
        this.f15924c = j3;
        if (k1Var == null && i10 < 0) {
            k1Var = new k1(i10);
        }
        this.d = k1Var;
    }
}
