package i2;

import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f11731a = 2;
    public int f11732b;
    public boolean f11733c;
    public boolean d;
    public int f11734e;
    public Object f11735f;

    public m0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f11733c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f11735f;
        int length = bArr2.length;
        int i13 = this.f11734e;
        if (length < i13 + i12) {
            this.f11735f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f11735f, this.f11734e, i12);
        this.f11734e += i12;
    }

    public void b() {
        int j3;
        if (this.f11733c) {
            j3 = ((androidx.emoji2.text.g) this.f11735f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f11735f).j();
        }
        this.f11734e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f11733c) {
            int a2 = ((androidx.emoji2.text.g) this.f11735f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11735f;
            if (Integer.MIN_VALUE == gVar.f2518a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2518a;
            }
            this.f11734e = k10 + a2;
        } else {
            this.f11734e = ((androidx.emoji2.text.g) this.f11735f).d(view);
        }
        this.f11732b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f11735f;
        if (Integer.MIN_VALUE == gVar.f2518a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2518a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f11732b = i10;
        if (this.f11733c) {
            int f7 = (((androidx.emoji2.text.g) this.f11735f).f() - k10) - ((androidx.emoji2.text.g) this.f11735f).a(view);
            this.f11734e = ((androidx.emoji2.text.g) this.f11735f).f() - f7;
            if (f7 > 0) {
                int b10 = this.f11734e - ((androidx.emoji2.text.g) this.f11735f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f11735f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f11735f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f11734e = Math.min(f7, -min) + this.f11734e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f11735f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f11735f).j();
        this.f11734e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f11735f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f11735f).f() - k10) - ((androidx.emoji2.text.g) this.f11735f).a(view))) - (((androidx.emoji2.text.g) this.f11735f).b(view) + d);
            if (f10 < 0) {
                this.f11734e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f11733c) {
            return false;
        }
        this.f11734e -= i10;
        this.f11733c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f11733c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11733c = z11 | z10;
        this.f11732b += i10;
    }

    public void g() {
        switch (this.f11731a) {
            case 1:
                this.f11733c = false;
                this.d = false;
                return;
            default:
                this.f11732b = -1;
                this.f11734e = Integer.MIN_VALUE;
                this.f11733c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f11733c);
        if (i10 != this.f11732b) {
            z10 = false;
        }
        this.f11733c = z10;
        if (z10) {
            this.f11734e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f11731a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f11732b + ", mCoordinate=" + this.f11734e + ", mLayoutFromEnd=" + this.f11733c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i10) {
        this.f11732b = i10;
        byte[] bArr = new byte[131];
        this.f11735f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f11735f = h1Var;
    }
}
