package cc;
public final class f extends d {
    public final int f4735c;
    public final int d;
    public final int f4736e;
    public final int f4737f;

    public f(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 <= i10 && i15 + i13 <= i11) {
            this.f4735c = i10;
            this.d = i11;
            this.f4736e = i12;
            this.f4737f = i13;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override
    public final byte[] a() {
        int i10 = this.f4732a;
        int i11 = this.f4733b;
        int i12 = this.f4735c;
        if (i10 == i12 && i11 == this.d) {
            return null;
        }
        int i13 = i10 * i11;
        byte[] bArr = new byte[i13];
        int i14 = (this.f4737f * i12) + this.f4736e;
        if (i10 == i12) {
            System.arraycopy(null, i14, bArr, 0, i13);
            return bArr;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(null, i14, bArr, i15 * i10, i10);
            i14 += i12;
        }
        return bArr;
    }

    @Override
    public final byte[] b(int i10, byte[] bArr) {
        if (i10 >= 0 && i10 < this.f4733b) {
            int i11 = this.f4732a;
            if (bArr == null || bArr.length < i11) {
                bArr = new byte[i11];
            }
            System.arraycopy(null, ((i10 + this.f4737f) * this.f4735c) + this.f4736e, bArr, 0, i11);
            return bArr;
        }
        throw new IllegalArgumentException(i2.g.i(i10, "Requested row is outside the image: "));
    }
}
