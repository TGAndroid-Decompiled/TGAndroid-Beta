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
    public final m f4410a;
    public final u f4411b;
    public final ArrayList f4412c;
    public i0 f4414f;
    public int f4415g;
    public int h;
    public long[] f4416i;
    public long f4417j;
    public byte[] f4413e = l0.f13813b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.f4410a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.f10743r = s0.n("application/x-media3-cues");
            a10.f10735j = uVar.f10795s;
            a10.P = mVar.y();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.f4411b = uVar2;
        this.f4412c = new ArrayList();
        this.h = 0;
        this.f4416i = l0.f13814c;
        this.f4417j = -9223372036854775807L;
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
        this.f4414f = d2;
        u uVar = this.f4411b;
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
        this.f4417j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14032b;
        return t1.f14100e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.h.f(f3.p, f3.s):int");
    }

    public final void g(g gVar) {
        this.f4414f.getClass();
        byte[] bArr = gVar.f4409b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f4414f.b(length, xVar);
        this.f4414f.c(gVar.f4408a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f4410a.reset();
        this.h = 5;
    }

    @Override
    public final f3.o a() {
        return this;
    }
}
