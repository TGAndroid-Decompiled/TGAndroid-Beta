package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f10378n;
    public double f10379r;
    public double f10380s;
    public int v;
    public String f10381w;
    public int f10382x;
    public final long[] f10383y;

    public c(String str) {
        super(str);
        this.f10379r = 72.0d;
        this.f10380s = 72.0d;
        this.v = 1;
        this.f10381w = "";
        this.f10382x = 24;
        this.f10383y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f10375f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.f10383y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f10378n, allocate);
        e5.b.n(allocate, this.f10379r);
        e5.b.n(allocate, this.f10380s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.f10381w) & 255));
        allocate.put(e5.b.b(this.f10381w));
        int l4 = e5.b.l(this.f10381w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f10382x, allocate);
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
