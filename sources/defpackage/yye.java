package defpackage;

import java.nio.ByteBuffer;
public abstract class yye {
    public final uf7 a(wf7 wf7Var) {
        boolean z;
        ByteBuffer byteBuffer = wf7Var.c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        return b(wf7Var, byteBuffer);
    }

    public abstract uf7 b(wf7 wf7Var, ByteBuffer byteBuffer);
}
