package kb;

import j3.r0;
public final class f extends d {
    public final int f14736c;
    public final int d;
    public final int f14737e;
    public final int f14738f;

    public f(int i9, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 <= i9 && i14 + i12 <= i10) {
            this.f14736c = i9;
            this.d = i10;
            this.f14737e = i11;
            this.f14738f = i12;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override
    public final byte[] a() {
        int i9 = this.f14733a;
        int i10 = this.f14734b;
        int i11 = this.f14736c;
        if (i9 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i9 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f14738f * i11) + this.f14737e;
        if (i9 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i9, i9);
            i13 += i11;
        }
        return bArr;
    }

    @Override
    public final byte[] b(int i9, byte[] bArr) {
        if (i9 >= 0 && i9 < this.f14734b) {
            int i10 = this.f14733a;
            if (bArr == null || bArr.length < i10) {
                bArr = new byte[i10];
            }
            System.arraycopy(null, ((i9 + this.f14738f) * this.f14736c) + this.f14737e, bArr, 0, i10);
            return bArr;
        }
        throw new IllegalArgumentException(r0.l(i9, "Requested row is outside the image: "));
    }
}
