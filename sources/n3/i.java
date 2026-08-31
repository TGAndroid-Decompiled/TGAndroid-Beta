package n3;

import j3.l0;
import java.nio.ByteBuffer;
public class i extends a {
    public final d f15214c = new d();
    public ByteBuffer d;
    public boolean f15215e;
    public long f15216f;
    public ByteBuffer h;
    public final int f15217n;
    public final int f15218r;

    static {
        l0.a("goog.exo.decoder");
    }

    public i(int i10, int i11) {
        this.f15217n = i10;
        this.f15218r = i11;
    }

    @Override
    public void b() {
        this.f15193b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15215e = false;
    }

    public final ByteBuffer i(int i10) {
        int capacity;
        int i11 = this.f15217n;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void j(int i10) {
        int i11 = i10 + this.f15218r;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = i(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer i13 = i(i12);
        i13.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i13.put(byteBuffer);
        }
        this.d = i13;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
