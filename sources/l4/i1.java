package l4;

import android.net.Uri;
import j3.p2;
import j3.r2;
import java.util.Collections;
import java.util.List;
public final class i1 extends r2 {
    public static final Object f14330y = new Object();
    public final long f14331b;
    public final long f14332c;
    public final long d;
    public final long f14333e;
    public final long f14334f;
    public final long h;
    public final boolean f14335n;
    public final boolean f14336r;
    public final boolean f14337s;
    public final Object v;
    public final j3.f1 f14338w;
    public final j3.b1 f14339x;

    static {
        j3.x0 x0Var = new j3.x0();
        q8.x xVar = q8.z.f46511b;
        q8.l0 l0Var = q8.l0.f46462e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.f46462e;
        j3.d1 d1Var = j3.d1.f10413c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new j3.c1(uri, null, null, list, null, l0Var2, null);
        }
        new j3.y0(x0Var);
        j3.h1 h1Var = j3.h1.U;
    }

    public i1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, q4.c cVar, j3.f1 f1Var, j3.b1 b1Var) {
        this.f14331b = j10;
        this.f14332c = j11;
        this.d = j12;
        this.f14333e = j13;
        this.f14334f = j14;
        this.h = j15;
        this.f14335n = z10;
        this.f14336r = z11;
        this.f14337s = z12;
        this.v = cVar;
        f1Var.getClass();
        this.f14338w = f1Var;
        this.f14339x = b1Var;
    }

    @Override
    public final int b(Object obj) {
        if (f14330y.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        Object obj;
        f5.a.h(i10, 1);
        if (z10) {
            obj = f14330y;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        p2Var.getClass();
        m4.c cVar = m4.c.f16848f;
        p2Var.h(null, obj2, 0, this.d, -this.f14334f, cVar, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        f5.a.h(i10, 1);
        return f14330y;
    }

    @Override
    public final j3.q2 m(int r25, j3.q2 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: l4.i1.m(int, j3.q2, long):j3.q2");
    }

    @Override
    public final int o() {
        return 1;
    }
}
