package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f9929n;
    public double f9930r;
    public double f9931s;
    public int v;
    public String f9932w;
    public int f9933x;
    public final long[] f9934y;

    public c(String str) {
        super(str);
        this.f9930r = 72.0d;
        this.f9931s = 72.0d;
        this.v = 1;
        this.f9932w = "";
        this.f9933x = 24;
        this.f9934y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f9926f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.f9934y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f9929n, allocate);
        e5.b.n(allocate, this.f9930r);
        e5.b.n(allocate, this.f9931s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.f9932w) & 255));
        allocate.put(e5.b.b(this.f9932w));
        int l4 = e5.b.l(this.f9932w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f9933x, allocate);
        e5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i10;
        long b10 = b();
        long j10 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return j10 + i10;
    }
}
