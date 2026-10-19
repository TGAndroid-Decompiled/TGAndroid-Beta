package j4;

import b2.v0;
import c3.j0;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class h implements i {
    public final int f14072a;
    public boolean f14073b;
    public long f14074c;
    public int d;
    public int e;
    public final Object f14075f;
    public Object f14076g;

    public h(List list) {
        this.f14072a = 0;
        this.f14075f = list;
        this.f14076g = new j0[list.size()];
        this.f14074c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x xVar) {
        j0[] j0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f14072a) {
            case 0:
                if (this.f14073b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f14073b = false;
                            }
                            this.d--;
                            z11 = this.f14073b;
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
                                this.f14073b = false;
                            }
                            this.d--;
                            z10 = this.f14073b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = xVar.f8292b;
                    int a2 = xVar.a();
                    for (j0 j0Var : (j0[]) this.f14076g) {
                        xVar.N(i10);
                        j0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.x xVar2 = (e2.x) this.f14075f;
                ((j0) this.f14076g).getClass();
                if (this.f14073b) {
                    int a10 = xVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(xVar.f8291a, xVar.f8292b, xVar2.f8291a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                e2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f14073b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((j0) this.f14076g).d(min2, xVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14072a) {
            case 0:
                this.f14073b = false;
                this.f14074c = -9223372036854775807L;
                return;
            default:
                this.f14073b = false;
                this.f14074c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f14072a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.f14076g;
                for (int i10 = 0; i10 < j0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f14075f).get(i10);
                    f0Var.b();
                    f0Var.c();
                    j0 j02 = qVar.j0(f0Var.f14057c, 3);
                    b2.v vVar = new b2.v();
                    f0Var.c();
                    vVar.f4061a = (String) f0Var.e;
                    vVar.f4074q = v0.n("video/mp2t");
                    vVar.f4075r = v0.n("application/dvbsubs");
                    vVar.f4078u = Collections.singletonList(e0Var.f14052b);
                    vVar.d = e0Var.f14051a;
                    i2.e.u(vVar, j02);
                    j0VarArr[i10] = j02;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                j0 j03 = qVar.j0(f0Var.f14057c, 5);
                this.f14076g = j03;
                b2.v vVar2 = new b2.v();
                f0Var.c();
                vVar2.f4061a = (String) f0Var.e;
                vVar2.f4074q = v0.n("video/mp2t");
                vVar2.f4075r = v0.n("application/id3");
                i2.e.u(vVar2, j03);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f14072a) {
            case 0:
                if (this.f14073b) {
                    if (this.f14074c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u6.p(z11);
                    for (j0 j0Var : (j0[]) this.f14076g) {
                        j0Var.c(this.f14074c, 1, this.e, 0, null);
                    }
                    this.f14073b = false;
                    return;
                }
                return;
            default:
                ((j0) this.f14076g).getClass();
                if (this.f14073b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f14074c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u6.p(z12);
                    ((j0) this.f14076g).c(this.f14074c, 1, this.d, 0, null);
                    this.f14073b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f14072a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f14073b = true;
                    this.f14074c = j10;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f14073b = true;
                    this.f14074c = j10;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f14072a = 1;
        this.f14075f = new e2.x(10);
        this.f14074c = -9223372036854775807L;
    }
}
