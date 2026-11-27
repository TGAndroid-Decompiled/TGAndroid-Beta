package defpackage;

import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
public final class m07 implements NativeLifecycleLock.NativePointerCallable {
    public final byte a;
    public final MediaStream b;
    public final AudioTrack c;

    public m07(MediaStream mediaStream, AudioTrack audioTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = audioTrack;
    }

    @Override
    public final Object call(long j) {
        byte b = this.a;
        AudioTrack audioTrack = this.c;
        MediaStream mediaStream = this.b;
        switch (b) {
            case 0:
                return MediaStream.d(mediaStream, audioTrack, j);
            default:
                return MediaStream.g(mediaStream, audioTrack, j);
        }
    }
}
