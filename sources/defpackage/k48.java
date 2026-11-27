package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
public final class k48 implements NativeLifecycleLock.NativeRunnable {
    public final byte a;
    public final PeerConnection b;
    public final boolean c;

    public k48(PeerConnection peerConnection, boolean z, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$setAudioRecording$11(z);
                return;
            default:
                peerConnection.lambda$setAudioPlayout$10(z);
                return;
        }
    }
}
