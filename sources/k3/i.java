package k3;

import h3.r0;
import java.nio.ByteBuffer;

public class i extends a {

    public final d f14428a = new d();

    public ByteBuffer f14429b;

    public boolean f14430c;
    public long d;

    public ByteBuffer f14431e;

    public final int f14432f;
    public final int h;

    static {
        r0.a("goog.exo.decoder");
    }

    public i(int i10, int i11) {
        this.f14432f = i10;
        this.h = i11;
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f14432f;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f14429b;
        throw new h("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void b(int i10) {
        int i11 = i10 + this.h;
        ByteBuffer byteBuffer = this.f14429b;
        if (byteBuffer == null) {
            this.f14429b = a(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f14429b = byteBuffer;
            return;
        }
        ByteBuffer byteBufferA = a(i12);
        byteBufferA.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferA.put(byteBuffer);
        }
        this.f14429b = byteBufferA;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f14429b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14431e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14430c = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.f14429b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14431e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
