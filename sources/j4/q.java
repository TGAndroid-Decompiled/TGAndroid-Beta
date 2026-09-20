package j4;

import c3.h0;
import i2.l0;
public final class q implements i {
    public final c0 f12770a;
    public final boolean f12771b;
    public final boolean f12772c;
    public long f12774g;
    public String f12775i;
    public h0 f12776j;
    public p f12777k;
    public boolean f12778l;
    public boolean f12780n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 e = new l0(8);
    public final l0 f12773f = new l0(6);
    public long f12779m = -9223372036854775807L;
    public final e2.v f12781o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12770a = c0Var;
        this.f12771b = z10;
        this.f12772c = z11;
    }

    public final void a(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, int, int, long):void");
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12776j);
        String str = e2.d0.f7888a;
        int i12 = vVar.f7935b;
        int i13 = vVar.f7936c;
        byte[] bArr = vVar.f7934a;
        this.f12774g += vVar.a();
        this.f12776j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.o.b(bArr, i12, i13, this.h);
            if (b10 == i13) {
                c(i12, i13, bArr);
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
                c(i12, b10, bArr);
            }
            int i16 = i13 - b10;
            long j3 = this.f12774g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            a(j3, i16, i11, this.f12779m);
            h(i14, j3, this.f12779m);
            i12 = b10 + i10;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.f12774g = 0L;
        this.f12780n = false;
        this.f12779m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.e.g();
        this.f12773f.g();
        this.f12770a.d.c(0);
        p pVar = this.f12777k;
        if (pVar != null) {
            pVar.f12761k = false;
            pVar.f12765o = false;
            o oVar = pVar.f12764n;
            oVar.f12742b = false;
            oVar.f12741a = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12775i = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12776j = Z1;
        this.f12777k = new p(Z1, this.f12771b, this.f12772c);
        this.f12770a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f12776j);
        String str = e2.d0.f7888a;
        if (z10) {
            this.f12770a.d.c(0);
            a(this.f12774g, 0, 0, this.f12779m);
            h(9, this.f12774g, this.f12779m);
            a(this.f12774g, 0, 0, this.f12779m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        boolean z10;
        this.f12779m = j3;
        boolean z11 = this.f12780n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12780n = z10 | z11;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f12778l || this.f12777k.f12756c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12773f.h(i10);
        p pVar = this.f12777k;
        boolean z10 = this.f12780n;
        pVar.f12759i = i10;
        pVar.f12762l = j10;
        pVar.f12760j = j3;
        pVar.f12769s = z10;
        if (!pVar.f12755b || i10 != 1) {
            if (pVar.f12756c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12763m;
        pVar.f12763m = pVar.f12764n;
        pVar.f12764n = oVar;
        oVar.f12742b = false;
        oVar.f12741a = false;
        pVar.h = 0;
        pVar.f12761k = true;
    }
}
