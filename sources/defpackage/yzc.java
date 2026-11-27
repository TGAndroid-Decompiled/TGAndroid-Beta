package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class yzc {
    public final ByteBuffer a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int[] e;
    public final int[] f;
    public final String[] g;

    public yzc(ByteBuffer byteBuffer, int i, boolean z, int i2, int[] iArr, int[] iArr2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = iArr;
        this.f = iArr2;
        this.g = new String[iArr.length];
    }

    public static IllegalArgumentException a() {
        return new IllegalArgumentException("Display list");
    }

    public static yzc b(byte[] bArr) {
        boolean z;
        if (bArr.length >= 24 && (bArr.length & 3) == 0) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            if (order.getInt(0) == 1279547220 && order.getInt(4) == 1) {
                int i = order.getInt(8);
                int i2 = order.getInt(12);
                long j = order.getInt(16) << 2;
                if (i >= 0 && i <= 200000 && j >= 20 && 4 + j <= bArr.length) {
                    int i3 = (int) j;
                    int i4 = order.getInt(i3);
                    int i5 = i3 + 4;
                    if (i4 >= 0 && i4 <= i && i4 <= (bArr.length - i5) / 4) {
                        int[] iArr = new int[i4];
                        int i6 = i5;
                        int[] iArr2 = new int[i4];
                        for (int i7 = 0; i7 < i4; i7++) {
                            int i8 = i6 + 4;
                            if (i8 <= bArr.length) {
                                int i9 = order.getInt(i6);
                                if (i9 >= 0 && i9 <= (bArr.length - i6) - 4) {
                                    iArr[i7] = i8;
                                    iArr2[i7] = i9;
                                    i6 += ((i9 + 3) & (-4)) + 4;
                                } else {
                                    throw a();
                                }
                            } else {
                                throw a();
                            }
                        }
                        if (i6 <= bArr.length) {
                            if ((i2 & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return new yzc(order, i, z, i3, iArr, iArr2);
                        }
                        throw a();
                    }
                    throw a();
                }
                throw a();
            }
            throw a();
        }
        throw a();
    }
}
