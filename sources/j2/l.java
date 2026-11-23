package j2;

import a8.ma;
import android.net.Uri;
import e2.s0;
import e2.t0;
import f3.i0;
import h2.l0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements n4.b {
    public int f17172a;
    public long f17173b;
    public int f17174c;
    public long d;
    public Object f17175e;
    public Object f17176f;
    public Object f17177g;
    public Object h;

    public l(f3.q qVar, i0 i0Var, i2.s sVar, String str, int i7) {
        this.f17175e = qVar;
        this.f17176f = i0Var;
        this.f17177g = sVar;
        int i10 = sVar.f15986a;
        int i11 = sVar.f15987b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.f15988c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f17172a = max;
            e2.t tVar = new e2.t();
            tVar.f10708q = s0.n("audio/wav");
            tVar.f10709r = s0.n(str);
            tVar.h = i15;
            tVar.f10700i = i15;
            tVar.f10710s = max;
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
            if (i7 <= 0 || (i10 = this.f17174c) >= (i11 = this.f17172a)) {
                break;
            }
            int e10 = ((i0) this.f17176f).e(pVar, (int) Math.min(i11 - i10, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.f17174c += e10;
                j10 -= e10;
            }
        }
        i2.s sVar = (i2.s) this.f17177g;
        int i12 = sVar.f15988c;
        int i13 = this.f17174c / i12;
        if (i13 > 0) {
            long j11 = this.f17173b;
            long j12 = this.d;
            long j13 = sVar.f15987b;
            String str = l0.f13778a;
            int i14 = i13 * i12;
            int i15 = this.f17174c - i14;
            ((i0) this.f17176f).c(j11 + l0.a0(j12, 1000000L, j13, RoundingMode.DOWN), 1, i14, i15, null);
            this.d += i13;
            this.f17174c = i15;
        }
        if (i7 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void b(long j3) {
        this.f17173b = j3;
        this.f17174c = 0;
        this.d = 0L;
    }

    @Override
    public void c(int i7, long j3) {
        n4.e eVar = new n4.e((i2.s) this.f17177g, 1, i7, j3);
        ((f3.q) this.f17175e).j(eVar);
        i0 i0Var = (i0) this.f17176f;
        i0Var.g((e2.u) this.h);
        i0Var.d(eVar.f21328e);
    }

    public m d() {
        ma.k((Uri) this.f17175e, "The uri must be set.");
        return new m((Uri) this.f17175e, this.f17172a, (byte[]) this.f17176f, (Map) this.f17177g, this.f17173b, this.d, (String) this.h, this.f17174c);
    }
}
