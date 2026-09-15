package i2;

import android.view.View;
import java.util.Arrays;
public final class l0 {
    public final int f10772a = 2;
    public int f10773b;
    public boolean f10774c;
    public boolean d;
    public int e;
    public Object f10775f;

    public l0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f10774c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f10775f;
        int length = bArr2.length;
        int i13 = this.e;
        if (length < i13 + i12) {
            this.f10775f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f10775f, this.e, i12);
        this.e += i12;
    }

    public void b() {
        int j3;
        if (this.f10774c) {
            j3 = ((androidx.emoji2.text.g) this.f10775f).f();
        } else {
            j3 = ((androidx.emoji2.text.g) this.f10775f).j();
        }
        this.e = j3;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.f10774c) {
            int a2 = ((androidx.emoji2.text.g) this.f10775f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10775f;
            if (Integer.MIN_VALUE == gVar.f2325a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f2325a;
            }
            this.e = k10 + a2;
        } else {
            this.e = ((androidx.emoji2.text.g) this.f10775f).d(view);
        }
        this.f10773b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f10775f;
        if (Integer.MIN_VALUE == gVar.f2325a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f2325a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f10773b = i10;
        if (this.f10774c) {
            int f7 = (((androidx.emoji2.text.g) this.f10775f).f() - k10) - ((androidx.emoji2.text.g) this.f10775f).a(view);
            this.e = ((androidx.emoji2.text.g) this.f10775f).f() - f7;
            if (f7 > 0) {
                int b10 = this.e - ((androidx.emoji2.text.g) this.f10775f).b(view);
                int j3 = ((androidx.emoji2.text.g) this.f10775f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f10775f).d(view) - j3, 0) + j3);
                if (min < 0) {
                    this.e = Math.min(f7, -min) + this.e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f10775f).d(view);
        int j10 = d - ((androidx.emoji2.text.g) this.f10775f).j();
        this.e = d;
        if (j10 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f10775f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f10775f).f() - k10) - ((androidx.emoji2.text.g) this.f10775f).a(view))) - (((androidx.emoji2.text.g) this.f10775f).b(view) + d);
            if (f10 < 0) {
                this.e -= Math.min(j10, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f10774c) {
            return false;
        }
        this.e -= i10;
        this.f10774c = false;
        this.d = true;
        return true;
    }

    public void f(int i10) {
        boolean z10;
        boolean z11 = this.f10774c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10774c = z11 | z10;
        this.f10773b += i10;
    }

    public void g() {
        switch (this.f10772a) {
            case 1:
                this.f10774c = false;
                this.d = false;
                return;
            default:
                this.f10773b = -1;
                this.e = Integer.MIN_VALUE;
                this.f10774c = false;
                this.d = false;
                return;
        }
    }

    public void h(int i10) {
        boolean z10 = true;
        e2.d.g(!this.f10774c);
        if (i10 != this.f10773b) {
            z10 = false;
        }
        this.f10774c = z10;
        if (z10) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f10772a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f10773b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.f10774c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public l0(int i10) {
        this.f10773b = i10;
        byte[] bArr = new byte[131];
        this.f10775f = bArr;
        bArr[2] = 1;
    }

    public l0(g1 g1Var) {
        this.f10775f = g1Var;
    }
}
