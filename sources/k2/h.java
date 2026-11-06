package k2;

import e2.m0;
import e2.u;
import java.nio.ByteBuffer;
public class h extends a {
    public u f17170a;
    public final d f17171b = new d();
    public ByteBuffer f17172c;
    public boolean d;
    public long f17173e;
    public ByteBuffer f17174f;
    public final int h;
    public final int f17175n;

    static {
        m0.a("media3.decoder");
    }

    public h(int i7, int i10) {
        this.h = i7;
        this.f17175n = i10;
    }

    public final ByteBuffer a(int i7) {
        int capacity;
        int i10 = this.h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f17172c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i7 + ")");
    }

    public final void b(int i7) {
        int i10 = i7 + this.f17175n;
        ByteBuffer byteBuffer = this.f17172c;
        if (byteBuffer == null) {
            this.f17172c = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f17172c = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.f17172c = a10;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f17172c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f17174f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f17172c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f17174f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }
}
