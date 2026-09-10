package cc;
public abstract class d {
    public final int f4617a;
    public final int f4618b;

    public d(int i10, int i11) {
        this.f4617a = i10;
        this.f4618b = i11;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i10, byte[] bArr);

    public final String toString() {
        char c10;
        int i10 = this.f4617a;
        byte[] bArr = new byte[i10];
        int i11 = this.f4618b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr = b(i12, bArr);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = bArr[i13] & 255;
                if (i14 < 64) {
                    c10 = '#';
                } else if (i14 < 128) {
                    c10 = '+';
                } else if (i14 < 192) {
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
