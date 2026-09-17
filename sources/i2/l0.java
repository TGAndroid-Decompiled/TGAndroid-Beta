package i2;

import android.view.View;
import java.util.Arrays;
public final class l0 {
    public final int f11623a = 2;
    public int f11624b;
    public boolean f11625c;
    public boolean d;
    public int f11626e;
    public Object f11627f;

    public l0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11625c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11627f;
        int length = bArr2.length;
        int i13 = this.f11626e;
        if (length < i13 + i12) {
            this.f11627f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11627f, this.f11626e, i12);
        this.f11626e += i12;
    }

    public void b() {
        int j3;
        if (this.f11625c) {
            j3 = ((androidx.emoji2.text.g) this.f11627f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f11627f).j();
        }
        this.f11626e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11625c) {
            int a2 = ((androidx.emoji2.text.g) this.f11627f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11627f;
            if (Integer.MIN_VALUE == gVar.f1342a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f1342a;
            }
            this.f11626e = k10 + a2;
        } else {
            this.f11626e = ((androidx.emoji2.text.g) this.f11627f).d(view);
        }
        this.f11624b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11627f;
        if (Integer.MIN_VALUE == gVar.f1342a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f1342a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11624b = i10;
        if (this.f11625c) {
            int f7 = (((androidx.emoji2.text.g) this.f11627f).f() - k10) - ((androidx.emoji2.text.g) this.f11627f).a(view);
            this.f11626e = ((androidx.emoji2.text.g) this.f11627f).f() - f7;
            if (f7 > 0) {
                int b10 = this.f11626e - ((androidx.emoji2.text.g) this.f11627f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f11627f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11627f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f11626e = Math.min(f7, -min) + this.f11626e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11627f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f11627f).j();
        this.f11626e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11627f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11627f).f() - k10) - ((androidx.emoji2.text.g) this.f11627f).a(view))) - (((androidx.emoji2.text.g) this.f11627f).b(view) + d);
            if (f10 < 0) {
                this.f11626e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11625c) {
            return false;
        }
        this.f11626e -= i10;
        this.f11625c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11625c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11625c = z11 | z10;
        this.f11624b += i10;
    }

    public void g() {
        switch (this.f11623a) {
            case 1:
                this.f11625c = false;
                this.d = false;
                return;
            default:
                this.f11624b = -1;
                this.f11626e = Integer.MIN_VALUE;
                this.f11625c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f11625c);
        if (i10 != this.f11624b) {
            z10 = false;
        }
        this.f11625c = z10;
        if (z10) {
            this.f11626e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11623a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11624b + ", mCoordinate=" + this.f11626e + ", mLayoutFromEnd=" + this.f11625c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public l0(int i10) {
        this.f11624b = i10;
        byte[] bArr = new byte[131];
        this.f11627f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f11627f = g1Var;
    }
}
