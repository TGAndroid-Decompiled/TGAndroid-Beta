package j4;

import f9.i0;
import f9.s1;
import java.util.List;
public final class d implements c3.o {
    public final int f15263a;
    public final e2.x d;
    public final a4.g e;
    public c3.q f15266f;
    public long f15267g;
    public boolean f15269j;
    public boolean f15270k;
    public boolean f15271l;
    public final e f15264b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.x f15265c = new e2.x(2048);
    public int f15268i = -1;
    public long h = -1;

    public d(int i10) {
        this.f15263a = i10;
        e2.x xVar = new e2.x(10);
        this.d = xVar;
        byte[] bArr = xVar.f9732a;
        this.e = new a4.g(bArr, bArr.length);
    }

    @Override
    public final boolean a(c3.p pVar) {
        int g7 = g(pVar);
        int i10 = g7;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.x xVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.h(xVar.f9732a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.h(xVar.f9732a, 0, 4, false);
                a4.g gVar = this.e;
                gVar.m(14);
                int g10 = gVar.g(13);
                if (g10 <= 6) {
                    i10++;
                    lVar.f6081f = 0;
                    lVar.s(i10, false);
                } else {
                    lVar.s(g10 - 6, false);
                    i12 += g10;
                }
            } else {
                i10++;
                lVar.f6081f = 0;
                lVar.s(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - g7 < 8192);
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        this.f15266f = qVar;
        this.f15264b.d(qVar, new f0(0, 1));
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f15270k = false;
        this.f15264b.c();
        this.f15267g = j11;
    }

    @Override
    public final List e() {
        f9.g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d.f(c3.p, c3.s):int");
    }

    public final int g(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.x xVar = this.d;
            pVar.b(0, 10, xVar.f9732a);
            xVar.N(0);
            if (xVar.D() != 4801587) {
                break;
            }
            xVar.O(3);
            int z10 = xVar.z();
            i10 += z10 + 10;
            pVar.j(z10);
        }
        pVar.p();
        pVar.j(i10);
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
