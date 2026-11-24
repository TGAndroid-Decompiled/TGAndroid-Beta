package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class dp9 extends a2 {
    public dp9() {
        super("stsd");
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        ile.f(0, allocate);
        ile.e(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i;
        long b = b();
        long j = 8 + b;
        if (b + 16 >= 4294967296L) {
            i = 16;
        } else {
            i = 8;
        }
        return j + i;
    }
}
