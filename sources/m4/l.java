package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f20295f = {0, 0, 1};
    public boolean f20296a;
    public int f20297b;
    public int f20298c;
    public int d;
    public byte[] f20299e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20296a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f20299e;
        int length = bArr2.length;
        int i12 = this.f20298c + i11;
        if (length < i12) {
            this.f20299e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f20299e, this.f20298c, i11);
        this.f20298c += i11;
    }
}
