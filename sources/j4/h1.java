package j4;

import android.net.Uri;
import h3.p2;
import h3.r2;
import java.util.Collections;
import java.util.List;
public final class h1 extends r2 {
    public static final Object f13467y = new Object();
    public final long f13468b;
    public final long f13469c;
    public final long d;
    public final long f13470e;
    public final long f13471f;
    public final long h;
    public final boolean f13472n;
    public final boolean f13473r;
    public final boolean f13474s;
    public final Object v;
    public final h3.f1 f13475w;
    public final h3.b1 f13476x;

    static {
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.f19105b;
        o8.l0 l0Var = o8.l0.f19056e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.f19056e;
        h3.d1 d1Var = h3.d1.f9375c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new h3.c1(uri, null, null, list, null, l0Var2, null);
        }
        new h3.y0(x0Var);
        h3.h1 h1Var = h3.h1.U;
    }

    public h1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, o4.c cVar, h3.f1 f1Var, h3.b1 b1Var) {
        this.f13468b = j10;
        this.f13469c = j11;
        this.d = j12;
        this.f13470e = j13;
        this.f13471f = j14;
        this.h = j15;
        this.f13472n = z10;
        this.f13473r = z11;
        this.f13474s = z12;
        this.v = cVar;
        f1Var.getClass();
        this.f13475w = f1Var;
        this.f13476x = b1Var;
    }

    @Override
    public final int b(Object obj) {
        if (f13467y.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        Object obj;
        d5.a.h(i9, 1);
        if (z10) {
            obj = f13467y;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        p2Var.getClass();
        k4.b bVar = k4.b.f14627f;
        p2Var.h(null, obj2, 0, this.d, -this.f13471f, bVar, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i9) {
        d5.a.h(i9, 1);
        return f13467y;
    }

    @Override
    public final h3.q2 m(int r25, h3.q2 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: j4.h1.m(int, h3.q2, long):h3.q2");
    }

    @Override
    public final int o() {
        return 1;
    }
}
