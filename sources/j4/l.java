package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f9515f = {0, 0, 1};
    public boolean f9516a;
    public int f9517b;
    public int f9518c;
    public int d;
    public byte[] e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f9516a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i13 = this.f9518c + i12;
        if (length < i13) {
            this.e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.e, this.f9518c, i12);
        this.f9518c += i12;
    }
}
