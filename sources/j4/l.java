package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13814f = {0, 0, 1};
    public boolean f13815a;
    public int f13816b;
    public int f13817c;
    public int d;
    public byte[] f13818e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13815a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13818e;
        int length = bArr2.length;
        int i13 = this.f13817c + i12;
        if (length < i13) {
            this.f13818e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13818e, this.f13817c, i12);
        this.f13817c += i12;
    }
}
