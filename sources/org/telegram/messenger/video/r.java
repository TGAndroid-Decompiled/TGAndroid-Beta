package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17833a;
    public final VideoPlayerRewinder f17834b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17833a = i10;
        this.f17834b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                VideoPlayerRewinder.b(this.f17834b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17834b);
                return;
        }
    }
}
