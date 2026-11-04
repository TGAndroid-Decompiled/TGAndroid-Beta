package l4;

import g9.i0;
import g9.s1;
import java.util.List;
public final class d implements e3.o {
    public final int f17767a;
    public final g2.y d;
    public final c4.f f17770e;
    public e3.q f17771f;
    public long f17772g;
    public boolean f17774j;
    public boolean f17775k;
    public boolean f17776l;
    public final e f17768b = new e(0, null, "audio/mp4a-latm", true);
    public final g2.y f17769c = new g2.y(2048);
    public int f17773i = -1;
    public long h = -1;

    public d(int i3) {
        this.f17767a = i3;
        g2.y yVar = new g2.y(10);
        this.d = yVar;
        byte[] bArr = yVar.f11923a;
        this.f17770e = new c4.f(bArr, bArr.length);
    }

    @Override
    public final boolean b(e3.p pVar) {
        int g7 = g(pVar);
        int i3 = g7;
        int i10 = 0;
        int i11 = 0;
        do {
            g2.y yVar = this.d;
            e3.l lVar = (e3.l) pVar;
            lVar.h(yVar.f11923a, 0, 2, false);
            yVar.N(0);
            if ((yVar.H() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                lVar.h(yVar.f11923a, 0, 4, false);
                c4.f fVar = this.f17770e;
                fVar.J(14);
                int j10 = fVar.j(13);
                if (j10 <= 6) {
                    i3++;
                    lVar.f9496f = 0;
                    lVar.w(i3, false);
                } else {
                    lVar.w(j10 - 6, false);
                    i11 += j10;
                }
            } else {
                i3++;
                lVar.f9496f = 0;
                lVar.w(i3, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i3 - g7 < 8192);
        return false;
    }

    @Override
    public final void c(e3.q qVar) {
        this.f17771f = qVar;
        this.f17768b.f(qVar, new f0(0, 1));
        qVar.L();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f17775k = false;
        this.f17768b.a();
        this.f17772g = j11;
    }

    @Override
    public final List e() {
        g9.g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r19, e3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: l4.d.f(e3.p, e3.s):int");
    }

    public final int g(e3.p pVar) {
        int i3 = 0;
        while (true) {
            g2.y yVar = this.d;
            pVar.c(0, 10, yVar.f11923a);
            yVar.N(0);
            if (yVar.D() != 4801587) {
                break;
            }
            yVar.O(3);
            int z10 = yVar.z();
            i3 += z10 + 10;
            pVar.n(z10);
        }
        pVar.o();
        pVar.n(i3);
        if (this.h == -1) {
            this.h = i3;
        }
        return i3;
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
