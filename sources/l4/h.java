package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class h implements i {
    public final int f17839a;
    public boolean f17840b;
    public long f17841c;
    public int d;
    public int f17842e;
    public final Object f17843f;
    public Object f17844g;

    public h(List list) {
        this.f17839a = 0;
        this.f17843f = list;
        this.f17844g = new i0[list.size()];
        this.f17841c = -9223372036854775807L;
    }

    @Override
    public final void a() {
        switch (this.f17839a) {
            case 0:
                this.f17840b = false;
                this.f17841c = -9223372036854775807L;
                return;
            default:
                this.f17840b = false;
                this.f17841c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(g2.y yVar) {
        i0[] i0VarArr;
        boolean z10;
        boolean z11;
        switch (this.f17839a) {
            case 0:
                if (this.f17840b) {
                    if (this.d == 2) {
                        if (yVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (yVar.A() != 32) {
                                this.f17840b = false;
                            }
                            this.d--;
                            z11 = this.f17840b;
                        }
                        if (!z11) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (yVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (yVar.A() != 0) {
                                this.f17840b = false;
                            }
                            this.d--;
                            z10 = this.f17840b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    int i3 = yVar.f11924b;
                    int a10 = yVar.a();
                    for (i0 i0Var : (i0[]) this.f17844g) {
                        yVar.N(i3);
                        i0Var.e(a10, yVar);
                    }
                    this.f17842e += a10;
                    return;
                }
                return;
            default:
                g2.y yVar2 = (g2.y) this.f17843f;
                ((i0) this.f17844g).getClass();
                if (this.f17840b) {
                    int a11 = yVar.a();
                    int i10 = this.f17842e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(yVar.f11923a, yVar.f11924b, yVar2.f11923a, this.f17842e, min);
                        if (this.f17842e + min == 10) {
                            yVar2.N(0);
                            if (73 == yVar2.A() && 68 == yVar2.A() && 51 == yVar2.A()) {
                                yVar2.O(3);
                                this.d = yVar2.z() + 10;
                            } else {
                                g2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f17840b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.f17842e);
                    ((i0) this.f17844g).e(min2, yVar);
                    this.f17842e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d(boolean z10) {
        boolean z11;
        int i3;
        boolean z12;
        switch (this.f17839a) {
            case 0:
                if (this.f17840b) {
                    if (this.f17841c != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zb.p(z11);
                    for (i0 i0Var : (i0[]) this.f17844g) {
                        i0Var.d(this.f17841c, 1, this.f17842e, 0, null);
                    }
                    this.f17840b = false;
                    return;
                }
                return;
            default:
                ((i0) this.f17844g).getClass();
                if (this.f17840b && (i3 = this.d) != 0 && this.f17842e == i3) {
                    if (this.f17841c != -9223372036854775807L) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zb.p(z12);
                    ((i0) this.f17844g).d(this.f17841c, 1, this.d, 0, null);
                    this.f17840b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(int i3, long j10) {
        switch (this.f17839a) {
            case 0:
                if ((i3 & 4) != 0) {
                    this.f17840b = true;
                    this.f17841c = j10;
                    this.f17842e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i3 & 4) != 0) {
                    this.f17840b = true;
                    this.f17841c = j10;
                    this.d = 0;
                    this.f17842e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        switch (this.f17839a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.f17844g;
                for (int i3 = 0; i3 < i0VarArr.length; i3++) {
                    e0 e0Var = (e0) ((List) this.f17843f).get(i3);
                    f0Var.b();
                    f0Var.c();
                    i0 i02 = qVar.i0(f0Var.f17822c, 3);
                    d2.u uVar = new d2.u();
                    f0Var.c();
                    uVar.f8416a = (String) f0Var.f17823e;
                    uVar.f8430q = u0.n("video/mp2t");
                    uVar.f8431r = u0.n("application/dvbsubs");
                    uVar.f8434u = Collections.singletonList(e0Var.f17817b);
                    uVar.d = e0Var.f17816a;
                    f1.w(uVar, i02);
                    i0VarArr[i3] = i02;
                }
                return;
            default:
                f0Var.b();
                f0Var.c();
                i0 i03 = qVar.i0(f0Var.f17822c, 5);
                this.f17844g = i03;
                d2.u uVar2 = new d2.u();
                f0Var.c();
                uVar2.f8416a = (String) f0Var.f17823e;
                uVar2.f8430q = u0.n("video/mp2t");
                uVar2.f8431r = u0.n("application/id3");
                f1.w(uVar2, i03);
                return;
        }
    }

    public h() {
        this.f17839a = 1;
        this.f17843f = new g2.y(10);
        this.f17841c = -9223372036854775807L;
    }
}
