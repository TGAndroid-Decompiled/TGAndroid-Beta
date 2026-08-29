package n4;

import j3.u0;
import l4.b1;
import l4.c1;
import l4.g0;
public final class f implements c1 {
    public final h f17134a;
    public final b1 f17135b;
    public final int f17136c;
    public boolean d;
    public final h f17137e;

    public f(h hVar, h hVar2, b1 b1Var, int i10) {
        this.f17137e = hVar;
        this.f17134a = hVar2;
        this.f17135b = b1Var;
        this.f17136c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f17137e;
            g0 g0Var = hVar.h;
            int[] iArr = hVar.f17139b;
            int i10 = this.f17136c;
            g0Var.b(iArr[i10], hVar.f17140c[i10], 0, null, hVar.F);
            this.d = true;
        }
    }

    @Override
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        h hVar = this.f17137e;
        if (!hVar.t()) {
            a aVar = hVar.H;
            b1 b1Var = this.f17135b;
            if (aVar != null && aVar.d(this.f17136c + 1) <= b1Var.q()) {
                return -3;
            }
            b();
            return b1Var.z(u0Var, iVar, i10, hVar.I);
        }
        return -3;
    }

    @Override
    public final boolean e() {
        h hVar = this.f17137e;
        if (!hVar.t() && this.f17135b.u(hVar.I)) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        h hVar = this.f17137e;
        if (hVar.t()) {
            return 0;
        }
        boolean z10 = hVar.I;
        b1 b1Var = this.f17135b;
        int s10 = b1Var.s(j10, z10);
        a aVar = hVar.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(this.f17136c + 1) - b1Var.q());
        }
        b1Var.E(s10);
        if (s10 > 0) {
            b();
        }
        return s10;
    }

    @Override
    public final void a() {
    }
}
