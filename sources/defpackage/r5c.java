package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
public final class r5c extends rf0 {
    public ByteBuffer d;

    static {
        Logger.getLogger(r5c.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.a + ", sizeOfInstance=" + this.b + ", data=" + this.d + '}';
    }
}
