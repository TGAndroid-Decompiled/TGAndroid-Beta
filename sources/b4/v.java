package b4;

import android.view.View;
import java.util.Arrays;
public final class v {
    public final int f1538a = 1;
    public int f1539b;
    public int f1540c;
    public boolean d;
    public boolean e;
    public Object f1541f;

    public v() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.d) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f1541f;
        int length = bArr2.length;
        int i13 = this.f1540c;
        if (length < i13 + i12) {
            this.f1541f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f1541f, this.f1540c, i12);
        this.f1540c += i12;
    }

    public void b() {
        int j10;
        if (this.d) {
            j10 = ((androidx.emoji2.text.g) this.f1541f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f1541f).j();
        }
        this.f1540c = j10;
    }

    public void c(int i10, View view) {
        int k10;
        if (this.d) {
            int a2 = ((androidx.emoji2.text.g) this.f1541f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f1541f;
            if (Integer.MIN_VALUE == gVar.f772a) {
                k10 = 0;
            } else {
                k10 = gVar.k() - gVar.f772a;
            }
            this.f1540c = k10 + a2;
        } else {
            this.f1540c = ((androidx.emoji2.text.g) this.f1541f).d(view);
        }
        this.f1539b = i10;
    }

    public void d(int i10, View view) {
        int k10;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f1541f;
        if (Integer.MIN_VALUE == gVar.f772a) {
            k10 = 0;
        } else {
            k10 = gVar.k() - gVar.f772a;
        }
        if (k10 >= 0) {
            c(i10, view);
            return;
        }
        this.f1539b = i10;
        if (this.d) {
            int f10 = (((androidx.emoji2.text.g) this.f1541f).f() - k10) - ((androidx.emoji2.text.g) this.f1541f).a(view);
            this.f1540c = ((androidx.emoji2.text.g) this.f1541f).f() - f10;
            if (f10 > 0) {
                int b10 = this.f1540c - ((androidx.emoji2.text.g) this.f1541f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f1541f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f1541f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.f1540c = Math.min(f10, -min) + this.f1540c;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f1541f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f1541f).j();
        this.f1540c = d;
        if (j11 > 0) {
            int f11 = (((androidx.emoji2.text.g) this.f1541f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f1541f).f() - k10) - ((androidx.emoji2.text.g) this.f1541f).a(view))) - (((androidx.emoji2.text.g) this.f1541f).b(view) + d);
            if (f11 < 0) {
                this.f1540c -= Math.min(j11, -f11);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.d) {
            return false;
        }
        this.f1540c -= i10;
        this.d = false;
        this.e = true;
        return true;
    }

    public final void f() {
        switch (this.f1538a) {
            case 0:
                this.d = false;
                this.e = false;
                return;
            default:
                this.f1539b = -1;
                this.f1540c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                return;
        }
    }

    public void g(int i10) {
        boolean z4 = true;
        h5.a.i(!this.d);
        if (i10 != this.f1539b) {
            z4 = false;
        }
        this.d = z4;
        if (z4) {
            this.f1540c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.f1538a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f1539b + ", mCoordinate=" + this.f1540c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public v(int i10) {
        this.f1539b = i10;
        byte[] bArr = new byte[131];
        this.f1541f = bArr;
        bArr[2] = 1;
    }
}
