package n3;

import j3.l0;
import java.nio.ByteBuffer;
public class i extends a {
    public final d f14226c = new d();
    public ByteBuffer d;
    public boolean e;
    public long f14227f;
    public ByteBuffer h;
    public final int f14228n;
    public final int f14229r;

    static {
        l0.a("goog.exo.decoder");
    }

    public i(int i10, int i11) {
        this.f14228n = i10;
        this.f14229r = i11;
    }

    @Override
    public void b() {
        this.f14207b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer j(int i10) {
        int capacity;
        int i11 = this.f14228n;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void k(int i10) {
        int i11 = i10 + this.f14229r;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer j10 = j(i12);
        j10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j10.put(byteBuffer);
        }
        this.d = j10;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
