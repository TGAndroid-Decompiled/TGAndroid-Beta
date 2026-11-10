package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class d implements f3.o {
    public final int f19606a;
    public final h2.x d;
    public final d4.f f19609e;
    public f3.q f19610f;
    public long f19611g;
    public boolean f19613j;
    public boolean f19614k;
    public boolean f19615l;
    public final e f19607b = new e(0, null, "audio/mp4a-latm", true);
    public final h2.x f19608c = new h2.x(2048);
    public int f19612i = -1;
    public long h = -1;

    public d(int i7) {
        this.f19606a = i7;
        h2.x xVar = new h2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f14164a;
        this.f19609e = new d4.f(bArr, bArr.length);
    }

    @Override
    public final boolean b(f3.p pVar) {
        int g10 = g(pVar);
        int i7 = g10;
        int i10 = 0;
        int i11 = 0;
        do {
            h2.x xVar = this.d;
            f3.l lVar = (f3.l) pVar;
            lVar.k(xVar.f14164a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.k(xVar.f14164a, 0, 4, false);
                d4.f fVar = this.f19609e;
                fVar.J(14);
                int j3 = fVar.j(13);
                if (j3 <= 6) {
                    i7++;
                    lVar.f11064f = 0;
                    lVar.v(i7, false);
                } else {
                    lVar.v(j3 - 6, false);
                    i11 += j3;
                }
            } else {
                i7++;
                lVar.f11064f = 0;
                lVar.v(i7, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i7 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19610f = qVar;
        this.f19607b.g(qVar, new g0(0, 1));
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19614k = false;
        this.f19607b.d();
        this.f19611g = j10;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d.f(f3.p, f3.s):int");
    }

    public final int g(f3.p pVar) {
        int i7 = 0;
        while (true) {
            h2.x xVar = this.d;
            pVar.b(0, 10, xVar.f14164a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z9 = xVar.z();
            i7 += z9 + 10;
            pVar.m(z9);
        }
        pVar.q();
        pVar.m(i7);
        if (this.h == -1) {
            this.h = i7;
        }
        return i7;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
