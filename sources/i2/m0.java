package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f11782a = 2;
    public int f11783b;
    public boolean f11784c;
    public boolean d;
    public int f11785e;
    public Object f11786f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11784c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11786f;
        int length = bArr2.length;
        int i13 = this.f11785e;
        if (length < i13 + i12) {
            this.f11786f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11786f, this.f11785e, i12);
        this.f11785e += i12;
    }

    public void b() {
        int j3;
        if (this.f11784c) {
            j3 = ((androidx.emoji2.text.g) this.f11786f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f11786f).j();
        }
        this.f11785e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11784c) {
            int a2 = ((androidx.emoji2.text.g) this.f11786f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11786f;
            if (Integer.MIN_VALUE == gVar.f2597a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2597a;
            }
            this.f11785e = k10 + a2;
        } else {
            this.f11785e = ((androidx.emoji2.text.g) this.f11786f).d(view);
        }
        this.f11783b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11786f;
        if (Integer.MIN_VALUE == gVar.f2597a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2597a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11783b = i10;
        if (this.f11784c) {
            int f7 = (((androidx.emoji2.text.g) this.f11786f).f() - k10) - ((androidx.emoji2.text.g) this.f11786f).a(view);
            this.f11785e = ((androidx.emoji2.text.g) this.f11786f).f() - f7;
            if (f7 > 0) {
                int b10 = this.f11785e - ((androidx.emoji2.text.g) this.f11786f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f11786f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11786f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f11785e = Math.min(f7, -min) + this.f11785e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11786f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f11786f).j();
        this.f11785e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11786f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11786f).f() - k10) - ((androidx.emoji2.text.g) this.f11786f).a(view))) - (((androidx.emoji2.text.g) this.f11786f).b(view) + d);
            if (f10 < 0) {
                this.f11785e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11784c) {
            return false;
        }
        this.f11785e -= i10;
        this.f11784c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11784c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11784c = z11 | z10;
        this.f11783b += i10;
    }

    public void g() {
        switch (this.f11782a) {
            case 1:
                this.f11784c = false;
                this.d = false;
                return;
            default:
                this.f11783b = -1;
                this.f11785e = Integer.MIN_VALUE;
                this.f11784c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f11784c);
        if (i10 != this.f11783b) {
            z10 = false;
        }
        this.f11784c = z10;
        if (z10) {
            this.f11785e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11782a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11783b + ", mCoordinate=" + this.f11785e + ", mLayoutFromEnd=" + this.f11784c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f11783b = i10;
        byte[] bArr = new byte[131];
        this.f11786f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f11786f = h1Var;
    }
}
