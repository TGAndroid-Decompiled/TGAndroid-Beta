package j2;

import a8.ja;
import android.net.Uri;
import e2.s0;
import e2.t0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements n4.b {
    public int f16796a;
    public long f16797b;
    public int f16798c;
    public long d;
    public Object f16799e;
    public Object f16800f;
    public Object f16801g;
    public Object h;

    public l(f3.q qVar, i0 i0Var, i2.s sVar, String str, int i7) {
        this.f16799e = qVar;
        this.f16800f = i0Var;
        this.f16801g = sVar;
        int i10 = sVar.f15677a;
        int i11 = sVar.f15678b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.f15679c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f16796a = max;
            e2.t tVar = new e2.t();
            tVar.f10398q = s0.n("audio/wav");
            tVar.f10399r = s0.n(str);
            tVar.h = i15;
            tVar.f10390i = i15;
            tVar.f10400s = max;
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
            if (i7 <= 0 || (i10 = this.f16798c) >= (i11 = this.f16796a)) {
                break;
            }
            int e10 = ((i0) this.f16800f).e(pVar, (int) Math.min(i11 - i10, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.f16798c += e10;
                j10 -= e10;
            }
        }
        i2.s sVar = (i2.s) this.f16801g;
        int i12 = sVar.f15679c;
        int i13 = this.f16798c / i12;
        if (i13 > 0) {
            long j11 = this.f16797b;
            long j12 = this.d;
            long j13 = sVar.f15678b;
            String str = l0.f13471a;
            int i14 = i13 * i12;
            int i15 = this.f16798c - i14;
            ((i0) this.f16800f).c(j11 + l0.a0(j12, 1000000L, j13, RoundingMode.DOWN), 1, i14, i15, null);
            this.d += i13;
            this.f16798c = i15;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void b(long j3) {
        this.f16797b = j3;
        this.f16798c = 0;
        this.d = 0L;
    }

    @Override
    public void c(int i7, long j3) {
        n4.e eVar = new n4.e((i2.s) this.f16801g, 1, i7, j3);
        ((f3.q) this.f16799e).f(eVar);
        i0 i0Var = (i0) this.f16800f;
        i0Var.g((e2.u) this.h);
        i0Var.d(eVar.f20970e);
    }

    public m d() {
        ja.k((Uri) this.f16799e, "The uri must be set.");
        return new m((Uri) this.f16799e, this.f16796a, (byte[]) this.f16800f, (Map) this.f16801g, this.f16797b, this.d, (String) this.h, this.f16798c);
    }
}
