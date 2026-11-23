package k2;

import e2.m0;
import e2.u;
import java.nio.ByteBuffer;
public class h extends a {
    public u f18156a;
    public final d f18157b = new d();
    public ByteBuffer f18158c;
    public boolean d;
    public long f18159e;
    public ByteBuffer f18160f;
    public final int h;
    public final int f18161n;

    static {
        m0.a("media3.decoder");
    }

    public h(int i7, int i10) {
        this.h = i7;
        this.f18161n = i10;
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
        ByteBuffer byteBuffer = this.f18158c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i7 + ")");
    }

    public final void b(int i7) {
        int i10 = i7 + this.f18161n;
        ByteBuffer byteBuffer = this.f18158c;
        if (byteBuffer == null) {
            this.f18158c = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f18158c = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.f18158c = a10;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f18158c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18160f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f18158c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18160f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }
}
