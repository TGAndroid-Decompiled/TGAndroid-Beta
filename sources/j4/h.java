package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f15330a;
    public boolean f15331b;
    public long f15332c;
    public int d;
    public int e;
    public final Object f15333f;
    public Object f15334g;

    public h(List list) {
        this.f15330a = 0;
        this.f15333f = list;
        this.f15334g = new j0[list.size()];
        this.f15332c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x xVar) {
        j0[] j0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f15330a) {
            case 0:
                if (this.f15331b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f15331b = false;
                            }
                            this.d--;
                            z11 = this.f15331b;
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
                                this.f15331b = false;
                            }
                            this.d--;
                            z10 = this.f15331b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = xVar.f9733b;
                    int a2 = xVar.a();
                    for (j0 j0Var : (j0[]) this.f15334g) {
                        xVar.N(i10);
                        j0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.x xVar2 = (e2.x) this.f15333f;
                ((j0) this.f15334g).getClass();
                if (this.f15331b) {
                    int a10 = xVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(xVar.f9732a, xVar.f9733b, xVar2.f9732a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                e2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f15331b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((j0) this.f15334g).d(min2, xVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f15330a) {
            case 0:
                this.f15331b = false;
                this.f15332c = -9223372036854775807L;
                return;
            default:
                this.f15331b = false;
                this.f15332c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f15330a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.f15334g;
                for (int i10 = 0; i10 < j0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f15333f).get(i10);
                    f0Var.b();
                    f0Var.c();
                    j0 F1 = qVar.F1(f0Var.f15315c, 3);
                    b2.w wVar = new b2.w();
                    f0Var.c();
                    wVar.f3519a = (String) f0Var.e;
                    wVar.f3532q = w0.n("video/mp2t");
                    wVar.f3533r = w0.n("application/dvbsubs");
                    wVar.f3536u = Collections.singletonList(e0Var.f15310b);
                    wVar.d = e0Var.f15309a;
                    ic.a.u(wVar, F1);
                    j0VarArr[i10] = F1;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                j0 F12 = qVar.F1(f0Var.f15315c, 5);
                this.f15334g = F12;
                b2.w wVar2 = new b2.w();
                f0Var.c();
                wVar2.f3519a = (String) f0Var.e;
                wVar2.f3532q = w0.n("video/mp2t");
                wVar2.f3533r = w0.n("application/id3");
                ic.a.u(wVar2, F12);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f15330a) {
            case 0:
                if (this.f15331b) {
                    if (this.f15332c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb.p(z11);
                    for (j0 j0Var : (j0[]) this.f15334g) {
                        j0Var.c(this.f15332c, 1, this.e, 0, null);
                    }
                    this.f15331b = false;
                    return;
                }
                return;
            default:
                ((j0) this.f15334g).getClass();
                if (this.f15331b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f15332c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    yb.p(z12);
                    ((j0) this.f15334g).c(this.f15332c, 1, this.d, 0, null);
                    this.f15331b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f15330a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f15331b = true;
                    this.f15332c = j10;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f15331b = true;
                    this.f15332c = j10;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f15330a = 1;
        this.f15333f = new e2.x(10);
        this.f15332c = -9223372036854775807L;
    }
}
