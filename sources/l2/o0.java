package l2;

import a8.ia;
import android.view.View;
import java.util.Arrays;
public final class o0 {
    public final int f17971a = 2;
    public int f17972b;
    public boolean f17973c;
    public boolean d;
    public int f17974e;
    public Object f17975f;

    public o0() {
    }

    public void a(int i7, int i10, byte[] bArr) {
        if (!this.f17973c) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = (byte[]) this.f17975f;
        int length = bArr2.length;
        int i12 = this.f17974e;
        if (length < i12 + i11) {
            this.f17975f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i7, (byte[]) this.f17975f, this.f17974e, i11);
        this.f17974e += i11;
    }

    public void b() {
        int j3;
        if (this.f17973c) {
            j3 = ((androidx.emoji2.text.g) this.f17975f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f17975f).j();
        }
        this.f17974e = j3;
    }

    public void c(int i7, View view) {
        int k10;
        if (this.f17973c) {
            int a10 = ((androidx.emoji2.text.g) this.f17975f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f17975f;
            if (Integer.MIN_VALUE == gVar.f2302a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2302a;
            }
            this.f17974e = k10 + a10;
        } else {
            this.f17974e = ((androidx.emoji2.text.g) this.f17975f).d(view);
        }
        this.f17972b = i7;
    }

    public void d(int i7, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f17975f;
        if (Integer.MIN_VALUE == gVar.f2302a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2302a;
        }
        if (k10 >= 0) {
            c(i7, view);
            return;
        }
        this.f17972b = i7;
        if (this.f17973c) {
            int f10 = (((androidx.emoji2.text.g) this.f17975f).f() - k10) - ((androidx.emoji2.text.g) this.f17975f).a(view);
            this.f17974e = ((androidx.emoji2.text.g) this.f17975f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f17974e - ((androidx.emoji2.text.g) this.f17975f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f17975f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f17975f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.f17974e = Math.min(f10, -min) + this.f17974e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f17975f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f17975f).j();
        this.f17974e = d;
        if (j10 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f17975f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f17975f).f() - k10) - ((androidx.emoji2.text.g) this.f17975f).a(view))) - (((androidx.emoji2.text.g) this.f17975f).b(view) + d);
            if (f11 < 0) {
                this.f17974e -= Math.min(j10, -f11);
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f17973c) {
            return false;
        }
        this.f17974e -= i7;
        this.f17973c = false;
        this.d = true;
        return true;
    }

    public void f(int i7) {
        boolean z9;
        boolean z10 = this.f17973c;
        if (i7 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17973c = z10 | z9;
        this.f17972b += i7;
    }

    public void g() {
        switch (this.f17971a) {
            case 1:
                this.f17973c = false;
                this.d = false;
                return;
            default:
                this.f17972b = -1;
                this.f17974e = Integer.MIN_VALUE;
                this.f17973c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i7) {
        boolean z9 = true;
        ia.p(!this.f17973c);
        if (i7 != this.f17972b) {
            z9 = false;
        }
        this.f17973c = z9;
        if (z9) {
            this.f17974e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f17971a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f17972b + ", mCoordinate=" + this.f17974e + ", mLayoutFromEnd=" + this.f17973c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public o0(int i7) {
        this.f17972b = i7;
        byte[] bArr = new byte[131];
        this.f17975f = bArr;
        bArr[2] = 1;
    }

    public o0(k1 k1Var) {
        this.f17975f = k1Var;
    }
}
