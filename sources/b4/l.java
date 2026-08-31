package b4;

import java.util.Arrays;
public final class l {
    public static final byte[] f1534f = {0, 0, 1};
    public boolean f1535a;
    public int f1536b;
    public int f1537c;
    public int d;
    public byte[] f1538e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f1535a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f1538e;
        int length = bArr2.length;
        int i13 = this.f1537c + i12;
        if (length < i13) {
            this.f1538e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f1538e, this.f1537c, i12);
        this.f1537c += i12;
    }
}
