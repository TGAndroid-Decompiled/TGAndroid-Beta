package h9;

import b8.zb;
public final class b extends d {
    public final char[] f14360e;

    public b(a aVar) {
        super(aVar, (Character) null);
        boolean z10;
        this.f14360e = new char[512];
        char[] cArr = aVar.f14355b;
        if (cArr.length == 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        for (int i3 = 0; i3 < 256; i3++) {
            char[] cArr2 = this.f14360e;
            cArr2[i3] = cArr[i3 >>> 4];
            cArr2[i3 | 256] = cArr[i3 & 15];
        }
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i3) {
        zb.n(0, i3, bArr.length);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f14360e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
