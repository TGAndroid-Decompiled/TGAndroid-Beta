package j4;

import e9.a1;
import e9.i0;
import java.util.List;
public final class d implements c3.o {
    public final int f13716a;
    public final e2.v d;
    public final a4.h f13719e;
    public c3.q f13720f;
    public long f13721g;
    public boolean f13723j;
    public boolean f13724k;
    public boolean f13725l;
    public final e f13717b = new e(0, null, "audio/mp4a-latm", true);
    public final e2.v f13718c = new e2.v(2048);
    public int f13722i = -1;
    public long h = -1;

    public d(int i10) {
        this.f13716a = i10;
        e2.v vVar = new e2.v(10);
        this.d = vVar;
        byte[] bArr = vVar.f8590a;
        this.f13719e = new a4.h(bArr, bArr.length);
    }

    public final int a(c3.p pVar) {
        int i10 = 0;
        while (true) {
            e2.v vVar = this.d;
            pVar.b(0, 10, vVar.f8590a);
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
            lVar.f(vVar.f8590a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.f(vVar.f8590a, 0, 4, false);
                a4.h hVar = this.f13719e;
                hVar.q(14);
                int i13 = hVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f4093f = 0;
                    lVar.s(i10, false);
                } else {
                    lVar.s(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f4093f = 0;
                lVar.s(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a2 < 8192);
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        this.f13720f = qVar;
        this.f13717b.d(qVar, new f0(0, 1));
        qVar.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f13724k = false;
        this.f13717b.c();
        this.f13721g = j10;
    }

    @Override
    public final List i() {
        e9.g0 g0Var = i0.f8758b;
        return a1.f8721e;
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
