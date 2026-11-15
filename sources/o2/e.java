package o2;

import a8.ja;
import e2.f0;
import e2.i1;
import e2.k1;
import e2.l0;
import e2.l1;
import java.util.List;
public final class e extends l1 {
    public final long f21250e;
    public final long f21251f;
    public final long f21252g;
    public final int h;
    public final long f21253i;
    public final long f21254j;
    public final long f21255k;
    public final p2.c f21256l;
    public final l0 f21257m;
    public final f0 f21258n;

    public e(long j3, long j10, long j11, int i7, long j12, long j13, long j14, p2.c cVar, l0 l0Var, f0 f0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (f0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z11 == z10);
        this.f21250e = j3;
        this.f21251f = j10;
        this.f21252g = j11;
        this.h = i7;
        this.f21253i = j12;
        this.f21254j = j13;
        this.f21255k = j14;
        this.f21256l = cVar;
        this.f21257m = l0Var;
        this.f21258n = f0Var;
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
    public final i1 f(int i7, i1 i1Var, boolean z10) {
        String str;
        ja.j(i7, h());
        Integer num = null;
        p2.c cVar = this.f21256l;
        if (z10) {
            str = cVar.b(i7).f54543a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i7);
        }
        i1Var.getClass();
        i1Var.h(str, num, 0, cVar.d(i7), h2.l0.S(cVar.b(i7).f54544b - cVar.b(0).f54544b) - this.f21253i, e2.c.f10026c, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f21256l.f54525m.size();
    }

    @Override
    public final Object l(int i7) {
        ja.j(i7, h());
        return Integer.valueOf(this.h + i7);
    }

    @Override
    public final k1 m(int i7, k1 k1Var, long j3) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        long j11;
        i c10;
        ja.j(i7, 1);
        p2.c cVar = this.f21256l;
        boolean z13 = cVar.d;
        long j12 = this.f21255k;
        if (z13 && cVar.f54518e != -9223372036854775807L && cVar.f54516b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.f21254j) {
                    z10 = true;
                    z11 = false;
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    Object obj = k1.f10151q;
                    if (!cVar.d && cVar.f54518e != j10 && cVar.f54516b == j10) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    k1Var.b(obj, this.f21257m, cVar, this.f21250e, this.f21251f, this.f21252g, true, z12, this.f21258n, j12, this.f21254j, 0, h() - 1, this.f21253i);
                    return k1Var;
                }
            }
            long j14 = this.f21253i + j12;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f54525m.size() - 1 && j14 >= d) {
                j14 -= d;
                i10++;
                d = cVar.d(i10);
            }
            p2.h b10 = cVar.b(i10);
            List list = b10.f54545c;
            z10 = true;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j11 = j13;
                    if (((p2.a) list.get(i11)).f54508b == 2) {
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
            if (i11 != -1 && (c10 = ((p2.m) ((p2.a) b10.f54545c.get(i11)).f54509c.get(0)).c()) != null && c10.t0(d) != j11) {
                j12 = (c10.b(c10.L(j14, d)) + j12) - j14;
            }
        } else {
            z10 = true;
            j10 = -9223372036854775807L;
        }
        z11 = false;
        Object obj2 = k1.f10151q;
        if (!cVar.d) {
        }
        z12 = z11;
        k1Var.b(obj2, this.f21257m, cVar, this.f21250e, this.f21251f, this.f21252g, true, z12, this.f21258n, j12, this.f21254j, 0, h() - 1, this.f21253i);
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
