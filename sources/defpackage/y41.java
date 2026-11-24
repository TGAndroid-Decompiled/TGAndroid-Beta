package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
public final class y41 implements ByteChannel {
    public ByteBuffer a;

    @Override
    public final boolean isOpen() {
        return true;
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) byteBuffer2.duplicate().limit(byteBuffer.remaining() + byteBuffer2.position()));
        byteBuffer2.position(byteBuffer2.position() + remaining);
        return remaining;
    }

    @Override
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.a.put(byteBuffer);
        return remaining;
    }

    @Override
    public final void close() {
    }
}
