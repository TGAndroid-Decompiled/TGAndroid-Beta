package defpackage;

import java.nio.ByteBuffer;
public class la3 extends v11 {
    public go4 a;
    public final z43 b = new z43();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final byte h;
    public final int n;

    static {
        ct6.a("media3.decoder");
    }

    public la3(int i, int i2) {
        this.h = i;
        this.n = i2;
    }

    public final ByteBuffer a(int i) {
        int capacity;
        byte b = this.h;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    public final void c(int i) {
        int i2 = i + this.n;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = a(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer a = a(i3);
        a.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a.put(byteBuffer);
        }
        this.c = a;
    }

    @Override
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
