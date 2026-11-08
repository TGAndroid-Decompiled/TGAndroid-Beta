package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] D;
    public int h;
    public int f16500n;
    public double f16501r;
    public double f16502s;
    public int f16503w;
    public String f16504x;
    public int f16505y;

    public c(String str) {
        super(str);
        this.f16501r = 72.0d;
        this.f16502s = 72.0d;
        this.f16503w = 1;
        this.f16504x = "";
        this.f16505y = 24;
        this.D = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f16497f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.D;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f16500n, allocate);
        h5.b.n(allocate, this.f16501r);
        h5.b.n(allocate, this.f16502s);
        allocate.putInt((int) 0);
        h5.b.p(this.f16503w, allocate);
        allocate.put((byte) (h5.b.l(this.f16504x) & 255));
        allocate.put(h5.b.b(this.f16504x));
        int l10 = h5.b.l(this.f16504x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f16505y, allocate);
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
