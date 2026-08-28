package kb;

import j3.r0;
public final class g extends d {
    public final byte[] f14739c;
    public final int d;
    public final int f14740e;

    public g(int i9, int i10, int[] iArr) {
        super(i9, i10);
        int i11 = i9 * i10;
        if (iArr.length >= i11) {
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = iArr[i12];
                bArr[i12] = (byte) (((((i13 >> 16) & 255) + ((i13 >> 7) & 510)) + (i13 & 255)) / 4);
            }
            this.f14739c = bArr;
            this.d = i9;
            this.f14740e = i10;
            return;
        }
        throw new IllegalArgumentException("Pixel array length is less than width * height");
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.f14739c;
        int i9 = this.f14733a;
        int i10 = this.f14734b;
        int i11 = this.d;
        if (i9 == i11 && i10 == this.f14740e) {
            return bArr;
        }
        int i12 = i9 * i10;
        byte[] bArr2 = new byte[i12];
        if (i9 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i9, i9);
            i13 += i11;
        }
        return bArr2;
    }

    @Override
    public final byte[] b(int i9, byte[] bArr) {
        if (i9 >= 0 && i9 < this.f14734b) {
            int i10 = this.f14733a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(this.f14739c, i9 * this.d, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(r0.l(i9, "Requested row is outside the image: "));
    }
}
