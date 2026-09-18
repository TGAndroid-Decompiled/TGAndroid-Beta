package j4;

import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Collections;
public final class s implements i {
    public final c0 f12791a;
    public String f12792b;
    public h0 f12793c;
    public r d;
    public boolean e;
    public long f12799l;
    public final boolean[] f12794f = new boolean[3];
    public final l0 f12795g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f12796i = new l0(34);
    public final l0 f12797j = new l0(39);
    public final l0 f12798k = new l0(40);
    public long f12800m = -9223372036854775807L;
    public final e2.v f12801n = new e2.v();

    public s(c0 c0Var) {
        this.f12791a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12793c);
        String str = e2.d0.f7887a;
        while (vVar.a() > 0) {
            int i12 = vVar.f7934b;
            int i13 = vVar.f7935c;
            byte[] bArr = vVar.f7933a;
            this.f12799l += vVar.a();
            this.f12793c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f12794f);
                if (b10 == i13) {
                    g(i12, i13, bArr);
                    return;
                }
                int i14 = (bArr[b10 + 3] & 126) >> 1;
                if (b10 > 0 && bArr[b10 - 1] == 0) {
                    b10--;
                    i10 = 4;
                } else {
                    i10 = 3;
                }
                int i15 = b10;
                int i16 = i15 - i12;
                if (i16 > 0) {
                    g(i12, i15, bArr);
                }
                int i17 = i13 - i15;
                long j3 = this.f12799l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                b(j3, i17, i11, this.f12800m);
                h(j3, i17, i14, this.f12800m);
                i12 = i15 + i10;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f12791a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.f12787j && rVar.f12785g) {
            rVar.f12790m = rVar.f12783c;
            rVar.f12787j = false;
        } else if (rVar.h || rVar.f12785g) {
            if (z10 && rVar.f12786i) {
                rVar.a(i10 + ((int) (j3 - rVar.f12782b)));
            }
            rVar.f12788k = rVar.f12782b;
            rVar.f12789l = rVar.e;
            rVar.f12790m = rVar.f12783c;
            rVar.f12786i = true;
        }
        if (!this.e) {
            l0 l0Var = this.f12795g;
            l0Var.e(i11);
            l0 l0Var2 = this.h;
            l0Var2.e(i11);
            l0 l0Var3 = this.f12796i;
            l0Var3.e(i11);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f12792b;
                int i12 = l0Var.e;
                byte[] bArr = new byte[l0Var2.e + i12 + l0Var3.e];
                System.arraycopy((byte[]) l0Var.f10778f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) l0Var2.f10778f, 0, bArr, l0Var.e, l0Var2.e);
                System.arraycopy((byte[]) l0Var3.f10778f, 0, bArr, l0Var.e + l0Var2.e, l0Var3.e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) l0Var2.f10778f, 3, l0Var2.e, null);
                f2.h hVar = h.f8819b;
                if (hVar != null) {
                    int i13 = hVar.f8809a;
                    boolean z11 = hVar.f8810b;
                    str2 = e2.e.a(i13, hVar.f8811c, hVar.d, hVar.f8812f, z11, hVar.e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3240a = str;
                rVar2.f3252p = r0.n("video/mp2t");
                rVar2.f3253q = r0.n("video/hevc");
                rVar2.f3246j = str2;
                rVar2.f3259x = h.e;
                rVar2.f3260y = h.f8821f;
                rVar2.f3261z = h.f8822g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f8825k, h.f8826l, h.f8827m, null, h.f8820c + 8, h.d + 8);
                rVar2.D = h.f8823i;
                rVar2.f3255s = h.f8824j;
                rVar2.H = h.f8818a + 1;
                rVar2.f3256t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f12793c.b(sVar);
                int i14 = sVar.f3311t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        l0 l0Var4 = this.f12797j;
        boolean e = l0Var4.e(i11);
        e2.v vVar = this.f12801n;
        if (e) {
            vVar.H(f2.o.m(l0Var4.e, (byte[]) l0Var4.f10778f), (byte[]) l0Var4.f10778f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        l0 l0Var5 = this.f12798k;
        if (l0Var5.e(i11)) {
            vVar.H(f2.o.m(l0Var5.e, (byte[]) l0Var5.f10778f), (byte[]) l0Var5.f10778f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f12799l = 0L;
        this.f12800m = -9223372036854775807L;
        f2.o.a(this.f12794f);
        this.f12795g.g();
        this.h.g();
        this.f12796i.g();
        this.f12797j.g();
        this.f12798k.g();
        this.f12791a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f12784f = false;
            rVar.f12785g = false;
            rVar.h = false;
            rVar.f12786i = false;
            rVar.f12787j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12792b = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12793c = Z1;
        this.d = new r(Z1);
        this.f12791a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12793c);
        String str = e2.d0.f7887a;
        if (z10) {
            this.f12791a.d.c(0);
            b(this.f12799l, 0, 0, this.f12800m);
            h(this.f12799l, 0, 48, this.f12800m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12800m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f12784f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f12785g = z10;
                rVar.f12784f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f12795g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f12796i.a(i10, i11, bArr);
        }
        this.f12797j.a(i10, i11, bArr);
        this.f12798k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f12785g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.f12782b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f12786i && !rVar.f12787j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f12786i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f12787j;
                rVar.f12787j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f12783c = z10;
        rVar.f12784f = (z10 || i11 <= 9) ? true : true;
        if (!this.e) {
            this.f12795g.h(i11);
            this.h.h(i11);
            this.f12796i.h(i11);
        }
        this.f12797j.h(i11);
        this.f12798k.h(i11);
    }
}
