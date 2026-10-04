package g2;

import android.net.Uri;
import b2.r0;
import b2.s0;
import c3.h0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements k4.b {
    public int f10186a;
    public long f10187b;
    public int f10188c;
    public long d;
    public Object f10189e;
    public Object f10190f;
    public Object f10191g;
    public Object h;

    public l(c3.q qVar, h0 h0Var, e2.q qVar2, String str, int i10) {
        this.f10189e = qVar;
        this.f10190f = h0Var;
        this.f10191g = qVar2;
        int i11 = qVar2.f8574a;
        int i12 = qVar2.f8575b;
        int i13 = (qVar2.d * i11) / 8;
        int i14 = qVar2.f8576c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f10186a = max;
            b2.r rVar = new b2.r();
            rVar.f3505p = r0.n("audio/wav");
            rVar.f3506q = r0.n(str);
            rVar.h = i16;
            rVar.f3498i = i16;
            rVar.f3507r = max;
            rVar.I = i11;
            rVar.J = i12;
            rVar.K = i10;
            this.h = new b2.s(rVar);
            return;
        }
        throw s0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }

    @Override
    public void a(long j3) {
        this.f10187b = j3;
        this.f10188c = 0;
        this.d = 0L;
    }

    @Override
    public boolean b(c3.p pVar, long j3) {
        int i10;
        int i11;
        int i12;
        long j10 = j3;
        while (true) {
            i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f10188c) >= (i12 = this.f10186a)) {
                break;
            }
            int a2 = ((h0) this.f10190f).a(pVar, (int) Math.min(i12 - i11, j10), true);
            if (a2 == -1) {
                j10 = 0;
            } else {
                this.f10188c += a2;
                j10 -= a2;
            }
        }
        e2.q qVar = (e2.q) this.f10191g;
        int i13 = qVar.f8576c;
        int i14 = this.f10188c / i13;
        if (i14 > 0) {
            long j11 = this.f10187b;
            long j12 = this.d;
            long j13 = qVar.f8575b;
            String str = e2.d0.f8537a;
            int i15 = i14 * i13;
            int i16 = this.f10188c - i15;
            ((h0) this.f10190f).c(j11 + e2.d0.Y(j12, 1000000L, j13, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f10188c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j3) {
        ((c3.q) this.f10189e).X1(new k4.f((e2.q) this.f10191g, 1, i10, j3));
        ((h0) this.f10190f).b((b2.s) this.h);
    }

    public m d() {
        e2.d.i((Uri) this.f10189e, "The uri must be set.");
        return new m((Uri) this.f10189e, this.f10186a, (byte[]) this.f10190f, (Map) this.f10191g, this.f10187b, this.d, (String) this.h, this.f10188c);
    }
}
