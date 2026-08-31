package c4;

import android.net.Uri;
import c2.a1;
import g5.p;
import h5.d0;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.Map;
import r3.l;
import r3.m;
import r3.v;
public final class c implements b {
    public int f2241a;
    public long f2242b;
    public long f2243c;
    public int d;
    public Object f2244e;
    public Object f2245f;
    public Object f2246g;
    public Object h;

    public c(m mVar, v vVar, a1 a1Var, String str, int i10) {
        this.f2244e = mVar;
        this.f2245f = vVar;
        this.f2246g = a1Var;
        int i11 = a1Var.f2058a;
        int i12 = a1Var.f2059b;
        int i13 = (a1Var.d * i11) / 8;
        int i14 = a1Var.f2060c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f2241a = max;
            m0 m0Var = new m0();
            m0Var.f9265o = str;
            m0Var.f9257f = i16;
            m0Var.f9258g = i16;
            m0Var.f9266p = max;
            m0Var.B = i11;
            m0Var.C = i12;
            m0Var.D = i10;
            this.h = new n0(m0Var);
            return;
        }
        throw r1.a("Expected block size: " + i13 + "; got: " + i14, null);
    }

    @Override
    public void a(long j10) {
        this.f2242b = j10;
        this.d = 0;
        this.f2243c = 0L;
    }

    @Override
    public boolean b(l lVar, long j10) {
        int i10;
        a1 a1Var;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.d) >= (i12 = this.f2241a)) {
                break;
            }
            int e6 = ((v) this.f2245f).e(lVar, (int) Math.min(i12 - i11, j11), true);
            if (e6 == -1) {
                j11 = 0;
            } else {
                this.d += e6;
                j11 -= e6;
            }
        }
        int i13 = ((a1) this.f2246g).f2060c;
        int i14 = this.d / i13;
        if (i14 > 0) {
            int i15 = i14 * i13;
            int i16 = this.d - i15;
            ((v) this.f2245f).c(this.f2242b + d0.N(this.f2243c, 1000000L, a1Var.f2059b), 1, i15, i16, null);
            this.f2243c += i14;
            this.d = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        ((m) this.f2244e).m2(new f((a1) this.f2246g, 1, i10, j10));
        ((v) this.f2245f).b((n0) this.h);
    }

    public p d() {
        h5.a.k((Uri) this.f2244e, "The uri must be set.");
        return new p((Uri) this.f2244e, this.f2241a, (byte[]) this.f2245f, (Map) this.f2246g, this.f2242b, this.f2243c, (String) this.h, this.d);
    }
}
