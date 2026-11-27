package defpackage;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
public final class sgc implements NativeLifecycleLock.NativePointerRunnable {
    public final byte a;
    public final VideoTrack b;
    public final VideoSink c;

    public sgc(VideoTrack videoTrack, VideoSink videoSink, byte b) {
        this.a = b;
        this.b = videoTrack;
        this.c = videoSink;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        VideoSink videoSink = this.c;
        VideoTrack videoTrack = this.b;
        switch (b) {
            case 0:
                VideoTrack.f(videoTrack, videoSink, j);
                return;
            default:
                VideoTrack.g(videoTrack, videoSink, j);
                return;
        }
    }
}
