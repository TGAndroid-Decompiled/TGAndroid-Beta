package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f20653f = {0, 0, 1};
    public boolean f20654a;
    public int f20655b;
    public int f20656c;
    public int d;
    public byte[] f20657e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20654a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f20657e;
        int length = bArr2.length;
        int i12 = this.f20656c + i11;
        if (length < i12) {
            this.f20657e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f20657e, this.f20656c, i11);
        this.f20656c += i11;
    }
}
