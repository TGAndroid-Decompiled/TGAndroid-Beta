package f7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
public abstract class x {
    public static p1.b a(MappedByteBuffer mappedByteBuffer) {
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i9 = duplicate.getShort() & 65535;
        if (i9 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j10 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                duplicate.position(duplicate.position() + ((int) (j10 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j11 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j11; i12++) {
                    int i13 = duplicate.getInt();
                    long j12 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j12 + j10));
                        ?? cVar = new p1.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.d = duplicate;
                        cVar.f45335a = position;
                        int i14 = position - duplicate.getInt(position);
                        cVar.f45336b = i14;
                        cVar.f45337c = ((ByteBuffer) cVar.d).getShort(i14);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
