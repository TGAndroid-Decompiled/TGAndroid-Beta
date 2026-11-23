package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f20661a;
    public boolean f20662b;
    public long f20663c;
    public int d;
    public int f20664e;
    public final Object f20665f;
    public Object f20666g;

    public h(List list) {
        this.f20661a = 0;
        this.f20665f = list;
        this.f20666g = new i0[list.size()];
        this.f20663c = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x xVar) {
        i0[] i0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f20661a) {
            case 0:
                if (this.f20662b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f20662b = false;
                            }
                            this.d--;
                            z11 = this.f20662b;
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
                                this.f20662b = false;
                            }
                            this.d--;
                            z10 = this.f20662b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i7 = xVar.f13866b;
                    int a10 = xVar.a();
                    for (i0 i0Var : (i0[]) this.f20666g) {
                        xVar.N(i7);
                        i0Var.b(a10, xVar);
                    }
                    this.f20664e += a10;
                    return;
                }
                return;
            default:
                h2.x xVar2 = (h2.x) this.f20665f;
                ((i0) this.f20666g).getClass();
                if (this.f20662b) {
                    int a11 = xVar.a();
                    int i10 = this.f20664e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(xVar.f13865a, xVar.f13866b, xVar2.f13865a, this.f20664e, min);
                        if (this.f20664e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                h2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f20662b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.f20664e);
                    ((i0) this.f20666g).b(min2, xVar);
                    this.f20664e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f20661a) {
            case 0:
                this.f20662b = false;
                this.f20663c = -9223372036854775807L;
                return;
            default:
                this.f20662b = false;
                this.f20663c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f20661a) {
            case 0:
                if (this.f20662b) {
                    if (this.f20663c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    la.p(z11);
                    for (i0 i0Var : (i0[]) this.f20666g) {
                        i0Var.c(this.f20663c, 1, this.f20664e, 0, null);
                    }
                    this.f20662b = false;
                    return;
                }
                return;
            default:
                ((i0) this.f20666g).getClass();
                if (this.f20662b && (i7 = this.d) != 0 && this.f20664e == i7) {
                    if (this.f20663c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    la.p(z12);
                    ((i0) this.f20666g).c(this.f20663c, 1, this.d, 0, null);
                    this.f20662b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        switch (this.f20661a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f20662b = true;
                    this.f20663c = j3;
                    this.f20664e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f20662b = true;
                    this.f20663c = j3;
                    this.d = 0;
                    this.f20664e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        switch (this.f20661a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.f20666g;
                for (int i7 = 0; i7 < i0VarArr.length; i7++) {
                    e0 e0Var = (e0) ((List) this.f20665f).get(i7);
                    f0Var.b();
                    f0Var.c();
                    i0 d2 = qVar.d2(f0Var.f20644c, 3);
                    e2.t tVar = new e2.t();
                    f0Var.c();
                    tVar.f10731a = (String) f0Var.f20645e;
                    tVar.f10745q = s0.n("video/mp2t");
                    tVar.f10746r = s0.n("application/dvbsubs");
                    tVar.f10749u = Collections.singletonList(e0Var.f20639b);
                    tVar.d = e0Var.f20638a;
                    p5.c.r(tVar, d2);
                    i0VarArr[i7] = d2;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                i0 d22 = qVar.d2(f0Var.f20644c, 5);
                this.f20666g = d22;
                e2.t tVar2 = new e2.t();
                f0Var.c();
                tVar2.f10731a = (String) f0Var.f20645e;
                tVar2.f10745q = s0.n("video/mp2t");
                tVar2.f10746r = s0.n("application/id3");
                p5.c.r(tVar2, d22);
                return;
        }
    }

    public h() {
        this.f20661a = 1;
        this.f20665f = new h2.x(10);
        this.f20663c = -9223372036854775807L;
    }
}
