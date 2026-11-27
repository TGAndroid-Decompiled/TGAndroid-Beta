package defpackage;
public final class jif extends nif {
    @Override
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(qd4.n(i, "Index > length: ", ", 47"));
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
