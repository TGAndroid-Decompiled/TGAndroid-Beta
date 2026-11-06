package bc;
public final class g extends d {
    public final byte[] f3171c;
    public final int d;
    public final int f3172e;

    public g(int i7, int i10, int[] iArr) {
        super(i7, i10);
        int i11 = i7 * i10;
        if (iArr.length >= i11) {
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = iArr[i12];
                bArr[i12] = (byte) (((((i13 >> 16) & 255) + ((i13 >> 7) & 510)) + (i13 & 255)) / 4);
            }
            this.f3171c = bArr;
            this.d = i7;
            this.f3172e = i10;
            return;
        }
        throw new IllegalArgumentException("Pixel array length is less than width * height");
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.f3171c;
        int i7 = this.f3165a;
        int i10 = this.f3166b;
        int i11 = this.d;
        if (i7 == i11 && i10 == this.f3172e) {
            return bArr;
        }
        int i12 = i7 * i10;
        byte[] bArr2 = new byte[i12];
        if (i7 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i7, i7);
            i13 += i11;
        }
        return bArr2;
    }

    @Override
    public final byte[] b(int i7, byte[] bArr) {
        if (i7 >= 0 && i7 < this.f3166b) {
            int i10 = this.f3165a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(this.f3171c, i7 * this.d, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Requested row is outside the image: "));
    }
}
