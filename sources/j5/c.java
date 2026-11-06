package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] D;
    public int h;
    public int f16497n;
    public double f16498r;
    public double f16499s;
    public int f16500w;
    public String f16501x;
    public int f16502y;

    public c(String str) {
        super(str);
        this.f16498r = 72.0d;
        this.f16499s = 72.0d;
        this.f16500w = 1;
        this.f16501x = "";
        this.f16502y = 24;
        this.D = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f16494f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.D;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f16497n, allocate);
        h5.b.n(allocate, this.f16498r);
        h5.b.n(allocate, this.f16499s);
        allocate.putInt((int) 0);
        h5.b.p(this.f16500w, allocate);
        allocate.put((byte) (h5.b.l(this.f16501x) & 255));
        allocate.put(h5.b.b(this.f16501x));
        int l10 = h5.b.l(this.f16501x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f16502y, allocate);
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
