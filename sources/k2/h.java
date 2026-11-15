package k2;

import e2.m0;
import e2.u;
import java.nio.ByteBuffer;
public class h extends a {
    public u f17730a;
    public final d f17731b = new d();
    public ByteBuffer f17732c;
    public boolean d;
    public long f17733e;
    public ByteBuffer f17734f;
    public final int h;
    public final int f17735n;

    static {
        m0.a("media3.decoder");
    }

    public h(int i7, int i10) {
        this.h = i7;
        this.f17735n = i10;
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
        ByteBuffer byteBuffer = this.f17732c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i7 + ")");
    }

    public final void b(int i7) {
        int i10 = i7 + this.f17735n;
        ByteBuffer byteBuffer = this.f17732c;
        if (byteBuffer == null) {
            this.f17732c = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f17732c = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.f17732c = a10;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f17732c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f17734f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f17732c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f17734f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }
}
