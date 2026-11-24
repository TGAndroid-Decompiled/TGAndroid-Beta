package defpackage;
public final class c9e extends n9e {
    public c9e(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9e.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        m2f.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
            q8e q8eVar = this.a;
            char[] cArr = q8eVar.b;
            char[] cArr2 = q8eVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }
}
