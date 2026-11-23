package m4;

import f3.i0;
import l2.l0;
public final class q implements i {
    public final c0 f20705a;
    public final boolean f20706b;
    public final boolean f20707c;
    public long f20710g;
    public String f20711i;
    public i0 f20712j;
    public p f20713k;
    public boolean f20714l;
    public boolean f20716n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f20708e = new l0(8);
    public final l0 f20709f = new l0(6);
    public long f20715m = -9223372036854775807L;
    public final h2.x f20717o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20705a = c0Var;
        this.f20706b = z10;
        this.f20707c = z11;
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
        this.f20712j.getClass();
        String str = h2.l0.f13778a;
        int i11 = xVar.f13829b;
        int i12 = xVar.f13830c;
        byte[] bArr = xVar.f13828a;
        this.f20710g += xVar.a();
        this.f20712j.b(xVar.a(), xVar);
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
            long j3 = this.f20710g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20715m, i17, i10);
            h(j3, i13, this.f20715m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20710g = 0L;
        this.f20716n = false;
        this.f20715m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20708e.g();
        this.f20709f.g();
        this.f20705a.d.r(0);
        p pVar = this.f20713k;
        if (pVar != null) {
            pVar.f20696k = false;
            pVar.f20700o = false;
            o oVar = pVar.f20699n;
            oVar.f20675b = false;
            oVar.f20674a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20712j.getClass();
        String str = h2.l0.f13778a;
        if (z10) {
            this.f20705a.d.r(0);
            a(this.f20710g, this.f20715m, 0, 0);
            h(this.f20710g, 9, this.f20715m);
            a(this.f20710g, this.f20715m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20715m = j3;
        boolean z11 = this.f20716n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20716n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20711i = (String) f0Var.f20611e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20610c, 2);
        this.f20712j = d2;
        this.f20713k = new p(d2, this.f20706b, this.f20707c);
        this.f20705a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20714l || this.f20713k.f20690c) {
            this.d.h(i7);
            this.f20708e.h(i7);
        }
        this.f20709f.h(i7);
        p pVar = this.f20713k;
        boolean z10 = this.f20716n;
        pVar.f20694i = i7;
        pVar.f20697l = j10;
        pVar.f20695j = j3;
        pVar.f20704s = z10;
        if (!pVar.f20689b || i7 != 1) {
            if (pVar.f20690c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20698m;
        pVar.f20698m = pVar.f20699n;
        pVar.f20699n = oVar;
        oVar.f20675b = false;
        oVar.f20674a = false;
        pVar.h = 0;
        pVar.f20696k = true;
    }
}
