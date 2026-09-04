package j4;

import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Collections;
public final class s implements i {
    public final c0 f13413a;
    public String f13414b;
    public h0 f13415c;
    public r d;
    public boolean f13416e;
    public long f13422l;
    public final boolean[] f13417f = new boolean[3];
    public final l0 f13418g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 f13419i = new l0(34);
    public final l0 f13420j = new l0(39);
    public final l0 f13421k = new l0(40);
    public long f13423m = -9223372036854775807L;
    public final e2.v f13424n = new e2.v();

    public s(c0 c0Var) {
        this.f13413a = c0Var;
    }

    public final void a(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f13413a.d;
        r rVar = this.d;
        boolean z10 = this.f13416e;
        if (rVar.f13409j && rVar.f13407g) {
            rVar.f13412m = rVar.f13404c;
            rVar.f13409j = false;
        } else if (rVar.h || rVar.f13407g) {
            if (z10 && rVar.f13408i) {
                rVar.a(i10 + ((int) (j3 - rVar.f13403b)));
            }
            rVar.f13410k = rVar.f13403b;
            rVar.f13411l = rVar.f13405e;
            rVar.f13412m = rVar.f13404c;
            rVar.f13408i = true;
        }
        if (!this.f13416e) {
            l0 l0Var = this.f13418g;
            l0Var.e(i11);
            l0 l0Var2 = this.h;
            l0Var2.e(i11);
            l0 l0Var3 = this.f13419i;
            l0Var3.e(i11);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.f13414b;
                int i12 = l0Var.f11626e;
                byte[] bArr = new byte[l0Var2.f11626e + i12 + l0Var3.f11626e];
                System.arraycopy((byte[]) l0Var.f11627f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) l0Var2.f11627f, 0, bArr, l0Var.f11626e, l0Var2.f11626e);
                System.arraycopy((byte[]) l0Var3.f11627f, 0, bArr, l0Var.f11626e + l0Var2.f11626e, l0Var3.f11626e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) l0Var2.f11627f, 3, l0Var2.f11626e, null);
                f2.i iVar = h.f9197b;
                if (iVar != null) {
                    int i13 = iVar.f9185a;
                    boolean z11 = iVar.f9186b;
                    str2 = e2.e.a(i13, iVar.f9187c, iVar.d, iVar.f9189f, z11, iVar.f9188e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f2298a = str;
                rVar2.f2311p = r0.n("video/mp2t");
                rVar2.f2312q = r0.n("video/hevc");
                rVar2.f2305j = str2;
                rVar2.f2318x = h.f9199e;
                rVar2.f2319y = h.f9200f;
                rVar2.f2320z = h.f9201g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f9204k, h.f9205l, h.f9206m, null, h.f9198c + 8, h.d + 8);
                rVar2.D = h.f9202i;
                rVar2.f2314s = h.f9203j;
                rVar2.H = h.f9196a + 1;
                rVar2.f2315t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f13415c.b(sVar);
                int i14 = sVar.f2372t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.f13416e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        l0 l0Var4 = this.f13420j;
        boolean e7 = l0Var4.e(i11);
        e2.v vVar = this.f13424n;
        if (e7) {
            vVar.H(f2.p.m(l0Var4.f11626e, (byte[]) l0Var4.f11627f), (byte[]) l0Var4.f11627f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        l0 l0Var5 = this.f13421k;
        if (l0Var5.e(i11)) {
            vVar.H(f2.p.m(l0Var5.f11626e, (byte[]) l0Var5.f11627f), (byte[]) l0Var5.f11627f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f13415c);
        String str = e2.d0.f8737a;
        while (vVar.a() > 0) {
            int i12 = vVar.f8790b;
            int i13 = vVar.f8791c;
            byte[] bArr = vVar.f8789a;
            this.f13422l += vVar.a();
            this.f13415c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.p.b(bArr, i12, i13, this.f13417f);
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
                long j3 = this.f13422l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                a(j3, i17, i11, this.f13423m);
                h(j3, i17, i14, this.f13423m);
                i12 = i15 + i10;
            }
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f13406f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f13407g = z10;
                rVar.f13406f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f13416e) {
            this.f13418g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f13419i.a(i10, i11, bArr);
        }
        this.f13420j.a(i10, i11, bArr);
        this.f13421k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
        this.f13422l = 0L;
        this.f13423m = -9223372036854775807L;
        f2.p.a(this.f13417f);
        this.f13418g.g();
        this.h.g();
        this.f13419i.g();
        this.f13420j.g();
        this.f13421k.g();
        this.f13413a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f13406f = false;
            rVar.f13407g = false;
            rVar.h = false;
            rVar.f13408i = false;
            rVar.f13409j = false;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f13414b = f0Var.f13295e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.f13415c = R1;
        this.d = new r(R1);
        this.f13413a.b(qVar, f0Var);
    }

    @Override
    public final void f(boolean z10) {
        e2.d.h(this.f13415c);
        String str = e2.d0.f8737a;
        if (z10) {
            this.f13413a.d.c(0);
            a(this.f13422l, 0, 0, this.f13423m);
            h(this.f13422l, 0, 48, this.f13423m);
        }
    }

    @Override
    public final void g(int i10, long j3) {
        this.f13423m = j3;
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.f13416e;
        boolean z12 = false;
        rVar.f13407g = false;
        rVar.h = false;
        rVar.f13405e = j10;
        rVar.d = 0;
        rVar.f13403b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f13408i && !rVar.f13409j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f13408i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f13409j;
                rVar.f13409j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f13404c = z10;
        rVar.f13406f = (z10 || i11 <= 9) ? true : true;
        if (!this.f13416e) {
            this.f13418g.h(i11);
            this.h.h(i11);
            this.f13419i.h(i11);
        }
        this.f13420j.h(i11);
        this.f13421k.h(i11);
    }
}
