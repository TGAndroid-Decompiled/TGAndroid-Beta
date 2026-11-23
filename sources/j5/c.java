package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] E;
    public int h;
    public int f17227n;
    public double f17228r;
    public double f17229s;
    public int f17230w;
    public String f17231x;
    public int f17232y;

    public c(String str) {
        super(str);
        this.f17228r = 72.0d;
        this.f17229s = 72.0d;
        this.f17230w = 1;
        this.f17231x = "";
        this.f17232y = 24;
        this.E = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f17224f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.f17227n, allocate);
        h5.b.n(allocate, this.f17228r);
        h5.b.n(allocate, this.f17229s);
        allocate.putInt((int) 0);
        h5.b.p(this.f17230w, allocate);
        allocate.put((byte) (h5.b.l(this.f17231x) & 255));
        allocate.put(h5.b.b(this.f17231x));
        int l10 = h5.b.l(this.f17231x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.f17232y, allocate);
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
