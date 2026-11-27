package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class wue {
    public static int a(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & Byte.MAX_VALUE) << (i2 * 7);
            if ((b & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    public static ArrayList b(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    remaining = a(asReadOnlyBuffer);
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new er7(i, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }
}
