package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class a implements c3.o {
    public final b f13726a = new b("audio/ac3");
    public final e2.v f13727b = new e2.v(2786);
    public boolean f13728c;

    @Override
    public final boolean a(c3.p pVar) {
        c3.l lVar;
        int f7;
        e2.v vVar = new e2.v(10);
        int i10 = 0;
        while (true) {
            lVar = (c3.l) pVar;
            lVar.h(vVar.f8584a, 0, 10, false);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i10 += w10 + 10;
            lVar.v(w10, false);
        }
        lVar.f4142f = 0;
        lVar.v(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.h(vVar.f8584a, 0, 6, false);
            vVar.J(0);
            if (vVar.D() != 2935) {
                lVar.f4142f = 0;
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
                byte[] bArr = vVar.f8584a;
                if (bArr.length < 6) {
                    f7 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    f7 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    f7 = c3.b.f((b10 & 192) >> 6, b10 & 63);
                }
                if (f7 == -1) {
                    break;
                }
                lVar.v(f7 - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13726a.d(qVar, new f0(0, 1));
        qVar.k1();
        qVar.d2(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13728c = false;
        this.f13726a.c();
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        e2.v vVar = this.f13727b;
        int read = pVar.read(vVar.f8584a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        vVar.J(0);
        vVar.I(read);
        boolean z10 = this.f13728c;
        b bVar = this.f13726a;
        if (!z10) {
            bVar.f13741o = 0L;
            this.f13728c = true;
        }
        bVar.a(vVar);
        return 0;
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
