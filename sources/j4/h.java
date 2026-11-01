package j4;

import b2.v0;
import c3.k0;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class h implements i {
    public final int f9493a;
    public boolean f9494b;
    public long f9495c;
    public int d;
    public int e;
    public final Object f9496f;
    public Object f9497g;

    public h(List list) {
        this.f9493a = 0;
        this.f9496f = list;
        this.f9497g = new k0[list.size()];
        this.f9495c = -9223372036854775807L;
    }

    @Override
    public final void c(e2.x xVar) {
        k0[] k0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f9493a) {
            case 0:
                if (this.f9494b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f9494b = false;
                            }
                            this.d--;
                            z11 = this.f9494b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (xVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (xVar.A() != 0) {
                                this.f9494b = false;
                            }
                            this.d--;
                            z10 = this.f9494b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = xVar.f6208b;
                    int a2 = xVar.a();
                    for (k0 k0Var : (k0[]) this.f9497g) {
                        xVar.N(i10);
                        k0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.x xVar2 = (e2.x) this.f9496f;
                ((k0) this.f9497g).getClass();
                if (this.f9494b) {
                    int a10 = xVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(xVar.f6207a, xVar.f6208b, xVar2.f6207a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                e2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f9494b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((k0) this.f9497g).d(min2, xVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e() {
        switch (this.f9493a) {
            case 0:
                this.f9494b = false;
                this.f9495c = -9223372036854775807L;
                return;
            default:
                this.f9494b = false;
                this.f9495c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void f(c3.q qVar, g0 g0Var) {
        switch (this.f9493a) {
            case 0:
                k0[] k0VarArr = (k0[]) this.f9497g;
                for (int i10 = 0; i10 < k0VarArr.length; i10++) {
                    f0 f0Var = (f0) ((List) this.f9496f).get(i10);
                    g0Var.b();
                    g0Var.c();
                    k0 I1 = qVar.I1(g0Var.f9492c, 3);
                    b2.w wVar = new b2.w();
                    g0Var.c();
                    wVar.f2356a = (String) g0Var.e;
                    wVar.f2369q = v0.n("video/mp2t");
                    wVar.f2370r = v0.n("application/dvbsubs");
                    wVar.f2373u = Collections.singletonList(f0Var.f9475b);
                    wVar.d = f0Var.f9474a;
                    i0.a.r(wVar, I1);
                    k0VarArr[i10] = I1;
                }
                return;
            default:
                g0Var.b();
                g0Var.c();
                k0 I12 = qVar.I1(g0Var.f9492c, 5);
                this.f9497g = I12;
                b2.w wVar2 = new b2.w();
                g0Var.c();
                wVar2.f2356a = (String) g0Var.e;
                wVar2.f2369q = v0.n("video/mp2t");
                wVar2.f2370r = v0.n("application/id3");
                i0.a.r(wVar2, I12);
                return;
        }
    }

    @Override
    public final void g(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f9493a) {
            case 0:
                if (this.f9494b) {
                    if (this.f9495c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t6.p(z11);
                    for (k0 k0Var : (k0[]) this.f9497g) {
                        k0Var.c(this.f9495c, 1, this.e, 0, null);
                    }
                    this.f9494b = false;
                    return;
                }
                return;
            default:
                ((k0) this.f9497g).getClass();
                if (this.f9494b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f9495c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    t6.p(z12);
                    ((k0) this.f9497g).c(this.f9495c, 1, this.d, 0, null);
                    this.f9494b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void h(int i10, long j10) {
        switch (this.f9493a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f9494b = true;
                    this.f9495c = j10;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f9494b = true;
                    this.f9495c = j10;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f9493a = 1;
        this.f9496f = new e2.x(10);
        this.f9495c = -9223372036854775807L;
    }
}
