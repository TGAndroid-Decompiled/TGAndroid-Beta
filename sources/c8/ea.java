package c8;

import java.nio.ByteBuffer;
public abstract class ea {
    public e2.q0 a(o3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f18223c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8.ma.f(z10);
        return b(aVar, byteBuffer);
    }

    public abstract e2.q0 b(o3.a aVar, ByteBuffer byteBuffer);
}
