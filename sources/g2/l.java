package g2;

import android.net.Uri;
import b2.w0;
import b2.x0;
import c3.i0;
import e2.m0;
import java.math.RoundingMode;
import java.util.Map;
import v7.u6;
public final class l implements k4.b {
    public int f9880a;
    public long f9881b;
    public int f9882c;
    public long d;
    public Object e;
    public Object f9883f;
    public Object f9884g;
    public Object h;

    public l(c3.q qVar, i0 i0Var, f2.t tVar, String str, int i10) {
        this.e = qVar;
        this.f9883f = i0Var;
        this.f9884g = tVar;
        int i11 = tVar.f8909a;
        int i12 = tVar.f8910b;
        int i13 = (tVar.d * i11) / 8;
        int i14 = tVar.f8911c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f9880a = max;
            b2.w wVar = new b2.w();
            wVar.f2469q = w0.n("audio/wav");
            wVar.f2470r = w0.n(str);
            wVar.h = i16;
            wVar.f2461i = i16;
            wVar.f2471s = max;
            wVar.J = i11;
            wVar.K = i12;
            wVar.L = i10;
            this.h = new b2.x(wVar);
            return;
        }
        throw x0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }

    @Override
    public void a(long j10) {
        this.f9881b = j10;
        this.f9882c = 0;
        this.d = 0L;
    }

    @Override
    public boolean b(c3.p pVar, long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f9882c) >= (i12 = this.f9880a)) {
                break;
            }
            int a2 = ((i0) this.f9883f).a(pVar, (int) Math.min(i12 - i11, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.f9882c += a2;
                j11 -= a2;
            }
        }
        f2.t tVar = (f2.t) this.f9884g;
        int i13 = tVar.f8911c;
        int i14 = this.f9882c / i13;
        if (i14 > 0) {
            long j12 = this.f9881b;
            long j13 = this.d;
            long j14 = tVar.f8910b;
            String str = m0.f8375a;
            int i15 = i14 * i13;
            int i16 = this.f9882c - i15;
            ((i0) this.f9883f).c(j12 + m0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f9882c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.t) this.f9884g, 1, i10, j10);
        ((c3.q) this.e).K(fVar);
        i0 i0Var = (i0) this.f9883f;
        i0Var.b((b2.x) this.h);
        i0Var.e(fVar.e);
    }

    public m d() {
        u6.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.f9880a, (byte[]) this.f9883f, (Map) this.f9884g, this.f9881b, this.d, (String) this.h, this.f9882c);
    }
}
