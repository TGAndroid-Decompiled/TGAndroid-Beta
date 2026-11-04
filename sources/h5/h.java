package h5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class h extends com.googlecode.mp4parser.b {
    public final int f14242f;

    public h(String str, int i3) {
        super(str);
        this.f14242f = i3;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f14242f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                g5.b.r(0, allocate);
                g5.b.q(0, allocate);
                allocate.putInt(this.f7977b.size());
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
        int i3;
        switch (this.f14242f) {
            case 1:
                long b10 = b();
                long j10 = 8 + b10;
                if (b10 + 16 >= 4294967296L) {
                    i3 = 16;
                } else {
                    i3 = 8;
                }
                return j10 + i3;
            default:
                return super.getSize();
        }
    }
}
