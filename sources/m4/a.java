package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class a implements f3.o {
    public final b f19571a = new b("audio/ac3");
    public final h2.x f19572b = new h2.x(2786);
    public boolean f19573c;

    @Override
    public final boolean b(f3.p pVar) {
        f3.l lVar;
        int e10;
        h2.x xVar = new h2.x(10);
        int i7 = 0;
        while (true) {
            lVar = (f3.l) pVar;
            lVar.k(xVar.f14162a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z9 = xVar.z();
            i7 += z9 + 10;
            lVar.v(z9, false);
        }
        lVar.f11059f = 0;
        lVar.v(i7, false);
        int i10 = 0;
        int i11 = i7;
        while (true) {
            lVar.k(xVar.f14162a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f11059f = 0;
                i11++;
                if (i11 - i7 >= 8192) {
                    break;
                }
                lVar.v(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.f14162a;
                if (bArr.length < 6) {
                    e10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    e10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    e10 = f3.b.e((b10 & 192) >> 6, b10 & 63);
                }
                if (e10 == -1) {
                    break;
                }
                lVar.v(e10 - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19571a.g(qVar, new g0(0, 1));
        qVar.U0();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19573c = false;
        this.f19571a.d();
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.f19572b;
        int read = pVar.read(xVar.f14162a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z9 = this.f19573c;
        b bVar = this.f19571a;
        if (!z9) {
            bVar.f19586o = 0L;
            this.f19573c = true;
        }
        bVar.c(xVar);
        return 0;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
