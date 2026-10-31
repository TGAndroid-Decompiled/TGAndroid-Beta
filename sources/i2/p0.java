package i2;

import android.view.View;
import java.util.Arrays;
import v7.t6;
public final class p0 {
    public final int f8016a = 2;
    public int f8017b;
    public boolean f8018c;
    public boolean d;
    public int e;
    public Object f8019f;

    public p0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f8018c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f8019f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f8019f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f8019f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j10;
        if (this.f8018c) {
            j10 = ((androidx.emoji2.text.g) this.f8019f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f8019f).j();
        }
        this.e = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f8018c) {
            int a2 = ((androidx.emoji2.text.g) this.f8019f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f8019f;
            if (Integer.MIN_VALUE == gVar.f1382a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f1382a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f8019f).d(view);
        }
        this.f8017b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f8019f;
        if (Integer.MIN_VALUE == gVar.f1382a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f1382a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f8017b = i10;
        if (this.f8018c) {
            int f7 = (((androidx.emoji2.text.g) this.f8019f).f() - k10) - ((androidx.emoji2.text.g) this.f8019f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f8019f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f8019f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f8019f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f8019f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f8019f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f8019f).j();
        this.e = d;
        if (j11 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f8019f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f8019f).f() - k10) - ((androidx.emoji2.text.g) this.f8019f).a(view))) - (((androidx.emoji2.text.g) this.f8019f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j11, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f8018c) {
            return false;
        }
        this.e -= i10;
        this.f8018c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f8018c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8018c = z11 | z10;
        this.f8017b += i10;
    }

    public void g() {
        switch (this.f8016a) {
            case 1:
                this.f8018c = false;
                this.d = false;
                return;
            default:
                this.f8017b = -1;
                this.e = Integer.MIN_VALUE;
                this.f8018c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        t6.p(!this.f8018c);
        if (i10 != this.f8017b) {
            z10 = false;
        }
        this.f8018c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f8016a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f8017b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f8018c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public p0(int i10) {
        this.f8017b = i10;
        byte[] bArr = new byte[131];
        this.f8019f = bArr;
        bArr[2] = 1;
    }

    public p0(m1 m1Var) {
        this.f8019f = m1Var;
    }
}
