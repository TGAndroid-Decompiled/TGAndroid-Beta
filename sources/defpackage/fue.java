package defpackage;

import java.nio.ByteBuffer;
public abstract class fue {
    public final ld7 a(nd7 nd7Var) {
        boolean z;
        ByteBuffer byteBuffer = nd7Var.c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        return b(nd7Var, byteBuffer);
    }

    public abstract ld7 b(nd7 nd7Var, ByteBuffer byteBuffer);
}
