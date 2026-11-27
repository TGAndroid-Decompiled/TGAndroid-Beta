package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
public final class pn {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public pn(int[] iArr) {
        this.b = yac.t0;
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
            lq5.j("Pixel distance must be non-negative");
            return;
        }
        lq5.j("Layout positions must be non-negative");
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
        q79 q79Var = recyclerView.y;
        if (recyclerView.x != null && q79Var != null && q79Var.h) {
            if (z) {
                if (!recyclerView.d.g()) {
                    int b = recyclerView.x.b();
                    x46 x46Var = (x46) q79Var;
                    w46 w46Var = x46Var.B;
                    if (w46Var != null && (i = w46Var.a) >= 0) {
                        z2 = w46Var.c;
                    } else {
                        x46Var.e1();
                        z2 = x46Var.v;
                        i = x46Var.y;
                        if (i == -1) {
                            i = z2 ? b - 1 : 0;
                        }
                    }
                    if (!z2) {
                        i2 = 1;
                    }
                    for (int i3 = 0; i3 < x46Var.E && i >= 0 && i < b; i3++) {
                        b(i, 0);
                        i += i2;
                    }
                }
            } else if (!recyclerView.b0()) {
                int i4 = this.b;
                int i5 = this.c;
                c89 c89Var = recyclerView.v0;
                x46 x46Var2 = (x46) q79Var;
                if (x46Var2.o) {
                    i4 = i5;
                }
                if (x46Var2.r() != 0 && i4 != 0) {
                    x46Var2.F0();
                    if (i4 > 0) {
                        i2 = 1;
                    }
                    x46Var2.l1(i2, Math.abs(i4), true, c89Var);
                    x46Var2.z0(c89Var, x46Var2.p, this);
                }
            }
            int i6 = this.d;
            if (i6 > q79Var.i) {
                q79Var.i = i6;
                q79Var.j = z;
                recyclerView.b.m();
            }
        }
    }

    public final void d() {
        int[] iArr = this.a;
        int i = yac.t0;
        if (this.b != i) {
            jn7.f(i).j(this.c);
            this.c = -1;
            this.b = i;
        }
        this.c = jn7.f(i).p(iArr, this.c, true);
        this.d = jn7.e().p(iArr, this.d, true);
    }

    public final void e() {
        jn7.f(this.b).j(this.c);
        jn7.e().j(this.d);
    }

    public pn() {
        this.d = 7;
        this.a = new int[8];
    }
}
