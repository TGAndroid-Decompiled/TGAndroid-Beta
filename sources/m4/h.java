package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class h implements i {
    public final int f19680a;
    public boolean f19681b;
    public long f19682c;
    public int d;
    public int f19683e;
    public final Object f19684f;
    public Object f19685g;

    public h(List list) {
        this.f19680a = 0;
        this.f19684f = list;
        this.f19685g = new j0[list.size()];
        this.f19682c = -9223372036854775807L;
    }

    @Override
    public final void c(h2.x xVar) {
        j0[] j0VarArr;
        boolean z9;
        boolean z10;
        switch (this.f19680a) {
            case 0:
                if (this.f19681b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f19681b = false;
                            }
                            this.d--;
                            z10 = this.f19681b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (xVar.a() == 0) {
                            z9 = false;
                        } else {
                            if (xVar.A() != 0) {
                                this.f19681b = false;
                            }
                            this.d--;
                            z9 = this.f19681b;
                        }
                        if (!z9) {
                            return;
                        }
                    }
                    int i7 = xVar.f14165b;
                    int a10 = xVar.a();
                    for (j0 j0Var : (j0[]) this.f19685g) {
                        xVar.N(i7);
                        j0Var.b(a10, xVar);
                    }
                    this.f19683e += a10;
                    return;
                }
                return;
            default:
                h2.x xVar2 = (h2.x) this.f19684f;
                ((j0) this.f19685g).getClass();
                if (this.f19681b) {
                    int a11 = xVar.a();
                    int i10 = this.f19683e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(xVar.f14164a, xVar.f14165b, xVar2.f14164a, this.f19683e, min);
                        if (this.f19683e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                h2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f19681b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.f19683e);
                    ((j0) this.f19685g).b(min2, xVar);
                    this.f19683e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f19680a) {
            case 0:
                this.f19681b = false;
                this.f19682c = -9223372036854775807L;
                return;
            default:
                this.f19681b = false;
                this.f19682c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(boolean z9) {
        boolean z10;
        int i7;
        boolean z11;
        switch (this.f19680a) {
            case 0:
                if (this.f19681b) {
                    if (this.f19682c != -9223372036854775807L) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ia.p(z10);
                    for (j0 j0Var : (j0[]) this.f19685g) {
                        j0Var.c(this.f19682c, 1, this.f19683e, 0, null);
                    }
                    this.f19681b = false;
                    return;
                }
                return;
            default:
                ((j0) this.f19685g).getClass();
                if (this.f19681b && (i7 = this.d) != 0 && this.f19683e == i7) {
                    if (this.f19682c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ia.p(z11);
                    ((j0) this.f19685g).c(this.f19682c, 1, this.d, 0, null);
                    this.f19681b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i7, long j3) {
        switch (this.f19680a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f19681b = true;
                    this.f19682c = j3;
                    this.f19683e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f19681b = true;
                    this.f19682c = j3;
                    this.d = 0;
                    this.f19683e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        switch (this.f19680a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.f19685g;
                for (int i7 = 0; i7 < j0VarArr.length; i7++) {
                    f0 f0Var = (f0) ((List) this.f19684f).get(i7);
                    g0Var.b();
                    g0Var.c();
                    j0 O1 = qVar.O1(g0Var.f19678c, 3);
                    e2.t tVar = new e2.t();
                    g0Var.c();
                    tVar.f10553a = (String) g0Var.f19679e;
                    tVar.f10567q = s0.n("video/mp2t");
                    tVar.f10568r = s0.n("application/dvbsubs");
                    tVar.f10571u = Collections.singletonList(f0Var.f19660b);
                    tVar.d = f0Var.f19659a;
                    f1.s(tVar, O1);
                    j0VarArr[i7] = O1;
                }
                return;
            default:
                g0Var.b();
                g0Var.c();
                j0 O12 = qVar.O1(g0Var.f19678c, 5);
                this.f19685g = O12;
                e2.t tVar2 = new e2.t();
                g0Var.c();
                tVar2.f10553a = (String) g0Var.f19679e;
                tVar2.f10567q = s0.n("video/mp2t");
                tVar2.f10568r = s0.n("application/id3");
                f1.s(tVar2, O12);
                return;
        }
    }

    public h() {
        this.f19680a = 1;
        this.f19684f = new h2.x(10);
        this.f19682c = -9223372036854775807L;
    }
}
