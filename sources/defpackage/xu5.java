package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.YuvConverter;
public final class xu5 implements Runnable {
    public final byte a;
    public final ByteBuffer b;

    public xu5(ByteBuffer byteBuffer, byte b) {
        this.a = b;
        this.b = byteBuffer;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (b) {
            case 0:
                JavaI420Buffer.a(byteBuffer);
                return;
            default:
                YuvConverter.a(byteBuffer);
                return;
        }
    }
}
