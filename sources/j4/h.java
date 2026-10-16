package j4;

import b2.w0;
import c3.i0;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class h implements i {
    public final int f12662a;
    public boolean f12663b;
    public long f12664c;
    public int d;
    public int e;
    public final Object f12665f;
    public Object f12666g;

    public h(List list) {
        this.f12662a = 0;
        this.f12665f = list;
        this.f12666g = new i0[list.size()];
        this.f12664c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.x xVar) {
        i0[] i0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f12662a) {
            case 0:
                if (this.f12663b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.f12663b = false;
                            }
                            this.d--;
                            z11 = this.f12663b;
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
                                this.f12663b = false;
                            }
                            this.d--;
                            z10 = this.f12663b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = xVar.f8415b;
                    int a2 = xVar.a();
                    for (i0 i0Var : (i0[]) this.f12666g) {
                        xVar.N(i10);
                        i0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.x xVar2 = (e2.x) this.f12665f;
                ((i0) this.f12666g).getClass();
                if (this.f12663b) {
                    int a10 = xVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(xVar.f8414a, xVar.f8415b, xVar2.f8414a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 == xVar2.A() && 68 == xVar2.A() && 51 == xVar2.A()) {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            } else {
                                e2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f12663b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((i0) this.f12666g).d(min2, xVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f12662a) {
            case 0:
                this.f12663b = false;
                this.f12664c = -9223372036854775807L;
                return;
            default:
                this.f12663b = false;
                this.f12664c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f12662a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.f12666g;
                for (int i10 = 0; i10 < i0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f12665f).get(i10);
                    f0Var.b();
                    f0Var.c();
                    i0 W = qVar.W(f0Var.f12647c, 3);
                    b2.w wVar = new b2.w();
                    f0Var.c();
                    wVar.f2456a = (String) f0Var.e;
                    wVar.f2469q = w0.n("video/mp2t");
                    wVar.f2470r = w0.n("application/dvbsubs");
                    wVar.f2473u = Collections.singletonList(e0Var.f12642b);
                    wVar.d = e0Var.f12641a;
                    i2.d.u(wVar, W);
                    i0VarArr[i10] = W;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                i0 W2 = qVar.W(f0Var.f12647c, 5);
                this.f12666g = W2;
                b2.w wVar2 = new b2.w();
                f0Var.c();
                wVar2.f2456a = (String) f0Var.e;
                wVar2.f2469q = w0.n("video/mp2t");
                wVar2.f2470r = w0.n("application/id3");
                i2.d.u(wVar2, W2);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f12662a) {
            case 0:
                if (this.f12663b) {
                    if (this.f12664c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u6.p(z11);
                    for (i0 i0Var : (i0[]) this.f12666g) {
                        i0Var.c(this.f12664c, 1, this.e, 0, null);
                    }
                    this.f12663b = false;
                    return;
                }
                return;
            default:
                ((i0) this.f12666g).getClass();
                if (this.f12663b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f12664c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u6.p(z12);
                    ((i0) this.f12666g).c(this.f12664c, 1, this.d, 0, null);
                    this.f12663b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f12662a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f12663b = true;
                    this.f12664c = j10;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f12663b = true;
                    this.f12664c = j10;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f12662a = 1;
        this.f12665f = new e2.x(10);
        this.f12664c = -9223372036854775807L;
    }
}
