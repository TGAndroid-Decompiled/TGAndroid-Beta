package i2;

import a8.ma;
public final class s {
    public int f15986a;
    public int f15987b;
    public int f15988c;
    public int d = 0;
    public byte[] f15989e;

    public s(byte[] bArr, int i7, int i10) {
        this.f15989e = bArr;
        this.f15987b = i7;
        this.f15988c = i7;
        this.f15986a = i10;
        a();
    }

    public void a() {
        boolean z10;
        int i7;
        int i10 = this.f15988c;
        if (i10 >= 0 && (i10 < (i7 = this.f15986a) || (i10 == i7 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
    }

    public boolean b(int i7) {
        int i10 = this.f15988c;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        int i13 = (this.d + i7) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 > this.f15986a) {
                break;
            } else if (h(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f15986a;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        boolean z10;
        int i7 = this.f15988c;
        int i10 = this.d;
        int i11 = 0;
        while (this.f15988c < this.f15986a && !d()) {
            i11++;
        }
        if (this.f15988c == this.f15986a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15988c = i7;
        this.d = i10;
        if (z10 || !b((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10;
        if ((this.f15989e[this.f15988c] & (128 >> this.d)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i();
        return z10;
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
            byte[] bArr = this.f15989e;
            int i14 = this.f15988c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!h(i14 + 1)) {
                i11 = 1;
            }
            this.f15988c = i14 + i11;
        }
        byte[] bArr2 = this.f15989e;
        int i15 = this.f15988c;
        int i16 = ((-1) >>> (32 - i7)) & (i12 | ((bArr2[i15] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.d = 0;
            if (!h(i15 + 1)) {
                i11 = 1;
            }
            this.f15988c = i15 + i11;
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
        if (this.f15987b <= i10 && i7 < this.f15986a) {
            byte[] bArr = this.f15989e;
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
            int i11 = this.f15988c;
            if (h(i11 + 1)) {
                i7 = 2;
            }
            this.f15988c = i11 + i7;
        }
        a();
    }

    public void j(int i7) {
        int i10 = this.f15988c;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        this.f15988c = i12;
        int i13 = (i7 - (i11 * 8)) + this.d;
        this.d = i13;
        if (i13 > 7) {
            this.f15988c = i12 + 1;
            this.d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.f15988c) {
                if (h(i10)) {
                    this.f15988c++;
                    i10 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
