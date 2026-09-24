package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17824a;
    public final VideoPlayerRewinder f17825b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17824a = i10;
        this.f17825b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17824a) {
            case 0:
                VideoPlayerRewinder.b(this.f17825b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17825b);
                return;
        }
    }
}
