package j4;

import b2.r0;
import i2.k0;
import java.util.Collections;
public final class s implements i {
    public final d0 f11687a;
    public String f11688b;
    public c3.h0 f11689c;
    public r d;
    public boolean e;
    public long f11695l;
    public final boolean[] f11690f = new boolean[3];
    public final k0 f11691g = new k0(32);
    public final k0 h = new k0(33);
    public final k0 f11692i = new k0(34);
    public final k0 f11693j = new k0(39);
    public final k0 f11694k = new k0(40);
    public long f11696m = -9223372036854775807L;
    public final e2.v f11697n = new e2.v();

    public s(d0 d0Var) {
        this.f11687a = d0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f11689c);
        String str = e2.d0.f7188a;
        while (vVar.a() > 0) {
            int i12 = vVar.f7235b;
            int i13 = vVar.f7236c;
            byte[] bArr = vVar.f7234a;
            this.f11695l += vVar.a();
            this.f11689c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f11690f);
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
                long j3 = this.f11695l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                f(j3, i17, i11, this.f11696m);
                h(j3, i17, i14, this.f11696m);
                i12 = i15 + i10;
            }
        }
    }

    @Override
    public final void b() {
        this.f11695l = 0L;
        this.f11696m = -9223372036854775807L;
        f2.o.a(this.f11690f);
        this.f11691g.g();
        this.h.g();
        this.f11692i.g();
        this.f11693j.g();
        this.f11694k.g();
        this.f11687a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f11680f = false;
            rVar.f11681g = false;
            rVar.h = false;
            rVar.f11682i = false;
            rVar.f11683j = false;
        }
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f11688b = g0Var.e;
        g0Var.b();
        c3.h0 I = qVar.I(g0Var.d, 2);
        this.f11689c = I;
        this.d = new r(I);
        this.f11687a.b(qVar, g0Var);
    }

    @Override
    public final void d(boolean z10) {
        e2.d.h(this.f11689c);
        String str = e2.d0.f7188a;
        if (z10) {
            this.f11687a.d.c(0);
            f(this.f11695l, 0, 0, this.f11696m);
            h(this.f11695l, 0, 48, this.f11696m);
        }
    }

    @Override
    public final void e(int i10, long j3) {
        this.f11696m = j3;
    }

    public final void f(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f11687a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.f11683j && rVar.f11681g) {
            rVar.f11686m = rVar.f11679c;
            rVar.f11683j = false;
        } else if (rVar.h || rVar.f11681g) {
            if (z10 && rVar.f11682i) {
                rVar.a(i10 + ((int) (j3 - rVar.f11678b)));
            }
            rVar.f11684k = rVar.f11678b;
            rVar.f11685l = rVar.e;
            rVar.f11686m = rVar.f11679c;
            rVar.f11682i = true;
        }
        if (!this.e) {
            k0 k0Var = this.f11691g;
            k0Var.e(i11);
            k0 k0Var2 = this.h;
            k0Var2.e(i11);
            k0 k0Var3 = this.f11692i;
            k0Var3.e(i11);
            if (k0Var.d && k0Var2.d && k0Var3.d) {
                String str = this.f11688b;
                int i12 = k0Var.e;
                byte[] bArr = new byte[k0Var2.e + i12 + k0Var3.e];
                System.arraycopy((byte[]) k0Var.f10253f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) k0Var2.f10253f, 0, bArr, k0Var.e, k0Var2.e);
                System.arraycopy((byte[]) k0Var3.f10253f, 0, bArr, k0Var.e + k0Var2.e, k0Var3.e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) k0Var2.f10253f, 3, k0Var2.e, null);
                f2.h hVar = h.f7702b;
                if (hVar != null) {
                    int i13 = hVar.f7692a;
                    boolean z11 = hVar.f7693b;
                    str2 = e2.e.a(i13, hVar.f7694c, hVar.d, hVar.f7695f, z11, hVar.e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f1933a = str;
                rVar2.f1945p = r0.n("video/mp2t");
                rVar2.f1946q = r0.n("video/hevc");
                rVar2.f1939j = str2;
                rVar2.f1952x = h.e;
                rVar2.f1953y = h.f7704f;
                rVar2.f1954z = h.f7705g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f7708k, h.f7709l, h.f7710m, null, h.f7703c + 8, h.d + 8);
                rVar2.D = h.f7706i;
                rVar2.f1948s = h.f7707j;
                rVar2.H = h.f7701a + 1;
                rVar2.f1949t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f11689c.b(sVar);
                int i14 = sVar.f2004t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        k0 k0Var4 = this.f11693j;
        boolean e = k0Var4.e(i11);
        e2.v vVar = this.f11697n;
        if (e) {
            vVar.H(f2.o.m(k0Var4.e, (byte[]) k0Var4.f10253f), (byte[]) k0Var4.f10253f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        k0 k0Var5 = this.f11694k;
        if (k0Var5.e(i11)) {
            vVar.H(f2.o.m(k0Var5.e, (byte[]) k0Var5.f10253f), (byte[]) k0Var5.f10253f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f11680f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f11681g = z10;
                rVar.f11680f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f11691g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f11692i.a(i10, i11, bArr);
        }
        this.f11693j.a(i10, i11, bArr);
        this.f11694k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f11681g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.f11678b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f11682i && !rVar.f11683j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f11682i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f11683j;
                rVar.f11683j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f11679c = z10;
        rVar.f11680f = (z10 || i11 <= 9) ? true : true;
        if (!this.e) {
            this.f11691g.h(i11);
            this.h.h(i11);
            this.f11692i.h(i11);
        }
        this.f11693j.h(i11);
        this.f11694k.h(i11);
    }
}
