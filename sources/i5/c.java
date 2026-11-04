package i5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f14612n;
    public double f14613r;
    public double f14614s;
    public int f14615w;
    public String f14616x;
    public int f14617y;

    public c(String str) {
        super(str);
        this.f14613r = 72.0d;
        this.f14614s = 72.0d;
        this.f14615w = 1;
        this.f14616x = "";
        this.f14617y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        g5.b.p(this.f14609f, allocate);
        g5.b.p(0, allocate);
        g5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        g5.b.p(this.h, allocate);
        g5.b.p(this.f14612n, allocate);
        g5.b.n(allocate, this.f14613r);
        g5.b.n(allocate, this.f14614s);
        allocate.putInt((int) 0);
        g5.b.p(this.f14615w, allocate);
        allocate.put((byte) (g5.b.l(this.f14616x) & 255));
        allocate.put(g5.b.b(this.f14616x));
        int l10 = g5.b.l(this.f14616x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        g5.b.p(this.f14617y, allocate);
        g5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i3;
        long b10 = b();
        long j10 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i3 = 16;
        } else {
            i3 = 8;
        }
        return j10 + i3;
    }
}
