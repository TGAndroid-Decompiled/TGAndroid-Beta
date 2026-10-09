package j4;

import b2.r0;
import c3.h0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f13825a;
    public boolean f13826b;
    public long f13827c;
    public int d;
    public int f13828e;
    public final Object f13829f;
    public Object f13830g;

    public h(List list) {
        this.f13825a = 0;
        this.f13829f = list;
        this.f13830g = new h0[list.size()];
        this.f13827c = -9223372036854775807L;
    }

    @Override
    public final void a(e2.v vVar) {
        h0[] h0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f13825a) {
            case 0:
                if (this.f13826b) {
                    if (this.d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.x() != 32) {
                                this.f13826b = false;
                            }
                            this.d--;
                            z11 = this.f13826b;
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
                                this.f13826b = false;
                            }
                            this.d--;
                            z10 = this.f13826b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i10 = vVar.f8585b;
                    int a2 = vVar.a();
                    for (h0 h0Var : (h0[]) this.f13830g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.f13828e += a2;
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.f13829f;
                e2.d.h((h0) this.f13830g);
                if (this.f13826b) {
                    int a10 = vVar.a();
                    int i11 = this.f13828e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(vVar.f8584a, vVar.f8585b, vVar2.f8584a, this.f13828e, min);
                        if (this.f13828e + min == 10) {
                            vVar2.J(0);
                            if (73 == vVar2.x() && 68 == vVar2.x() && 51 == vVar2.x()) {
                                vVar2.K(3);
                                this.d = vVar2.w() + 10;
                            } else {
                                e2.a.n("Id3Reader", "Discarding invalid ID3 tag");
                                this.f13826b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.f13828e);
                    ((h0) this.f13830g).d(min2, vVar);
                    this.f13828e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13825a) {
            case 0:
                this.f13826b = false;
                this.f13827c = -9223372036854775807L;
                return;
            default:
                this.f13826b = false;
                this.f13827c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.f13825a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.f13830g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f13829f).get(i10);
                    f0Var.b();
                    f0Var.c();
                    h0 f22 = qVar.f2(f0Var.f13808c, 3);
                    b2.r rVar = new b2.r();
                    f0Var.c();
                    rVar.f3571a = (String) f0Var.f13809e;
                    rVar.f3584p = r0.n("video/mp2t");
                    rVar.f3585q = r0.n("application/dvbsubs");
                    rVar.f3588t = Collections.singletonList(e0Var.f13803b);
                    rVar.d = e0Var.f13802a;
                    hg.c.s(rVar, f22);
                    h0VarArr[i10] = f22;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                h0 f23 = qVar.f2(f0Var.f13808c, 5);
                this.f13830g = f23;
                b2.r rVar2 = new b2.r();
                f0Var.c();
                rVar2.f3571a = (String) f0Var.f13809e;
                rVar2.f3584p = r0.n("video/mp2t");
                rVar2.f3585q = r0.n("application/id3");
                hg.c.s(rVar2, f23);
                return;
        }
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        switch (this.f13825a) {
            case 0:
                if (this.f13826b) {
                    if (this.f13827c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.g(z11);
                    for (h0 h0Var : (h0[]) this.f13830g) {
                        h0Var.c(this.f13827c, 1, this.f13828e, 0, null);
                    }
                    this.f13826b = false;
                    return;
                }
                return;
            default:
                e2.d.h((h0) this.f13830g);
                if (this.f13826b && (i10 = this.d) != 0 && this.f13828e == i10) {
                    if (this.f13827c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2.d.g(z12);
                    ((h0) this.f13830g).c(this.f13827c, 1, this.d, 0, null);
                    this.f13826b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i10, long j3) {
        switch (this.f13825a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f13826b = true;
                    this.f13827c = j3;
                    this.f13828e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f13826b = true;
                    this.f13827c = j3;
                    this.d = 0;
                    this.f13828e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f13825a = 1;
        this.f13829f = new e2.v(10);
        this.f13827c = -9223372036854775807L;
    }
}
