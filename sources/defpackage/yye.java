package defpackage;

import java.nio.ByteBuffer;
public abstract class yye {
    public final vf7 a(xf7 xf7Var) {
        boolean z;
        ByteBuffer byteBuffer = xf7Var.c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        return b(xf7Var, byteBuffer);
    }

    public abstract vf7 b(xf7 xf7Var, ByteBuffer byteBuffer);
}
