package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f19698f = {0, 0, 1};
    public boolean f19699a;
    public int f19700b;
    public int f19701c;
    public int d;
    public byte[] f19702e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f19699a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f19702e;
        int length = bArr2.length;
        int i12 = this.f19701c + i11;
        if (length < i12) {
            this.f19702e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f19702e, this.f19701c, i11);
        this.f19701c += i11;
    }
}
