package m4;

import a8.ma;
import e2.s0;
import f3.j0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f20723a;
    public boolean f20724b;
    public long f20725c;
    public int d;
    public int f20726e;
    public final Object f20727f;
    public Object f20728g;

    public h(List list) {
        this.f20723a = 0;
        this.f20727f = list;
        this.f20728g = new j0[list.size()];
        this.f20725c = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x xVar) {
        j0[] j0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f20723a) {
            case 0:
                if (this.f20724b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f20724b = false;
                            }
                            this.d--;
                            z11 = this.f20724b;
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
                                this.f20724b = false;
                            }
                            this.d--;
                            z10 = this.f20724b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i7 = xVar.f13829b;
                    int a10 = xVar.a();
                    for (j0 j0Var : (j0[]) this.f20728g) {
                        xVar.N(i7);
                        j0Var.b(a10, xVar);
                    }
                    this.f20726e += a10;
                    return;
                }
                return;
            default:
                h2.x xVar2 = (h2.x) this.f20727f;
                ((j0) this.f20728g).getClass();
                if (this.f20724b) {
                    int a11 = xVar.a();
                    int i10 = this.f20726e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(xVar.f13828a, xVar.f13829b, xVar2.f13828a, this.f20726e, min);
                        if (this.f20726e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                h2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f20724b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.f20726e);
                    ((j0) this.f20728g).b(min2, xVar);
                    this.f20726e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f20723a) {
            case 0:
                this.f20724b = false;
                this.f20725c = -9223372036854775807L;
                return;
            default:
                this.f20724b = false;
                this.f20725c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f20723a) {
            case 0:
                if (this.f20724b) {
                    if (this.f20725c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ma.p(z11);
                    for (j0 j0Var : (j0[]) this.f20728g) {
                        j0Var.c(this.f20725c, 1, this.f20726e, 0, null);
                    }
                    this.f20724b = false;
                    return;
                }
                return;
            default:
                ((j0) this.f20728g).getClass();
                if (this.f20724b && (i7 = this.d) != 0 && this.f20726e == i7) {
                    if (this.f20725c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ma.p(z12);
                    ((j0) this.f20728g).c(this.f20725c, 1, this.d, 0, null);
                    this.f20724b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        switch (this.f20723a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f20724b = true;
                    this.f20725c = j3;
                    this.f20726e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f20724b = true;
                    this.f20725c = j3;
                    this.d = 0;
                    this.f20726e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        switch (this.f20723a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.f20728g;
                for (int i7 = 0; i7 < j0VarArr.length; i7++) {
                    e0 e0Var = (e0) ((List) this.f20727f).get(i7);
                    f0Var.b();
                    f0Var.c();
                    j0 d2 = qVar.d2(f0Var.f20706c, 3);
                    e2.t tVar = new e2.t();
                    f0Var.c();
                    tVar.f10692a = (String) f0Var.f20707e;
                    tVar.f10706q = s0.n("video/mp2t");
                    tVar.f10707r = s0.n("application/dvbsubs");
                    tVar.f10710u = Collections.singletonList(e0Var.f20701b);
                    tVar.d = e0Var.f20700a;
                    p5.c.r(tVar, d2);
                    j0VarArr[i7] = d2;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                j0 d22 = qVar.d2(f0Var.f20706c, 5);
                this.f20728g = d22;
                e2.t tVar2 = new e2.t();
                f0Var.c();
                tVar2.f10692a = (String) f0Var.f20707e;
                tVar2.f10706q = s0.n("video/mp2t");
                tVar2.f10707r = s0.n("application/id3");
                p5.c.r(tVar2, d22);
                return;
        }
    }

    public h() {
        this.f20723a = 1;
        this.f20727f = new h2.x(10);
        this.f20725c = -9223372036854775807L;
    }
}
