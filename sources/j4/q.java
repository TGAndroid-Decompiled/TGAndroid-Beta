package j4;

import c3.h0;
import i2.l0;
public final class q implements i {
    public final c0 f13389a;
    public final boolean f13390b;
    public final boolean f13391c;
    public long f13394g;
    public String f13395i;
    public h0 f13396j;
    public p f13397k;
    public boolean f13398l;
    public boolean f13400n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 f13392e = new l0(8);
    public final l0 f13393f = new l0(6);
    public long f13399m = -9223372036854775807L;
    public final e2.v f13401o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f13389a = c0Var;
        this.f13390b = z10;
        this.f13391c = z11;
    }

    public final void a(long r26, int r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.a(long, int, int, long):void");
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13396j);
        String str = e2.d0.f8737a;
        int i12 = vVar.f8790b;
        int i13 = vVar.f8791c;
        byte[] bArr = vVar.f8789a;
        this.f13394g += vVar.a();
        this.f13396j.d(vVar.a(), vVar);
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
            long j3 = this.f13394g - i16;
            if (i15 < 0) {
                i11 = -i15;
            } else {
                i11 = 0;
            }
            a(j3, i16, i11, this.f13399m);
            h(i14, j3, this.f13399m);
            i12 = b10 + i10;
        }
    }

    public final void c(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: j4.q.c(int, int, byte[]):void");
    }

    @Override
    public final void d() {
        this.f13394g = 0L;
        this.f13400n = false;
        this.f13399m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.f13392e.g();
        this.f13393f.g();
        this.f13389a.d.c(0);
        p pVar = this.f13397k;
        if (pVar != null) {
            pVar.f13380k = false;
            pVar.f13384o = false;
            o oVar = pVar.f13383n;
            oVar.f13359b = false;
            oVar.f13358a = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13395i = f0Var.f13295e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13396j = R1;
        this.f13397k = new p(R1, this.f13390b, this.f13391c);
        this.f13389a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13396j);
        String str = e2.d0.f8737a;
        if (z10) {
            this.f13389a.d.c(0);
            a(this.f13394g, 0, 0, this.f13399m);
            h(9, this.f13394g, this.f13399m);
            a(this.f13394g, 0, 0, this.f13399m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        boolean z10;
        this.f13399m = j3;
        boolean z11 = this.f13400n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13400n = z10 | z11;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.f13398l || this.f13397k.f13374c) {
            this.d.h(i10);
            this.f13392e.h(i10);
        }
        this.f13393f.h(i10);
        p pVar = this.f13397k;
        boolean z10 = this.f13400n;
        pVar.f13378i = i10;
        pVar.f13381l = j10;
        pVar.f13379j = j3;
        pVar.f13388s = z10;
        if (!pVar.f13373b || i10 != 1) {
            if (pVar.f13374c) {
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f13382m;
        pVar.f13382m = pVar.f13383n;
        pVar.f13383n = oVar;
        oVar.f13359b = false;
        oVar.f13358a = false;
        pVar.h = 0;
        pVar.f13380k = true;
    }
}
