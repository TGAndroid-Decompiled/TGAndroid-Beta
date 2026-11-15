package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import v4.b1;
public final class f {
    public int f13440a;
    public int f13441b;
    public int f13442c;
    public int[] d;

    public f(int[] iArr) {
        this.f13440a = m10.f24934t0;
        this.f13441b = -1;
        this.f13442c = -1;
        this.d = iArr;
    }

    public void a(int i7) {
        int[] iArr = this.d;
        int i10 = this.f13441b;
        iArr[i10] = i7;
        int i11 = this.f13442c & (i10 + 1);
        this.f13441b = i11;
        int i12 = this.f13440a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.f13440a);
            this.d = iArr2;
            this.f13440a = 0;
            this.f13441b = length;
            this.f13442c = i14 - 1;
        }
    }

    public void b(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f13442c;
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
                this.f13442c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i7;
        this.f13442c = 0;
        int[] iArr = this.d;
        int i10 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        v4.o0 o0Var = recyclerView.f2827y;
        if (recyclerView.f2825x != null && o0Var != null && o0Var.h) {
            if (z10) {
                if (!recyclerView.d.g()) {
                    int b10 = recyclerView.f2825x.b();
                    v4.b0 b0Var = (v4.b0) o0Var;
                    v4.a0 a0Var = b0Var.B;
                    if (a0Var != null && (i7 = a0Var.f58477a) >= 0) {
                        z11 = a0Var.f58479c;
                    } else {
                        b0Var.f1();
                        z11 = b0Var.v;
                        i7 = b0Var.f58498y;
                        if (i7 == -1) {
                            i7 = z11 ? b10 - 1 : 0;
                        }
                    }
                    if (!z11) {
                        i10 = 1;
                    }
                    for (int i11 = 0; i11 < b0Var.E && i7 >= 0 && i7 < b10; i11++) {
                        b(i7, 0);
                        i7 += i10;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i12 = this.f13440a;
                int i13 = this.f13441b;
                b1 b1Var = recyclerView.f2822v0;
                v4.b0 b0Var2 = (v4.b0) o0Var;
                if (b0Var2.f58489o != 0) {
                    i12 = i13;
                }
                if (b0Var2.r() != 0 && i12 != 0) {
                    b0Var2.G0();
                    if (i12 > 0) {
                        i10 = 1;
                    }
                    b0Var2.m1(i10, Math.abs(i12), true, b1Var);
                    b0Var2.A0(b1Var, b0Var2.f58490p, this);
                }
            }
            int i14 = this.f13442c;
            if (i14 > o0Var.f58627i) {
                o0Var.f58627i = i14;
                o0Var.f58628j = z10;
                recyclerView.f2796b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = m10.f24934t0;
        if (this.f13440a != i7) {
            ns.f(i7).j(this.f13441b);
            this.f13441b = -1;
            this.f13440a = i7;
        }
        this.f13441b = ns.f(i7).q(iArr, this.f13441b, true);
        this.f13442c = ns.e().q(iArr, this.f13442c, true);
    }

    public void e() {
        ns.f(this.f13440a).j(this.f13441b);
        ns.e().j(this.f13442c);
    }

    public f(int i7) {
        this((int[]) null);
        switch (i7) {
            case 1:
                return;
            default:
                this.f13442c = 7;
                this.d = new int[8];
                return;
        }
    }
}
