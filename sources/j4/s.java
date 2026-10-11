package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13926a;
    public String f13927b;
    public h0 f13928c;
    public r d;
    public boolean f13929e;
    public long f13935l;
    public final boolean[] f13930f = new boolean[3];
    public final m0 f13931g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f13932i = new m0(34);
    public final m0 f13933j = new m0(39);
    public final m0 f13934k = new m0(40);
    public long f13936m = -9223372036854775807L;
    public final e2.v f13937n = new e2.v();

    public s(c0 c0Var) {
        this.f13926a = c0Var;
    }

    public final void a(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13926a.d;
        r rVar = this.d;
        boolean z10 = this.f13929e;
        if (rVar.f13922j && rVar.f13920g) {
            rVar.f13925m = rVar.f13917c;
            rVar.f13922j = false;
        } else if (rVar.h || rVar.f13920g) {
            if (z10 && rVar.f13921i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13916b)));
            }
            rVar.f13923k = rVar.f13916b;
            rVar.f13924l = rVar.f13918e;
            rVar.f13925m = rVar.f13917c;
            rVar.f13921i = true;
        }
        if (!this.f13929e) {
            m0 m0Var = this.f13931g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f13932i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f13927b;
                int i12 = m0Var.f11784e;
                byte[] bArr = new byte[m0Var2.f11784e + i12 + m0Var3.f11784e];
                System.arraycopy((byte[]) m0Var.f11785f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f11785f, 0, bArr, m0Var.f11784e, m0Var2.f11784e);
                System.arraycopy((byte[]) m0Var3.f11785f, 0, bArr, m0Var.f11784e + m0Var2.f11784e, m0Var3.f11784e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) m0Var2.f11785f, 3, m0Var2.f11784e, null);
                f2.i iVar = h.f9584b;
                if (iVar != null) {
                    int i13 = iVar.f9572a;
                    boolean z11 = iVar.f9573b;
                    str2 = e2.e.a(i13, iVar.f9574c, iVar.d, iVar.f9576f, z11, iVar.f9575e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3571a = str;
                rVar2.f3584p = r0.n("video/mp2t");
                rVar2.f3585q = r0.n("video/hevc");
                rVar2.f3578j = str2;
                rVar2.f3591x = h.f9586e;
                rVar2.f3592y = h.f9587f;
                rVar2.f3593z = h.f9588g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9591k, h.f9592l, h.f9593m, null, h.f9585c + 8, h.d + 8);
                rVar2.D = h.f9589i;
                rVar2.f3587s = h.f9590j;
                rVar2.H = h.f9583a + 1;
                rVar2.f3588t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13928c.b(sVar);
                int i14 = sVar.f3645t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13929e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f13933j;
        boolean e7 = m0Var4.e(i11);
        e2.v vVar = this.f13937n;
        if (e7) {
            vVar.H(f2.p.m(m0Var4.f11784e, (byte[]) m0Var4.f11785f), (byte[]) m0Var4.f11785f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f13934k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.p.m(m0Var5.f11784e, (byte[]) m0Var5.f11785f), (byte[]) m0Var5.f11785f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13928c);
        String str = e2.d0.f8531a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8584b;
            int i13 = vVar.f8585c;
            byte[] bArr = vVar.f8583a;
            this.f13935l += vVar.a();
            this.f13928c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.p.b(bArr, i12, i13, this.f13930f);
                if (b10 == i13) {
                    c(i12, i13, bArr);
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
                int i16 = i10;
                int i17 = i15 - i12;
                if (i17 > 0) {
                    c(i12, i15, bArr);
                }
                int i18 = i13 - i15;
                long j3 = this.f13935l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                a(j3, i18, i11, this.f13936m);
                h(j3, i18, i14, this.f13936m);
                i12 = i15 + i16;
            }
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13919f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13920g = z10;
                rVar.f13919f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13929e) {
            this.f13931g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13932i.a(i10, i11, bArr);
        }
        this.f13933j.a(i10, i11, bArr);
        this.f13934k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
        this.f13935l = 0L;
        this.f13936m = -9223372036854775807L;
        f2.p.a(this.f13930f);
        this.f13931g.g();
        this.h.g();
        this.f13932i.g();
        this.f13933j.g();
        this.f13934k.g();
        this.f13926a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13919f = false;
            rVar.f13920g = false;
            rVar.h = false;
            rVar.f13921i = false;
            rVar.f13922j = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13927b = (String) f0Var.f13808e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13807c, 2);
        this.f13928c = f22;
        this.d = new r(f22);
        this.f13926a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13928c);
        String str = e2.d0.f8531a;
        if (z10) {
            this.f13926a.d.c(0);
            a(this.f13935l, 0, 0, this.f13936m);
            h(this.f13935l, 0, 48, this.f13936m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13936m = j3;
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13929e;
        boolean z12 = false;
        rVar.f13920g = false;
        rVar.h = false;
        rVar.f13918e = j10;
        rVar.d = 0;
        rVar.f13916b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13921i && !rVar.f13922j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13921i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13922j;
                rVar.f13922j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13917c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f13919f = z12;
        if (!this.f13929e) {
            this.f13931g.h(i11);
            this.h.h(i11);
            this.f13932i.h(i11);
        }
        this.f13933j.h(i11);
        this.f13934k.h(i11);
    }
}
