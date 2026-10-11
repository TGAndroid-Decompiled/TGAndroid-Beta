package j4;

import java.util.Arrays;
public final class j {
    public static final byte[] f13830e = {0, 0, 1};
    public boolean f13831a;
    public int f13832b;
    public int f13833c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13831a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i13 = this.f13832b + i12;
        if (length < i13) {
            this.d = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.d, this.f13832b, i12);
        this.f13832b += i12;
    }
}
