package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f16851n;
    public double f16852r;
    public double f16853s;
    public int f16854w;
    public String f16855x;
    public int f16856y;

    public c(String str) {
        super(str);
        this.f16852r = 72.0d;
        this.f16853s = 72.0d;
        this.f16854w = 1;
        this.f16855x = "";
        this.f16856y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f16848f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f16851n, allocate);
        h5.b.n(allocate, this.f16852r);
        h5.b.n(allocate, this.f16853s);
        allocate.putInt((int) 0);
        h5.b.p(this.f16854w, allocate);
        allocate.put((byte) (h5.b.l(this.f16855x) & 255));
        allocate.put(h5.b.b(this.f16855x));
        int l10 = h5.b.l(this.f16855x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f16856y, allocate);
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
