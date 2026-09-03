package h5;
public final class v {
    public final int f6983a;
    public byte[] f6984b;
    public int f6985c;
    public int d;
    public int e;

    public v() {
        this.f6983a = 0;
        this.f6984b = d0.f6927f;
    }

    public void a() {
        boolean z4;
        int i10;
        boolean z10;
        int i11;
        switch (this.f6983a) {
            case 0:
                int i12 = this.f6985c;
                if (i12 >= 0 && (i12 < (i10 = this.e) || (i12 == i10 && this.d == 0))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                a.i(z4);
                return;
            default:
                int i13 = this.d;
                if (i13 >= 0 && (i13 < (i11 = this.f6985c) || (i13 == i11 && this.e == 0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a.i(z10);
                return;
        }
    }

    public int b() {
        return ((this.e - this.f6985c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f6985c++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f6985c) {
                break;
            } else if (q(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f6985c;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z4;
        int i10 = this.d;
        int i11 = this.e;
        int i12 = 0;
        while (this.d < this.f6985c && !h()) {
            i12++;
        }
        if (this.d == this.f6985c) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = i10;
        this.e = i11;
        if (z4 || !d((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z4;
        if (this.d == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        return this.f6985c;
    }

    public int g() {
        return (this.f6985c * 8) + this.d;
    }

    public boolean h() {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.f6983a) {
            case 0:
                if ((this.f6984b[this.f6985c] & (128 >> this.d)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r();
                return z4;
            case 1:
                if ((this.f6984b[this.d] & (128 >> this.e)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r();
                return z10;
            default:
                if ((((this.f6984b[this.d] & 255) >> this.e) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s(1);
                return z11;
        }
    }

    public int i(int i10) {
        switch (this.f6983a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.d;
                    if (i12 > 8) {
                        int i13 = i12 - 8;
                        this.d = i13;
                        byte[] bArr = this.f6984b;
                        int i14 = this.f6985c;
                        this.f6985c = i14 + 1;
                        i11 |= (bArr[i14] & 255) << i13;
                    } else {
                        byte[] bArr2 = this.f6984b;
                        int i15 = this.f6985c;
                        int i16 = ((-1) >>> (32 - i10)) & (i11 | ((bArr2[i15] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.d = 0;
                            this.f6985c = i15 + 1;
                        }
                        a();
                        return i16;
                    }
                }
            case 1:
                this.e += i10;
                int i17 = 0;
                while (true) {
                    int i18 = this.e;
                    int i19 = 2;
                    if (i18 > 8) {
                        int i20 = i18 - 8;
                        this.e = i20;
                        byte[] bArr3 = this.f6984b;
                        int i21 = this.d;
                        i17 |= (bArr3[i21] & 255) << i20;
                        if (!q(i21 + 1)) {
                            i19 = 1;
                        }
                        this.d = i21 + i19;
                    } else {
                        byte[] bArr4 = this.f6984b;
                        int i22 = this.d;
                        int i23 = ((-1) >>> (32 - i10)) & (i17 | ((bArr4[i22] & 255) >> (8 - i18)));
                        if (i18 == 8) {
                            this.e = 0;
                            if (!q(i22 + 1)) {
                                i19 = 1;
                            }
                            this.d = i22 + i19;
                        }
                        a();
                        return i23;
                    }
                }
            default:
                int i24 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr5 = this.f6984b;
                int i25 = i24 + 1;
                int i26 = ((bArr5[i24] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i10) {
                    i26 |= (bArr5[i25] & 255) << min;
                    min += 8;
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
            byte[] bArr2 = this.f6984b;
            int i13 = this.f6985c;
            int i14 = i13 + 1;
            this.f6985c = i14;
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
            byte[] bArr3 = this.f6984b;
            int i18 = this.f6985c;
            this.f6985c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = this.f6984b;
        int i20 = this.f6985c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.f6985c = i20 + 1;
        }
        a();
    }

    public void k(int i10, byte[] bArr) {
        boolean z4;
        if (this.d == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        System.arraycopy(this.f6984b, this.f6985c, bArr, 0, i10);
        this.f6985c += i10;
        a();
    }

    public int l() {
        int i10 = 0;
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = i(i11);
        }
        return i12 + i10;
    }

    public int m() {
        int i10;
        int l10 = l();
        if (l10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((l10 + 1) / 2) * i10;
    }

    public void n(int i10, byte[] bArr) {
        this.f6984b = bArr;
        this.f6985c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void o(w wVar) {
        n(wVar.f6989c, wVar.f6987a);
        p(wVar.f6988b * 8);
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f6985c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public boolean q(int i10) {
        if (2 <= i10 && i10 < this.f6985c) {
            byte[] bArr = this.f6984b;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void r() {
        switch (this.f6983a) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (i10 == 8) {
                    this.d = 0;
                    this.f6985c++;
                }
                a();
                return;
            default:
                int i11 = 1;
                int i12 = this.e + 1;
                this.e = i12;
                if (i12 == 8) {
                    this.e = 0;
                    int i13 = this.d;
                    if (q(i13 + 1)) {
                        i11 = 2;
                    }
                    this.d = i13 + i11;
                }
                a();
                return;
        }
    }

    public void s(int i10) {
        int i11;
        switch (this.f6983a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f6985c + i12;
                this.f6985c = i13;
                int i14 = (i10 - (i12 * 8)) + this.d;
                this.d = i14;
                if (i14 > 7) {
                    this.f6985c = i13 + 1;
                    this.d = i14 - 8;
                }
                a();
                return;
            case 1:
                int i15 = this.d;
                int i16 = i10 / 8;
                int i17 = i15 + i16;
                this.d = i17;
                int i18 = (i10 - (i16 * 8)) + this.e;
                this.e = i18;
                if (i18 > 7) {
                    this.d = i17 + 1;
                    this.e = i18 - 8;
                }
                while (true) {
                    i15++;
                    if (i15 <= this.d) {
                        if (q(i15)) {
                            this.d++;
                            i15 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i19 = i10 / 8;
                int i20 = this.d + i19;
                this.d = i20;
                int i21 = (i10 - (i19 * 8)) + this.e;
                this.e = i21;
                boolean z4 = true;
                if (i21 > 7) {
                    this.d = i20 + 1;
                    this.e = i21 - 8;
                }
                int i22 = this.d;
                if (i22 < 0 || (i22 >= (i11 = this.f6985c) && (i22 != i11 || this.e != 0))) {
                    z4 = false;
                }
                a.i(z4);
                return;
        }
    }

    public void t(int i10) {
        boolean z4;
        if (this.d == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
        this.f6985c += i10;
        a();
    }

    public v(byte[] bArr, int i10, int i11) {
        this.f6983a = 1;
        this.f6984b = bArr;
        this.d = i10;
        this.f6985c = i11;
        this.e = 0;
        a();
    }

    public v(byte[] bArr) {
        this.f6983a = 2;
        this.f6984b = bArr;
        this.f6985c = bArr.length;
    }

    public v(byte[] bArr, int i10) {
        this.f6983a = 0;
        this.f6984b = bArr;
        this.e = i10;
    }

    public v(int i10, int i11) {
        this.f6983a = 3;
        this.f6985c = i10;
        this.d = i11;
        this.f6984b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
