package c4;

import a8.la;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import f3.p;
import f3.q;
import f3.y;
import h2.l0;
import h2.x;
import h9.g0;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
public final class h implements f3.o {
    public final m f4413a;
    public final u f4414b;
    public final ArrayList f4415c;
    public i0 f4417f;
    public int f4418g;
    public int h;
    public long[] f4419i;
    public long f4420j;
    public byte[] f4416e = l0.f13816b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.f4413a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.f10746r = s0.n("application/x-media3-cues");
            a10.f10738j = uVar.f10798s;
            a10.P = mVar.y();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.f4414b = uVar2;
        this.f4415c = new ArrayList();
        this.h = 0;
        this.f4419i = l0.f13817c;
        this.f4420j = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        return true;
    }

    @Override
    public final void c(q qVar) {
        boolean z10;
        if (this.h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        i0 d2 = qVar.d2(0, 3);
        this.f4417f = d2;
        u uVar = this.f4414b;
        if (uVar != null) {
            d2.g(uVar);
            qVar.d1();
            qVar.j(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        boolean z10;
        int i7 = this.h;
        if (i7 != 0 && i7 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        this.f4420j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.h.f(f3.p, f3.s):int");
    }

    public final void g(g gVar) {
        this.f4417f.getClass();
        byte[] bArr = gVar.f4412b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f4417f.b(length, xVar);
        this.f4417f.c(gVar.f4411a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f4413a.reset();
        this.h = 5;
    }

    @Override
    public final f3.o a() {
        return this;
    }
}
