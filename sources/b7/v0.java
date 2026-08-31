package b7;
public final class v0 extends w0 {
    public final int d;
    public final int f1879e;

    public v0(byte[] bArr, int i10, int i11) {
        super(bArr);
        w0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.f1879e = i11;
    }

    @Override
    public final byte i(int i10) {
        int i11 = this.f1879e;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(l.d.j(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "Index > length: ", ", "));
        }
        return this.f1884b[this.d + i10];
    }

    @Override
    public final byte n(int i10) {
        return this.f1884b[this.d + i10];
    }

    @Override
    public final int o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f1879e;
    }

    @Override
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.f1884b, this.d, bArr, 0, i10);
    }
}
