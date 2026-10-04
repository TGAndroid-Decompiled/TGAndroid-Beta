package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13889a;
    public String f13890b;
    public h0 f13891c;
    public r d;
    public boolean f13892e;
    public long f13898l;
    public final boolean[] f13893f = new boolean[3];
    public final m0 f13894g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f13895i = new m0(34);
    public final m0 f13896j = new m0(39);
    public final m0 f13897k = new m0(40);
    public long f13899m = -9223372036854775807L;
    public final e2.v f13900n = new e2.v();

    public s(c0 c0Var) {
        this.f13889a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13891c);
        String str = e2.d0.f8537a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8590b;
            int i13 = vVar.f8591c;
            byte[] bArr = vVar.f8589a;
            this.f13898l += vVar.a();
            this.f13891c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f13893f);
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
                long j3 = this.f13898l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                b(j3, i17, i11, this.f13899m);
                h(j3, i17, i14, this.f13899m);
                i12 = i15 + i10;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13889a.d;
        r rVar = this.d;
        boolean z10 = this.f13892e;
        if (rVar.f13885j && rVar.f13883g) {
            rVar.f13888m = rVar.f13880c;
            rVar.f13885j = false;
        } else if (rVar.h || rVar.f13883g) {
            if (z10 && rVar.f13884i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13879b)));
            }
            rVar.f13886k = rVar.f13879b;
            rVar.f13887l = rVar.f13881e;
            rVar.f13888m = rVar.f13880c;
            rVar.f13884i = true;
        }
        if (!this.f13892e) {
            m0 m0Var = this.f13894g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f13895i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f13890b;
                int i12 = m0Var.f11734e;
                byte[] bArr = new byte[m0Var2.f11734e + i12 + m0Var3.f11734e];
                System.arraycopy((byte[]) m0Var.f11735f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f11735f, 0, bArr, m0Var.f11734e, m0Var2.f11734e);
                System.arraycopy((byte[]) m0Var3.f11735f, 0, bArr, m0Var.f11734e + m0Var2.f11734e, m0Var3.f11734e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) m0Var2.f11735f, 3, m0Var2.f11734e, null);
                f2.h hVar = h.f9573b;
                if (hVar != null) {
                    int i13 = hVar.f9561a;
                    boolean z11 = hVar.f9562b;
                    str2 = e2.e.a(i13, hVar.f9563c, hVar.d, hVar.f9565f, z11, hVar.f9564e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3492a = str;
                rVar2.f3505p = r0.n("video/mp2t");
                rVar2.f3506q = r0.n("video/hevc");
                rVar2.f3499j = str2;
                rVar2.f3512x = h.f9575e;
                rVar2.f3513y = h.f9576f;
                rVar2.f3514z = h.f9577g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9580k, h.f9581l, h.f9582m, null, h.f9574c + 8, h.d + 8);
                rVar2.D = h.f9578i;
                rVar2.f3508s = h.f9579j;
                rVar2.H = h.f9572a + 1;
                rVar2.f3509t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13891c.b(sVar);
                int i14 = sVar.f3566t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13892e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f13896j;
        boolean e7 = m0Var4.e(i11);
        e2.v vVar = this.f13900n;
        if (e7) {
            vVar.H(f2.o.m(m0Var4.f11734e, (byte[]) m0Var4.f11735f), (byte[]) m0Var4.f11735f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f13897k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.o.m(m0Var5.f11734e, (byte[]) m0Var5.f11735f), (byte[]) m0Var5.f11735f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f13898l = 0L;
        this.f13899m = -9223372036854775807L;
        f2.o.a(this.f13893f);
        this.f13894g.g();
        this.h.g();
        this.f13895i.g();
        this.f13896j.g();
        this.f13897k.g();
        this.f13889a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13882f = false;
            rVar.f13883g = false;
            rVar.h = false;
            rVar.f13884i = false;
            rVar.f13885j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13890b = f0Var.f13771e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f13891c = Z1;
        this.d = new r(Z1);
        this.f13889a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f13891c);
        String str = e2.d0.f8537a;
        if (z10) {
            this.f13889a.d.c(0);
            b(this.f13898l, 0, 0, this.f13899m);
            h(this.f13898l, 0, 48, this.f13899m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f13899m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13882f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13883g = z10;
                rVar.f13882f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13892e) {
            this.f13894g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13895i.a(i10, i11, bArr);
        }
        this.f13896j.a(i10, i11, bArr);
        this.f13897k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13892e;
        boolean z12 = false;
        rVar.f13883g = false;
        rVar.h = false;
        rVar.f13881e = j10;
        rVar.d = 0;
        rVar.f13879b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13884i && !rVar.f13885j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13884i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13885j;
                rVar.f13885j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13880c = z10;
        rVar.f13882f = (z10 || i11 <= 9) ? true : true;
        if (!this.f13892e) {
            this.f13894g.h(i11);
            this.h.h(i11);
            this.f13895i.h(i11);
        }
        this.f13896j.h(i11);
        this.f13897k.h(i11);
    }
}
