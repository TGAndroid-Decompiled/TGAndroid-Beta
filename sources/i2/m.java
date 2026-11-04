package i2;

import android.net.Uri;
import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;
import java.util.Map;
public final class m implements m4.b {
    public int f14557a;
    public long f14558b;
    public int f14559c;
    public long d;
    public Object f14560e;
    public Object f14561f;
    public Object f14562g;
    public Object h;

    public m(e3.q qVar, i0 i0Var, h2.s sVar, String str, int i3) {
        this.f14560e = qVar;
        this.f14561f = i0Var;
        this.f14562g = sVar;
        int i10 = sVar.f14176a;
        int i11 = sVar.f14177b;
        int i12 = (sVar.d * i10) / 8;
        int i13 = sVar.f14178c;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f14557a = max;
            d2.u uVar = new d2.u();
            uVar.f8430q = u0.n("audio/wav");
            uVar.f8431r = u0.n(str);
            uVar.h = i15;
            uVar.f8422i = i15;
            uVar.f8432s = max;
            uVar.J = i10;
            uVar.K = i11;
            uVar.L = i3;
            this.h = new d2.v(uVar);
            return;
        }
        throw v0.a(null, "Expected block size: " + i12 + "; got: " + i13);
    }

    @Override
    public void a(long j10) {
        this.f14558b = j10;
        this.f14559c = 0;
        this.d = 0L;
    }

    @Override
    public boolean b(e3.p pVar, long j10) {
        int i3;
        int i10;
        int i11;
        long j11 = j10;
        while (true) {
            i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i3 <= 0 || (i10 = this.f14559c) >= (i11 = this.f14557a)) {
                break;
            }
            int a10 = ((i0) this.f14561f).a(pVar, (int) Math.min(i11 - i10, j11), true);
            if (a10 == -1) {
                j11 = 0;
            } else {
                this.f14559c += a10;
                j11 -= a10;
            }
        }
        h2.s sVar = (h2.s) this.f14562g;
        int i12 = sVar.f14178c;
        int i13 = this.f14559c / i12;
        if (i13 > 0) {
            long j12 = this.f14558b;
            long j13 = this.d;
            long j14 = sVar.f14177b;
            String str = n0.f11873a;
            int i14 = i13 * i12;
            int i15 = this.f14559c - i14;
            ((i0) this.f14561f).d(j12 + n0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i14, i15, null);
            this.d += i13;
            this.f14559c = i15;
        }
        if (i3 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i3, long j10) {
        m4.e eVar = new m4.e((h2.s) this.f14562g, 1, i3, j10);
        ((e3.q) this.f14560e).f(eVar);
        i0 i0Var = (i0) this.f14561f;
        i0Var.g((d2.v) this.h);
        i0Var.b(eVar.f19089e);
    }

    public n d() {
        zb.k((Uri) this.f14560e, "The uri must be set.");
        return new n((Uri) this.f14560e, this.f14557a, (byte[]) this.f14561f, (Map) this.f14562g, this.f14558b, this.d, (String) this.h, this.f14559c);
    }
}
