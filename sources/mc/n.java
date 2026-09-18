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
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f14955b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f14954a + ", sizeOfInstance=" + this.f14955b + ", data=" + this.d + '}';
    }
}
