package c8;

import java.nio.ByteBuffer;
public abstract class ca {
    public e2.q0 a(o3.a aVar) {
        boolean z9;
        ByteBuffer byteBuffer = aVar.f17175c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        a8.ia.f(z9);
        return b(aVar, byteBuffer);
    }

    public abstract e2.q0 b(o3.a aVar, ByteBuffer byteBuffer);
}
