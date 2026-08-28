package k3;

import h3.r0;
import java.nio.ByteBuffer;
public class i extends a {
    public final d f14607a = new d();
    public ByteBuffer f14608b;
    public boolean f14609c;
    public long d;
    public ByteBuffer f14610e;
    public final int f14611f;
    public final int h;

    static {
        r0.a("goog.exo.decoder");
    }

    public i(int i9, int i10) {
        this.f14611f = i9;
        this.h = i10;
    }

    public final ByteBuffer a(int i9) {
        int capacity;
        int i10 = this.f14611f;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.f14608b;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i9 + ")");
    }

    public final void c(int i9) {
        int i10 = i9 + this.h;
        ByteBuffer byteBuffer = this.f14608b;
        if (byteBuffer == null) {
            this.f14608b = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f14608b = byteBuffer;
            return;
        }
        ByteBuffer a2 = a(i11);
        a2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a2.put(byteBuffer);
        }
        this.f14608b = a2;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f14608b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14610e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14609c = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.f14608b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14610e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
