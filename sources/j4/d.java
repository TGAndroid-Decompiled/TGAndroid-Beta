package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class d implements c3.o {
    public final int f13750a;
    public final e2.v d;
    public final a4.g f13753e;
    public c3.q f13754f;
    public long f13755g;
    public boolean f13757j;
    public boolean f13758k;
    public boolean f13759l;
    public final e f13751b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.v f13752c = new e2.v(2048);
    public int f13756i = -1;
    public long h = -1;

    public d(int i10) {
        this.f13750a = i10;
        e2.v vVar = new e2.v(10);
        this.d = vVar;
        byte[] bArr = vVar.f8581a;
        this.f13753e = new a4.g(bArr, bArr.length);
    }

    public final int a(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.v vVar = this.d;
            pVar.b(0, 10, vVar.f8581a);
            vVar.J(0);
            if (vVar.A() != 4801587) {
                break;
            }
            vVar.K(3);
            int w10 = vVar.w();
            i10 += w10 + 10;
            pVar.h(w10);
        }
        pVar.m();
        pVar.h(i10);
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
            lVar.f(vVar.f8581a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.f(vVar.f8581a, 0, 4, false);
                a4.g gVar = this.f13753e;
                gVar.q(14);
                int i13 = gVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f4141f = 0;
                    lVar.s(i10, false);
                } else {
                    lVar.s(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f4141f = 0;
                lVar.s(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13754f = qVar;
        this.f13751b.e(qVar, new f0(0, 1));
        qVar.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13758k = false;
        this.f13751b.d();
        this.f13755g = j10;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8749b;
        return a1.f8712e;
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
