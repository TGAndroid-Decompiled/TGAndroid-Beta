package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class b extends a {
    public int h;
    public int f9415n;
    public long f9416r;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        e5.b.p(this.f9414f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        allocate.putInt((int) 0);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f9415n, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        if (this.e.equals("mlpa")) {
            allocate.putInt((int) this.f9416r);
        } else {
            allocate.putInt((int) (this.f9416r << 16));
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
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f9416r + ", sampleSize=" + this.f9415n + ", channelCount=" + this.h + ", boxes=" + this.f7388b + '}';
    }
}
