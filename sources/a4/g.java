package a4;

import e2.m0;
import e2.x;
import v7.u6;
public final class g {
    public final int f259a;
    public byte[] f260b;
    public int f261c;
    public int d;
    public int e;

    public g() {
        this.f259a = 2;
        this.f260b = m0.f8254b;
    }

    public void a() {
        boolean z10;
        int i10;
        int i11 = this.f261c;
        if (i11 >= 0 && (i11 < (i10 = this.e) || (i11 == i10 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
    }

    public int b() {
        return ((this.e - this.f261c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f261c++;
        a();
    }

    public int d() {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return this.f261c;
    }

    public int e() {
        return (this.f261c * 8) + this.d;
    }

    public boolean f() {
        boolean z10;
        boolean z11;
        switch (this.f259a) {
            case 1:
                if ((((this.f260b[this.d] & 255) >> this.e) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o(1);
                return z10;
            default:
                if ((this.f260b[this.f261c] & (128 >> this.d)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n();
                return z11;
        }
    }

    public int g(int i10) {
        switch (this.f259a) {
            case 1:
                int i11 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr = this.f260b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i10) {
                    i13 |= (bArr[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                o(i10);
                return i14;
            default:
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
                        byte[] bArr2 = this.f260b;
                        int i18 = this.f261c;
                        this.f261c = i18 + 1;
                        i15 |= (bArr2[i18] & 255) << i17;
                    } else {
                        byte[] bArr3 = this.f260b;
                        int i19 = this.f261c;
                        int i20 = ((-1) >>> (32 - i10)) & (i15 | ((bArr3[i19] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.d = 0;
                            this.f261c = i19 + 1;
                        }
                        a();
                        return i20;
                    }
                }
        }
    }

    public void h(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f260b;
            int i13 = this.f261c;
            int i14 = i13 + 1;
            this.f261c = i14;
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
            byte[] bArr3 = this.f260b;
            int i18 = this.f261c;
            this.f261c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = this.f260b;
        int i20 = this.f261c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.f261c = i20 + 1;
        }
        a();
    }

    public long i(int i10) {
        if (i10 <= 32) {
            int g10 = g(i10);
            String str = m0.f8253a;
            return 4294967295L & g10;
        }
        int g11 = g(i10 - 32);
        int g12 = g(32);
        String str2 = m0.f8253a;
        return (4294967295L & g12) | ((g11 & 4294967295L) << 32);
    }

    public void j(int i10, byte[] bArr) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        System.arraycopy(this.f260b, this.f261c, bArr, 0, i10);
        this.f261c += i10;
        a();
    }

    public void k(int i10, byte[] bArr) {
        this.f260b = bArr;
        this.f261c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void l(x xVar) {
        k(xVar.f8294c, xVar.f8292a);
        m(xVar.f8293b * 8);
    }

    public void m(int i10) {
        int i11 = i10 / 8;
        this.f261c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public void n() {
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            this.f261c++;
        }
        a();
    }

    public void o(int i10) {
        int i11;
        switch (this.f259a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.d + i12;
                this.d = i13;
                int i14 = (i10 - (i12 * 8)) + this.e;
                this.e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.d = i13 + 1;
                    this.e = i14 - 8;
                }
                int i15 = this.d;
                if (i15 < 0 || (i15 >= (i11 = this.f261c) && (i15 != i11 || this.e != 0))) {
                    z10 = false;
                }
                u6.p(z10);
                return;
            default:
                int i16 = i10 / 8;
                int i17 = this.f261c + i16;
                this.f261c = i17;
                int i18 = (i10 - (i16 * 8)) + this.d;
                this.d = i18;
                if (i18 > 7) {
                    this.f261c = i17 + 1;
                    this.d = i18 - 8;
                }
                a();
                return;
        }
    }

    public void p(int i10) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.f261c += i10;
        a();
    }

    public g(byte[] bArr) {
        this.f259a = 1;
        this.f260b = bArr;
        this.f261c = bArr.length;
    }

    public g(byte[] bArr, int i10) {
        this.f259a = 2;
        this.f260b = bArr;
        this.e = i10;
    }

    public g(int i10, int i11) {
        this.f259a = 0;
        this.f261c = i10;
        this.d = i11;
        this.f260b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
