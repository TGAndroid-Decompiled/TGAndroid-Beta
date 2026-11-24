package defpackage;
public final class ky8 extends gg6 {
    public final byte[] c;
    public final int d;
    public final int e;

    public ky8(int i, int i2, int[] iArr) {
        super(i, i2);
        int i3 = i * i2;
        if (iArr.length >= i3) {
            byte[] bArr = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr[i4];
                bArr[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
            }
            this.c = bArr;
            this.d = i;
            this.e = i2;
            return;
        }
        w26.j("Pixel array length is less than width * height");
        throw null;
    }

    @Override
    public final byte[] a() {
        byte[] bArr = this.c;
        int i = this.a;
        int i2 = this.b;
        int i3 = this.d;
        if (i == i3 && i2 == this.e) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        if (i == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    @Override
    public final byte[] b(int i, byte[] bArr) {
        if (i >= 0 && i < this.b) {
            int i2 = this.a;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            System.arraycopy(this.c, i * this.d, bArr, 0, i2);
            return bArr;
        }
        w26.j(de9.k(i, "Requested row is outside the image: "));
        return null;
    }
}
