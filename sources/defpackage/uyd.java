package defpackage;
public final class uyd extends pzd {
    public final int d;

    public uyd(int i, byte[] bArr) {
        super(bArr);
        pzd.k(0, i, bArr.length);
        this.d = i;
    }

    @Override
    public final byte h(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(c00.h(i, i2, "Index > length: ", ", "));
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
