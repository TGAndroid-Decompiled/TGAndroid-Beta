package defpackage;

import java.util.Collections;
import java.util.List;
public final class ns3 implements av3 {
    public final byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ns3(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new x1c[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override
    public final void b(ey7 ey7Var) {
        x1c[] x1cVarArr;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (ey7Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (ey7Var.A() != 32) {
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
                        if (ey7Var.a() == 0) {
                            z = false;
                        } else {
                            if (ey7Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = ey7Var.b;
                    int a = ey7Var.a();
                    for (x1c x1cVar : (x1c[]) this.g) {
                        ey7Var.N(i);
                        x1cVar.e(a, ey7Var);
                    }
                    this.e += a;
                    return;
                }
                return;
            default:
                ey7 ey7Var2 = (ey7) this.f;
                ((x1c) this.g).getClass();
                if (this.b) {
                    int a2 = ey7Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(ey7Var.a, ey7Var.b, ey7Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            ey7Var2.N(0);
                            if (73 == ey7Var2.A() && 68 == ey7Var2.A() && 51 == ey7Var2.A()) {
                                ey7Var2.O(3);
                                this.d = ey7Var2.z() + 10;
                            } else {
                                efd.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((x1c) this.g).e(min2, ey7Var);
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
                    yve.p(z);
                    for (x1c x1cVar : (x1c[]) this.g) {
                        x1cVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                ((x1c) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    yve.p(z);
                    ((x1c) this.g).a(this.c, 1, this.d, 0, null);
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
    public final void h(g84 g84Var, l6c l6cVar) {
        switch (this.a) {
            case 0:
                x1c[] x1cVarArr = (x1c[]) this.g;
                for (int i = 0; i < x1cVarArr.length; i++) {
                    k6c k6cVar = (k6c) ((List) this.f).get(i);
                    l6cVar.a();
                    l6cVar.b();
                    x1c e0 = g84Var.e0(l6cVar.d, 3);
                    jo4 jo4Var = new jo4();
                    l6cVar.b();
                    jo4Var.a = l6cVar.e;
                    jo4Var.r = dg7.n("video/mp2t");
                    jo4Var.s = dg7.n("application/dvbsubs");
                    jo4Var.v = Collections.singletonList(k6cVar.b);
                    jo4Var.d = k6cVar.a;
                    xnb.v(jo4Var, e0);
                    x1cVarArr[i] = e0;
                }
                return;
            default:
                l6cVar.a();
                l6cVar.b();
                x1c e02 = g84Var.e0(l6cVar.d, 5);
                this.g = e02;
                jo4 jo4Var2 = new jo4();
                l6cVar.b();
                jo4Var2.a = l6cVar.e;
                jo4Var2.r = dg7.n("video/mp2t");
                jo4Var2.s = dg7.n("application/id3");
                xnb.v(jo4Var2, e02);
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    public ns3() {
        this.a = (byte) 1;
        this.f = new ey7(10);
        this.c = -9223372036854775807L;
    }
}
