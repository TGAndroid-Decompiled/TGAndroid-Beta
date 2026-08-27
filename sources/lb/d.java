package lb;

public abstract class d {

    public final int f15514a;

    public final int f15515b;

    public d(int i10, int i11) {
        this.f15514a = i10;
        this.f15515b = i11;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i10, byte[] bArr);

    public final String toString() {
        char c10;
        int i10 = this.f15514a;
        byte[] bArrB = new byte[i10];
        int i11 = this.f15515b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            bArrB = b(i12, bArrB);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = bArrB[i13] & 255;
                if (i14 < 64) {
                    c10 = '#';
                } else if (i14 < 128) {
                    c10 = '+';
                } else {
                    c10 = i14 < 192 ? '.' : ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
