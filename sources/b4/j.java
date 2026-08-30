package b4;

import java.util.Arrays;
public final class j {
    public static final byte[] e = {0, 0, 1};
    public boolean f1404a;
    public int f1405b;
    public int f1406c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f1404a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i13 = this.f1405b + i12;
        if (length < i13) {
            this.d = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.d, this.f1405b, i12);
        this.f1405b += i12;
    }
}
