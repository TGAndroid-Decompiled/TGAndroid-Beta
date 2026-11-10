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
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f18235b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f18234a + ", sizeOfInstance=" + this.f18235b + ", data=" + this.d + '}';
    }
}
