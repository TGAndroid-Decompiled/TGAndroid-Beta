package j4;

public final class c implements b1 {

    public final b1 f12530a;

    public boolean f12531b;

    public final d f12532c;

    public c(d dVar, b1 b1Var) {
        this.f12532c = dVar;
        this.f12530a = b1Var;
    }

    @Override
    public final void a() {
        this.f12530a.a();
    }

    @Override
    public final boolean e() {
        return !this.f12532c.c() && this.f12530a.e();
    }

    @Override
    public final int f(long j10) {
        if (this.f12532c.c()) {
            return -3;
        }
        return this.f12530a.f(j10);
    }

    @Override
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        d dVar = this.f12532c;
        if (dVar.c()) {
            return -3;
        }
        if (this.f12531b) {
            iVar.setFlags(4);
            return -4;
        }
        int i11 = this.f12530a.i(u0Var, iVar, i10);
        if (i11 != -5) {
            long j10 = dVar.f12537f;
            if (j10 == Long.MIN_VALUE || ((i11 != -4 || iVar.d < j10) && !(i11 == -3 && dVar.D() == Long.MIN_VALUE && !iVar.f14430c))) {
                return i11;
            }
            iVar.clear();
            iVar.setFlags(4);
            this.f12531b = true;
            return -4;
        }
        h3.t0 t0Var = u0Var.f8207b;
        t0Var.getClass();
        int i12 = t0Var.S;
        int i13 = t0Var.R;
        if (i13 == 0 && i12 == 0) {
            return -5;
        }
        if (dVar.f12536e != 0) {
            i13 = 0;
        }
        if (dVar.f12537f != Long.MIN_VALUE) {
            i12 = 0;
        }
        h3.s0 s0VarA = t0Var.a();
        s0VarA.E = i13;
        s0VarA.F = i12;
        u0Var.f8207b = new h3.t0(s0VarA);
        return -5;
    }
}
