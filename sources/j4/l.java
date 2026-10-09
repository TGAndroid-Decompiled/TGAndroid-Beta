package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13851f = {0, 0, 1};
    public boolean f13852a;
    public int f13853b;
    public int f13854c;
    public int d;
    public byte[] f13855e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13852a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13855e;
        int length = bArr2.length;
        int i13 = this.f13854c + i12;
        if (length < i13) {
            this.f13855e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13855e, this.f13854c, i12);
        this.f13854c += i12;
    }
}
