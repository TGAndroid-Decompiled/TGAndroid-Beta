package defpackage;

import java.util.Collections;
import java.util.List;
public final class ft3 implements rv3 {
    public final byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ft3(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new yzb[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override
    public final void b(yw7 yw7Var) {
        yzb[] yzbVarArr;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (yw7Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (yw7Var.A() != 32) {
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
                        if (yw7Var.a() == 0) {
                            z = false;
                        } else {
                            if (yw7Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = yw7Var.b;
                    int a = yw7Var.a();
                    for (yzb yzbVar : (yzb[]) this.g) {
                        yw7Var.N(i);
                        yzbVar.e(a, yw7Var);
                    }
                    this.e += a;
                    return;
                }
                return;
            default:
                yw7 yw7Var2 = (yw7) this.f;
                ((yzb) this.g).getClass();
                if (this.b) {
                    int a2 = yw7Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(yw7Var.a, yw7Var.b, yw7Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            yw7Var2.N(0);
                            if (73 == yw7Var2.A() && 68 == yw7Var2.A() && 51 == yw7Var2.A()) {
                                yw7Var2.O(3);
                                this.d = yw7Var2.z() + 10;
                            } else {
                                ncd.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((yzb) this.g).e(min2, yw7Var);
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
                    jte.p(z);
                    for (yzb yzbVar : (yzb[]) this.g) {
                        yzbVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                ((yzb) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    jte.p(z);
                    ((yzb) this.g).a(this.c, 1, this.d, 0, null);
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
    public final void h(u84 u84Var, l4c l4cVar) {
        switch (this.a) {
            case 0:
                yzb[] yzbVarArr = (yzb[]) this.g;
                for (int i = 0; i < yzbVarArr.length; i++) {
                    k4c k4cVar = (k4c) ((List) this.f).get(i);
                    l4cVar.a();
                    l4cVar.b();
                    yzb c0 = u84Var.c0(l4cVar.d, 3);
                    fo4 fo4Var = new fo4();
                    l4cVar.b();
                    fo4Var.a = l4cVar.e;
                    fo4Var.r = wf7.n("video/mp2t");
                    fo4Var.s = wf7.n("application/dvbsubs");
                    fo4Var.v = Collections.singletonList(k4cVar.b);
                    fo4Var.d = k4cVar.a;
                    mlb.w(fo4Var, c0);
                    yzbVarArr[i] = c0;
                }
                return;
            default:
                l4cVar.a();
                l4cVar.b();
                yzb c02 = u84Var.c0(l4cVar.d, 5);
                this.g = c02;
                fo4 fo4Var2 = new fo4();
                l4cVar.b();
                fo4Var2.a = l4cVar.e;
                fo4Var2.r = wf7.n("video/mp2t");
                fo4Var2.s = wf7.n("application/id3");
                mlb.w(fo4Var2, c02);
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    public ft3() {
        this.a = (byte) 1;
        this.f = new yw7(10);
        this.c = -9223372036854775807L;
    }
}
