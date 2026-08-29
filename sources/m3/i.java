package m3;

import j3.r0;
import java.nio.ByteBuffer;
public class i extends a {
    public final d f16827a = new d();
    public ByteBuffer f16828b;
    public boolean f16829c;
    public long d;
    public ByteBuffer f16830e;
    public final int f16831f;
    public final int h;

    static {
        r0.a("goog.exo.decoder");
    }

    public i(int i10, int i11) {
        this.f16831f = i10;
        this.h = i11;
    }

    public final ByteBuffer a(int i10) {
        int capacity;
        int i11 = this.f16831f;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f16828b;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void b(int i10) {
        int i11 = i10 + this.h;
        ByteBuffer byteBuffer = this.f16828b;
        if (byteBuffer == null) {
            this.f16828b = a(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f16828b = byteBuffer;
            return;
        }
        ByteBuffer a2 = a(i12);
        a2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a2.put(byteBuffer);
        }
        this.f16828b = a2;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f16828b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f16830e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f16828b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f16830e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f16829c = false;
    }
}
