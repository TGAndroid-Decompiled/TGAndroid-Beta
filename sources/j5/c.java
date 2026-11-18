package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f17233n;
    public double f17234r;
    public double f17235s;
    public int f17236w;
    public String f17237x;
    public int f17238y;

    public c(String str) {
        super(str);
        this.f17234r = 72.0d;
        this.f17235s = 72.0d;
        this.f17236w = 1;
        this.f17237x = "";
        this.f17238y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f17230f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f17233n, allocate);
        h5.b.n(allocate, this.f17234r);
        h5.b.n(allocate, this.f17235s);
        allocate.putInt((int) 0);
        h5.b.p(this.f17236w, allocate);
        allocate.put((byte) (h5.b.l(this.f17237x) & 255));
        allocate.put(h5.b.b(this.f17237x));
        int l10 = h5.b.l(this.f17237x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f17238y, allocate);
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
