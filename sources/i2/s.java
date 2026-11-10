package i2;

import a8.ia;
public final class s {
    public int f15225a;
    public int f15226b;
    public int f15227c;
    public int d = 0;
    public byte[] f15228e;

    public s(byte[] bArr, int i7, int i10) {
        this.f15228e = bArr;
        this.f15226b = i7;
        this.f15227c = i7;
        this.f15225a = i10;
        a();
    }

    public void a() {
        boolean z9;
        int i7;
        int i10 = this.f15227c;
        if (i10 >= 0 && (i10 < (i7 = this.f15225a) || (i10 == i7 && this.d == 0))) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
    }

    public boolean b(int i7) {
        int i10 = this.f15227c;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        int i13 = (this.d + i7) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 > this.f15225a) {
                break;
            } else if (h(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f15225a;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        boolean z9;
        int i7 = this.f15227c;
        int i10 = this.d;
        int i11 = 0;
        while (this.f15227c < this.f15225a && !d()) {
            i11++;
        }
        if (this.f15227c == this.f15225a) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f15227c = i7;
        this.d = i10;
        if (z9 || !b((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z9;
        if ((this.f15228e[this.f15227c] & (128 >> this.d)) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        i();
        return z9;
    }

    public int e(int i7) {
        int i10;
        int i11;
        this.d += i7;
        int i12 = 0;
        while (true) {
            i10 = this.d;
            i11 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.d = i13;
            byte[] bArr = this.f15228e;
            int i14 = this.f15227c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!h(i14 + 1)) {
                i11 = 1;
            }
            this.f15227c = i14 + i11;
        }
        byte[] bArr2 = this.f15228e;
        int i15 = this.f15227c;
        int i16 = ((-1) >>> (32 - i7)) & (i12 | ((bArr2[i15] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.d = 0;
            if (!h(i15 + 1)) {
                i11 = 1;
            }
            this.f15227c = i15 + i11;
        }
        a();
        return i16;
    }

    public int f() {
        int i7 = 0;
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i7 = e(i10);
        }
        return i11 + i7;
    }

    public int g() {
        int i7;
        int f10 = f();
        if (f10 % 2 == 0) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        return ((f10 + 1) / 2) * i7;
    }

    public boolean h(int i7) {
        int i10 = i7 - 2;
        if (this.f15226b <= i10 && i7 < this.f15225a) {
            byte[] bArr = this.f15228e;
            if (bArr[i7] == 3 && bArr[i10] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void i() {
        int i7 = 1;
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            int i11 = this.f15227c;
            if (h(i11 + 1)) {
                i7 = 2;
            }
            this.f15227c = i11 + i7;
        }
        a();
    }

    public void j(int i7) {
        int i10 = this.f15227c;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        this.f15227c = i12;
        int i13 = (i7 - (i11 * 8)) + this.d;
        this.d = i13;
        if (i13 > 7) {
            this.f15227c = i12 + 1;
            this.d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.f15227c) {
                if (h(i10)) {
                    this.f15227c++;
                    i10 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
