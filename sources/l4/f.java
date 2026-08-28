package l4;

import h3.u0;
import j4.a1;
import j4.b1;
import j4.h0;
public final class f implements b1 {
    public final h f16667a;
    public final a1 f16668b;
    public final int f16669c;
    public boolean d;
    public final h f16670e;

    public f(h hVar, h hVar2, a1 a1Var, int i9) {
        this.f16670e = hVar;
        this.f16667a = hVar2;
        this.f16668b = a1Var;
        this.f16669c = i9;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f16670e;
            h0 h0Var = hVar.h;
            int[] iArr = hVar.f16672b;
            int i9 = this.f16669c;
            h0Var.b(iArr[i9], hVar.f16673c[i9], 0, null, hVar.F);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        h hVar = this.f16670e;
        if (!hVar.t() && this.f16668b.u(hVar.I)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j10) {
        h hVar = this.f16670e;
        if (hVar.t()) {
            return 0;
        }
        boolean z10 = hVar.I;
        a1 a1Var = this.f16668b;
        int s10 = a1Var.s(j10, z10);
        a aVar = hVar.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(this.f16669c + 1) - a1Var.q());
        }
        a1Var.E(s10);
        if (s10 > 0) {
            b();
        }
        return s10;
    }

    @Override
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        h hVar = this.f16670e;
        if (!hVar.t()) {
            a aVar = hVar.H;
            a1 a1Var = this.f16668b;
            if (aVar != null && aVar.d(this.f16669c + 1) <= a1Var.q()) {
                return -3;
            }
            b();
            return a1Var.z(u0Var, iVar, i9, hVar.I);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
