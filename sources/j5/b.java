package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class b extends a {
    public int h;
    public int f17322n;
    public long f17323r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        h5.b.p(this.f17321f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        allocate.putInt((int) 0);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f17322n, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        if (this.f7580e.equals("mlpa")) {
            allocate.putInt((int) this.f17323r);
        } else {
            allocate.putInt((int) (this.f17323r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i7;
        long b10 = b() + 28;
        if (8 + b10 >= 4294967296L) {
            i7 = 16;
        } else {
            i7 = 8;
        }
        return b10 + i7;
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f17323r + ", sampleSize=" + this.f17322n + ", channelCount=" + this.h + ", boxes=" + this.f7586b + '}';
    }
}
