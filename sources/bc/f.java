package bc;
public final class f extends d {
    public final int f3168c;
    public final int d;
    public final int f3169e;
    public final int f3170f;

    public f(int i7, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 <= i7 && i14 + i12 <= i10) {
            this.f3168c = i7;
            this.d = i10;
            this.f3169e = i11;
            this.f3170f = i12;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override
    public final byte[] a() {
        int i7 = this.f3165a;
        int i10 = this.f3166b;
        int i11 = this.f3168c;
        if (i7 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i7 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f3170f * i11) + this.f3169e;
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
        if (i7 >= 0 && i7 < this.f3166b) {
            int i10 = this.f3165a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(null, ((i7 + this.f3170f) * this.f3168c) + this.f3169e, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "Requested row is outside the image: "));
    }
}
