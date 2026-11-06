package m4;

import java.util.Arrays;
public final class j {
    public static final byte[] f19678e = {0, 0, 1};
    public boolean f19679a;
    public int f19680b;
    public int f19681c;
    public byte[] d;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f19679a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i12 = this.f19680b + i11;
        if (length < i12) {
            this.d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.d, this.f19680b, i11);
        this.f19680b += i11;
    }
}
