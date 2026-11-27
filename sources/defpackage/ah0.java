package defpackage;

import java.nio.ByteBuffer;
public final class ah0 extends s93 {
    public long r;
    public int s;
    public byte w;

    @Override
    public final void clear() {
        super.clear();
        this.s = 0;
    }

    public final boolean e(s93 s93Var) {
        ByteBuffer byteBuffer;
        yve.f(!s93Var.getFlag(1073741824));
        yve.f(!s93Var.hasSupplementalData());
        yve.f(!s93Var.isEndOfStream());
        if (f()) {
            if (this.s < this.w) {
                ByteBuffer byteBuffer2 = s93Var.c;
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
            this.e = s93Var.e;
            if (s93Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = s93Var.c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.r = s93Var.e;
        return true;
    }

    public final boolean f() {
        if (this.s > 0) {
            return true;
        }
        return false;
    }
}
