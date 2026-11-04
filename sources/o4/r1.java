package o4;

import android.os.Bundle;
import android.os.SystemClock;
import b8.zb;
public final class r1 {
    public static final String f20840e;
    public static final String f20841f;
    public static final String f20842g;
    public static final String h;
    public final int f20843a;
    public final Bundle f20844b;
    public final long f20845c;
    public final p1 d;

    static {
        String str = g2.n0.f11873a;
        f20840e = Integer.toString(0, 36);
        f20841f = Integer.toString(1, 36);
        f20842g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public r1(int i3) {
        this(i3, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public static r1 a(Bundle bundle) {
        p1 p1Var;
        int i3 = bundle.getInt(f20840e, -1);
        Bundle o10 = g2.n0.o(bundle.getBundle(f20841f));
        long j10 = bundle.getLong(f20842g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 != null) {
            int i10 = bundle2.getInt(p1.d, 1000);
            String string = bundle2.getString(p1.f20795e, "");
            Bundle o11 = g2.n0.o(bundle2.getBundle(p1.f20796f));
            if (o11 == null) {
                o11 = Bundle.EMPTY;
            }
            p1Var = new p1(string, i10, o11);
        } else if (i3 != 0) {
            p1Var = new p1(i3);
        } else {
            p1Var = null;
        }
        p1 p1Var2 = p1Var;
        if (o10 == null) {
            o10 = Bundle.EMPTY;
        }
        return new r1(i3, o10, j10, p1Var2);
    }

    public r1(int i3, Bundle bundle, long j10, p1 p1Var) {
        zb.f(p1Var == null || i3 < 0);
        this.f20843a = i3;
        this.f20844b = new Bundle(bundle);
        this.f20845c = j10;
        if (p1Var == null && i3 < 0) {
            p1Var = new p1(i3);
        }
        this.d = p1Var;
    }
}
