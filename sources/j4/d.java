package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class d implements c3.o {
    public final int f13265a;
    public final e2.v d;
    public final a4.h f13268e;
    public c3.q f13269f;
    public long f13270g;
    public boolean f13272j;
    public boolean f13273k;
    public boolean f13274l;
    public final e f13266b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.v f13267c = new e2.v(2048);
    public int f13271i = -1;
    public long h = -1;

    public d(int i10) {
        this.f13265a = i10;
        e2.v vVar = new e2.v(10);
        this.d = vVar;
        byte[] bArr = vVar.f8817a;
        this.f13268e = new a4.h(bArr, bArr.length);
    }

    public final int a(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.v vVar = this.d;
            pVar.b(0, 10, vVar.f8817a);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i10 += w10 + 10;
            pVar.l(w10);
        }
        pVar.q();
        pVar.l(i10);
        if (this.h == -1) {
            this.h = i10;
        }
        return i10;
    }

    @Override
    public final boolean b(c3.p pVar) {
        int a2 = a(pVar);
        int i10 = a2;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.v vVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.j(vVar.f8817a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.j(vVar.f8817a, 0, 4, false);
                a4.h hVar = this.f13268e;
                hVar.q(14);
                int i13 = hVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f4313f = 0;
                    lVar.v(i10, false);
                } else {
                    lVar.v(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f4313f = 0;
                lVar.v(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13269f = qVar;
        this.f13266b.e(qVar, new f0(0, 1));
        qVar.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13273k = false;
        this.f13266b.d();
        this.f13270g = j10;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8985b;
        return a1.f8948e;
    }

    @Override
    public final int m(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: j4.d.m(c3.p, c3.s):int");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
