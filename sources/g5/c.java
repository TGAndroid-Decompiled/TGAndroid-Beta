package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f9404n;
    public double f9405r;
    public double f9406s;
    public int v;
    public String f9407w;
    public int f9408x;
    public final long[] f9409y;

    public c(String str) {
        super(str);
        this.f9405r = 72.0d;
        this.f9406s = 72.0d;
        this.v = 1;
        this.f9407w = "";
        this.f9408x = 24;
        this.f9409y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f9401f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.f9409y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f9404n, allocate);
        e5.b.n(allocate, this.f9405r);
        e5.b.n(allocate, this.f9406s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.f9407w) & 255));
        allocate.put(e5.b.b(this.f9407w));
        int l4 = e5.b.l(this.f9407w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f9408x, allocate);
        e5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i10;
        long b10 = b();
        long j3 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return j3 + i10;
    }
}
