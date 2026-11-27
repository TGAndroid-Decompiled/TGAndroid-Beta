package defpackage;

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
public final class j48 implements NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeCallable {
    public final byte a;
    public final PeerConnection b;
    public final MediaStream c;

    public j48(PeerConnection peerConnection, MediaStream mediaStream, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = mediaStream;
    }

    @Override
    public final Object call() {
        Boolean lambda$addStream$17;
        lambda$addStream$17 = this.b.lambda$addStream$17(this.c);
        return lambda$addStream$17;
    }

    @Override
    public final void run() {
        byte b = this.a;
        MediaStream mediaStream = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$removeStream$19(mediaStream);
                return;
            default:
                peerConnection.lambda$dispose$47(mediaStream);
                return;
        }
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$addStream$16;
        lambda$addStream$16 = this.b.lambda$addStream$16(this.c, j);
        return lambda$addStream$16;
    }
}
