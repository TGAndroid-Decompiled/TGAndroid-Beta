package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class jhc extends c4 {
    public int f;
    public int h;
    public String n;
    public final long[] r;

    public jhc(String str) {
        super(str);
        this.n = "";
        this.r = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        kne.d(1, allocate);
        kne.d(0, allocate);
        kne.d(0, allocate);
        long[] jArr = this.r;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        kne.d(this.f, allocate);
        kne.d(this.h, allocate);
        kne.b(allocate, 72.0d);
        kne.b(allocate, 72.0d);
        allocate.putInt(0);
        kne.d(1, allocate);
        allocate.put((byte) (rze.b(this.n) & 255));
        allocate.put(rze.a(this.n));
        int b = rze.b(this.n);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        kne.d(24, allocate);
        kne.d(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i;
        long b = b();
        long j = 78 + b;
        if (b + 86 >= 4294967296L) {
            i = 16;
        } else {
            i = 8;
        }
        return j + i;
    }
}
