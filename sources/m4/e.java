package m4;

import d5.g0;
import h3.b1;
import h3.f1;
import h3.p2;
import h3.r2;
import h3.s2;
import java.util.List;

public final class e extends s2 {

    public final long f17667b;

    public final long f17668c;
    public final long d;

    public final int f17669e;

    public final long f17670f;
    public final long h;

    public final long f17671n;

    public final n4.c f17672r;

    public final f1 f17673s;
    public final b1 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, n4.c cVar, f1 f1Var, b1 b1Var) {
        d5.a.i(cVar.d == (b1Var != null));
        this.f17667b = j10;
        this.f17668c = j11;
        this.d = j12;
        this.f17669e = i10;
        this.f17670f = j13;
        this.h = j14;
        this.f17671n = j15;
        this.f17672r = cVar;
        this.f17673s = f1Var;
        this.v = b1Var;
    }

    @Override
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f17669e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        d5.a.h(i10, h());
        n4.c cVar = this.f17672r;
        String str = z10 ? cVar.b(i10).f18244a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f17669e + i10) : null;
        long jD = cVar.d(i10);
        long jH = g0.H(cVar.b(i10).f18245b - cVar.b(0).f18245b) - this.f17670f;
        p2Var.getClass();
        p2Var.h(str, numValueOf, 0, jD, jH, k4.b.f14448f, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return this.f17672r.f18227m.size();
    }

    @Override
    public final Object l(int i10) {
        d5.a.h(i10, h());
        return Integer.valueOf(this.f17669e + i10);
    }

    @Override
    public final r2 m(int i10, r2 r2Var, long j10) {
        long j11;
        boolean z10;
        long j12;
        h hVarC;
        d5.a.h(i10, 1);
        n4.c cVar = this.f17672r;
        boolean z11 = cVar.d;
        long jA = this.f17671n;
        if (z11 && cVar.f18220e != -9223372036854775807L && cVar.f18218b == -9223372036854775807L) {
            long j13 = 0;
            if (j10 > 0) {
                jA += j10;
                if (jA > this.h) {
                    jA = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                }
                Object obj = r2.D;
                if (cVar.d || cVar.f18220e == j11 || cVar.f18218b != j11) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                r2Var.b(obj, this.f17673s, cVar, this.f17667b, this.f17668c, this.d, true, z10, this.v, jA, this.h, 0, h() - 1, this.f17670f);
                return r2Var;
            }
            long j14 = this.f17670f + jA;
            long jD = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f18227m.size() - 1 && j14 >= jD) {
                j14 -= jD;
                i11++;
                jD = cVar.d(i11);
            }
            n4.h hVarB = cVar.b(i11);
            List list = hVarB.f18246c;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j12 = j13;
                    i12 = -1;
                    break;
                }
                j12 = j13;
                if (((n4.a) list.get(i12)).f18210b == 2) {
                    break;
                }
                i12++;
                j13 = j12;
            }
            if (i12 != -1 && (hVarC = ((n4.m) ((n4.a) hVarB.f18246c.get(i12)).f18211c.get(0)).c()) != null && hVarC.F(jD) != j12) {
                jA = (hVarC.a(hVarC.y(j14, jD)) + jA) - j14;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        Object obj2 = r2.D;
        if (cVar.d) {
            z10 = false;
        } else {
            z10 = false;
        }
        r2Var.b(obj2, this.f17673s, cVar, this.f17667b, this.f17668c, this.d, true, z10, this.v, jA, this.h, 0, h() - 1, this.f17670f);
        return r2Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
