package j4;

import android.net.Uri;
import h3.p2;
import h3.r2;
import h3.s2;
import java.util.Collections;
import java.util.List;

public final class h1 extends s2 {

    public static final Object f12566y = new Object();

    public final long f12567b;

    public final long f12568c;
    public final long d;

    public final long f12569e;

    public final long f12570f;
    public final long h;

    public final boolean f12571n;

    public final boolean f12572r;

    public final boolean f12573s;
    public final Object v;

    public final h3.f1 f12574w;

    public final h3.b1 f12575x;

    static {
        h3.x0 x0Var = new h3.x0();
        p8.x xVar = p8.z.f45604b;
        p8.l0 l0Var = p8.l0.f45555e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.f45555e;
        h3.d1 d1Var = h3.d1.f7806c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new h3.c1(uri, null, list, l0Var2);
        }
        new h3.z0(x0Var);
        h3.h1 h1Var = h3.h1.U;
    }

    public h1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, o4.c cVar, h3.f1 f1Var, h3.b1 b1Var) {
        this.f12567b = j10;
        this.f12568c = j11;
        this.d = j12;
        this.f12569e = j13;
        this.f12570f = j14;
        this.h = j15;
        this.f12571n = z10;
        this.f12572r = z11;
        this.f12573s = z12;
        this.v = cVar;
        f1Var.getClass();
        this.f12574w = f1Var;
        this.f12575x = b1Var;
    }

    @Override
    public final int b(Object obj) {
        return f12566y.equals(obj) ? 0 : -1;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        d5.a.h(i10, 1);
        Object obj = z10 ? f12566y : null;
        long j10 = -this.f12570f;
        p2Var.getClass();
        p2Var.h(null, obj, 0, this.d, j10, k4.b.f14448f, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        d5.a.h(i10, 1);
        return f12566y;
    }

    @Override
    public final r2 m(int i10, r2 r2Var, long j10) {
        long j11;
        d5.a.h(i10, 1);
        long j12 = this.h;
        boolean z10 = this.f12572r;
        if (!z10 || this.f12573s || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f12569e;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        r2Var.b(r2.D, this.f12574w, this.v, this.f12567b, this.f12568c, -9223372036854775807L, this.f12571n, z10, this.f12575x, j11, this.f12569e, 0, 0, this.f12570f);
        return r2Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
