package defpackage;
public final class tdf extends xdf {
    @Override
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(de9.k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(tb4.n(i, "Index > length: ", ", 47"));
        }
        return this.b[i];
    }

    @Override
    public final byte i(int i) {
        return this.b[i];
    }

    @Override
    public final int j() {
        return 47;
    }
}
