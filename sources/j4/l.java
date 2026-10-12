package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13848f = {0, 0, 1};
    public boolean f13849a;
    public int f13850b;
    public int f13851c;
    public int d;
    public byte[] f13852e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13849a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13852e;
        int length = bArr2.length;
        int i13 = this.f13851c + i12;
        if (length < i13) {
            this.f13852e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13852e, this.f13851c, i12);
        this.f13851c += i12;
    }
}
