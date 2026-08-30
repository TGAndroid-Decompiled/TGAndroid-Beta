package j7;

import java.nio.ByteBuffer;
public abstract class c7 {
    public e4.c a(e4.e eVar) {
        boolean z4;
        ByteBuffer byteBuffer = eVar.d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        if (eVar.e(Integer.MIN_VALUE)) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract e4.c b(e4.e eVar, ByteBuffer byteBuffer);
}
