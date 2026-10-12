package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f11780a = 2;
    public int f11781b;
    public boolean f11782c;
    public boolean d;
    public int f11783e;
    public Object f11784f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11782c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11784f;
        int length = bArr2.length;
        int i13 = this.f11783e;
        if (length < i13 + i12) {
            this.f11784f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11784f, this.f11783e, i12);
        this.f11783e += i12;
    }

    public void b() {
        int j3;
        if (this.f11782c) {
            j3 = ((androidx.emoji2.text.g) this.f11784f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f11784f).j();
        }
        this.f11783e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11782c) {
            int a2 = ((androidx.emoji2.text.g) this.f11784f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11784f;
            if (Integer.MIN_VALUE == gVar.f2595a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2595a;
            }
            this.f11783e = k10 + a2;
        } else {
            this.f11783e = ((androidx.emoji2.text.g) this.f11784f).d(view);
        }
        this.f11781b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11784f;
        if (Integer.MIN_VALUE == gVar.f2595a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2595a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11781b = i10;
        if (this.f11782c) {
            int f7 = (((androidx.emoji2.text.g) this.f11784f).f() - k10) - ((androidx.emoji2.text.g) this.f11784f).a(view);
            this.f11783e = ((androidx.emoji2.text.g) this.f11784f).f() - f7;
            if (f7 > 0) {
                int b10 = this.f11783e - ((androidx.emoji2.text.g) this.f11784f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f11784f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11784f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f11783e = Math.min(f7, -min) + this.f11783e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11784f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f11784f).j();
        this.f11783e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11784f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11784f).f() - k10) - ((androidx.emoji2.text.g) this.f11784f).a(view))) - (((androidx.emoji2.text.g) this.f11784f).b(view) + d);
            if (f10 < 0) {
                this.f11783e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11782c) {
            return false;
        }
        this.f11783e -= i10;
        this.f11782c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11782c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11782c = z11 | z10;
        this.f11781b += i10;
    }

    public void g() {
        switch (this.f11780a) {
            case 1:
                this.f11782c = false;
                this.d = false;
                return;
            default:
                this.f11781b = -1;
                this.f11783e = Integer.MIN_VALUE;
                this.f11782c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f11782c);
        if (i10 != this.f11781b) {
            z10 = false;
        }
        this.f11782c = z10;
        if (z10) {
            this.f11783e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11780a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11781b + ", mCoordinate=" + this.f11783e + ", mLayoutFromEnd=" + this.f11782c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f11781b = i10;
        byte[] bArr = new byte[131];
        this.f11784f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f11784f = h1Var;
    }
}
