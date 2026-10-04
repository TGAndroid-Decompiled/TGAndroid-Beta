package g2;

import android.net.Uri;
import b2.r0;
import b2.s0;
import c3.h0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements k4.b {
    public int f10187a;
    public long f10188b;
    public int f10189c;
    public long d;
    public Object f10190e;
    public Object f10191f;
    public Object f10192g;
    public Object h;

    public l(c3.q qVar, h0 h0Var, e2.q qVar2, String str, int i10) {
        this.f10190e = qVar;
        this.f10191f = h0Var;
        this.f10192g = qVar2;
        int i11 = qVar2.f8575a;
        int i12 = qVar2.f8576b;
        int i13 = (qVar2.d * i11) / 8;
        int i14 = qVar2.f8577c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f10187a = max;
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
        this.f10188b = j3;
        this.f10189c = 0;
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
            if (i10 <= 0 || (i11 = this.f10189c) >= (i12 = this.f10187a)) {
                break;
            }
            int a2 = ((h0) this.f10191f).a(pVar, (int) Math.min(i12 - i11, j10), true);
            if (a2 == -1) {
                j10 = 0;
            } else {
                this.f10189c += a2;
                j10 -= a2;
            }
        }
        e2.q qVar = (e2.q) this.f10192g;
        int i13 = qVar.f8577c;
        int i14 = this.f10189c / i13;
        if (i14 > 0) {
            long j11 = this.f10188b;
            long j12 = this.d;
            long j13 = qVar.f8576b;
            String str = e2.d0.f8538a;
            int i15 = i14 * i13;
            int i16 = this.f10189c - i15;
            ((h0) this.f10191f).c(j11 + e2.d0.Y(j12, 1000000L, j13, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f10189c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j3) {
        ((c3.q) this.f10190e).X1(new k4.f((e2.q) this.f10192g, 1, i10, j3));
        ((h0) this.f10191f).b((b2.s) this.h);
    }

    public m d() {
        e2.d.i((Uri) this.f10190e, "The uri must be set.");
        return new m((Uri) this.f10190e, this.f10187a, (byte[]) this.f10191f, (Map) this.f10192g, this.f10188b, this.d, (String) this.h, this.f10189c);
    }
}
