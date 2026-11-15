package m4;

import h9.i0;
import h9.s1;
import java.util.List;
public final class d implements f3.o {
    public final int f20197a;
    public final h2.x d;
    public final d4.f f20200e;
    public f3.q f20201f;
    public long f20202g;
    public boolean f20204j;
    public boolean f20205k;
    public boolean f20206l;
    public final e f20198b = new e(0, null, "audio/mp4a-latm", true);
    public final h2.x f20199c = new h2.x(2048);
    public int f20203i = -1;
    public long h = -1;

    public d(int i7) {
        this.f20197a = i7;
        h2.x xVar = new h2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f13521a;
        this.f20200e = new d4.f(bArr, bArr.length);
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
            lVar.h(xVar.f13521a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.h(xVar.f13521a, 0, 4, false);
                d4.f fVar = this.f20200e;
                fVar.J(14);
                int j3 = fVar.j(13);
                if (j3 <= 6) {
                    i7++;
                    lVar.f10867f = 0;
                    lVar.n(i7, false);
                } else {
                    lVar.n(j3 - 6, false);
                    i11 += j3;
                }
            } else {
                i7++;
                lVar.f10867f = 0;
                lVar.n(i7, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i7 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        this.f20201f = qVar;
        this.f20198b.g(qVar, new f0(0, 1));
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f20205k = false;
        this.f20198b.d();
        this.f20202g = j10;
    }

    @Override
    public final List e() {
        h9.g0 g0Var = i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: m4.d.f(f3.p, f3.s):int");
    }

    public final int g(f3.p pVar) {
        int i7 = 0;
        while (true) {
            h2.x xVar = this.d;
            pVar.c(0, 10, xVar.f13521a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i7 += z10 + 10;
            pVar.k(z10);
        }
        pVar.l();
        pVar.k(i7);
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
