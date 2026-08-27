package d5;

public final class y {

    public final int f4852a;

    public byte[] f4853b;

    public int f4854c;
    public int d;

    public int f4855e;

    public y() {
        this.f4852a = 0;
        this.f4853b = g0.f4799f;
    }

    public void a() {
        int i10;
        int i11;
        switch (this.f4852a) {
            case 0:
                int i12 = this.f4854c;
                a.i(i12 >= 0 && (i12 < (i10 = this.f4855e) || (i12 == i10 && this.d == 0)));
                break;
            default:
                int i13 = this.d;
                a.i(i13 >= 0 && (i13 < (i11 = this.f4854c) || (i13 == i11 && this.f4855e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f4855e - this.f4854c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f4854c++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f4855e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f4854c) {
                break;
            }
            if (q(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f4854c;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean e() {
        int i10 = this.d;
        int i11 = this.f4855e;
        int i12 = 0;
        while (this.d < this.f4854c && !h()) {
            i12++;
        }
        boolean z10 = this.d == this.f4854c;
        this.d = i10;
        this.f4855e = i11;
        return !z10 && d((i12 * 2) + 1);
    }

    public int f() {
        a.i(this.d == 0);
        return this.f4854c;
    }

    public int g() {
        return (this.f4854c * 8) + this.d;
    }

    public boolean h() {
        switch (this.f4852a) {
            case 0:
                boolean z10 = (this.f4853b[this.f4854c] & (128 >> this.d)) != 0;
                r();
                return z10;
            case 1:
                boolean z11 = (this.f4853b[this.d] & (128 >> this.f4855e)) != 0;
                r();
                return z11;
            default:
                boolean z12 = (((this.f4853b[this.d] & 255) >> this.f4855e) & 1) == 1;
                s(1);
                return z12;
        }
    }

    public int i(int i10) {
        switch (this.f4852a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.d;
                    if (i12 <= 8) {
                        byte[] bArr = this.f4853b;
                        int i13 = this.f4854c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.d = 0;
                            this.f4854c = i13 + 1;
                        }
                        a();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.d = i15;
                    byte[] bArr2 = this.f4853b;
                    int i16 = this.f4854c;
                    this.f4854c = i16 + 1;
                    i11 |= (bArr2[i16] & 255) << i15;
                }
                break;
            case 1:
                this.f4855e += i10;
                int i17 = 0;
                while (true) {
                    int i18 = this.f4855e;
                    int i19 = 2;
                    if (i18 <= 8) {
                        byte[] bArr3 = this.f4853b;
                        int i20 = this.d;
                        int i21 = ((-1) >>> (32 - i10)) & (i17 | ((bArr3[i20] & 255) >> (8 - i18)));
                        if (i18 == 8) {
                            this.f4855e = 0;
                            this.d = i20 + (q(i20 + 1) ? 2 : 1);
                        }
                        a();
                        return i21;
                    }
                    int i22 = i18 - 8;
                    this.f4855e = i22;
                    byte[] bArr4 = this.f4853b;
                    int i23 = this.d;
                    i17 |= (bArr4[i23] & 255) << i22;
                    if (!q(i23 + 1)) {
                        i19 = 1;
                    }
                    this.d = i23 + i19;
                }
                break;
            default:
                int i24 = this.d;
                int iMin = Math.min(i10, 8 - this.f4855e);
                byte[] bArr5 = this.f4853b;
                int i25 = i24 + 1;
                int i26 = ((bArr5[i24] & 255) >> this.f4855e) & (255 >> (8 - iMin));
                while (iMin < i10) {
                    i26 |= (bArr5[i25] & 255) << iMin;
                    iMin += 8;
                    i25++;
                }
                int i27 = i26 & ((-1) >>> (32 - i10));
                s(i10);
                return i27;
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f4853b;
            int i13 = this.f4854c;
            int i14 = i13 + 1;
            this.f4854c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f4853b;
            int i18 = this.f4854c;
            this.f4854c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = this.f4853b;
        int i20 = this.f4854c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.f4854c = i20 + 1;
        }
        a();
    }

    public void k(int i10, byte[] bArr) {
        a.i(this.d == 0);
        System.arraycopy(this.f4853b, this.f4854c, bArr, 0, i10);
        this.f4854c += i10;
        a();
    }

    public int l() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int m() {
        int iL = l();
        return ((iL + 1) / 2) * (iL % 2 == 0 ? -1 : 1);
    }

    public void n(int i10, byte[] bArr) {
        this.f4853b = bArr;
        this.f4854c = 0;
        this.d = 0;
        this.f4855e = i10;
    }

    public void o(z zVar) {
        n(zVar.f4860c, zVar.f4858a);
        p(zVar.f4859b * 8);
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f4854c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public boolean q(int i10) {
        if (2 > i10 || i10 >= this.f4854c) {
            return false;
        }
        byte[] bArr = this.f4853b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void r() {
        switch (this.f4852a) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (i10 == 8) {
                    this.d = 0;
                    this.f4854c++;
                }
                a();
                break;
            default:
                int i11 = this.f4855e + 1;
                this.f4855e = i11;
                if (i11 == 8) {
                    this.f4855e = 0;
                    int i12 = this.d;
                    this.d = i12 + (q(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void s(int i10) {
        int i11;
        switch (this.f4852a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f4854c + i12;
                this.f4854c = i13;
                int i14 = (i10 - (i12 * 8)) + this.d;
                this.d = i14;
                if (i14 > 7) {
                    this.f4854c = i13 + 1;
                    this.d = i14 - 8;
                }
                a();
                break;
            case 1:
                int i15 = this.d;
                int i16 = i10 / 8;
                int i17 = i15 + i16;
                this.d = i17;
                int i18 = (i10 - (i16 * 8)) + this.f4855e;
                this.f4855e = i18;
                if (i18 > 7) {
                    this.d = i17 + 1;
                    this.f4855e = i18 - 8;
                }
                while (true) {
                    i15++;
                    if (i15 > this.d) {
                        a();
                        break;
                    } else if (q(i15)) {
                        this.d++;
                        i15 += 2;
                    }
                }
                break;
            default:
                int i19 = i10 / 8;
                int i20 = this.d + i19;
                this.d = i20;
                int i21 = (i10 - (i19 * 8)) + this.f4855e;
                this.f4855e = i21;
                boolean z10 = true;
                if (i21 > 7) {
                    this.d = i20 + 1;
                    this.f4855e = i21 - 8;
                }
                int i22 = this.d;
                if (i22 < 0 || (i22 >= (i11 = this.f4854c) && (i22 != i11 || this.f4855e != 0))) {
                    z10 = false;
                }
                a.i(z10);
                break;
        }
    }

    public void t(int i10) {
        a.i(this.d == 0);
        this.f4854c += i10;
        a();
    }

    public y(byte[] bArr, int i10, int i11) {
        this.f4852a = 1;
        this.f4853b = bArr;
        this.d = i10;
        this.f4854c = i11;
        this.f4855e = 0;
        a();
    }

    public y(byte[] bArr) {
        this.f4852a = 2;
        this.f4853b = bArr;
        this.f4854c = bArr.length;
    }

    public y(byte[] bArr, int i10) {
        this.f4852a = 0;
        this.f4853b = bArr;
        this.f4855e = i10;
    }

    public y(int i10, int i11) {
        this.f4852a = 3;
        this.f4854c = i10;
        this.d = i11;
        this.f4853b = new byte[(i11 * 2) - 1];
        this.f4855e = 0;
    }
}
