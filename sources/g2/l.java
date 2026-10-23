package g2;

import android.net.Uri;
import b2.v0;
import b2.w0;
import c3.l0;
import e2.m0;
import java.math.RoundingMode;
import java.util.Map;
import v7.u6;
public final class l implements k4.b {
    public int f10804a;
    public long f10805b;
    public int f10806c;
    public long d;
    public Object e;
    public Object f10807f;
    public Object f10808g;
    public Object h;

    public l(c3.s sVar, l0 l0Var, f2.u uVar, String str, int i10) {
        this.e = sVar;
        this.f10807f = l0Var;
        this.f10808g = uVar;
        int i11 = uVar.f10369a;
        int i12 = uVar.f10370b;
        int i13 = (uVar.d * i11) / 8;
        int i14 = uVar.f10371c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f10804a = max;
            b2.v vVar = new b2.v();
            vVar.f4081q = v0.n("audio/wav");
            vVar.f4082r = v0.n(str);
            vVar.h = i16;
            vVar.f4073i = i16;
            vVar.f4083s = max;
            vVar.J = i11;
            vVar.K = i12;
            vVar.L = i10;
            this.h = new b2.w(vVar);
            return;
        }
        throw w0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }

    @Override
    public void a(long j10) {
        this.f10805b = j10;
        this.f10806c = 0;
        this.d = 0L;
    }

    @Override
    public boolean b(c3.r rVar, long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.f10806c) >= (i12 = this.f10804a)) {
                break;
            }
            int a2 = ((l0) this.f10807f).a(rVar, (int) Math.min(i12 - i11, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.f10806c += a2;
                j11 -= a2;
            }
        }
        f2.u uVar = (f2.u) this.f10808g;
        int i13 = uVar.f10371c;
        int i14 = this.f10806c / i13;
        if (i14 > 0) {
            long j12 = this.f10805b;
            long j13 = this.d;
            long j14 = uVar.f10370b;
            String str = m0.f8259a;
            int i15 = i14 * i13;
            int i16 = this.f10806c - i15;
            ((l0) this.f10807f).c(j12 + m0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f10806c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.u) this.f10808g, 1, i10, j10);
        ((c3.s) this.e).g0(fVar);
        l0 l0Var = (l0) this.f10807f;
        l0Var.b((b2.w) this.h);
        l0Var.e(fVar.e);
    }

    public m d() {
        u6.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.f10804a, (byte[]) this.f10807f, (Map) this.f10808g, this.f10805b, this.d, (String) this.h, this.f10806c);
    }
}
