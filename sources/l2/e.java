package l2;

import a8.yb;
import b2.j0;
import b2.m1;
import b2.o1;
import b2.p0;
import b2.p1;
import e2.n0;
import java.util.List;
public final class e extends p1 {
    public final long e;
    public final long f16800f;
    public final long f16801g;
    public final int h;
    public final long f16802i;
    public final long f16803j;
    public final long f16804k;
    public final m2.c f16805l;
    public final p0 f16806m;
    public final j0 f16807n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, p0 p0Var, j0 j0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (j0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z11 == z10);
        this.e = j10;
        this.f16800f = j11;
        this.f16801g = j12;
        this.h = i10;
        this.f16802i = j13;
        this.f16803j = j14;
        this.f16804k = j15;
        this.f16805l = cVar;
        this.f16806m = p0Var;
        this.f16807n = j0Var;
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
        yb.j(i10, h());
        Integer num = null;
        m2.c cVar = this.f16805l;
        if (z10) {
            str = cVar.b(i10).f17960a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        m1Var.getClass();
        m1Var.h(str, num, 0, cVar.d(i10), n0.S(cVar.b(i10).f17961b - cVar.b(0).f17961b) - this.f16802i, b2.c.f3153c, false);
        return m1Var;
    }

    @Override
    public final int h() {
        return this.f16805l.f17944m.size();
    }

    @Override
    public final Object l(int i10) {
        yb.j(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override
    public final o1 m(int i10, o1 o1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        h c10;
        yb.j(i10, 1);
        m2.c cVar = this.f16805l;
        boolean z13 = cVar.d;
        long j13 = this.f16804k;
        if (z13 && cVar.e != -9223372036854775807L && cVar.f17936b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.f16803j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = o1.f3316q;
                    if (!cVar.d && cVar.e != j11 && cVar.f17936b == j11) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    o1Var.b(obj, this.f16806m, cVar, this.e, this.f16800f, this.f16801g, true, z12, this.f16807n, j13, this.f16803j, 0, h() - 1, this.f16802i);
                    return o1Var;
                }
            }
            long j15 = this.f16802i + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f17944m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f17962c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((m2.a) list.get(i12)).f17929b == 2) {
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
            if (i12 != -1 && (c10 = ((m2.m) ((m2.a) b10.f17962c.get(i12)).f17930c.get(0)).c()) != null && c10.V(d) != j12) {
                j13 = (c10.a(c10.t(j15, d)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = o1.f3316q;
        if (!cVar.d) {
        }
        z12 = z11;
        o1Var.b(obj2, this.f16806m, cVar, this.e, this.f16800f, this.f16801g, true, z12, this.f16807n, j13, this.f16803j, 0, h() - 1, this.f16802i);
        return o1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
