package j4;

import b2.r0;
import c3.h0;
import i2.m0;
import java.util.Collections;
public final class s implements i {
    public final c0 f12795a;
    public String f12796b;
    public h0 f12797c;
    public r d;
    public boolean e;
    public long f12803l;
    public final boolean[] f12798f = new boolean[3];
    public final m0 f12799g = new m0(32);
    public final m0 h = new m0(33);
    public final m0 f12800i = new m0(34);
    public final m0 f12801j = new m0(39);
    public final m0 f12802k = new m0(40);
    public long f12804m = -9223372036854775807L;
    public final e2.v f12805n = new e2.v();

    public s(c0 c0Var) {
        this.f12795a = c0Var;
    }

    @Override
    public final void a(e2.v vVar) {
        int i10;
        int i11;
        e2.d.h(this.f12797c);
        String str = e2.d0.f7882a;
        while (vVar.a() > 0) {
            int i12 = vVar.f7929b;
            int i13 = vVar.f7930c;
            byte[] bArr = vVar.f7928a;
            this.f12803l += vVar.a();
            this.f12797c.d(vVar.a(), vVar);
            while (i12 < i13) {
                int b10 = f2.o.b(bArr, i12, i13, this.f12798f);
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
                long j3 = this.f12803l - i17;
                if (i16 < 0) {
                    i11 = -i16;
                } else {
                    i11 = 0;
                }
                b(j3, i17, i11, this.f12804m);
                h(j3, i17, i14, this.f12804m);
                i12 = i15 + i10;
            }
        }
    }

    public final void b(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.f12795a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.f12791j && rVar.f12789g) {
            rVar.f12794m = rVar.f12787c;
            rVar.f12791j = false;
        } else if (rVar.h || rVar.f12789g) {
            if (z10 && rVar.f12790i) {
                rVar.a(i10 + ((int) (j3 - rVar.f12786b)));
            }
            rVar.f12792k = rVar.f12786b;
            rVar.f12793l = rVar.e;
            rVar.f12794m = rVar.f12787c;
            rVar.f12790i = true;
        }
        if (!this.e) {
            m0 m0Var = this.f12799g;
            m0Var.e(i11);
            m0 m0Var2 = this.h;
            m0Var2.e(i11);
            m0 m0Var3 = this.f12800i;
            m0Var3.e(i11);
            if (m0Var.d && m0Var2.d && m0Var3.d) {
                String str = this.f12796b;
                int i12 = m0Var.e;
                byte[] bArr = new byte[m0Var2.e + i12 + m0Var3.e];
                System.arraycopy((byte[]) m0Var.f10783f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) m0Var2.f10783f, 0, bArr, m0Var.e, m0Var2.e);
                System.arraycopy((byte[]) m0Var3.f10783f, 0, bArr, m0Var.e + m0Var2.e, m0Var3.e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) m0Var2.f10783f, 3, m0Var2.e, null);
                f2.h hVar = h.f8814b;
                if (hVar != null) {
                    int i13 = hVar.f8804a;
                    boolean z11 = hVar.f8805b;
                    str2 = e2.e.a(i13, hVar.f8806c, hVar.d, hVar.f8807f, z11, hVar.e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.f3239a = str;
                rVar2.f3251p = r0.n("video/mp2t");
                rVar2.f3252q = r0.n("video/hevc");
                rVar2.f3245j = str2;
                rVar2.f3258x = h.e;
                rVar2.f3259y = h.f8816f;
                rVar2.f3260z = h.f8817g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.f8820k, h.f8821l, h.f8822m, null, h.f8815c + 8, h.d + 8);
                rVar2.D = h.f8818i;
                rVar2.f3254s = h.f8819j;
                rVar2.H = h.f8813a + 1;
                rVar2.f3255t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.f12797c.b(sVar);
                int i14 = sVar.f3310t;
                if (i14 != -1) {
                    cVar.k(i14);
                    this.e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        m0 m0Var4 = this.f12801j;
        boolean e = m0Var4.e(i11);
        e2.v vVar = this.f12805n;
        if (e) {
            vVar.H(f2.o.m(m0Var4.e, (byte[]) m0Var4.f10783f), (byte[]) m0Var4.f10783f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        m0 m0Var5 = this.f12802k;
        if (m0Var5.e(i11)) {
            vVar.H(f2.o.m(m0Var5.e, (byte[]) m0Var5.f10783f), (byte[]) m0Var5.f10783f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override
    public final void c() {
        this.f12803l = 0L;
        this.f12804m = -9223372036854775807L;
        f2.o.a(this.f12798f);
        this.f12799g.g();
        this.h.g();
        this.f12800i.g();
        this.f12801j.g();
        this.f12802k.g();
        this.f12795a.d.c(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f12788f = false;
            rVar.f12789g = false;
            rVar.h = false;
            rVar.f12790i = false;
            rVar.f12791j = false;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.f12796b = f0Var.e;
        f0Var.b();
        h0 Z1 = qVar.Z1(f0Var.d, 2);
        this.f12797c = Z1;
        this.d = new r(Z1);
        this.f12795a.b(qVar, f0Var);
    }

    @Override
    public final void e(boolean z10) {
        e2.d.h(this.f12797c);
        String str = e2.d0.f7882a;
        if (z10) {
            this.f12795a.d.c(0);
            b(this.f12803l, 0, 0, this.f12804m);
            h(this.f12803l, 0, 48, this.f12804m);
        }
    }

    @Override
    public final void f(int i10, long j3) {
        this.f12804m = j3;
    }

    public final void g(int i10, int i11, byte[] bArr) {
        boolean z10;
        r rVar = this.d;
        if (rVar.f12788f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f12789g = z10;
                rVar.f12788f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.f12799g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f12800i.a(i10, i11, bArr);
        }
        this.f12801j.a(i10, i11, bArr);
        this.f12802k.a(i10, i11, bArr);
    }

    public final void h(long j3, int i10, int i11, long j10) {
        boolean z10;
        r rVar = this.d;
        boolean z11 = this.e;
        boolean z12 = false;
        rVar.f12789g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.f12786b = j3;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f12790i && !rVar.f12791j) {
                if (z11) {
                    rVar.a(i10);
                }
                rVar.f12790i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.f12791j;
                rVar.f12791j = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f12787c = z10;
        rVar.f12788f = (z10 || i11 <= 9) ? true : true;
        if (!this.e) {
            this.f12799g.h(i11);
            this.h.h(i11);
            this.f12800i.h(i11);
        }
        this.f12801j.h(i11);
        this.f12802k.h(i11);
    }
}
