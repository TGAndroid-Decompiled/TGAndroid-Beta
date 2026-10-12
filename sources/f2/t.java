package f2;

import v7.u6;
public final class t {
    public int f8906a;
    public int f8907b;
    public int f8908c;
    public int d = 0;
    public byte[] e;

    public t(byte[] bArr, int i10, int i11) {
        this.e = bArr;
        this.f8907b = i10;
        this.f8908c = i10;
        this.f8906a = i11;
        a();
    }

    public void a() {
        boolean z10;
        int i10;
        int i11 = this.f8908c;
        if (i11 >= 0 && (i11 < (i10 = this.f8906a) || (i11 == i10 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
    }

    public boolean b(int i10) {
        int i11 = this.f8908c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 > this.f8906a) {
                break;
            } else if (h(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f8906a;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        boolean z10;
        int i10 = this.f8908c;
        int i11 = this.d;
        int i12 = 0;
        while (this.f8908c < this.f8906a && !d()) {
            i12++;
        }
        if (this.f8908c == this.f8906a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8908c = i10;
        this.d = i11;
        if (z10 || !b((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10;
        if ((this.e[this.f8908c] & (128 >> this.d)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.d = i14;
            byte[] bArr = this.e;
            int i15 = this.f8908c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!h(i15 + 1)) {
                i12 = 1;
            }
            this.f8908c = i15 + i12;
        }
        byte[] bArr2 = this.e;
        int i16 = this.f8908c;
        int i17 = ((-1) >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.d = 0;
            if (!h(i16 + 1)) {
                i12 = 1;
            }
            this.f8908c = i16 + i12;
        }
        a();
        return i17;
    }

    public int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    public int g() {
        int i10;
        int f7 = f();
        if (f7 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((f7 + 1) / 2) * i10;
    }

    public boolean h(int i10) {
        int i11 = i10 - 2;
        if (this.f8907b <= i11 && i10 < this.f8906a) {
            byte[] bArr = this.e;
            if (bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void i() {
        int i10 = 1;
        int i11 = this.d + 1;
        this.d = i11;
        if (i11 == 8) {
            this.d = 0;
            int i12 = this.f8908c;
            if (h(i12 + 1)) {
                i10 = 2;
            }
            this.f8908c = i12 + i10;
        }
        a();
    }

    public void j(int i10) {
        int i11 = this.f8908c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f8908c = i13;
        int i14 = (i10 - (i12 * 8)) + this.d;
        this.d = i14;
        if (i14 > 7) {
            this.f8908c = i13 + 1;
            this.d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f8908c) {
                if (h(i11)) {
                    this.f8908c++;
                    i11 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
