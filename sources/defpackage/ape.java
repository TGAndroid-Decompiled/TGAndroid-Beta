package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
public abstract class ape {
    public static pd7 a(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        ?? eebVar = new eeb();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        eebVar.b = duplicate;
                        eebVar.a = position;
                        int i6 = position - duplicate.getInt(position);
                        eebVar.c = i6;
                        eebVar.d = eebVar.b.getShort(i6);
                        return eebVar;
                    }
                }
            }
            k93.f("Cannot read metadata.");
            return null;
        }
        k93.f("Cannot read metadata.");
        return null;
    }
}
