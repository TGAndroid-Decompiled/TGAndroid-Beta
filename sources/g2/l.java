package g2;

import a8.yb;
import android.net.Uri;
import b2.w0;
import b2.x0;
import c3.j0;
import e2.n0;
import java.math.RoundingMode;
import java.util.Map;
public final class l implements k4.b {
    public int f12252a;
    public long f12253b;
    public int f12254c;
    public long d;
    public Object e;
    public Object f12255f;
    public Object f12256g;
    public Object h;

    public l(c3.q qVar, j0 j0Var, f2.u uVar, String str, int i10) {
        this.e = qVar;
        this.f12255f = j0Var;
        this.f12256g = uVar;
        int i11 = uVar.f10128a;
        int i12 = uVar.f10129b;
        int i13 = (uVar.d * i11) / 8;
        int i14 = uVar.f10130c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f12252a = max;
            b2.w wVar = new b2.w();
            wVar.f3532q = w0.n("audio/wav");
            wVar.f3533r = w0.n(str);
            wVar.h = i16;
            wVar.f3524i = i16;
            wVar.f3534s = max;
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
        this.f12253b = j10;
        this.f12254c = 0;
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
            if (i10 <= 0 || (i11 = this.f12254c) >= (i12 = this.f12252a)) {
                break;
            }
            int a2 = ((j0) this.f12255f).a(pVar, (int) Math.min(i12 - i11, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.f12254c += a2;
                j11 -= a2;
            }
        }
        f2.u uVar = (f2.u) this.f12256g;
        int i13 = uVar.f10130c;
        int i14 = this.f12254c / i13;
        if (i14 > 0) {
            long j12 = this.f12253b;
            long j13 = this.d;
            long j14 = uVar.f10129b;
            String str = n0.f9692a;
            int i15 = i14 * i13;
            int i16 = this.f12254c - i15;
            ((j0) this.f12255f).c(j12 + n0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f12254c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.u) this.f12256g, 1, i10, j10);
        ((c3.q) this.e).D1(fVar);
        j0 j0Var = (j0) this.f12255f;
        j0Var.b((b2.x) this.h);
        j0Var.e(fVar.e);
    }

    public m d() {
        yb.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.f12252a, (byte[]) this.f12255f, (Map) this.f12256g, this.f12253b, this.d, (String) this.h, this.f12254c);
    }
}
