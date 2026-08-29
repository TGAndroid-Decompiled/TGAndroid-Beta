package f2;

import android.view.View;
import java.util.Arrays;
public final class f0 {
    public final int f6313a = 0;
    public int f6314b;
    public boolean f6315c;
    public boolean d;
    public int f6316e;
    public Object f6317f;

    public f0() {
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (!this.f6315c) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f6317f;
        int length = bArr2.length;
        int i13 = this.f6316e;
        if (length < i13 + i12) {
            this.f6317f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f6317f, this.f6316e, i12);
        this.f6316e += i12;
    }

    public void b() {
        int j10;
        if (this.f6315c) {
            j10 = ((androidx.emoji2.text.g) this.f6317f).f();
        } else {
            j10 = ((androidx.emoji2.text.g) this.f6317f).j();
        }
        this.f6316e = j10;
    }

    public void c(int i10, View view) {
        int k9;
        if (this.f6315c) {
            int a2 = ((androidx.emoji2.text.g) this.f6317f).a(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f6317f;
            if (Integer.MIN_VALUE == gVar.f1346a) {
                k9 = 0;
            } else {
                k9 = gVar.k() - gVar.f1346a;
            }
            this.f6316e = k9 + a2;
        } else {
            this.f6316e = ((androidx.emoji2.text.g) this.f6317f).d(view);
        }
        this.f6314b = i10;
    }

    public void d(int i10, View view) {
        int k9;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f6317f;
        if (Integer.MIN_VALUE == gVar.f1346a) {
            k9 = 0;
        } else {
            k9 = gVar.k() - gVar.f1346a;
        }
        if (k9 >= 0) {
            c(i10, view);
            return;
        }
        this.f6314b = i10;
        if (this.f6315c) {
            int f9 = (((androidx.emoji2.text.g) this.f6317f).f() - k9) - ((androidx.emoji2.text.g) this.f6317f).a(view);
            this.f6316e = ((androidx.emoji2.text.g) this.f6317f).f() - f9;
            if (f9 > 0) {
                int b10 = this.f6316e - ((androidx.emoji2.text.g) this.f6317f).b(view);
                int j10 = ((androidx.emoji2.text.g) this.f6317f).j();
                int min = b10 - (Math.min(((androidx.emoji2.text.g) this.f6317f).d(view) - j10, 0) + j10);
                if (min < 0) {
                    this.f6316e = Math.min(f9, -min) + this.f6316e;
                    return;
                }
                return;
            }
            return;
        }
        int d = ((androidx.emoji2.text.g) this.f6317f).d(view);
        int j11 = d - ((androidx.emoji2.text.g) this.f6317f).j();
        this.f6316e = d;
        if (j11 > 0) {
            int f10 = (((androidx.emoji2.text.g) this.f6317f).f() - Math.min(0, (((androidx.emoji2.text.g) this.f6317f).f() - k9) - ((androidx.emoji2.text.g) this.f6317f).a(view))) - (((androidx.emoji2.text.g) this.f6317f).b(view) + d);
            if (f10 < 0) {
                this.f6316e -= Math.min(j11, -f10);
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f6315c) {
            return false;
        }
        this.f6316e -= i10;
        this.f6315c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.f6313a) {
            case 0:
                this.f6314b = -1;
                this.f6316e = Integer.MIN_VALUE;
                this.f6315c = false;
                this.d = false;
                return;
            default:
                this.f6315c = false;
                this.d = false;
                return;
        }
    }

    public void g(int i10) {
        boolean z10 = true;
        f5.a.i(!this.f6315c);
        if (i10 != this.f6314b) {
            z10 = false;
        }
        this.f6315c = z10;
        if (z10) {
            this.f6316e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.f6313a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f6314b + ", mCoordinate=" + this.f6316e + ", mLayoutFromEnd=" + this.f6315c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public f0(int i10) {
        this.f6314b = i10;
        byte[] bArr = new byte[131];
        this.f6317f = bArr;
        bArr[2] = 1;
    }
}
