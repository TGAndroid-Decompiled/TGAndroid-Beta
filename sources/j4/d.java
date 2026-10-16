package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements c3.o {
    public final int f12595a;
    public final e2.x d;
    public final a4.g e;
    public c3.q f12598f;
    public long f12599g;
    public boolean f12601j;
    public boolean f12602k;
    public boolean f12603l;
    public final e f12596b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.x f12597c = new e2.x(2048);
    public int f12600i = -1;
    public long h = -1;

    public d(int i10) {
        this.f12595a = i10;
        e2.x xVar = new e2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f8414a;
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
            lVar.j(xVar.f8414a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.j(xVar.f8414a, 0, 4, false);
                a4.g gVar = this.e;
                gVar.m(14);
                int g11 = gVar.g(13);
                if (g11 <= 6) {
                    i10++;
                    lVar.f4274f = 0;
                    lVar.v(i10, false);
                } else {
                    lVar.v(g11 - 6, false);
                    i12 += g11;
                }
            } else {
                i10++;
                lVar.f4274f = 0;
                lVar.v(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f12598f = qVar;
        this.f12596b.d(qVar, new f0(0, 1));
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f12602k = false;
        this.f12596b.c();
        this.f12599g = j11;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
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
            pVar.b(0, 10, xVar.f8414a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            pVar.l(z10);
        }
        pVar.q();
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
