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
    public final m f5281a;
    public final u f5282b;
    public final ArrayList f5283c;
    public j0 f5285f;
    public int f5286g;
    public int h;
    public long[] f5287i;
    public long f5288j;
    public byte[] f5284e = m0.f14115b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.f5281a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.f10568r = s0.n("application/x-media3-cues");
            a10.f10560j = uVar.f10620s;
            a10.P = mVar.P();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.f5282b = uVar2;
        this.f5283c = new ArrayList();
        this.h = 0;
        this.f5287i = m0.f14116c;
        this.f5288j = -9223372036854775807L;
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
        this.f5285f = O1;
        u uVar = this.f5282b;
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
        this.f5288j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r21, f3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.h.f(f3.p, f3.s):int");
    }

    public final void g(g gVar) {
        this.f5285f.getClass();
        byte[] bArr = gVar.f5280b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f5285f.b(length, xVar);
        this.f5285f.c(gVar.f5279a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f5281a.reset();
        this.h = 5;
    }

    @Override
    public final f3.o a() {
        return this;
    }
}
