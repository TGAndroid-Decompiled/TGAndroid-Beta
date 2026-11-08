package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f19701f = {0, 0, 1};
    public boolean f19702a;
    public int f19703b;
    public int f19704c;
    public int d;
    public byte[] f19705e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f19702a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f19705e;
        int length = bArr2.length;
        int i12 = this.f19704c + i11;
        if (length < i12) {
            this.f19705e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f19705e, this.f19704c, i11);
        this.f19704c += i11;
    }
}
