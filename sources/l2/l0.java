package l2;

import a8.la;
import android.view.View;
import java.util.Arrays;
public final class l0 {
    public final int f19457a = 2;
    public int f19458b;
    public boolean f19459c;
    public boolean d;
    public int f19460e;
    public Object f19461f;

    public l0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (!this.f19459c) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = (byte[]) this.f19461f;
        int length = bArr2.length;
        int i12 = this.f19460e;
        if (length < i12 + i11) {
            this.f19461f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f19461f, this.f19460e, i11);
        this.f19460e += i11;
    }

    public void b() {
        int j3;
        if (this.f19459c) {
            j3 = ((androidx.emoji2.text.g) this.f19461f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f19461f).j();
        }
        this.f19460e = j3;
    }

    public void c(int i7, View view) {
        int k10;
        if (this.f19459c) {
            int a10 = ((androidx.emoji2.text.g) this.f19461f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19461f;
            if (Integer.MIN_VALUE == gVar.f2257a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2257a;
            }
            this.f19460e = k10 + a10;
        } else {
            this.f19460e = ((androidx.emoji2.text.g) this.f19461f).d(view);
        }
        this.f19458b = i7;
    }

    public void d(int i7, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19461f;
        if (Integer.MIN_VALUE == gVar.f2257a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2257a;
        }
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.f19458b = i7;
        if (this.f19459c) {
            int f10 = (((androidx.emoji2.text.g) this.f19461f).f() - k10) - ((androidx.emoji2.text.g) this.f19461f).a(view);
            this.f19460e = ((androidx.emoji2.text.g) this.f19461f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f19460e - ((androidx.emoji2.text.g) this.f19461f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f19461f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f19461f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f19460e = Math.min(f10, -min) + this.f19460e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f19461f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f19461f).j();
        this.f19460e = d;
        if (j10 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f19461f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f19461f).f() - k10) - ((androidx.emoji2.text.g) this.f19461f).a(view))) - (((androidx.emoji2.text.g) this.f19461f).b(view) + d);
            if (f11 < 0) {
                this.f19460e -= Math.min(j10, -f11);
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f19459c) {
            return false;
        }
        this.f19460e -= i7;
        this.f19459c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        boolean z10;
        boolean z11 = this.f19459c;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19459c = z11 | z10;
        this.f19458b += i7;
    }

    public void g() {
        switch (this.f19457a) {
            case 1:
                this.f19459c = false;
                this.d = false;
                return;
            default:
                this.f19458b = -1;
                this.f19460e = Integer.MIN_VALUE;
                this.f19459c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i7) {
        boolean z10 = true;
        la.p(!this.f19459c);
        if (i7 != this.f19458b) {
            z10 = false;
        }
        this.f19459c = z10;
        if (z10) {
            this.f19460e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f19457a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f19458b + ", mCoordinate=" + this.f19460e + ", mLayoutFromEnd=" + this.f19459c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public l0(int i7) {
        this.f19458b = i7;
        byte[] bArr = new byte[131];
        this.f19461f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f19461f = g1Var;
    }
}
