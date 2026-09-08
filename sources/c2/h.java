package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public interface h {
    public static final ByteBuffer f4183a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    f d(f fVar);

    void e();

    void flush();

    boolean isActive();

    void reset();
}
