package h2;

import b2.q0;
import b2.x;
import java.nio.ByteBuffer;
public class h extends a {
    public x f7585a;
    public final d f7586b = new d();
    public ByteBuffer f7587c;
    public boolean d;
    public long e;
    public ByteBuffer f7588f;
    public final int h;
    public final int f7589n;

    static {
        q0.a("media3.decoder");
    }

    public h(int i10, int i11) {
        this.h = i10;
        this.f7589n = i11;
    }

    public final ByteBuffer b(int i10) {
        int capacity;
        int i11 = this.h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f7587c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void c(int i10) {
        int i11 = i10 + this.f7589n;
        ByteBuffer byteBuffer = this.f7587c;
        if (byteBuffer == null) {
            this.f7587c = b(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f7587c = byteBuffer;
            return;
        }
        ByteBuffer b10 = b(i12);
        b10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            b10.put(byteBuffer);
        }
        this.f7587c = b10;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f7587c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f7588f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.f7587c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f7588f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
