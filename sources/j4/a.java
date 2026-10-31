package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements c3.o {
    public final b f9392a = new b("audio/ac3");
    public final e2.x f9393b = new e2.x(2786);
    public boolean f9394c;

    @Override
    public final boolean a(c3.p pVar) {
        c3.l lVar;
        int e;
        e2.x xVar = new e2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.j(xVar.f6207a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            lVar.r(z10, false);
        }
        lVar.f3672f = 0;
        lVar.r(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.j(xVar.f6207a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f3672f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.r(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.f6207a;
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
                lVar.r(e - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f9392a.f(qVar, new g0(0, 1));
        qVar.Q0();
        qVar.G1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f9394c = false;
        this.f9392a.e();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f9393b;
        int read = pVar.read(xVar.f6207a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f9394c;
        b bVar = this.f9392a;
        if (!z10) {
            bVar.f9414o = 0L;
            this.f9394c = true;
        }
        bVar.c(xVar);
        return 0;
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
