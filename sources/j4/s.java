package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13924a;
    public String f13925b;
    public h0 f13926c;
    public r d;
    public boolean f13927e;
    public long f13933l;
    public final boolean[] f13928f = new boolean[3];
    public final m0 f13929g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f13930i = new m0(34);
    public final m0 f13931j = new m0(39);
    public final m0 f13932k = new m0(40);
    public long f13934m = -9223372036854775807L;
    public final e2.v f13935n = new e2.v();

    public s(c0 c0Var) {
        this.f13924a = c0Var;
    }

    public final void a(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13924a.d;
        r rVar = this.d;
        boolean z10 = this.f13927e;
        if (rVar.f13920j && rVar.f13918g) {
            rVar.f13923m = rVar.f13915c;
            rVar.f13920j = false;
        } else if (rVar.h || rVar.f13918g) {
            if (z10 && rVar.f13919i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13914b)));
            }
            rVar.f13921k = rVar.f13914b;
            rVar.f13922l = rVar.f13916e;
            rVar.f13923m = rVar.f13915c;
            rVar.f13919i = true;
        }
        if (!this.f13927e) {
            m0 m0Var = this.f13929g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f13930i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f13925b;
                int i12 = m0Var.f11783e;
                byte[] bArr = new byte[m0Var2.f11783e + i12 + m0Var3.f11783e];
                System.arraycopy((byte[]) m0Var.f11784f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f11784f, 0, bArr, m0Var.f11783e, m0Var2.f11783e);
                System.arraycopy((byte[]) m0Var3.f11784f, 0, bArr, m0Var.f11783e + m0Var2.f11783e, m0Var3.f11783e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) m0Var2.f11784f, 3, m0Var2.f11783e, null);
                f2.i iVar = h.f9582b;
                if (iVar != null) {
                    int i13 = iVar.f9570a;
                    boolean z11 = iVar.f9571b;
                    str2 = e2.e.a(i13, iVar.f9572c, iVar.d, iVar.f9574f, z11, iVar.f9573e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3569a = str;
                rVar2.f3582p = r0.n("video/mp2t");
                rVar2.f3583q = r0.n("video/hevc");
                rVar2.f3576j = str2;
                rVar2.f3589x = h.f9584e;
                rVar2.f3590y = h.f9585f;
                rVar2.f3591z = h.f9586g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9589k, h.f9590l, h.f9591m, null, h.f9583c + 8, h.d + 8);
                rVar2.D = h.f9587i;
                rVar2.f3585s = h.f9588j;
                rVar2.H = h.f9581a + 1;
                rVar2.f3586t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13926c.b(sVar);
                int i14 = sVar.f3643t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13927e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f13931j;
        boolean e7 = m0Var4.e(i11);
        e2.v vVar = this.f13935n;
        if (e7) {
            vVar.H(f2.p.m(m0Var4.f11783e, (byte[]) m0Var4.f11784f), (byte[]) m0Var4.f11784f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f13932k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.p.m(m0Var5.f11783e, (byte[]) m0Var5.f11784f), (byte[]) m0Var5.f11784f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13926c);
        String str = e2.d0.f8529a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8582b;
            int i13 = vVar.f8583c;
            byte[] bArr = vVar.f8581a;
            this.f13933l += vVar.a();
            this.f13926c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.p.b(bArr, i12, i13, this.f13928f);
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
                long j3 = this.f13933l - i18;
                if (i17 < 0) {
                    i11 = -i17;
                } else {
                    i11 = 0;
                }
                a(j3, i18, i11, this.f13934m);
                h(j3, i18, i14, this.f13934m);
                i12 = i15 + i16;
            }
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13917f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13918g = z10;
                rVar.f13917f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13927e) {
            this.f13929g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13930i.a(i10, i11, bArr);
        }
        this.f13931j.a(i10, i11, bArr);
        this.f13932k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
        this.f13933l = 0L;
        this.f13934m = -9223372036854775807L;
        f2.p.a(this.f13928f);
        this.f13929g.g();
        this.h.g();
        this.f13930i.g();
        this.f13931j.g();
        this.f13932k.g();
        this.f13924a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13917f = false;
            rVar.f13918g = false;
            rVar.h = false;
            rVar.f13919i = false;
            rVar.f13920j = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f13925b = (String) f0Var.f13806e;
        f0Var.c();
        h0 f22 = qVar.f2(f0Var.f13805c, 2);
        this.f13926c = f22;
        this.d = new r(f22);
        this.f13924a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13926c);
        String str = e2.d0.f8529a;
        if (z10) {
            this.f13924a.d.c(0);
            a(this.f13933l, 0, 0, this.f13934m);
            h(this.f13933l, 0, 48, this.f13934m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13934m = j3;
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13927e;
        boolean z12 = false;
        rVar.f13918g = false;
        rVar.h = false;
        rVar.f13916e = j10;
        rVar.d = 0;
        rVar.f13914b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13919i && !rVar.f13920j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13919i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13920j;
                rVar.f13920j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13915c = z10;
        if (z10 || i11 <= 9) {
            z12 = true;
        }
        rVar.f13917f = z12;
        if (!this.f13927e) {
            this.f13929g.h(i11);
            this.h.h(i11);
            this.f13930i.h(i11);
        }
        this.f13931j.h(i11);
        this.f13932k.h(i11);
    }
}
