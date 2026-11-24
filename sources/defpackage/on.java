package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
public final class on {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public on(int[] iArr) {
        this.b = y6c.t0;
        this.c = -1;
        this.d = -1;
        this.a = iArr;
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = (i2 + 1) & this.d;
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.a, 0, iArr2, i5, this.b);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.d;
                int i4 = i3 << 1;
                int[] iArr = this.a;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.a = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i3 << 2];
                    this.a = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.a;
                iArr4[i4] = i;
                iArr4[i4 + 1] = i2;
                this.d++;
                return;
            }
            w26.j("Pixel distance must be non-negative");
            return;
        }
        w26.j("Layout positions must be non-negative");
    }

    public final void c(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        this.d = 0;
        int[] iArr = this.a;
        int i2 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        d49 d49Var = recyclerView.y;
        if (recyclerView.x != null && d49Var != null && d49Var.h) {
            if (z) {
                if (!recyclerView.d.g()) {
                    int b = recyclerView.x.b();
                    t26 t26Var = (t26) d49Var;
                    s26 s26Var = t26Var.B;
                    if (s26Var != null && (i = s26Var.a) >= 0) {
                        z2 = s26Var.c;
                    } else {
                        t26Var.e1();
                        z2 = t26Var.v;
                        i = t26Var.y;
                        if (i == -1) {
                            i = z2 ? b - 1 : 0;
                        }
                    }
                    if (!z2) {
                        i2 = 1;
                    }
                    for (int i3 = 0; i3 < t26Var.E && i >= 0 && i < b; i3++) {
                        b(i, 0);
                        i += i2;
                    }
                }
            } else if (!recyclerView.a0()) {
                int i4 = this.b;
                int i5 = this.c;
                p49 p49Var = recyclerView.v0;
                t26 t26Var2 = (t26) d49Var;
                if (t26Var2.o) {
                    i4 = i5;
                }
                if (t26Var2.r() != 0 && i4 != 0) {
                    t26Var2.F0();
                    if (i4 > 0) {
                        i2 = 1;
                    }
                    t26Var2.l1(i2, Math.abs(i4), true, p49Var);
                    t26Var2.z0(p49Var, t26Var2.p, this);
                }
            }
            int i6 = this.d;
            if (i6 > d49Var.i) {
                d49Var.i = i6;
                d49Var.j = z;
                recyclerView.b.m();
            }
        }
    }

    public final void d() {
        int[] iArr = this.a;
        int i = y6c.t0;
        if (this.b != i) {
            kk7.f(i).j(this.c);
            this.c = -1;
            this.b = i;
        }
        this.c = kk7.f(i).q(iArr, this.c, true);
        this.d = kk7.e().q(iArr, this.d, true);
    }

    public final void e() {
        kk7.f(this.b).j(this.c);
        kk7.e().j(this.d);
    }

    public on() {
        this.d = 7;
        this.a = new int[8];
    }
}
