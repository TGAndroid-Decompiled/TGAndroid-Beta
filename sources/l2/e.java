package l2;

import b2.j0;
import b2.l1;
import b2.n1;
import b2.o1;
import b2.p0;
import e2.l0;
import java.util.List;
import v7.t6;
public final class e extends o1 {
    public final long e;
    public final long f11578f;
    public final long f11579g;
    public final int h;
    public final long f11580i;
    public final long f11581j;
    public final long f11582k;
    public final m2.c f11583l;
    public final p0 f11584m;
    public final j0 f11585n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, p0 p0Var, j0 j0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (j0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z11 == z10);
        this.e = j10;
        this.f11578f = j11;
        this.f11579g = j12;
        this.h = i10;
        this.f11580i = j13;
        this.f11581j = j14;
        this.f11582k = j15;
        this.f11583l = cVar;
        this.f11584m = p0Var;
        this.f11585n = j0Var;
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
        t6.j(i10, h());
        Integer num = null;
        m2.c cVar = this.f11583l;
        if (z10) {
            str = cVar.b(i10).f12655a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        l1Var.getClass();
        l1Var.h(str, num, 0, cVar.d(i10), l0.S(cVar.b(i10).f12656b - cVar.b(0).f12656b) - this.f11580i, b2.c.f1990c, false);
        return l1Var;
    }

    @Override
    public final int h() {
        return this.f11583l.f12639m.size();
    }

    @Override
    public final Object l(int i10) {
        t6.j(i10, h());
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
        t6.j(i10, 1);
        m2.c cVar = this.f11583l;
        boolean z13 = cVar.d;
        long j13 = this.f11582k;
        if (z13 && cVar.e != -9223372036854775807L && cVar.f12631b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.f11581j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = n1.f2128q;
                    if (!cVar.d && cVar.e != j11 && cVar.f12631b == j11) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    n1Var.b(obj, this.f11584m, cVar, this.e, this.f11578f, this.f11579g, true, z12, this.f11585n, j13, this.f11581j, 0, h() - 1, this.f11580i);
                    return n1Var;
                }
            }
            long j15 = this.f11580i + j13;
            long d10 = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f12639m.size() - 1 && j15 >= d10) {
                j15 -= d10;
                i11++;
                d10 = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f12657c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((m2.a) list.get(i12)).f12624b == 2) {
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
            if (i12 != -1 && (d = ((m2.m) ((m2.a) b10.f12657c.get(i12)).f12625c.get(0)).d()) != null && d.z(d10) != j12) {
                j13 = (d.a(d.o(j15, d10)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = n1.f2128q;
        if (!cVar.d) {
        }
        z12 = z11;
        n1Var.b(obj2, this.f11584m, cVar, this.e, this.f11578f, this.f11579g, true, z12, this.f11585n, j13, this.f11581j, 0, h() - 1, this.f11580i);
        return n1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
