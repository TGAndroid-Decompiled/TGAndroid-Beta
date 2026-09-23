package mc;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f14748b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f14747a + ", sizeOfInstance=" + this.f14748b + ", data=" + this.d + '}';
    }
}
