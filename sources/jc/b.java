package jc;

import java.lang.reflect.Array;
public final class b {
    public final byte[][] f13623a;
    public final int f13624b;
    public final int f13625c;

    public b(int i10, int i11) {
        this.f13623a = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f13624b = i10;
        this.f13625c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f13623a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f13623a[i11][i10] = (byte) i12;
    }

    public final String toString() {
        int i10 = this.f13624b;
        int i11 = this.f13625c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f13623a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 != 0) {
                    if (b10 != 1) {
                        sb2.append("  ");
                    } else {
                        sb2.append(" 1");
                    }
                } else {
                    sb2.append(" 0");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
