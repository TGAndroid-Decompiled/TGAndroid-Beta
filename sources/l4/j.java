package l4;

import java.util.Arrays;
public final class j {
    public static final byte[] f17845e = {0, 0, 1};
    public boolean f17846a;
    public int f17847b;
    public int f17848c;
    public byte[] d;

    public final void a(int i3, int i10, byte[] bArr) {
        if (!this.f17846a) {
            return;
        }
        int i11 = i10 - i3;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i12 = this.f17847b + i11;
        if (length < i12) {
            this.d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i3, this.d, this.f17847b, i11);
        this.f17847b += i11;
    }
}
