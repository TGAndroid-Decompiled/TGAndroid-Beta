package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements c3.o {
    public final int f9422a;
    public final e2.x d;
    public final a4.g e;
    public c3.q f9425f;
    public long f9426g;
    public boolean f9428j;
    public boolean f9429k;
    public boolean f9430l;
    public final e f9423b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.x f9424c = new e2.x(2048);
    public int f9427i = -1;
    public long h = -1;

    public d(int i10) {
        this.f9422a = i10;
        e2.x xVar = new e2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f6207a;
        this.e = new a4.g(bArr, bArr.length);
    }

    @Override
    public final boolean a(c3.p pVar) {
        int g10 = g(pVar);
        int i10 = g10;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.x xVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.j(xVar.f6207a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.j(xVar.f6207a, 0, 4, false);
                a4.g gVar = this.e;
                gVar.d0(14);
                int i13 = gVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f3672f = 0;
                    lVar.r(i10, false);
                } else {
                    lVar.r(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f3672f = 0;
                lVar.r(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f9425f = qVar;
        this.f9423b.f(qVar, new g0(0, 1));
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f9429k = false;
        this.f9423b.e();
        this.f9426g = j11;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d.f(c3.p, c3.s):int");
    }

    public final int g(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.x xVar = this.d;
            pVar.b(0, 10, xVar.f6207a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            pVar.l(z10);
        }
        pVar.m();
        pVar.l(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
