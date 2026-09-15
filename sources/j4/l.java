package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f12719f = {0, 0, 1};
    public boolean f12720a;
    public int f12721b;
    public int f12722c;
    public int d;
    public byte[] e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f12720a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i13 = this.f12722c + i12;
        if (length < i13) {
            this.e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.e, this.f12722c, i12);
        this.f12722c += i12;
    }
}
