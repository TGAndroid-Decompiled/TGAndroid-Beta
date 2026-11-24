package defpackage;
public final class uf0 extends vf0 {
    public uf0(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf0.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        gre.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            i2 += 3;
            int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i4] & 255);
            sf0 sf0Var = this.a;
            char[] cArr = sf0Var.b;
            char[] cArr2 = sf0Var.b;
            sb.append(cArr[i5 >>> 18]);
            sb.append(cArr2[(i5 >>> 12) & 63]);
            sb.append(cArr2[(i5 >>> 6) & 63]);
            sb.append(cArr2[i5 & 63]);
        }
        if (i2 < i) {
            a(i2, i - i2, sb, bArr);
        }
    }
}
