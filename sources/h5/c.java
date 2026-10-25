package h5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f12613n;
    public double f12614r;
    public double f12615s;
    public int v;
    public String f12616w;
    public int f12617x;
    public final long[] f12618y;

    public c(String str) {
        super(str);
        this.f12614r = 72.0d;
        this.f12615s = 72.0d;
        this.v = 1;
        this.f12616w = "";
        this.f12617x = 24;
        this.f12618y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        f5.b.p(this.f12610f, allocate);
        f5.b.p(0, allocate);
        f5.b.p(0, allocate);
        long[] jArr = this.f12618y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        f5.b.p(this.h, allocate);
        f5.b.p(this.f12613n, allocate);
        f5.b.n(allocate, this.f12614r);
        f5.b.n(allocate, this.f12615s);
        allocate.putInt((int) 0);
        f5.b.p(this.v, allocate);
        allocate.put((byte) (f5.b.l(this.f12616w) & 255));
        allocate.put(f5.b.b(this.f12616w));
        int l4 = f5.b.l(this.f12616w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        f5.b.p(this.f12617x, allocate);
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
