package b8;

import java.nio.ByteBuffer;
public abstract class te {
    public d2.s0 a(n3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f16157c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        return b(aVar, byteBuffer);
    }

    public abstract d2.s0 b(n3.a aVar, ByteBuffer byteBuffer);
}
