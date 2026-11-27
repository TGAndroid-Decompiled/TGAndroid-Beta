package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
public final class q48 implements NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final MediaStreamTrack.MediaType b;

    public q48(MediaStreamTrack.MediaType mediaType, byte b) {
        this.a = b;
        this.b = mediaType;
    }

    @Override
    public final Object call(long j) {
        byte b = this.a;
        MediaStreamTrack.MediaType mediaType = this.b;
        switch (b) {
            case 0:
                return PeerConnectionFactory.f(mediaType, j);
            default:
                return PeerConnectionFactory.b(mediaType, j);
        }
    }
}
