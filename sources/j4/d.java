package j4;

import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements c3.q {
    public final int f14050a;
    public final e2.x d;
    public final a4.g e;
    public c3.s f14053f;
    public long f14054g;
    public boolean f14056j;
    public boolean f14057k;
    public boolean f14058l;
    public final e f14051b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.x f14052c = new e2.x(2048);
    public int f14055i = -1;
    public long h = -1;

    public d(int i10) {
        this.f14050a = i10;
        e2.x xVar = new e2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f8298a;
        this.e = new a4.g(bArr, bArr.length);
    }

    @Override
    public final boolean a(c3.r rVar) {
        int g10 = g(rVar);
        int i10 = g10;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.x xVar = this.d;
            c3.l lVar = (c3.l) rVar;
            lVar.j(xVar.f8298a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.j(xVar.f8298a, 0, 4, false);
                a4.g gVar = this.e;
                gVar.m(14);
                int g11 = gVar.g(13);
                if (g11 <= 6) {
                    i10++;
                    lVar.f4648f = 0;
                    lVar.u(i10, false);
                } else {
                    lVar.u(g11 - 6, false);
                    i12 += g11;
                }
            } else {
                i10++;
                lVar.f4648f = 0;
                lVar.u(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - g10 < 8192);
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        this.f14053f = sVar;
        this.f14051b.d(sVar, new f0(0, 1));
        sVar.C();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f14057k = false;
        this.f14051b.c();
        this.f14054g = j11;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r19, c3.u r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d.f(c3.r, c3.u):int");
    }

    public final int g(c3.r rVar) {
        int i10 = 0;
        while (true) {
            e2.x xVar = this.d;
            rVar.a(0, 10, xVar.f8298a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            rVar.l(z10);
        }
        rVar.q();
        rVar.l(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
