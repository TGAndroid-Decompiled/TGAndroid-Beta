package a4;

import e2.d0;
import e2.v;
public final class h {
    public final int f273a;
    public byte[] f274b;
    public int f275c;
    public int d;
    public int f276e;

    public h() {
        this.f273a = 2;
        this.f274b = d0.f8766b;
    }

    public void a() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        switch (this.f273a) {
            case 2:
                int i12 = this.f275c;
                if (i12 >= 0 && (i12 < (i10 = this.f276e) || (i12 == i10 && this.d == 0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                return;
            default:
                int i13 = this.d;
                if (i13 >= 0 && (i13 < (i11 = this.f275c) || (i13 == i11 && this.f276e == 0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.g(z11);
                return;
        }
    }

    public int b() {
        return ((this.f276e - this.f275c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f275c++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f276e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f275c) {
                break;
            } else if (r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f275c;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z10;
        int i10 = this.d;
        int i11 = this.f276e;
        int i12 = 0;
        while (this.d < this.f275c && !h()) {
            i12++;
        }
        if (this.d == this.f275c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = i10;
        this.f276e = i11;
        if (z10 || !d((i12 * 2) + 1)) {
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
        e2.d.g(z10);
        return this.f275c;
    }

    public int g() {
        return (this.f275c * 8) + this.d;
    }

    public boolean h() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f273a) {
            case 1:
                if ((((this.f274b[this.d] & 255) >> this.f276e) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t(1);
                return z10;
            case 2:
                if ((this.f274b[this.f275c] & (128 >> this.d)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s();
                return z11;
            default:
                if ((this.f274b[this.d] & (128 >> this.f276e)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                s();
                return z12;
        }
    }

    public int i(int i10) {
        switch (this.f273a) {
            case 1:
                int i11 = this.d;
                int min = Math.min(i10, 8 - this.f276e);
                byte[] bArr = this.f274b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.f276e) & (255 >> (8 - min));
                while (min < i10) {
                    i13 |= (bArr[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                t(i10);
                return i14;
            case 2:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.d;
                    if (i16 > 8) {
                        int i17 = i16 - 8;
                        this.d = i17;
                        byte[] bArr2 = this.f274b;
                        int i18 = this.f275c;
                        this.f275c = i18 + 1;
                        i15 |= (bArr2[i18] & 255) << i17;
                    } else {
                        byte[] bArr3 = this.f274b;
                        int i19 = this.f275c;
                        int i20 = ((-1) >>> (32 - i10)) & (i15 | ((bArr3[i19] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.d = 0;
                            this.f275c = i19 + 1;
                        }
                        a();
                        return i20;
                    }
                }
            default:
                this.f276e += i10;
                int i21 = 0;
                while (true) {
                    int i22 = this.f276e;
                    int i23 = 2;
                    if (i22 > 8) {
                        int i24 = i22 - 8;
                        this.f276e = i24;
                        byte[] bArr4 = this.f274b;
                        int i25 = this.d;
                        i21 |= (bArr4[i25] & 255) << i24;
                        if (!r(i25 + 1)) {
                            i23 = 1;
                        }
                        this.d = i25 + i23;
                    } else {
                        byte[] bArr5 = this.f274b;
                        int i26 = this.d;
                        int i27 = ((-1) >>> (32 - i10)) & (i21 | ((bArr5[i26] & 255) >> (8 - i22)));
                        if (i22 == 8) {
                            this.f276e = 0;
                            if (!r(i26 + 1)) {
                                i23 = 1;
                            }
                            this.d = i26 + i23;
                        }
                        a();
                        return i27;
                    }
                }
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f274b;
            int i13 = this.f275c;
            int i14 = i13 + 1;
            this.f275c = i14;
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
            byte[] bArr3 = this.f274b;
            int i18 = this.f275c;
            this.f275c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = this.f274b;
        int i20 = this.f275c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.f275c = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = d0.f8765a;
            return 4294967295L & i11;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = d0.f8765a;
        return (4294967295L & i13) | ((i12 & 4294967295L) << 32);
    }

    public void l(int i10, byte[] bArr) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        System.arraycopy(this.f274b, this.f275c, bArr, 0, i10);
        this.f275c += i10;
        a();
    }

    public int m() {
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

    public int n() {
        int i10;
        int m10 = m();
        if (m10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((m10 + 1) / 2) * i10;
    }

    public void o(int i10, byte[] bArr) {
        this.f274b = bArr;
        this.f275c = 0;
        this.d = 0;
        this.f276e = i10;
    }

    public void p(v vVar) {
        o(vVar.f8819c, vVar.f8817a);
        q(vVar.f8818b * 8);
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f275c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public boolean r(int i10) {
        if (2 <= i10 && i10 < this.f275c) {
            byte[] bArr = this.f274b;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void s() {
        switch (this.f273a) {
            case 2:
                int i10 = this.d + 1;
                this.d = i10;
                if (i10 == 8) {
                    this.d = 0;
                    this.f275c++;
                }
                a();
                return;
            default:
                int i11 = 1;
                int i12 = this.f276e + 1;
                this.f276e = i12;
                if (i12 == 8) {
                    this.f276e = 0;
                    int i13 = this.d;
                    if (r(i13 + 1)) {
                        i11 = 2;
                    }
                    this.d = i13 + i11;
                }
                a();
                return;
        }
    }

    public void t(int i10) {
        int i11;
        switch (this.f273a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.d + i12;
                this.d = i13;
                int i14 = (i10 - (i12 * 8)) + this.f276e;
                this.f276e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.d = i13 + 1;
                    this.f276e = i14 - 8;
                }
                int i15 = this.d;
                if (i15 < 0 || (i15 >= (i11 = this.f275c) && (i15 != i11 || this.f276e != 0))) {
                    z10 = false;
                }
                e2.d.g(z10);
                return;
            case 2:
                int i16 = i10 / 8;
                int i17 = this.f275c + i16;
                this.f275c = i17;
                int i18 = (i10 - (i16 * 8)) + this.d;
                this.d = i18;
                if (i18 > 7) {
                    this.f275c = i17 + 1;
                    this.d = i18 - 8;
                }
                a();
                return;
            default:
                int i19 = this.d;
                int i20 = i10 / 8;
                int i21 = i19 + i20;
                this.d = i21;
                int i22 = (i10 - (i20 * 8)) + this.f276e;
                this.f276e = i22;
                if (i22 > 7) {
                    this.d = i21 + 1;
                    this.f276e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 <= this.d) {
                        if (r(i19)) {
                            this.d++;
                            i19 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public void u(int i10) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        this.f275c += i10;
        a();
    }

    public h(byte[] bArr) {
        this.f273a = 1;
        this.f274b = bArr;
        this.f275c = bArr.length;
    }

    public h(byte[] bArr, int i10, int i11) {
        this.f273a = 3;
        this.f274b = bArr;
        this.d = i10;
        this.f275c = i11;
        this.f276e = 0;
        a();
    }

    public h(byte[] bArr, int i10) {
        this.f273a = 2;
        this.f274b = bArr;
        this.f276e = i10;
    }

    public h(int i10, int i11) {
        this.f273a = 0;
        this.f275c = i10;
        this.d = i11;
        this.f274b = new byte[(i11 * 2) - 1];
        this.f276e = 0;
    }
}
