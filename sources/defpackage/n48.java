package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
public final class n48 implements NativeLifecycleLock.NativeRunnable {
    public final byte a;
    public final PeerConnection b;
    public final SdpObserver c;
    public final SessionDescription d;

    public n48(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = sdpObserver;
        this.d = sessionDescription;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SessionDescription sessionDescription = this.d;
        SdpObserver sdpObserver = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$setLocalDescription$7(sdpObserver, sessionDescription);
                return;
            default:
                peerConnection.lambda$setRemoteDescription$8(sdpObserver, sessionDescription);
                return;
        }
    }
}
