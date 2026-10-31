package g2;

import android.net.Uri;
import b2.v0;
import b2.w0;
import c3.k0;
import e2.l0;
import java.math.RoundingMode;
import java.util.Map;
import v7.t6;
public final class m implements k4.b {
    public int f7308a;
    public long f7309b;
    public int f7310c;
    public long d;
    public Object e;
    public Object f7311f;
    public Object f7312g;
    public Object h;

    public m(c3.q qVar, k0 k0Var, f2.u uVar, String str, int i10) {
        this.e = qVar;
        this.f7311f = k0Var;
        this.f7312g = uVar;
        int i11 = uVar.f6800a;
        int i12 = uVar.f6801b;
        int i13 = (uVar.d * i11) / 8;
        int i14 = uVar.f6802c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f7308a = max;
            b2.w wVar = new b2.w();
            wVar.f2369q = v0.n("audio/wav");
            wVar.f2370r = v0.n(str);
            wVar.h = i16;
            wVar.f2361i = i16;
            wVar.f2371s = max;
            wVar.J = i11;
            wVar.K = i12;
            wVar.L = i10;
            this.h = new b2.x(wVar);
            return;
        }
        throw w0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }

    @Override
    public void a(long j10) {
        this.f7309b = j10;
        this.f7310c = 0;
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
            if (i10 <= 0 || (i11 = this.f7310c) >= (i12 = this.f7308a)) {
                break;
            }
            int a2 = ((k0) this.f7311f).a(pVar, (int) Math.min(i12 - i11, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.f7310c += a2;
                j11 -= a2;
            }
        }
        f2.u uVar = (f2.u) this.f7312g;
        int i13 = uVar.f6802c;
        int i14 = this.f7310c / i13;
        if (i14 > 0) {
            long j12 = this.f7309b;
            long j13 = this.d;
            long j14 = uVar.f6801b;
            String str = l0.f6165a;
            int i15 = i14 * i13;
            int i16 = this.f7310c - i15;
            ((k0) this.f7311f).c(j12 + l0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f7310c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.u) this.f7312g, 1, i10, j10);
        ((c3.q) this.e).G1(fVar);
        k0 k0Var = (k0) this.f7311f;
        k0Var.b((b2.x) this.h);
        k0Var.e(fVar.e);
    }

    public n d() {
        t6.l((Uri) this.e, "The uri must be set.");
        return new n((Uri) this.e, this.f7308a, (byte[]) this.f7311f, (Map) this.f7312g, this.f7309b, this.d, (String) this.h, this.f7310c);
    }
}
