package a8;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
public abstract class u6 {
    public static s1.b a(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i7) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j3 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j10 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j10; i12++) {
                    int i13 = duplicate.getInt();
                    long j11 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j11 + j3));
                        ?? xVar = new r0.x();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        xVar.d = duplicate;
                        xVar.f54143a = position;
                        int i14 = position - duplicate.getInt(position);
                        xVar.f54144b = i14;
                        xVar.f54145c = ((ByteBuffer) xVar.d).getShort(i14);
                        return xVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
