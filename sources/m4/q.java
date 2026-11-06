package m4;

import f3.j0;
import h2.m0;
import l2.o0;
public final class q implements i {
    public final c0 f19750a;
    public final boolean f19751b;
    public final boolean f19752c;
    public long f19755g;
    public String f19756i;
    public j0 f19757j;
    public p f19758k;
    public boolean f19759l;
    public boolean f19761n;
    public final boolean[] h = new boolean[3];
    public final o0 d = new o0(7);
    public final o0 f19753e = new o0(8);
    public final o0 f19754f = new o0(6);
    public long f19760m = -9223372036854775807L;
    public final h2.x f19762o = new h2.x();

    public q(c0 c0Var, boolean z9, boolean z10) {
        this.f19750a = c0Var;
        this.f19751b = z9;
        this.f19752c = z10;
    }

    public final void a(long r26, long r28, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: m4.q.a(long, long, int, int):void");
    }

    public final void b(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: m4.q.b(int, int, byte[]):void");
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        this.f19757j.getClass();
        String str = m0.f14112a;
        int i11 = xVar.f14163b;
        int i12 = xVar.f14164c;
        byte[] bArr = xVar.f14162a;
        this.f19755g += xVar.a();
        this.f19757j.b(xVar.a(), xVar);
        while (true) {
            int c10 = i2.o.c(bArr, i11, i12, this.h);
            if (c10 == i12) {
                b(i11, i12, bArr);
                return;
            }
            int i13 = bArr[c10 + 3] & 31;
            if (c10 > 0 && bArr[c10 - 1] == 0) {
                c10--;
                i7 = 4;
            } else {
                i7 = 3;
            }
            int i14 = c10;
            int i15 = i7;
            int i16 = i14 - i11;
            if (i16 > 0) {
                b(i11, i14, bArr);
            }
            int i17 = i12 - i14;
            long j3 = this.f19755g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f19760m, i17, i10);
            h(j3, i13, this.f19760m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f19755g = 0L;
        this.f19761n = false;
        this.f19760m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f19753e.g();
        this.f19754f.g();
        this.f19750a.d.r(0);
        p pVar = this.f19758k;
        if (pVar != null) {
            pVar.f19741k = false;
            pVar.f19745o = false;
            o oVar = pVar.f19744n;
            oVar.f19720b = false;
            oVar.f19719a = false;
        }
    }

    @Override
    public final void e(boolean z9) {
        this.f19757j.getClass();
        String str = m0.f14112a;
        if (z9) {
            this.f19750a.d.r(0);
            a(this.f19755g, this.f19760m, 0, 0);
            h(this.f19755g, 9, this.f19760m);
            a(this.f19755g, this.f19760m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z9;
        this.f19760m = j3;
        boolean z10 = this.f19761n;
        if ((i7 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19761n = z9 | z10;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19756i = (String) g0Var.f19671e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19670c, 2);
        this.f19757j = O1;
        this.f19758k = new p(O1, this.f19751b, this.f19752c);
        this.f19750a.b(qVar, g0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f19759l || this.f19758k.f19735c) {
            this.d.h(i7);
            this.f19753e.h(i7);
        }
        this.f19754f.h(i7);
        p pVar = this.f19758k;
        boolean z9 = this.f19761n;
        pVar.f19739i = i7;
        pVar.f19742l = j10;
        pVar.f19740j = j3;
        pVar.f19749s = z9;
        if (!pVar.f19734b || i7 != 1) {
            if (pVar.f19735c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f19743m;
        pVar.f19743m = pVar.f19744n;
        pVar.f19744n = oVar;
        oVar.f19720b = false;
        oVar.f19719a = false;
        pVar.h = 0;
        pVar.f19741k = true;
    }
}
