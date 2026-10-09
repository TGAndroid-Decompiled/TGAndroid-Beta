package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13927a;
    public String f13928b;
    public h0 f13929c;
    public r d;
    public boolean f13930e;
    public long f13936l;
    public final boolean[] f13931f = new boolean[3];
    public final m0 f13932g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f13933i = new m0(34);
    public final m0 f13934j = new m0(39);
    public final m0 f13935k = new m0(40);
    public long f13937m = -9223372036854775807L;
    public final e2.v f13938n = new e2.v();

    public s(c0 c0Var) {
        this.f13927a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13929c);
        String str = e2.d0.f8532a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8585b;
            int i13 = vVar.f8586c;
            byte[] bArr = vVar.f8584a;
            this.f13936l += vVar.a();
            this.f13929c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.p.b(bArr, i12, i13, this.f13931f);
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
                int i16 = i10;
                int i17 = i15 - i12;
                if (i17 > 0) {
                    g(i12, i15, bArr);
                }
                int i18 = i13 - i15;
                long j3 = this.f13936l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                b(j3, i18, i11, this.f13937m);
                h(j3, i18, i14, this.f13937m);
                i12 = i15 + i16;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13927a.d;
        r rVar = this.d;
        boolean z10 = this.f13930e;
        if (rVar.f13923j && rVar.f13921g) {
            rVar.f13926m = rVar.f13918c;
            rVar.f13923j = false;
        } else if (rVar.h || rVar.f13921g) {
            if (z10 && rVar.f13922i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13917b)));
            }
            rVar.f13924k = rVar.f13917b;
            rVar.f13925l = rVar.f13919e;
            rVar.f13926m = rVar.f13918c;
            rVar.f13922i = true;
        }
        if (!this.f13930e) {
            m0 m0Var = this.f13932g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f13933i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f13928b;
                int i12 = m0Var.f11785e;
                byte[] bArr = new byte[m0Var2.f11785e + i12 + m0Var3.f11785e];
                System.arraycopy((byte[]) m0Var.f11786f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f11786f, 0, bArr, m0Var.f11785e, m0Var2.f11785e);
                System.arraycopy((byte[]) m0Var3.f11786f, 0, bArr, m0Var.f11785e + m0Var2.f11785e, m0Var3.f11785e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) m0Var2.f11786f, 3, m0Var2.f11785e, null);
                f2.i iVar = h.f9585b;
                if (iVar != null) {
                    int i13 = iVar.f9573a;
                    boolean z11 = iVar.f9574b;
                    str2 = e2.e.a(i13, iVar.f9575c, iVar.d, iVar.f9577f, z11, iVar.f9576e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3571a = str;
                rVar2.f3584p = r0.n("video/mp2t");
                rVar2.f3585q = r0.n("video/hevc");
                rVar2.f3578j = str2;
                rVar2.f3591x = h.f9587e;
                rVar2.f3592y = h.f9588f;
                rVar2.f3593z = h.f9589g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9592k, h.f9593l, h.f9594m, null, h.f9586c + 8, h.d + 8);
                rVar2.D = h.f9590i;
                rVar2.f3587s = h.f9591j;
                rVar2.H = h.f9584a + 1;
                rVar2.f3588t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13929c.b(sVar);
                int i14 = sVar.f3645t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13930e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f13934j;
        boolean e7 = m0Var4.e(i11);
        e2.v vVar = this.f13938n;
        if (e7) {
            vVar.H(f2.p.m(m0Var4.f11785e, (byte[]) m0Var4.f11786f), (byte[]) m0Var4.f11786f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f13935k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.p.m(m0Var5.f11785e, (byte[]) m0Var5.f11786f), (byte[]) m0Var5.f11786f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f13936l = 0L;
        this.f13937m = -9223372036854775807L;
        f2.p.a(this.f13931f);
        this.f13932g.g();
        this.h.g();
        this.f13933i.g();
        this.f13934j.g();
        this.f13935k.g();
        this.f13927a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13920f = false;
            rVar.f13921g = false;
            rVar.h = false;
            rVar.f13922i = false;
            rVar.f13923j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13928b = (String) f0Var.f13809e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13808c, 2);
        this.f13929c = f22;
        this.d = new r(f22);
        this.f13927a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13929c);
        String str = e2.d0.f8532a;
        if (z10) {
            this.f13927a.d.c(0);
            b(this.f13936l, 0, 0, this.f13937m);
            h(this.f13936l, 0, 48, this.f13937m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13937m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13920f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13921g = z10;
                rVar.f13920f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13930e) {
            this.f13932g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13933i.a(i10, i11, bArr);
        }
        this.f13934j.a(i10, i11, bArr);
        this.f13935k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13930e;
        boolean z12 = false;
        rVar.f13921g = false;
        rVar.h = false;
        rVar.f13919e = j10;
        rVar.d = 0;
        rVar.f13917b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13922i && !rVar.f13923j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13922i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13923j;
                rVar.f13923j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13918c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f13920f = z12;
        if (!this.f13930e) {
            this.f13932g.h(i11);
            this.h.h(i11);
            this.f13933i.h(i11);
        }
        this.f13934j.h(i11);
        this.f13935k.h(i11);
    }
}
