package l4;

import java.util.Arrays;
public final class l {
    public static final byte[] f17865f = {0, 0, 1};
    public boolean f17866a;
    public int f17867b;
    public int f17868c;
    public int d;
    public byte[] f17869e;

    public final void a(int i3, int i10, byte[] bArr) {
        if (!this.f17866a) {
            return;
        }
        int i11 = i10 - i3;
        byte[] bArr2 = this.f17869e;
        int length = bArr2.length;
        int i12 = this.f17868c + i11;
        if (length < i12) {
            this.f17869e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i3, this.f17869e, this.f17868c, i11);
        this.f17868c += i11;
    }
}
