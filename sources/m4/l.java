package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f20656f = {0, 0, 1};
    public boolean f20657a;
    public int f20658b;
    public int f20659c;
    public int d;
    public byte[] f20660e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20657a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f20660e;
        int length = bArr2.length;
        int i12 = this.f20659c + i11;
        if (length < i12) {
            this.f20660e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f20660e, this.f20659c, i11);
        this.f20659c += i11;
    }
}
