package m4;

import h9.i0;
import h9.s1;
import java.util.List;
public final class a implements f3.o {
    public final b f20170a = new b("audio/ac3");
    public final h2.x f20171b = new h2.x(2786);
    public boolean f20172c;

    @Override
    public final boolean b(f3.p pVar) {
        f3.l lVar;
        int e10;
        h2.x xVar = new h2.x(10);
        int i7 = 0;
        while (true) {
            lVar = (f3.l) pVar;
            lVar.h(xVar.f13521a, 0, 10, false);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i7 += z10 + 10;
            lVar.n(z10, false);
        }
        lVar.f10867f = 0;
        lVar.n(i7, false);
        int i10 = 0;
        int i11 = i7;
        while (true) {
            lVar.h(xVar.f13521a, 0, 6, false);
            xVar.N(0);
            if (xVar.H() != 2935) {
                lVar.f10867f = 0;
                i11++;
                if (i11 - i7 >= 8192) {
                    break;
                }
                lVar.n(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = xVar.f13521a;
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
                lVar.n(e10 - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f20170a.g(qVar, new f0(0, 1));
        qVar.d1();
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        this.f20172c = false;
        this.f20170a.d();
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        h2.x xVar = this.f20171b;
        int read = pVar.read(xVar.f13521a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xVar.N(0);
        xVar.M(read);
        boolean z10 = this.f20172c;
        b bVar = this.f20170a;
        if (!z10) {
            bVar.f20185o = 0L;
            this.f20172c = true;
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
