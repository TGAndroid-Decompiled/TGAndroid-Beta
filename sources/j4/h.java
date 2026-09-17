package j4;

import b2.r0;
import c3.h0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f13311a;
    public boolean f13312b;
    public long f13313c;
    public int d;
    public int f13314e;
    public final Object f13315f;
    public Object f13316g;

    public h(List list) {
        this.f13311a = 0;
        this.f13315f = list;
        this.f13316g = new h0[list.size()];
        this.f13313c = -9223372036854775807L;
    }

    @Override
    public final void b(e2.v vVar) {
        h0[] h0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f13311a) {
            case 0:
                if (this.f13312b) {
                    if (this.d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.x() != 32) {
                                this.f13312b = false;
                            }
                            this.d--;
                            z11 = this.f13312b;
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
                                this.f13312b = false;
                            }
                            this.d--;
                            z10 = this.f13312b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = vVar.f8790b;
                    int a2 = vVar.a();
                    for (h0 h0Var : (h0[]) this.f13316g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.f13314e += a2;
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.f13315f;
                e2.d.h((h0) this.f13316g);
                if (this.f13312b) {
                    int a10 = vVar.a();
                    int i11 = this.f13314e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(vVar.f8789a, vVar.f8790b, vVar2.f8789a, this.f13314e, min);
                        if (this.f13314e + min == 10) {
                            vVar2.J(0);
                            if (73 == vVar2.x() && 68 == vVar2.x() && 51 == vVar2.x()) {
                                vVar2.K(3);
                                this.d = vVar2.w() + 10;
                            } else {
                                e2.a.n("Id3Reader", "Discarding invalid ID3 tag");
                                this.f13312b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.f13314e);
                    ((h0) this.f13316g).d(min2, vVar);
                    this.f13314e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f13311a) {
            case 0:
                this.f13312b = false;
                this.f13313c = -9223372036854775807L;
                return;
            default:
                this.f13312b = false;
                this.f13313c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e(c3.q qVar, f0 f0Var) {
        switch (this.f13311a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.f13316g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f13315f).get(i10);
                    f0Var.a();
                    f0Var.b();
                    h0 R1 = qVar.R1(f0Var.d, 3);
                    b2.r rVar = new b2.r();
                    f0Var.b();
                    rVar.f2298a = f0Var.f13295e;
                    rVar.f2311p = r0.n("video/mp2t");
                    rVar.f2312q = r0.n("application/dvbsubs");
                    rVar.f2315t = Collections.singletonList(e0Var.f13289b);
                    rVar.d = e0Var.f13288a;
                    i2.g.u(rVar, R1);
                    h0VarArr[i10] = R1;
                }
                return;
            default:
                f0Var.a();
                f0Var.b();
                h0 R12 = qVar.R1(f0Var.d, 5);
                this.f13316g = R12;
                b2.r rVar2 = new b2.r();
                f0Var.b();
                rVar2.f2298a = f0Var.f13295e;
                rVar2.f2311p = r0.n("video/mp2t");
                rVar2.f2312q = r0.n("application/id3");
                i2.g.u(rVar2, R12);
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f13311a) {
            case 0:
                if (this.f13312b) {
                    if (this.f13313c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.g(z11);
                    for (h0 h0Var : (h0[]) this.f13316g) {
                        h0Var.c(this.f13313c, 1, this.f13314e, 0, null);
                    }
                    this.f13312b = false;
                    return;
                }
                return;
            default:
                e2.d.h((h0) this.f13316g);
                if (this.f13312b && (i10 = this.d) != 0 && this.f13314e == i10) {
                    if (this.f13313c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2.d.g(z12);
                    ((h0) this.f13316g).c(this.f13313c, 1, this.d, 0, null);
                    this.f13312b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(int i10, long j3) {
        switch (this.f13311a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f13312b = true;
                    this.f13313c = j3;
                    this.f13314e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f13312b = true;
                    this.f13313c = j3;
                    this.d = 0;
                    this.f13314e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f13311a = 1;
        this.f13315f = new e2.v(10);
        this.f13313c = -9223372036854775807L;
    }
}
