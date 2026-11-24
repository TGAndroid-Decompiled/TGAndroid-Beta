package defpackage;
public final class d51 extends f51 {
    public final int e;
    public final int f;

    public d51(byte[] bArr, int i, int i2) {
        super(bArr);
        f51.i(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(de9.k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(b00.g(i, i2, "Index > length: ", ", "));
        }
        return this.b[this.e + i];
    }

    @Override
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override
    public final int l() {
        return this.e;
    }

    @Override
    public final byte m(int i) {
        return this.b[this.e + i];
    }

    @Override
    public final int size() {
        return this.f;
    }
}
