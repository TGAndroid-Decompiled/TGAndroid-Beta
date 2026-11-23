package l2;

import a8.la;
import android.view.View;
import java.util.Arrays;
public final class l0 {
    public final int f19460a = 2;
    public int f19461b;
    public boolean f19462c;
    public boolean d;
    public int f19463e;
    public Object f19464f;

    public l0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (!this.f19462c) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = (byte[]) this.f19464f;
        int length = bArr2.length;
        int i12 = this.f19463e;
        if (length < i12 + i11) {
            this.f19464f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f19464f, this.f19463e, i11);
        this.f19463e += i11;
    }

    public void b() {
        int j3;
        if (this.f19462c) {
            j3 = ((androidx.emoji2.text.g) this.f19464f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f19464f).j();
        }
        this.f19463e = j3;
    }

    public void c(int i7, View view) {
        int k10;
        if (this.f19462c) {
            int a10 = ((androidx.emoji2.text.g) this.f19464f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19464f;
            if (Integer.MIN_VALUE == gVar.f2264a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2264a;
            }
            this.f19463e = k10 + a10;
        } else {
            this.f19463e = ((androidx.emoji2.text.g) this.f19464f).d(view);
        }
        this.f19461b = i7;
    }

    public void d(int i7, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19464f;
        if (Integer.MIN_VALUE == gVar.f2264a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2264a;
        }
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.f19461b = i7;
        if (this.f19462c) {
            int f10 = (((androidx.emoji2.text.g) this.f19464f).f() - k10) - ((androidx.emoji2.text.g) this.f19464f).a(view);
            this.f19463e = ((androidx.emoji2.text.g) this.f19464f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f19463e - ((androidx.emoji2.text.g) this.f19464f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f19464f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f19464f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f19463e = Math.min(f10, -min) + this.f19463e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f19464f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f19464f).j();
        this.f19463e = d;
        if (j10 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f19464f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f19464f).f() - k10) - ((androidx.emoji2.text.g) this.f19464f).a(view))) - (((androidx.emoji2.text.g) this.f19464f).b(view) + d);
            if (f11 < 0) {
                this.f19463e -= Math.min(j10, -f11);
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f19462c) {
            return false;
        }
        this.f19463e -= i7;
        this.f19462c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        boolean z10;
        boolean z11 = this.f19462c;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19462c = z11 | z10;
        this.f19461b += i7;
    }

    public void g() {
        switch (this.f19460a) {
            case 1:
                this.f19462c = false;
                this.d = false;
                return;
            default:
                this.f19461b = -1;
                this.f19463e = Integer.MIN_VALUE;
                this.f19462c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i7) {
        boolean z10 = true;
        la.p(!this.f19462c);
        if (i7 != this.f19461b) {
            z10 = false;
        }
        this.f19462c = z10;
        if (z10) {
            this.f19463e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f19460a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f19461b + ", mCoordinate=" + this.f19463e + ", mLayoutFromEnd=" + this.f19462c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public l0(int i7) {
        this.f19461b = i7;
        byte[] bArr = new byte[131];
        this.f19464f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f19464f = g1Var;
    }
}
