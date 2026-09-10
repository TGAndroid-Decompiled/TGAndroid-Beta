package jc;

import java.lang.reflect.Array;
public final class b {
    public final byte[][] f11846a;
    public final int f11847b;
    public final int f11848c;

    public b(int i10, int i11) {
        this.f11846a = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f11847b = i10;
        this.f11848c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f11846a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f11846a[i11][i10] = (byte) i12;
    }

    public final String toString() {
        int i10 = this.f11847b;
        int i11 = this.f11848c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f11846a[i12];
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
