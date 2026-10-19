package f9;

import v7.u6;
public final class b extends d {
    public final char[] e;

    public b(a aVar) {
        super(aVar, (Character) null);
        boolean z10;
        this.e = new char[512];
        char[] cArr = aVar.f10507b;
        if (cArr.length == 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        u6.n(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
