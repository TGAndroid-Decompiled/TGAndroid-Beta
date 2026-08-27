package lb;

public final class g extends d {

    public final byte[] f15520c;
    public final int d;

    public final int f15521e;

    public g(int i10, int i11, int[] iArr) {
        super(i10, i11);
        int i12 = i10 * i11;
        if (iArr.length < i12) {
            throw new IllegalArgumentException("Pixel array length is less than width * height");
        }
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            bArr[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & 510)) + (i14 & 255)) / 4);
        }
        this.f15520c = bArr;
        this.d = i10;
        this.f15521e = i11;
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.f15520c;
        int i10 = this.f15514a;
        int i11 = this.f15515b;
        int i12 = this.d;
        if (i10 == i12 && i11 == this.f15521e) {
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
        if (i10 < 0 || i10 >= this.f15515b) {
            throw new IllegalArgumentException(i0.a.k(i10, "Requested row is outside the image: "));
        }
        int i11 = this.f15514a;
        if (bArr == null || bArr.length < i11) {
            bArr = new byte[i11];
        }
        System.arraycopy(this.f15520c, i10 * this.d, bArr, 0, i11);
        return bArr;
    }
}
