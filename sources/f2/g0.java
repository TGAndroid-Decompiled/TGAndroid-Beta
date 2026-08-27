package f2;

import android.view.View;
import java.util.Arrays;

public final class g0 {

    public final int f5671a = 0;

    public int f5672b;

    public boolean f5673c;
    public boolean d;

    public int f5674e;

    public Object f5675f;

    public g0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (this.f5673c) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f5675f;
            int length = bArr2.length;
            int i13 = this.f5674e;
            if (length < i13 + i12) {
                this.f5675f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f5675f, this.f5674e, i12);
            this.f5674e += i12;
        }
    }

    public void b() {
        this.f5674e = this.f5673c ? ((androidx.emoji2.text.g) this.f5675f).f() : ((androidx.emoji2.text.g) this.f5675f).j();
    }

    public void c(int i10, View view) {
        if (this.f5673c) {
            int iA = ((androidx.emoji2.text.g) this.f5675f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5675f;
            this.f5674e = (Integer.MIN_VALUE == gVar.f1351a ? 0 : gVar.k() - gVar.f1351a) + iA;
        } else {
            this.f5674e = ((androidx.emoji2.text.g) this.f5675f).d(view);
        }
        this.f5672b = i10;
    }

    public void d(int i10, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5675f;
        int iK = Integer.MIN_VALUE == gVar.f1351a ? 0 : gVar.k() - gVar.f1351a;
        if (iK >= 0) {
            c(i10, view);
            return;
        }
        this.f5672b = i10;
        if (!this.f5673c) {
            int iD = ((androidx.emoji2.text.g) this.f5675f).d(view);
            int iJ = iD - ((androidx.emoji2.text.g) this.f5675f).j();
            this.f5674e = iD;
            if (iJ > 0) {
                int iF = (((androidx.emoji2.text.g) this.f5675f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f5675f).f() - iK) - ((androidx.emoji2.text.g) this.f5675f).a(view))) - (((androidx.emoji2.text.g) this.f5675f).b(view) + iD);
                if (iF < 0) {
                    this.f5674e -= Math.min(iJ, -iF);
                    return;
                }
                return;
            }
            return;
        }
        int iF2 = (((androidx.emoji2.text.g) this.f5675f).f() - iK) - ((androidx.emoji2.text.g) this.f5675f).a(view);
        this.f5674e = ((androidx.emoji2.text.g) this.f5675f).f() - iF2;
        if (iF2 > 0) {
            int iB = this.f5674e - ((androidx.emoji2.text.g) this.f5675f).b(view);
            int iJ2 = ((androidx.emoji2.text.g) this.f5675f).j();
            int iMin = iB - (Math.min(((androidx.emoji2.text.g) this.f5675f).d(view) - iJ2, 0) + iJ2);
            if (iMin < 0) {
                this.f5674e = Math.min(iF2, -iMin) + this.f5674e;
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f5673c) {
            return false;
        }
        this.f5674e -= i10;
        this.f5673c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.f5671a) {
            case 0:
                this.f5672b = -1;
                this.f5674e = Integer.MIN_VALUE;
                this.f5673c = false;
                this.d = false;
                break;
            default:
                this.f5673c = false;
                this.d = false;
                break;
        }
    }

    public void g(int i10) {
        d5.a.i(!this.f5673c);
        boolean z10 = i10 == this.f5672b;
        this.f5673c = z10;
        if (z10) {
            this.f5674e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f5671a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f5672b + ", mCoordinate=" + this.f5674e + ", mLayoutFromEnd=" + this.f5673c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public g0(int i10) {
        this.f5672b = i10;
        byte[] bArr = new byte[131];
        this.f5675f = bArr;
        bArr[2] = 1;
    }
}
