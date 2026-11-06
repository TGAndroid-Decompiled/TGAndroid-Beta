package bc;
public abstract class d {
    public final int f3165a;
    public final int f3166b;

    public d(int i7, int i10) {
        this.f3165a = i7;
        this.f3166b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i7, byte[] bArr);

    public final String toString() {
        char c10;
        int i7 = this.f3165a;
        byte[] bArr = new byte[i7];
        int i10 = this.f3166b;
        StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i7; i12++) {
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
