package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f12783a;
    public String f12784b;
    public h0 f12785c;
    public r d;
    public boolean e;
    public long f12791l;
    public final boolean[] f12786f = new boolean[3];
    public final m0 f12787g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f12788i = new m0(34);
    public final m0 f12789j = new m0(39);
    public final m0 f12790k = new m0(40);
    public long f12792m = -9223372036854775807L;
    public final e2.v f12793n = new e2.v();

    public s(c0 c0Var) {
        this.f12783a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12785c);
        String str = e2.d0.f7872a;
        while (vVar.a() > 0) {
            int i12 = vVar.f7919b;
            int i13 = vVar.f7920c;
            byte[] bArr = vVar.f7918a;
            this.f12791l += vVar.a();
            this.f12785c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f12786f);
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
                long j3 = this.f12791l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                b(j3, i17, i11, this.f12792m);
                h(j3, i17, i14, this.f12792m);
                i12 = i15 + i10;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f12783a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.f12779j && rVar.f12777g) {
            rVar.f12782m = rVar.f12775c;
            rVar.f12779j = false;
        } else if (rVar.h || rVar.f12777g) {
            if (z10 && rVar.f12778i) {
                rVar.a(i10 + ((int) (j3 - rVar.f12774b)));
            }
            rVar.f12780k = rVar.f12774b;
            rVar.f12781l = rVar.e;
            rVar.f12782m = rVar.f12775c;
            rVar.f12778i = true;
        }
        if (!this.e) {
            m0 m0Var = this.f12787g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f12788i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f12784b;
                int i12 = m0Var.e;
                byte[] bArr = new byte[m0Var2.e + i12 + m0Var3.e];
                System.arraycopy((byte[]) m0Var.f10772f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f10772f, 0, bArr, m0Var.e, m0Var2.e);
                System.arraycopy((byte[]) m0Var3.f10772f, 0, bArr, m0Var.e + m0Var2.e, m0Var3.e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) m0Var2.f10772f, 3, m0Var2.e, null);
                f2.h hVar = h.f8805b;
                if (hVar != null) {
                    int i13 = hVar.f8795a;
                    boolean z11 = hVar.f8796b;
                    str2 = e2.e.a(i13, hVar.f8797c, hVar.d, hVar.f8798f, z11, hVar.e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3234a = str;
                rVar2.f3246p = r0.n("video/mp2t");
                rVar2.f3247q = r0.n("video/hevc");
                rVar2.f3240j = str2;
                rVar2.f3253x = h.e;
                rVar2.f3254y = h.f8807f;
                rVar2.f3255z = h.f8808g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f8811k, h.f8812l, h.f8813m, null, h.f8806c + 8, h.d + 8);
                rVar2.D = h.f8809i;
                rVar2.f3249s = h.f8810j;
                rVar2.H = h.f8804a + 1;
                rVar2.f3250t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f12785c.b(sVar);
                int i14 = sVar.f3305t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f12789j;
        boolean e = m0Var4.e(i11);
        e2.v vVar = this.f12793n;
        if (e) {
            vVar.H(f2.o.m(m0Var4.e, (byte[]) m0Var4.f10772f), (byte[]) m0Var4.f10772f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f12790k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.o.m(m0Var5.e, (byte[]) m0Var5.f10772f), (byte[]) m0Var5.f10772f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f12791l = 0L;
        this.f12792m = -9223372036854775807L;
        f2.o.a(this.f12786f);
        this.f12787g.g();
        this.h.g();
        this.f12788i.g();
        this.f12789j.g();
        this.f12790k.g();
        this.f12783a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f12776f = false;
            rVar.f12777g = false;
            rVar.h = false;
            rVar.f12778i = false;
            rVar.f12779j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12784b = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12785c = Z1;
        this.d = new r(Z1);
        this.f12783a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12785c);
        String str = e2.d0.f7872a;
        if (z10) {
            this.f12783a.d.c(0);
            b(this.f12791l, 0, 0, this.f12792m);
            h(this.f12791l, 0, 48, this.f12792m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12792m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f12776f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f12777g = z10;
                rVar.f12776f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f12787g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f12788i.a(i10, i11, bArr);
        }
        this.f12789j.a(i10, i11, bArr);
        this.f12790k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f12777g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.f12774b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f12778i && !rVar.f12779j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f12778i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f12779j;
                rVar.f12779j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f12775c = z10;
        rVar.f12776f = (z10 || i11 <= 9) ? true : true;
        if (!this.e) {
            this.f12787g.h(i11);
            this.h.h(i11);
            this.f12788i.h(i11);
        }
        this.f12789j.h(i11);
        this.f12790k.h(i11);
    }
}
