package m4;

import java.util.Arrays;
public final class l {
    public static final byte[] f20684f = {0, 0, 1};
    public boolean f20685a;
    public int f20686b;
    public int f20687c;
    public int d;
    public byte[] f20688e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (!this.f20685a) {
            return;
        }
        int i11 = i10 - i7;
        byte[] bArr2 = this.f20688e;
        int length = bArr2.length;
        int i12 = this.f20687c + i11;
        if (length < i12) {
            this.f20688e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i7, this.f20688e, this.f20687c, i11);
        this.f20687c += i11;
    }
}
