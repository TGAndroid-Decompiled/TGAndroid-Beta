package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13890a;
    public String f13891b;
    public h0 f13892c;
    public r d;
    public boolean f13893e;
    public long f13899l;
    public final boolean[] f13894f = new boolean[3];
    public final m0 f13895g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f13896i = new m0(34);
    public final m0 f13897j = new m0(39);
    public final m0 f13898k = new m0(40);
    public long f13900m = -9223372036854775807L;
    public final e2.v f13901n = new e2.v();

    public s(c0 c0Var) {
        this.f13890a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13892c);
        String str = e2.d0.f8538a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8591b;
            int i13 = vVar.f8592c;
            byte[] bArr = vVar.f8590a;
            this.f13899l += vVar.a();
            this.f13892c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f13894f);
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
                long j3 = this.f13899l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                b(j3, i17, i11, this.f13900m);
                h(j3, i17, i14, this.f13900m);
                i12 = i15 + i10;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13890a.d;
        r rVar = this.d;
        boolean z10 = this.f13893e;
        if (rVar.f13886j && rVar.f13884g) {
            rVar.f13889m = rVar.f13881c;
            rVar.f13886j = false;
        } else if (rVar.h || rVar.f13884g) {
            if (z10 && rVar.f13885i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13880b)));
            }
            rVar.f13887k = rVar.f13880b;
            rVar.f13888l = rVar.f13882e;
            rVar.f13889m = rVar.f13881c;
            rVar.f13885i = true;
        }
        if (!this.f13893e) {
            m0 m0Var = this.f13895g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f13896i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f13891b;
                int i12 = m0Var.f11735e;
                byte[] bArr = new byte[m0Var2.f11735e + i12 + m0Var3.f11735e];
                System.arraycopy((byte[]) m0Var.f11736f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f11736f, 0, bArr, m0Var.f11735e, m0Var2.f11735e);
                System.arraycopy((byte[]) m0Var3.f11736f, 0, bArr, m0Var.f11735e + m0Var2.f11735e, m0Var3.f11735e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) m0Var2.f11736f, 3, m0Var2.f11735e, null);
                f2.h hVar = h.f9574b;
                if (hVar != null) {
                    int i13 = hVar.f9562a;
                    boolean z11 = hVar.f9563b;
                    str2 = e2.e.a(i13, hVar.f9564c, hVar.d, hVar.f9566f, z11, hVar.f9565e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3492a = str;
                rVar2.f3505p = r0.n("video/mp2t");
                rVar2.f3506q = r0.n("video/hevc");
                rVar2.f3499j = str2;
                rVar2.f3512x = h.f9576e;
                rVar2.f3513y = h.f9577f;
                rVar2.f3514z = h.f9578g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9581k, h.f9582l, h.f9583m, null, h.f9575c + 8, h.d + 8);
                rVar2.D = h.f9579i;
                rVar2.f3508s = h.f9580j;
                rVar2.H = h.f9573a + 1;
                rVar2.f3509t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13892c.b(sVar);
                int i14 = sVar.f3566t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13893e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f13897j;
        boolean e7 = m0Var4.e(i11);
        e2.v vVar = this.f13901n;
        if (e7) {
            vVar.H(f2.o.m(m0Var4.f11735e, (byte[]) m0Var4.f11736f), (byte[]) m0Var4.f11736f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f13898k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.o.m(m0Var5.f11735e, (byte[]) m0Var5.f11736f), (byte[]) m0Var5.f11736f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f13899l = 0L;
        this.f13900m = -9223372036854775807L;
        f2.o.a(this.f13894f);
        this.f13895g.g();
        this.h.g();
        this.f13896i.g();
        this.f13897j.g();
        this.f13898k.g();
        this.f13890a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13883f = false;
            rVar.f13884g = false;
            rVar.h = false;
            rVar.f13885i = false;
            rVar.f13886j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13891b = f0Var.f13772e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f13892c = Z1;
        this.d = new r(Z1);
        this.f13890a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13892c);
        String str = e2.d0.f8538a;
        if (z10) {
            this.f13890a.d.c(0);
            b(this.f13899l, 0, 0, this.f13900m);
            h(this.f13899l, 0, 48, this.f13900m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13900m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13883f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13884g = z10;
                rVar.f13883f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13893e) {
            this.f13895g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13896i.a(i10, i11, bArr);
        }
        this.f13897j.a(i10, i11, bArr);
        this.f13898k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13893e;
        boolean z12 = false;
        rVar.f13884g = false;
        rVar.h = false;
        rVar.f13882e = j10;
        rVar.d = 0;
        rVar.f13880b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13885i && !rVar.f13886j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13885i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13886j;
                rVar.f13886j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13881c = z10;
        rVar.f13883f = (z10 || i11 <= 9) ? true : true;
        if (!this.f13893e) {
            this.f13895g.h(i11);
            this.h.h(i11);
            this.f13896i.h(i11);
        }
        this.f13897j.h(i11);
        this.f13898k.h(i11);
    }
}
