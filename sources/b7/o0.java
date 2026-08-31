package b7;
public final class o0 extends q0 {
    public final char[] f1857e;

    public o0(n0 n0Var) {
        super(n0Var, (Character) null);
        this.f1857e = new char[512];
        char[] cArr = n0Var.f1849b;
        if (cArr.length == 16) {
            for (int i10 = 0; i10 < 256; i10++) {
                char[] cArr2 = this.f1857e;
                cArr2[i10] = cArr[i10 >>> 4];
                cArr2[i10 | 256] = cArr[i10 & 15];
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void a(StringBuilder sb, byte[] bArr, int i10) {
        b.m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f1857e;
            sb.append(cArr[i12]);
            sb.append(cArr[i12 | 256]);
        }
    }
}
