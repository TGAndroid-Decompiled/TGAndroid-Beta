package defpackage;

import java.nio.ByteBuffer;
public abstract class lle {
    public static int a(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            if (i4 == 0) {
                i3++;
            } else {
                i3 = 0;
            }
            i++;
        }
        return i2;
    }
}
