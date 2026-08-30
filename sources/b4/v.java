package b4;

import android.view.View;
import java.util.Arrays;
public final class v {
    public final int f1527a = 1;
    public int f1528b;
    public int f1529c;
    public boolean d;
    public boolean e;
    public Object f1530f;

    public v() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.d) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f1530f;
        int length = bArr2.length;
        int i13 = this.f1529c;
        if (length < i13 + i12) {
            this.f1530f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f1530f, this.f1529c, i12);
        this.f1529c += i12;
    }

    public void b() {
        int j10;
        if (this.d) {
            j10 = ((androidx.emoji2.text.g) this.f1530f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f1530f).j();
        }
        this.f1529c = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.d) {
            int a2 = ((androidx.emoji2.text.g) this.f1530f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f1530f;
            if (Integer.MIN_VALUE == gVar.f760a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f760a;
            }
            this.f1529c = k10 + a2;
        } else {
            this.f1529c = ((androidx.emoji2.text.g) this.f1530f).d(view);
        }
        this.f1528b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f1530f;
        if (Integer.MIN_VALUE == gVar.f760a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f760a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f1528b = i10;
        if (this.d) {
            int f10 = (((androidx.emoji2.text.g) this.f1530f).f() - k10) - ((androidx.emoji2.text.g) this.f1530f).a(view);
            this.f1529c = ((androidx.emoji2.text.g) this.f1530f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f1529c - ((androidx.emoji2.text.g) this.f1530f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f1530f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f1530f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.f1529c = Math.min(f10, -min) + this.f1529c;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f1530f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f1530f).j();
        this.f1529c = d;
        if (j11 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f1530f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f1530f).f() - k10) - ((androidx.emoji2.text.g) this.f1530f).a(view))) - (((androidx.emoji2.text.g) this.f1530f).b(view) + d);
            if (f11 < 0) {
                this.f1529c -= Math.min(j11, -f11);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.d) {
            return false;
        }
        this.f1529c -= i10;
        this.d = false;
        this.e = true;
        return true;
    }

    public final void f() {
        switch (this.f1527a) {
            case 0:
                this.d = false;
                this.e = false;
                return;
            default:
                this.f1528b = -1;
                this.f1529c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                return;
        }
    }

    public void g(int i10) {
        boolean z4 = true;
        h5.a.i(!this.d);
        if (i10 != this.f1528b) {
            z4 = false;
        }
        this.d = z4;
        if (z4) {
            this.f1529c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.f1527a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f1528b + ", mCoordinate=" + this.f1529c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public v(int i10) {
        this.f1528b = i10;
        byte[] bArr = new byte[131];
        this.f1530f = bArr;
        bArr[2] = 1;
    }
}
