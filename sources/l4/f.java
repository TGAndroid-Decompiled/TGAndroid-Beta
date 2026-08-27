package l4;

import h3.u0;
import j4.a1;
import j4.b1;
import j4.g0;

public final class f implements b1 {

    public final h f15424a;

    public final a1 f15425b;

    public final int f15426c;
    public boolean d;

    public final h f15427e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.f15427e = hVar;
        this.f15424a = hVar2;
        this.f15425b = a1Var;
        this.f15426c = i10;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        h hVar = this.f15427e;
        g0 g0Var = hVar.h;
        int[] iArr = hVar.f15429b;
        int i10 = this.f15426c;
        g0Var.b(iArr[i10], hVar.f15430c[i10], 0, null, hVar.F);
        this.d = true;
    }

    @Override
    public final boolean e() {
        h hVar = this.f15427e;
        return !hVar.r() && this.f15425b.u(hVar.I);
    }

    @Override
    public final int f(long j10) throws Throwable {
        h hVar = this.f15427e;
        if (hVar.r()) {
            return 0;
        }
        boolean z10 = hVar.I;
        a1 a1Var = this.f15425b;
        int iS = a1Var.s(j10, z10);
        a aVar = hVar.H;
        if (aVar != null) {
            iS = Math.min(iS, aVar.d(this.f15426c + 1) - a1Var.q());
        }
        a1Var.E(iS);
        if (iS > 0) {
            b();
        }
        return iS;
    }

    @Override
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        h hVar = this.f15427e;
        if (hVar.r()) {
            return -3;
        }
        a aVar = hVar.H;
        a1 a1Var = this.f15425b;
        if (aVar != null && aVar.d(this.f15426c + 1) <= a1Var.q()) {
            return -3;
        }
        b();
        return a1Var.z(u0Var, iVar, i10, hVar.I);
    }

    @Override
    public final void a() {
    }
}
