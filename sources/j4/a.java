package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements c3.q {
    public final b f14025a = new b("audio/ac3");
    public final e2.x f14026b = new e2.x(2786);
    public boolean f14027c;

    @Override
    public final boolean a(c3.r rVar) {
        c3.l lVar;
        int e;
        e2.x xVar = new e2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) rVar;
            lVar.j(xVar.f8298a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            lVar.u(z10, false);
        }
        lVar.f4648f = 0;
        lVar.u(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.j(xVar.f8298a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f4648f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.u(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.f8298a;
                if (bArr.length < 6) {
                    e = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e = c3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e == -1) {
                    break;
                }
                lVar.u(e - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        this.f14025a.d(sVar, new f0(0, 1));
        sVar.C();
        sVar.g0(new c3.v(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14027c = false;
        this.f14025a.c();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r rVar, c3.u uVar) {
        e2.x xVar = this.f14026b;
        int read = rVar.read(xVar.f8298a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f14027c;
        b bVar = this.f14025a;
        if (!z10) {
            bVar.f14039o = 0L;
            this.f14027c = true;
        }
        bVar.a(xVar);
        return 0;
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
