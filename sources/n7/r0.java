package n7;
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.r(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final byte h(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2.e.j(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
        }
        return this.f17311b[this.d + i10];
    }

    @Override
    public final byte m(int i10) {
        return this.f17311b[this.d + i10];
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return this.e;
    }

    @Override
    public final void p(int i10, byte[] bArr) {
        System.arraycopy(this.f17311b, this.d, bArr, 0, i10);
    }
}
