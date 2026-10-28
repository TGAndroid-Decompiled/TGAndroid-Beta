package a8;

import java.nio.ByteBuffer;
public abstract class wd {
    public b2.u0 a(l3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f12569c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        return b(aVar, byteBuffer);
    }

    public abstract b2.u0 b(l3.a aVar, ByteBuffer byteBuffer);
}
