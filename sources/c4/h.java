package c4;

import a8.ma;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import f3.p;
import f3.q;
import f3.z;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.ArrayList;
import java.util.List;
public final class h implements f3.o {
    public final m f4376a;
    public final u f4377b;
    public final ArrayList f4378c;
    public j0 f4380f;
    public int f4381g;
    public int h;
    public long[] f4382i;
    public long f4383j;
    public byte[] f4379e = l0.f13779b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.f4376a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.f10707r = s0.n("application/x-media3-cues");
            a10.f10699j = uVar.f10759s;
            a10.P = mVar.N();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.f4377b = uVar2;
        this.f4378c = new ArrayList();
        this.h = 0;
        this.f4382i = l0.f13780c;
        this.f4383j = -9223372036854775807L;
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
        ma.p(z10);
        j0 d2 = qVar.d2(0, 3);
        this.f4380f = d2;
        u uVar = this.f4377b;
        if (uVar != null) {
            d2.g(uVar);
            qVar.Z0();
            qVar.h(new z(-9223372036854775807L, new long[]{0}, new long[]{0}));
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
        ma.p(z10);
        this.f4383j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.h.f(f3.p, f3.s):int");
    }

    public final void g(g gVar) {
        this.f4380f.getClass();
        byte[] bArr = gVar.f4375b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f4380f.b(length, xVar);
        this.f4380f.c(gVar.f4374a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f4376a.reset();
        this.h = 5;
    }

    @Override
    public final f3.o a() {
        return this;
    }
}
