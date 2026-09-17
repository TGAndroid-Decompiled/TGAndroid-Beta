package h2;

import b2.l0;
import b2.s;
import dd.k;
import java.nio.ByteBuffer;
public class g extends k {
    public s f10846c;
    public final c d = new c();
    public ByteBuffer f10847e;
    public boolean f10848f;
    public long h;
    public ByteBuffer f10849n;
    public final int f10850r;
    public final int f10851s;

    static {
        l0.a("media3.decoder");
    }

    public g(int i10, int i11) {
        this.f10850r = i10;
        this.f10851s = i11;
    }

    public void i() {
        this.f6773b = 0;
        ByteBuffer byteBuffer = this.f10847e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10849n;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10848f = false;
    }

    public final ByteBuffer j(int i10) {
        int capacity;
        int i11 = this.f10850r;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f10847e;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void l(int i10) {
        int i11 = i10 + this.f10851s;
        ByteBuffer byteBuffer = this.f10847e;
        if (byteBuffer == null) {
            this.f10847e = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f10847e = byteBuffer;
            return;
        }
        ByteBuffer j3 = j(i12);
        j3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j3.put(byteBuffer);
        }
        this.f10847e = j3;
    }

    public final void m() {
        ByteBuffer byteBuffer = this.f10847e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10849n;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
