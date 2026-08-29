package o4;

import f5.d0;
import j3.b1;
import j3.f1;
import j3.p2;
import j3.q2;
import j3.r2;
import java.util.List;
public final class e extends r2 {
    public final long f19150b;
    public final long f19151c;
    public final long d;
    public final int f19152e;
    public final long f19153f;
    public final long h;
    public final long f19154n;
    public final p4.c f19155r;
    public final f1 f19156s;
    public final b1 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, p4.c cVar, f1 f1Var, b1 b1Var) {
        boolean z10;
        boolean z11 = cVar.d;
        if (b1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z11 == z10);
        this.f19150b = j10;
        this.f19151c = j11;
        this.d = j12;
        this.f19152e = i10;
        this.f19153f = j13;
        this.h = j14;
        this.f19154n = j15;
        this.f19155r = cVar;
        this.f19156s = f1Var;
        this.v = b1Var;
    }

    @Override
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f19152e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        String str;
        f5.a.h(i10, h());
        Integer num = null;
        p4.c cVar = this.f19155r;
        if (z10) {
            str = cVar.b(i10).f45566a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.f19152e + i10);
        }
        p2Var.getClass();
        p2Var.h(str, num, 0, cVar.d(i10), d0.H(cVar.b(i10).f45567b - cVar.b(0).f45567b) - this.f19153f, m4.c.f16848f, false);
        return p2Var;
    }

    @Override
    public final int h() {
        return this.f19155r.f45549m.size();
    }

    @Override
    public final Object l(int i10) {
        f5.a.h(i10, h());
        return Integer.valueOf(this.f19152e + i10);
    }

    @Override
    public final q2 m(int i10, q2 q2Var, long j10) {
        long j11;
        boolean z10;
        long j12;
        i c3;
        f5.a.h(i10, 1);
        p4.c cVar = this.f19155r;
        boolean z11 = cVar.d;
        long j13 = this.f19154n;
        if (z11 && cVar.f45542e != -9223372036854775807L && cVar.f45540b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.h) {
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    Object obj = q2.D;
                    if (!cVar.d && cVar.f45542e != j11 && cVar.f45540b == j11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q2Var.b(obj, this.f19156s, cVar, this.f19150b, this.f19151c, this.d, true, z10, this.v, j13, this.h, 0, h() - 1, this.f19153f);
                    return q2Var;
                }
            }
            long j15 = this.f19153f + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.f45549m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            p4.h b10 = cVar.b(i11);
            List list = b10.f45568c;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    j12 = j14;
                    if (((p4.a) list.get(i12)).f45532b == 2) {
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
            if (i12 != -1 && (c3 = ((p4.m) ((p4.a) b10.f45568c.get(i12)).f45533c.get(0)).c()) != null && c3.F(d) != j12) {
                j13 = (c3.b(c3.r(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        Object obj2 = q2.D;
        if (!cVar.d) {
        }
        z10 = false;
        q2Var.b(obj2, this.f19156s, cVar, this.f19150b, this.f19151c, this.d, true, z10, this.v, j13, this.h, 0, h() - 1, this.f19153f);
        return q2Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
