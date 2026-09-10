package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f8550n;
    public double f8551r;
    public double f8552s;
    public int v;
    public String f8553w;
    public int f8554x;
    public final long[] f8555y;

    public c(String str) {
        super(str);
        this.f8551r = 72.0d;
        this.f8552s = 72.0d;
        this.v = 1;
        this.f8553w = "";
        this.f8554x = 24;
        this.f8555y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f8547f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.f8555y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f8550n, allocate);
        e5.b.n(allocate, this.f8551r);
        e5.b.n(allocate, this.f8552s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.f8553w) & 255));
        allocate.put(e5.b.b(this.f8553w));
        int l4 = e5.b.l(this.f8553w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f8554x, allocate);
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
