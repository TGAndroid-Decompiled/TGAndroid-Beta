package m4;

import d5.f0;
import h3.b1;
import h3.f1;
import h3.p2;
import h3.q2;
import h3.r2;
import java.util.List;
public final class e extends r2 {
    public final long f17291b;
    public final long f17292c;
    public final long d;
    public final int f17293e;
    public final long f17294f;
    public final long h;
    public final long f17295n;
    public final n4.c f17296r;
    public final f1 f17297s;
    public final b1 v;

    public e(long j10, long j11, long j12, int i9, long j13, long j14, long j15, n4.c cVar, f1 f1Var, b1 b1Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (b1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z11 == z10);
        this.f17291b = j10;
        this.f17292c = j11;
        this.d = j12;
        this.f17293e = i9;
        this.f17294f = j13;
        this.h = j14;
        this.f17295n = j15;
        this.f17296r = cVar;
        this.f17297s = f1Var;
        this.v = b1Var;
    }

    @Override
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f17293e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        String str;
        d5.a.h(i9, h());
        Integer num = null;
        n4.c cVar = this.f17296r;
        if (z10) {
            str = cVar.b(i9).f18417a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.f17293e + i9);
        }
        p2Var.getClass();
        p2Var.h(str, num, 0, cVar.d(i9), f0.H(cVar.b(i9).f18418b - cVar.b(0).f18418b) - this.f17294f, k4.b.f14627f, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return this.f17296r.f18400m.size();
    }

    @Override
    public final Object l(int i9) {
        d5.a.h(i9, h());
        return Integer.valueOf(this.f17293e + i9);
    }

    @Override
    public final q2 m(int i9, q2 q2Var, long j10) {
        long j11;
        boolean z10;
        long j12;
        h c10;
        d5.a.h(i9, 1);
        n4.c cVar = this.f17296r;
        boolean z11 = cVar.d;
        long j13 = this.f17295n;
        if (z11 && cVar.f18393e != -9223372036854775807L && cVar.f18391b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.h) {
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = q2.D;
                    if (!cVar.d && cVar.f18393e != j11 && cVar.f18391b == j11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q2Var.b(obj, this.f17297s, cVar, this.f17291b, this.f17292c, this.d, true, z10, this.v, j13, this.h, 0, h() - 1, this.f17294f);
                    return q2Var;
                }
            }
            long j15 = this.f17294f + j13;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f18400m.size() - 1 && j15 >= d) {
                j15 -= d;
                i10++;
                d = cVar.d(i10);
            }
            n4.h b10 = cVar.b(i10);
            List list = b10.f18419c;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j12 = j14;
                    if (((n4.a) list.get(i11)).f18383b == 2) {
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
            if (i11 != -1 && (c10 = ((n4.m) ((n4.a) b10.f18419c.get(i11)).f18384c.get(0)).c()) != null && c10.z(d) != j12) {
                j13 = (c10.a(c10.q(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        Object obj2 = q2.D;
        if (!cVar.d) {
        }
        z10 = false;
        q2Var.b(obj2, this.f17297s, cVar, this.f17291b, this.f17292c, this.d, true, z10, this.v, j13, this.h, 0, h() - 1, this.f17294f);
        return q2Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
