package l2;

import a8.ma;
import android.view.View;
import java.util.Arrays;
public final class m0 {
    public final int f19530a = 2;
    public int f19531b;
    public boolean f19532c;
    public boolean d;
    public int f19533e;
    public Object f19534f;

    public m0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (!this.f19532c) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = (byte[]) this.f19534f;
        int length = bArr2.length;
        int i12 = this.f19533e;
        if (length < i12 + i11) {
            this.f19534f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f19534f, this.f19533e, i11);
        this.f19533e += i11;
    }

    public void b() {
        int j3;
        if (this.f19532c) {
            j3 = ((androidx.emoji2.text.g) this.f19534f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f19534f).j();
        }
        this.f19533e = j3;
    }

    public void c(int i7, View view) {
        int k10;
        if (this.f19532c) {
            int a10 = ((androidx.emoji2.text.g) this.f19534f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19534f;
            if (Integer.MIN_VALUE == gVar.f2216a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2216a;
            }
            this.f19533e = k10 + a10;
        } else {
            this.f19533e = ((androidx.emoji2.text.g) this.f19534f).d(view);
        }
        this.f19531b = i7;
    }

    public void d(int i7, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f19534f;
        if (Integer.MIN_VALUE == gVar.f2216a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2216a;
        }
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.f19531b = i7;
        if (this.f19532c) {
            int f10 = (((androidx.emoji2.text.g) this.f19534f).f() - k10) - ((androidx.emoji2.text.g) this.f19534f).a(view);
            this.f19533e = ((androidx.emoji2.text.g) this.f19534f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f19533e - ((androidx.emoji2.text.g) this.f19534f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f19534f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f19534f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f19533e = Math.min(f10, -min) + this.f19533e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f19534f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f19534f).j();
        this.f19533e = d;
        if (j10 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f19534f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f19534f).f() - k10) - ((androidx.emoji2.text.g) this.f19534f).a(view))) - (((androidx.emoji2.text.g) this.f19534f).b(view) + d);
            if (f11 < 0) {
                this.f19533e -= Math.min(j10, -f11);
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f19532c) {
            return false;
        }
        this.f19533e -= i7;
        this.f19532c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        boolean z10;
        boolean z11 = this.f19532c;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19532c = z11 | z10;
        this.f19531b += i7;
    }

    public void g() {
        switch (this.f19530a) {
            case 1:
                this.f19532c = false;
                this.d = false;
                return;
            default:
                this.f19531b = -1;
                this.f19533e = Integer.MIN_VALUE;
                this.f19532c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i7) {
        boolean z10 = true;
        ma.p(!this.f19532c);
        if (i7 != this.f19531b) {
            z10 = false;
        }
        this.f19532c = z10;
        if (z10) {
            this.f19533e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f19530a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f19531b + ", mCoordinate=" + this.f19533e + ", mLayoutFromEnd=" + this.f19532c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public m0(int i7) {
        this.f19531b = i7;
        byte[] bArr = new byte[131];
        this.f19534f = bArr;
        bArr[2] = 1;
    }

    public m0(h1 h1Var) {
        this.f19534f = h1Var;
    }
}
