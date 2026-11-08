package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import v4.a1;
public final class f {
    public int f14080a;
    public int f14081b;
    public int f14082c;
    public int[] d;

    public f(int[] iArr) {
        this.f14080a = p10.f24470s0;
        this.f14081b = -1;
        this.f14082c = -1;
        this.d = iArr;
    }

    public void a(int i7) {
        int[] iArr = this.d;
        int i10 = this.f14081b;
        iArr[i10] = i7;
        int i11 = this.f14082c & (i10 + 1);
        this.f14081b = i11;
        int i12 = this.f14080a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.f14080a);
            this.d = iArr2;
            this.f14080a = 0;
            this.f14081b = length;
            this.f14082c = i14 - 1;
        }
    }

    public void b(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f14082c;
                int i12 = i11 * 2;
                int[] iArr = this.d;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.d = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i11 * 4];
                    this.d = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.d;
                iArr4[i12] = i7;
                iArr4[i12 + 1] = i10;
                this.f14082c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z9) {
        boolean z10;
        int i7;
        this.f14082c = 0;
        int[] iArr = this.d;
        int i10 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        v4.n0 n0Var = recyclerView.f2873y;
        if (recyclerView.f2871x != null && n0Var != null && n0Var.h) {
            if (z9) {
                if (!recyclerView.d.g()) {
                    int b10 = recyclerView.f2871x.b();
                    v4.b0 b0Var = (v4.b0) n0Var;
                    v4.a0 a0Var = b0Var.B;
                    if (a0Var != null && (i7 = a0Var.f56995a) >= 0) {
                        z10 = a0Var.f56997c;
                    } else {
                        b0Var.f1();
                        z10 = b0Var.v;
                        i7 = b0Var.f57022y;
                        if (i7 == -1) {
                            i7 = z10 ? b10 - 1 : 0;
                        }
                    }
                    if (!z10) {
                        i10 = 1;
                    }
                    for (int i11 = 0; i11 < b0Var.E && i7 >= 0 && i7 < b10; i11++) {
                        b(i7, 0);
                        i7 += i10;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i12 = this.f14080a;
                int i13 = this.f14081b;
                a1 a1Var = recyclerView.f2867u0;
                v4.b0 b0Var2 = (v4.b0) n0Var;
                if (b0Var2.f57013o != 0) {
                    i12 = i13;
                }
                if (b0Var2.r() != 0 && i12 != 0) {
                    b0Var2.G0();
                    if (i12 > 0) {
                        i10 = 1;
                    }
                    b0Var2.m1(i10, Math.abs(i12), true, a1Var);
                    b0Var2.A0(a1Var, b0Var2.f57014p, this);
                }
            }
            int i14 = this.f14082c;
            if (i14 > n0Var.f57137i) {
                n0Var.f57137i = i14;
                n0Var.f57138j = z9;
                recyclerView.f2842b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = p10.f24470s0;
        if (this.f14080a != i7) {
            qs.f(i7).j(this.f14081b);
            this.f14081b = -1;
            this.f14080a = i7;
        }
        this.f14081b = qs.f(i7).q(iArr, this.f14081b, true);
        this.f14082c = qs.e().q(iArr, this.f14082c, true);
    }

    public void e() {
        qs.f(this.f14080a).j(this.f14081b);
        qs.e().j(this.f14082c);
    }

    public f(int i7) {
        this((int[]) null);
        switch (i7) {
            case 1:
                return;
            default:
                this.f14082c = 7;
                this.d = new int[8];
                return;
        }
    }
}
