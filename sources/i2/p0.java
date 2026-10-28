package i2;

import a8.yb;
import android.view.View;
import java.util.Arrays;
public final class p0 {
    public final int f13696a = 2;
    public int f13697b;
    public boolean f13698c;
    public boolean d;
    public int e;
    public Object f13699f;

    public p0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f13698c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f13699f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f13699f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f13699f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j10;
        if (this.f13698c) {
            j10 = ((androidx.emoji2.text.g) this.f13699f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f13699f).j();
        }
        this.e = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f13698c) {
            int a2 = ((androidx.emoji2.text.g) this.f13699f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f13699f;
            if (Integer.MIN_VALUE == gVar.f2548a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2548a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f13699f).d(view);
        }
        this.f13697b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f13699f;
        if (Integer.MIN_VALUE == gVar.f2548a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2548a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f13697b = i10;
        if (this.f13698c) {
            int f7 = (((androidx.emoji2.text.g) this.f13699f).f() - k10) - ((androidx.emoji2.text.g) this.f13699f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f13699f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f13699f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f13699f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f13699f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f13699f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f13699f).j();
        this.e = d;
        if (j11 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f13699f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f13699f).f() - k10) - ((androidx.emoji2.text.g) this.f13699f).a(view))) - (((androidx.emoji2.text.g) this.f13699f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j11, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f13698c) {
            return false;
        }
        this.e -= i10;
        this.f13698c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f13698c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13698c = z11 | z10;
        this.f13697b += i10;
    }

    public void g() {
        switch (this.f13696a) {
            case 1:
                this.f13698c = false;
                this.d = false;
                return;
            default:
                this.f13697b = -1;
                this.e = Integer.MIN_VALUE;
                this.f13698c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        yb.p(!this.f13698c);
        if (i10 != this.f13697b) {
            z10 = false;
        }
        this.f13698c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f13696a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f13697b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f13698c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public p0(int i10) {
        this.f13697b = i10;
        byte[] bArr = new byte[131];
        this.f13699f = bArr;
        bArr[2] = 1;
    }

    public p0(k1 k1Var) {
        this.f13699f = k1Var;
    }
}
