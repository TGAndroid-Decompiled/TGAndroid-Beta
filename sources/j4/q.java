package j4;

import c3.h0;
import i2.l0;
public final class q implements i {
    public final c0 f13415a;
    public final boolean f13416b;
    public final boolean f13417c;
    public long f13420g;
    public String f13421i;
    public h0 f13422j;
    public p f13423k;
    public boolean f13424l;
    public boolean f13426n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f13418e = new l0(8);
    public final l0 f13419f = new l0(6);
    public long f13425m = -9223372036854775807L;
    public final e2.v f13427o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13415a = c0Var;
        this.f13416b = z10;
        this.f13417c = z11;
    }

    public final void a(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, int, int, long):void");
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13422j);
        String str = e2.d0.f8765a;
        int i12 = vVar.f8818b;
        int i13 = vVar.f8819c;
        byte[] bArr = vVar.f8817a;
        this.f13420g += vVar.a();
        this.f13422j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i12, i13, this.h);
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
            long j3 = this.f13420g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            a(j3, i16, i11, this.f13425m);
            h(i14, j3, this.f13425m);
            i12 = b10 + i10;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.f13420g = 0L;
        this.f13426n = false;
        this.f13425m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.f13418e.g();
        this.f13419f.g();
        this.f13415a.d.c(0);
        p pVar = this.f13423k;
        if (pVar != null) {
            pVar.f13406k = false;
            pVar.f13410o = false;
            o oVar = pVar.f13409n;
            oVar.f13385b = false;
            oVar.f13384a = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13421i = f0Var.f13321e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13422j = R1;
        this.f13423k = new p(R1, this.f13416b, this.f13417c);
        this.f13415a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13422j);
        String str = e2.d0.f8765a;
        if (z10) {
            this.f13415a.d.c(0);
            a(this.f13420g, 0, 0, this.f13425m);
            h(9, this.f13420g, this.f13425m);
            a(this.f13420g, 0, 0, this.f13425m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        boolean z10;
        this.f13425m = j3;
        boolean z11 = this.f13426n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13426n = z10 | z11;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13424l || this.f13423k.f13400c) {
            this.d.h(i10);
            this.f13418e.h(i10);
        }
        this.f13419f.h(i10);
        p pVar = this.f13423k;
        boolean z10 = this.f13426n;
        pVar.f13404i = i10;
        pVar.f13407l = j10;
        pVar.f13405j = j3;
        pVar.f13414s = z10;
        if (!pVar.f13399b || i10 != 1) {
            if (pVar.f13400c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13408m;
        pVar.f13408m = pVar.f13409n;
        pVar.f13409n = oVar;
        oVar.f13385b = false;
        oVar.f13384a = false;
        pVar.h = 0;
        pVar.f13406k = true;
    }
}
