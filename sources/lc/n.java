package lc;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f19760b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f19759a + ", sizeOfInstance=" + this.f19760b + ", data=" + this.d + '}';
    }
}
