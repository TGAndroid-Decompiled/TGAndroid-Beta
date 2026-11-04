package h2;

import b8.zb;
public final class s {
    public int f14176a;
    public int f14177b;
    public int f14178c;
    public int d = 0;
    public byte[] f14179e;

    public s(byte[] bArr, int i3, int i10) {
        this.f14179e = bArr;
        this.f14177b = i3;
        this.f14178c = i3;
        this.f14176a = i10;
        a();
    }

    public void a() {
        boolean z10;
        int i3;
        int i10 = this.f14178c;
        if (i10 >= 0 && (i10 < (i3 = this.f14176a) || (i10 == i3 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
    }

    public boolean b(int i3) {
        int i10 = this.f14178c;
        int i11 = i3 / 8;
        int i12 = i10 + i11;
        int i13 = (this.d + i3) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 > this.f14176a) {
                break;
            } else if (h(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f14176a;
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
        int i3 = this.f14178c;
        int i10 = this.d;
        int i11 = 0;
        while (this.f14178c < this.f14176a && !d()) {
            i11++;
        }
        if (this.f14178c == this.f14176a) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14178c = i3;
        this.d = i10;
        if (z10 || !b((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z10;
        if ((this.f14179e[this.f14178c] & (128 >> this.d)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i();
        return z10;
    }

    public int e(int i3) {
        int i10;
        int i11;
        this.d += i3;
        int i12 = 0;
        while (true) {
            i10 = this.d;
            i11 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.d = i13;
            byte[] bArr = this.f14179e;
            int i14 = this.f14178c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!h(i14 + 1)) {
                i11 = 1;
            }
            this.f14178c = i14 + i11;
        }
        byte[] bArr2 = this.f14179e;
        int i15 = this.f14178c;
        int i16 = ((-1) >>> (32 - i3)) & (i12 | ((bArr2[i15] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.d = 0;
            if (!h(i15 + 1)) {
                i11 = 1;
            }
            this.f14178c = i15 + i11;
        }
        a();
        return i16;
    }

    public int f() {
        int i3 = 0;
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i3 = e(i10);
        }
        return i11 + i3;
    }

    public int g() {
        int i3;
        int f10 = f();
        if (f10 % 2 == 0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        return ((f10 + 1) / 2) * i3;
    }

    public boolean h(int i3) {
        int i10 = i3 - 2;
        if (this.f14177b <= i10 && i3 < this.f14176a) {
            byte[] bArr = this.f14179e;
            if (bArr[i3] == 3 && bArr[i10] == 0 && bArr[i3 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void i() {
        int i3 = 1;
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            int i11 = this.f14178c;
            if (h(i11 + 1)) {
                i3 = 2;
            }
            this.f14178c = i11 + i3;
        }
        a();
    }

    public void j(int i3) {
        int i10 = this.f14178c;
        int i11 = i3 / 8;
        int i12 = i10 + i11;
        this.f14178c = i12;
        int i13 = (i3 - (i11 * 8)) + this.d;
        this.d = i13;
        if (i13 > 7) {
            this.f14178c = i12 + 1;
            this.d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.f14178c) {
                if (h(i10)) {
                    this.f14178c++;
                    i10 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }
}
