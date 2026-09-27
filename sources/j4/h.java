package j4;

import b2.r0;
import c3.h0;
import hg.k0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f12691a;
    public boolean f12692b;
    public long f12693c;
    public int d;
    public int e;
    public final Object f12694f;
    public Object f12695g;

    public h(List list) {
        this.f12691a = 0;
        this.f12694f = list;
        this.f12695g = new h0[list.size()];
        this.f12693c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v vVar) {
        h0[] h0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f12691a) {
            case 0:
                if (this.f12692b) {
                    if (this.d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.x() != 32) {
                                this.f12692b = false;
                            }
                            this.d--;
                            z11 = this.f12692b;
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
                                this.f12692b = false;
                            }
                            this.d--;
                            z10 = this.f12692b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = vVar.f7919b;
                    int a2 = vVar.a();
                    for (h0 h0Var : (h0[]) this.f12695g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.f12694f;
                e2.d.h((h0) this.f12695g);
                if (this.f12692b) {
                    int a10 = vVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(vVar.f7918a, vVar.f7919b, vVar2.f7918a, this.e, min);
                        if (this.e + min == 10) {
                            vVar2.J(0);
                            if (73 == vVar2.x() && 68 == vVar2.x() && 51 == vVar2.x()) {
                                vVar2.K(3);
                                this.d = vVar2.w() + 10;
                            } else {
                                e2.a.n("Id3Reader", "Discarding invalid ID3 tag");
                                this.f12692b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((h0) this.f12695g).d(min2, vVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f12691a) {
            case 0:
                this.f12692b = false;
                this.f12693c = -9223372036854775807L;
                return;
            default:
                this.f12692b = false;
                this.f12693c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f12691a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.f12695g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f12694f).get(i10);
                    f0Var.a();
                    f0Var.b();
                    h0 Z1 = qVar.Z1(f0Var.d, 3);
                    b2.r rVar = new b2.r();
                    f0Var.b();
                    rVar.f3234a = f0Var.e;
                    rVar.f3246p = r0.n("video/mp2t");
                    rVar.f3247q = r0.n("application/dvbsubs");
                    rVar.f3250t = Collections.singletonList(e0Var.f12671b);
                    rVar.d = e0Var.f12670a;
                    k0.s(rVar, Z1);
                    h0VarArr[i10] = Z1;
                }
                return;
            default:
                f0Var.a();
                f0Var.b();
                h0 Z12 = qVar.Z1(f0Var.d, 5);
                this.f12695g = Z12;
                b2.r rVar2 = new b2.r();
                f0Var.b();
                rVar2.f3234a = f0Var.e;
                rVar2.f3246p = r0.n("video/mp2t");
                rVar2.f3247q = r0.n("application/id3");
                k0.s(rVar2, Z12);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f12691a) {
            case 0:
                if (this.f12692b) {
                    if (this.f12693c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.g(z11);
                    for (h0 h0Var : (h0[]) this.f12695g) {
                        h0Var.c(this.f12693c, 1, this.e, 0, null);
                    }
                    this.f12692b = false;
                    return;
                }
                return;
            default:
                e2.d.h((h0) this.f12695g);
                if (this.f12692b && (i10 = this.d) != 0 && this.e == i10) {
                    if (this.f12693c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2.d.g(z12);
                    ((h0) this.f12695g).c(this.f12693c, 1, this.d, 0, null);
                    this.f12692b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        switch (this.f12691a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f12692b = true;
                    this.f12693c = j3;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f12692b = true;
                    this.f12693c = j3;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f12691a = 1;
        this.f12694f = new e2.v(10);
        this.f12693c = -9223372036854775807L;
    }
}
