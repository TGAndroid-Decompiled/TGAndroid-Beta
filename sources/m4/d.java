package m4;

import h9.i0;
import h9.t1;
import java.util.List;
public final class d implements f3.o {
    public final int f19598a;
    public final h2.x d;
    public final d4.f f19601e;
    public f3.q f19602f;
    public long f19603g;
    public boolean f19605j;
    public boolean f19606k;
    public boolean f19607l;
    public final e f19599b = new e(0, null, "audio/mp4a-latm", true);
    public final h2.x f19600c = new h2.x(2048);
    public int f19604i = -1;
    public long h = -1;

    public d(int i7) {
        this.f19598a = i7;
        h2.x xVar = new h2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f14162a;
        this.f19601e = new d4.f(bArr, bArr.length);
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
            lVar.k(xVar.f14162a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.k(xVar.f14162a, 0, 4, false);
                d4.f fVar = this.f19601e;
                fVar.J(14);
                int j3 = fVar.j(13);
                if (j3 <= 6) {
                    i7++;
                    lVar.f11059f = 0;
                    lVar.v(i7, false);
                } else {
                    lVar.v(j3 - 6, false);
                    i11 += j3;
                }
            } else {
                i7++;
                lVar.f11059f = 0;
                lVar.v(i7, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i7 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f19602f = qVar;
        this.f19599b.g(qVar, new g0(0, 1));
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f19606k = false;
        this.f19599b.d();
        this.f19603g = j10;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d.f(f3.p, f3.s):int");
    }

    public final int g(f3.p pVar) {
        int i7 = 0;
        while (true) {
            h2.x xVar = this.d;
            pVar.b(0, 10, xVar.f14162a);
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
