package j4;

import java.util.Arrays;
public final class l {
    public static final byte[] f13337f = {0, 0, 1};
    public boolean f13338a;
    public int f13339b;
    public int f13340c;
    public int d;
    public byte[] f13341e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f13338a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13341e;
        int length = bArr2.length;
        int i13 = this.f13340c + i12;
        if (length < i13) {
            this.f13341e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f13341e, this.f13340c, i12);
        this.f13340c += i12;
    }
}
