package defpackage;
public final class v6e extends m7e {
    public final char[] e;

    public v6e(p6e p6eVar) {
        super(p6eVar, (Character) null);
        this.e = new char[512];
        if (p6eVar.b.length == 16) {
            for (int i = 0; i < 256; i++) {
                char[] cArr = this.e;
                char[] cArr2 = p6eVar.b;
                cArr[i] = cArr2[i >>> 4];
                cArr[i | 256] = cArr2[i & 15];
            }
            return;
        }
        sc8.e();
        throw null;
    }

    @Override
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        k0f.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
