package j4;

import h3.r2;
import h3.s2;
import java.util.ArrayList;

public final class g extends l1 {

    public final long f12551l;

    public final long f12552m;

    public final boolean f12553n;

    public final boolean f12554o;

    public final boolean f12555p;

    public final ArrayList f12556q;

    public final r2 f12557r;

    public e f12558s;

    public f f12559t;

    public long f12560u;
    public long v;

    public g(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        aVar.getClass();
        d5.a.f(j10 >= 0);
        this.f12551l = j10;
        this.f12552m = j11;
        this.f12553n = z10;
        this.f12554o = z11;
        this.f12555p = z12;
        this.f12556q = new ArrayList();
        this.f12557r = new r2();
    }

    public final void A(s2 s2Var) {
        long j10;
        long j11;
        long j12;
        r2 r2Var = this.f12557r;
        s2Var.n(0, r2Var);
        long j13 = r2Var.C;
        e eVar = this.f12558s;
        long j14 = this.f12552m;
        ArrayList arrayList = this.f12556q;
        if (eVar == null || arrayList.isEmpty() || this.f12554o) {
            boolean z10 = this.f12555p;
            j10 = this.f12551l;
            if (z10) {
                long j15 = r2Var.f8121x;
                j10 += j15;
                j11 = j15 + j14;
            } else {
                j11 = j14;
            }
            this.f12560u = j13 + j10;
            this.v = j14 != Long.MIN_VALUE ? j13 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.f12560u;
                long j17 = this.v;
                dVar.f12536e = j16;
                dVar.f12537f = j17;
            }
            j12 = j11;
        } else {
            j10 = this.f12560u - j13;
            j12 = j14 != Long.MIN_VALUE ? this.v - j13 : Long.MIN_VALUE;
        }
        try {
            e eVar2 = new e(s2Var, j10, j12);
            this.f12558s = eVar2;
            m(eVar2);
        } catch (f e9) {
            this.f12559t = e9;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f12559t;
            }
        }
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        d dVar = new d(this.f12614k.b(c0Var, rVar, j10), this.f12553n, this.f12560u, this.v);
        this.f12556q.add(dVar);
        return dVar;
    }

    @Override
    public final void j() throws f {
        f fVar = this.f12559t;
        if (fVar != null) {
            throw fVar;
        }
        super.j();
    }

    @Override
    public final void n(z zVar) {
        ArrayList arrayList = this.f12556q;
        d5.a.i(arrayList.remove(zVar));
        this.f12614k.n(((d) zVar).f12533a);
        if (!arrayList.isEmpty() || this.f12554o) {
            return;
        }
        e eVar = this.f12558s;
        eVar.getClass();
        A(eVar.f12623b);
    }

    @Override
    public final void p() {
        super.p();
        this.f12559t = null;
        this.f12558s = null;
    }

    @Override
    public final void y(s2 s2Var) {
        if (this.f12559t != null) {
            return;
        }
        A(s2Var);
    }
}
