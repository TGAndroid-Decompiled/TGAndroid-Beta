package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13850f = {0, 0, 1};
    public boolean f13851a;
    public int f13852b;
    public int f13853c;
    public int d;
    public byte[] f13854e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13851a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13854e;
        int length = bArr2.length;
        int i13 = this.f13853c + i12;
        if (length < i13) {
            this.f13854e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13854e, this.f13853c, i12);
        this.f13853c += i12;
    }
}
