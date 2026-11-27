package defpackage;

import org.webrtc.AudioTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoTrack;
public final class r48 implements NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final long b;
    public final String c;

    public r48(long j, String str, byte b) {
        this.a = b;
        this.b = j;
        this.c = str;
    }

    @Override
    public final Object call(long j) {
        AudioTrack lambda$createAudioTrack$6;
        VideoTrack lambda$createVideoTrack$3;
        switch (this.a) {
            case 0:
                lambda$createAudioTrack$6 = PeerConnectionFactory.lambda$createAudioTrack$6(this.b, this.c, j);
                return lambda$createAudioTrack$6;
            default:
                lambda$createVideoTrack$3 = PeerConnectionFactory.lambda$createVideoTrack$3(this.b, this.c, j);
                return lambda$createVideoTrack$3;
        }
    }
}
