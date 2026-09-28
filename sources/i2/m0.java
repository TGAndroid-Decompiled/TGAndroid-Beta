package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f10766a = 2;
    public int f10767b;
    public boolean f10768c;
    public boolean d;
    public int e;
    public Object f10769f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f10768c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f10769f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f10769f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f10769f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j3;
        if (this.f10768c) {
            j3 = ((androidx.emoji2.text.g) this.f10769f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f10769f).j();
        }
        this.e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f10768c) {
            int a2 = ((androidx.emoji2.text.g) this.f10769f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10769f;
            if (Integer.MIN_VALUE == gVar.f2322a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2322a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f10769f).d(view);
        }
        this.f10767b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10769f;
        if (Integer.MIN_VALUE == gVar.f2322a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2322a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f10767b = i10;
        if (this.f10768c) {
            int f7 = (((androidx.emoji2.text.g) this.f10769f).f() - k10) - ((androidx.emoji2.text.g) this.f10769f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f10769f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f10769f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f10769f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f10769f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f10769f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f10769f).j();
        this.e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f10769f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f10769f).f() - k10) - ((androidx.emoji2.text.g) this.f10769f).a(view))) - (((androidx.emoji2.text.g) this.f10769f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f10768c) {
            return false;
        }
        this.e -= i10;
        this.f10768c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f10768c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10768c = z11 | z10;
        this.f10767b += i10;
    }

    public void g() {
        switch (this.f10766a) {
            case 1:
                this.f10768c = false;
                this.d = false;
                return;
            default:
                this.f10767b = -1;
                this.e = Integer.MIN_VALUE;
                this.f10768c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f10768c);
        if (i10 != this.f10767b) {
            z10 = false;
        }
        this.f10768c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f10766a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f10767b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f10768c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f10767b = i10;
        byte[] bArr = new byte[131];
        this.f10769f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f10769f = h1Var;
    }
}
