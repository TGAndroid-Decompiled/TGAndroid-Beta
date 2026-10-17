package m4;

import android.os.Bundle;
import android.os.SystemClock;
import v7.u6;
public final class s1 {
    public static final String e;
    public static final String f16720f;
    public static final String f16721g;
    public static final String h;
    public final int f16722a;
    public final Bundle f16723b;
    public final long f16724c;
    public final q1 d;

    static {
        String str = e2.m0.f8254a;
        e = Integer.toString(0, 36);
        f16720f = Integer.toString(1, 36);
        f16721g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public s1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static s1 a(Bundle bundle) {
        q1 q1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle o10 = e2.m0.o(bundle.getBundle(f16720f));
        long j10 = bundle.getLong(f16721g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i11 = bundle2.getInt(q1.d, 1000);
            String string = bundle2.getString(q1.e, "");
            Bundle o11 = e2.m0.o(bundle2.getBundle(q1.f16679f));
            if (o11 == null) {
                o11 = Bundle.EMPTY;
            }
            q1Var = new q1(string, i11, o11);
        } else if (i10 != 0) {
            q1Var = new q1(i10);
        } else {
            q1Var = null;
        }
        q1 q1Var2 = q1Var;
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        return new s1(i10, o10, j10, q1Var2);
    }

    public s1(int i10, Bundle bundle, long j10, q1 q1Var) {
        u6.g(q1Var == null || i10 < 0);
        this.f16722a = i10;
        this.f16723b = new Bundle(bundle);
        this.f16724c = j10;
        if (q1Var == null && i10 < 0) {
            q1Var = new q1(i10);
        }
        this.d = q1Var;
    }
}
