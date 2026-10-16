package l2;

import b2.j0;
import b2.m1;
import b2.o1;
import b2.p0;
import b2.p1;
import e2.m0;
import java.util.List;
import v7.u6;
public final class e extends p1 {
    public final long e;
    public final long f14496f;
    public final long f14497g;
    public final int h;
    public final long f14498i;
    public final long f14499j;
    public final long f14500k;
    public final m2.c f14501l;
    public final p0 f14502m;
    public final j0 f14503n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, p0 p0Var, j0 j0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (j0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z11 == z10);
        this.e = j10;
        this.f14496f = j11;
        this.f14497g = j12;
        this.h = i10;
        this.f14498i = j13;
        this.f14499j = j14;
        this.f14500k = j15;
        this.f14501l = cVar;
        this.f14502m = p0Var;
        this.f14503n = j0Var;
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
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        String str;
        u6.j(i10, h());
        Integer num = null;
        m2.c cVar = this.f14501l;
        if (z10) {
            str = cVar.b(i10).f15081a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        m1Var.getClass();
        m1Var.h(str, num, 0, cVar.d(i10), m0.S(cVar.b(i10).f15082b - cVar.b(0).f15082b) - this.f14498i, b2.c.f2090c, false);
        return m1Var;
    }

    @Override
    public final int h() {
        return this.f14501l.f15065m.size();
    }

    @Override
    public final Object l(int i10) {
        u6.j(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override
    public final o1 m(int i10, o1 o1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        h d;
        u6.j(i10, 1);
        m2.c cVar = this.f14501l;
        boolean z13 = cVar.d;
        long j13 = this.f14500k;
        if (z13 && cVar.e != -9223372036854775807L && cVar.f15057b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.f14499j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = o1.f2253q;
                    if (!cVar.d && cVar.e != j11 && cVar.f15057b == j11) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    o1Var.b(obj, this.f14502m, cVar, this.e, this.f14496f, this.f14497g, true, z12, this.f14503n, j13, this.f14499j, 0, h() - 1, this.f14498i);
                    return o1Var;
                }
            }
            long j15 = this.f14498i + j13;
            long d10 = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f15065m.size() - 1 && j15 >= d10) {
                j15 -= d10;
                i11++;
                d10 = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f15083c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((m2.a) list.get(i12)).f15050b == 2) {
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
            if (i12 != -1 && (d = ((m2.m) ((m2.a) b10.f15083c.get(i12)).f15051c.get(0)).d()) != null && d.w(d10) != j12) {
                j13 = (d.a(d.n(j15, d10)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = o1.f2253q;
        if (!cVar.d) {
        }
        z12 = z11;
        o1Var.b(obj2, this.f14502m, cVar, this.e, this.f14496f, this.f14497g, true, z12, this.f14503n, j13, this.f14499j, 0, h() - 1, this.f14498i);
        return o1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
