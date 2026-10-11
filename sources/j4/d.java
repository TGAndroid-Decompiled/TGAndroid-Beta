package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class d implements c3.o {
    public final int f13752a;
    public final e2.v d;
    public final a4.g f13755e;
    public c3.q f13756f;
    public long f13757g;
    public boolean f13759j;
    public boolean f13760k;
    public boolean f13761l;
    public final e f13753b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.v f13754c = new e2.v(2048);
    public int f13758i = -1;
    public long h = -1;

    public d(int i10) {
        this.f13752a = i10;
        e2.v vVar = new e2.v(10);
        this.d = vVar;
        byte[] bArr = vVar.f8583a;
        this.f13755e = new a4.g(bArr, bArr.length);
    }

    @Override
    public final boolean a(c3.p pVar) {
        int b10 = b(pVar);
        int i10 = b10;
        int i11 = 0;
        int i12 = 0;
        do {
            e2.v vVar = this.d;
            c3.l lVar = (c3.l) pVar;
            lVar.i(vVar.f8583a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.i(vVar.f8583a, 0, 4, false);
                a4.g gVar = this.f13755e;
                gVar.q(14);
                int i13 = gVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f4142f = 0;
                    lVar.v(i10, false);
                } else {
                    lVar.v(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f4142f = 0;
                lVar.v(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - b10 < 8192);
        return false;
    }

    public final int b(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.v vVar = this.d;
            pVar.a(0, 10, vVar.f8583a);
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
    public final void g(c3.q qVar) {
        this.f13756f = qVar;
        this.f13753b.e(qVar, new f0(0, 1));
        qVar.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13760k = false;
        this.f13753b.d();
        this.f13757g = j10;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8751b;
        return a1.f8714e;
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
