package f5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class h extends com.googlecode.mp4parser.b {
    public final int f10410f;

    public h(String str, int i10) {
        super(str);
        this.f10410f = i10;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f10410f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                e5.b.r(0, allocate);
                e5.b.q(0, allocate);
                allocate.putInt(this.f7713b.size());
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
        int i10;
        switch (this.f10410f) {
            case 1:
                long b10 = b();
                long j10 = 8 + b10;
                if (b10 + 16 >= 4294967296L) {
                    i10 = 16;
                } else {
                    i10 = 8;
                }
                return j10 + i10;
            default:
                return super.getSize();
        }
    }
}
