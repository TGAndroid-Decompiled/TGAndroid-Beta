package fc;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f6993b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f6992a + ", sizeOfInstance=" + this.f6993b + ", data=" + this.d + '}';
    }
}
