package h7;

import java.nio.ByteBuffer;
public abstract class h5 {
    public b4.c a(b4.e eVar) {
        boolean z10;
        ByteBuffer byteBuffer = eVar.f16828b;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract b4.c b(b4.e eVar, ByteBuffer byteBuffer);
}
