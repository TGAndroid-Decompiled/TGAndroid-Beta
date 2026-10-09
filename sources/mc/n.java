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
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f16306b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f16305a + ", sizeOfInstance=" + this.f16306b + ", data=" + this.d + '}';
    }
}
