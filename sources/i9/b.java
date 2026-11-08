package i9;

import a8.ia;
public final class b extends d {
    public final char[] f15406e;

    public b(a aVar) {
        super(aVar, (Character) null);
        boolean z9;
        this.f15406e = new char[512];
        char[] cArr = aVar.f15401b;
        if (cArr.length == 16) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.f15406e;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | 256] = cArr[i7 & 15];
        }
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i7) {
        ia.n(0, i7, bArr.length);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f15406e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
