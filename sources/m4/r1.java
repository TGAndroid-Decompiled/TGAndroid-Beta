package m4;

import android.os.Bundle;
import android.os.SystemClock;
public final class r1 {
    public static final String e;
    public static final String f13503f;
    public static final String f13504g;
    public static final String h;
    public final int f13505a;
    public final Bundle f13506b;
    public final long f13507c;
    public final p1 d;

    static {
        String str = e2.d0.f7188a;
        e = Integer.toString(0, 36);
        f13503f = Integer.toString(1, 36);
        f13504g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public r1(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static r1 a(Bundle bundle) {
        p1 p1Var;
        int i10 = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f13503f);
        long j3 = bundle.getLong(f13504g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        if (bundle3 != null) {
            int i11 = bundle3.getInt(p1.d, 1000);
            String string = bundle3.getString(p1.e, "");
            Bundle bundle4 = bundle3.getBundle(p1.f13473f);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            p1Var = new p1(string, i11, bundle4);
        } else if (i10 != 0) {
            p1Var = new p1(i10);
        } else {
            p1Var = null;
        }
        p1 p1Var2 = p1Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new r1(i10, bundle2, j3, p1Var2);
    }

    public r1(int i10, Bundle bundle, long j3, p1 p1Var) {
        e2.d.b(p1Var == null || i10 < 0);
        this.f13505a = i10;
        this.f13506b = new Bundle(bundle);
        this.f13507c = j3;
        if (p1Var == null && i10 < 0) {
            p1Var = new p1(i10);
        }
        this.d = p1Var;
    }
}
