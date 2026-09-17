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
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f14783b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f14782a + ", sizeOfInstance=" + this.f14783b + ", data=" + this.d + '}';
    }
}
