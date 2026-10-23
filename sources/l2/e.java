package l2;

import b2.i0;
import b2.l1;
import b2.n1;
import b2.o0;
import b2.o1;
import e2.m0;
import java.util.List;
import v7.u6;
public final class e extends o1 {
    public final long e;
    public final long f15897f;
    public final long f15898g;
    public final int h;
    public final long f15899i;
    public final long f15900j;
    public final long f15901k;
    public final m2.c f15902l;
    public final o0 f15903m;
    public final i0 f15904n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, o0 o0Var, i0 i0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (i0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z11 == z10);
        this.e = j10;
        this.f15897f = j11;
        this.f15898g = j12;
        this.h = i10;
        this.f15899i = j13;
        this.f15900j = j14;
        this.f15901k = j15;
        this.f15902l = cVar;
        this.f15903m = o0Var;
        this.f15904n = i0Var;
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
    public final l1 f(int i10, l1 l1Var, boolean z10) {
        String str;
        u6.j(i10, h());
        Integer num = null;
        m2.c cVar = this.f15902l;
        if (z10) {
            str = cVar.b(i10).f16503a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        l1Var.getClass();
        l1Var.h(str, num, 0, cVar.d(i10), m0.S(cVar.b(i10).f16504b - cVar.b(0).f16504b) - this.f15899i, b2.c.f3708c, false);
        return l1Var;
    }

    @Override
    public final int h() {
        return this.f15902l.f16487m.size();
    }

    @Override
    public final Object l(int i10) {
        u6.j(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override
    public final n1 m(int i10, n1 n1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        i d;
        u6.j(i10, 1);
        m2.c cVar = this.f15902l;
        boolean z13 = cVar.d;
        long j13 = this.f15901k;
        if (z13 && cVar.e != -9223372036854775807L && cVar.f16479b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.f15900j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = n1.f3865q;
                    if (!cVar.d && cVar.e != j11 && cVar.f16479b == j11) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    n1Var.b(obj, this.f15903m, cVar, this.e, this.f15897f, this.f15898g, true, z12, this.f15904n, j13, this.f15900j, 0, h() - 1, this.f15899i);
                    return n1Var;
                }
            }
            long j15 = this.f15899i + j13;
            long d10 = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f16487m.size() - 1 && j15 >= d10) {
                j15 -= d10;
                i11++;
                d10 = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f16505c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((m2.a) list.get(i12)).f16472b == 2) {
                        break;
                    }
                    i12++;
                    j14 = j12;
                } else {
                    j12 = j14;
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1 && (d = ((m2.m) ((m2.a) b10.f16505c.get(i12)).f16473c.get(0)).d()) != null && d.A(d10) != j12) {
                j13 = (d.b(d.n(j15, d10)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = n1.f3865q;
        if (!cVar.d) {
        }
        z12 = z11;
        n1Var.b(obj2, this.f15903m, cVar, this.e, this.f15897f, this.f15898g, true, z12, this.f15904n, j13, this.f15900j, 0, h() - 1, this.f15899i);
        return n1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
