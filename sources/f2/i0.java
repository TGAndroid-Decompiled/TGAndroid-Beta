package f2;

import android.view.View;
import java.util.Arrays;
public final class i0 {
    public final int f5383a = 0;
    public int f5384b;
    public boolean f5385c;
    public boolean d;
    public int f5386e;
    public Object f5387f;

    public i0() {
    }

    public void a(int i9, int i10, byte[] bArr) {
        if (!this.f5385c) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = (byte[]) this.f5387f;
        int length = bArr2.length;
        int i12 = this.f5386e;
        if (length < i12 + i11) {
            this.f5387f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i9, (byte[]) this.f5387f, this.f5386e, i11);
        this.f5386e += i11;
    }

    public void b() {
        int j10;
        if (this.f5385c) {
            j10 = ((androidx.emoji2.text.f) this.f5387f).f();
        } else {
            j10 = ((androidx.emoji2.text.f) this.f5387f).j();
        }
        this.f5386e = j10;
    }

    public void c(int i9, View view) {
        int k10;
        if (this.f5385c) {
            int a2 = ((androidx.emoji2.text.f) this.f5387f).a(view);
            androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.f5387f;
            if (Integer.MIN_VALUE == fVar.f849a) {
                k10 = 0;
            } else {
                k10 = fVar.k() - fVar.f849a;
            }
            this.f5386e = k10 + a2;
        } else {
            this.f5386e = ((androidx.emoji2.text.f) this.f5387f).d(view);
        }
        this.f5384b = i9;
    }

    public void d(int i9, View view) {
        int k10;
        androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.f5387f;
        if (Integer.MIN_VALUE == fVar.f849a) {
            k10 = 0;
        } else {
            k10 = fVar.k() - fVar.f849a;
        }
        if (k10 >= 0) {
            c(i9, view);
            return;
        }
        this.f5384b = i9;
        if (this.f5385c) {
            int f10 = (((androidx.emoji2.text.f) this.f5387f).f() - k10) - ((androidx.emoji2.text.f) this.f5387f).a(view);
            this.f5386e = ((androidx.emoji2.text.f) this.f5387f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f5386e - ((androidx.emoji2.text.f) this.f5387f).b(view);
                int j10 = ((androidx.emoji2.text.f) this.f5387f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.f) this.f5387f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.f5386e = Math.min(f10, -min) + this.f5386e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.f) this.f5387f).d(view);
        int j11 = d - ((androidx.emoji2.text.f) this.f5387f).j();
        this.f5386e = d;
        if (j11 > 0) {
            int f11 = (((androidx.emoji2.text.f) this.f5387f).f() - Math.min(0, (((androidx.emoji2.text.f) this.f5387f).f() - k10) - ((androidx.emoji2.text.f) this.f5387f).a(view))) - (((androidx.emoji2.text.f) this.f5387f).b(view) + d);
            if (f11 < 0) {
                this.f5386e -= Math.min(j11, -f11);
            }
        }
    }

    public boolean e(int i9) {
        if (!this.f5385c) {
            return false;
        }
        this.f5386e -= i9;
        this.f5385c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.f5383a) {
            case 0:
                this.f5384b = -1;
                this.f5386e = Integer.MIN_VALUE;
                this.f5385c = false;
                this.d = false;
                return;
            default:
                this.f5385c = false;
                this.d = false;
                return;
        }
    }

    public void g(int i9) {
        boolean z10 = true;
        d5.a.i(!this.f5385c);
        if (i9 != this.f5384b) {
            z10 = false;
        }
        this.f5385c = z10;
        if (z10) {
            this.f5386e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f5383a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f5384b + ", mCoordinate=" + this.f5386e + ", mLayoutFromEnd=" + this.f5385c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public i0(int i9) {
        this.f5384b = i9;
        byte[] bArr = new byte[131];
        this.f5387f = bArr;
        bArr[2] = 1;
    }
}
