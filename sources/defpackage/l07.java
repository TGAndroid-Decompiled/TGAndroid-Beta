package defpackage;

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;
public final class l07 implements NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final MediaStream b;
    public final long c;
    public final VideoTrack d;

    public l07(MediaStream mediaStream, long j, VideoTrack videoTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = j;
        this.d = videoTrack;
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$addTrack$2;
        Boolean lambda$addPreservedTrack$4;
        switch (this.a) {
            case 0:
                lambda$addTrack$2 = this.b.lambda$addTrack$2(this.c, this.d, j);
                return lambda$addTrack$2;
            default:
                lambda$addPreservedTrack$4 = this.b.lambda$addPreservedTrack$4(this.c, this.d, j);
                return lambda$addPreservedTrack$4;
        }
    }
}
