package defpackage;

import java.nio.ByteBuffer;
public final class zg0 extends z83 {
    public long r;
    public int s;
    public byte w;

    @Override
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(z83 z83Var) {
        ByteBuffer byteBuffer;
        gre.f(!z83Var.getFlag(1073741824));
        gre.f(!z83Var.hasSupplementalData());
        gre.f(!z83Var.isEndOfStream());
        if (f()) {
            if (this.s < this.w) {
                ByteBuffer byteBuffer2 = z83Var.c;
                if (byteBuffer2 != null && (byteBuffer = this.c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.s;
        this.s = i + 1;
        if (i == 0) {
            this.e = z83Var.e;
            if (z83Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = z83Var.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = z83Var.e;
        return true;
    }

    public final boolean f() {
        if (this.s > 0) {
            return true;
        }
        return false;
    }
}
