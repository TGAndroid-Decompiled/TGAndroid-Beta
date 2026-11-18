package h2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import v4.c1;
import v4.p0;
public final class f {
    public int f13755a;
    public int f13756b;
    public int f13757c;
    public int[] d;

    public f(int[] iArr) {
        this.f13755a = j10.f24773t0;
        this.f13756b = -1;
        this.f13757c = -1;
        this.d = iArr;
    }

    public void a(int i7) {
        int[] iArr = this.d;
        int i10 = this.f13756b;
        iArr[i10] = i7;
        int i11 = this.f13757c & (i10 + 1);
        this.f13756b = i11;
        int i12 = this.f13755a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.d, 0, iArr2, i13, this.f13755a);
            this.d = iArr2;
            this.f13755a = 0;
            this.f13756b = length;
            this.f13757c = i14 - 1;
        }
    }

    public void b(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f13757c;
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
                this.f13757c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i7;
        this.f13757c = 0;
        int[] iArr = this.d;
        int i10 = -1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        p0 p0Var = recyclerView.f2821y;
        if (recyclerView.f2819x != null && p0Var != null && p0Var.h) {
            if (z10) {
                if (!recyclerView.d.g()) {
                    int b10 = recyclerView.f2819x.b();
                    v4.c0 c0Var = (v4.c0) p0Var;
                    v4.b0 b0Var = c0Var.B;
                    if (b0Var != null && (i7 = b0Var.f59063a) >= 0) {
                        z11 = b0Var.f59065c;
                    } else {
                        c0Var.f1();
                        z11 = c0Var.v;
                        i7 = c0Var.f59083y;
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
                int i12 = this.f13755a;
                int i13 = this.f13756b;
                c1 c1Var = recyclerView.f2816v0;
                v4.c0 c0Var2 = (v4.c0) p0Var;
                if (c0Var2.f59074o != 0) {
                    i12 = i13;
                }
                if (c0Var2.r() != 0 && i12 != 0) {
                    c0Var2.G0();
                    if (i12 > 0) {
                        i10 = 1;
                    }
                    c0Var2.m1(i10, Math.abs(i12), true, c1Var);
                    c0Var2.A0(c1Var, c0Var2.f59075p, this);
                }
            }
            int i14 = this.f13757c;
            if (i14 > p0Var.f59212i) {
                p0Var.f59212i = i14;
                p0Var.f59213j = z10;
                recyclerView.f2790b.l();
            }
        }
    }

    public void d() {
        int[] iArr = this.d;
        int i7 = j10.f24773t0;
        if (this.f13755a != i7) {
            ks.f(i7).j(this.f13756b);
            this.f13756b = -1;
            this.f13755a = i7;
        }
        this.f13756b = ks.f(i7).q(iArr, this.f13756b, true);
        this.f13757c = ks.e().q(iArr, this.f13757c, true);
    }

    public void e() {
        ks.f(this.f13755a).j(this.f13756b);
        ks.e().j(this.f13757c);
    }

    public f(int i7) {
        this((int[]) null);
        switch (i7) {
            case 1:
                return;
            default:
                this.f13757c = 7;
                this.d = new int[8];
                return;
        }
    }
}
