package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f20630a;
    public boolean f20631b;
    public long f20632c;
    public int d;
    public int f20633e;
    public final Object f20634f;
    public Object f20635g;

    public h(List list) {
        this.f20630a = 0;
        this.f20634f = list;
        this.f20635g = new i0[list.size()];
        this.f20632c = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x xVar) {
        i0[] i0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f20630a) {
            case 0:
                if (this.f20631b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f20631b = false;
                            }
                            this.d--;
                            z11 = this.f20631b;
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
                                this.f20631b = false;
                            }
                            this.d--;
                            z10 = this.f20631b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i7 = xVar.f13834b;
                    int a10 = xVar.a();
                    for (i0 i0Var : (i0[]) this.f20635g) {
                        xVar.N(i7);
                        i0Var.b(a10, xVar);
                    }
                    this.f20633e += a10;
                    return;
                }
                return;
            default:
                h2.x xVar2 = (h2.x) this.f20634f;
                ((i0) this.f20635g).getClass();
                if (this.f20631b) {
                    int a11 = xVar.a();
                    int i10 = this.f20633e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(xVar.f13833a, xVar.f13834b, xVar2.f13833a, this.f20633e, min);
                        if (this.f20633e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                h2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f20631b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.f20633e);
                    ((i0) this.f20635g).b(min2, xVar);
                    this.f20633e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f20630a) {
            case 0:
                this.f20631b = false;
                this.f20632c = -9223372036854775807L;
                return;
            default:
                this.f20631b = false;
                this.f20632c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f20630a) {
            case 0:
                if (this.f20631b) {
                    if (this.f20632c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    la.p(z11);
                    for (i0 i0Var : (i0[]) this.f20635g) {
                        i0Var.c(this.f20632c, 1, this.f20633e, 0, null);
                    }
                    this.f20631b = false;
                    return;
                }
                return;
            default:
                ((i0) this.f20635g).getClass();
                if (this.f20631b && (i7 = this.d) != 0 && this.f20633e == i7) {
                    if (this.f20632c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    la.p(z12);
                    ((i0) this.f20635g).c(this.f20632c, 1, this.d, 0, null);
                    this.f20631b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        switch (this.f20630a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f20631b = true;
                    this.f20632c = j3;
                    this.f20633e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f20631b = true;
                    this.f20632c = j3;
                    this.d = 0;
                    this.f20633e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        switch (this.f20630a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.f20635g;
                for (int i7 = 0; i7 < i0VarArr.length; i7++) {
                    e0 e0Var = (e0) ((List) this.f20634f).get(i7);
                    f0Var.b();
                    f0Var.c();
                    i0 d2 = qVar.d2(f0Var.f20613c, 3);
                    e2.t tVar = new e2.t();
                    f0Var.c();
                    tVar.f10699a = (String) f0Var.f20614e;
                    tVar.f10713q = s0.n("video/mp2t");
                    tVar.f10714r = s0.n("application/dvbsubs");
                    tVar.f10717u = Collections.singletonList(e0Var.f20608b);
                    tVar.d = e0Var.f20607a;
                    p5.c.r(tVar, d2);
                    i0VarArr[i7] = d2;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                i0 d22 = qVar.d2(f0Var.f20613c, 5);
                this.f20635g = d22;
                e2.t tVar2 = new e2.t();
                f0Var.c();
                tVar2.f10699a = (String) f0Var.f20614e;
                tVar2.f10713q = s0.n("video/mp2t");
                tVar2.f10714r = s0.n("application/id3");
                p5.c.r(tVar2, d22);
                return;
        }
    }

    public h() {
        this.f20630a = 1;
        this.f20634f = new h2.x(10);
        this.f20632c = -9223372036854775807L;
    }
}
