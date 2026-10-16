package i2;

import android.view.View;
import java.util.Arrays;
import v7.u6;
public final class o0 {
    public final int f11125a = 2;
    public int f11126b;
    public boolean f11127c;
    public boolean d;
    public int e;
    public Object f11128f;

    public o0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11127c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11128f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f11128f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11128f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j10;
        if (this.f11127c) {
            j10 = ((androidx.emoji2.text.g) this.f11128f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f11128f).j();
        }
        this.e = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11127c) {
            int a2 = ((androidx.emoji2.text.g) this.f11128f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11128f;
            if (Integer.MIN_VALUE == gVar.f1487a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f1487a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f11128f).d(view);
        }
        this.f11126b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11128f;
        if (Integer.MIN_VALUE == gVar.f1487a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f1487a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11126b = i10;
        if (this.f11127c) {
            int f7 = (((androidx.emoji2.text.g) this.f11128f).f() - k10) - ((androidx.emoji2.text.g) this.f11128f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f11128f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f11128f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f11128f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11128f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11128f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f11128f).j();
        this.e = d;
        if (j11 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11128f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11128f).f() - k10) - ((androidx.emoji2.text.g) this.f11128f).a(view))) - (((androidx.emoji2.text.g) this.f11128f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j11, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11127c) {
            return false;
        }
        this.e -= i10;
        this.f11127c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11127c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11127c = z11 | z10;
        this.f11126b += i10;
    }

    public void g() {
        switch (this.f11125a) {
            case 1:
                this.f11127c = false;
                this.d = false;
                return;
            default:
                this.f11126b = -1;
                this.e = Integer.MIN_VALUE;
                this.f11127c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        u6.p(!this.f11127c);
        if (i10 != this.f11126b) {
            z10 = false;
        }
        this.f11127c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11125a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11126b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f11127c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public o0(int i10) {
        this.f11126b = i10;
        byte[] bArr = new byte[131];
        this.f11128f = bArr;
        bArr[2] = 1;
    }

    public o0(k1 k1Var) {
        this.f11128f = k1Var;
    }
}
