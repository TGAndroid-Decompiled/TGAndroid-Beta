package defpackage;
public abstract class gi6 {
    public final int a;
    public final int b;

    public gi6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i, byte[] bArr);

    public final String toString() {
        char c;
        int i = this.a;
        byte[] bArr = new byte[i];
        int i2 = this.b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = b(i3, bArr);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                if (i5 < 64) {
                    c = '#';
                } else if (i5 < 128) {
                    c = '+';
                } else if (i5 < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
