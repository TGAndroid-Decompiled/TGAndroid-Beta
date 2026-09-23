package l2;

import b2.e0;
import b2.h1;
import b2.j1;
import b2.k0;
import b2.k1;
import e2.d0;
import java.util.List;
public final class e extends k1 {
    public final long e;
    public final long f13803f;
    public final long f13804g;
    public final int h;
    public final long f13805i;
    public final long f13806j;
    public final long f13807k;
    public final m2.c f13808l;
    public final k0 f13809m;
    public final e0 f13810n;

    public e(long j3, long j10, long j11, int i10, long j12, long j13, long j14, m2.c cVar, k0 k0Var, e0 e0Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (e0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z11 == z10);
        this.e = j3;
        this.f13803f = j10;
        this.f13804g = j11;
        this.h = i10;
        this.f13805i = j12;
        this.f13806j = j13;
        this.f13807k = j14;
        this.f13808l = cVar;
        this.f13809m = k0Var;
        this.f13810n = e0Var;
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
        m2.c cVar = this.f13808l;
        if (z10) {
            str = cVar.b(i10).f14406a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.h + i10);
        }
        h1Var.getClass();
        h1Var.h(str, num, 0, cVar.d(i10), d0.Q(cVar.b(i10).f14407b - cVar.b(0).f14407b) - this.f13805i, b2.b.f2927c, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f13808l.f14390m.size();
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
        h d;
        e2.d.c(i10, 1);
        m2.c cVar = this.f13808l;
        boolean z11 = cVar.d;
        long j12 = this.f13807k;
        if (z11 && cVar.e != -9223372036854775807L && cVar.f14382b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.f13806j) {
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    Object obj = j1.f3041q;
                    if (!cVar.d && cVar.e != j10 && cVar.f14382b == j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j1Var.b(obj, this.f13809m, cVar, this.e, this.f13803f, this.f13804g, true, z10, this.f13810n, j12, this.f13806j, 0, h() - 1, this.f13805i);
                    return j1Var;
                }
            }
            long j14 = this.f13805i + j12;
            long d10 = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f14390m.size() - 1 && j14 >= d10) {
                j14 -= d10;
                i11++;
                d10 = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.f14408c;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j11 = j13;
                    if (((m2.a) list.get(i12)).f14375b == 2) {
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
            if (i12 != -1 && (d = ((m2.m) ((m2.a) b10.f14408c.get(i12)).f14376c.get(0)).d()) != null && d.P(d10) != j11) {
                j12 = (d.b(d.v(j14, d10)) + j12) - j14;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        Object obj2 = j1.f3041q;
        if (!cVar.d) {
        }
        z10 = false;
        j1Var.b(obj2, this.f13809m, cVar, this.e, this.f13803f, this.f13804g, true, z10, this.f13810n, j12, this.f13806j, 0, h() - 1, this.f13805i);
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
