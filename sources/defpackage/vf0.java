package defpackage;
public final class vf0 extends xf0 {
    public final char[] e;

    public vf0(uf0 uf0Var) {
        super(uf0Var, (Character) null);
        boolean z;
        this.e = new char[512];
        char[] cArr = uf0Var.b;
        if (cArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        yve.n(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
