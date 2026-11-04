package k2;

import android.view.View;
import b8.zb;
import java.util.Arrays;
public final class o0 {
    public final int f16659a = 2;
    public int f16660b;
    public boolean f16661c;
    public boolean d;
    public int f16662e;
    public Object f16663f;

    public o0() {
    }

    public void a(int i3, int i10, byte[] bArr) {
        if (!this.f16661c) {
            return;
        }
        int i11 = i10 - i3;
        byte[] bArr2 = (byte[]) this.f16663f;
        int length = bArr2.length;
        int i12 = this.f16662e;
        if (length < i12 + i11) {
            this.f16663f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i3, (byte[]) this.f16663f, this.f16662e, i11);
        this.f16662e += i11;
    }

    public void b() {
        int j10;
        if (this.f16661c) {
            j10 = ((androidx.emoji2.text.g) this.f16663f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f16663f).j();
        }
        this.f16662e = j10;
    }

    public void c(int i3, View view) {
        int k10;
        if (this.f16661c) {
            int a10 = ((androidx.emoji2.text.g) this.f16663f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f16663f;
            if (Integer.MIN_VALUE == gVar.f1725a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f1725a;
            }
            this.f16662e = k10 + a10;
        } else {
            this.f16662e = ((androidx.emoji2.text.g) this.f16663f).d(view);
        }
        this.f16660b = i3;
    }

    public void d(int i3, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f16663f;
        if (Integer.MIN_VALUE == gVar.f1725a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f1725a;
        }
        if (k10 >= 0) {
            c(i3, view);
            return;
        }
        this.f16660b = i3;
        if (this.f16661c) {
            int f10 = (((androidx.emoji2.text.g) this.f16663f).f() - k10) - ((androidx.emoji2.text.g) this.f16663f).a(view);
            this.f16662e = ((androidx.emoji2.text.g) this.f16663f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f16662e - ((androidx.emoji2.text.g) this.f16663f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f16663f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f16663f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.f16662e = Math.min(f10, -min) + this.f16662e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f16663f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f16663f).j();
        this.f16662e = d;
        if (j11 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f16663f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f16663f).f() - k10) - ((androidx.emoji2.text.g) this.f16663f).a(view))) - (((androidx.emoji2.text.g) this.f16663f).b(view) + d);
            if (f11 < 0) {
                this.f16662e -= Math.min(j11, -f11);
            }
        }
    }

    public boolean e(int i3) {
        if (!this.f16661c) {
            return false;
        }
        this.f16662e -= i3;
        this.f16661c = false;
        this.d = true;
        return true;
    }

    public void f(int i3) {
        boolean z10;
        boolean z11 = this.f16661c;
        if (i3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16661c = z11 | z10;
        this.f16660b += i3;
    }

    public void g() {
        switch (this.f16659a) {
            case 1:
                this.f16661c = false;
                this.d = false;
                return;
            default:
                this.f16660b = -1;
                this.f16662e = Integer.MIN_VALUE;
                this.f16661c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i3) {
        boolean z10 = true;
        zb.p(!this.f16661c);
        if (i3 != this.f16660b) {
            z10 = false;
        }
        this.f16661c = z10;
        if (z10) {
            this.f16662e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f16659a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f16660b + ", mCoordinate=" + this.f16662e + ", mLayoutFromEnd=" + this.f16661c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public o0(int i3) {
        this.f16660b = i3;
        byte[] bArr = new byte[131];
        this.f16663f = bArr;
        bArr[2] = 1;
    }

    public o0(j1 j1Var) {
        this.f16663f = j1Var;
    }
}
