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
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f15014b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f15013a + ", sizeOfInstance=" + this.f15014b + ", data=" + this.d + '}';
    }
}
