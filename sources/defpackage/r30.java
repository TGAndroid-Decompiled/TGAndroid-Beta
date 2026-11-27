package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class r30 extends d4 {
    public int f;
    public byte h;
    public long n;

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        aqe.d(1, allocate);
        aqe.d(0, allocate);
        aqe.d(0, allocate);
        allocate.putInt(0);
        aqe.d(this.f, allocate);
        aqe.d(this.h, allocate);
        aqe.d(0, allocate);
        aqe.d(0, allocate);
        boolean equals = this.e.equals("mlpa");
        long j = this.n;
        if (equals) {
            allocate.putInt((int) j);
        } else {
            allocate.putInt((int) (j << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i;
        long b = b();
        long j = 28 + b;
        if (b + 36 >= 4294967296L) {
            i = 16;
        } else {
            i = 8;
        }
        return j + i;
    }

    @Override
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.n + ", sampleSize=" + ((int) this.h) + ", channelCount=" + this.f + ", boxes=" + this.b + '}';
    }
}
