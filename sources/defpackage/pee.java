package defpackage;
public final class pee extends gfe {
    public final int d;
    public final int e;

    public pee(byte[] bArr, int i, int i2) {
        super(bArr);
        gfe.n(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override
    public final byte h(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(c00.h(i, i2, "Index > length: ", ", "));
        }
        return this.b[this.d + i];
    }

    @Override
    public final byte i(int i) {
        return this.b[this.d + i];
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.e;
    }

    @Override
    public final void l(int i, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
