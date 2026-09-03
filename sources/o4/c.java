package o4;
public final class c implements l0 {
    public final l0 f16285a;
    public boolean f16286b;
    public final d f16287c;

    public c(d dVar, l0 l0Var) {
        this.f16287c = dVar;
        this.f16285a = l0Var;
    }

    @Override
    public final void a() {
        this.f16285a.a();
    }

    @Override
    public final boolean d() {
        if (!this.f16287c.a() && this.f16285a.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final int e(long j10) {
        if (this.f16287c.a()) {
            return -3;
        }
        return this.f16285a.e(j10);
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        d dVar = this.f16287c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f16286b) {
            iVar.f14207b = 4;
            return -4;
        }
        long y12 = dVar.y1();
        int f10 = this.f16285a.f(bVar, iVar, i10);
        if (f10 == -5) {
            j3.n0 n0Var = (j3.n0) bVar.f6002c;
            n0Var.getClass();
            int i11 = n0Var.T;
            int i12 = n0Var.S;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.e != 0) {
                i12 = 0;
            }
            if (dVar.f16293f != Long.MIN_VALUE) {
                i11 = 0;
            }
            j3.m0 a2 = n0Var.a();
            a2.E = i12;
            a2.F = i11;
            bVar.f6002c = new j3.n0(a2);
            return -5;
        }
        long j10 = dVar.f16293f;
        if (j10 != Long.MIN_VALUE && ((f10 == -4 && iVar.f14227f >= j10) || (f10 == -3 && y12 == Long.MIN_VALUE && !iVar.e))) {
            iVar.b();
            iVar.f14207b = 4;
            this.f16286b = true;
            return -4;
        }
        return f10;
    }
}
