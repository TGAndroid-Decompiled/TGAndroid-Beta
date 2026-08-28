package j4;

import h3.q2;
import h3.r2;
import java.util.ArrayList;
public final class h extends l1 {
    public final long f13454l;
    public final long f13455m;
    public final boolean f13456n;
    public final boolean f13457o;
    public final boolean f13458p;
    public final ArrayList f13459q;
    public final q2 f13460r;
    public f f13461s;
    public g f13462t;
    public long f13463u;
    public long v;

    public h(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        boolean z13;
        aVar.getClass();
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        d5.a.f(z13);
        this.f13454l = j10;
        this.f13455m = j11;
        this.f13456n = z10;
        this.f13457o = z11;
        this.f13458p = z12;
        this.f13459q = new ArrayList();
        this.f13460r = new q2();
    }

    public final void A(r2 r2Var) {
        long j10;
        long j11;
        long j12;
        q2 q2Var = this.f13460r;
        r2Var.n(0, q2Var);
        long j13 = q2Var.C;
        f fVar = this.f13461s;
        long j14 = this.f13455m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f13459q;
        if (fVar != null && !arrayList.isEmpty() && !this.f13457o) {
            j10 = this.f13463u - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.v - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f13458p;
            j10 = this.f13454l;
            if (z10) {
                long j16 = q2Var.f9667x;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.f13463u = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.v = j15;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                e eVar = (e) arrayList.get(i9);
                long j17 = this.f13463u;
                long j18 = this.v;
                eVar.f13439e = j17;
                eVar.f13440f = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(r2Var, j10, j12);
            this.f13461s = fVar2;
            m(fVar2);
        } catch (g e10) {
            this.f13462t = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((e) arrayList.get(i10)).h = this.f13462t;
            }
        }
    }

    @Override
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        e eVar = new e(this.f13504k.b(d0Var, rVar, j10), this.f13456n, this.f13463u, this.v);
        this.f13459q.add(eVar);
        return eVar;
    }

    @Override
    public final void j() {
        g gVar = this.f13462t;
        if (gVar == null) {
            super.j();
            return;
        }
        throw gVar;
    }

    @Override
    public final void n(a0 a0Var) {
        ArrayList arrayList = this.f13459q;
        d5.a.i(arrayList.remove(a0Var));
        this.f13504k.n(((e) a0Var).f13436a);
        if (arrayList.isEmpty() && !this.f13457o) {
            f fVar = this.f13461s;
            fVar.getClass();
            A(fVar.f13526b);
        }
    }

    @Override
    public final void p() {
        super.p();
        this.f13462t = null;
        this.f13461s = null;
    }

    @Override
    public final void y(r2 r2Var) {
        if (this.f13462t != null) {
            return;
        }
        A(r2Var);
    }
}
