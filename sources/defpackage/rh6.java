package defpackage;

import java.io.Serializable;
public final class rh6 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public Serializable e;

    public rh6(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.b = i;
        this.c = i;
        this.a = i2;
        a();
    }

    public final void a() {
        boolean z;
        int i;
        int i2 = this.c;
        if (i2 >= 0 && (i2 < (i = this.a) || (i2 == i && this.d == 0))) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
    }

    public final boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.a) {
                break;
            } else if (i(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.a;
        if (i4 < i6 || (i4 == i6 && i5 == 0)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        boolean z;
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.a && !d()) {
            i3++;
        }
        if (this.c == this.a) {
            z = true;
        } else {
            z = false;
        }
        this.c = i;
        this.d = i2;
        if (z || !b((i3 << 1) + 1)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        boolean z;
        if ((((byte[]) this.e)[this.c] & (128 >> this.d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        j();
        return z;
    }

    public final int e(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            int i6 = this.c;
            i4 |= (((byte[]) this.e)[i6] & 255) << i5;
            if (!i(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        int i7 = this.c;
        int i8 = (i4 | ((((byte[]) this.e)[i7] & 255) >> (8 - i2))) & ((-1) >>> (32 - i));
        if (i2 == 8) {
            this.d = 0;
            if (!i(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        a();
        return i8;
    }

    public final int f() {
        int i = 0;
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = e(i2);
        }
        return i3 + i;
    }

    public final int g() {
        int i;
        int f = f();
        if (f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((f + 1) / 2) * i;
    }

    public final long h() {
        int i = this.c;
        if (i != 0) {
            int i2 = this.a;
            long j = ((long[]) this.e)[i2];
            this.a = (i2 + 1) & this.d;
            this.c = i - 1;
            return j;
        }
        u36.g();
        return 0L;
    }

    public final boolean i(int i) {
        int i2 = i - 2;
        if (this.b <= i2 && i < this.a) {
            byte[] bArr = (byte[]) this.e;
            if (bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (i(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        a();
    }

    public final void k(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 << 3)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (i(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
