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
    public int f2062a;
    public long f2063b;
    public long f2064c;
    public int d;
    public Object e;
    public Object f2065f;
    public Object f2066g;
    public Object h;

    public c(m mVar, v vVar, a1 a1Var, String str, int i10) {
        this.e = mVar;
        this.f2065f = vVar;
        this.f2066g = a1Var;
        int i11 = a1Var.f1895a;
        int i12 = a1Var.f1896b;
        int i13 = (a1Var.d * i11) / 8;
        int i14 = a1Var.f1897c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f2062a = max;
            m0 m0Var = new m0();
            m0Var.f8684o = str;
            m0Var.f8676f = i16;
            m0Var.f8677g = i16;
            m0Var.f8685p = max;
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
        this.f2063b = j10;
        this.d = 0;
        this.f2064c = 0L;
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
            if (i10 <= 0 || (i11 = this.d) >= (i12 = this.f2062a)) {
                break;
            }
            int e = ((v) this.f2065f).e(lVar, (int) Math.min(i12 - i11, j11), true);
            if (e == -1) {
                j11 = 0;
            } else {
                this.d += e;
                j11 -= e;
            }
        }
        int i13 = ((a1) this.f2066g).f1897c;
        int i14 = this.d / i13;
        if (i14 > 0) {
            int i15 = i14 * i13;
            int i16 = this.d - i15;
            ((v) this.f2065f).c(this.f2063b + d0.N(this.f2064c, 1000000L, a1Var.f1896b), 1, i15, i16, null);
            this.f2064c += i14;
            this.d = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        ((m) this.e).g2(new f((a1) this.f2066g, 1, i10, j10));
        ((v) this.f2065f).b((n0) this.h);
    }

    public p d() {
        h5.a.k((Uri) this.e, "The uri must be set.");
        return new p((Uri) this.e, this.f2062a, (byte[]) this.f2065f, (Map) this.f2066g, this.f2063b, this.f2064c, (String) this.h, this.d);
    }
}
