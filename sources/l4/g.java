package l4;

import j3.q2;
import j3.r2;
import java.util.ArrayList;
public final class g extends m1 {
    public final long f14309l;
    public final long f14310m;
    public final boolean f14311n;
    public final boolean f14312o;
    public final boolean f14313p;
    public final ArrayList f14314q;
    public final q2 f14315r;
    public e f14316s;
    public f f14317t;
    public long f14318u;
    public long v;

    public g(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        boolean z13;
        aVar.getClass();
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        f5.a.f(z13);
        this.f14309l = j10;
        this.f14310m = j11;
        this.f14311n = z10;
        this.f14312o = z11;
        this.f14313p = z12;
        this.f14314q = new ArrayList();
        this.f14315r = new q2();
    }

    public final void A(r2 r2Var) {
        long j10;
        long j11;
        long j12;
        q2 q2Var = this.f14315r;
        r2Var.n(0, q2Var);
        long j13 = q2Var.C;
        e eVar = this.f14316s;
        long j14 = this.f14310m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f14314q;
        if (eVar != null && !arrayList.isEmpty() && !this.f14312o) {
            j10 = this.f14318u - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.v - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f14313p;
            j10 = this.f14309l;
            if (z10) {
                long j16 = q2Var.f10704x;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.f14318u = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.v = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.f14318u;
                long j18 = this.v;
                dVar.f14295e = j17;
                dVar.f14296f = j18;
            }
            j12 = j11;
        }
        try {
            e eVar2 = new e(r2Var, j10, j12);
            this.f14316s = eVar2;
            m(eVar2);
        } catch (f e10) {
            this.f14317t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f14317t;
            }
        }
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        d dVar = new d(this.f14381k.b(c0Var, rVar, j10), this.f14311n, this.f14318u, this.v);
        this.f14314q.add(dVar);
        return dVar;
    }

    @Override
    public final void j() {
        f fVar = this.f14317t;
        if (fVar == null) {
            super.j();
            return;
        }
        throw fVar;
    }

    @Override
    public final void n(z zVar) {
        ArrayList arrayList = this.f14314q;
        f5.a.i(arrayList.remove(zVar));
        this.f14381k.n(((d) zVar).f14292a);
        if (arrayList.isEmpty() && !this.f14312o) {
            e eVar = this.f14316s;
            eVar.getClass();
            A(eVar.f14382b);
        }
    }

    @Override
    public final void p() {
        super.p();
        this.f14317t = null;
        this.f14316s = null;
    }

    @Override
    public final void y(r2 r2Var) {
        if (this.f14317t != null) {
            return;
        }
        A(r2Var);
    }
}
