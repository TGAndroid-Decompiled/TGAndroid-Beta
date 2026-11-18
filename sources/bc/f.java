package bc;
public final class f extends d {
    public final int f3120c;
    public final int d;
    public final int f3121e;
    public final int f3122f;

    public f(int i7, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 <= i7 && i14 + i12 <= i10) {
            this.f3120c = i7;
            this.d = i10;
            this.f3121e = i11;
            this.f3122f = i12;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override
    public final byte[] a() {
        int i7 = this.f3117a;
        int i10 = this.f3118b;
        int i11 = this.f3120c;
        if (i7 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i7 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f3122f * i11) + this.f3121e;
        if (i7 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i7, i7);
            i13 += i11;
        }
        return bArr;
    }

    @Override
    public final byte[] b(int i7, byte[] bArr) {
        if (i7 >= 0 && i7 < this.f3118b) {
            int i10 = this.f3117a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(null, ((i7 + this.f3122f) * this.f3120c) + this.f3121e, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Requested row is outside the image: "));
    }
}
