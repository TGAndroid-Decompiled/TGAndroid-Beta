package defpackage;
public final class uff extends yff {
    @Override
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(td4.o(i, "Index > length: ", ", 47"));
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
