package h5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f12612n;
    public double f12613r;
    public double f12614s;
    public int v;
    public String f12615w;
    public int f12616x;
    public final long[] f12617y;

    public c(String str) {
        super(str);
        this.f12613r = 72.0d;
        this.f12614s = 72.0d;
        this.v = 1;
        this.f12615w = "";
        this.f12616x = 24;
        this.f12617y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        f5.b.p(this.f12609f, allocate);
        f5.b.p(0, allocate);
        f5.b.p(0, allocate);
        long[] jArr = this.f12617y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        f5.b.p(this.h, allocate);
        f5.b.p(this.f12612n, allocate);
        f5.b.n(allocate, this.f12613r);
        f5.b.n(allocate, this.f12614s);
        allocate.putInt((int) 0);
        f5.b.p(this.v, allocate);
        allocate.put((byte) (f5.b.l(this.f12615w) & 255));
        allocate.put(f5.b.b(this.f12615w));
        int l4 = f5.b.l(this.f12615w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        f5.b.p(this.f12616x, allocate);
        f5.b.p(65535, allocate);
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
