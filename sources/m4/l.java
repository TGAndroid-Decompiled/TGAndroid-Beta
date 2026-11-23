package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f20749f = {0, 0, 1};
    public boolean f20750a;
    public int f20751b;
    public int f20752c;
    public int d;
    public byte[] f20753e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20750a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f20753e;
        int length = bArr2.length;
        int i12 = this.f20752c + i11;
        if (length < i12) {
            this.f20753e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f20753e, this.f20752c, i11);
        this.f20752c += i11;
    }
}
