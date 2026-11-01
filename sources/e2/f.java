package e2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import s4.z0;
public final class f {
    public int f6135a;
    public int f6136b;
    public int f6137c;
    public int[] d;

    public f(int[] iArr) {
        this.f6135a = e20.f15506s0;
        this.f6136b = -1;
        this.f6137c = -1;
        this.d = iArr;
    }

    public void a(int i10) {
        int[] iArr = this.d;
        int i11 = this.f6136b;
        iArr[i11] = i10;
        int i12 = this.f6137c & (i11 + 1);
        this.f6136b = i12;
        int i13 = this.f6135a;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.d, 0, iArr2, i14, this.f6135a);
            this.d = iArr2;
            this.f6135a = 0;
            this.f6136b = length;
            this.f6137c = i15 - 1;
        }
    }

    public void b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.f6137c;
                int i13 = i12 * 2;
                int[] iArr = this.d;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.d = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 4];
                    this.d = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.d;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.f6137c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i10;
        this.f6137c = 0;
        int[] iArr = this.d;
        int i11 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        s4.n0 n0Var = recyclerView.f1924y;
        if (recyclerView.f1922x != null && n0Var != null && n0Var.h) {
            if (z10) {
                if (!recyclerView.d.h()) {
                    int b10 = recyclerView.f1922x.b();
                    s4.a0 a0Var = (s4.a0) n0Var;
                    s4.z zVar = a0Var.B;
                    if (zVar != null && (i10 = zVar.f48061a) >= 0) {
                        z11 = zVar.f48063c;
                    } else {
                        a0Var.f1();
                        z11 = a0Var.v;
                        i10 = a0Var.f47888y;
                        if (i10 == -1) {
                            i10 = z11 ? b10 - 1 : 0;
                        }
                    }
                    if (!z11) {
                        i11 = 1;
                    }
                    for (int i12 = 0; i12 < a0Var.E && i10 >= 0 && i10 < b10; i12++) {
                        b(i10, 0);
                        i10 += i11;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i13 = this.f6135a;
                int i14 = this.f6136b;
                z0 z0Var = recyclerView.f1918u0;
                s4.a0 a0Var2 = (s4.a0) n0Var;
                if (a0Var2.f47879o != 0) {
                    i13 = i14;
                }
                if (a0Var2.r() != 0 && i13 != 0) {
                    a0Var2.G0();
                    if (i13 > 0) {
                        i11 = 1;
                    }
                    a0Var2.m1(i11, Math.abs(i13), true, z0Var);
                    a0Var2.A0(z0Var, a0Var2.f47880p, this);
                }
            }
            int i15 = this.f6137c;
            if (i15 > n0Var.f47994i) {
                n0Var.f47994i = i15;
                n0Var.f47995j = z10;
                recyclerView.f1894b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i10 = e20.f15506s0;
        if (this.f6135a != i10) {
            at.f(i10).j(this.f6136b);
            this.f6136b = -1;
            this.f6135a = i10;
        }
        this.f6136b = at.f(i10).q(iArr, this.f6136b, true);
        this.f6137c = at.e().q(iArr, this.f6137c, true);
    }

    public void e() {
        at.f(this.f6135a).j(this.f6136b);
        at.e().j(this.f6137c);
    }

    public f(int i10) {
        this((int[]) null);
        switch (i10) {
            case 1:
                return;
            default:
                this.f6137c = 7;
                this.d = new int[8];
                return;
        }
    }
}
