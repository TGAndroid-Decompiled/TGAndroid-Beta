package i5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class i extends com.googlecode.mp4parser.b {
    public final int f16087f;

    public i(String str, int i7) {
        super(str);
        this.f16087f = i7;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f16087f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                h5.b.r(0, allocate);
                h5.b.q(0, allocate);
                allocate.putInt(this.f7621b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                return;
            default:
                super.getBox(writableByteChannel);
                return;
        }
    }

    @Override
    public long getSize() {
        int i7;
        switch (this.f16087f) {
            case 1:
                long b10 = b();
                long j3 = 8 + b10;
                if (b10 + 16 >= 4294967296L) {
                    i7 = 16;
                } else {
                    i7 = 8;
                }
                return j3 + i7;
            default:
                return super.getSize();
        }
    }
}
