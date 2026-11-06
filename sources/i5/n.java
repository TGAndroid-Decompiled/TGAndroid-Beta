package i5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class n extends com.googlecode.mp4parser.b {
    public n() {
        super("stsd");
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        h5.b.r(0, allocate);
        h5.b.q(0, allocate);
        allocate.putInt(this.f7922b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i7;
        long b10 = b();
        long j3 = 8 + b10;
        if (b10 + 16 >= 4294967296L) {
            i7 = 16;
        } else {
            i7 = 8;
        }
        return j3 + i7;
    }
}
