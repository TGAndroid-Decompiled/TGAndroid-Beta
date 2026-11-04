package n2;

import b8.zb;
import d2.h0;
import d2.k1;
import d2.m1;
import d2.n0;
import d2.n1;
import java.util.List;
public final class e extends n1 {
    public final long f20148e;
    public final long f20149f;
    public final long f20150g;
    public final int h;
    public final long f20151i;
    public final long f20152j;
    public final long f20153k;
    public final o2.c f20154l;
    public final n0 f20155m;
    public final h0 f20156n;

    public e(long j10, long j11, long j12, int i3, long j13, long j14, long j15, o2.c cVar, n0 n0Var, h0 h0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (h0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z11 == z10);
        this.f20148e = j10;
        this.f20149f = j11;
        this.f20150g = j12;
        this.h = i3;
        this.f20151i = j13;
        this.f20152j = j14;
        this.f20153k = j15;
        this.f20154l = cVar;
        this.f20155m = n0Var;
        this.f20156n = h0Var;
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
    public final k1 f(int i3, k1 k1Var, boolean z10) {
        String str;
        zb.j(i3, h());
        Integer num = null;
        o2.c cVar = this.f20154l;
        if (z10) {
            str = cVar.b(i3).f20540a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i3);
        }
        k1Var.getClass();
        k1Var.h(str, num, 0, cVar.d(i3), g2.n0.S(cVar.b(i3).f20541b - cVar.b(0).f20541b) - this.f20151i, d2.c.f8039c, false);
        return k1Var;
    }

    @Override
    public final int h() {
        return this.f20154l.f20522m.size();
    }

    @Override
    public final Object l(int i3) {
        zb.j(i3, h());
        return Integer.valueOf(this.h + i3);
    }

    @Override
    public final m1 m(int i3, m1 m1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        i c2;
        zb.j(i3, 1);
        o2.c cVar = this.f20154l;
        boolean z13 = cVar.d;
        long j13 = this.f20153k;
        if (z13 && cVar.f20515e != -9223372036854775807L && cVar.f20513b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.f20152j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = m1.f8199q;
                    if (!cVar.d && cVar.f20515e != j11 && cVar.f20513b == j11) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    m1Var.b(obj, this.f20155m, cVar, this.f20148e, this.f20149f, this.f20150g, true, z12, this.f20156n, j13, this.f20152j, 0, h() - 1, this.f20151i);
                    return m1Var;
                }
            }
            long j15 = this.f20151i + j13;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f20522m.size() - 1 && j15 >= d) {
                j15 -= d;
                i10++;
                d = cVar.d(i10);
            }
            o2.h b10 = cVar.b(i10);
            List list = b10.f20542c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j12 = j14;
                    if (((o2.a) list.get(i11)).f20505b == 2) {
                        break;
                    }
                    i11++;
                    j14 = j12;
                } else {
                    j12 = j14;
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1 && (c2 = ((o2.m) ((o2.a) b10.f20542c.get(i11)).f20506c.get(0)).c()) != null && c2.H(d) != j12) {
                j13 = (c2.b(c2.s(j15, d)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = m1.f8199q;
        if (!cVar.d) {
        }
        z12 = z11;
        m1Var.b(obj2, this.f20155m, cVar, this.f20148e, this.f20149f, this.f20150g, true, z12, this.f20156n, j13, this.f20152j, 0, h() - 1, this.f20151i);
        return m1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
