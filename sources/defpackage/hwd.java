package defpackage;
public final class hwd extends cxd {
    public final int d;

    public hwd(int i, byte[] bArr) {
        super(bArr);
        cxd.k(0, i, bArr.length);
        this.d = i;
    }

    @Override
    public final byte h(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(b10.g(i, i2, "Index > length: ", ", "));
        }
        return this.b[i];
    }

    @Override
    public final byte i(int i) {
        return this.b[i];
    }

    @Override
    public final int j() {
        return this.d;
    }
}
