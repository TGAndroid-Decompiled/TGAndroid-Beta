package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import v4.c1;
import v4.p0;
public final class f {
    public int f13784a;
    public int f13785b;
    public int f13786c;
    public int[] d;

    public f(int[] iArr) {
        this.f13784a = k10.f24968t0;
        this.f13785b = -1;
        this.f13786c = -1;
        this.d = iArr;
    }

    public void a(int i7) {
        int[] iArr = this.d;
        int i10 = this.f13785b;
        iArr[i10] = i7;
        int i11 = this.f13786c & (i10 + 1);
        this.f13785b = i11;
        int i12 = this.f13784a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.f13784a);
            this.d = iArr2;
            this.f13784a = 0;
            this.f13785b = length;
            this.f13786c = i14 - 1;
        }
    }

    public void b(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f13786c;
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
                this.f13786c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i7;
        this.f13786c = 0;
        int[] iArr = this.d;
        int i10 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        p0 p0Var = recyclerView.f2841y;
        if (recyclerView.f2839x != null && p0Var != null && p0Var.h) {
            if (z10) {
                if (!recyclerView.d.g()) {
                    int b10 = recyclerView.f2839x.b();
                    v4.c0 c0Var = (v4.c0) p0Var;
                    v4.b0 b0Var = c0Var.B;
                    if (b0Var != null && (i7 = b0Var.f59106a) >= 0) {
                        z11 = b0Var.f59108c;
                    } else {
                        c0Var.f1();
                        z11 = c0Var.v;
                        i7 = c0Var.f59126y;
                        if (i7 == -1) {
                            i7 = z11 ? b10 - 1 : 0;
                        }
                    }
                    if (!z11) {
                        i10 = 1;
                    }
                    for (int i11 = 0; i11 < c0Var.E && i7 >= 0 && i7 < b10; i11++) {
                        b(i7, 0);
                        i7 += i10;
                    }
                }
            } else if (!recyclerView.Z()) {
                int i12 = this.f13784a;
                int i13 = this.f13785b;
                c1 c1Var = recyclerView.f2836v0;
                v4.c0 c0Var2 = (v4.c0) p0Var;
                if (c0Var2.f59117o != 0) {
                    i12 = i13;
                }
                if (c0Var2.r() != 0 && i12 != 0) {
                    c0Var2.G0();
                    if (i12 > 0) {
                        i10 = 1;
                    }
                    c0Var2.m1(i10, Math.abs(i12), true, c1Var);
                    c0Var2.A0(c1Var, c0Var2.f59118p, this);
                }
            }
            int i14 = this.f13786c;
            if (i14 > p0Var.f59255i) {
                p0Var.f59255i = i14;
                p0Var.f59256j = z10;
                recyclerView.f2810b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = k10.f24968t0;
        if (this.f13784a != i7) {
            ls.f(i7).j(this.f13785b);
            this.f13785b = -1;
            this.f13784a = i7;
        }
        this.f13785b = ls.f(i7).q(iArr, this.f13785b, true);
        this.f13786c = ls.e().q(iArr, this.f13786c, true);
    }

    public void e() {
        ls.f(this.f13784a).j(this.f13785b);
        ls.e().j(this.f13786c);
    }

    public f(int i7) {
        this((int[]) null);
        switch (i7) {
            case 1:
                return;
            default:
                this.f13786c = 7;
                this.d = new int[8];
                return;
        }
    }
}
