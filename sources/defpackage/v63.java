package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class v63 extends b2 {
    public final byte f;

    public v63(String str, byte b) {
        super(str);
        this.f = b;
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                aqe.f(0, allocate);
                aqe.e(0, allocate);
                allocate.putInt(this.b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                return;
            default:
                super.getBox(writableByteChannel);
                return;
        }
    }

    @Override
    public final long getSize() {
        int i;
        switch (this.f) {
            case 1:
                long b = b();
                long j = 8 + b;
                if (b + 16 >= 4294967296L) {
                    i = 16;
                } else {
                    i = 8;
                }
                return j + i;
            default:
                return super.getSize();
        }
    }
}
