package j4;

import b2.r0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f11595a;
    public boolean f11596b;
    public long f11597c;
    public int d;
    public int e;
    public final Object f11598f;
    public Object f11599g;

    public h(List list) {
        this.f11595a = 0;
        this.f11598f = list;
        this.f11599g = new c3.h0[list.size()];
        this.f11597c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v vVar) {
        c3.h0[] h0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f11595a) {
            case 0:
                if (this.f11596b) {
                    if (this.d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.x() != 32) {
                                this.f11596b = false;
                            }
                            this.d--;
                            z11 = this.f11596b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (vVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (vVar.x() != 0) {
                                this.f11596b = false;
                            }
                            this.d--;
                            z10 = this.f11596b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = vVar.f7235b;
                    int a2 = vVar.a();
                    for (c3.h0 h0Var : (c3.h0[]) this.f11599g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.f11598f;
                e2.d.h((c3.h0) this.f11599g);
                if (this.f11596b) {
                    int a10 = vVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(vVar.f7234a, vVar.f7235b, vVar2.f7234a, this.e, min);
                        if (this.e + min == 10) {
                            vVar2.J(0);
                            if (73 == vVar2.x() && 68 == vVar2.x() && 51 == vVar2.x()) {
                                vVar2.K(3);
                                this.d = vVar2.w() + 10;
                            } else {
                                e2.a.n("Id3Reader", "Discarding invalid ID3 tag");
                                this.f11596b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((c3.h0) this.f11599g).d(min2, vVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f11595a) {
            case 0:
                this.f11596b = false;
                this.f11597c = -9223372036854775807L;
                return;
            default:
                this.f11596b = false;
                this.f11597c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(c3.q qVar, g0 g0Var) {
        switch (this.f11595a) {
            case 0:
                c3.h0[] h0VarArr = (c3.h0[]) this.f11599g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    f0 f0Var = (f0) ((List) this.f11598f).get(i10);
                    g0Var.a();
                    g0Var.b();
                    c3.h0 I = qVar.I(g0Var.d, 3);
                    b2.r rVar = new b2.r();
                    g0Var.b();
                    rVar.f1933a = g0Var.e;
                    rVar.f1945p = r0.n("video/mp2t");
                    rVar.f1946q = r0.n("application/dvbsubs");
                    rVar.f1949t = Collections.singletonList(f0Var.f11577b);
                    rVar.d = f0Var.f11576a;
                    hc.b.u(rVar, I);
                    h0VarArr[i10] = I;
                }
                return;
            default:
                g0Var.a();
                g0Var.b();
                c3.h0 I2 = qVar.I(g0Var.d, 5);
                this.f11599g = I2;
                b2.r rVar2 = new b2.r();
                g0Var.b();
                rVar2.f1933a = g0Var.e;
                rVar2.f1945p = r0.n("video/mp2t");
                rVar2.f1946q = r0.n("application/id3");
                hc.b.u(rVar2, I2);
                return;
        }
    }

    @Override
    public final void d(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f11595a) {
            case 0:
                if (this.f11596b) {
                    if (this.f11597c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.g(z11);
                    for (c3.h0 h0Var : (c3.h0[]) this.f11599g) {
                        h0Var.c(this.f11597c, 1, this.e, 0, null);
                    }
                    this.f11596b = false;
                    return;
                }
                return;
            default:
                e2.d.h((c3.h0) this.f11599g);
                if (this.f11596b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f11597c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2.d.g(z12);
                    ((c3.h0) this.f11599g).c(this.f11597c, 1, this.d, 0, null);
                    this.f11596b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(int i10, long j3) {
        switch (this.f11595a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f11596b = true;
                    this.f11597c = j3;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f11596b = true;
                    this.f11597c = j3;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f11595a = 1;
        this.f11598f = new e2.v(10);
        this.f11597c = -9223372036854775807L;
    }
}
