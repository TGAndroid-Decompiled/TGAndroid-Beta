package j2;

import d2.o0;
import d2.v;
import java.nio.ByteBuffer;
public class h extends a {
    public v f16155a;
    public final d f16156b = new d();
    public ByteBuffer f16157c;
    public boolean d;
    public long f16158e;
    public ByteBuffer f16159f;
    public final int h;
    public final int f16160n;

    static {
        o0.a("media3.decoder");
    }

    public h(int i3, int i10) {
        this.h = i3;
        this.f16160n = i10;
    }

    public final ByteBuffer a(int i3) {
        int capacity;
        int i10 = this.h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i3);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i3);
        }
        ByteBuffer byteBuffer = this.f16157c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i3 + ")");
    }

    public final void b(int i3) {
        int i10 = i3 + this.f16160n;
        ByteBuffer byteBuffer = this.f16157c;
        if (byteBuffer == null) {
            this.f16157c = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f16157c = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.f16157c = a10;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f16157c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f16159f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f16157c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f16159f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }
}
