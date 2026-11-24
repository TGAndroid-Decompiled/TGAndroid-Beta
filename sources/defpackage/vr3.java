package defpackage;

import java.util.Collections;
import java.util.List;
public final class vr3 implements gu3 {
    public final byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public vr3(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new wxb[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override
    public final void b(xu7 xu7Var) {
        wxb[] wxbVarArr;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (xu7Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (xu7Var.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (xu7Var.a() == 0) {
                            z = false;
                        } else {
                            if (xu7Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = xu7Var.b;
                    int a = xu7Var.a();
                    for (wxb wxbVar : (wxb[]) this.g) {
                        xu7Var.N(i);
                        wxbVar.e(a, xu7Var);
                    }
                    this.e += a;
                    return;
                }
                return;
            default:
                xu7 xu7Var2 = (xu7) this.f;
                ((wxb) this.g).getClass();
                if (this.b) {
                    int a2 = xu7Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(xu7Var.a, xu7Var.b, xu7Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            xu7Var2.N(0);
                            if (73 == xu7Var2.A() && 68 == xu7Var2.A() && 51 == xu7Var2.A()) {
                                xu7Var2.O(3);
                                this.d = xu7Var2.z() + 10;
                            } else {
                                lad.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((wxb) this.g).e(min2, xu7Var);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e() {
        int i;
        boolean z = true;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    gre.p(z);
                    for (wxb wxbVar : (wxb[]) this.g) {
                        wxbVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                ((wxb) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    gre.p(z);
                    ((wxb) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void f() {
        byte b = this.a;
    }

    @Override
    public final void g(int i, long j) {
        int i2 = i & 4;
        switch (this.a) {
            case 0:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void h(l74 l74Var, l2c l2cVar) {
        switch (this.a) {
            case 0:
                wxb[] wxbVarArr = (wxb[]) this.g;
                for (int i = 0; i < wxbVarArr.length; i++) {
                    k2c k2cVar = (k2c) ((List) this.f).get(i);
                    l2cVar.a();
                    l2cVar.b();
                    wxb S = l74Var.S(l2cVar.d, 3);
                    em4 em4Var = new em4();
                    l2cVar.b();
                    em4Var.a = l2cVar.e;
                    em4Var.r = ud7.n("video/mp2t");
                    em4Var.s = ud7.n("application/dvbsubs");
                    em4Var.v = Collections.singletonList(k2cVar.b);
                    em4Var.d = k2cVar.a;
                    yjb.v(em4Var, S);
                    wxbVarArr[i] = S;
                }
                return;
            default:
                l2cVar.a();
                l2cVar.b();
                wxb S2 = l74Var.S(l2cVar.d, 5);
                this.g = S2;
                em4 em4Var2 = new em4();
                l2cVar.b();
                em4Var2.a = l2cVar.e;
                em4Var2.r = ud7.n("video/mp2t");
                em4Var2.s = ud7.n("application/id3");
                yjb.v(em4Var2, S2);
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    public vr3() {
        this.a = (byte) 1;
        this.f = new xu7(10);
        this.c = -9223372036854775807L;
    }
}
