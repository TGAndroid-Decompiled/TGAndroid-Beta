package j2;

import a8.ia;
import android.net.Uri;
import e2.s0;
import e2.t0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements n4.b {
    public int f16442a;
    public long f16443b;
    public int f16444c;
    public long d;
    public Object f16445e;
    public Object f16446f;
    public Object f16447g;
    public Object h;

    public l(f3.q qVar, j0 j0Var, i2.s sVar, String str, int i7) {
        this.f16445e = qVar;
        this.f16446f = j0Var;
        this.f16447g = sVar;
        int i10 = sVar.f15225a;
        int i11 = sVar.f15226b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.f15227c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f16442a = max;
            e2.t tVar = new e2.t();
            tVar.f10567q = s0.n("audio/wav");
            tVar.f10568r = s0.n(str);
            tVar.h = i15;
            tVar.f10559i = i15;
            tVar.f10569s = max;
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
            if (i7 <= 0 || (i10 = this.f16444c) >= (i11 = this.f16442a)) {
                break;
            }
            int e10 = ((j0) this.f16446f).e(pVar, (int) Math.min(i11 - i10, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.f16444c += e10;
                j10 -= e10;
            }
        }
        i2.s sVar = (i2.s) this.f16447g;
        int i12 = sVar.f15227c;
        int i13 = this.f16444c / i12;
        if (i13 > 0) {
            long j11 = this.f16443b;
            long j12 = this.d;
            long j13 = sVar.f15226b;
            String str = m0.f14114a;
            int i14 = i13 * i12;
            int i15 = this.f16444c - i14;
            ((j0) this.f16446f).c(j11 + m0.a0(j12, 1000000L, j13, RoundingMode.DOWN), 1, i14, i15, null);
            this.d += i13;
            this.f16444c = i15;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void b(long j3) {
        this.f16443b = j3;
        this.f16444c = 0;
        this.d = 0L;
    }

    @Override
    public void c(int i7, long j3) {
        n4.e eVar = new n4.e((i2.s) this.f16447g, 1, i7, j3);
        ((f3.q) this.f16445e).f(eVar);
        j0 j0Var = (j0) this.f16446f;
        j0Var.g((e2.u) this.h);
        j0Var.d(eVar.f20406e);
    }

    public m d() {
        ia.k((Uri) this.f16445e, "The uri must be set.");
        return new m((Uri) this.f16445e, this.f16442a, (byte[]) this.f16446f, (Map) this.f16447g, this.f16443b, this.d, (String) this.h, this.f16444c);
    }
}
