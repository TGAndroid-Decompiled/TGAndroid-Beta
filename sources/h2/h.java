package h2;

import b2.l0;
import b2.s;
import java.nio.ByteBuffer;
public class h extends a {
    public s f10978a;
    public final d f10979b = new d();
    public ByteBuffer f10980c;
    public boolean d;
    public long f10981e;
    public ByteBuffer f10982f;
    public final int h;
    public final int f10983n;

    static {
        l0.a("media3.decoder");
    }

    public h(int i10, int i11) {
        this.h = i10;
        this.f10983n = i11;
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
        ByteBuffer byteBuffer = this.f10980c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void b(int i10) {
        int i11 = i10 + this.f10983n;
        ByteBuffer byteBuffer = this.f10980c;
        if (byteBuffer == null) {
            this.f10980c = a(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f10980c = byteBuffer;
            return;
        }
        ByteBuffer a2 = a(i12);
        a2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a2.put(byteBuffer);
        }
        this.f10980c = a2;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f10980c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10982f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.f10980c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10982f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
