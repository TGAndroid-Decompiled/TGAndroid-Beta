package j4;

import c3.h0;
import i2.l0;
public final class q implements i {
    public final c0 f12769a;
    public final boolean f12770b;
    public final boolean f12771c;
    public long f12773g;
    public String f12774i;
    public h0 f12775j;
    public p f12776k;
    public boolean f12777l;
    public boolean f12779n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 e = new l0(8);
    public final l0 f12772f = new l0(6);
    public long f12778m = -9223372036854775807L;
    public final e2.v f12780o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12769a = c0Var;
        this.f12770b = z10;
        this.f12771c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12775j);
        String str = e2.d0.f7888a;
        int i12 = vVar.f7935b;
        int i13 = vVar.f7936c;
        byte[] bArr = vVar.f7934a;
        this.f12773g += vVar.a();
        this.f12775j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.o.b(bArr, i12, i13, this.h);
            if (b10 == i13) {
                g(i12, i13, bArr);
                return;
            }
            int i14 = bArr[b10 + 3] & 31;
            if (b10 > 0 && bArr[b10 - 1] == 0) {
                b10--;
                i10 = 4;
            } else {
                i10 = 3;
            }
            int i15 = b10 - i12;
            if (i15 > 0) {
                g(i12, b10, bArr);
            }
            int i16 = i13 - b10;
            long j3 = this.f12773g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j3, i16, i11, this.f12778m);
            h(i14, j3, this.f12778m);
            i12 = b10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f12773g = 0L;
        this.f12779n = false;
        this.f12778m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.e.g();
        this.f12772f.g();
        this.f12769a.d.c(0);
        p pVar = this.f12776k;
        if (pVar != null) {
            pVar.f12760k = false;
            pVar.f12764o = false;
            o oVar = pVar.f12763n;
            oVar.f12741b = false;
            oVar.f12740a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12774i = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12775j = Z1;
        this.f12776k = new p(Z1, this.f12770b, this.f12771c);
        this.f12769a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12775j);
        String str = e2.d0.f7888a;
        if (z10) {
            this.f12769a.d.c(0);
            b(this.f12773g, 0, 0, this.f12778m);
            h(9, this.f12773g, this.f12778m);
            b(this.f12773g, 0, 0, this.f12778m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        boolean z10;
        this.f12778m = j3;
        boolean z11 = this.f12779n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12779n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f12777l || this.f12776k.f12755c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12772f.h(i10);
        p pVar = this.f12776k;
        boolean z10 = this.f12779n;
        pVar.f12758i = i10;
        pVar.f12761l = j10;
        pVar.f12759j = j3;
        pVar.f12768s = z10;
        if (!pVar.f12754b || i10 != 1) {
            if (pVar.f12755c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12762m;
        pVar.f12762m = pVar.f12763n;
        pVar.f12763n = oVar;
        oVar.f12741b = false;
        oVar.f12740a = false;
        pVar.h = 0;
        pVar.f12760k = true;
    }
}
