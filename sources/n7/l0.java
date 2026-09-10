package n7;
public final class l0 extends n0 {
    public final char[] e;

    public l0(k0 k0Var) {
        super(k0Var, (Character) null);
        this.e = new char[512];
        char[] cArr = k0Var.f13969b;
        if (cArr.length == 16) {
            for (int i10 = 0; i10 < 256; i10++) {
                char[] cArr2 = this.e;
                cArr2[i10] = cArr[i10 >>> 4];
                cArr2[i10 | 256] = cArr[i10 & 15];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        a.m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
