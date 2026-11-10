package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f19706f = {0, 0, 1};
    public boolean f19707a;
    public int f19708b;
    public int f19709c;
    public int d;
    public byte[] f19710e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f19707a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f19710e;
        int length = bArr2.length;
        int i12 = this.f19709c + i11;
        if (length < i12) {
            this.f19710e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f19710e, this.f19709c, i11);
        this.f19709c += i11;
    }
}
