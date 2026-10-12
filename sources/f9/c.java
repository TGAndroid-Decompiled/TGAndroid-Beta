package f9;

import v7.u6;
public final class c extends d {
    public c(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: f9.c.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        u6.n(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = (bArr[i11 + 1] & 255) << 8;
            i11 += 3;
            int i15 = i14 | ((bArr[i11] & 255) << 16) | (bArr[i13] & 255);
            a aVar = this.f9068a;
            char[] cArr = aVar.f9064b;
            char[] cArr2 = aVar.f9064b;
            sb2.append(cArr[i15 >>> 18]);
            sb2.append(cArr2[(i15 >>> 12) & 63]);
            sb2.append(cArr2[(i15 >>> 6) & 63]);
            sb2.append(cArr2[i15 & 63]);
        }
        if (i11 < i10) {
            a(sb2, bArr, i11, i10 - i11);
        }
    }
}
