package h2;

import b2.p0;
import b2.w;
import java.nio.ByteBuffer;
public class h extends a {
    public w f11633a;
    public final d f11634b = new d();
    public ByteBuffer f11635c;
    public boolean d;
    public long e;
    public ByteBuffer f11636f;
    public final int h;
    public final int f11637n;

    static {
        p0.a("media3.decoder");
    }

    public h(int i10, int i11) {
        this.h = i10;
        this.f11637n = i11;
    }

    public final ByteBuffer a(int i10) {
        int capacity;
        int i11 = this.h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f11635c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void b(int i10) {
        int i11 = i10 + this.f11637n;
        ByteBuffer byteBuffer = this.f11635c;
        if (byteBuffer == null) {
            this.f11635c = a(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f11635c = byteBuffer;
            return;
        }
        ByteBuffer a2 = a(i12);
        a2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a2.put(byteBuffer);
        }
        this.f11635c = a2;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f11635c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11636f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f11635c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11636f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
