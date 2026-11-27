package defpackage;

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;
public final class k07 implements NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final MediaStream b;
    public final VideoTrack c;

    public k07(MediaStream mediaStream, VideoTrack videoTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = videoTrack;
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$removeTrack$9;
        Boolean lambda$addPreservedTrack$5;
        Boolean lambda$addTrack$3;
        byte b = this.a;
        VideoTrack videoTrack = this.c;
        MediaStream mediaStream = this.b;
        switch (b) {
            case 0:
                lambda$removeTrack$9 = mediaStream.lambda$removeTrack$9(videoTrack, j);
                return lambda$removeTrack$9;
            case 1:
                lambda$addPreservedTrack$5 = mediaStream.lambda$addPreservedTrack$5(videoTrack, j);
                return lambda$addPreservedTrack$5;
            default:
                lambda$addTrack$3 = mediaStream.lambda$addTrack$3(videoTrack, j);
                return lambda$addTrack$3;
        }
    }
}
