package j2;

import a8.la;
import android.net.Uri;
import e2.s0;
import e2.t0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements n4.b {
    public int f17206a;
    public long f17207b;
    public int f17208c;
    public long d;
    public Object f17209e;
    public Object f17210f;
    public Object f17211g;
    public Object h;

    public l(f3.q qVar, i0 i0Var, i2.s sVar, String str, int i7) {
        this.f17209e = qVar;
        this.f17210f = i0Var;
        this.f17211g = sVar;
        int i10 = sVar.f16020a;
        int i11 = sVar.f16021b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.f16022c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f17206a = max;
            e2.t tVar = new e2.t();
            tVar.f10745q = s0.n("audio/wav");
            tVar.f10746r = s0.n(str);
            tVar.h = i15;
            tVar.f10737i = i15;
            tVar.f10747s = max;
            tVar.J = i10;
            tVar.K = i11;
            tVar.L = i7;
            this.h = new e2.u(tVar);
            return;
        }
        throw t0.a(null, "Expected block size: " + i12 + "; got: " + i13);
    }

    @Override
    public boolean a(f3.p pVar, long j3) {
        int i7;
        int i10;
        int i11;
        long j10 = j3;
        while (true) {
            i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 <= 0 || (i10 = this.f17208c) >= (i11 = this.f17206a)) {
                break;
            }
            int e10 = ((i0) this.f17210f).e(pVar, (int) Math.min(i11 - i10, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.f17208c += e10;
                j10 -= e10;
            }
        }
        i2.s sVar = (i2.s) this.f17211g;
        int i12 = sVar.f16022c;
        int i13 = this.f17208c / i12;
        if (i13 > 0) {
            long j11 = this.f17207b;
            long j12 = this.d;
            long j13 = sVar.f16021b;
            String str = l0.f13815a;
            int i14 = i13 * i12;
            int i15 = this.f17208c - i14;
            ((i0) this.f17210f).c(j11 + l0.a0(j12, 1000000L, j13, RoundingMode.DOWN), 1, i14, i15, null);
            this.d += i13;
            this.f17208c = i15;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void b(long j3) {
        this.f17207b = j3;
        this.f17208c = 0;
        this.d = 0L;
    }

    @Override
    public void c(int i7, long j3) {
        n4.e eVar = new n4.e((i2.s) this.f17211g, 1, i7, j3);
        ((f3.q) this.f17209e).j(eVar);
        i0 i0Var = (i0) this.f17210f;
        i0Var.g((e2.u) this.h);
        i0Var.d(eVar.f21362e);
    }

    public m d() {
        la.k((Uri) this.f17209e, "The uri must be set.");
        return new m((Uri) this.f17209e, this.f17206a, (byte[]) this.f17210f, (Map) this.f17211g, this.f17207b, this.d, (String) this.h, this.f17208c);
    }
}
