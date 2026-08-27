package h7;

import java.nio.ByteBuffer;

public abstract class p8 {
    public z3.c a(z3.e eVar) {
        ByteBuffer byteBuffer = eVar.f14429b;
        byteBuffer.getClass();
        d5.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract z3.c b(z3.e eVar, ByteBuffer byteBuffer);
}
