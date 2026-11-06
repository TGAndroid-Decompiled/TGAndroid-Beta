package c4;

import a8.ia;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import f3.p;
import f3.q;
import f3.z;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
public final class h implements f3.o {
    public final m f5278a;
    public final u f5279b;
    public final ArrayList f5280c;
    public j0 f5282f;
    public int f5283g;
    public int h;
    public long[] f5284i;
    public long f5285j;
    public byte[] f5281e = m0.f14113b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.f5278a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.f10563r = s0.n("application/x-media3-cues");
            a10.f10555j = uVar.f10615s;
            a10.P = mVar.P();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.f5279b = uVar2;
        this.f5280c = new ArrayList();
        this.h = 0;
        this.f5284i = m0.f14114c;
        this.f5285j = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        return true;
    }

    @Override
    public final void c(q qVar) {
        boolean z9;
        if (this.h == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        j0 O1 = qVar.O1(0, 3);
        this.f5282f = O1;
        u uVar = this.f5279b;
        if (uVar != null) {
            O1.g(uVar);
            qVar.U0();
            qVar.f(new z(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override
    public final void d(long j3, long j10) {
        boolean z9;
        int i7 = this.h;
        if (i7 != 0 && i7 != 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        this.f5285j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.h.f(f3.p, f3.s):int");
    }

    public final void g(g gVar) {
        this.f5282f.getClass();
        byte[] bArr = gVar.f5277b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f5282f.b(length, xVar);
        this.f5282f.c(gVar.f5276a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f5278a.reset();
        this.h = 5;
    }

    @Override
    public final f3.o a() {
        return this;
    }
}
