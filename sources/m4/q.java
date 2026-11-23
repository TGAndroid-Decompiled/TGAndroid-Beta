package m4;

import f3.j0;
import h2.l0;
import l2.m0;
public final class q implements i {
    public final c0 f20801a;
    public final boolean f20802b;
    public final boolean f20803c;
    public long f20806g;
    public String f20807i;
    public j0 f20808j;
    public p f20809k;
    public boolean f20810l;
    public boolean f20812n;
    public final boolean[] h = new boolean[3];
    public final m0 d = new m0(7);
    public final m0 f20804e = new m0(8);
    public final m0 f20805f = new m0(6);
    public long f20811m = -9223372036854775807L;
    public final h2.x f20813o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20801a = c0Var;
        this.f20802b = z10;
        this.f20803c = z11;
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
        this.f20808j.getClass();
        String str = l0.f13778a;
        int i11 = xVar.f13829b;
        int i12 = xVar.f13830c;
        byte[] bArr = xVar.f13828a;
        this.f20806g += xVar.a();
        this.f20808j.b(xVar.a(), xVar);
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
            long j3 = this.f20806g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20811m, i17, i10);
            h(j3, i13, this.f20811m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20806g = 0L;
        this.f20812n = false;
        this.f20811m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20804e.g();
        this.f20805f.g();
        this.f20801a.d.r(0);
        p pVar = this.f20809k;
        if (pVar != null) {
            pVar.f20792k = false;
            pVar.f20796o = false;
            o oVar = pVar.f20795n;
            oVar.f20771b = false;
            oVar.f20770a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20808j.getClass();
        String str = l0.f13778a;
        if (z10) {
            this.f20801a.d.r(0);
            a(this.f20806g, this.f20811m, 0, 0);
            h(this.f20806g, 9, this.f20811m);
            a(this.f20806g, this.f20811m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20811m = j3;
        boolean z11 = this.f20812n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20812n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20807i = (String) f0Var.f20707e;
        f0Var.c();
        j0 d2 = qVar.d2(f0Var.f20706c, 2);
        this.f20808j = d2;
        this.f20809k = new p(d2, this.f20802b, this.f20803c);
        this.f20801a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20810l || this.f20809k.f20786c) {
            this.d.h(i7);
            this.f20804e.h(i7);
        }
        this.f20805f.h(i7);
        p pVar = this.f20809k;
        boolean z10 = this.f20812n;
        pVar.f20790i = i7;
        pVar.f20793l = j10;
        pVar.f20791j = j3;
        pVar.f20800s = z10;
        if (!pVar.f20785b || i7 != 1) {
            if (pVar.f20786c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20794m;
        pVar.f20794m = pVar.f20795n;
        pVar.f20795n = oVar;
        oVar.f20771b = false;
        oVar.f20770a = false;
        pVar.h = 0;
        pVar.f20792k = true;
    }
}
