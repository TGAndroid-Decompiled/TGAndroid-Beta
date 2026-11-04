package h9;

import b8.zb;
public final class c extends d {
    public c(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: h9.c.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        zb.n(0, i3, bArr.length);
        for (int i11 = i3; i11 >= 3; i11 -= 3) {
            int i12 = i10 + 2;
            int i13 = (bArr[i10 + 1] & 255) << 8;
            i10 += 3;
            int i14 = i13 | ((bArr[i10] & 255) << 16) | (bArr[i12] & 255);
            a aVar = this.f14361a;
            char[] cArr = aVar.f14355b;
            char[] cArr2 = aVar.f14355b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
        }
        if (i10 < i3) {
            a(sb2, bArr, i10, i3 - i10);
        }
    }
}
