package defpackage;

import java.util.List;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
public final class ur9 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativePointerCallable {
    public final List a;

    public ur9(List list) {
        this.a = list;
    }

    @Override
    public final Object call(long j) {
        return RtpTransceiver.d(j, this.a);
    }

    @Override
    public final void run(long j) {
        RtpSender.c(j, this.a);
    }
}
