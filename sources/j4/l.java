package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13813f = {0, 0, 1};
    public boolean f13814a;
    public int f13815b;
    public int f13816c;
    public int d;
    public byte[] f13817e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13814a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13817e;
        int length = bArr2.length;
        int i13 = this.f13816c + i12;
        if (length < i13) {
            this.f13817e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13817e, this.f13816c, i12);
        this.f13816c += i12;
    }
}
