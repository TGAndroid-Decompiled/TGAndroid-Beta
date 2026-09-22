package j4;

import c3.h0;
import i2.l0;
public final class q implements i {
    public final c0 f12768a;
    public final boolean f12769b;
    public final boolean f12770c;
    public long f12772g;
    public String f12773i;
    public h0 f12774j;
    public p f12775k;
    public boolean f12776l;
    public boolean f12778n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 e = new l0(8);
    public final l0 f12771f = new l0(6);
    public long f12777m = -9223372036854775807L;
    public final e2.v f12779o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f12768a = c0Var;
        this.f12769b = z10;
        this.f12770c = z11;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12774j);
        String str = e2.d0.f7885a;
        int i12 = vVar.f7932b;
        int i13 = vVar.f7933c;
        byte[] bArr = vVar.f7931a;
        this.f12772g += vVar.a();
        this.f12774j.d(vVar.a(), vVar);
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
            long j3 = this.f12772g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            b(j3, i16, i11, this.f12777m);
            h(i14, j3, this.f12777m);
            i12 = b10 + i10;
        }
    }

    public final void b(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.b(long, int, int, long):void");
    }

    @Override
    public final void c() {
        this.f12772g = 0L;
        this.f12778n = false;
        this.f12777m = -9223372036854775807L;
        f2.o.a(this.h);
        this.d.g();
        this.e.g();
        this.f12771f.g();
        this.f12768a.d.c(0);
        p pVar = this.f12775k;
        if (pVar != null) {
            pVar.f12759k = false;
            pVar.f12763o = false;
            o oVar = pVar.f12762n;
            oVar.f12740b = false;
            oVar.f12739a = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12773i = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12774j = Z1;
        this.f12775k = new p(Z1, this.f12769b, this.f12770c);
        this.f12768a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12774j);
        String str = e2.d0.f7885a;
        if (z10) {
            this.f12768a.d.c(0);
            b(this.f12772g, 0, 0, this.f12777m);
            h(9, this.f12772g, this.f12777m);
            b(this.f12772g, 0, 0, this.f12777m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        boolean z10;
        this.f12777m = j3;
        boolean z11 = this.f12778n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12778n = z10 | z11;
    }

    public final void g(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.g(int, int, byte[]):void");
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f12776l || this.f12775k.f12754c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f12771f.h(i10);
        p pVar = this.f12775k;
        boolean z10 = this.f12778n;
        pVar.f12757i = i10;
        pVar.f12760l = j10;
        pVar.f12758j = j3;
        pVar.f12767s = z10;
        if (!pVar.f12753b || i10 != 1) {
            if (pVar.f12754c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f12761m;
        pVar.f12761m = pVar.f12762n;
        pVar.f12762n = oVar;
        oVar.f12740b = false;
        oVar.f12739a = false;
        pVar.h = 0;
        pVar.f12759k = true;
    }
}
