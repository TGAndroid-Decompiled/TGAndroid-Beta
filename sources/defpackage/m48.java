package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
public final class m48 implements NativeLifecycleLock.NativeRunnable {
    public final byte a;
    public final PeerConnection b;
    public final SdpObserver c;
    public final MediaConstraints d;

    public m48(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = sdpObserver;
        this.d = mediaConstraints;
    }

    @Override
    public final void run() {
        byte b = this.a;
        MediaConstraints mediaConstraints = this.d;
        SdpObserver sdpObserver = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$createOffer$4(sdpObserver, mediaConstraints);
                return;
            default:
                peerConnection.lambda$createAnswer$5(sdpObserver, mediaConstraints);
                return;
        }
    }
}
