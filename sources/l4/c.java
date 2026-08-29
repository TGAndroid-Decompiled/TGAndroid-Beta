package l4;
public final class c implements c1 {
    public final c1 f14289a;
    public boolean f14290b;
    public final d f14291c;

    public c(d dVar, c1 c1Var) {
        this.f14291c = dVar;
        this.f14289a = c1Var;
    }

    @Override
    public final void a() {
        this.f14289a.a();
    }

    @Override
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        d dVar = this.f14291c;
        if (dVar.d()) {
            return -3;
        }
        if (this.f14290b) {
            iVar.setFlags(4);
            return -4;
        }
        int d = this.f14289a.d(u0Var, iVar, i10);
        if (d == -5) {
            j3.t0 t0Var = u0Var.f10815b;
            t0Var.getClass();
            int i11 = t0Var.S;
            int i12 = t0Var.R;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f14295e != 0) {
                i12 = 0;
            }
            if (dVar.f14296f != Long.MIN_VALUE) {
                i11 = 0;
            }
            j3.s0 a2 = t0Var.a();
            a2.E = i12;
            a2.F = i11;
            u0Var.f10815b = new j3.t0(a2);
            return -5;
        }
        long j10 = dVar.f14296f;
        if (j10 != Long.MIN_VALUE && ((d == -4 && iVar.d >= j10) || (d == -3 && dVar.L() == Long.MIN_VALUE && !iVar.f16829c))) {
            iVar.clear();
            iVar.setFlags(4);
            this.f14290b = true;
            return -4;
        }
        return d;
    }

    @Override
    public final boolean e() {
        if (!this.f14291c.d() && this.f14289a.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        if (this.f14291c.d()) {
            return -3;
        }
        return this.f14289a.i(j10);
    }
}
