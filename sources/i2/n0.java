package i2;

import android.view.View;
import java.util.Arrays;
import v7.u6;
public final class n0 {
    public final int f12491a = 2;
    public int f12492b;
    public boolean f12493c;
    public boolean d;
    public int e;
    public Object f12494f;

    public n0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f12493c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f12494f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f12494f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f12494f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j10;
        if (this.f12493c) {
            j10 = ((androidx.emoji2.text.g) this.f12494f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f12494f).j();
        }
        this.e = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f12493c) {
            int a2 = ((androidx.emoji2.text.g) this.f12494f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f12494f;
            if (Integer.MIN_VALUE == gVar.f3099a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f3099a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f12494f).d(view);
        }
        this.f12492b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f12494f;
        if (Integer.MIN_VALUE == gVar.f3099a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f3099a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f12492b = i10;
        if (this.f12493c) {
            int f7 = (((androidx.emoji2.text.g) this.f12494f).f() - k10) - ((androidx.emoji2.text.g) this.f12494f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f12494f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f12494f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f12494f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f12494f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f12494f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f12494f).j();
        this.e = d;
        if (j11 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f12494f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f12494f).f() - k10) - ((androidx.emoji2.text.g) this.f12494f).a(view))) - (((androidx.emoji2.text.g) this.f12494f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j11, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f12493c) {
            return false;
        }
        this.e -= i10;
        this.f12493c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f12493c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12493c = z11 | z10;
        this.f12492b += i10;
    }

    public void g() {
        switch (this.f12491a) {
            case 1:
                this.f12493c = false;
                this.d = false;
                return;
            default:
                this.f12492b = -1;
                this.e = Integer.MIN_VALUE;
                this.f12493c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        u6.p(!this.f12493c);
        if (i10 != this.f12492b) {
            z10 = false;
        }
        this.f12493c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f12491a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f12492b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f12493c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public n0(int i10) {
        this.f12492b = i10;
        byte[] bArr = new byte[131];
        this.f12494f = bArr;
        bArr[2] = 1;
    }

    public n0(i1 i1Var) {
        this.f12494f = i1Var;
    }
}
