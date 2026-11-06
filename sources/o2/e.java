package o2;

import a8.ia;
import e2.f0;
import e2.i1;
import e2.k1;
import e2.l0;
import e2.l1;
import h2.m0;
import java.util.List;
public final class e extends l1 {
    public final long f20726e;
    public final long f20727f;
    public final long f20728g;
    public final int h;
    public final long f20729i;
    public final long f20730j;
    public final long f20731k;
    public final p2.c f20732l;
    public final l0 f20733m;
    public final f0 f20734n;

    public e(long j3, long j10, long j11, int i7, long j12, long j13, long j14, p2.c cVar, l0 l0Var, f0 f0Var) {
        boolean z9;
        boolean z10 = cVar.d;
        if (f0Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z10 == z9);
        this.f20726e = j3;
        this.f20727f = j10;
        this.f20728g = j11;
        this.h = i7;
        this.f20729i = j12;
        this.f20730j = j13;
        this.f20731k = j14;
        this.f20732l = cVar;
        this.f20733m = l0Var;
        this.f20734n = f0Var;
    }

    @Override
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.h) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override
    public final i1 f(int i7, i1 i1Var, boolean z9) {
        String str;
        ia.j(i7, h());
        Integer num = null;
        p2.c cVar = this.f20732l;
        if (z9) {
            str = cVar.b(i7).f53032a;
        } else {
            str = null;
        }
        if (z9) {
            num = Integer.valueOf(this.h + i7);
        }
        i1Var.getClass();
        i1Var.h(str, num, 0, cVar.d(i7), m0.S(cVar.b(i7).f53033b - cVar.b(0).f53033b) - this.f20729i, e2.c.f10190c, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f20732l.f53014m.size();
    }

    @Override
    public final Object l(int i7) {
        ia.j(i7, h());
        return Integer.valueOf(this.h + i7);
    }

    @Override
    public final k1 m(int i7, k1 k1Var, long j3) {
        boolean z9;
        long j10;
        boolean z10;
        boolean z11;
        long j11;
        i c10;
        ia.j(i7, 1);
        p2.c cVar = this.f20732l;
        boolean z12 = cVar.d;
        long j12 = this.f20731k;
        if (z12 && cVar.f53007e != -9223372036854775807L && cVar.f53005b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.f20730j) {
                    z9 = true;
                    z10 = false;
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    Object obj = k1.f10315q;
                    if (!cVar.d && cVar.f53007e != j10 && cVar.f53005b == j10) {
                        z11 = z9;
                    } else {
                        z11 = z10;
                    }
                    k1Var.b(obj, this.f20733m, cVar, this.f20726e, this.f20727f, this.f20728g, true, z11, this.f20734n, j12, this.f20730j, 0, h() - 1, this.f20729i);
                    return k1Var;
                }
            }
            long j14 = this.f20729i + j12;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f53014m.size() - 1 && j14 >= d) {
                j14 -= d;
                i10++;
                d = cVar.d(i10);
            }
            p2.h b10 = cVar.b(i10);
            List list = b10.f53034c;
            z9 = true;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j11 = j13;
                    if (((p2.a) list.get(i11)).f52997b == 2) {
                        break;
                    }
                    i11++;
                    j13 = j11;
                } else {
                    j11 = j13;
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1 && (c10 = ((p2.m) ((p2.a) b10.f53034c.get(i11)).f52998c.get(0)).c()) != null && c10.x(d) != j11) {
                j12 = (c10.a(c10.o(j14, d)) + j12) - j14;
            }
        } else {
            z9 = true;
            j10 = -9223372036854775807L;
        }
        z10 = false;
        Object obj2 = k1.f10315q;
        if (!cVar.d) {
        }
        z11 = z10;
        k1Var.b(obj2, this.f20733m, cVar, this.f20726e, this.f20727f, this.f20728g, true, z11, this.f20734n, j12, this.f20730j, 0, h() - 1, this.f20729i);
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
