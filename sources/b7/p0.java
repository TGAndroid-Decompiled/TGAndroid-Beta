package b7;
public final class p0 extends q0 {
    public p0(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: b7.p0.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void a(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        b.m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            n0 n0Var = this.f1720a;
            char[] cArr = n0Var.f1708b;
            char[] cArr2 = n0Var.f1708b;
            sb.append(cArr[i13 >>> 18]);
            sb.append(cArr2[(i13 >>> 12) & 63]);
            sb.append(cArr2[(i13 >>> 6) & 63]);
            sb.append(cArr2[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            b(sb, bArr, i11, i10 - i11);
        }
    }
}
