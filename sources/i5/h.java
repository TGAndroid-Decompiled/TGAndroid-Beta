package i5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class h extends com.googlecode.mp4parser.b {
    public final int f15291f;

    public h(String str, int i7) {
        super(str);
        this.f15291f = i7;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f15291f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                h5.b.r(0, allocate);
                h5.b.q(0, allocate);
                allocate.putInt(this.f7925b.size());
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
        switch (this.f15291f) {
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
