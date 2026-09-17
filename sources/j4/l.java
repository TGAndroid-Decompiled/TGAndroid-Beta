package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13363f = {0, 0, 1};
    public boolean f13364a;
    public int f13365b;
    public int f13366c;
    public int d;
    public byte[] f13367e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13364a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13367e;
        int length = bArr2.length;
        int i13 = this.f13366c + i12;
        if (length < i13) {
            this.f13367e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13367e, this.f13366c, i12);
        this.f13366c += i12;
    }
}
