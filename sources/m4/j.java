package m4;

import java.util.Arrays;
public final class j {
    public static final byte[] f20667e = {0, 0, 1};
    public boolean f20668a;
    public int f20669b;
    public int f20670c;
    public byte[] d;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20668a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i12 = this.f20669b + i11;
        if (length < i12) {
            this.d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.d, this.f20669b, i11);
        this.f20669b += i11;
    }
}
