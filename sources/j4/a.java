package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class a implements c3.o {
    public final b f13980a = new b("audio/ac3");
    public final e2.x f13981b = new e2.x(2786);
    public boolean f13982c;

    @Override
    public final boolean a(c3.p pVar) {
        c3.l lVar;
        int e;
        e2.x xVar = new e2.x(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.j(xVar.f8291a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            lVar.v(z10, false);
        }
        lVar.f4645f = 0;
        lVar.v(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.j(xVar.f8291a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f4645f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.v(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.f8291a;
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
                lVar.v(e - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f13980a.d(qVar, new f0(0, 1));
        qVar.H();
        qVar.g0(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        this.f13982c = false;
        this.f13980a.c();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        e2.x xVar = this.f13981b;
        int read = pVar.read(xVar.f8291a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f13982c;
        b bVar = this.f13980a;
        if (!z10) {
            bVar.f13994o = 0L;
            this.f13982c = true;
        }
        bVar.a(xVar);
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
