package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f10769a = 2;
    public int f10770b;
    public boolean f10771c;
    public boolean d;
    public int e;
    public Object f10772f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f10771c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f10772f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f10772f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f10772f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j3;
        if (this.f10771c) {
            j3 = ((androidx.emoji2.text.g) this.f10772f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f10772f).j();
        }
        this.e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f10771c) {
            int a2 = ((androidx.emoji2.text.g) this.f10772f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10772f;
            if (Integer.MIN_VALUE == gVar.f2324a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2324a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f10772f).d(view);
        }
        this.f10770b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10772f;
        if (Integer.MIN_VALUE == gVar.f2324a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2324a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f10770b = i10;
        if (this.f10771c) {
            int f7 = (((androidx.emoji2.text.g) this.f10772f).f() - k10) - ((androidx.emoji2.text.g) this.f10772f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f10772f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f10772f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f10772f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f10772f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f10772f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f10772f).j();
        this.e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f10772f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f10772f).f() - k10) - ((androidx.emoji2.text.g) this.f10772f).a(view))) - (((androidx.emoji2.text.g) this.f10772f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f10771c) {
            return false;
        }
        this.e -= i10;
        this.f10771c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f10771c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10771c = z11 | z10;
        this.f10770b += i10;
    }

    public void g() {
        switch (this.f10769a) {
            case 1:
                this.f10771c = false;
                this.d = false;
                return;
            default:
                this.f10770b = -1;
                this.e = Integer.MIN_VALUE;
                this.f10771c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f10771c);
        if (i10 != this.f10770b) {
            z10 = false;
        }
        this.f10771c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f10769a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f10770b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f10771c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f10770b = i10;
        byte[] bArr = new byte[131];
        this.f10772f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f10772f = h1Var;
    }
}
