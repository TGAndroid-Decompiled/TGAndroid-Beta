package cc;
public final class g extends d {
    public final byte[] f4622c;
    public final int d;
    public final int e;

    public g(int i10, int i11, int[] iArr) {
        super(i10, i11);
        int i12 = i10 * i11;
        if (iArr.length >= i12) {
            byte[] bArr = new byte[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = iArr[i13];
                bArr[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & 510)) + (i14 & 255)) / 4);
            }
            this.f4622c = bArr;
            this.d = i10;
            this.e = i11;
            return;
        }
        throw new IllegalArgumentException("Pixel array length is less than width * height");
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.f4622c;
        int i10 = this.f4617a;
        int i11 = this.f4618b;
        int i12 = this.d;
        if (i10 == i12 && i11 == this.e) {
            return bArr;
        }
        int i13 = i10 * i11;
        byte[] bArr2 = new byte[i13];
        if (i10 == i12) {
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            return bArr2;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(bArr, i14, bArr2, i15 * i10, i10);
            i14 += i12;
        }
        return bArr2;
    }

    @Override
    public final byte[] b(int i10, byte[] bArr) {
        if (i10 >= 0 && i10 < this.f4618b) {
            int i11 = this.f4617a;
            if (bArr == null || bArr.length < i11) {
                bArr = new byte[i11];
            }
            System.arraycopy(this.f4622c, i10 * this.d, bArr, 0, i11);
            return bArr;
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Requested row is outside the image: "));
    }
}
