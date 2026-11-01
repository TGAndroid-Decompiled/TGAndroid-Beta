package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public final long[] D;
    public int h;
    public int f7360n;
    public double f7361r;
    public double f7362s;
    public int f7363w;
    public String f7364x;
    public int f7365y;

    public c(String str) {
        super(str);
        this.f7361r = 72.0d;
        this.f7362s = 72.0d;
        this.f7363w = 1;
        this.f7364x = "";
        this.f7365y = 24;
        this.D = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f7357f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.D;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.f7360n, allocate);
        e5.b.n(allocate, this.f7361r);
        e5.b.n(allocate, this.f7362s);
        allocate.putInt((int) 0);
        e5.b.p(this.f7363w, allocate);
        allocate.put((byte) (e5.b.l(this.f7364x) & 255));
        allocate.put(e5.b.b(this.f7364x));
        int l4 = e5.b.l(this.f7364x);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.f7365y, allocate);
        e5.b.p(65535, allocate);
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
