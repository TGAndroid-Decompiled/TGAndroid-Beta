package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f17324n;
    public double f17325r;
    public double f17326s;
    public int f17327w;
    public String f17328x;
    public int f17329y;

    public c(String str) {
        super(str);
        this.f17325r = 72.0d;
        this.f17326s = 72.0d;
        this.f17327w = 1;
        this.f17328x = "";
        this.f17329y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f17321f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f17324n, allocate);
        h5.b.n(allocate, this.f17325r);
        h5.b.n(allocate, this.f17326s);
        allocate.putInt((int) 0);
        h5.b.p(this.f17327w, allocate);
        allocate.put((byte) (h5.b.l(this.f17328x) & 255));
        allocate.put(h5.b.b(this.f17328x));
        int l10 = h5.b.l(this.f17328x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f17329y, allocate);
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
