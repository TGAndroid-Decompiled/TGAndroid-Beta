package n7;
public final class m0 extends n0 {
    public m0(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: n7.m0.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        a.m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            k0 k0Var = this.f13979a;
            char[] cArr = k0Var.f13969b;
            char[] cArr2 = k0Var.f13969b;
            sb2.append(cArr[i13 >>> 18]);
            sb2.append(cArr2[(i13 >>> 12) & 63]);
            sb2.append(cArr2[(i13 >>> 6) & 63]);
            sb2.append(cArr2[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            b(sb2, bArr, i11, i10 - i11);
        }
    }
}
