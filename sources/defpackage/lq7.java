package defpackage;

import java.nio.ByteBuffer;
public final class lq7 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a;
    public int b;
    public int c;

    public lq7(ByteBuffer byteBuffer, byte b) {
        switch (b) {
            case 2:
                this.c = 0;
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                return;
            default:
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                return;
        }
    }

    public static void d(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(ize.a(i2));
    }

    public final int a(int i) {
        int a;
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b;
        int i3 = byteBuffer.get((this.c / 8) + i2);
        if (i3 < 0) {
            i3 += 256;
        }
        int i4 = this.c;
        int i5 = 8 - (i4 % 8);
        if (i <= i5) {
            a = ((i3 << (i4 % 8)) & 255) >> ((i5 - i) + (i4 % 8));
            this.c = i4 + i;
        } else {
            int i6 = i - i5;
            a = (a(i5) << i6) + a(i6);
        }
        byteBuffer.position(i2 + ((int) Math.ceil(this.c / 8.0d)));
        return a;
    }

    public final boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public final void c(int i, int i2) {
        int i3 = this.b;
        ByteBuffer byteBuffer = this.a;
        int i4 = this.c;
        int i5 = 8 - (i4 % 8);
        int i6 = 1;
        if (i2 <= i5) {
            int i7 = byteBuffer.get((i4 / 8) + i3);
            if (i7 < 0) {
                i7 += 256;
            }
            int i8 = i7 + (i << (i5 - i2));
            int i9 = (this.c / 8) + i3;
            if (i8 > 127) {
                i8 -= 256;
            }
            byteBuffer.put(i9, (byte) i8);
            this.c += i2;
        } else {
            int i10 = i2 - i5;
            c(i >> i10, i5);
            c(i & ((1 << i10) - 1), i10);
        }
        int i11 = this.c;
        int i12 = (i11 / 8) + i3;
        if (i11 % 8 <= 0) {
            i6 = 0;
        }
        byteBuffer.position(i12 + i6);
    }
}
