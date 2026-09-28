package n7;
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final byte i(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(hg.c.h(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a4.a.m(i10, i11, "Index > length: ", ", "));
        }
        return this.f15391b[this.d + i10];
    }

    @Override
    public final byte n(int i10) {
        return this.f15391b[this.d + i10];
    }

    @Override
    public final int o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.e;
    }

    @Override
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.f15391b, this.d, bArr, 0, i10);
    }
}
