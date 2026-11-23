package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f17261n;
    public double f17262r;
    public double f17263s;
    public int f17264w;
    public String f17265x;
    public int f17266y;

    public c(String str) {
        super(str);
        this.f17262r = 72.0d;
        this.f17263s = 72.0d;
        this.f17264w = 1;
        this.f17265x = "";
        this.f17266y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f17258f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f17261n, allocate);
        h5.b.n(allocate, this.f17262r);
        h5.b.n(allocate, this.f17263s);
        allocate.putInt((int) 0);
        h5.b.p(this.f17264w, allocate);
        allocate.put((byte) (h5.b.l(this.f17265x) & 255));
        allocate.put(h5.b.b(this.f17265x));
        int l10 = h5.b.l(this.f17265x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f17266y, allocate);
        h5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i7;
        long b10 = b();
        long j3 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i7 = 16;
        } else {
            i7 = 8;
        }
        return j3 + i7;
    }
}
