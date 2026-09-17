package j4;

import java.util.Arrays;
public final class j {
    public static final byte[] f13343e = {0, 0, 1};
    public boolean f13344a;
    public int f13345b;
    public int f13346c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13344a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i13 = this.f13345b + i12;
        if (length < i13) {
            this.d = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.d, this.f13345b, i12);
        this.f13345b += i12;
    }
}
