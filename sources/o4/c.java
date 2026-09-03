package o4;
public final class c implements l0 {
    public final l0 f16448a;
    public boolean f16449b;
    public final d f16450c;

    public c(d dVar, l0 l0Var) {
        this.f16450c = dVar;
        this.f16448a = l0Var;
    }

    @Override
    public final void a() {
        this.f16448a.a();
    }

    @Override
    public final boolean h() {
        if (!this.f16450c.c() && this.f16448a.h()) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j10) {
        if (this.f16450c.c()) {
            return -3;
        }
        return this.f16448a.l(j10);
    }

    @Override
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        d dVar = this.f16450c;
        if (dVar.c()) {
            return -3;
        }
        if (this.f16449b) {
            iVar.f15195b = 4;
            return -4;
        }
        long r10 = dVar.r();
        int p10 = this.f16448a.p(bVar, iVar, i10);
        if (p10 == -5) {
            j3.n0 n0Var = (j3.n0) bVar.f6121c;
            n0Var.getClass();
            int i11 = n0Var.T;
            int i12 = n0Var.S;
            if (i12 == 0 && i11 == 0) {
                return -5;
            }
            if (dVar.f16456e != 0) {
                i12 = 0;
            }
            if (dVar.f16457f != Long.MIN_VALUE) {
                i11 = 0;
            }
            j3.m0 a2 = n0Var.a();
            a2.E = i12;
            a2.F = i11;
            bVar.f6121c = new j3.n0(a2);
            return -5;
        }
        long j10 = dVar.f16457f;
        if (j10 != Long.MIN_VALUE && ((p10 == -4 && iVar.f15218f >= j10) || (p10 == -3 && r10 == Long.MIN_VALUE && !iVar.f15217e))) {
            iVar.b();
            iVar.f15195b = 4;
            this.f16449b = true;
            return -4;
        }
        return p10;
    }
}
