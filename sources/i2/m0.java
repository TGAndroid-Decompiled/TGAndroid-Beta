package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f11781a = 2;
    public int f11782b;
    public boolean f11783c;
    public boolean d;
    public int f11784e;
    public Object f11785f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11783c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11785f;
        int length = bArr2.length;
        int i13 = this.f11784e;
        if (length < i13 + i12) {
            this.f11785f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11785f, this.f11784e, i12);
        this.f11784e += i12;
    }

    public void b() {
        int j3;
        if (this.f11783c) {
            j3 = ((androidx.emoji2.text.g) this.f11785f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f11785f).j();
        }
        this.f11784e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11783c) {
            int a2 = ((androidx.emoji2.text.g) this.f11785f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11785f;
            if (Integer.MIN_VALUE == gVar.f2597a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2597a;
            }
            this.f11784e = k10 + a2;
        } else {
            this.f11784e = ((androidx.emoji2.text.g) this.f11785f).d(view);
        }
        this.f11782b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11785f;
        if (Integer.MIN_VALUE == gVar.f2597a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2597a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11782b = i10;
        if (this.f11783c) {
            int f7 = (((androidx.emoji2.text.g) this.f11785f).f() - k10) - ((androidx.emoji2.text.g) this.f11785f).a(view);
            this.f11784e = ((androidx.emoji2.text.g) this.f11785f).f() - f7;
            if (f7 > 0) {
                int b10 = this.f11784e - ((androidx.emoji2.text.g) this.f11785f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f11785f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11785f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f11784e = Math.min(f7, -min) + this.f11784e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11785f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f11785f).j();
        this.f11784e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11785f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11785f).f() - k10) - ((androidx.emoji2.text.g) this.f11785f).a(view))) - (((androidx.emoji2.text.g) this.f11785f).b(view) + d);
            if (f10 < 0) {
                this.f11784e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11783c) {
            return false;
        }
        this.f11784e -= i10;
        this.f11783c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11783c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11783c = z11 | z10;
        this.f11782b += i10;
    }

    public void g() {
        switch (this.f11781a) {
            case 1:
                this.f11783c = false;
                this.d = false;
                return;
            default:
                this.f11782b = -1;
                this.f11784e = Integer.MIN_VALUE;
                this.f11783c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f11783c);
        if (i10 != this.f11782b) {
            z10 = false;
        }
        this.f11783c = z10;
        if (z10) {
            this.f11784e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11781a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11782b + ", mCoordinate=" + this.f11784e + ", mLayoutFromEnd=" + this.f11783c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f11782b = i10;
        byte[] bArr = new byte[131];
        this.f11785f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f11785f = h1Var;
    }
}
