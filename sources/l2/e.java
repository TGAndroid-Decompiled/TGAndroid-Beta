package l2;

import b2.e0;
import b2.h1;
import b2.j1;
import b2.k0;
import b2.k1;
import e2.d0;
import java.util.List;
public final class e extends k1 {
    public final long f15257e;
    public final long f15258f;
    public final long f15259g;
    public final int h;
    public final long f15260i;
    public final long f15261j;
    public final long f15262k;
    public final m2.c f15263l;
    public final k0 f15264m;
    public final e0 f15265n;

    public e(long j3, long j10, long j11, int i10, long j12, long j13, long j14, m2.c cVar, k0 k0Var, e0 e0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (e0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z11 == z10);
        this.f15257e = j3;
        this.f15258f = j10;
        this.f15259g = j11;
        this.h = i10;
        this.f15260i = j12;
        this.f15261j = j13;
        this.f15262k = j14;
        this.f15263l = cVar;
        this.f15264m = k0Var;
        this.f15265n = e0Var;
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
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        String str;
        e2.d.c(i10, h());
        Integer num = null;
        m2.c cVar = this.f15263l;
        if (z10) {
            str = cVar.b(i10).f16009a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        h1Var.getClass();
        h1Var.h(str, num, 0, cVar.d(i10), d0.Q(cVar.b(i10).f16010b - cVar.b(0).f16010b) - this.f15260i, b2.b.f3160c, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f15263l.f15991m.size();
    }

    @Override
    public final Object l(int i10) {
        e2.d.c(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override
    public final j1 m(int i10, j1 j1Var, long j3) {
        long j10;
        boolean z10;
        long j11;
        i c10;
        e2.d.c(i10, 1);
        m2.c cVar = this.f15263l;
        boolean z11 = cVar.d;
        long j12 = this.f15262k;
        if (z11 && cVar.f15984e != -9223372036854775807L && cVar.f15982b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.f15261j) {
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    Object obj = j1.f3291q;
                    if (!cVar.d && cVar.f15984e != j10 && cVar.f15982b == j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j1Var.b(obj, this.f15264m, cVar, this.f15257e, this.f15258f, this.f15259g, true, z10, this.f15265n, j12, this.f15261j, 0, h() - 1, this.f15260i);
                    return j1Var;
                }
            }
            long j14 = this.f15260i + j12;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f15991m.size() - 1 && j14 >= d) {
                j14 -= d;
                i11++;
                d = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f16011c;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j11 = j13;
                    if (((m2.a) list.get(i12)).f15974b == 2) {
                        break;
                    }
                    i12++;
                    j13 = j11;
                } else {
                    j11 = j13;
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1 && (c10 = ((m2.m) ((m2.a) b10.f16011c.get(i12)).f15975c.get(0)).c()) != null && c10.p0(d) != j11) {
                j12 = (c10.a(c10.H(j14, d)) + j12) - j14;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        Object obj2 = j1.f3291q;
        if (!cVar.d) {
        }
        z10 = false;
        j1Var.b(obj2, this.f15264m, cVar, this.f15257e, this.f15258f, this.f15259g, true, z10, this.f15265n, j12, this.f15261j, 0, h() - 1, this.f15260i);
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
