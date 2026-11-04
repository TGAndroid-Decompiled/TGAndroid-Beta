package g2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import u4.a1;
public final class g {
    public int f11841a;
    public int f11842b;
    public int f11843c;
    public int[] d;

    public g(int[] iArr) {
        this.f11841a = h10.f22829t0;
        this.f11842b = -1;
        this.f11843c = -1;
        this.d = iArr;
    }

    public void a(int i3) {
        int[] iArr = this.d;
        int i10 = this.f11842b;
        iArr[i10] = i3;
        int i11 = this.f11843c & (i10 + 1);
        this.f11842b = i11;
        int i12 = this.f11841a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.f11841a);
            this.d = iArr2;
            this.f11841a = 0;
            this.f11842b = length;
            this.f11843c = i14 - 1;
        }
    }

    public void b(int i3, int i10) {
        if (i3 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f11843c;
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
                iArr4[i12] = i3;
                iArr4[i12 + 1] = i10;
                this.f11843c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i3;
        this.f11843c = 0;
        int[] iArr = this.d;
        int i10 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        u4.o0 o0Var = recyclerView.f2305y;
        if (recyclerView.f2303x != null && o0Var != null && o0Var.h) {
            if (z10) {
                if (!recyclerView.d.g()) {
                    int b10 = recyclerView.f2303x.b();
                    u4.b0 b0Var = (u4.b0) o0Var;
                    u4.a0 a0Var = b0Var.B;
                    if (a0Var != null && (i3 = a0Var.f55487a) >= 0) {
                        z11 = a0Var.f55489c;
                    } else {
                        b0Var.f1();
                        z11 = b0Var.v;
                        i3 = b0Var.f55518y;
                        if (i3 == -1) {
                            i3 = z11 ? b10 - 1 : 0;
                        }
                    }
                    if (!z11) {
                        i10 = 1;
                    }
                    for (int i11 = 0; i11 < b0Var.E && i3 >= 0 && i3 < b10; i11++) {
                        b(i3, 0);
                        i3 += i10;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i12 = this.f11841a;
                int i13 = this.f11842b;
                a1 a1Var = recyclerView.f2300v0;
                u4.b0 b0Var2 = (u4.b0) o0Var;
                if (b0Var2.f55509o != 0) {
                    i12 = i13;
                }
                if (b0Var2.r() != 0 && i12 != 0) {
                    b0Var2.G0();
                    if (i12 > 0) {
                        i10 = 1;
                    }
                    b0Var2.m1(i10, Math.abs(i12), true, a1Var);
                    b0Var2.A0(a1Var, b0Var2.f55510p, this);
                }
            }
            int i14 = this.f11843c;
            if (i14 > o0Var.f55635i) {
                o0Var.f55635i = i14;
                o0Var.f55636j = z10;
                recyclerView.f2274b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i3 = h10.f22829t0;
        if (this.f11841a != i3) {
            hs.f(i3).j(this.f11842b);
            this.f11842b = -1;
            this.f11841a = i3;
        }
        this.f11842b = hs.f(i3).q(iArr, this.f11842b, true);
        this.f11843c = hs.e().q(iArr, this.f11843c, true);
    }

    public void e() {
        hs.f(this.f11841a).j(this.f11842b);
        hs.e().j(this.f11843c);
    }

    public g(int i3) {
        this((int[]) null);
        switch (i3) {
            case 1:
                return;
            default:
                this.f11843c = 7;
                this.d = new int[8];
                return;
        }
    }
}
