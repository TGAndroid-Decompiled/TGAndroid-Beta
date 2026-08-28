package kb;
public abstract class d {
    public final int f14733a;
    public final int f14734b;

    public d(int i9, int i10) {
        this.f14733a = i9;
        this.f14734b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i9, byte[] bArr);

    public final String toString() {
        char c10;
        int i9 = this.f14733a;
        byte[] bArr = new byte[i9];
        int i10 = this.f14734b;
        StringBuilder sb2 = new StringBuilder((i9 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = bArr[i12] & 255;
                if (i13 < 64) {
                    c10 = '#';
                } else if (i13 < 128) {
                    c10 = '+';
                } else if (i13 < 192) {
                    c10 = '.';
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
