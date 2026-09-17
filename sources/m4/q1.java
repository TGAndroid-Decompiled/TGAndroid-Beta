package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class q1 {
    public static final String e;
    public static final String f14672f;
    public static final String f14673g;
    public static final String h;
    public final int f14674a;
    public final Bundle f14675b;
    public final long f14676c;
    public final o1 d;

    static {
        String str = e2.d0.f7888a;
        e = Integer.toString(0, 36);
        f14672f = Integer.toString(1, 36);
        f14673g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public q1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static q1 a(Bundle bundle) {
        o1 o1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f14672f);
        long j3 = bundle.getLong(f14673g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(o1.d, 1000);
            String string = bundle3.getString(o1.e, "");
            Bundle bundle4 = bundle3.getBundle(o1.f14642f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            o1Var = new o1(string, i11, bundle4);
        } else if (i10 != 0) {
            o1Var = new o1(i10);
        } else {
            o1Var = null;
        }
        o1 o1Var2 = o1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new q1(i10, bundle2, j3, o1Var2);
    }

    public q1(int i10, Bundle bundle, long j3, o1 o1Var) {
        e2.d.b(o1Var == null || i10 < 0);
        this.f14674a = i10;
        this.f14675b = new Bundle(bundle);
        this.f14676c = j3;
        if (o1Var == null && i10 < 0) {
            o1Var = new o1(i10);
        }
        this.d = o1Var;
    }
}
