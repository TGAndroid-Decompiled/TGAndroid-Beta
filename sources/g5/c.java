package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f9409n;
    public double f9410r;
    public double f9411s;
    public int v;
    public String f9412w;
    public int f9413x;
    public final long[] f9414y;

    public c(String str) {
        super(str);
        this.f9410r = 72.0d;
        this.f9411s = 72.0d;
        this.v = 1;
        this.f9412w = "";
        this.f9413x = 24;
        this.f9414y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f9406f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.f9414y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f9409n, allocate);
        e5.b.n(allocate, this.f9410r);
        e5.b.n(allocate, this.f9411s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.f9412w) & 255));
        allocate.put(e5.b.b(this.f9412w));
        int l4 = e5.b.l(this.f9412w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f9413x, allocate);
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
