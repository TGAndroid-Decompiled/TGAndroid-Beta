package g2;

import android.net.Uri;
import b2.v0;
import b2.w0;
import c3.j0;
import e2.m0;
import java.math.RoundingMode;
import java.util.Map;
import v7.u6;
public final class l implements k4.b {
    public int f10788a;
    public long f10789b;
    public int f10790c;
    public long d;
    public Object e;
    public Object f10791f;
    public Object f10792g;
    public Object h;

    public l(c3.q qVar, j0 j0Var, f2.u uVar, String str, int i10) {
        this.e = qVar;
        this.f10791f = j0Var;
        this.f10792g = uVar;
        int i11 = uVar.f10355a;
        int i12 = uVar.f10356b;
        int i13 = (uVar.d * i11) / 8;
        int i14 = uVar.f10357c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int max = Math.max(i13, i15 / 10);
            this.f10788a = max;
            b2.v vVar = new b2.v();
            vVar.f4078q = v0.n("audio/wav");
            vVar.f4079r = v0.n(str);
            vVar.h = i16;
            vVar.f4070i = i16;
            vVar.f4080s = max;
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
        this.f10789b = j10;
        this.f10790c = 0;
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
            if (i10 <= 0 || (i11 = this.f10790c) >= (i12 = this.f10788a)) {
                break;
            }
            int a2 = ((j0) this.f10791f).a(pVar, (int) Math.min(i12 - i11, j11), true);
            if (a2 == -1) {
                j11 = 0;
            } else {
                this.f10790c += a2;
                j11 -= a2;
            }
        }
        f2.u uVar = (f2.u) this.f10792g;
        int i13 = uVar.f10357c;
        int i14 = this.f10790c / i13;
        if (i14 > 0) {
            long j12 = this.f10789b;
            long j13 = this.d;
            long j14 = uVar.f10356b;
            String str = m0.f8255a;
            int i15 = i14 * i13;
            int i16 = this.f10790c - i15;
            ((j0) this.f10791f).c(j12 + m0.a0(j13, 1000000L, j14, RoundingMode.DOWN), 1, i15, i16, null);
            this.d += i14;
            this.f10790c = i16;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public void c(int i10, long j10) {
        k4.f fVar = new k4.f((f2.u) this.f10792g, 1, i10, j10);
        ((c3.q) this.e).g0(fVar);
        j0 j0Var = (j0) this.f10791f;
        j0Var.b((b2.w) this.h);
        j0Var.e(fVar.e);
    }

    public m d() {
        u6.l((Uri) this.e, "The uri must be set.");
        return new m((Uri) this.e, this.f10788a, (byte[]) this.f10791f, (Map) this.f10792g, this.f10789b, this.d, (String) this.h, this.f10790c);
    }
}
