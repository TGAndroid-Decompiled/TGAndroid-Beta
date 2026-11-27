package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpReceiver;
public final class tr9 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativeDisposer {
    public final RtpReceiver a;

    public tr9(RtpReceiver rtpReceiver) {
        this.a = rtpReceiver;
    }

    @Override
    public final void dispose(long j) {
        RtpReceiver.f(this.a, j);
    }

    @Override
    public final void run(long j) {
        RtpReceiver.e(this.a, j);
    }
}
