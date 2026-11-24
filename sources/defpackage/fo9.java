package defpackage;

import java.nio.ByteBuffer;
public final class fo9 extends rf0 {
    public int d;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = hle.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fo9.class == obj.getClass() && this.d == ((fo9) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
