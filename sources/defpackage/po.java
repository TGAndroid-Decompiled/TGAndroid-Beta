package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
public final class po {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public po(int[] iArr) {
        this.b = z8c.t0;
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
            u36.j("Pixel distance must be non-negative");
            return;
        }
        u36.j("Layout positions must be non-negative");
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
        f69 f69Var = recyclerView.y;
        if (recyclerView.x != null && f69Var != null && f69Var.h) {
            if (z) {
                if (!recyclerView.d.g()) {
                    int b = recyclerView.x.b();
                    u46 u46Var = (u46) f69Var;
                    t46 t46Var = u46Var.B;
                    if (t46Var != null && (i = t46Var.a) >= 0) {
                        z2 = t46Var.c;
                    } else {
                        u46Var.e1();
                        z2 = u46Var.v;
                        i = u46Var.y;
                        if (i == -1) {
                            i = z2 ? b - 1 : 0;
                        }
                    }
                    if (!z2) {
                        i2 = 1;
                    }
                    for (int i3 = 0; i3 < u46Var.E && i >= 0 && i < b; i3++) {
                        b(i, 0);
                        i += i2;
                    }
                }
            } else if (!recyclerView.a0()) {
                int i4 = this.b;
                int i5 = this.c;
                r69 r69Var = recyclerView.v0;
                u46 u46Var2 = (u46) f69Var;
                if (u46Var2.o) {
                    i4 = i5;
                }
                if (u46Var2.r() != 0 && i4 != 0) {
                    u46Var2.F0();
                    if (i4 > 0) {
                        i2 = 1;
                    }
                    u46Var2.l1(i2, Math.abs(i4), true, r69Var);
                    u46Var2.z0(r69Var, u46Var2.p, this);
                }
            }
            int i6 = this.d;
            if (i6 > f69Var.i) {
                f69Var.i = i6;
                f69Var.j = z;
                recyclerView.b.m();
            }
        }
    }

    public final void d() {
        int[] iArr = this.a;
        int i = z8c.t0;
        if (this.b != i) {
            nm7.f(i).j(this.c);
            this.c = -1;
            this.b = i;
        }
        this.c = nm7.f(i).p(iArr, this.c, true);
        this.d = nm7.e().p(iArr, this.d, true);
    }

    public final void e() {
        nm7.f(this.b).j(this.c);
        nm7.e().j(this.d);
    }

    public po() {
        this.d = 7;
        this.a = new int[8];
    }
}
