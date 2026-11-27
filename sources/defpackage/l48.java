package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;
public final class l48 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativeRunnable {
    public final byte a;
    public final PeerConnection b;
    public final RTCStatsCollectorCallback c;

    public l48(PeerConnection peerConnection, RTCStatsCollectorCallback rTCStatsCollectorCallback, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = rTCStatsCollectorCallback;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        RTCStatsCollectorCallback rTCStatsCollectorCallback = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$getStats$36(rTCStatsCollectorCallback, j);
                return;
            default:
                peerConnection.lambda$getStats$34(rTCStatsCollectorCallback, j);
                return;
        }
    }

    @Override
    public final void run() {
        this.b.lambda$getStats$33(this.c);
    }
}
