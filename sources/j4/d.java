package j4;
public final class d implements b1 {
    public final b1 f13433a;
    public boolean f13434b;
    public final e f13435c;

    public d(e eVar, b1 b1Var) {
        this.f13435c = eVar;
        this.f13433a = b1Var;
    }

    @Override
    public final void a() {
        this.f13433a.a();
    }

    @Override
    public final boolean f() {
        if (!this.f13435c.a() && this.f13433a.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j10) {
        if (this.f13435c.a()) {
            return -3;
        }
        return this.f13433a.j(j10);
    }

    @Override
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        e eVar = this.f13435c;
        if (eVar.a()) {
            return -3;
        }
        if (this.f13434b) {
            iVar.setFlags(4);
            return -4;
        }
        int l10 = this.f13433a.l(u0Var, iVar, i9);
        if (l10 == -5) {
            h3.t0 t0Var = u0Var.f9778b;
            t0Var.getClass();
            int i10 = t0Var.S;
            int i11 = t0Var.R;
            if (i11 == 0 && i10 == 0) {
                return -5;
            }
            if (eVar.f13439e != 0) {
                i11 = 0;
            }
            if (eVar.f13440f != Long.MIN_VALUE) {
                i10 = 0;
            }
            h3.s0 a2 = t0Var.a();
            a2.E = i11;
            a2.F = i10;
            u0Var.f9778b = new h3.t0(a2);
            return -5;
        }
        long j10 = eVar.f13440f;
        if (j10 != Long.MIN_VALUE && ((l10 == -4 && iVar.d >= j10) || (l10 == -3 && eVar.v() == Long.MIN_VALUE && !iVar.f14609c))) {
            iVar.clear();
            iVar.setFlags(4);
            this.f13434b = true;
            return -4;
        }
        return l10;
    }
}
