package o4;

import android.net.Uri;
import j3.c1;
import j3.e1;
import j3.m2;
import j3.o2;
import j3.w0;
import j3.x0;
import j3.y0;
import j3.z0;
import java.util.Collections;
import java.util.List;
public final class r0 extends o2 {
    public static final Object f16407y = new Object();
    public final long f16408b;
    public final long f16409c;
    public final long d;
    public final long e;
    public final long f16410f;
    public final long h;
    public final boolean f16411n;
    public final boolean f16412r;
    public final boolean f16413s;
    public final Object v;
    public final c1 f16414w;
    public final x0 f16415x;

    static {
        boolean z4;
        w0 w0Var;
        j3.s0 s0Var = new j3.s0();
        j3.v0 v0Var = new j3.v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        z0 z0Var = z0.f8896c;
        Uri uri = Uri.EMPTY;
        if (v0Var.f8852b != null && v0Var.f8851a == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        if (uri != null) {
            if (v0Var.f8851a != null) {
                w0Var = new w0(v0Var);
            } else {
                w0Var = null;
            }
            new y0(uri, null, w0Var, null, list, null, i0Var, null);
        }
        new j3.t0(s0Var);
        e1 e1Var = e1.V;
    }

    public r0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z4, boolean z10, boolean z11, t4.c cVar, c1 c1Var, x0 x0Var) {
        this.f16408b = j10;
        this.f16409c = j11;
        this.d = j12;
        this.e = j13;
        this.f16410f = j14;
        this.h = j15;
        this.f16411n = z4;
        this.f16412r = z10;
        this.f16413s = z11;
        this.v = cVar;
        c1Var.getClass();
        this.f16414w = c1Var;
        this.f16415x = x0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f16407y.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        Object obj;
        h5.a.h(i10, 1);
        if (z4) {
            obj = f16407y;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        m2Var.getClass();
        p4.b bVar = p4.b.f41043f;
        m2Var.i(null, obj2, 0, this.d, -this.f16410f, bVar, false);
        return m2Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        h5.a.h(i10, 1);
        return f16407y;
    }

    @Override
    public final j3.n2 m(int r25, j3.n2 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: o4.r0.m(int, j3.n2, long):j3.n2");
    }

    @Override
    public final int o() {
        return 1;
    }
}
