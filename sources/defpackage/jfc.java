package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class jfc extends c4 {
    public int f;
    public int h;
    public String n;
    public final long[] r;

    public jfc(String str) {
        super(str);
        this.n = "";
        this.r = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        ile.d(1, allocate);
        ile.d(0, allocate);
        ile.d(0, allocate);
        long[] jArr = this.r;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        ile.d(this.f, allocate);
        ile.d(this.h, allocate);
        ile.b(allocate, 72.0d);
        ile.b(allocate, 72.0d);
        allocate.putInt(0);
        ile.d(1, allocate);
        allocate.put((byte) (pxe.b(this.n) & 255));
        allocate.put(pxe.a(this.n));
        int b = pxe.b(this.n);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        ile.d(24, allocate);
        ile.d(65535, allocate);
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
