package j4;

import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13439a;
    public String f13440b;
    public h0 f13441c;
    public r d;
    public boolean f13442e;
    public long f13448l;
    public final boolean[] f13443f = new boolean[3];
    public final l0 f13444g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f13445i = new l0(34);
    public final l0 f13446j = new l0(39);
    public final l0 f13447k = new l0(40);
    public long f13449m = -9223372036854775807L;
    public final e2.v f13450n = new e2.v();

    public s(c0 c0Var) {
        this.f13439a = c0Var;
    }

    public final void a(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13439a.d;
        r rVar = this.d;
        boolean z10 = this.f13442e;
        if (rVar.f13435j && rVar.f13433g) {
            rVar.f13438m = rVar.f13430c;
            rVar.f13435j = false;
        } else if (rVar.h || rVar.f13433g) {
            if (z10 && rVar.f13434i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13429b)));
            }
            rVar.f13436k = rVar.f13429b;
            rVar.f13437l = rVar.f13431e;
            rVar.f13438m = rVar.f13430c;
            rVar.f13434i = true;
        }
        if (!this.f13442e) {
            l0 l0Var = this.f13444g;
            l0Var.e(i11);
            l0 l0Var2 = this.h;
            l0Var2.e(i11);
            l0 l0Var3 = this.f13445i;
            l0Var3.e(i11);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f13440b;
                int i12 = l0Var.f11652e;
                byte[] bArr = new byte[l0Var2.f11652e + i12 + l0Var3.f11652e];
                System.arraycopy((byte[]) l0Var.f11653f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) l0Var2.f11653f, 0, bArr, l0Var.f11652e, l0Var2.f11652e);
                System.arraycopy((byte[]) l0Var3.f11653f, 0, bArr, l0Var.f11652e + l0Var2.f11652e, l0Var3.f11652e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) l0Var2.f11653f, 3, l0Var2.f11652e, null);
                f2.i iVar = h.f9225b;
                if (iVar != null) {
                    int i13 = iVar.f9213a;
                    boolean z11 = iVar.f9214b;
                    str2 = e2.e.a(i13, iVar.f9215c, iVar.d, iVar.f9217f, z11, iVar.f9216e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f2325a = str;
                rVar2.f2338p = r0.n("video/mp2t");
                rVar2.f2339q = r0.n("video/hevc");
                rVar2.f2332j = str2;
                rVar2.f2345x = h.f9227e;
                rVar2.f2346y = h.f9228f;
                rVar2.f2347z = h.f9229g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9232k, h.f9233l, h.f9234m, null, h.f9226c + 8, h.d + 8);
                rVar2.D = h.f9230i;
                rVar2.f2341s = h.f9231j;
                rVar2.H = h.f9224a + 1;
                rVar2.f2342t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13441c.b(sVar);
                int i14 = sVar.f2399t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13442e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        l0 l0Var4 = this.f13446j;
        boolean e7 = l0Var4.e(i11);
        e2.v vVar = this.f13450n;
        if (e7) {
            vVar.H(f2.p.m(l0Var4.f11652e, (byte[]) l0Var4.f11653f), (byte[]) l0Var4.f11653f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        l0 l0Var5 = this.f13447k;
        if (l0Var5.e(i11)) {
            vVar.H(f2.p.m(l0Var5.f11652e, (byte[]) l0Var5.f11653f), (byte[]) l0Var5.f11653f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13441c);
        String str = e2.d0.f8765a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8818b;
            int i13 = vVar.f8819c;
            byte[] bArr = vVar.f8817a;
            this.f13448l += vVar.a();
            this.f13441c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.p.b(bArr, i12, i13, this.f13443f);
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
                int i16 = i15 - i12;
                if (i16 > 0) {
                    c(i12, i15, bArr);
                }
                int i17 = i13 - i15;
                long j3 = this.f13448l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                a(j3, i17, i11, this.f13449m);
                h(j3, i17, i14, this.f13449m);
                i12 = i15 + i10;
            }
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13432f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13433g = z10;
                rVar.f13432f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13442e) {
            this.f13444g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13445i.a(i10, i11, bArr);
        }
        this.f13446j.a(i10, i11, bArr);
        this.f13447k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
        this.f13448l = 0L;
        this.f13449m = -9223372036854775807L;
        f2.p.a(this.f13443f);
        this.f13444g.g();
        this.h.g();
        this.f13445i.g();
        this.f13446j.g();
        this.f13447k.g();
        this.f13439a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13432f = false;
            rVar.f13433g = false;
            rVar.h = false;
            rVar.f13434i = false;
            rVar.f13435j = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13440b = f0Var.f13321e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13441c = R1;
        this.d = new r(R1);
        this.f13439a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13441c);
        String str = e2.d0.f8765a;
        if (z10) {
            this.f13439a.d.c(0);
            a(this.f13448l, 0, 0, this.f13449m);
            h(this.f13448l, 0, 48, this.f13449m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13449m = j3;
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13442e;
        boolean z12 = false;
        rVar.f13433g = false;
        rVar.h = false;
        rVar.f13431e = j10;
        rVar.d = 0;
        rVar.f13429b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13434i && !rVar.f13435j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13434i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13435j;
                rVar.f13435j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13430c = z10;
        rVar.f13432f = (z10 || i11 <= 9) ? true : true;
        if (!this.f13442e) {
            this.f13444g.h(i11);
            this.h.h(i11);
            this.f13445i.h(i11);
        }
        this.f13446j.h(i11);
        this.f13447k.h(i11);
    }
}
