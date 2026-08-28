package g7;

import java.nio.ByteBuffer;
public abstract class y8 {
    public z3.c a(z3.e eVar) {
        boolean z10;
        ByteBuffer byteBuffer = eVar.f14608b;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract z3.c b(z3.e eVar, ByteBuffer byteBuffer);
}
