package defpackage;

import java.nio.ByteBuffer;
public abstract class iwe {
    public final nf7 a(pf7 pf7Var) {
        boolean z;
        ByteBuffer byteBuffer = pf7Var.c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        return b(pf7Var, byteBuffer);
    }

    public abstract nf7 b(pf7 pf7Var, ByteBuffer byteBuffer);
}
