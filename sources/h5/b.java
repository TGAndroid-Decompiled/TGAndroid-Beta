package h5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class b extends a {
    public int h;
    public int f12611n;
    public long f12612r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        f5.b.p(this.f12610f, allocate);
        f5.b.p(0, allocate);
        f5.b.p(0, allocate);
        allocate.putInt((int) 0);
        f5.b.p(this.h, allocate);
        f5.b.p(this.f12611n, allocate);
        f5.b.p(0, allocate);
        f5.b.p(0, allocate);
        if (this.e.equals("mlpa")) {
            allocate.putInt((int) this.f12612r);
        } else {
            allocate.putInt((int) (this.f12612r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i10;
        long b10 = b() + 28;
        if (8 + b10 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return b10 + i10;
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f12612r + ", sampleSize=" + this.f12611n + ", channelCount=" + this.h + ", boxes=" + this.f7815b + '}';
    }
}
