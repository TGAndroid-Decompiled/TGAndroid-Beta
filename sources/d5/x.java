package d5;
public final class x {
    public final int f4404a;
    public byte[] f4405b;
    public int f4406c;
    public int d;
    public int f4407e;

    public x() {
        this.f4404a = 0;
        this.f4405b = f0.f4353f;
    }

    public void a() {
        boolean z10;
        int i9;
        boolean z11;
        int i10;
        switch (this.f4404a) {
            case 0:
                int i11 = this.f4406c;
                if (i11 >= 0 && (i11 < (i9 = this.f4407e) || (i11 == i9 && this.d == 0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a.i(z10);
                return;
            default:
                int i12 = this.d;
                if (i12 >= 0 && (i12 < (i10 = this.f4406c) || (i12 == i10 && this.f4407e == 0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a.i(z11);
                return;
        }
    }

    public int b() {
        return ((this.f4407e - this.f4406c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f4406c++;
        a();
    }

    public boolean d(int i9) {
        int i10 = this.d;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f4407e + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f4406c) {
                break;
            } else if (q(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f4406c;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z10;
        int i9 = this.d;
        int i10 = this.f4407e;
        int i11 = 0;
        while (this.d < this.f4406c && !h()) {
            i11++;
        }
        if (this.d == this.f4406c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = i9;
        this.f4407e = i10;
        if (z10 || !d((i11 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        return this.f4406c;
    }

    public int g() {
        return (this.f4406c * 8) + this.d;
    }

    public boolean h() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f4404a) {
            case 0:
                if ((this.f4405b[this.f4406c] & (128 >> this.d)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r();
                return z10;
            case 1:
                if ((this.f4405b[this.d] & (128 >> this.f4407e)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r();
                return z11;
            default:
                if ((((this.f4405b[this.d] & 255) >> this.f4407e) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                s(1);
                return z12;
        }
    }

    public int i(int i9) {
        switch (this.f4404a) {
            case 0:
                if (i9 == 0) {
                    return 0;
                }
                this.d += i9;
                int i10 = 0;
                while (true) {
                    int i11 = this.d;
                    if (i11 > 8) {
                        int i12 = i11 - 8;
                        this.d = i12;
                        byte[] bArr = this.f4405b;
                        int i13 = this.f4406c;
                        this.f4406c = i13 + 1;
                        i10 |= (bArr[i13] & 255) << i12;
                    } else {
                        byte[] bArr2 = this.f4405b;
                        int i14 = this.f4406c;
                        int i15 = ((-1) >>> (32 - i9)) & (i10 | ((bArr2[i14] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.d = 0;
                            this.f4406c = i14 + 1;
                        }
                        a();
                        return i15;
                    }
                }
            case 1:
                this.f4407e += i9;
                int i16 = 0;
                while (true) {
                    int i17 = this.f4407e;
                    int i18 = 2;
                    if (i17 > 8) {
                        int i19 = i17 - 8;
                        this.f4407e = i19;
                        byte[] bArr3 = this.f4405b;
                        int i20 = this.d;
                        i16 |= (bArr3[i20] & 255) << i19;
                        if (!q(i20 + 1)) {
                            i18 = 1;
                        }
                        this.d = i20 + i18;
                    } else {
                        byte[] bArr4 = this.f4405b;
                        int i21 = this.d;
                        int i22 = ((-1) >>> (32 - i9)) & (i16 | ((bArr4[i21] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f4407e = 0;
                            if (!q(i21 + 1)) {
                                i18 = 1;
                            }
                            this.d = i21 + i18;
                        }
                        a();
                        return i22;
                    }
                }
            default:
                int i23 = this.d;
                int min = Math.min(i9, 8 - this.f4407e);
                byte[] bArr5 = this.f4405b;
                int i24 = i23 + 1;
                int i25 = ((bArr5[i23] & 255) >> this.f4407e) & (255 >> (8 - min));
                while (min < i9) {
                    i25 |= (bArr5[i24] & 255) << min;
                    min += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i9));
                s(i9);
                return i26;
        }
    }

    public void j(int i9, byte[] bArr) {
        int i10 = i9 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f4405b;
            int i12 = this.f4406c;
            int i13 = i12 + 1;
            this.f4406c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f4405b;
            int i17 = this.f4406c;
            this.f4406c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.d = i16 - 8;
        }
        int i18 = this.d + i15;
        this.d = i18;
        byte[] bArr4 = this.f4405b;
        int i19 = this.f4406c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.d = 0;
            this.f4406c = i19 + 1;
        }
        a();
    }

    public void k(int i9, byte[] bArr) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        System.arraycopy(this.f4405b, this.f4406c, bArr, 0, i9);
        this.f4406c += i9;
        a();
    }

    public int l() {
        int i9 = 0;
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i9 = i(i10);
        }
        return i11 + i9;
    }

    public int m() {
        int i9;
        int l10 = l();
        if (l10 % 2 == 0) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        return ((l10 + 1) / 2) * i9;
    }

    public void n(int i9, byte[] bArr) {
        this.f4405b = bArr;
        this.f4406c = 0;
        this.d = 0;
        this.f4407e = i9;
    }

    public void o(y yVar) {
        n(yVar.f4412c, yVar.f4410a);
        p(yVar.f4411b * 8);
    }

    public void p(int i9) {
        int i10 = i9 / 8;
        this.f4406c = i10;
        this.d = i9 - (i10 * 8);
        a();
    }

    public boolean q(int i9) {
        if (2 <= i9 && i9 < this.f4406c) {
            byte[] bArr = this.f4405b;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void r() {
        switch (this.f4404a) {
            case 0:
                int i9 = this.d + 1;
                this.d = i9;
                if (i9 == 8) {
                    this.d = 0;
                    this.f4406c++;
                }
                a();
                return;
            default:
                int i10 = 1;
                int i11 = this.f4407e + 1;
                this.f4407e = i11;
                if (i11 == 8) {
                    this.f4407e = 0;
                    int i12 = this.d;
                    if (q(i12 + 1)) {
                        i10 = 2;
                    }
                    this.d = i12 + i10;
                }
                a();
                return;
        }
    }

    public void s(int i9) {
        int i10;
        switch (this.f4404a) {
            case 0:
                int i11 = i9 / 8;
                int i12 = this.f4406c + i11;
                this.f4406c = i12;
                int i13 = (i9 - (i11 * 8)) + this.d;
                this.d = i13;
                if (i13 > 7) {
                    this.f4406c = i12 + 1;
                    this.d = i13 - 8;
                }
                a();
                return;
            case 1:
                int i14 = this.d;
                int i15 = i9 / 8;
                int i16 = i14 + i15;
                this.d = i16;
                int i17 = (i9 - (i15 * 8)) + this.f4407e;
                this.f4407e = i17;
                if (i17 > 7) {
                    this.d = i16 + 1;
                    this.f4407e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.d) {
                        if (q(i14)) {
                            this.d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i18 = i9 / 8;
                int i19 = this.d + i18;
                this.d = i19;
                int i20 = (i9 - (i18 * 8)) + this.f4407e;
                this.f4407e = i20;
                boolean z10 = true;
                if (i20 > 7) {
                    this.d = i19 + 1;
                    this.f4407e = i20 - 8;
                }
                int i21 = this.d;
                if (i21 < 0 || (i21 >= (i10 = this.f4406c) && (i21 != i10 || this.f4407e != 0))) {
                    z10 = false;
                }
                a.i(z10);
                return;
        }
    }

    public void t(int i9) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
        this.f4406c += i9;
        a();
    }

    public x(byte[] bArr, int i9, int i10) {
        this.f4404a = 1;
        this.f4405b = bArr;
        this.d = i9;
        this.f4406c = i10;
        this.f4407e = 0;
        a();
    }

    public x(byte[] bArr) {
        this.f4404a = 2;
        this.f4405b = bArr;
        this.f4406c = bArr.length;
    }

    public x(byte[] bArr, int i9) {
        this.f4404a = 0;
        this.f4405b = bArr;
        this.f4407e = i9;
    }

    public x(int i9, int i10) {
        this.f4404a = 3;
        this.f4406c = i9;
        this.d = i10;
        this.f4405b = new byte[(i10 * 2) - 1];
        this.f4407e = 0;
    }
}
