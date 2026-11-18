package m4;

import f3.i0;
import l2.l0;
public final class q implements i {
    public final c0 f20708a;
    public final boolean f20709b;
    public final boolean f20710c;
    public long f20713g;
    public String f20714i;
    public i0 f20715j;
    public p f20716k;
    public boolean f20717l;
    public boolean f20719n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f20711e = new l0(8);
    public final l0 f20712f = new l0(6);
    public long f20718m = -9223372036854775807L;
    public final h2.x f20720o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f20708a = c0Var;
        this.f20709b = z10;
        this.f20710c = z11;
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
        this.f20715j.getClass();
        String str = h2.l0.f13783a;
        int i11 = xVar.f13834b;
        int i12 = xVar.f13835c;
        byte[] bArr = xVar.f13833a;
        this.f20713g += xVar.a();
        this.f20715j.b(xVar.a(), xVar);
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
            long j3 = this.f20713g - i17;
            if (i16 < 0) {
                i10 = -i16;
            } else {
                i10 = 0;
            }
            a(j3, this.f20718m, i17, i10);
            h(j3, i13, this.f20718m);
            i11 = i14 + i15;
        }
    }

    @Override
    public final void d() {
        this.f20713g = 0L;
        this.f20719n = false;
        this.f20718m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.f20711e.g();
        this.f20712f.g();
        this.f20708a.d.r(0);
        p pVar = this.f20716k;
        if (pVar != null) {
            pVar.f20699k = false;
            pVar.f20703o = false;
            o oVar = pVar.f20702n;
            oVar.f20678b = false;
            oVar.f20677a = false;
        }
    }

    @Override
    public final void e(boolean z10) {
        this.f20715j.getClass();
        String str = h2.l0.f13783a;
        if (z10) {
            this.f20708a.d.r(0);
            a(this.f20713g, this.f20718m, 0, 0);
            h(this.f20713g, 9, this.f20718m);
            a(this.f20713g, this.f20718m, 0, 0);
        }
    }

    @Override
    public final void f(int i7, long j3) {
        boolean z10;
        this.f20718m = j3;
        boolean z11 = this.f20719n;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20719n = z10 | z11;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20714i = (String) f0Var.f20614e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20613c, 2);
        this.f20715j = d2;
        this.f20716k = new p(d2, this.f20709b, this.f20710c);
        this.f20708a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.f20717l || this.f20716k.f20693c) {
            this.d.h(i7);
            this.f20711e.h(i7);
        }
        this.f20712f.h(i7);
        p pVar = this.f20716k;
        boolean z10 = this.f20719n;
        pVar.f20697i = i7;
        pVar.f20700l = j10;
        pVar.f20698j = j3;
        pVar.f20707s = z10;
        if (!pVar.f20692b || i7 != 1) {
            if (pVar.f20693c) {
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f20701m;
        pVar.f20701m = pVar.f20702n;
        pVar.f20702n = oVar;
        oVar.f20678b = false;
        oVar.f20677a = false;
        pVar.h = 0;
        pVar.f20699k = true;
    }
}
