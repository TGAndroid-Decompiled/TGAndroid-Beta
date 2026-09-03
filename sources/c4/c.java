package c4;

import android.net.Uri;
import c2.b1;
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
    public int f2085a;
    public long f2086b;
    public long f2087c;
    public int d;
    public Object e;
    public Object f2088f;
    public Object f2089g;
    public Object h;

    public c(m mVar, v vVar, b1 b1Var, String str, int i10) {
        this.e = mVar;
        this.f2088f = vVar;
        this.f2089g = b1Var;
        int i11 = b1Var.f1928a;
        int i12 = b1Var.f1929b;
        int i13 = (b1Var.d * i11) / 8;
        int i14 = b1Var.f1930c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f2085a = max;
            m0 m0Var = new m0();
            m0Var.f8666o = str;
            m0Var.f8658f = i16;
            m0Var.f8659g = i16;
            m0Var.f8667p = max;
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
        this.f2086b = j10;
        this.d = 0;
        this.f2087c = 0L;
    }

    @Override
    public boolean b(l lVar, long j10) {
        int i10;
        b1 b1Var;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.d) >= (i12 = this.f2085a)) {
                break;
            }
            int e = ((v) this.f2088f).e(lVar, (int) Math.min(i12 - i11, j11), true);
            if (e == -1) {
                j11 = 0;
            } else {
                this.d += e;
                j11 -= e;
            }
        }
        int i13 = ((b1) this.f2089g).f1930c;
        int i14 = this.d / i13;
        if (i14 > 0) {
            int i15 = i14 * i13;
            int i16 = this.d - i15;
            ((v) this.f2088f).c(this.f2086b + d0.N(this.f2087c, 1000000L, b1Var.f1929b), 1, i15, i16, null);
            this.f2087c += i14;
            this.d = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        ((m) this.e).h2(new f((b1) this.f2089g, 1, i10, j10));
        ((v) this.f2088f).b((n0) this.h);
    }

    public p d() {
        h5.a.k((Uri) this.e, "The uri must be set.");
        return new p((Uri) this.e, this.f2085a, (byte[]) this.f2088f, (Map) this.f2089g, this.f2086b, this.f2087c, (String) this.h, this.d);
    }
}
