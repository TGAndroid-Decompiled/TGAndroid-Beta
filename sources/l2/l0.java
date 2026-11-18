package l2;

import a8.la;
import android.view.View;
import java.util.Arrays;
public final class l0 {
    public final int f19429a = 2;
    public int f19430b;
    public boolean f19431c;
    public boolean d;
    public int f19432e;
    public Object f19433f;

    public l0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (!this.f19431c) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = (byte[]) this.f19433f;
        int length = bArr2.length;
        int i12 = this.f19432e;
        if (length < i12 + i11) {
            this.f19433f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f19433f, this.f19432e, i11);
        this.f19432e += i11;
    }

    public void b() {
        int j3;
        if (this.f19431c) {
            j3 = ((androidx.emoji2.text.g) this.f19433f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f19433f).j();
        }
        this.f19432e = j3;
    }

    public void c(int i7, View view) {
        int k10;
        if (this.f19431c) {
            int a10 = ((androidx.emoji2.text.g) this.f19433f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19433f;
            if (Integer.MIN_VALUE == gVar.f2245a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2245a;
            }
            this.f19432e = k10 + a10;
        } else {
            this.f19432e = ((androidx.emoji2.text.g) this.f19433f).d(view);
        }
        this.f19430b = i7;
    }

    public void d(int i7, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19433f;
        if (Integer.MIN_VALUE == gVar.f2245a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2245a;
        }
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.f19430b = i7;
        if (this.f19431c) {
            int f10 = (((androidx.emoji2.text.g) this.f19433f).f() - k10) - ((androidx.emoji2.text.g) this.f19433f).a(view);
            this.f19432e = ((androidx.emoji2.text.g) this.f19433f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f19432e - ((androidx.emoji2.text.g) this.f19433f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f19433f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f19433f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f19432e = Math.min(f10, -min) + this.f19432e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f19433f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f19433f).j();
        this.f19432e = d;
        if (j10 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f19433f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f19433f).f() - k10) - ((androidx.emoji2.text.g) this.f19433f).a(view))) - (((androidx.emoji2.text.g) this.f19433f).b(view) + d);
            if (f11 < 0) {
                this.f19432e -= Math.min(j10, -f11);
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f19431c) {
            return false;
        }
        this.f19432e -= i7;
        this.f19431c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        boolean z10;
        boolean z11 = this.f19431c;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19431c = z11 | z10;
        this.f19430b += i7;
    }

    public void g() {
        switch (this.f19429a) {
            case 1:
                this.f19431c = false;
                this.d = false;
                return;
            default:
                this.f19430b = -1;
                this.f19432e = Integer.MIN_VALUE;
                this.f19431c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i7) {
        boolean z10 = true;
        la.p(!this.f19431c);
        if (i7 != this.f19430b) {
            z10 = false;
        }
        this.f19431c = z10;
        if (z10) {
            this.f19432e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f19429a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f19430b + ", mCoordinate=" + this.f19432e + ", mLayoutFromEnd=" + this.f19431c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public l0(int i7) {
        this.f19430b = i7;
        byte[] bArr = new byte[131];
        this.f19433f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f19433f = g1Var;
    }
}
